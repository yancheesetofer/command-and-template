package id.ac.ui.cs.advprog.tutorial2.cinemaadmin.repository;

import id.ac.ui.cs.advprog.tutorial2.cinemaadmin.core.command.Command;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CinemaPanel {
    final private Map<String,Command> commands = new HashMap<>();
    private List<String> commandHistory = new ArrayList<>();

    public void execute(String commandName) {
        Command command = commands.get(commandName);
        if (command != null) {
            String result = command.execute();
            commandHistory.add(result);
            System.out.println(result);
        }
    }

    public void addCommand(Command command) {
        commands.put(command.getCommandName(), command);
    }

    public void clearCommand() {
        commands.clear();
    }

    public List<String> getCommandHistory() {
        return commandHistory;
    }
}

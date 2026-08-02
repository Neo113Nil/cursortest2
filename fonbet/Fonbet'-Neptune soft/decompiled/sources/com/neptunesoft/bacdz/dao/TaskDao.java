package com.neptunesoft.bacdz.dao;

import com.neptunesoft.bacdz.entities.Task;
import java.util.List;

/* loaded from: classes4.dex */
public interface TaskDao {
    void deleteTask(Task task);

    List<Task> getAllTasks();

    List<Task> getAllTasksReminder();

    Task getLastTast();

    void insertTask(Task task);
}

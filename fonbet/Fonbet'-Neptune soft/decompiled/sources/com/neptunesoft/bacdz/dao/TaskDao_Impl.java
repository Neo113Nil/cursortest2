package com.neptunesoft.bacdz.dao;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.neptunesoft.bacdz.entities.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class TaskDao_Impl implements TaskDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<Task> __insertAdapterOfTask = new EntityInsertAdapter<Task>() { // from class: com.neptunesoft.bacdz.dao.TaskDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `Tasks` (`id_task`,`task`,`date_time_created`,`date_time_reminder`,`checked`,`reminded`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.EntityInsertAdapter
        public void bind(SQLiteStatement sQLiteStatement, Task task) {
            sQLiteStatement.mo230bindLong(1, task.getId_task());
            if (task.getTask() == null) {
                sQLiteStatement.mo231bindNull(2);
            } else {
                sQLiteStatement.mo232bindText(2, task.getTask());
            }
            if (task.getDate_time_created() == null) {
                sQLiteStatement.mo231bindNull(3);
            } else {
                sQLiteStatement.mo232bindText(3, task.getDate_time_created());
            }
            if (task.getDate_time_reminder() == null) {
                sQLiteStatement.mo231bindNull(4);
            } else {
                sQLiteStatement.mo232bindText(4, task.getDate_time_reminder());
            }
            sQLiteStatement.mo230bindLong(5, task.isChecked() ? 1L : 0L);
            sQLiteStatement.mo230bindLong(6, task.isReminded() ? 1L : 0L);
        }
    };
    private final EntityDeleteOrUpdateAdapter<Task> __deleteAdapterOfTask = new EntityDeleteOrUpdateAdapter<Task>() { // from class: com.neptunesoft.bacdz.dao.TaskDao_Impl.2
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        protected String createQuery() {
            return "DELETE FROM `Tasks` WHERE `id_task` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(final SQLiteStatement statement, final Task entity) {
            statement.mo230bindLong(1, entity.getId_task());
        }
    };

    public TaskDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
    }

    @Override // com.neptunesoft.bacdz.dao.TaskDao
    public void insertTask(final Task task) {
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.neptunesoft.bacdz.dao.TaskDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaskDao_Impl.this.m778lambda$insertTask$0$comneptunesoftbacdzdaoTaskDao_Impl(task, (SQLiteConnection) obj);
            }
        });
    }

    /* renamed from: lambda$insertTask$0$com-neptunesoft-bacdz-dao-TaskDao_Impl, reason: not valid java name */
    /* synthetic */ Object m778lambda$insertTask$0$comneptunesoftbacdzdaoTaskDao_Impl(Task task, SQLiteConnection sQLiteConnection) {
        this.__insertAdapterOfTask.insert(sQLiteConnection, (SQLiteConnection) task);
        return null;
    }

    @Override // com.neptunesoft.bacdz.dao.TaskDao
    public void deleteTask(final Task task) {
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.neptunesoft.bacdz.dao.TaskDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaskDao_Impl.this.m777lambda$deleteTask$1$comneptunesoftbacdzdaoTaskDao_Impl(task, (SQLiteConnection) obj);
            }
        });
    }

    /* renamed from: lambda$deleteTask$1$com-neptunesoft-bacdz-dao-TaskDao_Impl, reason: not valid java name */
    /* synthetic */ Object m777lambda$deleteTask$1$comneptunesoftbacdzdaoTaskDao_Impl(Task task, SQLiteConnection sQLiteConnection) {
        this.__deleteAdapterOfTask.handle(sQLiteConnection, task);
        return null;
    }

    @Override // com.neptunesoft.bacdz.dao.TaskDao
    public List<Task> getAllTasks() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.neptunesoft.bacdz.dao.TaskDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaskDao_Impl.lambda$getAllTasks$2((SQLiteConnection) obj);
            }
        });
    }

    static /* synthetic */ List lambda$getAllTasks$2(SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT * from (SELECT * FROM Tasks ORDER BY id_task DESC) as tasks ORDER BY tasks.checked ASC,tasks.id_task DESC");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id_task");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "task");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "date_time_created");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "date_time_reminder");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "checked");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "reminded");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                Task task = new Task();
                task.setId_task((int) prepare.getLong(columnIndexOrThrow));
                String str = null;
                task.setTask(prepare.isNull(columnIndexOrThrow2) ? null : prepare.getText(columnIndexOrThrow2));
                task.setDate_time_created(prepare.isNull(columnIndexOrThrow3) ? null : prepare.getText(columnIndexOrThrow3));
                if (!prepare.isNull(columnIndexOrThrow4)) {
                    str = prepare.getText(columnIndexOrThrow4);
                }
                task.setDate_time_reminder(str);
                boolean z = true;
                task.setChecked(((int) prepare.getLong(columnIndexOrThrow5)) != 0);
                if (((int) prepare.getLong(columnIndexOrThrow6)) == 0) {
                    z = false;
                }
                task.setReminded(z);
                arrayList.add(task);
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // com.neptunesoft.bacdz.dao.TaskDao
    public List<Task> getAllTasksReminder() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.neptunesoft.bacdz.dao.TaskDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaskDao_Impl.lambda$getAllTasksReminder$3((SQLiteConnection) obj);
            }
        });
    }

    static /* synthetic */ List lambda$getAllTasksReminder$3(SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT * from tasks where tasks.checked = 0 and tasks.reminded = 0 and tasks.date_time_reminder NOT NULL");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id_task");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "task");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "date_time_created");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "date_time_reminder");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "checked");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "reminded");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                Task task = new Task();
                task.setId_task((int) prepare.getLong(columnIndexOrThrow));
                String str = null;
                task.setTask(prepare.isNull(columnIndexOrThrow2) ? null : prepare.getText(columnIndexOrThrow2));
                task.setDate_time_created(prepare.isNull(columnIndexOrThrow3) ? null : prepare.getText(columnIndexOrThrow3));
                if (!prepare.isNull(columnIndexOrThrow4)) {
                    str = prepare.getText(columnIndexOrThrow4);
                }
                task.setDate_time_reminder(str);
                boolean z = true;
                task.setChecked(((int) prepare.getLong(columnIndexOrThrow5)) != 0);
                if (((int) prepare.getLong(columnIndexOrThrow6)) == 0) {
                    z = false;
                }
                task.setReminded(z);
                arrayList.add(task);
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // com.neptunesoft.bacdz.dao.TaskDao
    public Task getLastTast() {
        return (Task) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.neptunesoft.bacdz.dao.TaskDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaskDao_Impl.lambda$getLastTast$4((SQLiteConnection) obj);
            }
        });
    }

    static /* synthetic */ Task lambda$getLastTast$4(SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT * from Tasks where id_task = (SELECT MAX(id_task)  FROM Tasks)");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id_task");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "task");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "date_time_created");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "date_time_reminder");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "checked");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "reminded");
            Task task = null;
            String text = null;
            if (prepare.step()) {
                Task task2 = new Task();
                task2.setId_task((int) prepare.getLong(columnIndexOrThrow));
                task2.setTask(prepare.isNull(columnIndexOrThrow2) ? null : prepare.getText(columnIndexOrThrow2));
                task2.setDate_time_created(prepare.isNull(columnIndexOrThrow3) ? null : prepare.getText(columnIndexOrThrow3));
                if (!prepare.isNull(columnIndexOrThrow4)) {
                    text = prepare.getText(columnIndexOrThrow4);
                }
                task2.setDate_time_reminder(text);
                boolean z = true;
                task2.setChecked(((int) prepare.getLong(columnIndexOrThrow5)) != 0);
                if (((int) prepare.getLong(columnIndexOrThrow6)) == 0) {
                    z = false;
                }
                task2.setReminded(z);
                task = task2;
            }
            return task;
        } finally {
            prepare.close();
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }
}

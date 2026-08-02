package androidx.room;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H$¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H$¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0017¢\u0006\u0004\b\u0015\u0010\u0018"}, d2 = {"Landroidx/room/EntityDeleteOrUpdateAdapter;", "T", "", "<init>", "()V", "", "createQuery", "()Ljava/lang/String;", "Landroidx/sqlite/SQLiteStatement;", "statement", "entity", "", "bind", "(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V", "Landroidx/sqlite/SQLiteConnection;", "connection", "", "handle", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)I", "", "entities", "handleMultiple", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Iterable;)I", "", "(Landroidx/sqlite/SQLiteConnection;[Ljava/lang/Object;)I"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class EntityDeleteOrUpdateAdapter<T> {
    protected abstract void bind(androidx.database.SQLiteStatement statement, T entity);

    protected abstract java.lang.String createQuery();

    public final int handle(androidx.database.SQLiteConnection connection, T entity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
        if (entity == null) {
            return 0;
        }
        androidx.database.SQLiteStatement prepare = connection.prepare(createQuery());
        try {
            androidx.database.SQLiteStatement sQLiteStatement = prepare;
            bind(sQLiteStatement, entity);
            sQLiteStatement.step();
            kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, null);
            return androidx.room.util.SQLiteConnectionUtil.getTotalChangedRows(connection);
        } finally {
        }
    }

    public final int handleMultiple(androidx.database.SQLiteConnection connection, java.lang.Iterable<? extends T> entities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
        int i = 0;
        if (entities == null) {
            return 0;
        }
        androidx.database.SQLiteStatement prepare = connection.prepare(createQuery());
        try {
            androidx.database.SQLiteStatement sQLiteStatement = prepare;
            for (T t : entities) {
                if (t != null) {
                    bind(sQLiteStatement, t);
                    sQLiteStatement.step();
                    sQLiteStatement.reset();
                    i += androidx.room.util.SQLiteConnectionUtil.getTotalChangedRows(connection);
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, null);
            return i;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int handleMultiple(androidx.database.SQLiteConnection connection, T[] entities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
        int i = 0;
        if (entities == null) {
            return 0;
        }
        androidx.database.SQLiteStatement prepare = connection.prepare(createQuery());
        try {
            androidx.database.SQLiteStatement sQLiteStatement = prepare;
            java.util.Iterator it = kotlin.jvm.internal.ArrayIteratorKt.iterator(entities);
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (next != null) {
                    bind(sQLiteStatement, next);
                    sQLiteStatement.step();
                    sQLiteStatement.reset();
                    i += androidx.room.util.SQLiteConnectionUtil.getTotalChangedRows(connection);
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, null);
            return i;
        } finally {
        }
    }
}

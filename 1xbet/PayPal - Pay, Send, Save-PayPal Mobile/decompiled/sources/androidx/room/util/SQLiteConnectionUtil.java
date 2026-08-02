package androidx.room.util;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/sqlite/SQLiteConnection;", "connection", "", "getLastInsertedRowId", "(Landroidx/sqlite/SQLiteConnection;)J", "", "getTotalChangedRows", "(Landroidx/sqlite/SQLiteConnection;)I"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SQLiteConnectionUtil {
    public static final long getLastInsertedRowId(androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        if (getTotalChangedRows(sQLiteConnection) == 0) {
            return -1L;
        }
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare("SELECT last_insert_rowid()");
        try {
            androidx.database.SQLiteStatement sQLiteStatement = prepare;
            sQLiteStatement.step();
            long j = sQLiteStatement.getLong(0);
            kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, null);
            return j;
        } finally {
        }
    }

    public static final int getTotalChangedRows(androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare("SELECT changes()");
        try {
            androidx.database.SQLiteStatement sQLiteStatement = prepare;
            sQLiteStatement.step();
            int i = (int) sQLiteStatement.getLong(0);
            kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, null);
            return i;
        } finally {
        }
    }
}

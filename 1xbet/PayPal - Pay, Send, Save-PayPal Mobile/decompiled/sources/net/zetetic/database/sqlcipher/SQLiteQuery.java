package net.zetetic.database.sqlcipher;

/* loaded from: classes5.dex */
public final class SQLiteQuery extends net.zetetic.database.sqlcipher.SQLiteProgram {
    private static final java.lang.String TAG = "SQLiteQuery";
    private final android.os.CancellationSignal mCancellationSignal;

    SQLiteQuery(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase, java.lang.String str, android.os.CancellationSignal cancellationSignal) {
        super(sQLiteDatabase, str, null, cancellationSignal);
        this.mCancellationSignal = cancellationSignal;
    }

    final int fillWindow(net.zetetic.database.CursorWindow cursorWindow, int i, int i2, boolean z) {
        acquireReference();
        try {
            cursorWindow.acquireReference();
            try {
                try {
                    return getSession().executeForCursorWindow(getSql(), getBindArgs(), cursorWindow, i, i2, z, getConnectionFlags(), this.mCancellationSignal);
                } catch (android.database.sqlite.SQLiteDatabaseCorruptException e) {
                    onCorruption(e);
                    throw e;
                } catch (android.database.sqlite.SQLiteException e2) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("exception: ");
                    sb.append(e2.getMessage());
                    sb.append("; query: ");
                    sb.append(getSql());
                    net.zetetic.database.Logger.e(TAG, sb.toString());
                    throw e2;
                }
            } finally {
                cursorWindow.releaseReference();
            }
        } finally {
            releaseReference();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SQLiteQuery: ");
        sb.append(getSql());
        return sb.toString();
    }
}

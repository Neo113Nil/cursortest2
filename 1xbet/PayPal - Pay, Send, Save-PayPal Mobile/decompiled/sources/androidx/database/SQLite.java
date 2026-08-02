package androidx.database;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\r"}, d2 = {"Landroidx/sqlite/SQLiteConnection;", "", com.datadog.trace.api.DDSpanTypes.SQL, "", "execSQL", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V", "", "errorCode", "errorMsg", "", "throwSQLiteException", "(ILjava/lang/String;)Ljava/lang/Void;", "SQLITE_DATA_INTEGER", com.visa.cbp.getEncExpo.warmup, "SQLITE_DATA_FLOAT", "SQLITE_DATA_TEXT", "SQLITE_DATA_BLOB", "SQLITE_DATA_NULL"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SQLite {
    public static final int SQLITE_DATA_BLOB = 4;
    public static final int SQLITE_DATA_FLOAT = 2;
    public static final int SQLITE_DATA_INTEGER = 1;
    public static final int SQLITE_DATA_NULL = 5;
    public static final int SQLITE_DATA_TEXT = 3;

    public static final void execSQL(androidx.database.SQLiteConnection sQLiteConnection, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.step();
            kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, null);
        } finally {
        }
    }

    public static final java.lang.Void throwSQLiteException(int i, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Error code: ".concat(java.lang.String.valueOf(i)));
        if (str != null) {
            sb.append(", message: ".concat(java.lang.String.valueOf(str)));
        }
        throw new android.database.SQLException(sb.toString());
    }
}

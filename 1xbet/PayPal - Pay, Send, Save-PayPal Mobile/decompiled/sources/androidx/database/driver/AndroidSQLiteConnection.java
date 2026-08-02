package androidx.database.driver;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/sqlite/driver/AndroidSQLiteConnection;", "Landroidx/sqlite/SQLiteConnection;", "Landroid/database/sqlite/SQLiteDatabase;", com.datadog.trace.api.DDSpanTypes.COUCHBASE, "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "inTransaction", "()Z", "", com.datadog.trace.api.DDSpanTypes.SQL, "Landroidx/sqlite/SQLiteStatement;", "prepare", "(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;", "", "close", "()V", "Landroid/database/sqlite/SQLiteDatabase;", "getDb", "()Landroid/database/sqlite/SQLiteDatabase;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidSQLiteConnection implements androidx.database.SQLiteConnection {
    private final android.database.sqlite.SQLiteDatabase db;

    public AndroidSQLiteConnection(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteDatabase, "");
        this.db = sQLiteDatabase;
    }

    public final android.database.sqlite.SQLiteDatabase getDb() {
        return this.db;
    }

    @Override // androidx.database.SQLiteConnection
    public final boolean inTransaction() {
        return this.db.inTransaction();
    }

    @Override // androidx.database.SQLiteConnection
    public final androidx.database.SQLiteStatement prepare(java.lang.String sql) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "");
        if (this.db.isOpen()) {
            return androidx.database.driver.SupportSQLiteStatement.INSTANCE.create(new androidx.database.db.framework.FrameworkSQLiteDatabase(this.db), sql);
        }
        androidx.database.SQLite.throwSQLiteException(21, "connection is closed");
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.database.SQLiteConnection, java.lang.AutoCloseable
    public final void close() {
        this.db.close();
    }
}

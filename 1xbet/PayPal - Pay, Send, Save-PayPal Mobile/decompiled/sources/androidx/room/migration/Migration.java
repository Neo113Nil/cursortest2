package androidx.room.migration;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\n\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f"}, d2 = {"Landroidx/room/migration/Migration;", "", "", "startVersion", "endVersion", "<init>", "(II)V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", com.datadog.trace.api.DDSpanTypes.COUCHBASE, "", "migrate", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "Landroidx/sqlite/SQLiteConnection;", "connection", "(Landroidx/sqlite/SQLiteConnection;)V", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Migration {
    public final int endVersion;
    public final int startVersion;

    public Migration(int i, int i2) {
        this.startVersion = i;
        this.endVersion = i2;
    }

    public void migrate(androidx.database.db.SupportSQLiteDatabase db) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
        throw new kotlin.NotImplementedError("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    public void migrate(androidx.database.SQLiteConnection connection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
        if (connection instanceof androidx.database.driver.SupportSQLiteConnection) {
            migrate(((androidx.database.driver.SupportSQLiteConnection) connection).getDb());
            return;
        }
        throw new kotlin.NotImplementedError("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
    }
}

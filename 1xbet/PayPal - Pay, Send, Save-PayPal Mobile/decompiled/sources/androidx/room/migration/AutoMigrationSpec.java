package androidx.room.migration;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/room/migration/AutoMigrationSpec;", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", com.datadog.trace.api.DDSpanTypes.COUCHBASE, "", "onPostMigrate", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "Landroidx/sqlite/SQLiteConnection;", "connection", "(Landroidx/sqlite/SQLiteConnection;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AutoMigrationSpec {
    default void onPostMigrate(androidx.database.SQLiteConnection connection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
        if (connection instanceof androidx.database.driver.SupportSQLiteConnection) {
            onPostMigrate(((androidx.database.driver.SupportSQLiteConnection) connection).getDb());
        }
    }

    default void onPostMigrate(androidx.database.db.SupportSQLiteDatabase db) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
    }
}

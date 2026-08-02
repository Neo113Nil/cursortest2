package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/work/impl/WorkDatabase_AutoMigration_18_19_Impl;", "Landroidx/room/migration/Migration;", "<init>", "()V", "Landroidx/sqlite/SQLiteConnection;", "connection", "", "migrate", "(Landroidx/sqlite/SQLiteConnection;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WorkDatabase_AutoMigration_18_19_Impl extends androidx.room.migration.Migration {
    public WorkDatabase_AutoMigration_18_19_Impl() {
        super(18, 19);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(androidx.database.SQLiteConnection connection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
        androidx.database.SQLite.execSQL(connection, "ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}

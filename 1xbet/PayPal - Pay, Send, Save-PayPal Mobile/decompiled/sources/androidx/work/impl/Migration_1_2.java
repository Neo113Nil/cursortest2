package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/work/impl/Migration_1_2;", "Landroidx/room/migration/Migration;", "<init>", "()V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", com.datadog.trace.api.DDSpanTypes.COUCHBASE, "", "migrate", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Migration_1_2 extends androidx.room.migration.Migration {
    public static final androidx.work.impl.Migration_1_2 INSTANCE = new androidx.work.impl.Migration_1_2();

    private Migration_1_2() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(androidx.database.db.SupportSQLiteDatabase db) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
        db.execSQL("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        db.execSQL("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        db.execSQL("DROP TABLE IF EXISTS alarmInfo");
        db.execSQL("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}

package t0;

import android.content.ContentValues;
import android.text.TextUtils;
import c0.C0301c;
import c0.C0307i;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public final class e extends Y.a {

    /* renamed from: d, reason: collision with root package name */
    public static final e f11841d = new e(11, 12, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final e f11842e = new e(12, 13, 1);

    /* renamed from: f, reason: collision with root package name */
    public static final e f11843f = new e(15, 16, 2);

    /* renamed from: g, reason: collision with root package name */
    public static final e f11844g = new e(1, 2, 3);

    /* renamed from: h, reason: collision with root package name */
    public static final e f11845h = new e(3, 4, 4);

    /* renamed from: i, reason: collision with root package name */
    public static final e f11846i = new e(4, 5, 5);

    /* renamed from: j, reason: collision with root package name */
    public static final e f11847j = new e(6, 7, 6);

    /* renamed from: k, reason: collision with root package name */
    public static final e f11848k = new e(7, 8, 7);

    /* renamed from: l, reason: collision with root package name */
    public static final e f11849l = new e(8, 9, 8);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11850c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i2, int i3, int i6) {
        super(i2, i3);
        this.f11850c = i6;
    }

    @Override // Y.a
    public final void a(C0301c c0301c) {
        switch (this.f11850c) {
            case 0:
                c0301c.o("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                return;
            case 1:
                c0301c.o("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
                c0301c.o("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
                return;
            case 2:
                c0301c.o("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
                c0301c.o("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
                c0301c.o("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
                c0301c.o("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
                c0301c.o("DROP TABLE `SystemIdInfo`");
                c0301c.o("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
                return;
            case 3:
                c0301c.o("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                c0301c.o("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
                c0301c.o("DROP TABLE IF EXISTS alarmInfo");
                c0301c.o("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
                return;
            case 4:
                c0301c.o("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
                return;
            case 5:
                c0301c.o("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                c0301c.o("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                return;
            case 6:
                c0301c.o("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                return;
            case 7:
                c0301c.o("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
                return;
            case 8:
                c0301c.o("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
                return;
            case 9:
                c0301c.o("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                c0301c.o("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                c0301c.o("DROP TABLE `WorkSpec`");
                c0301c.o("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                c0301c.o("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                c0301c.o("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
                return;
            default:
                c0301c.o("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                c0301c.o("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                c0301c.o("DROP TABLE `WorkSpec`");
                c0301c.o("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                c0301c.o("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                c0301c.o("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                c0301c.o("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
                Object[] objArr = new Object[0];
                c0301c.getClass();
                if (contentValues.size() == 0) {
                    throw new IllegalArgumentException("Empty values");
                }
                int size = contentValues.size();
                int length = objArr.length + size;
                Object[] objArr2 = new Object[length];
                StringBuilder sb = new StringBuilder("UPDATE ");
                sb.append(C0301c.f4868c[3]);
                sb.append("WorkSpec SET ");
                int i2 = 0;
                for (String str : contentValues.keySet()) {
                    sb.append(i2 > 0 ? StringUtils.COMMA : "");
                    sb.append(str);
                    objArr2[i2] = contentValues.get(str);
                    sb.append("=?");
                    i2++;
                }
                for (int i3 = size; i3 < length; i3++) {
                    objArr2[i3] = objArr[i3 - size];
                }
                if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                    sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
                }
                String sb2 = sb.toString();
                kotlin.jvm.internal.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
                C0307i c2 = c0301c.c(sb2);
                int length2 = objArr2.length;
                int i6 = 0;
                while (i6 < length2) {
                    Object obj = objArr2[i6];
                    i6++;
                    if (obj == null) {
                        c2.j(i6);
                    } else if (obj instanceof byte[]) {
                        c2.w(i6, (byte[]) obj);
                    } else if (obj instanceof Float) {
                        c2.k(i6, ((Number) obj).floatValue());
                    } else if (obj instanceof Double) {
                        c2.k(i6, ((Number) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        c2.t(i6, ((Number) obj).longValue());
                    } else if (obj instanceof Integer) {
                        c2.t(i6, ((Number) obj).intValue());
                    } else if (obj instanceof Short) {
                        c2.t(i6, ((Number) obj).shortValue());
                    } else if (obj instanceof Byte) {
                        c2.t(i6, ((Number) obj).byteValue());
                    } else if (obj instanceof String) {
                        c2.f(i6, (String) obj);
                    } else {
                        if (!(obj instanceof Boolean)) {
                            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i6 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                        }
                        c2.t(i6, ((Boolean) obj).booleanValue() ? 1L : 0L);
                    }
                }
                c2.f4892b.executeUpdateDelete();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e() {
        super(14, 15);
        this.f11850c = 10;
    }
}

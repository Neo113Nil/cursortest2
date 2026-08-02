package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J)\u0010\u000f\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u000e0\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u001a\u0010\u0015\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r\u0012\u0004\u0012\u00020\u00120\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0019018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u001c018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u001f018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\"018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00103R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020%018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00103R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020(018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00103R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020+018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00103R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020.018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103"}, d2 = {"Landroidx/work/impl/WorkDatabase_Impl;", "Landroidx/work/impl/WorkDatabase;", "<init>", "()V", "Landroidx/room/RoomOpenDelegate;", "createOpenDelegate", "()Landroidx/room/RoomOpenDelegate;", "Landroidx/room/InvalidationTracker;", "createInvalidationTracker", "()Landroidx/room/InvalidationTracker;", "", "clearAllTables", "", "Lkotlin/reflect/KClass;", "", "getRequiredTypeConverterClasses", "()Ljava/util/Map;", "", "Landroidx/room/migration/AutoMigrationSpec;", "getRequiredAutoMigrationSpecClasses", "()Ljava/util/Set;", "autoMigrationSpecs", "Landroidx/room/migration/Migration;", "createAutoMigrations", "(Ljava/util/Map;)Ljava/util/List;", "Landroidx/work/impl/model/WorkSpecDao;", "workSpecDao", "()Landroidx/work/impl/model/WorkSpecDao;", "Landroidx/work/impl/model/DependencyDao;", "dependencyDao", "()Landroidx/work/impl/model/DependencyDao;", "Landroidx/work/impl/model/WorkTagDao;", "workTagDao", "()Landroidx/work/impl/model/WorkTagDao;", "Landroidx/work/impl/model/SystemIdInfoDao;", "systemIdInfoDao", "()Landroidx/work/impl/model/SystemIdInfoDao;", "Landroidx/work/impl/model/WorkNameDao;", "workNameDao", "()Landroidx/work/impl/model/WorkNameDao;", "Landroidx/work/impl/model/WorkProgressDao;", "workProgressDao", "()Landroidx/work/impl/model/WorkProgressDao;", "Landroidx/work/impl/model/PreferenceDao;", "preferenceDao", "()Landroidx/work/impl/model/PreferenceDao;", "Landroidx/work/impl/model/RawWorkInfoDao;", "rawWorkInfoDao", "()Landroidx/work/impl/model/RawWorkInfoDao;", "Lkotlin/Lazy;", "getOutputMinFrameDuration", "Lkotlin/Lazy;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "getHighSpeedVideoSizesFor", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "getInputFormats", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WorkDatabase_Impl extends androidx.work.impl.WorkDatabase {

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlin.Lazy<androidx.work.impl.model.WorkSpecDao> Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.WorkDatabase_Impl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.work.impl.WorkDatabase_Impl.$r8$lambda$EBCBMQRVkN1sQSZgY0tCFd1jjgA(androidx.work.impl.WorkDatabase_Impl.this);
        }
    });

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy<androidx.work.impl.model.DependencyDao> getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.WorkDatabase_Impl$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.work.impl.WorkDatabase_Impl.m9472$r8$lambda$UR3dJSshz5ZBBq2DPAP4EXV70s(androidx.work.impl.WorkDatabase_Impl.this);
        }
    });

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final kotlin.Lazy<androidx.work.impl.model.WorkTagDao> getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.WorkDatabase_Impl$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.work.impl.WorkDatabase_Impl.$r8$lambda$232E_xBZ836NRYMgTAYNO5qULN0(androidx.work.impl.WorkDatabase_Impl.this);
        }
    });
    private final kotlin.Lazy<androidx.work.impl.model.SystemIdInfoDao> getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.WorkDatabase_Impl$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.work.impl.WorkDatabase_Impl.$r8$lambda$VD7PkCdHr0pD6cL8vVPjuCZZsCo(androidx.work.impl.WorkDatabase_Impl.this);
        }
    });
    private final kotlin.Lazy<androidx.work.impl.model.WorkNameDao> getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.WorkDatabase_Impl$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.work.impl.WorkDatabase_Impl.m9470$r8$lambda$9rVe6bMn1RRzNPxGG5NcgNi1Xs(androidx.work.impl.WorkDatabase_Impl.this);
        }
    });

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlin.Lazy<androidx.work.impl.model.WorkProgressDao> getHighSpeedVideoSizesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.WorkDatabase_Impl$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.work.impl.WorkDatabase_Impl.$r8$lambda$YXFG2V7GSqY1Fh14uyLBpxHvsJg(androidx.work.impl.WorkDatabase_Impl.this);
        }
    });

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy<androidx.work.impl.model.PreferenceDao> getInputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.WorkDatabase_Impl$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.work.impl.WorkDatabase_Impl.m9471$r8$lambda$Q4e7dMsbchyXlG7si6nJ2SX0Hg(androidx.work.impl.WorkDatabase_Impl.this);
        }
    });

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.Lazy<androidx.work.impl.model.RawWorkInfoDao> getInputFormats = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.WorkDatabase_Impl$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.work.impl.WorkDatabase_Impl.$r8$lambda$nTzsr7UbqjB1fFswZZ1aP5SIdIc(androidx.work.impl.WorkDatabase_Impl.this);
        }
    });

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public final androidx.room.RoomOpenDelegate createOpenDelegate() {
        return new androidx.room.RoomOpenDelegate() { // from class: androidx.work.impl.WorkDatabase_Impl$createOpenDelegate$_openDelegate$1
            {
                super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
            }

            @Override // androidx.room.RoomOpenDelegate
            public final void createAllTables(androidx.database.SQLiteConnection connection) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
                androidx.database.SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                androidx.database.SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                androidx.database.SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                androidx.database.SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                androidx.database.SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                androidx.database.SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                androidx.database.SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                androidx.database.SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                androidx.database.SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                androidx.database.SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                androidx.database.SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                androidx.database.SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                androidx.database.SQLite.execSQL(connection, androidx.work.impl.utils.PreferenceUtils.CREATE_PREFERENCE);
                androidx.database.SQLite.execSQL(connection, androidx.room.RoomMasterTable.CREATE_QUERY);
                androidx.database.SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public final void dropAllTables(androidx.database.SQLiteConnection connection) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
                androidx.database.SQLite.execSQL(connection, "DROP TABLE IF EXISTS `Dependency`");
                androidx.database.SQLite.execSQL(connection, "DROP TABLE IF EXISTS `WorkSpec`");
                androidx.database.SQLite.execSQL(connection, "DROP TABLE IF EXISTS `WorkTag`");
                androidx.database.SQLite.execSQL(connection, "DROP TABLE IF EXISTS `SystemIdInfo`");
                androidx.database.SQLite.execSQL(connection, "DROP TABLE IF EXISTS `WorkName`");
                androidx.database.SQLite.execSQL(connection, "DROP TABLE IF EXISTS `WorkProgress`");
                androidx.database.SQLite.execSQL(connection, "DROP TABLE IF EXISTS `Preference`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public final void onOpen(androidx.database.SQLiteConnection connection) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
                androidx.database.SQLite.execSQL(connection, "PRAGMA foreign_keys = ON");
                androidx.work.impl.WorkDatabase_Impl.this.internalInitInvalidationTracker(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public final void onPreMigrate(androidx.database.SQLiteConnection connection) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
                androidx.room.util.DBUtil.dropFtsSyncTriggers(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public final androidx.room.RoomOpenDelegate.ValidationResult onValidateSchema(androidx.database.SQLiteConnection connection) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                linkedHashMap.put("work_spec_id", new androidx.room.util.TableInfo.Column("work_spec_id", "TEXT", true, 1, null, 1));
                linkedHashMap.put("prerequisite_id", new androidx.room.util.TableInfo.Column("prerequisite_id", "TEXT", true, 2, null, 1));
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                linkedHashSet.add(new androidx.room.util.TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", kotlin.collections.CollectionsKt.listOf("work_spec_id"), kotlin.collections.CollectionsKt.listOf("id")));
                linkedHashSet.add(new androidx.room.util.TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", kotlin.collections.CollectionsKt.listOf("prerequisite_id"), kotlin.collections.CollectionsKt.listOf("id")));
                java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
                linkedHashSet2.add(new androidx.room.util.TableInfo.Index("index_Dependency_work_spec_id", false, kotlin.collections.CollectionsKt.listOf("work_spec_id"), kotlin.collections.CollectionsKt.listOf("ASC")));
                linkedHashSet2.add(new androidx.room.util.TableInfo.Index("index_Dependency_prerequisite_id", false, kotlin.collections.CollectionsKt.listOf("prerequisite_id"), kotlin.collections.CollectionsKt.listOf("ASC")));
                androidx.room.util.TableInfo tableInfo = new androidx.room.util.TableInfo("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
                androidx.room.util.TableInfo read = androidx.room.util.TableInfo.INSTANCE.read(connection, "Dependency");
                if (!tableInfo.equals(read)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
                    sb.append(tableInfo);
                    sb.append("\n Found:\n");
                    sb.append(read);
                    return new androidx.room.RoomOpenDelegate.ValidationResult(false, sb.toString());
                }
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                linkedHashMap2.put("id", new androidx.room.util.TableInfo.Column("id", "TEXT", true, 1, null, 1));
                linkedHashMap2.put("state", new androidx.room.util.TableInfo.Column("state", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("worker_class_name", new androidx.room.util.TableInfo.Column("worker_class_name", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("input_merger_class_name", new androidx.room.util.TableInfo.Column("input_merger_class_name", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("input", new androidx.room.util.TableInfo.Column("input", "BLOB", true, 0, null, 1));
                linkedHashMap2.put("output", new androidx.room.util.TableInfo.Column("output", "BLOB", true, 0, null, 1));
                linkedHashMap2.put("initial_delay", new androidx.room.util.TableInfo.Column("initial_delay", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("interval_duration", new androidx.room.util.TableInfo.Column("interval_duration", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("flex_duration", new androidx.room.util.TableInfo.Column("flex_duration", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("run_attempt_count", new androidx.room.util.TableInfo.Column("run_attempt_count", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("backoff_policy", new androidx.room.util.TableInfo.Column("backoff_policy", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("backoff_delay_duration", new androidx.room.util.TableInfo.Column("backoff_delay_duration", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("last_enqueue_time", new androidx.room.util.TableInfo.Column("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
                linkedHashMap2.put("minimum_retention_duration", new androidx.room.util.TableInfo.Column("minimum_retention_duration", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("schedule_requested_at", new androidx.room.util.TableInfo.Column("schedule_requested_at", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("run_in_foreground", new androidx.room.util.TableInfo.Column("run_in_foreground", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("out_of_quota_policy", new androidx.room.util.TableInfo.Column("out_of_quota_policy", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("period_count", new androidx.room.util.TableInfo.Column("period_count", "INTEGER", true, 0, "0", 1));
                linkedHashMap2.put("generation", new androidx.room.util.TableInfo.Column("generation", "INTEGER", true, 0, "0", 1));
                linkedHashMap2.put("next_schedule_time_override", new androidx.room.util.TableInfo.Column("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
                linkedHashMap2.put("next_schedule_time_override_generation", new androidx.room.util.TableInfo.Column("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
                linkedHashMap2.put("stop_reason", new androidx.room.util.TableInfo.Column("stop_reason", "INTEGER", true, 0, "-256", 1));
                linkedHashMap2.put("trace_tag", new androidx.room.util.TableInfo.Column("trace_tag", "TEXT", false, 0, null, 1));
                linkedHashMap2.put("backoff_on_system_interruptions", new androidx.room.util.TableInfo.Column("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
                linkedHashMap2.put("required_network_type", new androidx.room.util.TableInfo.Column("required_network_type", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("required_network_request", new androidx.room.util.TableInfo.Column("required_network_request", "BLOB", true, 0, "x''", 1));
                linkedHashMap2.put("requires_charging", new androidx.room.util.TableInfo.Column("requires_charging", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("requires_device_idle", new androidx.room.util.TableInfo.Column("requires_device_idle", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("requires_battery_not_low", new androidx.room.util.TableInfo.Column("requires_battery_not_low", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("requires_storage_not_low", new androidx.room.util.TableInfo.Column("requires_storage_not_low", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("trigger_content_update_delay", new androidx.room.util.TableInfo.Column("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("trigger_max_content_delay", new androidx.room.util.TableInfo.Column("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("content_uri_triggers", new androidx.room.util.TableInfo.Column("content_uri_triggers", "BLOB", true, 0, null, 1));
                java.util.LinkedHashSet linkedHashSet3 = new java.util.LinkedHashSet();
                java.util.LinkedHashSet linkedHashSet4 = new java.util.LinkedHashSet();
                linkedHashSet4.add(new androidx.room.util.TableInfo.Index("index_WorkSpec_schedule_requested_at", false, kotlin.collections.CollectionsKt.listOf("schedule_requested_at"), kotlin.collections.CollectionsKt.listOf("ASC")));
                linkedHashSet4.add(new androidx.room.util.TableInfo.Index("index_WorkSpec_last_enqueue_time", false, kotlin.collections.CollectionsKt.listOf("last_enqueue_time"), kotlin.collections.CollectionsKt.listOf("ASC")));
                androidx.room.util.TableInfo tableInfo2 = new androidx.room.util.TableInfo("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
                androidx.room.util.TableInfo read2 = androidx.room.util.TableInfo.INSTANCE.read(connection, "WorkSpec");
                if (!tableInfo2.equals(read2)) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
                    sb2.append(tableInfo2);
                    sb2.append("\n Found:\n");
                    sb2.append(read2);
                    return new androidx.room.RoomOpenDelegate.ValidationResult(false, sb2.toString());
                }
                java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
                linkedHashMap3.put("tag", new androidx.room.util.TableInfo.Column("tag", "TEXT", true, 1, null, 1));
                linkedHashMap3.put("work_spec_id", new androidx.room.util.TableInfo.Column("work_spec_id", "TEXT", true, 2, null, 1));
                java.util.LinkedHashSet linkedHashSet5 = new java.util.LinkedHashSet();
                linkedHashSet5.add(new androidx.room.util.TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", kotlin.collections.CollectionsKt.listOf("work_spec_id"), kotlin.collections.CollectionsKt.listOf("id")));
                java.util.LinkedHashSet linkedHashSet6 = new java.util.LinkedHashSet();
                linkedHashSet6.add(new androidx.room.util.TableInfo.Index("index_WorkTag_work_spec_id", false, kotlin.collections.CollectionsKt.listOf("work_spec_id"), kotlin.collections.CollectionsKt.listOf("ASC")));
                androidx.room.util.TableInfo tableInfo3 = new androidx.room.util.TableInfo("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
                androidx.room.util.TableInfo read3 = androidx.room.util.TableInfo.INSTANCE.read(connection, "WorkTag");
                if (!tableInfo3.equals(read3)) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
                    sb3.append(tableInfo3);
                    sb3.append("\n Found:\n");
                    sb3.append(read3);
                    return new androidx.room.RoomOpenDelegate.ValidationResult(false, sb3.toString());
                }
                java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
                linkedHashMap4.put("work_spec_id", new androidx.room.util.TableInfo.Column("work_spec_id", "TEXT", true, 1, null, 1));
                linkedHashMap4.put("generation", new androidx.room.util.TableInfo.Column("generation", "INTEGER", true, 2, "0", 1));
                linkedHashMap4.put("system_id", new androidx.room.util.TableInfo.Column("system_id", "INTEGER", true, 0, null, 1));
                java.util.LinkedHashSet linkedHashSet7 = new java.util.LinkedHashSet();
                linkedHashSet7.add(new androidx.room.util.TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", kotlin.collections.CollectionsKt.listOf("work_spec_id"), kotlin.collections.CollectionsKt.listOf("id")));
                androidx.room.util.TableInfo tableInfo4 = new androidx.room.util.TableInfo("SystemIdInfo", linkedHashMap4, linkedHashSet7, new java.util.LinkedHashSet());
                androidx.room.util.TableInfo read4 = androidx.room.util.TableInfo.INSTANCE.read(connection, "SystemIdInfo");
                if (!tableInfo4.equals(read4)) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
                    sb4.append(tableInfo4);
                    sb4.append("\n Found:\n");
                    sb4.append(read4);
                    return new androidx.room.RoomOpenDelegate.ValidationResult(false, sb4.toString());
                }
                java.util.LinkedHashMap linkedHashMap5 = new java.util.LinkedHashMap();
                linkedHashMap5.put("name", new androidx.room.util.TableInfo.Column("name", "TEXT", true, 1, null, 1));
                linkedHashMap5.put("work_spec_id", new androidx.room.util.TableInfo.Column("work_spec_id", "TEXT", true, 2, null, 1));
                java.util.LinkedHashSet linkedHashSet8 = new java.util.LinkedHashSet();
                linkedHashSet8.add(new androidx.room.util.TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", kotlin.collections.CollectionsKt.listOf("work_spec_id"), kotlin.collections.CollectionsKt.listOf("id")));
                java.util.LinkedHashSet linkedHashSet9 = new java.util.LinkedHashSet();
                linkedHashSet9.add(new androidx.room.util.TableInfo.Index("index_WorkName_work_spec_id", false, kotlin.collections.CollectionsKt.listOf("work_spec_id"), kotlin.collections.CollectionsKt.listOf("ASC")));
                androidx.room.util.TableInfo tableInfo5 = new androidx.room.util.TableInfo("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
                androidx.room.util.TableInfo read5 = androidx.room.util.TableInfo.INSTANCE.read(connection, "WorkName");
                if (!tableInfo5.equals(read5)) {
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
                    sb5.append(tableInfo5);
                    sb5.append("\n Found:\n");
                    sb5.append(read5);
                    return new androidx.room.RoomOpenDelegate.ValidationResult(false, sb5.toString());
                }
                java.util.LinkedHashMap linkedHashMap6 = new java.util.LinkedHashMap();
                linkedHashMap6.put("work_spec_id", new androidx.room.util.TableInfo.Column("work_spec_id", "TEXT", true, 1, null, 1));
                linkedHashMap6.put("progress", new androidx.room.util.TableInfo.Column("progress", "BLOB", true, 0, null, 1));
                java.util.LinkedHashSet linkedHashSet10 = new java.util.LinkedHashSet();
                linkedHashSet10.add(new androidx.room.util.TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", kotlin.collections.CollectionsKt.listOf("work_spec_id"), kotlin.collections.CollectionsKt.listOf("id")));
                androidx.room.util.TableInfo tableInfo6 = new androidx.room.util.TableInfo("WorkProgress", linkedHashMap6, linkedHashSet10, new java.util.LinkedHashSet());
                androidx.room.util.TableInfo read6 = androidx.room.util.TableInfo.INSTANCE.read(connection, "WorkProgress");
                if (!tableInfo6.equals(read6)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n");
                    sb6.append(tableInfo6);
                    sb6.append("\n Found:\n");
                    sb6.append(read6);
                    return new androidx.room.RoomOpenDelegate.ValidationResult(false, sb6.toString());
                }
                java.util.LinkedHashMap linkedHashMap7 = new java.util.LinkedHashMap();
                linkedHashMap7.put("key", new androidx.room.util.TableInfo.Column("key", "TEXT", true, 1, null, 1));
                linkedHashMap7.put("long_value", new androidx.room.util.TableInfo.Column("long_value", "INTEGER", false, 0, null, 1));
                androidx.room.util.TableInfo tableInfo7 = new androidx.room.util.TableInfo("Preference", linkedHashMap7, new java.util.LinkedHashSet(), new java.util.LinkedHashSet());
                androidx.room.util.TableInfo read7 = androidx.room.util.TableInfo.INSTANCE.read(connection, "Preference");
                if (!tableInfo7.equals(read7)) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Preference(androidx.work.impl.model.Preference).\n Expected:\n");
                    sb7.append(tableInfo7);
                    sb7.append("\n Found:\n");
                    sb7.append(read7);
                    return new androidx.room.RoomOpenDelegate.ValidationResult(false, sb7.toString());
                }
                return new androidx.room.RoomOpenDelegate.ValidationResult(true, null);
            }

            @Override // androidx.room.RoomOpenDelegate
            public final void onPostMigrate(androidx.database.SQLiteConnection connection) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
            }

            @Override // androidx.room.RoomOpenDelegate
            public final void onCreate(androidx.database.SQLiteConnection connection) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    public final androidx.room.InvalidationTracker createInvalidationTracker() {
        return new androidx.room.InvalidationTracker(this, new java.util.LinkedHashMap(), new java.util.LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        super.performClear(true, "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.RoomDatabase
    public final java.util.Map<kotlin.reflect.KClass<?>, java.util.List<kotlin.reflect.KClass<?>>> getRequiredTypeConverterClasses() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.work.impl.model.WorkSpecDao.class), androidx.work.impl.model.WorkSpecDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.work.impl.model.DependencyDao.class), androidx.work.impl.model.DependencyDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.work.impl.model.WorkTagDao.class), androidx.work.impl.model.WorkTagDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.work.impl.model.SystemIdInfoDao.class), androidx.work.impl.model.SystemIdInfoDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.work.impl.model.WorkNameDao.class), androidx.work.impl.model.WorkNameDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.work.impl.model.WorkProgressDao.class), androidx.work.impl.model.WorkProgressDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.work.impl.model.PreferenceDao.class), androidx.work.impl.model.PreferenceDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.work.impl.model.RawWorkInfoDao.class), androidx.work.impl.model.RawWorkInfoDao_Impl.INSTANCE.getRequiredConverters());
        return linkedHashMap;
    }

    @Override // androidx.room.RoomDatabase
    public final java.util.Set<kotlin.reflect.KClass<? extends androidx.room.migration.AutoMigrationSpec>> getRequiredAutoMigrationSpecClasses() {
        return new java.util.LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final java.util.List<androidx.room.migration.Migration> createAutoMigrations(java.util.Map<kotlin.reflect.KClass<? extends androidx.room.migration.AutoMigrationSpec>, ? extends androidx.room.migration.AutoMigrationSpec> autoMigrationSpecs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoMigrationSpecs, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new androidx.work.impl.WorkDatabase_AutoMigration_13_14_Impl());
        arrayList.add(new androidx.work.impl.WorkDatabase_AutoMigration_14_15_Impl());
        arrayList.add(new androidx.work.impl.WorkDatabase_AutoMigration_16_17_Impl());
        arrayList.add(new androidx.work.impl.WorkDatabase_AutoMigration_17_18_Impl());
        arrayList.add(new androidx.work.impl.WorkDatabase_AutoMigration_18_19_Impl());
        arrayList.add(new androidx.work.impl.WorkDatabase_AutoMigration_19_20_Impl());
        arrayList.add(new androidx.work.impl.WorkDatabase_AutoMigration_20_21_Impl());
        arrayList.add(new androidx.work.impl.WorkDatabase_AutoMigration_22_23_Impl());
        arrayList.add(new androidx.work.impl.WorkDatabase_AutoMigration_23_24_Impl());
        return arrayList;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final androidx.work.impl.model.WorkSpecDao workSpecDao() {
        return this.Camera2StreamConfigurationMap.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final androidx.work.impl.model.DependencyDao dependencyDao() {
        return this.getHighSpeedVideoSizes.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final androidx.work.impl.model.WorkTagDao workTagDao() {
        return this.getHighSpeedVideoFpsRanges.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final androidx.work.impl.model.SystemIdInfoDao systemIdInfoDao() {
        return this.getHighSpeedVideoFpsRangesFor.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final androidx.work.impl.model.WorkNameDao workNameDao() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final androidx.work.impl.model.WorkProgressDao workProgressDao() {
        return this.getHighSpeedVideoSizesFor.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final androidx.work.impl.model.PreferenceDao preferenceDao() {
        return this.getInputSizeshNQ4ISI.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final androidx.work.impl.model.RawWorkInfoDao rawWorkInfoDao() {
        return this.getInputFormats.getValue();
    }

    public static /* synthetic */ androidx.work.impl.model.WorkTagDao_Impl $r8$lambda$232E_xBZ836NRYMgTAYNO5qULN0(androidx.work.impl.WorkDatabase_Impl workDatabase_Impl) {
        return new androidx.work.impl.model.WorkTagDao_Impl(workDatabase_Impl);
    }

    /* renamed from: $r8$lambda$9rVe6bMn1RRzNP-xGG5NcgNi1Xs, reason: not valid java name */
    public static /* synthetic */ androidx.work.impl.model.WorkNameDao_Impl m9470$r8$lambda$9rVe6bMn1RRzNPxGG5NcgNi1Xs(androidx.work.impl.WorkDatabase_Impl workDatabase_Impl) {
        return new androidx.work.impl.model.WorkNameDao_Impl(workDatabase_Impl);
    }

    public static /* synthetic */ androidx.work.impl.model.WorkSpecDao_Impl $r8$lambda$EBCBMQRVkN1sQSZgY0tCFd1jjgA(androidx.work.impl.WorkDatabase_Impl workDatabase_Impl) {
        return new androidx.work.impl.model.WorkSpecDao_Impl(workDatabase_Impl);
    }

    /* renamed from: $r8$lambda$Q4e7dMsbchyXlG7si6nJ2S-X0Hg, reason: not valid java name */
    public static /* synthetic */ androidx.work.impl.model.PreferenceDao_Impl m9471$r8$lambda$Q4e7dMsbchyXlG7si6nJ2SX0Hg(androidx.work.impl.WorkDatabase_Impl workDatabase_Impl) {
        return new androidx.work.impl.model.PreferenceDao_Impl(workDatabase_Impl);
    }

    /* renamed from: $r8$lambda$UR3dJSsh-z5ZBBq2DPAP4EXV70s, reason: not valid java name */
    public static /* synthetic */ androidx.work.impl.model.DependencyDao_Impl m9472$r8$lambda$UR3dJSshz5ZBBq2DPAP4EXV70s(androidx.work.impl.WorkDatabase_Impl workDatabase_Impl) {
        return new androidx.work.impl.model.DependencyDao_Impl(workDatabase_Impl);
    }

    public static /* synthetic */ androidx.work.impl.model.SystemIdInfoDao_Impl $r8$lambda$VD7PkCdHr0pD6cL8vVPjuCZZsCo(androidx.work.impl.WorkDatabase_Impl workDatabase_Impl) {
        return new androidx.work.impl.model.SystemIdInfoDao_Impl(workDatabase_Impl);
    }

    public static /* synthetic */ androidx.work.impl.model.WorkProgressDao_Impl $r8$lambda$YXFG2V7GSqY1Fh14uyLBpxHvsJg(androidx.work.impl.WorkDatabase_Impl workDatabase_Impl) {
        return new androidx.work.impl.model.WorkProgressDao_Impl(workDatabase_Impl);
    }

    public static /* synthetic */ androidx.work.impl.model.RawWorkInfoDao_Impl $r8$lambda$nTzsr7UbqjB1fFswZZ1aP5SIdIc(androidx.work.impl.WorkDatabase_Impl workDatabase_Impl) {
        return new androidx.work.impl.model.RawWorkInfoDao_Impl(workDatabase_Impl);
    }
}

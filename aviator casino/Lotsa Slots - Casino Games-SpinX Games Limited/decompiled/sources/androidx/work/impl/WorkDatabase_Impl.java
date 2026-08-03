package androidx.work.impl;

/* loaded from: classes2.dex */
public final class WorkDatabase_Impl extends androidx.work.impl.WorkDatabase {
    private volatile androidx.work.impl.model.DependencyDao _dependencyDao;
    private volatile androidx.work.impl.model.PreferenceDao _preferenceDao;
    private volatile androidx.work.impl.model.RawWorkInfoDao _rawWorkInfoDao;
    private volatile androidx.work.impl.model.SystemIdInfoDao _systemIdInfoDao;
    private volatile androidx.work.impl.model.WorkNameDao _workNameDao;
    private volatile androidx.work.impl.model.WorkProgressDao _workProgressDao;
    private volatile androidx.work.impl.model.WorkSpecDao _workSpecDao;
    private volatile androidx.work.impl.model.WorkTagDao _workTagDao;

    @Override // androidx.room.RoomDatabase
    protected androidx.sqlite.db.SupportSQLiteOpenHelper createOpenHelper(androidx.room.DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new androidx.room.RoomOpenHelper(configuration, new androidx.room.RoomOpenHelper.Delegate(16) { // from class: androidx.work.impl.WorkDatabase_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(androidx.sqlite.db.SupportSQLiteDatabase _db) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(androidx.sqlite.db.SupportSQLiteDatabase _db) {
                _db.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                _db.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                _db.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                _db.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                _db.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                _db.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                _db.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                _db.execSQL(androidx.work.impl.utils.PreferenceUtils.CREATE_PREFERENCE);
                _db.execSQL(androidx.room.RoomMasterTable.CREATE_QUERY);
                _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(androidx.sqlite.db.SupportSQLiteDatabase _db) {
                _db.execSQL("DROP TABLE IF EXISTS `Dependency`");
                _db.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
                _db.execSQL("DROP TABLE IF EXISTS `WorkTag`");
                _db.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
                _db.execSQL("DROP TABLE IF EXISTS `WorkName`");
                _db.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
                _db.execSQL("DROP TABLE IF EXISTS `Preference`");
                if (androidx.work.impl.WorkDatabase_Impl.this.mCallbacks != null) {
                    int size = androidx.work.impl.WorkDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((androidx.room.RoomDatabase.Callback) androidx.work.impl.WorkDatabase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(androidx.sqlite.db.SupportSQLiteDatabase _db) {
                if (androidx.work.impl.WorkDatabase_Impl.this.mCallbacks != null) {
                    int size = androidx.work.impl.WorkDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((androidx.room.RoomDatabase.Callback) androidx.work.impl.WorkDatabase_Impl.this.mCallbacks.get(i)).onCreate(_db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(androidx.sqlite.db.SupportSQLiteDatabase _db) {
                androidx.work.impl.WorkDatabase_Impl.this.mDatabase = _db;
                _db.execSQL("PRAGMA foreign_keys = ON");
                androidx.work.impl.WorkDatabase_Impl.this.internalInitInvalidationTracker(_db);
                if (androidx.work.impl.WorkDatabase_Impl.this.mCallbacks != null) {
                    int size = androidx.work.impl.WorkDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((androidx.room.RoomDatabase.Callback) androidx.work.impl.WorkDatabase_Impl.this.mCallbacks.get(i)).onOpen(_db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(androidx.sqlite.db.SupportSQLiteDatabase _db) {
                androidx.room.util.DBUtil.dropFtsSyncTriggers(_db);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public androidx.room.RoomOpenHelper.ValidationResult onValidateSchema(androidx.sqlite.db.SupportSQLiteDatabase _db) {
                java.util.HashMap hashMap = new java.util.HashMap(2);
                hashMap.put("work_spec_id", new androidx.room.util.TableInfo.Column("work_spec_id", "TEXT", true, 1, null, 1));
                hashMap.put("prerequisite_id", new androidx.room.util.TableInfo.Column("prerequisite_id", "TEXT", true, 2, null, 1));
                java.util.HashSet hashSet = new java.util.HashSet(2);
                hashSet.add(new androidx.room.util.TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", java.util.Arrays.asList("work_spec_id"), java.util.Arrays.asList("id")));
                hashSet.add(new androidx.room.util.TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", java.util.Arrays.asList("prerequisite_id"), java.util.Arrays.asList("id")));
                java.util.HashSet hashSet2 = new java.util.HashSet(2);
                hashSet2.add(new androidx.room.util.TableInfo.Index("index_Dependency_work_spec_id", false, java.util.Arrays.asList("work_spec_id"), java.util.Arrays.asList("ASC")));
                hashSet2.add(new androidx.room.util.TableInfo.Index("index_Dependency_prerequisite_id", false, java.util.Arrays.asList("prerequisite_id"), java.util.Arrays.asList("ASC")));
                androidx.room.util.TableInfo tableInfo = new androidx.room.util.TableInfo("Dependency", hashMap, hashSet, hashSet2);
                androidx.room.util.TableInfo read = androidx.room.util.TableInfo.read(_db, "Dependency");
                if (!tableInfo.equals(read)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
                java.util.HashMap hashMap2 = new java.util.HashMap(27);
                hashMap2.put("id", new androidx.room.util.TableInfo.Column("id", "TEXT", true, 1, null, 1));
                hashMap2.put("state", new androidx.room.util.TableInfo.Column("state", "INTEGER", true, 0, null, 1));
                hashMap2.put("worker_class_name", new androidx.room.util.TableInfo.Column("worker_class_name", "TEXT", true, 0, null, 1));
                hashMap2.put("input_merger_class_name", new androidx.room.util.TableInfo.Column("input_merger_class_name", "TEXT", false, 0, null, 1));
                hashMap2.put("input", new androidx.room.util.TableInfo.Column("input", "BLOB", true, 0, null, 1));
                hashMap2.put("output", new androidx.room.util.TableInfo.Column("output", "BLOB", true, 0, null, 1));
                hashMap2.put("initial_delay", new androidx.room.util.TableInfo.Column("initial_delay", "INTEGER", true, 0, null, 1));
                hashMap2.put("interval_duration", new androidx.room.util.TableInfo.Column("interval_duration", "INTEGER", true, 0, null, 1));
                hashMap2.put("flex_duration", new androidx.room.util.TableInfo.Column("flex_duration", "INTEGER", true, 0, null, 1));
                hashMap2.put("run_attempt_count", new androidx.room.util.TableInfo.Column("run_attempt_count", "INTEGER", true, 0, null, 1));
                hashMap2.put("backoff_policy", new androidx.room.util.TableInfo.Column("backoff_policy", "INTEGER", true, 0, null, 1));
                hashMap2.put("backoff_delay_duration", new androidx.room.util.TableInfo.Column("backoff_delay_duration", "INTEGER", true, 0, null, 1));
                hashMap2.put("last_enqueue_time", new androidx.room.util.TableInfo.Column("last_enqueue_time", "INTEGER", true, 0, null, 1));
                hashMap2.put("minimum_retention_duration", new androidx.room.util.TableInfo.Column("minimum_retention_duration", "INTEGER", true, 0, null, 1));
                hashMap2.put("schedule_requested_at", new androidx.room.util.TableInfo.Column("schedule_requested_at", "INTEGER", true, 0, null, 1));
                hashMap2.put("run_in_foreground", new androidx.room.util.TableInfo.Column("run_in_foreground", "INTEGER", true, 0, null, 1));
                hashMap2.put("out_of_quota_policy", new androidx.room.util.TableInfo.Column("out_of_quota_policy", "INTEGER", true, 0, null, 1));
                hashMap2.put("period_count", new androidx.room.util.TableInfo.Column("period_count", "INTEGER", true, 0, "0", 1));
                hashMap2.put("generation", new androidx.room.util.TableInfo.Column("generation", "INTEGER", true, 0, "0", 1));
                hashMap2.put("required_network_type", new androidx.room.util.TableInfo.Column("required_network_type", "INTEGER", true, 0, null, 1));
                hashMap2.put("requires_charging", new androidx.room.util.TableInfo.Column("requires_charging", "INTEGER", true, 0, null, 1));
                hashMap2.put("requires_device_idle", new androidx.room.util.TableInfo.Column("requires_device_idle", "INTEGER", true, 0, null, 1));
                hashMap2.put("requires_battery_not_low", new androidx.room.util.TableInfo.Column("requires_battery_not_low", "INTEGER", true, 0, null, 1));
                hashMap2.put("requires_storage_not_low", new androidx.room.util.TableInfo.Column("requires_storage_not_low", "INTEGER", true, 0, null, 1));
                hashMap2.put("trigger_content_update_delay", new androidx.room.util.TableInfo.Column("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
                hashMap2.put("trigger_max_content_delay", new androidx.room.util.TableInfo.Column("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
                hashMap2.put("content_uri_triggers", new androidx.room.util.TableInfo.Column("content_uri_triggers", "BLOB", true, 0, null, 1));
                java.util.HashSet hashSet3 = new java.util.HashSet(0);
                java.util.HashSet hashSet4 = new java.util.HashSet(2);
                hashSet4.add(new androidx.room.util.TableInfo.Index("index_WorkSpec_schedule_requested_at", false, java.util.Arrays.asList("schedule_requested_at"), java.util.Arrays.asList("ASC")));
                hashSet4.add(new androidx.room.util.TableInfo.Index("index_WorkSpec_last_enqueue_time", false, java.util.Arrays.asList("last_enqueue_time"), java.util.Arrays.asList("ASC")));
                androidx.room.util.TableInfo tableInfo2 = new androidx.room.util.TableInfo("WorkSpec", hashMap2, hashSet3, hashSet4);
                androidx.room.util.TableInfo read2 = androidx.room.util.TableInfo.read(_db, "WorkSpec");
                if (!tableInfo2.equals(read2)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
                }
                java.util.HashMap hashMap3 = new java.util.HashMap(2);
                hashMap3.put(com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, new androidx.room.util.TableInfo.Column(com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "TEXT", true, 1, null, 1));
                hashMap3.put("work_spec_id", new androidx.room.util.TableInfo.Column("work_spec_id", "TEXT", true, 2, null, 1));
                java.util.HashSet hashSet5 = new java.util.HashSet(1);
                hashSet5.add(new androidx.room.util.TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", java.util.Arrays.asList("work_spec_id"), java.util.Arrays.asList("id")));
                java.util.HashSet hashSet6 = new java.util.HashSet(1);
                hashSet6.add(new androidx.room.util.TableInfo.Index("index_WorkTag_work_spec_id", false, java.util.Arrays.asList("work_spec_id"), java.util.Arrays.asList("ASC")));
                androidx.room.util.TableInfo tableInfo3 = new androidx.room.util.TableInfo("WorkTag", hashMap3, hashSet5, hashSet6);
                androidx.room.util.TableInfo read3 = androidx.room.util.TableInfo.read(_db, "WorkTag");
                if (!tableInfo3.equals(read3)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + tableInfo3 + "\n Found:\n" + read3);
                }
                java.util.HashMap hashMap4 = new java.util.HashMap(3);
                hashMap4.put("work_spec_id", new androidx.room.util.TableInfo.Column("work_spec_id", "TEXT", true, 1, null, 1));
                hashMap4.put("generation", new androidx.room.util.TableInfo.Column("generation", "INTEGER", true, 2, "0", 1));
                hashMap4.put("system_id", new androidx.room.util.TableInfo.Column("system_id", "INTEGER", true, 0, null, 1));
                java.util.HashSet hashSet7 = new java.util.HashSet(1);
                hashSet7.add(new androidx.room.util.TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", java.util.Arrays.asList("work_spec_id"), java.util.Arrays.asList("id")));
                androidx.room.util.TableInfo tableInfo4 = new androidx.room.util.TableInfo("SystemIdInfo", hashMap4, hashSet7, new java.util.HashSet(0));
                androidx.room.util.TableInfo read4 = androidx.room.util.TableInfo.read(_db, "SystemIdInfo");
                if (!tableInfo4.equals(read4)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + tableInfo4 + "\n Found:\n" + read4);
                }
                java.util.HashMap hashMap5 = new java.util.HashMap(2);
                hashMap5.put("name", new androidx.room.util.TableInfo.Column("name", "TEXT", true, 1, null, 1));
                hashMap5.put("work_spec_id", new androidx.room.util.TableInfo.Column("work_spec_id", "TEXT", true, 2, null, 1));
                java.util.HashSet hashSet8 = new java.util.HashSet(1);
                hashSet8.add(new androidx.room.util.TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", java.util.Arrays.asList("work_spec_id"), java.util.Arrays.asList("id")));
                java.util.HashSet hashSet9 = new java.util.HashSet(1);
                hashSet9.add(new androidx.room.util.TableInfo.Index("index_WorkName_work_spec_id", false, java.util.Arrays.asList("work_spec_id"), java.util.Arrays.asList("ASC")));
                androidx.room.util.TableInfo tableInfo5 = new androidx.room.util.TableInfo("WorkName", hashMap5, hashSet8, hashSet9);
                androidx.room.util.TableInfo read5 = androidx.room.util.TableInfo.read(_db, "WorkName");
                if (!tableInfo5.equals(read5)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + tableInfo5 + "\n Found:\n" + read5);
                }
                java.util.HashMap hashMap6 = new java.util.HashMap(2);
                hashMap6.put("work_spec_id", new androidx.room.util.TableInfo.Column("work_spec_id", "TEXT", true, 1, null, 1));
                hashMap6.put(androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, new androidx.room.util.TableInfo.Column(androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, "BLOB", true, 0, null, 1));
                java.util.HashSet hashSet10 = new java.util.HashSet(1);
                hashSet10.add(new androidx.room.util.TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", java.util.Arrays.asList("work_spec_id"), java.util.Arrays.asList("id")));
                androidx.room.util.TableInfo tableInfo6 = new androidx.room.util.TableInfo("WorkProgress", hashMap6, hashSet10, new java.util.HashSet(0));
                androidx.room.util.TableInfo read6 = androidx.room.util.TableInfo.read(_db, "WorkProgress");
                if (!tableInfo6.equals(read6)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + tableInfo6 + "\n Found:\n" + read6);
                }
                java.util.HashMap hashMap7 = new java.util.HashMap(2);
                hashMap7.put(com.ironsource.X3.i.W, new androidx.room.util.TableInfo.Column(com.ironsource.X3.i.W, "TEXT", true, 1, null, 1));
                hashMap7.put("long_value", new androidx.room.util.TableInfo.Column("long_value", "INTEGER", false, 0, null, 1));
                androidx.room.util.TableInfo tableInfo7 = new androidx.room.util.TableInfo("Preference", hashMap7, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read7 = androidx.room.util.TableInfo.read(_db, "Preference");
                if (!tableInfo7.equals(read7)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + tableInfo7 + "\n Found:\n" + read7);
                }
                return new androidx.room.RoomOpenHelper.ValidationResult(true, null);
            }
        }, "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e")).build());
    }

    @Override // androidx.room.RoomDatabase
    protected androidx.room.InvalidationTracker createInvalidationTracker() {
        return new androidx.room.InvalidationTracker(this, new java.util.HashMap(0), new java.util.HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        androidx.sqlite.db.SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("PRAGMA defer_foreign_keys = TRUE");
            writableDatabase.execSQL("DELETE FROM `Dependency`");
            writableDatabase.execSQL("DELETE FROM `WorkSpec`");
            writableDatabase.execSQL("DELETE FROM `WorkTag`");
            writableDatabase.execSQL("DELETE FROM `SystemIdInfo`");
            writableDatabase.execSQL("DELETE FROM `WorkName`");
            writableDatabase.execSQL("DELETE FROM `WorkProgress`");
            writableDatabase.execSQL("DELETE FROM `Preference`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    protected java.util.Map<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> getRequiredTypeConverters() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(androidx.work.impl.model.WorkSpecDao.class, androidx.work.impl.model.WorkSpecDao_Impl.getRequiredConverters());
        hashMap.put(androidx.work.impl.model.DependencyDao.class, androidx.work.impl.model.DependencyDao_Impl.getRequiredConverters());
        hashMap.put(androidx.work.impl.model.WorkTagDao.class, androidx.work.impl.model.WorkTagDao_Impl.getRequiredConverters());
        hashMap.put(androidx.work.impl.model.SystemIdInfoDao.class, androidx.work.impl.model.SystemIdInfoDao_Impl.getRequiredConverters());
        hashMap.put(androidx.work.impl.model.WorkNameDao.class, androidx.work.impl.model.WorkNameDao_Impl.getRequiredConverters());
        hashMap.put(androidx.work.impl.model.WorkProgressDao.class, androidx.work.impl.model.WorkProgressDao_Impl.getRequiredConverters());
        hashMap.put(androidx.work.impl.model.PreferenceDao.class, androidx.work.impl.model.PreferenceDao_Impl.getRequiredConverters());
        hashMap.put(androidx.work.impl.model.RawWorkInfoDao.class, androidx.work.impl.model.RawWorkInfoDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // androidx.room.RoomDatabase
    public java.util.Set<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new java.util.HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public java.util.List<androidx.room.migration.Migration> getAutoMigrations(java.util.Map<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>, androidx.room.migration.AutoMigrationSpec> autoMigrationSpecsMap) {
        return java.util.Arrays.asList(new androidx.work.impl.WorkDatabase_AutoMigration_13_14_Impl(), new androidx.work.impl.WorkDatabase_AutoMigration_14_15_Impl());
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.WorkSpecDao workSpecDao() {
        androidx.work.impl.model.WorkSpecDao workSpecDao;
        if (this._workSpecDao != null) {
            return this._workSpecDao;
        }
        synchronized (this) {
            if (this._workSpecDao == null) {
                this._workSpecDao = new androidx.work.impl.model.WorkSpecDao_Impl(this);
            }
            workSpecDao = this._workSpecDao;
        }
        return workSpecDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.DependencyDao dependencyDao() {
        androidx.work.impl.model.DependencyDao dependencyDao;
        if (this._dependencyDao != null) {
            return this._dependencyDao;
        }
        synchronized (this) {
            if (this._dependencyDao == null) {
                this._dependencyDao = new androidx.work.impl.model.DependencyDao_Impl(this);
            }
            dependencyDao = this._dependencyDao;
        }
        return dependencyDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.WorkTagDao workTagDao() {
        androidx.work.impl.model.WorkTagDao workTagDao;
        if (this._workTagDao != null) {
            return this._workTagDao;
        }
        synchronized (this) {
            if (this._workTagDao == null) {
                this._workTagDao = new androidx.work.impl.model.WorkTagDao_Impl(this);
            }
            workTagDao = this._workTagDao;
        }
        return workTagDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.SystemIdInfoDao systemIdInfoDao() {
        androidx.work.impl.model.SystemIdInfoDao systemIdInfoDao;
        if (this._systemIdInfoDao != null) {
            return this._systemIdInfoDao;
        }
        synchronized (this) {
            if (this._systemIdInfoDao == null) {
                this._systemIdInfoDao = new androidx.work.impl.model.SystemIdInfoDao_Impl(this);
            }
            systemIdInfoDao = this._systemIdInfoDao;
        }
        return systemIdInfoDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.WorkNameDao workNameDao() {
        androidx.work.impl.model.WorkNameDao workNameDao;
        if (this._workNameDao != null) {
            return this._workNameDao;
        }
        synchronized (this) {
            if (this._workNameDao == null) {
                this._workNameDao = new androidx.work.impl.model.WorkNameDao_Impl(this);
            }
            workNameDao = this._workNameDao;
        }
        return workNameDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.WorkProgressDao workProgressDao() {
        androidx.work.impl.model.WorkProgressDao workProgressDao;
        if (this._workProgressDao != null) {
            return this._workProgressDao;
        }
        synchronized (this) {
            if (this._workProgressDao == null) {
                this._workProgressDao = new androidx.work.impl.model.WorkProgressDao_Impl(this);
            }
            workProgressDao = this._workProgressDao;
        }
        return workProgressDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.PreferenceDao preferenceDao() {
        androidx.work.impl.model.PreferenceDao preferenceDao;
        if (this._preferenceDao != null) {
            return this._preferenceDao;
        }
        synchronized (this) {
            if (this._preferenceDao == null) {
                this._preferenceDao = new androidx.work.impl.model.PreferenceDao_Impl(this);
            }
            preferenceDao = this._preferenceDao;
        }
        return preferenceDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.RawWorkInfoDao rawWorkInfoDao() {
        androidx.work.impl.model.RawWorkInfoDao rawWorkInfoDao;
        if (this._rawWorkInfoDao != null) {
            return this._rawWorkInfoDao;
        }
        synchronized (this) {
            if (this._rawWorkInfoDao == null) {
                this._rawWorkInfoDao = new androidx.work.impl.model.RawWorkInfoDao_Impl(this);
            }
            rawWorkInfoDao = this._rawWorkInfoDao;
        }
        return rawWorkInfoDao;
    }
}

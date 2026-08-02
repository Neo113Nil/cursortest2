package my.com.softspace.auditlog.internal;

/* loaded from: classes17.dex */
public final class AuditLogDatabase_Impl extends my.com.softspace.auditlog.internal.AuditLogDatabase {
    private volatile my.com.softspace.auditlog.internal.dao.AttestTransactionDAO getHighResolutionOutputSizeshNQ4ISI;
    private volatile my.com.softspace.auditlog.internal.dao.LogEntryDAO getHighSpeedVideoFpsRangesFor;

    @Override // androidx.room.RoomDatabase
    public final androidx.database.db.SupportSQLiteOpenHelper createOpenHelper(androidx.room.DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new androidx.room.RoomOpenHelper(databaseConfiguration, new androidx.room.RoomOpenHelper.Delegate() { // from class: my.com.softspace.auditlog.internal.AuditLogDatabase_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `log_entries` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `date_time` INTEGER, `attestID` TEXT, `user_uuid` TEXT, `event` TEXT, `status` INTEGER, `origination` INTEGER, `log` TEXT, `throwable` TEXT)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `attest_transaction` (`attest_id` INTEGER NOT NULL, `ksn` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`attest_id`, `ksn`, `timestamp`))");
                supportSQLiteDatabase.execSQL(androidx.room.RoomMasterTable.CREATE_QUERY);
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '73e641f51d38f8be05fdaeca9ffdbb45')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `log_entries`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `attest_transaction`");
                if (my.com.softspace.auditlog.internal.AuditLogDatabase_Impl.this.mCallbacks != null) {
                    int size = my.com.softspace.auditlog.internal.AuditLogDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((androidx.room.RoomDatabase.Callback) my.com.softspace.auditlog.internal.AuditLogDatabase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
                if (my.com.softspace.auditlog.internal.AuditLogDatabase_Impl.this.mCallbacks != null) {
                    int size = my.com.softspace.auditlog.internal.AuditLogDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((androidx.room.RoomDatabase.Callback) my.com.softspace.auditlog.internal.AuditLogDatabase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
                my.com.softspace.auditlog.internal.AuditLogDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
                my.com.softspace.auditlog.internal.AuditLogDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (my.com.softspace.auditlog.internal.AuditLogDatabase_Impl.this.mCallbacks != null) {
                    int size = my.com.softspace.auditlog.internal.AuditLogDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((androidx.room.RoomDatabase.Callback) my.com.softspace.auditlog.internal.AuditLogDatabase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
                androidx.room.util.DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public androidx.room.RoomOpenHelper.ValidationResult onValidateSchema(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
                java.util.HashMap hashMap = new java.util.HashMap(9);
                hashMap.put("id", new androidx.room.util.TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap.put("date_time", new androidx.room.util.TableInfo.Column("date_time", "INTEGER", false, 0, null, 1));
                hashMap.put("attestID", new androidx.room.util.TableInfo.Column("attestID", "TEXT", false, 0, null, 1));
                hashMap.put("user_uuid", new androidx.room.util.TableInfo.Column("user_uuid", "TEXT", false, 0, null, 1));
                hashMap.put("event", new androidx.room.util.TableInfo.Column("event", "TEXT", false, 0, null, 1));
                hashMap.put("status", new androidx.room.util.TableInfo.Column("status", "INTEGER", false, 0, null, 1));
                hashMap.put("origination", new androidx.room.util.TableInfo.Column("origination", "INTEGER", false, 0, null, 1));
                hashMap.put("log", new androidx.room.util.TableInfo.Column("log", "TEXT", false, 0, null, 1));
                hashMap.put(com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, new androidx.room.util.TableInfo.Column(com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "TEXT", false, 0, null, 1));
                androidx.room.util.TableInfo tableInfo = new androidx.room.util.TableInfo("log_entries", hashMap, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read = androidx.room.util.TableInfo.read(supportSQLiteDatabase, "log_entries");
                if (!tableInfo.equals(read)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("log_entries(my.com.softspace.auditlog.internal.dto.LogEntry).\n Expected:\n");
                    sb.append(tableInfo);
                    sb.append("\n Found:\n");
                    sb.append(read);
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, sb.toString());
                }
                java.util.HashMap hashMap2 = new java.util.HashMap(3);
                hashMap2.put("attest_id", new androidx.room.util.TableInfo.Column("attest_id", "INTEGER", true, 1, null, 1));
                hashMap2.put("ksn", new androidx.room.util.TableInfo.Column("ksn", "TEXT", true, 2, null, 1));
                hashMap2.put("timestamp", new androidx.room.util.TableInfo.Column("timestamp", "INTEGER", true, 3, null, 1));
                androidx.room.util.TableInfo tableInfo2 = new androidx.room.util.TableInfo("attest_transaction", hashMap2, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read2 = androidx.room.util.TableInfo.read(supportSQLiteDatabase, "attest_transaction");
                if (!tableInfo2.equals(read2)) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("attest_transaction(my.com.softspace.auditlog.internal.dto.AttestTransactionEntry).\n Expected:\n");
                    sb2.append(tableInfo2);
                    sb2.append("\n Found:\n");
                    sb2.append(read2);
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, sb2.toString());
                }
                return new androidx.room.RoomOpenHelper.ValidationResult(true, null);
            }
        }, "73e641f51d38f8be05fdaeca9ffdbb45", "90b3f06c374f3b274f37be146260cfd4")).build());
    }

    @Override // androidx.room.RoomDatabase
    public final androidx.room.InvalidationTracker createInvalidationTracker() {
        return new androidx.room.InvalidationTracker(this, new java.util.HashMap(0), new java.util.HashMap(0), "log_entries", "attest_transaction");
    }

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        super.assertNotMainThread();
        androidx.database.db.SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `log_entries`");
            writableDatabase.execSQL("DELETE FROM `attest_transaction`");
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
    public final java.util.Map<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> getRequiredTypeConverters() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(my.com.softspace.auditlog.internal.dao.LogEntryDAO.class, my.com.softspace.auditlog.internal.dao.LogEntryDAO_Impl.getRequiredConverters());
        hashMap.put(my.com.softspace.auditlog.internal.dao.AttestTransactionDAO.class, my.com.softspace.auditlog.internal.dao.AttestTransactionDAO_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // androidx.room.RoomDatabase
    public final java.util.Set<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new java.util.HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final java.util.List<androidx.room.migration.Migration> getAutoMigrations(java.util.Map<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>, androidx.room.migration.AutoMigrationSpec> map) {
        return java.util.Arrays.asList(new androidx.room.migration.Migration[0]);
    }

    @Override // my.com.softspace.auditlog.internal.AuditLogDatabase
    public final my.com.softspace.auditlog.internal.dao.LogEntryDAO logEntryDAO() {
        my.com.softspace.auditlog.internal.dao.LogEntryDAO logEntryDAO;
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return this.getHighSpeedVideoFpsRangesFor;
        }
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                this.getHighSpeedVideoFpsRangesFor = new my.com.softspace.auditlog.internal.dao.LogEntryDAO_Impl(this);
            }
            logEntryDAO = this.getHighSpeedVideoFpsRangesFor;
        }
        return logEntryDAO;
    }

    @Override // my.com.softspace.auditlog.internal.AuditLogDatabase
    public final my.com.softspace.auditlog.internal.dao.AttestTransactionDAO attestTransactionDAO() {
        my.com.softspace.auditlog.internal.dao.AttestTransactionDAO attestTransactionDAO;
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
        synchronized (this) {
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = new my.com.softspace.auditlog.internal.dao.AttestTransactionDAO_Impl(this);
            }
            attestTransactionDAO = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return attestTransactionDAO;
    }
}

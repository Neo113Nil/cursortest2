package com.moloco.sdk.acm.db;

/* loaded from: classes5.dex */
public final class MetricsDb_Impl extends com.moloco.sdk.acm.db.MetricsDb {
    public volatile com.moloco.sdk.acm.db.d d;

    public class a extends androidx.room.RoomOpenHelper.Delegate {
        public a(int version) {
            super(version);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(androidx.sqlite.db.SupportSQLiteDatabase _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `eventType` TEXT NOT NULL, `data` INTEGER, `tags` TEXT NOT NULL)");
            _db.execSQL(androidx.room.RoomMasterTable.CREATE_QUERY);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b1f78eccdc6d7153084e9120766fe56b')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(androidx.sqlite.db.SupportSQLiteDatabase _db) {
            _db.execSQL("DROP TABLE IF EXISTS `events`");
            if (((androidx.room.RoomDatabase) com.moloco.sdk.acm.db.MetricsDb_Impl.this).mCallbacks != null) {
                int size = ((androidx.room.RoomDatabase) com.moloco.sdk.acm.db.MetricsDb_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((androidx.room.RoomDatabase.Callback) ((androidx.room.RoomDatabase) com.moloco.sdk.acm.db.MetricsDb_Impl.this).mCallbacks.get(i)).onDestructiveMigration(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(androidx.sqlite.db.SupportSQLiteDatabase _db) {
            if (((androidx.room.RoomDatabase) com.moloco.sdk.acm.db.MetricsDb_Impl.this).mCallbacks != null) {
                int size = ((androidx.room.RoomDatabase) com.moloco.sdk.acm.db.MetricsDb_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((androidx.room.RoomDatabase.Callback) ((androidx.room.RoomDatabase) com.moloco.sdk.acm.db.MetricsDb_Impl.this).mCallbacks.get(i)).onCreate(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(androidx.sqlite.db.SupportSQLiteDatabase _db) {
            ((androidx.room.RoomDatabase) com.moloco.sdk.acm.db.MetricsDb_Impl.this).mDatabase = _db;
            com.moloco.sdk.acm.db.MetricsDb_Impl.this.internalInitInvalidationTracker(_db);
            if (((androidx.room.RoomDatabase) com.moloco.sdk.acm.db.MetricsDb_Impl.this).mCallbacks != null) {
                int size = ((androidx.room.RoomDatabase) com.moloco.sdk.acm.db.MetricsDb_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((androidx.room.RoomDatabase.Callback) ((androidx.room.RoomDatabase) com.moloco.sdk.acm.db.MetricsDb_Impl.this).mCallbacks.get(i)).onOpen(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPostMigrate(androidx.sqlite.db.SupportSQLiteDatabase _db) {
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPreMigrate(androidx.sqlite.db.SupportSQLiteDatabase _db) {
            androidx.room.util.DBUtil.dropFtsSyncTriggers(_db);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public androidx.room.RoomOpenHelper.ValidationResult onValidateSchema(androidx.sqlite.db.SupportSQLiteDatabase _db) {
            java.util.HashMap hashMap = new java.util.HashMap(6);
            hashMap.put("id", new androidx.room.util.TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            hashMap.put("name", new androidx.room.util.TableInfo.Column("name", "TEXT", true, 0, null, 1));
            hashMap.put(com.ironsource.C4.a.d, new androidx.room.util.TableInfo.Column(com.ironsource.C4.a.d, "INTEGER", true, 0, null, 1));
            hashMap.put("eventType", new androidx.room.util.TableInfo.Column("eventType", "TEXT", true, 0, null, 1));
            hashMap.put("data", new androidx.room.util.TableInfo.Column("data", "INTEGER", false, 0, null, 1));
            hashMap.put("tags", new androidx.room.util.TableInfo.Column("tags", "TEXT", true, 0, null, 1));
            androidx.room.util.TableInfo tableInfo = new androidx.room.util.TableInfo("events", hashMap, new java.util.HashSet(0), new java.util.HashSet(0));
            androidx.room.util.TableInfo read = androidx.room.util.TableInfo.read(_db, "events");
            if (tableInfo.equals(read)) {
                return new androidx.room.RoomOpenHelper.ValidationResult(true, null);
            }
            return new androidx.room.RoomOpenHelper.ValidationResult(false, "events(com.moloco.sdk.acm.db.EventEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        androidx.sqlite.db.SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `events`");
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
    public androidx.room.InvalidationTracker createInvalidationTracker() {
        return new androidx.room.InvalidationTracker(this, new java.util.HashMap(0), new java.util.HashMap(0), "events");
    }

    @Override // androidx.room.RoomDatabase
    public androidx.sqlite.db.SupportSQLiteOpenHelper createOpenHelper(androidx.room.DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new androidx.room.RoomOpenHelper(configuration, new com.moloco.sdk.acm.db.MetricsDb_Impl.a(1), "b1f78eccdc6d7153084e9120766fe56b", "82d5e07fb1fc98c9c5bfa339c0f04693")).build());
    }

    @Override // androidx.room.RoomDatabase
    public java.util.List<androidx.room.migration.Migration> getAutoMigrations(java.util.Map<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>, androidx.room.migration.AutoMigrationSpec> autoMigrationSpecsMap) {
        return java.util.Arrays.asList(new androidx.room.migration.Migration[0]);
    }

    @Override // androidx.room.RoomDatabase
    public java.util.Set<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new java.util.HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public java.util.Map<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> getRequiredTypeConverters() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.moloco.sdk.acm.db.d.class, com.moloco.sdk.acm.db.e.c());
        return hashMap;
    }

    @Override // com.moloco.sdk.acm.db.MetricsDb
    public com.moloco.sdk.acm.db.d b() {
        com.moloco.sdk.acm.db.d dVar;
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            if (this.d == null) {
                this.d = new com.moloco.sdk.acm.db.e(this);
            }
            dVar = this.d;
        }
        return dVar;
    }
}

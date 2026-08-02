package com.plaid.internal.workflow.persistence.database;

/* loaded from: classes16.dex */
public final class WorkflowDatabase_Impl extends com.plaid.internal.workflow.persistence.database.WorkflowDatabase {

    /* renamed from: a, reason: collision with root package name */
    public volatile com.plaid.internal.H4 f6617a;
    public volatile com.plaid.internal.P3 b;
    public volatile com.plaid.internal.g8 c;

    public final class a extends androidx.room.RoomOpenHelper.Delegate {
        public a() {
            super(3);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public final void createAllTables(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `workflow_pane` (`workflow_id` TEXT NOT NULL, `id` TEXT NOT NULL, `model` BLOB NOT NULL, PRIMARY KEY(`workflow_id`, `id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `workflow_local_key_values` (`pane_id` TEXT NOT NULL, `key` TEXT NOT NULL, `string` TEXT, `byte_array` BLOB, PRIMARY KEY(`pane_id`, `key`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `workflow_analytics` (`workflow_id` TEXT NOT NULL, `id` TEXT NOT NULL, `analytics_model` BLOB NOT NULL, PRIMARY KEY(`workflow_id`, `id`))");
            supportSQLiteDatabase.execSQL(androidx.room.RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bbbb42d6a8058409381c7dda80a54606')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public final void dropAllTables(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `workflow_pane`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `workflow_local_key_values`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `workflow_analytics`");
            java.util.List list = com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl.this.mCallbacks;
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((androidx.room.RoomDatabase.Callback) it.next()).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public final void onCreate(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            java.util.List list = com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl.this.mCallbacks;
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((androidx.room.RoomDatabase.Callback) it.next()).onCreate(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public final void onOpen(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
            com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            java.util.List list = com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl.this.mCallbacks;
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((androidx.room.RoomDatabase.Callback) it.next()).onOpen(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public final void onPostMigrate(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public final void onPreMigrate(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            androidx.room.util.DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public final androidx.room.RoomOpenHelper.ValidationResult onValidateSchema(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            java.util.HashMap hashMap = new java.util.HashMap(3);
            hashMap.put("workflow_id", new androidx.room.util.TableInfo.Column("workflow_id", "TEXT", true, 1, null, 1));
            hashMap.put("id", new androidx.room.util.TableInfo.Column("id", "TEXT", true, 2, null, 1));
            hashMap.put("model", new androidx.room.util.TableInfo.Column("model", "BLOB", true, 0, null, 1));
            androidx.room.util.TableInfo tableInfo = new androidx.room.util.TableInfo("workflow_pane", hashMap, new java.util.HashSet(0), new java.util.HashSet(0));
            androidx.room.util.TableInfo read = androidx.room.util.TableInfo.read(supportSQLiteDatabase, "workflow_pane");
            if (!tableInfo.equals(read)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("workflow_pane(com.plaid.internal.workflow.persistence.database.model.PaneEntity).\n Expected:\n");
                sb.append(tableInfo);
                sb.append("\n Found:\n");
                sb.append(read);
                return new androidx.room.RoomOpenHelper.ValidationResult(false, sb.toString());
            }
            java.util.HashMap hashMap2 = new java.util.HashMap(4);
            hashMap2.put("pane_id", new androidx.room.util.TableInfo.Column("pane_id", "TEXT", true, 1, null, 1));
            hashMap2.put("key", new androidx.room.util.TableInfo.Column("key", "TEXT", true, 2, null, 1));
            hashMap2.put("string", new androidx.room.util.TableInfo.Column("string", "TEXT", false, 0, null, 1));
            hashMap2.put("byte_array", new androidx.room.util.TableInfo.Column("byte_array", "BLOB", false, 0, null, 1));
            androidx.room.util.TableInfo tableInfo2 = new androidx.room.util.TableInfo("workflow_local_key_values", hashMap2, new java.util.HashSet(0), new java.util.HashSet(0));
            androidx.room.util.TableInfo read2 = androidx.room.util.TableInfo.read(supportSQLiteDatabase, "workflow_local_key_values");
            if (!tableInfo2.equals(read2)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("workflow_local_key_values(com.plaid.internal.workflow.persistence.database.model.LocalKeyValuesEntity).\n Expected:\n");
                sb2.append(tableInfo2);
                sb2.append("\n Found:\n");
                sb2.append(read2);
                return new androidx.room.RoomOpenHelper.ValidationResult(false, sb2.toString());
            }
            java.util.HashMap hashMap3 = new java.util.HashMap(3);
            hashMap3.put("workflow_id", new androidx.room.util.TableInfo.Column("workflow_id", "TEXT", true, 1, null, 1));
            hashMap3.put("id", new androidx.room.util.TableInfo.Column("id", "TEXT", true, 2, null, 1));
            hashMap3.put("analytics_model", new androidx.room.util.TableInfo.Column("analytics_model", "BLOB", true, 0, null, 1));
            androidx.room.util.TableInfo tableInfo3 = new androidx.room.util.TableInfo("workflow_analytics", hashMap3, new java.util.HashSet(0), new java.util.HashSet(0));
            androidx.room.util.TableInfo read3 = androidx.room.util.TableInfo.read(supportSQLiteDatabase, "workflow_analytics");
            if (tableInfo3.equals(read3)) {
                return new androidx.room.RoomOpenHelper.ValidationResult(true, null);
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("workflow_analytics(com.plaid.internal.workflow.persistence.database.model.WorkflowAnalyticsEntity).\n Expected:\n");
            sb3.append(tableInfo3);
            sb3.append("\n Found:\n");
            sb3.append(read3);
            return new androidx.room.RoomOpenHelper.ValidationResult(false, sb3.toString());
        }
    }

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        assertNotMainThread();
        androidx.database.db.SupportSQLiteDatabase writableDatabase = getOpenHelper().getWritableDatabase();
        try {
            beginTransaction();
            writableDatabase.execSQL("DELETE FROM `workflow_pane`");
            writableDatabase.execSQL("DELETE FROM `workflow_local_key_values`");
            writableDatabase.execSQL("DELETE FROM `workflow_analytics`");
            setTransactionSuccessful();
        } finally {
            endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    public final androidx.room.InvalidationTracker createInvalidationTracker() {
        return new androidx.room.InvalidationTracker(this, new java.util.HashMap(0), new java.util.HashMap(0), "workflow_pane", "workflow_local_key_values", "workflow_analytics");
    }

    @Override // androidx.room.RoomDatabase
    public final androidx.database.db.SupportSQLiteOpenHelper createOpenHelper(androidx.room.DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new androidx.room.RoomOpenHelper(databaseConfiguration, new com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl.a(), "bbbb42d6a8058409381c7dda80a54606", "b05e367cc67e6caaadf5a14d5c557670")).build());
    }

    @Override // androidx.room.RoomDatabase
    public final java.util.List<androidx.room.migration.Migration> getAutoMigrations(java.util.Map<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>, androidx.room.migration.AutoMigrationSpec> map) {
        return new java.util.ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public final java.util.Set<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new java.util.HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final java.util.Map<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> getRequiredTypeConverters() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.plaid.internal.C4.class, java.util.Collections.emptyList());
        hashMap.put(com.plaid.internal.I3.class, java.util.Collections.emptyList());
        hashMap.put(com.plaid.internal.Y7.class, java.util.Collections.emptyList());
        return hashMap;
    }

    @Override // com.plaid.internal.workflow.persistence.database.WorkflowDatabase
    public final com.plaid.internal.Y7 c() {
        com.plaid.internal.g8 g8Var;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c == null) {
                this.c = new com.plaid.internal.g8(this);
            }
            g8Var = this.c;
        }
        return g8Var;
    }

    @Override // com.plaid.internal.workflow.persistence.database.WorkflowDatabase
    public final com.plaid.internal.I3 a() {
        com.plaid.internal.P3 p3;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new com.plaid.internal.P3(this);
            }
            p3 = this.b;
        }
        return p3;
    }

    @Override // com.plaid.internal.workflow.persistence.database.WorkflowDatabase
    public final com.plaid.internal.C4 b() {
        com.plaid.internal.H4 h4;
        if (this.f6617a != null) {
            return this.f6617a;
        }
        synchronized (this) {
            if (this.f6617a == null) {
                this.f6617a = new com.plaid.internal.H4(this);
            }
            h4 = this.f6617a;
        }
        return h4;
    }
}

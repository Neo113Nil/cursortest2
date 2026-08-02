package com.payair.db;

/* loaded from: classes10.dex */
public final class CSDKDatabase_Impl extends com.payair.db.CSDKDatabase {
    public volatile com.payair.db.transactionhistory.TransactionHistoryEntryDao_Impl b;
    public volatile com.payair.db.settings.DatabaseSettingsDao_Impl c;
    public volatile com.payair.db.token.TokenDetailsDao_Impl d;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        assertNotMainThread();
        androidx.database.db.SupportSQLiteDatabase writableDatabase = getOpenHelper().getWritableDatabase();
        try {
            beginTransaction();
            writableDatabase.execSQL("DELETE FROM `transactionHistory`");
            writableDatabase.execSQL("DELETE FROM `databaseSettings`");
            writableDatabase.execSQL("DELETE FROM `TokenDetails`");
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
        return new androidx.room.InvalidationTracker(this, new java.util.HashMap(0), new java.util.HashMap(0), "transactionHistory", "databaseSettings", "TokenDetails");
    }

    @Override // androidx.room.RoomDatabase
    public final androidx.database.db.SupportSQLiteOpenHelper createOpenHelper(androidx.room.DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new androidx.room.RoomOpenHelper(databaseConfiguration, new com.payair.db.a(this), "5a3bacf003b7bf63430cd5c0eaa941f8", "6758a2e687e7c05a72acba26beca155a")).build());
    }

    @Override // com.payair.db.CSDKDatabase
    public final com.payair.db.settings.DatabaseSettingsDao databaseSettingsDao() {
        com.payair.db.settings.DatabaseSettingsDao_Impl databaseSettingsDao_Impl;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c == null) {
                this.c = new com.payair.db.settings.DatabaseSettingsDao_Impl(this);
            }
            databaseSettingsDao_Impl = this.c;
        }
        return databaseSettingsDao_Impl;
    }

    @Override // androidx.room.RoomDatabase
    public final java.util.List<androidx.room.migration.Migration> getAutoMigrations(java.util.Map<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>, androidx.room.migration.AutoMigrationSpec> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.payair.csdk.c());
        arrayList.add(new com.payair.csdk.d());
        arrayList.add(new com.payair.csdk.e());
        arrayList.add(new com.payair.csdk.f());
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    public final java.util.Set<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new java.util.HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final java.util.Map<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> getRequiredTypeConverters() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.payair.db.transactionhistory.TransactionHistoryEntryDao.class, com.payair.db.transactionhistory.TransactionHistoryEntryDao_Impl.getRequiredConverters());
        hashMap.put(com.payair.db.settings.DatabaseSettingsDao.class, com.payair.db.settings.DatabaseSettingsDao_Impl.getRequiredConverters());
        hashMap.put(com.payair.db.token.TokenDetailsDao.class, com.payair.db.token.TokenDetailsDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // com.payair.db.CSDKDatabase
    public final com.payair.db.token.TokenDetailsDao tokenDetailsDao() {
        com.payair.db.token.TokenDetailsDao_Impl tokenDetailsDao_Impl;
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            if (this.d == null) {
                this.d = new com.payair.db.token.TokenDetailsDao_Impl(this);
            }
            tokenDetailsDao_Impl = this.d;
        }
        return tokenDetailsDao_Impl;
    }

    @Override // com.payair.db.CSDKDatabase
    public final com.payair.db.transactionhistory.TransactionHistoryEntryDao transactionHistoryDao() {
        com.payair.db.transactionhistory.TransactionHistoryEntryDao_Impl transactionHistoryEntryDao_Impl;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new com.payair.db.transactionhistory.TransactionHistoryEntryDao_Impl(this);
            }
            transactionHistoryEntryDao_Impl = this.b;
        }
        return transactionHistoryEntryDao_Impl;
    }
}

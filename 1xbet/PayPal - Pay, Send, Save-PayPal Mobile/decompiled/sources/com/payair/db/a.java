package com.payair.db;

/* loaded from: classes10.dex */
public final class a extends androidx.room.RoomOpenHelper.Delegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.payair.db.CSDKDatabase_Impl f4353a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.payair.db.CSDKDatabase_Impl cSDKDatabase_Impl) {
        super(6);
        this.f4353a = cSDKDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenHelper.Delegate
    public final void createAllTables(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `transactionHistory` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `recordId` TEXT NOT NULL, `transactionId` TEXT, `merchantName` TEXT, `amount` INTEGER NOT NULL, `date` INTEGER NOT NULL, `currencyCode` TEXT NOT NULL, `authorizationStatus` TEXT NOT NULL, `transactionType` TEXT NOT NULL, `networkTokenReference` TEXT NOT NULL, `merchantType` TEXT DEFAULT '', `merchantCity` TEXT DEFAULT '', `transactionCountryCode` TEXT DEFAULT '', `industryCatgCode` TEXT DEFAULT '', `industryCatgName` TEXT DEFAULT '', `industryName` TEXT DEFAULT '')");
        supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_transactionHistory_networkTokenReference` ON `transactionHistory` (`networkTokenReference`)");
        supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_transactionHistory_recordId` ON `transactionHistory` (`recordId`)");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `databaseSettings` (`key` TEXT NOT NULL, `value` TEXT NOT NULL, PRIMARY KEY(`key`))");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `TokenDetails` (`networkTokenReference` TEXT NOT NULL, `tokenStatus` TEXT NOT NULL, `tokenInfo` TEXT NOT NULL, `productConfig` TEXT NOT NULL, `scheme` TEXT NOT NULL DEFAULT 'mastercard', `asset` TEXT, `assetPath` TEXT, PRIMARY KEY(`networkTokenReference`))");
        supportSQLiteDatabase.execSQL(androidx.room.RoomMasterTable.CREATE_QUERY);
        supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5a3bacf003b7bf63430cd5c0eaa941f8')");
    }

    @Override // androidx.room.RoomOpenHelper.Delegate
    public final void dropAllTables(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        java.util.List list;
        supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `transactionHistory`");
        supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `databaseSettings`");
        supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `TokenDetails`");
        list = this.f4353a.mCallbacks;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((androidx.room.RoomDatabase.Callback) it.next()).onDestructiveMigration(supportSQLiteDatabase);
            }
        }
    }

    @Override // androidx.room.RoomOpenHelper.Delegate
    public final void onCreate(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        java.util.List list;
        list = this.f4353a.mCallbacks;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((androidx.room.RoomDatabase.Callback) it.next()).onCreate(supportSQLiteDatabase);
            }
        }
    }

    @Override // androidx.room.RoomOpenHelper.Delegate
    public final void onOpen(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        java.util.List list;
        this.f4353a.mDatabase = supportSQLiteDatabase;
        this.f4353a.internalInitInvalidationTracker(supportSQLiteDatabase);
        list = this.f4353a.mCallbacks;
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
        java.util.HashMap hashMap = new java.util.HashMap(16);
        hashMap.put("id", new androidx.room.util.TableInfo.Column("id", "INTEGER", true, 1, null, 1));
        hashMap.put("recordId", new androidx.room.util.TableInfo.Column("recordId", "TEXT", true, 0, null, 1));
        hashMap.put("transactionId", new androidx.room.util.TableInfo.Column("transactionId", "TEXT", false, 0, null, 1));
        hashMap.put("merchantName", new androidx.room.util.TableInfo.Column("merchantName", "TEXT", false, 0, null, 1));
        hashMap.put("amount", new androidx.room.util.TableInfo.Column("amount", "INTEGER", true, 0, null, 1));
        hashMap.put("date", new androidx.room.util.TableInfo.Column("date", "INTEGER", true, 0, null, 1));
        hashMap.put("currencyCode", new androidx.room.util.TableInfo.Column("currencyCode", "TEXT", true, 0, null, 1));
        hashMap.put("authorizationStatus", new androidx.room.util.TableInfo.Column("authorizationStatus", "TEXT", true, 0, null, 1));
        hashMap.put("transactionType", new androidx.room.util.TableInfo.Column("transactionType", "TEXT", true, 0, null, 1));
        hashMap.put("networkTokenReference", new androidx.room.util.TableInfo.Column("networkTokenReference", "TEXT", true, 0, null, 1));
        hashMap.put("merchantType", new androidx.room.util.TableInfo.Column("merchantType", "TEXT", false, 0, "''", 1));
        hashMap.put("merchantCity", new androidx.room.util.TableInfo.Column("merchantCity", "TEXT", false, 0, "''", 1));
        hashMap.put("transactionCountryCode", new androidx.room.util.TableInfo.Column("transactionCountryCode", "TEXT", false, 0, "''", 1));
        hashMap.put("industryCatgCode", new androidx.room.util.TableInfo.Column("industryCatgCode", "TEXT", false, 0, "''", 1));
        hashMap.put("industryCatgName", new androidx.room.util.TableInfo.Column("industryCatgName", "TEXT", false, 0, "''", 1));
        hashMap.put("industryName", new androidx.room.util.TableInfo.Column("industryName", "TEXT", false, 0, "''", 1));
        java.util.HashSet hashSet = new java.util.HashSet(0);
        java.util.HashSet hashSet2 = new java.util.HashSet(2);
        hashSet2.add(new androidx.room.util.TableInfo.Index("index_transactionHistory_networkTokenReference", false, java.util.Arrays.asList("networkTokenReference"), java.util.Arrays.asList("ASC")));
        hashSet2.add(new androidx.room.util.TableInfo.Index("index_transactionHistory_recordId", true, java.util.Arrays.asList("recordId"), java.util.Arrays.asList("ASC")));
        androidx.room.util.TableInfo tableInfo = new androidx.room.util.TableInfo("transactionHistory", hashMap, hashSet, hashSet2);
        androidx.room.util.TableInfo read = androidx.room.util.TableInfo.read(supportSQLiteDatabase, "transactionHistory");
        if (!tableInfo.equals(read)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("transactionHistory(com.payair.db.transactionhistory.TransactionHistoryEntry).\n Expected:\n");
            sb.append(tableInfo);
            sb.append("\n Found:\n");
            sb.append(read);
            return new androidx.room.RoomOpenHelper.ValidationResult(false, sb.toString());
        }
        java.util.HashMap hashMap2 = new java.util.HashMap(2);
        hashMap2.put("key", new androidx.room.util.TableInfo.Column("key", "TEXT", true, 1, null, 1));
        hashMap2.put(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, new androidx.room.util.TableInfo.Column(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "TEXT", true, 0, null, 1));
        androidx.room.util.TableInfo tableInfo2 = new androidx.room.util.TableInfo("databaseSettings", hashMap2, new java.util.HashSet(0), new java.util.HashSet(0));
        androidx.room.util.TableInfo read2 = androidx.room.util.TableInfo.read(supportSQLiteDatabase, "databaseSettings");
        if (!tableInfo2.equals(read2)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("databaseSettings(com.payair.db.settings.DatabaseSettingsEntry).\n Expected:\n");
            sb2.append(tableInfo2);
            sb2.append("\n Found:\n");
            sb2.append(read2);
            return new androidx.room.RoomOpenHelper.ValidationResult(false, sb2.toString());
        }
        java.util.HashMap hashMap3 = new java.util.HashMap(7);
        hashMap3.put("networkTokenReference", new androidx.room.util.TableInfo.Column("networkTokenReference", "TEXT", true, 1, null, 1));
        hashMap3.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getTokenInfo, new androidx.room.util.TableInfo.Column(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getTokenInfo, "TEXT", true, 0, null, 1));
        hashMap3.put("tokenInfo", new androidx.room.util.TableInfo.Column("tokenInfo", "TEXT", true, 0, null, 1));
        hashMap3.put("productConfig", new androidx.room.util.TableInfo.Column("productConfig", "TEXT", true, 0, null, 1));
        hashMap3.put("scheme", new androidx.room.util.TableInfo.Column("scheme", "TEXT", true, 0, "'mastercard'", 1));
        hashMap3.put(com.payair.db.TokenDetailsDaoInternal.ASSET_FILE_NAME_PREFIX, new androidx.room.util.TableInfo.Column(com.payair.db.TokenDetailsDaoInternal.ASSET_FILE_NAME_PREFIX, "TEXT", false, 0, null, 1));
        hashMap3.put("assetPath", new androidx.room.util.TableInfo.Column("assetPath", "TEXT", false, 0, null, 1));
        androidx.room.util.TableInfo tableInfo3 = new androidx.room.util.TableInfo("TokenDetails", hashMap3, new java.util.HashSet(0), new java.util.HashSet(0));
        androidx.room.util.TableInfo read3 = androidx.room.util.TableInfo.read(supportSQLiteDatabase, "TokenDetails");
        if (tableInfo3.equals(read3)) {
            return new androidx.room.RoomOpenHelper.ValidationResult(true, null);
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("TokenDetails(com.payair.db.token.TokenDetailsEntry).\n Expected:\n");
        sb3.append(tableInfo3);
        sb3.append("\n Found:\n");
        sb3.append(read3);
        return new androidx.room.RoomOpenHelper.ValidationResult(false, sb3.toString());
    }
}

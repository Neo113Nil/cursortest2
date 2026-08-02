package com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J)\u0010\u000f\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u000e0\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u001a\u0010\u0015\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r\u0012\u0004\u0012\u00020\u00120\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/MockDataBase_Impl;", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/MockDataBase;", "<init>", "()V", "Landroidx/room/RoomOpenDelegate;", "createOpenDelegate", "()Landroidx/room/RoomOpenDelegate;", "Landroidx/room/InvalidationTracker;", "createInvalidationTracker", "()Landroidx/room/InvalidationTracker;", "", "clearAllTables", "", "Lkotlin/reflect/KClass;", "", "getRequiredTypeConverterClasses", "()Ljava/util/Map;", "", "Landroidx/room/migration/AutoMigrationSpec;", "getRequiredAutoMigrationSpecClasses", "()Ljava/util/Set;", "autoMigrationSpecs", "Landroidx/room/migration/Migration;", "createAutoMigrations", "(Ljava/util/Map;)Ljava/util/List;", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/PayPalMockCardDao;", "paypalMockCardDao", "()Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/PayPalMockCardDao;", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/MockTncDao;", "tncMockDao", "()Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/MockTncDao;", "Lkotlin/Lazy;", "getHighSpeedVideoSizes", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MockDataBase_Impl extends com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockDataBase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy<com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao> getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockDataBase_Impl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockDataBase_Impl.$r8$lambda$vujo9XF31qoAx99f54G08bW6vy0(com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockDataBase_Impl.this);
        }
    });

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy<com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockTncDao> Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockDataBase_Impl$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockDataBase_Impl.$r8$lambda$Y61s2vmTRuRbuXoiYwmlxiojqks(com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockDataBase_Impl.this);
        }
    });

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public final androidx.room.RoomOpenDelegate createOpenDelegate() {
        return new androidx.room.RoomOpenDelegate() { // from class: com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockDataBase_Impl$createOpenDelegate$_openDelegate$1
            {
                super(1, "67727674a50086832fc4b43acc83c8f6", "1c243cb861ab641c9848bc3180b648d8");
            }

            @Override // androidx.room.RoomOpenDelegate
            public final void createAllTables(androidx.database.SQLiteConnection connection) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
                androidx.database.SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `PayPalMockDeviceWallet` (`payPalCardId` TEXT NOT NULL, `digitizedCardId` TEXT NOT NULL, `deviceWalletServiceCardId` TEXT NOT NULL, `status` TEXT NOT NULL, PRIMARY KEY(`payPalCardId`))");
                androidx.database.SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `MockTncData` (`deviceWalletServiceCardId` TEXT NOT NULL, `tncText` TEXT NOT NULL, `acceptedTime` TEXT NOT NULL, PRIMARY KEY(`deviceWalletServiceCardId`))");
                androidx.database.SQLite.execSQL(connection, androidx.room.RoomMasterTable.CREATE_QUERY);
                androidx.database.SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '67727674a50086832fc4b43acc83c8f6')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public final void dropAllTables(androidx.database.SQLiteConnection connection) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
                androidx.database.SQLite.execSQL(connection, "DROP TABLE IF EXISTS `PayPalMockDeviceWallet`");
                androidx.database.SQLite.execSQL(connection, "DROP TABLE IF EXISTS `MockTncData`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public final void onOpen(androidx.database.SQLiteConnection connection) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
                com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockDataBase_Impl.this.internalInitInvalidationTracker(connection);
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
                linkedHashMap.put("payPalCardId", new androidx.room.util.TableInfo.Column("payPalCardId", "TEXT", true, 1, null, 1));
                linkedHashMap.put("digitizedCardId", new androidx.room.util.TableInfo.Column("digitizedCardId", "TEXT", true, 0, null, 1));
                linkedHashMap.put("deviceWalletServiceCardId", new androidx.room.util.TableInfo.Column("deviceWalletServiceCardId", "TEXT", true, 0, null, 1));
                linkedHashMap.put("status", new androidx.room.util.TableInfo.Column("status", "TEXT", true, 0, null, 1));
                androidx.room.util.TableInfo tableInfo = new androidx.room.util.TableInfo("PayPalMockDeviceWallet", linkedHashMap, new java.util.LinkedHashSet(), new java.util.LinkedHashSet());
                androidx.room.util.TableInfo read = androidx.room.util.TableInfo.INSTANCE.read(connection, "PayPalMockDeviceWallet");
                if (!tableInfo.equals(read)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("PayPalMockDeviceWallet(com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockDeviceWallet).\n Expected:\n");
                    sb.append(tableInfo);
                    sb.append("\n Found:\n");
                    sb.append(read);
                    return new androidx.room.RoomOpenDelegate.ValidationResult(false, sb.toString());
                }
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                linkedHashMap2.put("deviceWalletServiceCardId", new androidx.room.util.TableInfo.Column("deviceWalletServiceCardId", "TEXT", true, 1, null, 1));
                linkedHashMap2.put("tncText", new androidx.room.util.TableInfo.Column("tncText", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("acceptedTime", new androidx.room.util.TableInfo.Column("acceptedTime", "TEXT", true, 0, null, 1));
                androidx.room.util.TableInfo tableInfo2 = new androidx.room.util.TableInfo("MockTncData", linkedHashMap2, new java.util.LinkedHashSet(), new java.util.LinkedHashSet());
                androidx.room.util.TableInfo read2 = androidx.room.util.TableInfo.INSTANCE.read(connection, "MockTncData");
                if (!tableInfo2.equals(read2)) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("MockTncData(com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockTncData).\n Expected:\n");
                    sb2.append(tableInfo2);
                    sb2.append("\n Found:\n");
                    sb2.append(read2);
                    return new androidx.room.RoomOpenDelegate.ValidationResult(false, sb2.toString());
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
        return new androidx.room.InvalidationTracker(this, new java.util.LinkedHashMap(), new java.util.LinkedHashMap(), "PayPalMockDeviceWallet", "MockTncData");
    }

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        super.performClear(false, "PayPalMockDeviceWallet", "MockTncData");
    }

    @Override // androidx.room.RoomDatabase
    public final java.util.Map<kotlin.reflect.KClass<?>, java.util.List<kotlin.reflect.KClass<?>>> getRequiredTypeConverterClasses() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao.class), com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockTncDao.class), com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockTncDao_Impl.INSTANCE.getRequiredConverters());
        return linkedHashMap;
    }

    @Override // androidx.room.RoomDatabase
    public final java.util.Set<kotlin.reflect.KClass<? extends androidx.room.migration.AutoMigrationSpec>> getRequiredAutoMigrationSpecClasses() {
        return new java.util.LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final java.util.List<androidx.room.migration.Migration> createAutoMigrations(java.util.Map<kotlin.reflect.KClass<? extends androidx.room.migration.AutoMigrationSpec>, ? extends androidx.room.migration.AutoMigrationSpec> autoMigrationSpecs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoMigrationSpecs, "");
        return new java.util.ArrayList();
    }

    @Override // com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockDataBase
    public final com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao paypalMockCardDao() {
        return this.getHighSpeedVideoFpsRangesFor.getValue();
    }

    @Override // com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockDataBase
    public final com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockTncDao tncMockDao() {
        return this.Camera2StreamConfigurationMap.getValue();
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockTncDao_Impl $r8$lambda$Y61s2vmTRuRbuXoiYwmlxiojqks(com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockDataBase_Impl mockDataBase_Impl) {
        return new com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockTncDao_Impl(mockDataBase_Impl);
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl $r8$lambda$vujo9XF31qoAx99f54G08bW6vy0(com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockDataBase_Impl mockDataBase_Impl) {
        return new com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl(mockDataBase_Impl);
    }
}

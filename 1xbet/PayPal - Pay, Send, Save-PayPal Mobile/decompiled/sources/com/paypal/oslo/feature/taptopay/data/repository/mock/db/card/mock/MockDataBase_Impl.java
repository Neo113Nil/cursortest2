package com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J)\u0010\u000f\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u000e0\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u001a\u0010\u0015\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r\u0012\u0004\u0012\u00020\u00120\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/MockDataBase_Impl;", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/MockDataBase;", "<init>", "()V", "Landroidx/room/RoomOpenDelegate;", "createOpenDelegate", "()Landroidx/room/RoomOpenDelegate;", "Landroidx/room/InvalidationTracker;", "createInvalidationTracker", "()Landroidx/room/InvalidationTracker;", "", "clearAllTables", "", "Lkotlin/reflect/KClass;", "", "getRequiredTypeConverterClasses", "()Ljava/util/Map;", "", "Landroidx/room/migration/AutoMigrationSpec;", "getRequiredAutoMigrationSpecClasses", "()Ljava/util/Set;", "autoMigrationSpecs", "Landroidx/room/migration/Migration;", "createAutoMigrations", "(Ljava/util/Map;)Ljava/util/List;", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/MockCardDao;", "mockCardDao", "()Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/MockCardDao;", "Lkotlin/Lazy;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Lazy;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MockDataBase_Impl extends com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.MockDataBase {
    public static final int $stable = 8;
    private final kotlin.Lazy<com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.MockCardDao> getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.MockDataBase_Impl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.MockDataBase_Impl.m20018$r8$lambda$g7S6efIYZ1gVKcCq7z6xqN8Rg8(com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.MockDataBase_Impl.this);
        }
    });

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public final androidx.room.RoomOpenDelegate createOpenDelegate() {
        return new androidx.room.RoomOpenDelegate() { // from class: com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.MockDataBase_Impl$createOpenDelegate$_openDelegate$1
            {
                super(1, "5da412baf3f919e54fd5b7848aa70367", "ae444da4d3712950d23964d1f9083321");
            }

            @Override // androidx.room.RoomOpenDelegate
            public final void createAllTables(androidx.database.SQLiteConnection connection) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
                androidx.database.SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `DigitizedMockCard` (`cardId` TEXT NOT NULL, `last4` TEXT NOT NULL, `last4dpan` TEXT NOT NULL, `expiry` TEXT NOT NULL, `isDefault` INTEGER NOT NULL, `status` TEXT NOT NULL, PRIMARY KEY(`cardId`))");
                androidx.database.SQLite.execSQL(connection, androidx.room.RoomMasterTable.CREATE_QUERY);
                androidx.database.SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5da412baf3f919e54fd5b7848aa70367')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public final void dropAllTables(androidx.database.SQLiteConnection connection) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
                androidx.database.SQLite.execSQL(connection, "DROP TABLE IF EXISTS `DigitizedMockCard`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public final void onOpen(androidx.database.SQLiteConnection connection) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
                com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.MockDataBase_Impl.this.internalInitInvalidationTracker(connection);
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
                linkedHashMap.put("cardId", new androidx.room.util.TableInfo.Column("cardId", "TEXT", true, 1, null, 1));
                linkedHashMap.put("last4", new androidx.room.util.TableInfo.Column("last4", "TEXT", true, 0, null, 1));
                linkedHashMap.put("last4dpan", new androidx.room.util.TableInfo.Column("last4dpan", "TEXT", true, 0, null, 1));
                linkedHashMap.put("expiry", new androidx.room.util.TableInfo.Column("expiry", "TEXT", true, 0, null, 1));
                linkedHashMap.put("isDefault", new androidx.room.util.TableInfo.Column("isDefault", "INTEGER", true, 0, null, 1));
                linkedHashMap.put("status", new androidx.room.util.TableInfo.Column("status", "TEXT", true, 0, null, 1));
                androidx.room.util.TableInfo tableInfo = new androidx.room.util.TableInfo("DigitizedMockCard", linkedHashMap, new java.util.LinkedHashSet(), new java.util.LinkedHashSet());
                androidx.room.util.TableInfo read = androidx.room.util.TableInfo.INSTANCE.read(connection, "DigitizedMockCard");
                if (!tableInfo.equals(read)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("DigitizedMockCard(com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.DigitizedMockCard).\n Expected:\n");
                    sb.append(tableInfo);
                    sb.append("\n Found:\n");
                    sb.append(read);
                    return new androidx.room.RoomOpenDelegate.ValidationResult(false, sb.toString());
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
        return new androidx.room.InvalidationTracker(this, new java.util.LinkedHashMap(), new java.util.LinkedHashMap(), "DigitizedMockCard");
    }

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        super.performClear(false, "DigitizedMockCard");
    }

    @Override // androidx.room.RoomDatabase
    public final java.util.Map<kotlin.reflect.KClass<?>, java.util.List<kotlin.reflect.KClass<?>>> getRequiredTypeConverterClasses() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.MockCardDao.class), com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.MockCardDao_Impl.INSTANCE.getRequiredConverters());
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

    @Override // com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.MockDataBase
    public final com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.MockCardDao mockCardDao() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue();
    }

    /* renamed from: $r8$lambda$g7S6efIYZ1gVKcCq7z6xqN8Rg-8, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.MockCardDao_Impl m20018$r8$lambda$g7S6efIYZ1gVKcCq7z6xqN8Rg8(com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.MockDataBase_Impl mockDataBase_Impl) {
        return new com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.MockCardDao_Impl(mockDataBase_Impl);
    }
}

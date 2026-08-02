package com.paypal.oslo.core.persistence.db.impl;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J)\u0010\u000f\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u000e0\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u001a\u0010\u0015\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r\u0012\u0004\u0012\u00020\u00120\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/core/persistence/db/impl/OsloDatabaseImpl_Impl;", "Lcom/paypal/oslo/core/persistence/db/impl/OsloDatabaseImpl;", "<init>", "()V", "Landroidx/room/RoomOpenDelegate;", "createOpenDelegate", "()Landroidx/room/RoomOpenDelegate;", "Landroidx/room/InvalidationTracker;", "createInvalidationTracker", "()Landroidx/room/InvalidationTracker;", "", "clearAllTables", "", "Lkotlin/reflect/KClass;", "", "getRequiredTypeConverterClasses", "()Ljava/util/Map;", "", "Landroidx/room/migration/AutoMigrationSpec;", "getRequiredAutoMigrationSpecClasses", "()Ljava/util/Set;", "autoMigrationSpecs", "Landroidx/room/migration/Migration;", "createAutoMigrations", "(Ljava/util/Map;)Ljava/util/List;", "Lcom/paypal/oslo/core/persistence/db/placeholder/PlaceholderDao;", "placeholderDao", "()Lcom/paypal/oslo/core/persistence/db/placeholder/PlaceholderDao;", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRanges", "Lkotlin/Lazy;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OsloDatabaseImpl_Impl extends com.paypal.oslo.core.persistence.db.impl.OsloDatabaseImpl {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy<com.paypal.oslo.core.persistence.db.placeholder.PlaceholderDao> Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.persistence.db.impl.OsloDatabaseImpl_Impl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.core.persistence.db.impl.OsloDatabaseImpl_Impl.$r8$lambda$0uA_R50VE0CiDrY2HrotjFikB6A(com.paypal.oslo.core.persistence.db.impl.OsloDatabaseImpl_Impl.this);
        }
    });

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public final androidx.room.RoomOpenDelegate createOpenDelegate() {
        return new androidx.room.RoomOpenDelegate() { // from class: com.paypal.oslo.core.persistence.db.impl.OsloDatabaseImpl_Impl$createOpenDelegate$_openDelegate$1
            {
                super(1, "8941485a8c844f3708f230e2ed4e1a75", "9a495056886bebfeb3894b4cc1974c59");
            }

            @Override // androidx.room.RoomOpenDelegate
            public final void createAllTables(androidx.database.SQLiteConnection connection) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
                androidx.database.SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `core_persistence_db_placeholder` (`id` TEXT NOT NULL, PRIMARY KEY(`id`))");
                androidx.database.SQLite.execSQL(connection, androidx.room.RoomMasterTable.CREATE_QUERY);
                androidx.database.SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8941485a8c844f3708f230e2ed4e1a75')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public final void dropAllTables(androidx.database.SQLiteConnection connection) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
                androidx.database.SQLite.execSQL(connection, "DROP TABLE IF EXISTS `core_persistence_db_placeholder`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public final void onOpen(androidx.database.SQLiteConnection connection) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
                com.paypal.oslo.core.persistence.db.impl.OsloDatabaseImpl_Impl.this.internalInitInvalidationTracker(connection);
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
                linkedHashMap.put("id", new androidx.room.util.TableInfo.Column("id", "TEXT", true, 1, null, 1));
                androidx.room.util.TableInfo tableInfo = new androidx.room.util.TableInfo("core_persistence_db_placeholder", linkedHashMap, new java.util.LinkedHashSet(), new java.util.LinkedHashSet());
                androidx.room.util.TableInfo read = androidx.room.util.TableInfo.INSTANCE.read(connection, "core_persistence_db_placeholder");
                if (!tableInfo.equals(read)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("core_persistence_db_placeholder(com.paypal.oslo.core.persistence.db.placeholder.PlaceholderEntity).\n Expected:\n");
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
        return new androidx.room.InvalidationTracker(this, new java.util.LinkedHashMap(), new java.util.LinkedHashMap(), "core_persistence_db_placeholder");
    }

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        super.performClear(false, "core_persistence_db_placeholder");
    }

    @Override // androidx.room.RoomDatabase
    public final java.util.Map<kotlin.reflect.KClass<?>, java.util.List<kotlin.reflect.KClass<?>>> getRequiredTypeConverterClasses() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.persistence.db.placeholder.PlaceholderDao.class), com.paypal.oslo.core.persistence.db.placeholder.PlaceholderDao_Impl.INSTANCE.getRequiredConverters());
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

    @Override // com.paypal.oslo.core.persistence.db.impl.OsloDatabaseImpl
    public final com.paypal.oslo.core.persistence.db.placeholder.PlaceholderDao placeholderDao() {
        return this.Camera2StreamConfigurationMap.getValue();
    }

    public static /* synthetic */ com.paypal.oslo.core.persistence.db.placeholder.PlaceholderDao_Impl $r8$lambda$0uA_R50VE0CiDrY2HrotjFikB6A(com.paypal.oslo.core.persistence.db.impl.OsloDatabaseImpl_Impl osloDatabaseImpl_Impl) {
        return new com.paypal.oslo.core.persistence.db.placeholder.PlaceholderDao_Impl(osloDatabaseImpl_Impl);
    }
}

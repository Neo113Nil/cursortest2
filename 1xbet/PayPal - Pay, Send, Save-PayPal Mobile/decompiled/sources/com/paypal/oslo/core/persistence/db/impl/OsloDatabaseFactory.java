package com.paypal.oslo.core.persistence.db.impl;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/core/persistence/db/impl/OsloDatabaseFactory;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/room/RoomDatabase;", "T", "Ljava/lang/Class;", "implClass", "", "databaseName", "createDatabase", "(Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/RoomDatabase;", "p0", "p1", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OsloDatabaseFactory {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public OsloDatabaseFactory(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRangesFor = context;
    }

    public static /* synthetic */ androidx.room.RoomDatabase createDatabase$default(com.paypal.oslo.core.persistence.db.impl.OsloDatabaseFactory osloDatabaseFactory, java.lang.Class cls, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = com.paypal.oslo.core.persistence.db.config.DbConfig.DB_NAME;
        }
        return osloDatabaseFactory.createDatabase(cls, str);
    }

    public final <T extends androidx.room.RoomDatabase> T createDatabase(java.lang.Class<T> implClass, java.lang.String databaseName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(implClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseName, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.persistence.db.LoggerKt.log, "Creating database", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("databaseName", databaseName), kotlin.TuplesKt.to("implClass", implClass.getName())), null, 4, null);
        return (T) Camera2StreamConfigurationMap(implClass, databaseName);
    }

    private final <T extends androidx.room.RoomDatabase> T Camera2StreamConfigurationMap(java.lang.Class<T> p0, java.lang.String p1) {
        try {
            T build = androidx.room.Room.databaseBuilder(this.getHighSpeedVideoFpsRangesFor, p0, p1).setJournalMode(com.paypal.oslo.core.persistence.db.config.DbConfig.INSTANCE.getJOURNAL_MODE()).fallbackToDestructiveMigration(true).build();
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.persistence.db.LoggerKt.log, "Database created successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("databaseName", p1)), null, 4, null);
            return build;
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.core.persistence.db.LoggerKt.log;
            java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("databaseName", p1));
            java.lang.Exception exc = e;
            com.paypal.android.logger.Logger.e$default(logger, "Failed to create database", mapOf, null, exc, 4, null);
            throw new com.paypal.oslo.core.persistence.db.impl.DatabaseCreationException("Failed to create database instance: ".concat(java.lang.String.valueOf(e.getMessage())), exc);
        }
    }
}

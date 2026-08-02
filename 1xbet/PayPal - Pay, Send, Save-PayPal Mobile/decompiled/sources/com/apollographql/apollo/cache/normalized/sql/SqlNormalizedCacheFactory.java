package com.apollographql.apollo.cache.normalized.sql;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005BU\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0004\u0010\u0014B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/sql/SqlNormalizedCacheFactory;", "Lcom/apollographql/apollo/cache/normalized/api/NormalizedCacheFactory;", "Lapp/cash/sqldelight/db/SqlDriver;", "driver", "<init>", "(Lapp/cash/sqldelight/db/SqlDriver;)V", "Landroid/content/Context;", "context", "", "name", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "factory", "Lkotlin/Function1;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "", "configure", "", "useNoBackupDirectory", "", "windowSizeBytes", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Lkotlin/jvm/functions/Function1;ZLjava/lang/Long;)V", "(Ljava/lang/String;)V", "Lcom/apollographql/apollo/cache/normalized/api/NormalizedCache;", "create", "()Lcom/apollographql/apollo/cache/normalized/api/NormalizedCache;", "getHighSpeedVideoFpsRanges", "Lapp/cash/sqldelight/db/SqlDriver;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SqlNormalizedCacheFactory extends com.apollographql.apollo.cache.normalized.api.NormalizedCacheFactory {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final app.cash.sqldelight.db.SqlDriver getHighResolutionOutputSizeshNQ4ISI;

    public SqlNormalizedCacheFactory(app.cash.sqldelight.db.SqlDriver sqlDriver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlDriver, "");
        this.getHighResolutionOutputSizeshNQ4ISI = sqlDriver;
    }

    public /* synthetic */ SqlNormalizedCacheFactory(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "apollo.db" : str);
    }

    public /* synthetic */ SqlNormalizedCacheFactory(android.content.Context context, java.lang.String str, androidx.database.db.framework.FrameworkSQLiteOpenHelperFactory frameworkSQLiteOpenHelperFactory, kotlin.jvm.functions.Function1 function1, boolean z, java.lang.Long l, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? "apollo.db" : str, (i & 4) != 0 ? new androidx.database.db.framework.FrameworkSQLiteOpenHelperFactory() : frameworkSQLiteOpenHelperFactory, (i & 8) != 0 ? null : function1, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : l);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SqlNormalizedCacheFactory(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, final kotlin.jvm.functions.Function1<? super androidx.database.db.SupportSQLiteDatabase, kotlin.Unit> function1, boolean z, java.lang.Long l) {
        this(new app.cash.sqldelight.driver.android.AndroidSqliteDriver(r2, r3, str, factory, new app.cash.sqldelight.driver.android.AndroidSqliteDriver.Callback(com.apollographql.apollo.cache.normalized.sql.internal.FactoryHelpersKt.getSchema(), new app.cash.sqldelight.db.AfterVersion[0]) { // from class: com.apollographql.apollo.cache.normalized.sql.SqlNormalizedCacheFactory.1
            @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
            public final void onConfigure(androidx.database.db.SupportSQLiteDatabase db) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
                super.onConfigure(db);
                kotlin.jvm.functions.Function1<androidx.database.db.SupportSQLiteDatabase, kotlin.Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(db);
                }
            }
        }, 0, z, l, 32, null));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        app.cash.sqldelight.db.SqlSchema<app.cash.sqldelight.db.QueryResult.Value<kotlin.Unit>> schema = com.apollographql.apollo.cache.normalized.sql.internal.FactoryHelpersKt.getSchema();
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
    }

    public SqlNormalizedCacheFactory(java.lang.String str) {
        this(com.apollographql.apollo.cache.normalized.sql.internal.FactoryImplementationsKt.createDriver(str, null, com.apollographql.apollo.cache.normalized.sql.internal.FactoryHelpersKt.getSchema()));
    }

    @Override // com.apollographql.apollo.cache.normalized.api.NormalizedCacheFactory
    public final com.apollographql.apollo.cache.normalized.api.NormalizedCache create() {
        return new com.apollographql.apollo.cache.normalized.sql.SqlNormalizedCache(com.apollographql.apollo.cache.normalized.sql.internal.FactoryHelpersKt.createRecordDatabase(this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SqlNormalizedCacheFactory(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, kotlin.jvm.functions.Function1<? super androidx.database.db.SupportSQLiteDatabase, kotlin.Unit> function1, boolean z) {
        this(context, str, factory, function1, z, null, 32, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SqlNormalizedCacheFactory(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, kotlin.jvm.functions.Function1<? super androidx.database.db.SupportSQLiteDatabase, kotlin.Unit> function1) {
        this(context, str, factory, function1, false, null, 48, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SqlNormalizedCacheFactory(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory) {
        this(context, str, factory, null, false, null, 56, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SqlNormalizedCacheFactory(android.content.Context context, java.lang.String str) {
        this(context, str, null, null, false, null, 60, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SqlNormalizedCacheFactory(android.content.Context context) {
        this(context, null, null, null, false, null, 62, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }
}

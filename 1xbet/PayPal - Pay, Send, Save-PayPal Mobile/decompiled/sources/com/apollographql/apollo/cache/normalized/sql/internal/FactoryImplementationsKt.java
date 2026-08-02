package com.apollographql.apollo.cache.normalized.sql.internal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a7\u0010\b\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"", "name", "baseDir", "Lapp/cash/sqldelight/db/SqlSchema;", "Lapp/cash/sqldelight/db/QueryResult$Value;", "", "schema", "Lapp/cash/sqldelight/db/SqlDriver;", "createDriver", "(Ljava/lang/String;Ljava/lang/String;Lapp/cash/sqldelight/db/SqlSchema;)Lapp/cash/sqldelight/db/SqlDriver;", "driver", "maybeCreateOrMigrateSchema", "(Lapp/cash/sqldelight/db/SqlDriver;Lapp/cash/sqldelight/db/SqlSchema;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FactoryImplementationsKt {
    public static final app.cash.sqldelight.db.SqlDriver createDriver(java.lang.String str, java.lang.String str2, app.cash.sqldelight.db.SqlSchema<app.cash.sqldelight.db.QueryResult.Value<kotlin.Unit>> sqlSchema) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlSchema, "");
        if (str2 != null) {
            throw new java.lang.IllegalStateException("Apollo: Android SqlNormalizedCacheFactory doesn't support 'baseDir'".toString());
        }
        return new app.cash.sqldelight.driver.android.AndroidSqliteDriver(sqlSchema, com.apollographql.apollo.cache.normalized.sql.ApolloInitializer.INSTANCE.getContext$apollo_normalized_cache_sqlite_release(), str, new androidx.database.db.framework.FrameworkSQLiteOpenHelperFactory(), null, 0, false, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
    }

    public static final void maybeCreateOrMigrateSchema(app.cash.sqldelight.db.SqlDriver sqlDriver, app.cash.sqldelight.db.SqlSchema<app.cash.sqldelight.db.QueryResult.Value<kotlin.Unit>> sqlSchema) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlDriver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlSchema, "");
    }
}

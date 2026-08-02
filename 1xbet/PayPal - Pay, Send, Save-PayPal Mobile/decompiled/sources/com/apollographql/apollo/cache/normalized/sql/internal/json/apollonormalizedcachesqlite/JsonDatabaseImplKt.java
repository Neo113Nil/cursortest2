package com.apollographql.apollo.cache.normalized.sql.internal.json.apollonormalizedcachesqlite;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"*\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006*\b\u0012\u0004\u0012\u00020\u00010\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/reflect/KClass;", "Lcom/apollographql/apollo/cache/normalized/sql/internal/json/JsonDatabase;", "Lapp/cash/sqldelight/db/SqlDriver;", "driver", "newInstance", "(Lkotlin/reflect/KClass;Lapp/cash/sqldelight/db/SqlDriver;)Lcom/apollographql/apollo/cache/normalized/sql/internal/json/JsonDatabase;", "Lapp/cash/sqldelight/db/SqlSchema;", "Lapp/cash/sqldelight/db/QueryResult$Value;", "", "getSchema", "(Lkotlin/reflect/KClass;)Lapp/cash/sqldelight/db/SqlSchema;", "schema"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JsonDatabaseImplKt {
    public static final app.cash.sqldelight.db.SqlSchema<app.cash.sqldelight.db.QueryResult.Value<kotlin.Unit>> getSchema(kotlin.reflect.KClass<com.apollographql.apollo.cache.normalized.sql.internal.json.JsonDatabase> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return com.apollographql.apollo.cache.normalized.sql.internal.json.apollonormalizedcachesqlite.JsonDatabaseImpl.Schema.INSTANCE;
    }

    public static final com.apollographql.apollo.cache.normalized.sql.internal.json.JsonDatabase newInstance(kotlin.reflect.KClass<com.apollographql.apollo.cache.normalized.sql.internal.json.JsonDatabase> kClass, app.cash.sqldelight.db.SqlDriver sqlDriver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlDriver, "");
        return new com.apollographql.apollo.cache.normalized.sql.internal.json.apollonormalizedcachesqlite.JsonDatabaseImpl(sqlDriver);
    }
}

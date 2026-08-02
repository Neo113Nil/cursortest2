package com.apollographql.apollo.cache.normalized.sql.internal.json;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/sql/internal/json/JsonDatabase;", "Lapp/cash/sqldelight/Transacter;", "Lcom/apollographql/apollo/cache/normalized/sql/internal/json/JsonQueries;", "getJsonQueries", "()Lcom/apollographql/apollo/cache/normalized/sql/internal/json/JsonQueries;", "jsonQueries", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface JsonDatabase extends app.cash.sqldelight.Transacter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.apollographql.apollo.cache.normalized.sql.internal.json.JsonDatabase.Companion INSTANCE = com.apollographql.apollo.cache.normalized.sql.internal.json.JsonDatabase.Companion.getHighResolutionOutputSizeshNQ4ISI;

    com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries getJsonQueries();

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t8G¢\u0006\u0006\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/sql/internal/json/JsonDatabase$Companion;", "", "<init>", "()V", "Lapp/cash/sqldelight/db/SqlDriver;", "driver", "Lcom/apollographql/apollo/cache/normalized/sql/internal/json/JsonDatabase;", "invoke", "(Lapp/cash/sqldelight/db/SqlDriver;)Lcom/apollographql/apollo/cache/normalized/sql/internal/json/JsonDatabase;", "Lapp/cash/sqldelight/db/SqlSchema;", "Lapp/cash/sqldelight/db/QueryResult$Value;", "", "getSchema", "()Lapp/cash/sqldelight/db/SqlSchema;", "Schema"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.apollographql.apollo.cache.normalized.sql.internal.json.JsonDatabase.Companion getHighResolutionOutputSizeshNQ4ISI = new com.apollographql.apollo.cache.normalized.sql.internal.json.JsonDatabase.Companion();

        private Companion() {
        }

        public final app.cash.sqldelight.db.SqlSchema<app.cash.sqldelight.db.QueryResult.Value<kotlin.Unit>> getSchema() {
            return com.apollographql.apollo.cache.normalized.sql.internal.json.apollonormalizedcachesqlite.JsonDatabaseImplKt.getSchema(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.apollographql.apollo.cache.normalized.sql.internal.json.JsonDatabase.class));
        }

        public final com.apollographql.apollo.cache.normalized.sql.internal.json.JsonDatabase invoke(app.cash.sqldelight.db.SqlDriver driver) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(driver, "");
            return com.apollographql.apollo.cache.normalized.sql.internal.json.apollonormalizedcachesqlite.JsonDatabaseImplKt.newInstance(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.apollographql.apollo.cache.normalized.sql.internal.json.JsonDatabase.class), driver);
        }
    }
}

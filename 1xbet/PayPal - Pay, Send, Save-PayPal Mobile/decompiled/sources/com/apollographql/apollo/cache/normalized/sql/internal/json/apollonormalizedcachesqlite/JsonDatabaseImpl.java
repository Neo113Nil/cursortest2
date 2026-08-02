package com.apollographql.apollo.cache.normalized.sql.internal.json.apollonormalizedcachesqlite;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/sql/internal/json/apollonormalizedcachesqlite/JsonDatabaseImpl;", "Lapp/cash/sqldelight/TransacterImpl;", "Lcom/apollographql/apollo/cache/normalized/sql/internal/json/JsonDatabase;", "Lapp/cash/sqldelight/db/SqlDriver;", "p0", "<init>", "(Lapp/cash/sqldelight/db/SqlDriver;)V", "Lcom/apollographql/apollo/cache/normalized/sql/internal/json/JsonQueries;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/cache/normalized/sql/internal/json/JsonQueries;", "getJsonQueries", "()Lcom/apollographql/apollo/cache/normalized/sql/internal/json/JsonQueries;", "Schema"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class JsonDatabaseImpl extends app.cash.sqldelight.TransacterImpl implements com.apollographql.apollo.cache.normalized.sql.internal.json.JsonDatabase {
    private final com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonDatabaseImpl(app.cash.sqldelight.db.SqlDriver sqlDriver) {
        super(sqlDriver);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlDriver, "");
        this.getHighSpeedVideoFpsRanges = new com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries(sqlDriver);
    }

    @Override // com.apollographql.apollo.cache.normalized.sql.internal.json.JsonDatabase
    /* renamed from: getJsonQueries, reason: from getter */
    public final com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJA\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/sql/internal/json/apollonormalizedcachesqlite/JsonDatabaseImpl$Schema;", "Lapp/cash/sqldelight/db/SqlSchema;", "Lapp/cash/sqldelight/db/QueryResult$Value;", "", "<init>", "()V", "Lapp/cash/sqldelight/db/SqlDriver;", "driver", "create-0iQ1-z0", "(Lapp/cash/sqldelight/db/SqlDriver;)Ljava/lang/Object;", "create", "", "oldVersion", "newVersion", "", "Lapp/cash/sqldelight/db/AfterVersion;", "callbacks", "migrate-zeHU3Mk", "(Lapp/cash/sqldelight/db/SqlDriver;JJ[Lapp/cash/sqldelight/db/AfterVersion;)Ljava/lang/Object;", "migrate", "getVersion", "()J", "version"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Schema implements app.cash.sqldelight.db.SqlSchema<app.cash.sqldelight.db.QueryResult.Value<kotlin.Unit>> {
        public static final com.apollographql.apollo.cache.normalized.sql.internal.json.apollonormalizedcachesqlite.JsonDatabaseImpl.Schema INSTANCE = new com.apollographql.apollo.cache.normalized.sql.internal.json.apollonormalizedcachesqlite.JsonDatabaseImpl.Schema();

        @Override // app.cash.sqldelight.db.SqlSchema
        public final long getVersion() {
            return 1L;
        }

        private Schema() {
        }

        @Override // app.cash.sqldelight.db.SqlSchema
        public final /* synthetic */ app.cash.sqldelight.db.QueryResult.Value<kotlin.Unit> create(app.cash.sqldelight.db.SqlDriver sqlDriver) {
            return app.cash.sqldelight.db.QueryResult.Value.m9520boximpl(m9974create0iQ1z0(sqlDriver));
        }

        @Override // app.cash.sqldelight.db.SqlSchema
        public final /* synthetic */ app.cash.sqldelight.db.QueryResult.Value<kotlin.Unit> migrate(app.cash.sqldelight.db.SqlDriver sqlDriver, long j, long j2, app.cash.sqldelight.db.AfterVersion[] afterVersionArr) {
            return app.cash.sqldelight.db.QueryResult.Value.m9520boximpl(m9975migratezeHU3Mk(sqlDriver, j, j2, afterVersionArr));
        }

        /* renamed from: create-0iQ1-z0, reason: not valid java name */
        public final java.lang.Object m9974create0iQ1z0(app.cash.sqldelight.db.SqlDriver driver) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(driver, "");
            app.cash.sqldelight.db.SqlDriver.DefaultImpls.execute$default(driver, null, "CREATE TABLE records (\n  _id INTEGER PRIMARY KEY AUTOINCREMENT,\n  key TEXT NOT NULL,\n  record TEXT NOT NULL\n)", 0, null, 8, null);
            app.cash.sqldelight.db.SqlDriver.DefaultImpls.execute$default(driver, null, "CREATE INDEX idx_records_key ON records(key)", 0, null, 8, null);
            return app.cash.sqldelight.db.QueryResult.INSTANCE.m9518getUnitmlRZEE();
        }

        /* renamed from: migrate-zeHU3Mk, reason: not valid java name */
        public final java.lang.Object m9975migratezeHU3Mk(app.cash.sqldelight.db.SqlDriver driver, long oldVersion, long newVersion, app.cash.sqldelight.db.AfterVersion... callbacks) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(driver, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbacks, "");
            return app.cash.sqldelight.db.QueryResult.INSTANCE.m9518getUnitmlRZEE();
        }
    }
}

package com.apollographql.apollo.cache.normalized.sql.internal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lapp/cash/sqldelight/db/SqlDriver;", "driver", "Lcom/apollographql/apollo/cache/normalized/sql/internal/RecordDatabase;", "createRecordDatabase", "(Lapp/cash/sqldelight/db/SqlDriver;)Lcom/apollographql/apollo/cache/normalized/sql/internal/RecordDatabase;", "Lapp/cash/sqldelight/db/SqlSchema;", "Lapp/cash/sqldelight/db/QueryResult$Value;", "", "getSchema", "()Lapp/cash/sqldelight/db/SqlSchema;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FactoryHelpersKt {
    public static final com.apollographql.apollo.cache.normalized.sql.internal.RecordDatabase createRecordDatabase(app.cash.sqldelight.db.SqlDriver sqlDriver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlDriver, "");
        com.apollographql.apollo.cache.normalized.sql.internal.FactoryImplementationsKt.maybeCreateOrMigrateSchema(sqlDriver, getSchema());
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            app.cash.sqldelight.db.SqlDriver.DefaultImpls.executeQuery$default(sqlDriver, null, "SELECT name FROM sqlite_master WHERE type='table' ORDER BY name;", new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.cache.normalized.sql.internal.FactoryHelpersKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.apollographql.apollo.cache.normalized.sql.internal.FactoryHelpersKt.$r8$lambda$wJZihHaQZbiEWgpOYWXwZowxl34(arrayList, (app.cash.sqldelight.db.SqlCursor) obj);
                }
            }, 0, null, 16, null);
        } catch (java.lang.Exception e) {
            com.apollographql.apollo.exception.ApolloExceptionHandlerKt.getApolloExceptionHandler().invoke(new java.lang.Exception("An exception occurred while looking up the table names", e));
        }
        if (!arrayList.isEmpty() && !arrayList.contains("records")) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Apollo: Cannot find the 'records' table? (found '");
            sb.append(arrayList);
            sb.append("' instead)");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        return new com.apollographql.apollo.cache.normalized.sql.internal.JsonRecordDatabase(com.apollographql.apollo.cache.normalized.sql.internal.json.JsonDatabase.INSTANCE.invoke(sqlDriver).getGetHighSpeedVideoFpsRanges());
    }

    public static final app.cash.sqldelight.db.SqlSchema<app.cash.sqldelight.db.QueryResult.Value<kotlin.Unit>> getSchema() {
        return com.apollographql.apollo.cache.normalized.sql.internal.json.JsonDatabase.INSTANCE.getSchema();
    }

    public static /* synthetic */ app.cash.sqldelight.db.QueryResult $r8$lambda$wJZihHaQZbiEWgpOYWXwZowxl34(java.util.List list, app.cash.sqldelight.db.SqlCursor sqlCursor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlCursor, "");
        while (sqlCursor.next().getValue().booleanValue()) {
            java.lang.String string = sqlCursor.getString(0);
            if (string == null) {
                string = "";
            }
            list.add(string);
        }
        return app.cash.sqldelight.db.QueryResult.Value.m9520boximpl(app.cash.sqldelight.db.QueryResult.INSTANCE.m9518getUnitmlRZEE());
    }
}

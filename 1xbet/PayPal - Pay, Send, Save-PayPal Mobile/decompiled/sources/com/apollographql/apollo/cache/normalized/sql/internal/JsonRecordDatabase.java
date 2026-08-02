package com.apollographql.apollo.cache.normalized.sql.internal;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0016¢\u0006\u0004\b\t\u0010\u000eJ+\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/sql/internal/JsonRecordDatabase;", "Lcom/apollographql/apollo/cache/normalized/sql/internal/RecordDatabase;", "Lcom/apollographql/apollo/cache/normalized/sql/internal/json/JsonQueries;", "jsonQueries", "<init>", "(Lcom/apollographql/apollo/cache/normalized/sql/internal/json/JsonQueries;)V", "", "key", "Lcom/apollographql/apollo/cache/normalized/api/Record;", "select", "(Ljava/lang/String;)Lcom/apollographql/apollo/cache/normalized/api/Record;", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "", "(Ljava/util/Collection;)Ljava/util/List;", "T", "", "noEnclosing", "Lkotlin/Function0;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "transaction", "(ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(Ljava/lang/String;)V", "pattern", "deleteMatching", "deleteAll", "()V", "", "changes", "()J", "record", "insert", "(Lcom/apollographql/apollo/cache/normalized/api/Record;)V", "update", "selectAll", "()Ljava/util/List;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/cache/normalized/sql/internal/json/JsonQueries;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JsonRecordDatabase implements com.apollographql.apollo.cache.normalized.sql.internal.RecordDatabase {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries getHighSpeedVideoFpsRanges;

    public JsonRecordDatabase(com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries jsonQueries) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonQueries, "");
        this.getHighSpeedVideoFpsRanges = jsonQueries;
    }

    @Override // com.apollographql.apollo.cache.normalized.sql.internal.RecordDatabase
    public final com.apollographql.apollo.cache.normalized.api.Record select(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.util.List<com.apollographql.apollo.cache.normalized.sql.internal.json.RecordForKey> executeAsList = this.getHighSpeedVideoFpsRanges.recordForKey(key).executeAsList();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(executeAsList, 10));
        for (com.apollographql.apollo.cache.normalized.sql.internal.json.RecordForKey recordForKey : executeAsList) {
            arrayList.add(com.apollographql.apollo.cache.normalized.api.internal.JsonRecordSerializer.INSTANCE.deserialize(recordForKey.getKey(), recordForKey.getRecord()));
        }
        return (com.apollographql.apollo.cache.normalized.api.Record) kotlin.collections.CollectionsKt.singleOrNull((java.util.List) arrayList);
    }

    @Override // com.apollographql.apollo.cache.normalized.sql.internal.RecordDatabase
    public final java.util.List<com.apollographql.apollo.cache.normalized.api.Record> select(java.util.Collection<java.lang.String> keys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        java.util.List<com.apollographql.apollo.cache.normalized.sql.internal.json.RecordsForKeys> executeAsList = this.getHighSpeedVideoFpsRanges.recordsForKeys(keys).executeAsList();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(executeAsList, 10));
        for (com.apollographql.apollo.cache.normalized.sql.internal.json.RecordsForKeys recordsForKeys : executeAsList) {
            arrayList.add(com.apollographql.apollo.cache.normalized.api.internal.JsonRecordSerializer.INSTANCE.deserialize(recordsForKeys.getKey(), recordsForKeys.getRecord()));
        }
        return arrayList;
    }

    @Override // com.apollographql.apollo.cache.normalized.sql.internal.RecordDatabase
    public final <T> T transaction(boolean noEnclosing, final kotlin.jvm.functions.Function0<? extends T> body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
        return (T) app.cash.sqldelight.Transacter.DefaultImpls.transactionWithResult$default(this.getHighSpeedVideoFpsRanges, false, new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.cache.normalized.sql.internal.JsonRecordDatabase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.apollographql.apollo.cache.normalized.sql.internal.JsonRecordDatabase.m9970$r8$lambda$psV9GbJrISwXS2j4CguCRP_mo(kotlin.jvm.functions.Function0.this, (app.cash.sqldelight.TransactionWithReturn) obj);
            }
        }, 1, null);
    }

    @Override // com.apollographql.apollo.cache.normalized.sql.internal.RecordDatabase
    public final void delete(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        this.getHighSpeedVideoFpsRanges.delete(key);
    }

    @Override // com.apollographql.apollo.cache.normalized.sql.internal.RecordDatabase
    public final void deleteMatching(java.lang.String pattern) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "");
        this.getHighSpeedVideoFpsRanges.deleteRecordsWithKeyMatching(pattern, "\\");
    }

    @Override // com.apollographql.apollo.cache.normalized.sql.internal.RecordDatabase
    public final void deleteAll() {
        this.getHighSpeedVideoFpsRanges.deleteAll();
    }

    @Override // com.apollographql.apollo.cache.normalized.sql.internal.RecordDatabase
    public final long changes() {
        return this.getHighSpeedVideoFpsRanges.changes().executeAsOne().longValue();
    }

    @Override // com.apollographql.apollo.cache.normalized.sql.internal.RecordDatabase
    public final void insert(com.apollographql.apollo.cache.normalized.api.Record record) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "");
        this.getHighSpeedVideoFpsRanges.insert(record.getKey(), com.apollographql.apollo.cache.normalized.api.internal.JsonRecordSerializer.INSTANCE.serialize(record));
    }

    @Override // com.apollographql.apollo.cache.normalized.sql.internal.RecordDatabase
    public final void update(com.apollographql.apollo.cache.normalized.api.Record record) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "");
        this.getHighSpeedVideoFpsRanges.update(com.apollographql.apollo.cache.normalized.api.internal.JsonRecordSerializer.INSTANCE.serialize(record), record.getKey());
    }

    @Override // com.apollographql.apollo.cache.normalized.sql.internal.RecordDatabase
    public final java.util.List<com.apollographql.apollo.cache.normalized.api.Record> selectAll() {
        java.util.List<com.apollographql.apollo.cache.normalized.sql.internal.json.Records> executeAsList = this.getHighSpeedVideoFpsRanges.selectRecords().executeAsList();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(executeAsList, 10));
        for (com.apollographql.apollo.cache.normalized.sql.internal.json.Records records : executeAsList) {
            arrayList.add(com.apollographql.apollo.cache.normalized.api.internal.JsonRecordSerializer.INSTANCE.deserialize(records.getKey(), records.getRecord()));
        }
        return arrayList;
    }

    /* renamed from: $r8$lambda$psV9GbJrISwXS2--j4CguCRP_mo, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m9970$r8$lambda$psV9GbJrISwXS2j4CguCRP_mo(kotlin.jvm.functions.Function0 function0, app.cash.sqldelight.TransactionWithReturn transactionWithReturn) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionWithReturn, "");
        return function0.invoke();
    }
}

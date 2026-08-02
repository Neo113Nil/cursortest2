package com.apollographql.apollo.cache.normalized.sql.internal;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\nJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0014H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0004H&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0004H&¢\u0006\u0004\b!\u0010 ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/sql/internal/RecordDatabase;", "", "", "key", "Lcom/apollographql/apollo/cache/normalized/api/Record;", "select", "(Ljava/lang/String;)Lcom/apollographql/apollo/cache/normalized/api/Record;", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "", "(Ljava/util/Collection;)Ljava/util/List;", "selectAll", "()Ljava/util/List;", "T", "", "noEnclosing", "Lkotlin/Function0;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "transaction", "(ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(Ljava/lang/String;)V", "pattern", "deleteMatching", "deleteAll", "()V", "", "changes", "()J", "record", "insert", "(Lcom/apollographql/apollo/cache/normalized/api/Record;)V", "update"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RecordDatabase {
    long changes();

    void delete(java.lang.String key);

    void deleteAll();

    void deleteMatching(java.lang.String pattern);

    void insert(com.apollographql.apollo.cache.normalized.api.Record record);

    com.apollographql.apollo.cache.normalized.api.Record select(java.lang.String key);

    java.util.List<com.apollographql.apollo.cache.normalized.api.Record> select(java.util.Collection<java.lang.String> keys);

    java.util.List<com.apollographql.apollo.cache.normalized.api.Record> selectAll();

    <T> T transaction(boolean noEnclosing, kotlin.jvm.functions.Function0<? extends T> body);

    void update(com.apollographql.apollo.cache.normalized.api.Record record);

    static /* synthetic */ java.lang.Object transaction$default(com.apollographql.apollo.cache.normalized.sql.internal.RecordDatabase recordDatabase, boolean z, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transaction");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return recordDatabase.transaction(z, function0);
    }
}

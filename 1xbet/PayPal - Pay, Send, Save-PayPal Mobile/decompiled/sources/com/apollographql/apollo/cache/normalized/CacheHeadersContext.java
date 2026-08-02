package com.apollographql.apollo.cache.normalized;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0006\u0012\u0002\b\u00030\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/CacheHeadersContext;", "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)V", "Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;", "getValue", "()Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "getKey", "()Lcom/apollographql/apollo/api/ExecutionContext$Key;", "key", "Key"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CacheHeadersContext implements com.apollographql.apollo.api.ExecutionContext.Element {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final com.apollographql.apollo.cache.normalized.CacheHeadersContext.Companion INSTANCE = new com.apollographql.apollo.cache.normalized.CacheHeadersContext.Companion(null);
    private final com.apollographql.apollo.cache.normalized.api.CacheHeaders value;

    public CacheHeadersContext(com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        this.value = cacheHeaders;
    }

    public final com.apollographql.apollo.cache.normalized.api.CacheHeaders getValue() {
        return this.value;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext.Element
    public final com.apollographql.apollo.api.ExecutionContext.Key<?> getKey() {
        return INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/CacheHeadersContext$Key;", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "Lcom/apollographql/apollo/cache/normalized/CacheHeadersContext;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.apollographql.apollo.cache.normalized.CacheHeadersContext$Key, reason: from kotlin metadata */
    /* loaded from: classes3.dex */
    public static final class Companion implements com.apollographql.apollo.api.ExecutionContext.Key<com.apollographql.apollo.cache.normalized.CacheHeadersContext> {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

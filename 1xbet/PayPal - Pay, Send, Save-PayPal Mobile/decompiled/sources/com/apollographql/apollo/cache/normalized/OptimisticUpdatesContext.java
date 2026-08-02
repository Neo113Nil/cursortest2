package com.apollographql.apollo.cache.normalized;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000e*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u000eB\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0018\u0010\r\u001a\u0006\u0012\u0002\b\u00030\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/OptimisticUpdatesContext;", "Lcom/apollographql/apollo/api/Mutation$Data;", "D", "Lcom/apollographql/apollo/api/ExecutionContext$Element;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/apollographql/apollo/api/Mutation$Data;)V", "Lcom/apollographql/apollo/api/Mutation$Data;", "getValue", "()Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "getKey", "()Lcom/apollographql/apollo/api/ExecutionContext$Key;", "key", "Key"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OptimisticUpdatesContext<D extends com.apollographql.apollo.api.Mutation.Data> implements com.apollographql.apollo.api.ExecutionContext.Element {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final com.apollographql.apollo.cache.normalized.OptimisticUpdatesContext.Companion INSTANCE = new com.apollographql.apollo.cache.normalized.OptimisticUpdatesContext.Companion(null);
    private final D value;

    public OptimisticUpdatesContext(D d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d, "");
        this.value = d;
    }

    public final D getValue() {
        return this.value;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext.Element
    public final com.apollographql.apollo.api.ExecutionContext.Key<?> getKey() {
        return INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/OptimisticUpdatesContext$Key;", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "Lcom/apollographql/apollo/cache/normalized/OptimisticUpdatesContext;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.apollographql.apollo.cache.normalized.OptimisticUpdatesContext$Key, reason: from kotlin metadata */
    /* loaded from: classes3.dex */
    public static final class Companion implements com.apollographql.apollo.api.ExecutionContext.Key<com.apollographql.apollo.cache.normalized.OptimisticUpdatesContext<?>> {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

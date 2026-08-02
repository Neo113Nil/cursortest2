package com.apollographql.apollo;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/apollographql/apollo/ConcurrencyInfo;", "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineScope;)V", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "getKey", "()Lcom/apollographql/apollo/api/ExecutionContext$Key;", "key", "Key"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConcurrencyInfo implements com.apollographql.apollo.api.ExecutionContext.Element {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final com.apollographql.apollo.ConcurrencyInfo.Companion INSTANCE = new com.apollographql.apollo.ConcurrencyInfo.Companion(null);
    private final kotlinx.coroutines.CoroutineScope coroutineScope;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher;

    public ConcurrencyInfo(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.dispatcher = coroutineDispatcher;
        this.coroutineScope = coroutineScope;
    }

    public final kotlinx.coroutines.CoroutineDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext.Element
    public final com.apollographql.apollo.api.ExecutionContext.Key<?> getKey() {
        return INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/apollographql/apollo/ConcurrencyInfo$Key;", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "Lcom/apollographql/apollo/ConcurrencyInfo;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.apollographql.apollo.ConcurrencyInfo$Key, reason: from kotlin metadata */
    /* loaded from: classes3.dex */
    public static final class Companion implements com.apollographql.apollo.api.ExecutionContext.Key<com.apollographql.apollo.ConcurrencyInfo> {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

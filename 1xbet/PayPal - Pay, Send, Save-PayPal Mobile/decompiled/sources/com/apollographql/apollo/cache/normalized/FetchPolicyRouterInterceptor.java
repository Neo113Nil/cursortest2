package com.apollographql.apollo.cache.normalized;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J;\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000b\"\b\b\u0000\u0010\u0006*\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/FetchPolicyRouterInterceptor;", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "Lcom/apollographql/apollo/cache/normalized/ApolloStoreInterceptor;", "<init>", "()V", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "request", "Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;", "chain", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "intercept", "(Lcom/apollographql/apollo/api/ApolloRequest;Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;)Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FetchPolicyRouterInterceptor implements com.apollographql.apollo.interceptor.ApolloInterceptor, com.apollographql.apollo.cache.normalized.ApolloStoreInterceptor {
    public static final com.apollographql.apollo.cache.normalized.FetchPolicyRouterInterceptor INSTANCE = new com.apollographql.apollo.cache.normalized.FetchPolicyRouterInterceptor();

    private FetchPolicyRouterInterceptor() {
    }

    @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
    public final <D extends com.apollographql.apollo.api.Operation.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> intercept(com.apollographql.apollo.api.ApolloRequest<D> request, com.apollographql.apollo.interceptor.ApolloInterceptorChain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        if (!(request.getOperation() instanceof com.apollographql.apollo.api.Query)) {
            return chain.proceed(request);
        }
        if (!com.apollographql.apollo.ConflatedResponsesKt.getConflateFetchPolicyInterceptorResponses(request)) {
            return com.apollographql.apollo.cache.normalized.NormalizedCache.getFetchPolicyInterceptor(request).intercept(request, chain);
        }
        return kotlinx.coroutines.flow.FlowKt.flow(new com.apollographql.apollo.cache.normalized.FetchPolicyRouterInterceptor$intercept$1(request, chain, null));
    }
}

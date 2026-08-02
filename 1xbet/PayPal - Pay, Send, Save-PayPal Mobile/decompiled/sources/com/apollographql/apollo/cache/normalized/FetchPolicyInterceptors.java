package com.apollographql.apollo.cache.normalized;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\f\"\u0017\u0010\u0001\u001a\u00020\u00008\u0007¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u001a\u0010\u0007\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0004"}, d2 = {"Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "CacheOnlyInterceptor", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "getCacheOnlyInterceptor", "()Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "NetworkOnlyInterceptor", "getNetworkOnlyInterceptor", "CacheFirstInterceptor", "getCacheFirstInterceptor", "NetworkFirstInterceptor", "getNetworkFirstInterceptor", "CacheAndNetworkInterceptor", "getCacheAndNetworkInterceptor"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FetchPolicyInterceptors {
    private static final com.apollographql.apollo.interceptor.ApolloInterceptor CacheOnlyInterceptor = new com.apollographql.apollo.interceptor.ApolloInterceptor() { // from class: com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$CacheOnlyInterceptor$1
        @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
        public final <D extends com.apollographql.apollo.api.Operation.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> intercept(com.apollographql.apollo.api.ApolloRequest<D> request, com.apollographql.apollo.interceptor.ApolloInterceptorChain chain) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
            return chain.proceed(com.apollographql.apollo.cache.normalized.NormalizedCache.fetchFromCache(request.newBuilder(), true).build());
        }
    };
    private static final com.apollographql.apollo.interceptor.ApolloInterceptor NetworkOnlyInterceptor = new com.apollographql.apollo.interceptor.ApolloInterceptor() { // from class: com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$NetworkOnlyInterceptor$1
        @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
        public final <D extends com.apollographql.apollo.api.Operation.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> intercept(com.apollographql.apollo.api.ApolloRequest<D> request, com.apollographql.apollo.interceptor.ApolloInterceptorChain chain) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
            return chain.proceed(request);
        }
    };
    private static final com.apollographql.apollo.interceptor.ApolloInterceptor CacheFirstInterceptor = new com.apollographql.apollo.interceptor.ApolloInterceptor() { // from class: com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$CacheFirstInterceptor$1
        @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
        public final <D extends com.apollographql.apollo.api.Operation.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> intercept(com.apollographql.apollo.api.ApolloRequest<D> request, com.apollographql.apollo.interceptor.ApolloInterceptorChain chain) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
            return kotlinx.coroutines.flow.FlowKt.flow(new com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1(chain, request, null));
        }
    };
    private static final com.apollographql.apollo.interceptor.ApolloInterceptor NetworkFirstInterceptor = new com.apollographql.apollo.interceptor.ApolloInterceptor() { // from class: com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1
        @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
        public final <D extends com.apollographql.apollo.api.Operation.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> intercept(com.apollographql.apollo.api.ApolloRequest<D> request, com.apollographql.apollo.interceptor.ApolloInterceptorChain chain) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
            return kotlinx.coroutines.flow.FlowKt.flow(new com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1(chain, request, null));
        }
    };
    private static final com.apollographql.apollo.interceptor.ApolloInterceptor CacheAndNetworkInterceptor = new com.apollographql.apollo.interceptor.ApolloInterceptor() { // from class: com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$CacheAndNetworkInterceptor$1
        @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
        public final <D extends com.apollographql.apollo.api.Operation.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> intercept(com.apollographql.apollo.api.ApolloRequest<D> request, com.apollographql.apollo.interceptor.ApolloInterceptorChain chain) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
            return kotlinx.coroutines.flow.FlowKt.flow(new com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1(chain, request, null));
        }
    };

    public static final com.apollographql.apollo.interceptor.ApolloInterceptor getCacheOnlyInterceptor() {
        return CacheOnlyInterceptor;
    }

    public static final com.apollographql.apollo.interceptor.ApolloInterceptor getNetworkOnlyInterceptor() {
        return NetworkOnlyInterceptor;
    }

    public static final com.apollographql.apollo.interceptor.ApolloInterceptor getCacheFirstInterceptor() {
        return CacheFirstInterceptor;
    }

    public static final com.apollographql.apollo.interceptor.ApolloInterceptor getNetworkFirstInterceptor() {
        return NetworkFirstInterceptor;
    }

    public static final com.apollographql.apollo.interceptor.ApolloInterceptor getCacheAndNetworkInterceptor() {
        return CacheAndNetworkInterceptor;
    }
}

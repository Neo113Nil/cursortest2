package com.apollographql.apollo.cache.normalized;

@kotlin.Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\u001a7\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a?\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\u0019\"\b\b\u0000\u0010\u0015*\u00020\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a7\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\u0019\"\b\b\u0000\u0010\u0015*\u00020\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0017\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001b\u0010\u001d\u001a-\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\u0019\"\b\b\u0000\u0010\u0015*\u00020\u0014*\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u001b\u0010\u001e\u001a7\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\u0019\"\b\b\u0000\u0010\u0015*\u00020\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00162\b\u0010\u001f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001b\u0010 \u001a9\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\u0019\"\b\b\u0000\u0010\u0015*\u00020\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00162\b\u0010\u001f\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b!\u0010 \u001a%\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&\u001a%\u0010'\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b'\u0010&\u001a%\u0010*\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+\u001a%\u0010,\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b,\u0010+\u001a\u0017\u0010.\u001a\u00020(2\u0006\u0010-\u001a\u00020$H\u0002¢\u0006\u0004\b.\u0010/\u001a%\u00100\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u00100\u001a\u00020\u0007¢\u0006\u0004\b0\u00101\u001a%\u00103\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u00102\u001a\u00020\u0007¢\u0006\u0004\b3\u00101\u001a-\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u00104\u001a\u00020\u0007H\u0007¢\u0006\u0004\b4\u00105\u001a%\u00106\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u00106\u001a\u00020\u0007¢\u0006\u0004\b6\u00101\u001a%\u00107\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u00107\u001a\u00020\u0007¢\u0006\u0004\b7\u00101\u001a%\u00108\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u00108\u001a\u00020\u0007¢\u0006\u0004\b8\u00101\u001a%\u0010:\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b:\u0010;\u001a%\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u00101\u001a/\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000=\"\b\b\u0000\u0010\u0015*\u00020<*\b\u0012\u0004\u0012\u00028\u00000=2\u0006\u0010\u001f\u001a\u00028\u0000¢\u0006\u0004\b>\u0010?\u001a/\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\b\b\u0000\u0010\u0015*\u00020<*\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u001f\u001a\u00028\u0000¢\u0006\u0004\b>\u0010@\u001a1\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\b\b\u0000\u0010\u0015*\u00020A*\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010C\u001a\u00020BH\u0000¢\u0006\u0004\bD\u0010E\u001a1\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000F\"\b\b\u0000\u0010\u0015*\u00020A*\b\u0012\u0004\u0012\u00028\u00000F2\u0006\u0010C\u001a\u00020BH\u0000¢\u0006\u0004\bC\u0010G\u001a1\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000=\"\b\b\u0000\u0010\u0015*\u00020A*\b\u0012\u0004\u0012\u00028\u00000=2\u0006\u0010H\u001a\u00020\u0007H\u0000¢\u0006\u0004\bH\u0010I\u001a/\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000F\"\b\b\u0000\u0010\u0015*\u00020A*\b\u0012\u0004\u0012\u00028\u00000F2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b:\u0010J\u001a/\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\u0019\"\b\b\u0000\u0010\u0015*\u00020\u0014*\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0007¢\u0006\u0004\bK\u0010\u001e\"\u0015\u0010O\u001a\u00020\u0011*\u00020L8G¢\u0006\u0006\u001a\u0004\bM\u0010N\"(\u0010*\u001a\u00020(\"\b\b\u0000\u0010\u0015*\u00020A*\b\u0012\u0004\u0012\u00028\u00000P8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R\"(\u0010*\u001a\u00020(\"\b\b\u0000\u0010\u0015*\u00020A*\b\u0012\u0004\u0012\u00028\u00000\u00168AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010S\"(\u00100\u001a\u00020\u0007\"\b\b\u0000\u0010\u0015*\u00020A*\b\u0012\u0004\u0012\u00028\u00000P8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U\"(\u00103\u001a\u00020\u0007\"\b\b\u0000\u0010\u0015*\u00020A*\b\u0012\u0004\u0012\u00028\u00000P8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bV\u0010U\"(\u00106\u001a\u00020\u0007\"\b\b\u0000\u0010\u0015*\u00020A*\b\u0012\u0004\u0012\u00028\u00000P8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bW\u0010U\"(\u00107\u001a\u00020\u0007\"\b\b\u0000\u0010\u0015*\u00020A*\b\u0012\u0004\u0012\u00028\u00000P8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010U\"(\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0015*\u00020A*\b\u0012\u0004\u0012\u00028\u00000P8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bY\u0010U\"*\u0010\\\u001a\u0004\u0018\u00010<\"\b\b\u0000\u0010\u0015*\u00020<*\b\u0012\u0004\u0012\u00028\u00000P8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[\"(\u0010:\u001a\u000209\"\b\b\u0000\u0010\u0015*\u00020A*\b\u0012\u0004\u0012\u00028\u00000P8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^\"*\u0010b\u001a\u0004\u0018\u00010_\"\b\b\u0000\u0010\u0015*\u00020A*\b\u0012\u0004\u0012\u00028\u00000P8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b`\u0010a\"%\u0010c\u001a\u00020\u0007\"\b\b\u0000\u0010\u0015*\u00020A*\b\u0012\u0004\u0012\u00028\u00000\u001a8G¢\u0006\u0006\u001a\u0004\bc\u0010d\"'\u0010C\u001a\u0004\u0018\u00010B\"\b\b\u0000\u0010\u0015*\u00020A*\b\u0012\u0004\u0012\u00028\u00000\u001a8G¢\u0006\u0006\u001a\u0004\be\u0010f\"(\u0010H\u001a\u00020\u0007\"\b\b\u0000\u0010\u0015*\u00020A*\b\u0012\u0004\u0012\u00028\u00000P8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bg\u0010U\"%\u0010:\u001a\u000209\"\b\b\u0000\u0010\u0015*\u00020A*\b\u0012\u0004\u0012\u00028\u00000\u001a8G¢\u0006\u0006\u001a\u0004\b]\u0010h"}, d2 = {"Lcom/apollographql/apollo/ApolloClient$Builder;", "Lcom/apollographql/apollo/cache/normalized/api/NormalizedCacheFactory;", "normalizedCacheFactory", "Lcom/apollographql/apollo/cache/normalized/api/CacheKeyGenerator;", "cacheKeyGenerator", "Lcom/apollographql/apollo/cache/normalized/api/CacheResolver;", "cacheResolver", "", "writeToCacheAsynchronously", "configureApolloClientBuilder", "(Lcom/apollographql/apollo/ApolloClient$Builder;Lcom/apollographql/apollo/cache/normalized/api/NormalizedCacheFactory;Lcom/apollographql/apollo/cache/normalized/api/CacheKeyGenerator;Lcom/apollographql/apollo/cache/normalized/api/CacheResolver;Z)Lcom/apollographql/apollo/ApolloClient$Builder;", "Lkotlin/Function1;", "", "", "log", "-logCacheMisses", "(Lcom/apollographql/apollo/ApolloClient$Builder;Lkotlin/jvm/functions/Function1;)Lcom/apollographql/apollo/ApolloClient$Builder;", "Lcom/apollographql/apollo/cache/normalized/ApolloStore;", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "(Lcom/apollographql/apollo/ApolloClient$Builder;Lcom/apollographql/apollo/cache/normalized/ApolloStore;Z)Lcom/apollographql/apollo/ApolloClient$Builder;", "Lcom/apollographql/apollo/api/Query$Data;", "D", "Lcom/apollographql/apollo/ApolloCall;", "fetchThrows", "refetchThrows", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "watch", "(Lcom/apollographql/apollo/ApolloCall;ZZ)Lkotlinx/coroutines/flow/Flow;", "(Lcom/apollographql/apollo/ApolloCall;Z)Lkotlinx/coroutines/flow/Flow;", "(Lcom/apollographql/apollo/ApolloCall;)Lkotlinx/coroutines/flow/Flow;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/apollographql/apollo/ApolloCall;Lcom/apollographql/apollo/api/Query$Data;)Lkotlinx/coroutines/flow/Flow;", "watchInternal", "T", "Lcom/apollographql/apollo/api/MutableExecutionOptions;", "Lcom/apollographql/apollo/cache/normalized/FetchPolicy;", "fetchPolicy", "(Lcom/apollographql/apollo/api/MutableExecutionOptions;Lcom/apollographql/apollo/cache/normalized/FetchPolicy;)Ljava/lang/Object;", "refetchPolicy", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "interceptor", "fetchPolicyInterceptor", "(Lcom/apollographql/apollo/api/MutableExecutionOptions;Lcom/apollographql/apollo/interceptor/ApolloInterceptor;)Ljava/lang/Object;", "refetchPolicyInterceptor", "p0", "getHighSpeedVideoFpsRangesFor", "(Lcom/apollographql/apollo/cache/normalized/FetchPolicy;)Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "doNotStore", "(Lcom/apollographql/apollo/api/MutableExecutionOptions;Z)Ljava/lang/Object;", "memoryOnly", "memoryCacheOnly", "emitCacheMisses", "(Lcom/apollographql/apollo/api/MutableExecutionOptions;Z)Lcom/apollographql/apollo/api/MutableExecutionOptions;", "storePartialResponses", "storeReceiveDate", "storeExpirationDate", "Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;", "cacheHeaders", "(Lcom/apollographql/apollo/api/MutableExecutionOptions;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/apollographql/apollo/api/ApolloRequest$Builder;", "optimisticUpdates", "(Lcom/apollographql/apollo/api/ApolloRequest$Builder;Lcom/apollographql/apollo/api/Mutation$Data;)Lcom/apollographql/apollo/api/ApolloRequest$Builder;", "(Lcom/apollographql/apollo/ApolloCall;Lcom/apollographql/apollo/api/Mutation$Data;)Lcom/apollographql/apollo/ApolloCall;", "Lcom/apollographql/apollo/api/Operation$Data;", "Lcom/apollographql/apollo/cache/normalized/CacheInfo;", "cacheInfo", "withCacheInfo", "(Lcom/apollographql/apollo/api/ApolloResponse;Lcom/apollographql/apollo/cache/normalized/CacheInfo;)Lcom/apollographql/apollo/api/ApolloResponse;", "Lcom/apollographql/apollo/api/ApolloResponse$Builder;", "(Lcom/apollographql/apollo/api/ApolloResponse$Builder;Lcom/apollographql/apollo/cache/normalized/CacheInfo;)Lcom/apollographql/apollo/api/ApolloResponse$Builder;", "fetchFromCache", "(Lcom/apollographql/apollo/api/ApolloRequest$Builder;Z)Lcom/apollographql/apollo/api/ApolloRequest$Builder;", "(Lcom/apollographql/apollo/api/ApolloResponse$Builder;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)Lcom/apollographql/apollo/api/ApolloResponse$Builder;", "executeCacheAndNetwork", "Lcom/apollographql/apollo/ApolloClient;", "getApolloStore", "(Lcom/apollographql/apollo/ApolloClient;)Lcom/apollographql/apollo/cache/normalized/ApolloStore;", "apolloStore", "Lcom/apollographql/apollo/api/ApolloRequest;", "getFetchPolicyInterceptor", "(Lcom/apollographql/apollo/api/ApolloRequest;)Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "(Lcom/apollographql/apollo/ApolloCall;)Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "getDoNotStore", "(Lcom/apollographql/apollo/api/ApolloRequest;)Z", "getMemoryCacheOnly", "getStorePartialResponses", "getStoreReceiveDate", "getWriteToCacheAsynchronously", "getOptimisticData", "(Lcom/apollographql/apollo/api/ApolloRequest;)Lcom/apollographql/apollo/api/Mutation$Data;", "optimisticData", "getCacheHeaders", "(Lcom/apollographql/apollo/api/ApolloRequest;)Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;", "Lcom/apollographql/apollo/cache/normalized/WatchContext;", "getWatchContext", "(Lcom/apollographql/apollo/api/ApolloRequest;)Lcom/apollographql/apollo/cache/normalized/WatchContext;", "watchContext", "isFromCache", "(Lcom/apollographql/apollo/api/ApolloResponse;)Z", "getCacheInfo", "(Lcom/apollographql/apollo/api/ApolloResponse;)Lcom/apollographql/apollo/cache/normalized/CacheInfo;", "getFetchFromCache", "(Lcom/apollographql/apollo/api/ApolloResponse;)Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NormalizedCache {
    public static /* synthetic */ com.apollographql.apollo.ApolloClient.Builder configureApolloClientBuilder$default(com.apollographql.apollo.ApolloClient.Builder builder, com.apollographql.apollo.cache.normalized.api.NormalizedCacheFactory normalizedCacheFactory, com.apollographql.apollo.cache.normalized.api.CacheKeyGenerator cacheKeyGenerator, com.apollographql.apollo.cache.normalized.api.CacheResolver cacheResolver, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            cacheKeyGenerator = com.apollographql.apollo.cache.normalized.api.TypePolicyCacheKeyGenerator.INSTANCE;
        }
        if ((i & 4) != 0) {
            cacheResolver = com.apollographql.apollo.cache.normalized.api.FieldPolicyCacheResolver.INSTANCE;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return configureApolloClientBuilder(builder, normalizedCacheFactory, cacheKeyGenerator, cacheResolver, z);
    }

    public static final com.apollographql.apollo.ApolloClient.Builder configureApolloClientBuilder(com.apollographql.apollo.ApolloClient.Builder builder, com.apollographql.apollo.cache.normalized.api.NormalizedCacheFactory normalizedCacheFactory, com.apollographql.apollo.cache.normalized.api.CacheKeyGenerator cacheKeyGenerator, com.apollographql.apollo.cache.normalized.api.CacheResolver cacheResolver, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(normalizedCacheFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheKeyGenerator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheResolver, "");
        return store(builder, com.apollographql.apollo.cache.normalized.ApolloStoreKt.ApolloStore(normalizedCacheFactory, cacheKeyGenerator, cacheResolver), z);
    }

    /* renamed from: -logCacheMisses$default, reason: not valid java name */
    public static /* synthetic */ com.apollographql.apollo.ApolloClient.Builder m9957logCacheMisses$default(com.apollographql.apollo.ApolloClient.Builder builder, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.cache.normalized.NormalizedCache$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.apollographql.apollo.cache.normalized.NormalizedCache.$r8$lambda$YwMlRX69mS41XXBJmqiG3sQZ9hI((java.lang.String) obj2);
                }
            };
        }
        return m9956logCacheMisses(builder, function1);
    }

    /* renamed from: -logCacheMisses, reason: not valid java name */
    public static final com.apollographql.apollo.ApolloClient.Builder m9956logCacheMisses(com.apollographql.apollo.ApolloClient.Builder builder, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.List<com.apollographql.apollo.interceptor.ApolloInterceptor> interceptors = builder.getInterceptors();
        if (!(interceptors instanceof java.util.Collection) || !interceptors.isEmpty()) {
            java.util.Iterator<T> it = interceptors.iterator();
            while (it.hasNext()) {
                if (((com.apollographql.apollo.interceptor.ApolloInterceptor) it.next()) instanceof com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor) {
                    throw new java.lang.IllegalStateException("Apollo: logCacheMisses() must be called before setting up your normalized cache".toString());
                }
            }
        }
        return builder.addInterceptor(new com.apollographql.apollo.cache.normalized.CacheMissLoggingInterceptor(function1));
    }

    public static /* synthetic */ com.apollographql.apollo.ApolloClient.Builder store$default(com.apollographql.apollo.ApolloClient.Builder builder, com.apollographql.apollo.cache.normalized.ApolloStore apolloStore, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return store(builder, apolloStore, z);
    }

    public static final com.apollographql.apollo.ApolloClient.Builder store(com.apollographql.apollo.ApolloClient.Builder builder, com.apollographql.apollo.cache.normalized.ApolloStore apolloStore, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloStore, "");
        java.util.List<com.apollographql.apollo.interceptor.ApolloInterceptor> interceptors = builder.getInterceptors();
        if (!(interceptors instanceof java.util.Collection) || !interceptors.isEmpty()) {
            java.util.Iterator<T> it = interceptors.iterator();
            while (it.hasNext()) {
                if (((com.apollographql.apollo.interceptor.ApolloInterceptor) it.next()) instanceof com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor) {
                    throw new java.lang.IllegalStateException("Apollo: the normalized cache must be configured before the auto persisted queries".toString());
                }
            }
        }
        java.util.List<com.apollographql.apollo.interceptor.ApolloInterceptor> interceptors2 = builder.getInterceptors();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : interceptors2) {
            if (obj instanceof com.apollographql.apollo.cache.normalized.ApolloStoreInterceptor) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            builder.removeInterceptor((com.apollographql.apollo.cache.normalized.ApolloStoreInterceptor) it2.next());
        }
        return ((com.apollographql.apollo.ApolloClient.Builder) writeToCacheAsynchronously(builder.addInterceptor(new com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor(apolloStore)).addInterceptor(com.apollographql.apollo.cache.normalized.FetchPolicyRouterInterceptor.INSTANCE).addInterceptor(new com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor(apolloStore)), z)).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.apollographql.apollo.CacheDumpProviderContext(com.apollographql.apollo.cache.normalized.ApolloStoreKt.cacheDumpProvider(apolloStore)));
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Exceptions no longer throw", replaceWith = @kotlin.ReplaceWith(expression = "watch()", imports = {}))
    public static final <D extends com.apollographql.apollo.api.Query.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> watch(com.apollographql.apollo.ApolloCall<D> apolloCall, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloCall, "");
        throw new java.lang.UnsupportedOperationException("watch(fetchThrows: Boolean, refetchThrows: Boolean) is no longer supported, use watch() instead");
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Exceptions no longer throw", replaceWith = @kotlin.ReplaceWith(expression = "watch()", imports = {}))
    public static final <D extends com.apollographql.apollo.api.Query.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> watch(com.apollographql.apollo.ApolloCall<D> apolloCall, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloCall, "");
        throw new java.lang.UnsupportedOperationException("watch(fetchThrows: Boolean, refetchThrows: Boolean) is no longer supported, use watch() instead");
    }

    public static final <D extends com.apollographql.apollo.api.Query.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> watch(com.apollographql.apollo.ApolloCall<D> apolloCall) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloCall, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1(apolloCall, null));
    }

    public static final <D extends com.apollographql.apollo.api.Query.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> watch(com.apollographql.apollo.ApolloCall<D> apolloCall, D d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloCall, "");
        final kotlinx.coroutines.flow.Flow watchInternal = watchInternal(apolloCall, d);
        return (kotlinx.coroutines.flow.Flow) new kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>>() { // from class: com.apollographql.apollo.cache.normalized.NormalizedCache$watch$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.apollographql.apollo.cache.normalized.NormalizedCache$watch$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.apollographql.apollo.cache.normalized.NormalizedCache$watch$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.apollographql.apollo.cache.normalized.NormalizedCache$watch$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.apollographql.apollo.cache.normalized.NormalizedCache$watch$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.apollographql.apollo.cache.normalized.NormalizedCache$watch$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.Camera2StreamConfigurationMap -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.Camera2StreamConfigurationMap;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoSizes;
                                if (((com.apollographql.apollo.api.ApolloResponse) obj).exception != com.apollographql.apollo.cache.normalized.internal.WatcherInterceptorKt.getWatcherSentinel()) {
                                    anonymousClass1.Camera2StreamConfigurationMap = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.apollographql.apollo.cache.normalized.NormalizedCache$watch$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.NormalizedCache$watch$$inlined$filter$1$2", f = "ClientCacheExtensions.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.apollographql.apollo.cache.normalized.NormalizedCache$watch$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int Camera2StreamConfigurationMap;
                    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighResolutionOutputSizeshNQ4ISI = obj;
                        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
                        return com.apollographql.apollo.cache.normalized.NormalizedCache$watch$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.getHighSpeedVideoSizes = flowCollector;
                }
            }
        };
    }

    public static final <D extends com.apollographql.apollo.api.Query.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> watchInternal(com.apollographql.apollo.ApolloCall<D> apolloCall, D d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloCall, "");
        return apolloCall.copy().addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.apollographql.apollo.cache.normalized.WatchContext(d)).toFlow();
    }

    public static final com.apollographql.apollo.cache.normalized.ApolloStore getApolloStore(com.apollographql.apollo.ApolloClient apolloClient) {
        java.lang.Object obj;
        com.apollographql.apollo.cache.normalized.ApolloStore store;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        java.util.Iterator<T> it = apolloClient.getInterceptors().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.apollographql.apollo.interceptor.ApolloInterceptor) obj) instanceof com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor) {
                break;
            }
        }
        com.apollographql.apollo.interceptor.ApolloInterceptor apolloInterceptor = (com.apollographql.apollo.interceptor.ApolloInterceptor) obj;
        if (apolloInterceptor == null || (store = ((com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor) apolloInterceptor).getStore()) == null) {
            throw new java.lang.IllegalStateException("no cache configured".toString());
        }
        return store;
    }

    public static final <T> T fetchPolicy(com.apollographql.apollo.api.MutableExecutionOptions<T> mutableExecutionOptions, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableExecutionOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchPolicy, "");
        return mutableExecutionOptions.addExecutionContext(new com.apollographql.apollo.cache.normalized.FetchPolicyContext(getHighSpeedVideoFpsRangesFor(fetchPolicy)));
    }

    public static final <T> T refetchPolicy(com.apollographql.apollo.api.MutableExecutionOptions<T> mutableExecutionOptions, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableExecutionOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchPolicy, "");
        return mutableExecutionOptions.addExecutionContext(new com.apollographql.apollo.cache.normalized.RefetchPolicyContext(getHighSpeedVideoFpsRangesFor(fetchPolicy)));
    }

    public static final <T> T fetchPolicyInterceptor(com.apollographql.apollo.api.MutableExecutionOptions<T> mutableExecutionOptions, com.apollographql.apollo.interceptor.ApolloInterceptor apolloInterceptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableExecutionOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloInterceptor, "");
        return mutableExecutionOptions.addExecutionContext(new com.apollographql.apollo.cache.normalized.FetchPolicyContext(apolloInterceptor));
    }

    public static final <T> T refetchPolicyInterceptor(com.apollographql.apollo.api.MutableExecutionOptions<T> mutableExecutionOptions, com.apollographql.apollo.interceptor.ApolloInterceptor apolloInterceptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableExecutionOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloInterceptor, "");
        return mutableExecutionOptions.addExecutionContext(new com.apollographql.apollo.cache.normalized.RefetchPolicyContext(apolloInterceptor));
    }

    private static final com.apollographql.apollo.interceptor.ApolloInterceptor getHighSpeedVideoFpsRangesFor(com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy) {
        int i = com.apollographql.apollo.cache.normalized.NormalizedCache.WhenMappings.$EnumSwitchMapping$0[fetchPolicy.ordinal()];
        if (i == 1) {
            return com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors.getCacheOnlyInterceptor();
        }
        if (i == 2) {
            return com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors.getNetworkOnlyInterceptor();
        }
        if (i == 3) {
            return com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors.getCacheFirstInterceptor();
        }
        if (i == 4) {
            return com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors.getNetworkFirstInterceptor();
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors.getCacheAndNetworkInterceptor();
    }

    public static final <T> T doNotStore(com.apollographql.apollo.api.MutableExecutionOptions<T> mutableExecutionOptions, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableExecutionOptions, "");
        return mutableExecutionOptions.addExecutionContext(new com.apollographql.apollo.cache.normalized.DoNotStoreContext(z));
    }

    public static final <T> T memoryCacheOnly(com.apollographql.apollo.api.MutableExecutionOptions<T> mutableExecutionOptions, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableExecutionOptions, "");
        return mutableExecutionOptions.addExecutionContext(new com.apollographql.apollo.cache.normalized.MemoryCacheOnlyContext(z));
    }

    public static final <T> T storePartialResponses(com.apollographql.apollo.api.MutableExecutionOptions<T> mutableExecutionOptions, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableExecutionOptions, "");
        return mutableExecutionOptions.addExecutionContext(new com.apollographql.apollo.cache.normalized.StorePartialResponsesContext(z));
    }

    public static final <T> T storeReceiveDate(com.apollographql.apollo.api.MutableExecutionOptions<T> mutableExecutionOptions, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableExecutionOptions, "");
        return mutableExecutionOptions.addExecutionContext(new com.apollographql.apollo.cache.normalized.StoreReceiveDateContext(z));
    }

    public static final <T> T storeExpirationDate(com.apollographql.apollo.api.MutableExecutionOptions<T> mutableExecutionOptions, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableExecutionOptions, "");
        mutableExecutionOptions.addExecutionContext(new com.apollographql.apollo.cache.normalized.StoreExpirationDateContext(z));
        if (mutableExecutionOptions instanceof com.apollographql.apollo.ApolloClient.Builder) {
            com.apollographql.apollo.ApolloClient.Builder builder = (com.apollographql.apollo.ApolloClient.Builder) mutableExecutionOptions;
            java.util.List<com.apollographql.apollo.interceptor.ApolloInterceptor> interceptors = builder.getInterceptors();
            if (!(interceptors instanceof java.util.Collection) || !interceptors.isEmpty()) {
                java.util.Iterator<T> it = interceptors.iterator();
                while (it.hasNext()) {
                    if (((com.apollographql.apollo.interceptor.ApolloInterceptor) it.next()) instanceof com.apollographql.apollo.cache.normalized.StoreExpirationInterceptor) {
                        throw new java.lang.IllegalStateException("Apollo: storeExpirationDate() can only be called once on ApolloClient.Builder()".toString());
                    }
                }
            }
            builder.addInterceptor(new com.apollographql.apollo.cache.normalized.StoreExpirationInterceptor());
        }
        return mutableExecutionOptions;
    }

    public static final <T> T cacheHeaders(com.apollographql.apollo.api.MutableExecutionOptions<T> mutableExecutionOptions, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableExecutionOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        return mutableExecutionOptions.addExecutionContext(new com.apollographql.apollo.cache.normalized.CacheHeadersContext(cacheHeaders));
    }

    public static final <T> T writeToCacheAsynchronously(com.apollographql.apollo.api.MutableExecutionOptions<T> mutableExecutionOptions, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableExecutionOptions, "");
        return mutableExecutionOptions.addExecutionContext(new com.apollographql.apollo.cache.normalized.WriteToCacheAsynchronouslyContext(z));
    }

    public static final <D extends com.apollographql.apollo.api.Mutation.Data> com.apollographql.apollo.api.ApolloRequest.Builder<D> optimisticUpdates(com.apollographql.apollo.api.ApolloRequest.Builder<D> builder, D d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d, "");
        return builder.addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.apollographql.apollo.cache.normalized.OptimisticUpdatesContext(d));
    }

    public static final <D extends com.apollographql.apollo.api.Mutation.Data> com.apollographql.apollo.ApolloCall<D> optimisticUpdates(com.apollographql.apollo.ApolloCall<D> apolloCall, D d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d, "");
        return apolloCall.addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.apollographql.apollo.cache.normalized.OptimisticUpdatesContext(d));
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.interceptor.ApolloInterceptor getFetchPolicyInterceptor(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest) {
        com.apollographql.apollo.interceptor.ApolloInterceptor interceptor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloRequest, "");
        com.apollographql.apollo.cache.normalized.FetchPolicyContext fetchPolicyContext = (com.apollographql.apollo.cache.normalized.FetchPolicyContext) apolloRequest.getExecutionContext().get(com.apollographql.apollo.cache.normalized.FetchPolicyContext.INSTANCE);
        return (fetchPolicyContext == null || (interceptor = fetchPolicyContext.getInterceptor()) == null) ? com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors.getCacheFirstInterceptor() : interceptor;
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.interceptor.ApolloInterceptor getFetchPolicyInterceptor(com.apollographql.apollo.ApolloCall<D> apolloCall) {
        com.apollographql.apollo.interceptor.ApolloInterceptor interceptor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloCall, "");
        com.apollographql.apollo.cache.normalized.FetchPolicyContext fetchPolicyContext = (com.apollographql.apollo.cache.normalized.FetchPolicyContext) apolloCall.getExecutionContext().get(com.apollographql.apollo.cache.normalized.FetchPolicyContext.INSTANCE);
        return (fetchPolicyContext == null || (interceptor = fetchPolicyContext.getInterceptor()) == null) ? com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors.getCacheFirstInterceptor() : interceptor;
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> boolean getDoNotStore(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloRequest, "");
        com.apollographql.apollo.cache.normalized.DoNotStoreContext doNotStoreContext = (com.apollographql.apollo.cache.normalized.DoNotStoreContext) apolloRequest.getExecutionContext().get(com.apollographql.apollo.cache.normalized.DoNotStoreContext.INSTANCE);
        if (doNotStoreContext != null) {
            return doNotStoreContext.getValue();
        }
        return false;
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> boolean getMemoryCacheOnly(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloRequest, "");
        com.apollographql.apollo.cache.normalized.MemoryCacheOnlyContext memoryCacheOnlyContext = (com.apollographql.apollo.cache.normalized.MemoryCacheOnlyContext) apolloRequest.getExecutionContext().get(com.apollographql.apollo.cache.normalized.MemoryCacheOnlyContext.INSTANCE);
        if (memoryCacheOnlyContext != null) {
            return memoryCacheOnlyContext.getValue();
        }
        return false;
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> boolean getStorePartialResponses(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloRequest, "");
        com.apollographql.apollo.cache.normalized.StorePartialResponsesContext storePartialResponsesContext = (com.apollographql.apollo.cache.normalized.StorePartialResponsesContext) apolloRequest.getExecutionContext().get(com.apollographql.apollo.cache.normalized.StorePartialResponsesContext.INSTANCE);
        if (storePartialResponsesContext != null) {
            return storePartialResponsesContext.getValue();
        }
        return false;
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> boolean getStoreReceiveDate(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloRequest, "");
        com.apollographql.apollo.cache.normalized.StoreReceiveDateContext storeReceiveDateContext = (com.apollographql.apollo.cache.normalized.StoreReceiveDateContext) apolloRequest.getExecutionContext().get(com.apollographql.apollo.cache.normalized.StoreReceiveDateContext.INSTANCE);
        if (storeReceiveDateContext != null) {
            return storeReceiveDateContext.getValue();
        }
        return false;
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> boolean getWriteToCacheAsynchronously(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloRequest, "");
        com.apollographql.apollo.cache.normalized.WriteToCacheAsynchronouslyContext writeToCacheAsynchronouslyContext = (com.apollographql.apollo.cache.normalized.WriteToCacheAsynchronouslyContext) apolloRequest.getExecutionContext().get(com.apollographql.apollo.cache.normalized.WriteToCacheAsynchronouslyContext.INSTANCE);
        if (writeToCacheAsynchronouslyContext != null) {
            return writeToCacheAsynchronouslyContext.getValue();
        }
        return false;
    }

    public static final <D extends com.apollographql.apollo.api.Mutation.Data> com.apollographql.apollo.api.Mutation.Data getOptimisticData(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloRequest, "");
        com.apollographql.apollo.cache.normalized.OptimisticUpdatesContext optimisticUpdatesContext = (com.apollographql.apollo.cache.normalized.OptimisticUpdatesContext) apolloRequest.getExecutionContext().get(com.apollographql.apollo.cache.normalized.OptimisticUpdatesContext.INSTANCE);
        if (optimisticUpdatesContext != null) {
            return optimisticUpdatesContext.getValue();
        }
        return null;
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.cache.normalized.api.CacheHeaders getCacheHeaders(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest) {
        com.apollographql.apollo.cache.normalized.api.CacheHeaders value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloRequest, "");
        com.apollographql.apollo.cache.normalized.CacheHeadersContext cacheHeadersContext = (com.apollographql.apollo.cache.normalized.CacheHeadersContext) apolloRequest.getExecutionContext().get(com.apollographql.apollo.cache.normalized.CacheHeadersContext.INSTANCE);
        return (cacheHeadersContext == null || (value = cacheHeadersContext.getValue()) == null) ? com.apollographql.apollo.cache.normalized.api.CacheHeaders.NONE : value;
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.cache.normalized.WatchContext getWatchContext(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloRequest, "");
        return (com.apollographql.apollo.cache.normalized.WatchContext) apolloRequest.getExecutionContext().get(com.apollographql.apollo.cache.normalized.WatchContext.INSTANCE);
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> boolean isFromCache(com.apollographql.apollo.api.ApolloResponse<D> apolloResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloResponse, "");
        com.apollographql.apollo.cache.normalized.CacheInfo cacheInfo = getCacheInfo(apolloResponse);
        return (cacheInfo != null && cacheInfo.isCacheHit()) || (apolloResponse.exception instanceof com.apollographql.apollo.exception.CacheMissException);
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.cache.normalized.CacheInfo getCacheInfo(com.apollographql.apollo.api.ApolloResponse<D> apolloResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloResponse, "");
        return (com.apollographql.apollo.cache.normalized.CacheInfo) apolloResponse.executionContext.get(com.apollographql.apollo.cache.normalized.CacheInfo.INSTANCE);
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.ApolloResponse<D> withCacheInfo(com.apollographql.apollo.api.ApolloResponse<D> apolloResponse, com.apollographql.apollo.cache.normalized.CacheInfo cacheInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheInfo, "");
        return apolloResponse.newBuilder().addExecutionContext(cacheInfo).build();
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.ApolloResponse.Builder<D> cacheInfo(com.apollographql.apollo.api.ApolloResponse.Builder<D> builder, com.apollographql.apollo.cache.normalized.CacheInfo cacheInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheInfo, "");
        return builder.addExecutionContext(cacheInfo);
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.ApolloRequest.Builder<D> fetchFromCache(com.apollographql.apollo.api.ApolloRequest.Builder<D> builder, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.apollographql.apollo.cache.normalized.FetchFromCacheContext(z));
        return builder;
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> boolean getFetchFromCache(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloRequest, "");
        com.apollographql.apollo.cache.normalized.FetchFromCacheContext fetchFromCacheContext = (com.apollographql.apollo.cache.normalized.FetchFromCacheContext) apolloRequest.getExecutionContext().get(com.apollographql.apollo.cache.normalized.FetchFromCacheContext.INSTANCE);
        if (fetchFromCacheContext != null) {
            return fetchFromCacheContext.getValue();
        }
        return false;
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.ApolloResponse.Builder<D> cacheHeaders(com.apollographql.apollo.api.ApolloResponse.Builder<D> builder, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        return builder.addExecutionContext(new com.apollographql.apollo.cache.normalized.CacheHeadersContext(cacheHeaders));
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.cache.normalized.api.CacheHeaders getCacheHeaders(com.apollographql.apollo.api.ApolloResponse<D> apolloResponse) {
        com.apollographql.apollo.cache.normalized.api.CacheHeaders value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloResponse, "");
        com.apollographql.apollo.cache.normalized.CacheHeadersContext cacheHeadersContext = (com.apollographql.apollo.cache.normalized.CacheHeadersContext) apolloResponse.executionContext.get(com.apollographql.apollo.cache.normalized.CacheHeadersContext.INSTANCE);
        return (cacheHeadersContext == null || (value = cacheHeadersContext.getValue()) == null) ? com.apollographql.apollo.cache.normalized.api.CacheHeaders.NONE : value;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use fetchPolicy(FetchPolicy.CacheAndNetwork) instead", replaceWith = @kotlin.ReplaceWith(expression = "fetchPolicy(FetchPolicy.CacheAndNetwork).toFlow()", imports = {}))
    public static final <D extends com.apollographql.apollo.api.Query.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> executeCacheAndNetwork(com.apollographql.apollo.ApolloCall<D> apolloCall) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloCall, "");
        throw new kotlin.NotImplementedError(null, 1, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YwMlRX69mS41XXBJmqiG3sQZ9hI(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.System.out.println((java.lang.Object) str);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.apollographql.apollo.interceptor.ApolloInterceptor access$getRefetchPolicyInterceptor(com.apollographql.apollo.api.MutableExecutionOptions mutableExecutionOptions) {
        com.apollographql.apollo.interceptor.ApolloInterceptor interceptor;
        com.apollographql.apollo.cache.normalized.RefetchPolicyContext refetchPolicyContext = (com.apollographql.apollo.cache.normalized.RefetchPolicyContext) mutableExecutionOptions.getExecutionContext().get(com.apollographql.apollo.cache.normalized.RefetchPolicyContext.INSTANCE);
        return (refetchPolicyContext == null || (interceptor = refetchPolicyContext.getInterceptor()) == null) ? com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors.getCacheOnlyInterceptor() : interceptor;
    }

    @kotlin.Deprecated(message = "Emitting cache misses is now the default behavior, this method is a no-op", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public static final <T> com.apollographql.apollo.api.MutableExecutionOptions<T> emitCacheMisses(com.apollographql.apollo.api.MutableExecutionOptions<T> mutableExecutionOptions, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableExecutionOptions, "");
        return mutableExecutionOptions;
    }

    public static final com.apollographql.apollo.ApolloClient.Builder configureApolloClientBuilder(com.apollographql.apollo.ApolloClient.Builder builder, com.apollographql.apollo.cache.normalized.api.NormalizedCacheFactory normalizedCacheFactory, com.apollographql.apollo.cache.normalized.api.CacheKeyGenerator cacheKeyGenerator, com.apollographql.apollo.cache.normalized.api.CacheResolver cacheResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(normalizedCacheFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheKeyGenerator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheResolver, "");
        return configureApolloClientBuilder$default(builder, normalizedCacheFactory, cacheKeyGenerator, cacheResolver, false, 8, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.apollographql.apollo.cache.normalized.FetchPolicy.values().length];
            try {
                iArr[com.apollographql.apollo.cache.normalized.FetchPolicy.CacheOnly.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.apollographql.apollo.cache.normalized.FetchPolicy.CacheFirst.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.apollographql.apollo.cache.normalized.FetchPolicy.CacheAndNetwork.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final com.apollographql.apollo.ApolloClient.Builder configureApolloClientBuilder(com.apollographql.apollo.ApolloClient.Builder builder, com.apollographql.apollo.cache.normalized.api.NormalizedCacheFactory normalizedCacheFactory, com.apollographql.apollo.cache.normalized.api.CacheKeyGenerator cacheKeyGenerator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(normalizedCacheFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheKeyGenerator, "");
        return configureApolloClientBuilder$default(builder, normalizedCacheFactory, cacheKeyGenerator, null, false, 12, null);
    }

    public static final com.apollographql.apollo.ApolloClient.Builder configureApolloClientBuilder(com.apollographql.apollo.ApolloClient.Builder builder, com.apollographql.apollo.cache.normalized.api.NormalizedCacheFactory normalizedCacheFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(normalizedCacheFactory, "");
        return configureApolloClientBuilder$default(builder, normalizedCacheFactory, null, null, false, 14, null);
    }
}

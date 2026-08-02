package com.apollographql.apollo.cache.normalized.internal;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$maybeWriteToCache$2", f = "ApolloCacheInterceptor.kt", i = {}, l = {85, 89}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class ApolloCacheInterceptor$maybeWriteToCache$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.apollographql.apollo.api.ApolloRequest<D> Camera2StreamConfigurationMap;
    final /* synthetic */ com.apollographql.apollo.api.ApolloResponse<D> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.apollographql.apollo.api.CustomScalarAdapters getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor getHighSpeedVideoSizesFor;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a8, code lost:
    
        if (r11.getHighSpeedVideoSizesFor.getStore().publish(kotlin.collections.SetsKt.plus(r12, (java.lang.Iterable) r11.getHighSpeedVideoFpsRanges), r11) != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00aa, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        if (r12 != r0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Set emptySet;
        com.apollographql.apollo.cache.normalized.api.CacheHeaders build;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.getHighResolutionOutputSizeshNQ4ISI.data != 0) {
                com.apollographql.apollo.cache.normalized.api.CacheHeaders plus = com.apollographql.apollo.cache.normalized.NormalizedCache.getCacheHeaders(this.Camera2StreamConfigurationMap).plus(com.apollographql.apollo.cache.normalized.NormalizedCache.getCacheHeaders(this.getHighResolutionOutputSizeshNQ4ISI));
                if (com.apollographql.apollo.cache.normalized.NormalizedCache.getStoreReceiveDate(this.Camera2StreamConfigurationMap)) {
                    com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor.Companion companion = com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor.INSTANCE;
                    build = new com.apollographql.apollo.cache.normalized.api.CacheHeaders.Builder().addHeader(com.apollographql.apollo.cache.normalized.api.ApolloCacheHeaders.DATE, java.lang.String.valueOf(com.apollographql.apollo.mpp.UtilsKt.currentTimeMillis() / 1000)).build();
                    plus = plus.plus(build);
                }
                if (com.apollographql.apollo.cache.normalized.NormalizedCache.getMemoryCacheOnly(this.Camera2StreamConfigurationMap)) {
                    plus = plus.plus(new com.apollographql.apollo.cache.normalized.api.CacheHeaders.Builder().addHeader(com.apollographql.apollo.cache.normalized.api.ApolloCacheHeaders.MEMORY_CACHE_ONLY, "true").build());
                }
                com.apollographql.apollo.cache.normalized.ApolloStore store = this.getHighSpeedVideoSizesFor.getStore();
                com.apollographql.apollo.api.Operation operation = this.Camera2StreamConfigurationMap.getOperation();
                D d = this.getHighResolutionOutputSizeshNQ4ISI.data;
                kotlin.jvm.internal.Intrinsics.checkNotNull(d);
                this.getHighSpeedVideoSizes = 1;
                obj = store.writeOperation(operation, d, this.getHighSpeedVideoFpsRangesFor, plus, false, this);
            } else {
                emptySet = kotlin.collections.SetsKt.emptySet();
                this.getHighSpeedVideoSizes = 2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        emptySet = (java.util.Set) obj;
        this.getHighSpeedVideoSizes = 2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$maybeWriteToCache$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$maybeWriteToCache$2(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApolloCacheInterceptor$maybeWriteToCache$2(com.apollographql.apollo.api.ApolloResponse<D> apolloResponse, com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor apolloCacheInterceptor, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.util.Set<java.lang.String> set, kotlin.coroutines.Continuation<? super com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$maybeWriteToCache$2> continuation) {
        super(1, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = apolloResponse;
        this.Camera2StreamConfigurationMap = apolloRequest;
        this.getHighSpeedVideoSizesFor = apolloCacheInterceptor;
        this.getHighSpeedVideoFpsRangesFor = customScalarAdapters;
        this.getHighSpeedVideoFpsRanges = set;
    }
}

package com.apollographql.apollo.cache.normalized;

/* JADX INFO: Add missing generic type declarations: [D] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1", f = "FetchPolicyInterceptors.kt", i = {0, 1, 1}, l = {59, 60, 66}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "cacheResponse"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class FetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1<D> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.apollographql.apollo.api.ApolloResponse<D>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.apollographql.apollo.interceptor.ApolloInterceptorChain getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.apollographql.apollo.api.ApolloRequest<D> getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r3, r8.getHighResolutionOutputSizeshNQ4ISI.proceed(r8.getHighSpeedVideoFpsRanges), r8) == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        com.apollographql.apollo.api.ApolloResponse apolloResponse;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = flowCollector3;
            this.getHighSpeedVideoSizes = 1;
            java.lang.Object single = kotlinx.coroutines.flow.FlowKt.single(this.getHighResolutionOutputSizeshNQ4ISI.proceed(com.apollographql.apollo.cache.normalized.NormalizedCache.fetchFromCache(this.getHighSpeedVideoFpsRanges.newBuilder(), true).build()), this);
            if (single != coroutine_suspended) {
                flowCollector = flowCollector3;
                obj = single;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            apolloResponse = (com.apollographql.apollo.api.ApolloResponse) this.Camera2StreamConfigurationMap;
            flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            if (apolloResponse.exception != null) {
                return kotlin.Unit.INSTANCE;
            }
            this.getHighSpeedVideoFpsRangesFor = null;
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoSizes = 3;
        }
        com.apollographql.apollo.api.ApolloResponse apolloResponse2 = (com.apollographql.apollo.api.ApolloResponse) obj;
        com.apollographql.apollo.api.ApolloResponse.Builder newBuilder = apolloResponse2.newBuilder();
        boolean z = apolloResponse2.exception == null;
        this.getHighSpeedVideoFpsRangesFor = flowCollector;
        this.Camera2StreamConfigurationMap = apolloResponse2;
        this.getHighSpeedVideoSizes = 2;
        if (flowCollector.emit(newBuilder.isLast(z).build(), this) != coroutine_suspended) {
            flowCollector2 = flowCollector;
            apolloResponse = apolloResponse2;
            if (apolloResponse.exception != null) {
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1) create((kotlinx.coroutines.flow.FlowCollector) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1 fetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1 = new com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
        fetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1.getHighSpeedVideoFpsRangesFor = obj;
        return fetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1(com.apollographql.apollo.interceptor.ApolloInterceptorChain apolloInterceptorChain, com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, kotlin.coroutines.Continuation<? super com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = apolloInterceptorChain;
        this.getHighSpeedVideoFpsRanges = apolloRequest;
    }
}

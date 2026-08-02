package com.apollographql.apollo.cache.normalized;

/* JADX INFO: Add missing generic type declarations: [D] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1", f = "FetchPolicyInterceptors.kt", i = {0, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 127}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class FetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1<D> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.apollographql.apollo.api.ApolloResponse<D>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.apollographql.apollo.interceptor.ApolloInterceptorChain getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.apollographql.apollo.api.ApolloRequest<D> getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0089, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r7.getHighResolutionOutputSizeshNQ4ISI.proceed(r7.getHighSpeedVideoSizes), r7) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (r1.emit(((com.apollographql.apollo.api.ApolloResponse) r8).newBuilder().isLast(false).build(), r7) != r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = flowCollector2;
            this.Camera2StreamConfigurationMap = 1;
            java.lang.Object single = kotlinx.coroutines.flow.FlowKt.single(this.getHighResolutionOutputSizeshNQ4ISI.proceed(com.apollographql.apollo.cache.normalized.NormalizedCache.fetchFromCache(this.getHighSpeedVideoSizes.newBuilder(), true).build()), this);
            if (single != coroutine_suspended) {
                flowCollector = flowCollector2;
                obj = single;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = null;
            this.Camera2StreamConfigurationMap = 3;
        }
        this.getHighSpeedVideoFpsRanges = flowCollector;
        this.Camera2StreamConfigurationMap = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1) create((kotlinx.coroutines.flow.FlowCollector) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1 fetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1 = new com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
        fetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1.getHighSpeedVideoFpsRanges = obj;
        return fetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1(com.apollographql.apollo.interceptor.ApolloInterceptorChain apolloInterceptorChain, com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, kotlin.coroutines.Continuation<? super com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = apolloInterceptorChain;
        this.getHighSpeedVideoSizes = apolloRequest;
    }
}

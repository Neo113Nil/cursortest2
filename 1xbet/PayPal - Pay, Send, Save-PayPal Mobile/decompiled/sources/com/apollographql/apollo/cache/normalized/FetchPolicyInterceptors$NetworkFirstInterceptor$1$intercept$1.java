package com.apollographql.apollo.cache.normalized;

/* JADX INFO: Add missing generic type declarations: [D] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1", f = "FetchPolicyInterceptors.kt", i = {0, 0, 1}, l = {95, 105, 106}, m = "invokeSuspend", n = {"$this$flow", "networkException", "$this$flow"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes3.dex */
final class FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1<D> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.apollographql.apollo.api.ApolloResponse<D>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.apollographql.apollo.api.ApolloRequest<D> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.apollographql.apollo.interceptor.ApolloInterceptorChain getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a3, code lost:
    
        if (r1.emit((com.apollographql.apollo.api.ApolloResponse) r10, r9) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r10, new com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$invokeSuspend$$inlined$map$1<>(r6, r1), r9) != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        final kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
            objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            final kotlinx.coroutines.flow.Flow onEach = kotlinx.coroutines.flow.FlowKt.onEach(this.getHighSpeedVideoFpsRanges.proceed(this.getHighResolutionOutputSizeshNQ4ISI), new com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1(objectRef, null));
            this.getHighSpeedVideoFpsRangesFor = flowCollector;
            this.Camera2StreamConfigurationMap = objectRef;
            this.getHighSpeedVideoSizes = 1;
        } else if (i == 1) {
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.Camera2StreamConfigurationMap;
            kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector3;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighSpeedVideoSizes = 3;
        }
        if (objectRef.element == 0) {
            return kotlin.Unit.INSTANCE;
        }
        this.getHighSpeedVideoFpsRangesFor = flowCollector;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = 2;
        java.lang.Object single = kotlinx.coroutines.flow.FlowKt.single(this.getHighSpeedVideoFpsRanges.proceed(com.apollographql.apollo.cache.normalized.NormalizedCache.fetchFromCache(this.getHighResolutionOutputSizeshNQ4ISI.newBuilder(), true).build()), this);
        if (single != coroutine_suspended) {
            flowCollector2 = flowCollector;
            obj = single;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighSpeedVideoSizes = 3;
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1) create((kotlinx.coroutines.flow.FlowCollector) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1 fetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1 = new com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        fetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1.getHighSpeedVideoFpsRangesFor = obj;
        return fetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1(com.apollographql.apollo.interceptor.ApolloInterceptorChain apolloInterceptorChain, com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, kotlin.coroutines.Continuation<? super com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = apolloInterceptorChain;
        this.getHighResolutionOutputSizeshNQ4ISI = apolloRequest;
    }
}

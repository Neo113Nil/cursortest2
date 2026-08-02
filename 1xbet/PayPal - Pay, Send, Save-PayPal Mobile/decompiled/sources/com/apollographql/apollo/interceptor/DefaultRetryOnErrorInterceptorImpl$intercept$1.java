package com.apollographql.apollo.interceptor;

/* JADX INFO: Add missing generic type declarations: [D] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$1", f = "RetryOnErrorInterceptor.kt", i = {}, l = {65, 67}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class DefaultRetryOnErrorInterceptorImpl$intercept$1<D> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.apollographql.apollo.api.ApolloResponse<D>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> Camera2StreamConfigurationMap;
    final /* synthetic */ com.apollographql.apollo.api.ApolloRequest<D> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        r1 = r5.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r6.emit(r1.exception(r2).build(), r5) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r6, r5.Camera2StreamConfigurationMap, r5) == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.apollographql.apollo.network.NetworkMonitor networkMonitor;
        kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isOnline;
        com.apollographql.apollo.exception.ApolloNetworkException apolloNetworkException;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizesFor;
            if (!this.getHighSpeedVideoFpsRanges || networkMonitor == null || (isOnline = networkMonitor.isOnline()) == null || !kotlin.jvm.internal.Intrinsics.areEqual(isOnline.getValue(), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false))) {
                this.getHighSpeedVideoSizes = 2;
            } else {
                com.apollographql.apollo.api.ApolloResponse.Builder builder = new com.apollographql.apollo.api.ApolloResponse.Builder(this.getHighResolutionOutputSizeshNQ4ISI.getOperation(), this.getHighResolutionOutputSizeshNQ4ISI.getRequestUuid());
                apolloNetworkException = com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt.getHighSpeedVideoSizes;
                this.getHighSpeedVideoSizes = 1;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$1) create((kotlinx.coroutines.flow.FlowCollector) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$1 defaultRetryOnErrorInterceptorImpl$intercept$1 = new com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
        defaultRetryOnErrorInterceptorImpl$intercept$1.getHighSpeedVideoSizesFor = obj;
        return defaultRetryOnErrorInterceptorImpl$intercept$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultRetryOnErrorInterceptorImpl$intercept$1(boolean z, com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl defaultRetryOnErrorInterceptorImpl, com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> flow, kotlin.coroutines.Continuation<? super com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighSpeedVideoFpsRangesFor = defaultRetryOnErrorInterceptorImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = apolloRequest;
        this.Camera2StreamConfigurationMap = flow;
    }
}

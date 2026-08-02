package com.apollographql.apollo.interceptor;

/* JADX INFO: Add missing generic type declarations: [D] */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;", "cause", "", "<unused var>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$3", f = "RetryOnErrorInterceptor.kt", i = {}, l = {79, 81}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class DefaultRetryOnErrorInterceptorImpl$intercept$3<D> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function4<kotlinx.coroutines.flow.FlowCollector<? super com.apollographql.apollo.api.ApolloResponse<D>>, java.lang.Throwable, java.lang.Long, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.internal.Ref.IntRef getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (com.apollographql.apollo.network.NetworkMonitorKt.waitForNetwork(r9, r8) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (kotlinx.coroutines.DelayKt.m24057delayVtjQ1oo(kotlin.time.DurationKt.toDuration(java.lang.Math.pow(2.0d, r8.getHighSpeedVideoFpsRanges.element), kotlin.time.DurationUnit.SECONDS), r8) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.apollographql.apollo.network.NetworkMonitor networkMonitor;
        com.apollographql.apollo.network.NetworkMonitor networkMonitor2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        boolean z = true;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (((java.lang.Throwable) this.getHighResolutionOutputSizeshNQ4ISI) instanceof com.apollographql.apollo.interceptor.RetryException) {
                this.getHighSpeedVideoFpsRanges.element++;
                networkMonitor = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                if (networkMonitor != null) {
                    networkMonitor2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                    this.getHighSpeedVideoSizes = 1;
                } else {
                    kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
                    this.getHighSpeedVideoSizes = 2;
                }
            } else {
                z = false;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Throwable th, java.lang.Long l, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$3 defaultRetryOnErrorInterceptorImpl$intercept$3 = new com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$3(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
        defaultRetryOnErrorInterceptorImpl$intercept$3.getHighResolutionOutputSizeshNQ4ISI = th;
        return defaultRetryOnErrorInterceptorImpl$intercept$3.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultRetryOnErrorInterceptorImpl$intercept$3(kotlin.jvm.internal.Ref.IntRef intRef, com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl defaultRetryOnErrorInterceptorImpl, kotlin.coroutines.Continuation<? super com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$3> continuation) {
        super(4, continuation);
        this.getHighSpeedVideoFpsRanges = intRef;
        this.getHighSpeedVideoFpsRangesFor = defaultRetryOnErrorInterceptorImpl;
    }
}

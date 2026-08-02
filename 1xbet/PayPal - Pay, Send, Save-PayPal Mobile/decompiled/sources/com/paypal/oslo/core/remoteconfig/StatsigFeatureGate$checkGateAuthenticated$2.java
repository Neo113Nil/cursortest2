package com.paypal.oslo.core.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigUserState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticated$2", f = "StatsigFeatureGate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class StatsigFeatureGate$checkGateAuthenticated$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState remoteConfigUserState = (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState) this.getHighSpeedVideoFpsRanges;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserStateKt.isAuthenticated(remoteConfigUserState));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState remoteConfigUserState, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticated$2) create(remoteConfigUserState, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticated$2 statsigFeatureGate$checkGateAuthenticated$2 = new com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticated$2(continuation);
        statsigFeatureGate$checkGateAuthenticated$2.getHighSpeedVideoFpsRanges = obj;
        return statsigFeatureGate$checkGateAuthenticated$2;
    }

    StatsigFeatureGate$checkGateAuthenticated$2(kotlin.coroutines.Continuation<? super com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticated$2> continuation) {
        super(2, continuation);
    }
}

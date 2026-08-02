package com.paypal.oslo.core.remoteconfig;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.remoteconfig.StatsigFeatureGate", f = "StatsigFeatureGate.kt", i = {0}, l = {69}, m = "checkGateAuthenticated", n = {"key"}, nl = {70}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class StatsigFeatureGate$checkGateAuthenticated$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.remoteconfig.StatsigFeatureGate getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.checkGateAuthenticated(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigFeatureGate$checkGateAuthenticated$1(com.paypal.oslo.core.remoteconfig.StatsigFeatureGate statsigFeatureGate, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticated$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = statsigFeatureGate;
    }
}

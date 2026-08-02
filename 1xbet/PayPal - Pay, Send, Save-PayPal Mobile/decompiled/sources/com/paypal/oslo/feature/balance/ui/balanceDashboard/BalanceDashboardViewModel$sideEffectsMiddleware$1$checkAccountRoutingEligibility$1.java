package com.paypal.oslo.feature.balance.ui.balanceDashboard;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1", f = "BalanceDashboardViewModel.kt", i = {0}, l = {350}, m = "checkAccountRoutingEligibility", n = {"isEligible"}, nl = {363}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class BalanceDashboardViewModel$sideEffectsMiddleware$1$checkAccountRoutingEligibility$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1 Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BalanceDashboardViewModel$sideEffectsMiddleware$1$checkAccountRoutingEligibility$1(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1 balanceDashboardViewModel$sideEffectsMiddleware$1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$checkAccountRoutingEligibility$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = balanceDashboardViewModel$sideEffectsMiddleware$1;
    }
}

package com.paypal.oslo.feature.balance.ui.balanceDashboard;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1", f = "BalanceDashboardViewModel.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {448, 458}, m = "dispatchBalanceOrPrepaidError", n = {"balance", "autoReloadInfo", "nbaRecommendations", "isAccountRoutingEligible", "input", "balance", "autoReloadInfo", "nbaRecommendations", "isAccountRoutingEligible", "input"}, nl = {467, 459}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes11.dex */
final class BalanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1 getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getInputSizeshNQ4ISI = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges(null, null, null, null, null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BalanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$1(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1 balanceDashboardViewModel$sideEffectsMiddleware$1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = balanceDashboardViewModel$sideEffectsMiddleware$1;
    }
}

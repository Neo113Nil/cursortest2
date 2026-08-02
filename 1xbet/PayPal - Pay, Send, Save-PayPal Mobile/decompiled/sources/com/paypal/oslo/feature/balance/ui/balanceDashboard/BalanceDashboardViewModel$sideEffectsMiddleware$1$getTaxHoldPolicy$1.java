package com.paypal.oslo.feature.balance.ui.balanceDashboard;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1", f = "BalanceDashboardViewModel.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {476, 492, 504}, m = "getTaxHoldPolicy", n = {"input", "balance", "autoReloadInfo", "nbaRecommendations", "isAccountRoutingEligible", "input", "balance", "autoReloadInfo", "nbaRecommendations", "isAccountRoutingEligible", "this_$iv", "policy", "$i$f$fold", "$i$a$-fold-BalanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$3", "input", "balance", "autoReloadInfo", "nbaRecommendations", "isAccountRoutingEligible", "this_$iv", "policy", "$i$f$fold", "$i$a$-fold-BalanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$4"}, nl = {my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CERTIFICATE_NOT_FOUND, 493, 505}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"}, v = 2)
/* loaded from: classes11.dex */
final class BalanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1 getOutputMinFrameDurationlomOqCM;
    int getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputStallDuration |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoSizes((com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent>) null, (com.paypal.oslo.feature.balance.domain.model.Balance) null, (com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo) null, (java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation>) null, (java.lang.Boolean) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BalanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1 balanceDashboardViewModel$sideEffectsMiddleware$1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = balanceDashboardViewModel$sideEffectsMiddleware$1;
    }
}

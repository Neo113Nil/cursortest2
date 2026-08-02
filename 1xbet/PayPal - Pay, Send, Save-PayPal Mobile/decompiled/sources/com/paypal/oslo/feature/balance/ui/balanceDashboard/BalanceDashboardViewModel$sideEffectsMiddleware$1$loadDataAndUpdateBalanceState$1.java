package com.paypal.oslo.feature.balance.ui.balanceDashboard;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1", f = "BalanceDashboardViewModel.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, 283, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE}, m = "loadDataAndUpdateBalanceState", n = {"input", "autoReloadConfigDeferred", "balanceDeferred", "nbaRecommendationDeferred", "input", "autoReloadConfigDeferred", "balanceDeferred", "nbaRecommendationDeferred", "autoReloadConfigResult", "input", "autoReloadConfigDeferred", "balanceDeferred", "nbaRecommendationDeferred", "autoReloadConfigResult", "balanceResult", "input", "autoReloadConfigDeferred", "balanceDeferred", "nbaRecommendationDeferred", "autoReloadConfigResult", "balanceResult", "nbaRecommendationResult", "autoReloadInfo", "nbaRecommendations", "input", "autoReloadConfigDeferred", "balanceDeferred", "nbaRecommendationDeferred", "autoReloadConfigResult", "balanceResult", "nbaRecommendationResult", "autoReloadInfo", "nbaRecommendations", "isAccountRoutingEligible"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9"}, v = 2)
/* loaded from: classes11.dex */
final class BalanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1 getOutputMinFrameDurationlomOqCM;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    int getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputStallDuration |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1.access$loadDataAndUpdateBalanceState(this.getOutputMinFrameDurationlomOqCM, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BalanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$1(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1 balanceDashboardViewModel$sideEffectsMiddleware$1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = balanceDashboardViewModel$sideEffectsMiddleware$1;
    }
}

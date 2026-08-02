package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemAnalyticsMiddlewareDelegate;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/MiddlewareDelegate;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "<init>", "()V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.OLD_STATE_KEY, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_STATE_KEY, "event", "Lkotlin/Function1;", "", "eventDispatcher", "onReducerOutput", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RedeemAnalyticsMiddlewareDelegate extends com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent> {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate
    public final void onReducerOutput(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState oldState, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState newState, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent event, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent, kotlin.Unit> eventDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventDispatcher, "");
        if (!(event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnNext)) {
            if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemSuccess) {
                com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RedemptionAnalytics.INSTANCE.createRedemptionSuccessEvent().track(com.paypal.oslo.feature.shoppingrewards.AnalyticsTrackerKt.analyticsTracker);
                return;
            }
            if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadError) {
                com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadError onLoadError = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadError) event;
                com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsErrorAnalytics.INSTANCE.createErrorShownEvent(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SCREEN_NAME, "redeem", "load", onLoadError.getErrorType(), onLoadError.getMessage()).track(com.paypal.oslo.feature.shoppingrewards.AnalyticsTrackerKt.analyticsTracker);
                return;
            }
            if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadCharitiesError) {
                com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadCharitiesError onLoadCharitiesError = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadCharitiesError) event;
                com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsErrorAnalytics.INSTANCE.createErrorShownEvent(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SCREEN_NAME, "redeem", "load", onLoadCharitiesError.getErrorType(), onLoadCharitiesError.getMessage()).track(com.paypal.oslo.feature.shoppingrewards.AnalyticsTrackerKt.analyticsTracker);
                return;
            }
            if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemError) {
                com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemError onRedeemError = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemError) event;
                com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsErrorAnalytics.INSTANCE.createErrorShownEvent(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SCREEN_NAME, "redeem", "confirm", onRedeemError.getErrorType(), onRedeemError.getMessage()).track(com.paypal.oslo.feature.shoppingrewards.AnalyticsTrackerKt.analyticsTracker);
                return;
            }
            return;
        }
        if (((newState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming) || (newState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadySummary)) && (oldState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCapture)) {
            com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RedemptionAnalytics redemptionAnalytics = com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RedemptionAnalytics.INSTANCE;
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCapture readyCapture = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCapture) oldState;
            java.lang.String lowerCase = readyCapture.getRedeemType().toString().toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            redemptionAnalytics.createConfirmRedemptionEvent(lowerCase, readyCapture.getCurrencyCode(), readyCapture.getConvertedAmount()).track(com.paypal.oslo.feature.shoppingrewards.AnalyticsTrackerKt.analyticsTracker);
        }
    }
}

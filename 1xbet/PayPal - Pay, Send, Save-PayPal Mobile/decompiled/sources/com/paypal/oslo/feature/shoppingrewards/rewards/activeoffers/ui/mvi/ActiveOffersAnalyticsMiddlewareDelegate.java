package com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/mvi/ActiveOffersAnalyticsMiddlewareDelegate;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/MiddlewareDelegate;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/mvi/ActiveOffersUiState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/mvi/ActiveOffersEvent;", "<init>", "()V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.OLD_STATE_KEY, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_STATE_KEY, "event", "Lkotlin/Function1;", "", "eventDispatcher", "onReducerOutput", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/mvi/ActiveOffersUiState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/mvi/ActiveOffersUiState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/mvi/ActiveOffersEvent;Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ActiveOffersAnalyticsMiddlewareDelegate extends com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState, com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent> {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate
    public final void onReducerOutput(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState oldState, com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState newState, com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent event, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent, kotlin.Unit> eventDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventDispatcher, "");
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnClick) {
            event.getName();
            return;
        }
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnClose) {
            event.getName();
            return;
        }
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnLoad) {
            event.getName();
            return;
        }
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnLoadError) {
            com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnLoadError onLoadError = (com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnLoadError) event;
            com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsErrorAnalytics.INSTANCE.createErrorShownEvent(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.ActiveOffers.SCREEN_NAME, com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.ActiveOffers.FEATURE, "load", onLoadError.getErrorType(), onLoadError.getMessage()).track(com.paypal.oslo.feature.shoppingrewards.AnalyticsTrackerKt.analyticsTracker);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } else if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnLoadSuccess) {
            event.getName();
        } else if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnRetry) {
            event.getName();
        } else {
            if (!(event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnOfferClick)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            event.getName();
        }
    }
}

package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryAnalyticsMiddlewareDelegate;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/MiddlewareDelegate;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent;", "<init>", "()V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.OLD_STATE_KEY, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_STATE_KEY, "event", "Lkotlin/Function1;", "", "eventDispatcher", "onReducerOutput", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent;Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RewardsSummaryAnalyticsMiddlewareDelegate extends com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent> {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate
    public final void onReducerOutput(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState oldState, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState newState, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent event, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent, kotlin.Unit> eventDispatcher) {
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.RewardsSummaryUiData data;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventDispatcher, "");
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoad) {
            return;
        }
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadSuccess) {
            com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsSummaryAnalytics.INSTANCE.createScreenLoadedEvent(((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadSuccess) event).getData().getSelectedTabIndex()).track(com.paypal.oslo.feature.shoppingrewards.AnalyticsTrackerKt.analyticsTracker);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadError) {
            com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsErrorAnalytics.createErrorShownEvent$default(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsErrorAnalytics.INSTANCE, com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Summary.SCREEN_NAME, com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Summary.FEATURE, "load", ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadError) event).getErrorType(), null, 16, null).track(com.paypal.oslo.feature.shoppingrewards.AnalyticsTrackerKt.analyticsTracker);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnRetry) {
            return;
        }
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick) {
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick onClick = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick) event;
            if (onClick instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.CategorySelection) {
                com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.CategorySelectionAnalytics.INSTANCE.createChooseCategoryEvent().track(com.paypal.oslo.feature.shoppingrewards.AnalyticsTrackerKt.analyticsTracker);
                return;
            }
            if (onClick instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.InactiveOffer) {
                com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Ready ready = oldState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Ready ? (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Ready) oldState : null;
                java.lang.Object earnSectionData = (ready == null || (data = ready.getData()) == null) ? null : data.getEarnSectionData();
                com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.earn.EarnSectionUiData.Content content = earnSectionData instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.earn.EarnSectionUiData.Content ? (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.earn.EarnSectionUiData.Content) earnSectionData : null;
                if (content != null) {
                    r9 = content.getActiveOfferSectionUiData() != null ? 2 : 1;
                    if (content.getPpdcCard() != null) {
                        r9++;
                    }
                }
                com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.StretchActivationAnalytics.INSTANCE.createStretchOfferTappedEvent(r9).track(com.paypal.oslo.feature.shoppingrewards.AnalyticsTrackerKt.analyticsTracker);
                return;
            }
            return;
        }
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnChangeTab) {
            com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsSummaryAnalytics.INSTANCE.createTabSelectedEvent(((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnChangeTab) event).getTabIndex()).track(com.paypal.oslo.feature.shoppingrewards.AnalyticsTrackerKt.analyticsTracker);
        } else if (!(event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnOfferActivated) && !(event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnReload) && !(event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnToastDisappeared) && !(event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnCategorySelectionChanged) && !(event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnRedemptionCompleted)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }
}

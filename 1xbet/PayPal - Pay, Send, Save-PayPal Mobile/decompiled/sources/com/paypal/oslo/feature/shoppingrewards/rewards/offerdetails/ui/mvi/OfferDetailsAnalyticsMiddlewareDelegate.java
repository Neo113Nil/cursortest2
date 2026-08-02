package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsAnalyticsMiddlewareDelegate;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/MiddlewareDelegate;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsUiState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent;", "<init>", "()V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.OLD_STATE_KEY, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_STATE_KEY, "event", "Lkotlin/Function1;", "", "eventDispatcher", "onReducerOutput", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsUiState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsUiState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent;Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OfferDetailsAnalyticsMiddlewareDelegate extends com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent> {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate
    public final void onReducerOutput(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState oldState, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState newState, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent event, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent, kotlin.Unit> eventDispatcher) {
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventDispatcher, "");
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOffer) {
            com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.StretchActivationAnalytics.INSTANCE.createActivateStretchOfferEvent().track(com.paypal.oslo.feature.shoppingrewards.AnalyticsTrackerKt.analyticsTracker);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferError) {
            com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferError onActivateOfferError = (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferError) event;
            com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsErrorAnalytics.INSTANCE.createErrorShownEvent(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.OfferDetails.SCREEN_NAME, com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Stretch.FEATURE, "activate", onActivateOfferError.getErrorType(), onActivateOfferError.getMessage()).track(com.paypal.oslo.feature.shoppingrewards.AnalyticsTrackerKt.analyticsTracker);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferSuccess) {
            com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.StretchActivationAnalytics.INSTANCE.createOfferActivatedEvent(((com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferSuccess) event).getData().getOfferId()).track(com.paypal.oslo.feature.shoppingrewards.AnalyticsTrackerKt.analyticsTracker);
            return;
        }
        if ((event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnClose) || (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoad)) {
            return;
        }
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadError) {
            com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadError onLoadError = (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadError) event;
            com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsErrorAnalytics.INSTANCE.createErrorShownEvent(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.OfferDetails.SCREEN_NAME, com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.OfferDetails.FEATURE, "load", onLoadError.getErrorType(), onLoadError.getMessage()).track(com.paypal.oslo.feature.shoppingrewards.AnalyticsTrackerKt.analyticsTracker);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadSuccess) {
            com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadSuccess onLoadSuccess = (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadSuccess) event;
            if (onLoadSuccess.getData().isActive()) {
                com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.HeaderType headerType = onLoadSuccess.getData().getHeaderType();
                if (headerType instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.HeaderType.DiscreetOfferProgress) {
                    com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.HeaderType.DiscreetOfferProgress discreetOfferProgress = (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.HeaderType.DiscreetOfferProgress) headerType;
                    pair = kotlin.TuplesKt.to(java.lang.Integer.valueOf(discreetOfferProgress.getProgressAvatar().getProgressValue()), java.lang.Integer.valueOf(discreetOfferProgress.getProgressAvatar().getMaxProgressValue()));
                } else {
                    pair = kotlin.TuplesKt.to(0, 0);
                }
                com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.StretchActivationAnalytics.INSTANCE.createOfferProgressShownEvent(((java.lang.Number) pair.component1()).intValue(), ((java.lang.Number) pair.component2()).intValue()).track(com.paypal.oslo.feature.shoppingrewards.AnalyticsTrackerKt.analyticsTracker);
                return;
            }
            return;
        }
        if (!(event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnTermsClick)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }
}

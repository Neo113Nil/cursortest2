package com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u000e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingSideEffectMiddlewareDelegate;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/MiddlewareDelegate;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingUiState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingEvent;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingViewModel;", "viewModel", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingViewModel;)V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.OLD_STATE_KEY, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_STATE_KEY, "event", "Lkotlin/Function1;", "", "eventDispatcher", "onReducerOutput", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingUiState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingUiState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingEvent;Lkotlin/jvm/functions/Function1;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingViewModel;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RewardsLandingSideEffectMiddlewareDelegate extends com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate<com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingUiState, com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingViewModel getHighSpeedVideoFpsRangesFor;

    public RewardsLandingSideEffectMiddlewareDelegate(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingViewModel rewardsLandingViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsLandingViewModel, "");
        this.getHighSpeedVideoFpsRangesFor = rewardsLandingViewModel;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate
    public final void onReducerOutput(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingUiState oldState, com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingUiState newState, com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent event, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent, kotlin.Unit> eventDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventDispatcher, "");
        if (newState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingUiState.Loading) {
            if ((event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnLoad) || (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnRetry)) {
                this.getHighSpeedVideoFpsRangesFor.handleOnLoad$shopping_rewards_prodRelease();
            }
        }
    }
}

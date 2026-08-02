package com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u000e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/mvi/ActiveOffersSideEffectMiddlewareDelegate;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/MiddlewareDelegate;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/mvi/ActiveOffersUiState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/mvi/ActiveOffersEvent;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/mvi/ActiveOffersViewModel;", "viewModel", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/mvi/ActiveOffersViewModel;)V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.OLD_STATE_KEY, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_STATE_KEY, "event", "Lkotlin/Function1;", "", "eventDispatcher", "onReducerOutput", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/mvi/ActiveOffersUiState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/mvi/ActiveOffersUiState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/mvi/ActiveOffersEvent;Lkotlin/jvm/functions/Function1;)V", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/mvi/ActiveOffersViewModel;", "getViewModel", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/mvi/ActiveOffersViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ActiveOffersSideEffectMiddlewareDelegate extends com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState, com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersViewModel viewModel;

    public ActiveOffersSideEffectMiddlewareDelegate(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersViewModel activeOffersViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeOffersViewModel, "");
        this.viewModel = activeOffersViewModel;
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersViewModel getViewModel() {
        return this.viewModel;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate
    public final void onReducerOutput(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState oldState, com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState newState, com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent event, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent, kotlin.Unit> eventDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventDispatcher, "");
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnLoad) {
            this.viewModel.handleOnLoad$shopping_rewards_prodRelease(((com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnLoad) event).getInitialDestination().getOrigin());
        } else if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnRetry) {
            this.viewModel.handleOnLoad$shopping_rewards_prodRelease(((com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnRetry) event).getInitialDestination().getOrigin());
        }
    }
}

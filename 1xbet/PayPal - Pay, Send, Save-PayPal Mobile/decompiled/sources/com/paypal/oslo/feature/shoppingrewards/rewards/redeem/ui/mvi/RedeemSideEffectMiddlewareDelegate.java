package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u000e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemSideEffectMiddlewareDelegate;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/MiddlewareDelegate;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemViewModel;", "viewModel", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemViewModel;)V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.OLD_STATE_KEY, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_STATE_KEY, "event", "Lkotlin/Function1;", "", "eventDispatcher", "onReducerOutput", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemViewModel;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RedeemSideEffectMiddlewareDelegate extends com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel getHighSpeedVideoFpsRangesFor;

    public RedeemSideEffectMiddlewareDelegate(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemViewModel, "");
        this.getHighSpeedVideoFpsRangesFor = redeemViewModel;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate
    public final void onReducerOutput(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState oldState, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState newState, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent event, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent, kotlin.Unit> eventDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventDispatcher, "");
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoad) {
            this.getHighSpeedVideoFpsRangesFor.handleOnLoad$shopping_rewards_prodRelease();
            return;
        }
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRetry) {
            if (newState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming) {
                this.getHighSpeedVideoFpsRangesFor.handleOnRedeem$shopping_rewards_prodRelease();
                return;
            } else {
                this.getHighSpeedVideoFpsRangesFor.handleOnLoad$shopping_rewards_prodRelease();
                return;
            }
        }
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadSuccess) {
            if (newState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.LoadingCharities) {
                this.getHighSpeedVideoFpsRangesFor.handleOnLoadCharities$shopping_rewards_prodRelease();
            }
        } else {
            if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnNext) {
                if (newState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming) {
                    this.getHighSpeedVideoFpsRangesFor.handleOnRedeem$shopping_rewards_prodRelease();
                    return;
                } else {
                    if (newState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadySummary) {
                        this.getHighSpeedVideoFpsRangesFor.handleOnSummaryReady$shopping_rewards_prodRelease();
                        return;
                    }
                    return;
                }
            }
            if (((event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnConfirmDonation) || (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeem)) && (newState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming)) {
                this.getHighSpeedVideoFpsRangesFor.handleOnRedeem$shopping_rewards_prodRelease();
            }
        }
    }
}

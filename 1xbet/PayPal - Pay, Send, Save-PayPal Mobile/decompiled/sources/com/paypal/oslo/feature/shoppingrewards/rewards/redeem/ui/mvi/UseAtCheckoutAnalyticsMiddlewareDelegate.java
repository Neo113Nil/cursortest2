package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/UseAtCheckoutAnalyticsMiddlewareDelegate;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/MiddlewareDelegate;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/UseAtCheckoutState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/UseAtCheckoutEvent;", "<init>", "()V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.OLD_STATE_KEY, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_STATE_KEY, "event", "Lkotlin/Function1;", "", "eventDispatcher", "onReducerOutput", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/UseAtCheckoutState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/UseAtCheckoutState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/UseAtCheckoutEvent;Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UseAtCheckoutAnalyticsMiddlewareDelegate extends com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutEvent> {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate
    public final void onReducerOutput(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState oldState, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState newState, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutEvent event, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutEvent, kotlin.Unit> eventDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventDispatcher, "");
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutEvent.OnLoad) {
            com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger logger = com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger.INSTANCE;
            kotlin.Pair[] pairArr = new kotlin.Pair[4];
            pairArr[0] = kotlin.TuplesKt.to("event", event.getName());
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutEvent.OnLoad onLoad = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutEvent.OnLoad) event;
            pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.HAS_TITLE_UI, java.lang.Boolean.valueOf(onLoad.getData().getTitle().length() > 0));
            pairArr[2] = kotlin.TuplesKt.to("hasDescription", java.lang.Boolean.valueOf(onLoad.getData().getDescription().length() > 0));
            pairArr[3] = kotlin.TuplesKt.to("hasImageUrl", java.lang.Boolean.valueOf(onLoad.getData().getImageUrl().length() > 0));
            com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger.logV$default(logger, "Use At Checkout bottom sheet loaded", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            return;
        }
        if (!(event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutEvent.OnClose)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger.logV$default(com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger.INSTANCE, "Use At Checkout bottom sheet dismissed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("event", event.getName()), kotlin.TuplesKt.to("currentState", newState.getName())), null, 4, null);
    }
}

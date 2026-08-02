package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u0006R\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/UseAtCheckoutViewModel;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/BaseViewModel;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/UseAtCheckoutState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/UseAtCheckoutEvent;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/UseAtCheckoutUiEffect;", "<init>", "()V", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/UseAtCheckoutUiData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "onLoad", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/UseAtCheckoutUiData;)V", "onClose", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/MiddlewareDelegate;", "getAnalyticsMiddlewareDelegate$shopping_rewards_prodRelease", "()Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/MiddlewareDelegate;", "analyticsMiddlewareDelegate", "getSideEffectMiddlewareDelegate$shopping_rewards_prodRelease", "sideEffectMiddlewareDelegate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UseAtCheckoutViewModel extends com.paypal.oslo.feature.shoppingrewards.shared.ui.core.BaseViewModel<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutEvent, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutUiEffect> {
    public static final int $stable = 8;

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.ui.core.BaseViewModel
    public final com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutEvent> getSideEffectMiddlewareDelegate$shopping_rewards_prodRelease() {
        return null;
    }

    @javax.inject.Inject
    public UseAtCheckoutViewModel() {
        super("UseAtCheckoutViewModel", com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState.Initial.INSTANCE, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutReducer.INSTANCE);
    }

    public final void onLoad(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.UseAtCheckoutUiData data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutEvent.OnLoad(data));
    }

    public final void onClose() {
        processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutEvent.OnClose.INSTANCE);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.ui.core.BaseViewModel
    public final com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutEvent> getAnalyticsMiddlewareDelegate$shopping_rewards_prodRelease() {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutAnalyticsMiddlewareDelegate();
    }
}

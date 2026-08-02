package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/UseAtCheckoutReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/UseAtCheckoutState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/UseAtCheckoutEvent;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/UseAtCheckoutUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/UseAtCheckoutState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/UseAtCheckoutEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UseAtCheckoutReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutEvent, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutUiEffect> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutReducer INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutReducer();

    private UseAtCheckoutReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "UseAtCheckoutReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutUiEffect>> reduce(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState state, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState.Ready)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState.Ready ready = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState.Ready) state;
            if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutEvent.OnClose) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutUiEffect.DismissBottomSheet.INSTANCE);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState.Initial initial = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutEvent.OnLoad) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState.Ready(((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutEvent.OnLoad) event).getData()), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }
}

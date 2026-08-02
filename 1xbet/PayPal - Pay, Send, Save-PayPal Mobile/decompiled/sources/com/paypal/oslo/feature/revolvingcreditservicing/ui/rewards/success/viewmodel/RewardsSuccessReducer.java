package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/success/viewmodel/RewardsSuccessReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/success/viewmodel/RewardsSuccessState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/success/viewmodel/RewardsSuccessEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/success/viewmodel/RewardsSuccessUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/success/viewmodel/RewardsSuccessState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/success/viewmodel/RewardsSuccessEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RewardsSuccessReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessState, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public RewardsSuccessReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "RewardsSuccessReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessState, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessUiEffect>> reduce(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessState state, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessEvent event) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessState.Ready)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessState.Ready) state;
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessEvent.OnDoneClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessUiEffect.NavigateBack.INSTANCE);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessEvent.OnGoToBalanceClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessUiEffect.NavigateToBalance.INSTANCE);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessState.Initial initial = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessEvent.OnViewCreated) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessEvent.OnViewCreated onViewCreated = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessEvent.OnViewCreated) event;
            if (onViewCreated.getNavArgs().isPartialSuccess()) {
                stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_reward_success_partial_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            } else {
                stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_reward_success_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessState.Ready(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.models.RewardsSuccessUiModel(stringResOnly, onViewCreated.getNavArgs().isPartialSuccess() ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_reward_success_partial_description, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null) : null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(onViewCreated.getNavArgs().getAmount()), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(onViewCreated.getNavArgs().getFrom()), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(onViewCreated.getNavArgs().getTo()), onViewCreated.getNavArgs().isPartialSuccess())), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }
}

package com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenState;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenState;Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardCreationSuccessScreenReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenState, com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent, com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DebitCardCreationSuccessScreenReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "DebitCardCreationSuccessScreenReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenState, com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEffect>> reduce(com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenState state, com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenState.Eligible)) {
            if (!(state instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenState.Ineligible)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.CloseClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEffect.CloseSuccessScreen.INSTANCE);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.ViewYourCardClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEffect.NavigateToCardManagement.INSTANCE);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.AddCardholderButtonClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEffect.NavigateToAddCardholderFlow.INSTANCE);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.CloseClicked) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEffect.CloseSuccessScreen.INSTANCE);
        }
        if ((event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.ViewYourCardClicked) || (event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.OnProvisioningFailure)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEffect.NavigateToCardManagement.INSTANCE);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.OnEligibleFailure) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenState.Ineligible.INSTANCE, com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEffect.ShowEligibleFailure.INSTANCE);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.OnProvisioningSuccess) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEffect.NavigateToCardManagementWithProvisioningSuccess.INSTANCE);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
    }
}

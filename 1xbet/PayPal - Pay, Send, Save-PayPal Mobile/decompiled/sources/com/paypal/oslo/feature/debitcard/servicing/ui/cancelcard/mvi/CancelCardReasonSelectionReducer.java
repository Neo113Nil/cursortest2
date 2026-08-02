package com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/mvi/CancelCardReasonSelectionReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/mvi/CancelCardReasonSelectionState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/mvi/CancelCardReasonSelectionEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/mvi/CancelCardReasonSelectionEffect;", "<init>", "()V", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/mvi/CancelCardReasonSelectionState;Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/mvi/CancelCardReasonSelectionEvent;)Larrow/core/Either;", "", "getName", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CancelCardReasonSelectionReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEvent, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CancelCardReasonSelectionReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEffect>> reduce(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState state, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState.Success)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState.Success success = (com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState.Success) state;
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEvent.ReasonSelected) {
                com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEvent.ReasonSelected reasonSelected = (com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEvent.ReasonSelected) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState.Success(reasonSelected.getReason()), new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEffect.NavigateToConfirmation(reasonSelected.getReason()));
            }
            if (!(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEvent.BackPressed)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEffect.NavigateBack.INSTANCE);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEvent.ReasonSelected) {
            com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEvent.ReasonSelected reasonSelected2 = (com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEvent.ReasonSelected) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState.Success(reasonSelected2.getReason()), new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEffect.NavigateToConfirmation(reasonSelected2.getReason()));
        }
        if (!(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEvent.BackPressed)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionState.Initial.INSTANCE, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEffect.NavigateBack.INSTANCE);
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "CancelCardReasonSelectionReducer";
    }
}

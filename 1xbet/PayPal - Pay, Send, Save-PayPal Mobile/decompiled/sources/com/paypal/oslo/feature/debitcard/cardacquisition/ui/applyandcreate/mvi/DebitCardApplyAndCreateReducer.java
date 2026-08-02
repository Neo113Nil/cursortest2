package com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateEvent;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiEffect;", "<init>", "()V", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState;Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateEvent;)Larrow/core/Either;", "", "getName", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardApplyAndCreateReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState, com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent, com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DebitCardApplyAndCreateReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState, com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiEffect>> reduce(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState state, com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Provisioning)) {
                if (state instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Success) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
                }
                if (!(state instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Error error = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Error) state;
                if (event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.ProvisionCard) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Provisioning(error.getRetryCount() + 1), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
            }
            com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Provisioning provisioning = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Provisioning) state;
            if (event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.ProvisionCard) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(provisioning, event);
            }
            if (!(event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.OnProvisionSuccess)) {
                if (!(event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.OnProvisionError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.OnProvisionError onProvisionError = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.OnProvisionError) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Error(onProvisionError.getErrorCode(), onProvisionError.getErrorMessage(), onProvisionError.getErrorType(), provisioning.getRetryCount()), null, 2, null);
            }
            com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse response = ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.OnProvisionSuccess) event).getResponse();
            if (response instanceof com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse.Success) {
                com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Success success = com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Success.INSTANCE;
                com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse.Success success2 = (com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse.Success) response;
                java.lang.String id = success2.getDebitInstrument().getId();
                java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> actions = success2.getDebitInstrument().getActions();
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiEffect.NavigateToCardCreationSuccess(id, actions != null ? actions.contains(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.PUSH_PROVISION) : false, com.paypal.oslo.feature.debitcard.cardacquisition.domain.mapper.ProvisionDebitInstrumentMapperKt.provisionDebitInstrumentResponseToDebitCardData(success2)));
            }
            if (!(response instanceof com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse.Contingency)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Error("contingency_error", null, null, 0, 14, null), null, 2, null);
        }
        com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Initial initial = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.ProvisionCard) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Provisioning(0, 1, null), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "DebitCardApplyAndCreateReducer";
    }
}

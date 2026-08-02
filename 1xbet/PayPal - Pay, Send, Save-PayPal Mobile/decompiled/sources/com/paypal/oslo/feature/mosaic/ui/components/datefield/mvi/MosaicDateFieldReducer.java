package com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiState;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEvent;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiState;Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicDateFieldReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState, com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent, com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MosaicDateFieldReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "MosaicDateFieldReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState, com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEffect>> reduce(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState state, com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Ready)) {
                if (!(state instanceof com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Error error = (com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Error) state;
                if (event instanceof com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.FieldFocused) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(error.copy(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel.copy$default(error.getUiModel(), null, null, true, null, 11, null)), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.FieldUnfocused) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(error.copy(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel.copy$default(error.getUiModel(), null, null, false, null, 11, null)), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.DateValidated) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(error.copy(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel.copy$default(error.getUiModel(), null, null, false, null, 7, null)), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.ValidationFailed) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(error.copy(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel.copy$default(error.getUiModel(), null, null, false, ((com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.ValidationFailed) event).getError(), 7, null)), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
            }
            com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Ready ready = (com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Ready) state;
            if (event instanceof com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.FieldFocused) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready.copy(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel.copy$default(ready.getUiModel(), null, null, true, null, 11, null)), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.FieldUnfocused) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready.copy(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel.copy$default(ready.getUiModel(), null, null, false, null, 11, null)), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.DateValidated) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready.copy(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel.copy$default(ready.getUiModel(), null, null, false, null, 7, null)), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.ValidationFailed) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready.copy(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel.copy$default(ready.getUiModel(), null, null, false, ((com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.ValidationFailed) event).getError(), 7, null)), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
        }
        com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Initial initial = (com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.Initialize) {
            com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.Initialize initialize = (com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.Initialize) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Ready(new com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel(initialize.getDateFormat(), initialize.getInputMask(), false, null)), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }
}

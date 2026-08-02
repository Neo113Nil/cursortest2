package com.paypal.oslo.feature.bnplservicing.ui.changefi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState;Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChangeFiReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ChangeFiReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ChangeFiReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect>> reduce(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState state, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent event) {
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect>> output$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Loading)) {
            if (state instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Success) {
                output$default = com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiReducerKt.access$reduceSuccessState((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Success) state, event);
            } else if (state instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Error) {
                output$default = com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiReducerKt.access$reduceErrorState(state, event);
            } else if (state instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.UpdatingPaymentMethod) {
                output$default = com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiReducerKt.access$reduceUpdatingPaymentMethodState((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.UpdatingPaymentMethod) state, event);
            } else {
                if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Reset)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Reset reset = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Reset) state;
                if ((event instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadData) || (event instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnRefreshWithNewFi)) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Loading.INSTANCE, null, 2, null);
                } else {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(reset, event);
                }
            }
        } else if ((event instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnClose) || (event instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnDismiss) || (event instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadData) || (event instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnRefreshWithNewFi)) {
            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
        } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnDataLoaded) {
            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Success(((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnDataLoaded) event).getUiModel()), null, 2, null);
        } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadFiError) {
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadFiError onLoadFiError = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnLoadFiError) event;
            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Error(onLoadFiError.getCorrelationId(), onLoadFiError.getCreditAccountId(), onLoadFiError.getCreditProductIdentifier(), null, 8, null), null, 2, null);
        } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiError) {
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiError onUpdateFiError = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiError) event;
            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Error(onUpdateFiError.getCorrelationId(), onUpdateFiError.getCreditAccountId(), onUpdateFiError.getCreditProductIdentifier(), onUpdateFiError.getFundingInstrument()), null, 2, null);
        } else {
            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
        }
        if (output$default instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerUtilsKt.logBnplServReducerEvent$default(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, getName(), event.getName(), false, 4, null);
            return output$default;
        }
        if (output$default instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerUtilsKt.logBnplServReducerEvent(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, getName(), event.getName(), true);
            return output$default;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}

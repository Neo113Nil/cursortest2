package com.paypal.oslo.feature.bnplservicing.ui.autopay;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayUiState;Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UpdateAutopayReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState, com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent, com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public UpdateAutopayReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "UpdateAutopayReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState, com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect>> reduce(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState state, com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent event) {
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState, com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect>> output$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Default)) {
            if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Success)) {
                    if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Error error = (com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Error) state;
                    if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnClose) {
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(error, null, 2, null);
                    } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnLoadDefaultData) {
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Default.INSTANCE, null, 2, null);
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnReset.INSTANCE)) {
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Default.INSTANCE, null, 2, null);
                    } else {
                        output$default = event instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnConfirmClicked ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Loading.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                    }
                } else {
                    com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Success success = (com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Success) state;
                    if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnClose) {
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
                    } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnSuccessMessageDismissed) {
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Default.INSTANCE, null, 2, null);
                    } else {
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                    }
                }
            } else {
                com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Loading loading = (com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Loading) state;
                if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnConfirmClicked) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
                } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnClose) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
                } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.AutopayStatusUpdated) {
                    com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.AutopayStatusUpdated autopayStatusUpdated = (com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.AutopayStatusUpdated) event;
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Success(new com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayUpdatedModel(autopayStatusUpdated.getAutopayOnModel(), autopayStatusUpdated.getAutopayOffModel())), new com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.ShowAutopayUpdatedHalfSheet(new com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayUpdatedModel(autopayStatusUpdated.getAutopayOnModel(), autopayStatusUpdated.getAutopayOffModel())));
                } else if (!(event instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnError)) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
                } else {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Error.INSTANCE, new com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.ShowErrorHalfSheet(((com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnError) event).getCorrelationId()));
                }
            }
        } else {
            com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Default r8 = (com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Default) state;
            if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnConfirmClicked) {
                output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Loading.INSTANCE, null, 2, null);
            } else {
                output$default = event instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnLoadDefaultData ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Default.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(r8, event);
            }
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

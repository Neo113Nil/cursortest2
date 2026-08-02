package com.paypal.oslo.feature.identity.unifiedalert.ui;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState;Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UnifiedAlertReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState, com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent, com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiEffect> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertReducer INSTANCE = new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertReducer();

    private UnifiedAlertReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "UnifiedAlertReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState, com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiEffect>> reduce(com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState state, com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Loading)) {
            if (!(state instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.AlertAction)) {
                if (!(state instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Processing)) {
                    if (!(state instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Approved)) {
                        if (!(state instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Denied)) {
                            if (!(state instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Expired)) {
                                if (!(state instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Error)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Error error = (com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Error) state;
                                if (event instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertReceived) {
                                    com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertReceived onAlertReceived = (com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertReceived) event;
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.AlertAction(onAlertReceived.getAlertData(), onAlertReceived.getSource()), null, 2, null);
                                }
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
                }
                com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Processing processing = (com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Processing) state;
                if (event instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnConfirmSuccess) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Approved(processing.getAlertData()), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnDenySuccess) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Denied(processing.getAlertData()), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnProcessError) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Error(processing.getAlertData(), processing.getSource()), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(processing, event);
            }
            com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.AlertAction alertAction = (com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.AlertAction) state;
            if (event instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnYesClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Processing(alertAction.getAlertData(), alertAction.getSource(), true), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnNoClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Processing(alertAction.getAlertData(), alertAction.getSource(), false), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(alertAction, event);
        }
        com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Loading loading = (com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Loading) state;
        if (event instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertReceived) {
            com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertReceived onAlertReceived2 = (com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertReceived) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.AlertAction(onAlertReceived2.getAlertData(), onAlertReceived2.getSource()), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertExpired) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Expired(((com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertExpired) event).getAlertData()), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
    }
}

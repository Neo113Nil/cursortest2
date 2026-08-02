package com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.reducer;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/reducer/FaceTecLivenessCaptureReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiState;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureEvent;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiState;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FaceTecLivenessCaptureReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public FaceTecLivenessCaptureReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "FaceTecLivenessCaptureReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect>> reduce(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState state, com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent event) {
        java.lang.String error;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState.Initializing) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState.Initializing initializing = (com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState.Initializing) state;
            if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.Initialize) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(initializing, null, 2, null);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.SDKInitialized.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState.Ready.INSTANCE, null, 2, null);
            }
            boolean z = event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.SDKInitializationFailed;
            if (z || (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.LivenessCheckError)) {
                if (z) {
                    error = ((com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.SDKInitializationFailed) event).getError();
                } else {
                    error = event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.LivenessCheckError ? ((com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.LivenessCheckError) event).getError() : com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState.Error(error), new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.ShowError(error));
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initializing, event);
        }
        if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState.Ready) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState.Ready ready = (com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState.Ready) state;
            if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.SetSessionToken) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready, null, 2, null);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.StartLivenessCheck.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.StartFaceTecSession.INSTANCE);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.LivenessCheckStarted.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState.InProgress.INSTANCE, null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
        }
        if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState.InProgress) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState.InProgress inProgress = (com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState.InProgress) state;
            if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.LivenessCheckSuccess) {
                com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.LivenessCheckSuccess livenessCheckSuccess = (com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.LivenessCheckSuccess) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(inProgress, new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithSuccess(livenessCheckSuccess.getSessionId(), livenessCheckSuccess.getFaceScanData(), livenessCheckSuccess.getAuditTrailImages()));
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.LivenessCheckCancelled.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(inProgress, com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithCancelled.INSTANCE);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.LivenessCheckTimeout.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(inProgress, new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithTimeout(0L));
            }
            if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.LivenessCheckError) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(inProgress, new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithError("LIVENESS_ERROR", ((com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.LivenessCheckError) event).getError()));
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(inProgress, event);
        }
        if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState.Processing) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState.Processing processing = (com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState.Processing) state;
            if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.LivenessCheckSuccess) {
                com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.LivenessCheckSuccess livenessCheckSuccess2 = (com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.LivenessCheckSuccess) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(processing, new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateToLivenessReview(livenessCheckSuccess2.getSessionId(), livenessCheckSuccess2.getFaceScanData()));
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(processing, event);
        }
        if (!(state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState.Error)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState.Error error2 = (com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState.Error) state;
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.RetryTapped.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState.Initializing.INSTANCE, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error2, event);
    }
}

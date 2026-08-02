package com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.reducer;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/reducer/LivenessReviewReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewUiState;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewEvent;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewUiState;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LivenessReviewReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public LivenessReviewReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "LivenessReviewReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiEffect>> reduce(com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiState state, com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiState.Loading) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiState.Loading loading = (com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.Initialize) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiState.Ready(((com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.Initialize) event).getFaceScanResultBlob()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiState.Ready) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiState.Ready ready = (com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiState.Ready) state;
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.ConfirmTapped.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiState.Submitting.INSTANCE, null, 2, null);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.RetakeTapped.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiEffect.NavigateToLivenessCheck.INSTANCE);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
        }
        if (!(state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiState.Submitting)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiState.Submitting submitting = (com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiState.Submitting) state;
        if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.SubmissionSuccess) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(submitting, new com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiEffect.NavigateToSuccess(((com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.SubmissionSuccess) event).getVerificationId()));
        }
        if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.SubmissionError) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiState.Ready(""), new com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiEffect.ShowError(((com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewEvent.SubmissionError) event).getError()));
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(submitting, event);
    }
}

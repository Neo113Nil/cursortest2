package com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.reducer;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/reducer/DocumentReviewReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewUiState;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewUiState;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DocumentReviewReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DocumentReviewReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "DocumentReviewReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiEffect>> reduce(com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState state, com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState.Loading) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState.Loading loading = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.Initialize) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState.Ready(((com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.Initialize) event).getImageUri()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState.Ready) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState.Ready ready = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState.Ready) state;
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.ConfirmTapped.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState.Uploading.INSTANCE, null, 2, null);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.RetakeTapped.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiEffect.NavigateToDocumentCapture.INSTANCE);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
        }
        if (!(state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState.Uploading)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState.Uploading uploading = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState.Uploading) state;
        if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.UploadSuccess) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(uploading, com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiEffect.NavigateToConfirmIdentity.INSTANCE);
        }
        if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.UploadError) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState.Ready(""), new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiEffect.ShowError(((com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.UploadError) event).getError()));
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(uploading, event);
    }
}

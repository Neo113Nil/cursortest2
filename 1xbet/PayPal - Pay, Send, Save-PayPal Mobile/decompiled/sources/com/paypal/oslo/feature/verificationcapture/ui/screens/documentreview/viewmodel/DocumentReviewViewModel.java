package com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00180\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u001b8\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/viewmodel/DocumentReviewViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/reducer/DocumentReviewReducer;", "reducer", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/UploadDocumentUseCase;", "uploadDocumentUseCase", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/reducer/DocumentReviewReducer;Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/UploadDocumentUseCase;)V", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/UploadDocumentUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/VerificationCaptureDocumentReviewDestination;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/VerificationCaptureDocumentReviewDestination;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewUiState;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewUiEffect;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DocumentReviewViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureDocumentReviewDestination getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiEffect> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState> uiState;

    @javax.inject.Inject
    public DocumentReviewViewModel(androidx.view.SavedStateHandle savedStateHandle, com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.reducer.DocumentReviewReducer documentReviewReducer, com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase uploadDocumentUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateHandle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentReviewReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uploadDocumentUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = uploadDocumentUseCase;
        com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureDocumentReviewDestination verificationCaptureDocumentReviewDestination = (com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureDocumentReviewDestination) com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.toPath(savedStateHandle);
        this.getHighSpeedVideoFpsRanges = verificationCaptureDocumentReviewDestination;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("DocumentReviewViewModel.store", com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState.Loading.INSTANCE, documentReviewReducer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{com.paypal.oslo.feature.verificationcapture.ui.util.MviObservabilityMiddlewareKt.createObservabilityMiddleware("Document review"), new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent>() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                if (kotlin.jvm.internal.Intrinsics.areEqual(input.getEvent(), com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.ConfirmTapped.INSTANCE)) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r2), null, null, new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel$uploadDocument$1(com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel.this, null), 3, null);
                }
            }
        }}), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoSizes = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        processEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.Initialize(verificationCaptureDocumentReviewDestination.getImageUri()));
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoSizes.onEvent(event);
    }
}

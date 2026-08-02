package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R&\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001a0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d8\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetReducer;", "reducer", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/DownloadDocumentUseCase;", "downloadDocument", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "sessionStorage", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetReducer;Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/DownloadDocumentUseCase;Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;)V", "", "initialize", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetEvent;", "event", "processEvent", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetEvent;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetReducer;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/DownloadDocumentUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetUiEffect;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DocumentsHalfSheetViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase getHighSpeedVideoSizes;
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetUiState, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetUiEffect> getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetReducer getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetUiState> uiState;

    @javax.inject.Inject
    public DocumentsHalfSheetViewModel(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetReducer documentsHalfSheetReducer, com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase downloadDocumentUseCase, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentsHalfSheetReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadDocumentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionStorage, "");
        this.getHighSpeedVideoFpsRanges = documentsHalfSheetReducer;
        this.getHighSpeedVideoSizes = downloadDocumentUseCase;
        this.getHighSpeedVideoFpsRangesFor = sessionStorage;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetUiState, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("DocumentsHalfSheetViewModel.store", new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetUiState.Idle(false, 1, null), documentsHalfSheetReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetUiState, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetUiState, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent event = input.getEvent();
                if ((event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.DocumentClicked) && (input.getStates().getFirst() instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetUiState.Idle)) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r3), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetViewModel$downloadDocumentAsync$1(((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.DocumentClicked) event).getDocument(), com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetViewModel.this, null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighResolutionOutputSizeshNQ4ISI = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void initialize() {
        processEvent(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.SheetOpened.INSTANCE);
    }

    public final void processEvent(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighResolutionOutputSizeshNQ4ISI.onEvent(event);
    }
}

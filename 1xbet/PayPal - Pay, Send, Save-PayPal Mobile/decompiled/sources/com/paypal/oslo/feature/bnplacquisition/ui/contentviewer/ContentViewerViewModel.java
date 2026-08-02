package com.paypal.oslo.feature.bnplacquisition.ui.contentviewer;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020!0\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"R \u0010$\u001a\b\u0012\u0004\u0012\u00020 0#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010)\u001a\b\u0012\u0004\u0012\u00020!0(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerReducer;", "reducer", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/DownloadDocumentUseCase;", "downloadDocument", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "sessionStorage", "Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerUiMapper;", "uiMapper", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerReducer;Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/DownloadDocumentUseCase;Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerUiMapper;)V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerEvent;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerReducer;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/DownloadDocumentUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerUiMapper;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerUiModel;", "uiModel", "Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerUiModel;", "getUiModel", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerUiModel;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerUiEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ContentViewerViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerReducer getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiState, com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent, com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiEffect> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiMapper getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiEffect> uiEffect;
    private final com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiModel uiModel;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiState> uiState;

    @javax.inject.Inject
    public ContentViewerViewModel(com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerReducer contentViewerReducer, com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase downloadDocumentUseCase, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage, com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiMapper contentViewerUiMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentViewerReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadDocumentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentViewerUiMapper, "");
        this.getHighSpeedVideoFpsRanges = contentViewerReducer;
        this.Camera2StreamConfigurationMap = downloadDocumentUseCase;
        this.getHighSpeedVideoFpsRangesFor = sessionStorage;
        this.getHighResolutionOutputSizeshNQ4ISI = contentViewerUiMapper;
        this.uiModel = contentViewerUiMapper.toUiModel();
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiState, com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent, com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("ContentViewerViewModel.store", new com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiState.Idle(false, 1, null), contentViewerReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiState, com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiState, com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent event = input.getEvent();
                if ((event instanceof com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadClicked) && (input.getStates().getFirst() instanceof com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiState.Idle)) {
                    com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadClicked downloadClicked = (com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadClicked) event;
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r4), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel$downloadDocumentAsync$1(com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel.this, downloadClicked.getStaticUrl(), downloadClicked.getRelativePath(), downloadClicked.getFileName(), null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoSizes = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiModel getUiModel() {
        return this.uiModel;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoSizes.onEvent(event);
    }
}

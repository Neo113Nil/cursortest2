package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 82\u00020\u0001:\u00018B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0017\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\n0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR&\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0%8\u0007¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010+\u001a\b\u0012\u0004\u0012\u00020!0*8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u00100\u001a\b\u0012\u0004\u0012\u00020/0%8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b1\u0010)R \u00104\u001a\b\u0012\u0004\u0012\u000203028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/DownloadOrchestrator;", "downloadOrchestrator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/DownloadOrchestrator;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadReducer;)V", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent;", "event", "", "onEvent", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent;)V", "retryDownload", "()V", "dismissDownloadError", "resetDownloadOrchestrator", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/DownloadOrchestrator;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taxanddocumentcenter/api/navigation/CustomStatementDownloadDestination;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taxanddocumentcenter/api/navigation/CustomStatementDownloadDestination;", "", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadUiState;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadUiEffect;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoSizesFor", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/DownloadUiState;", "downloadState", "getDownloadState", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/OpenDownloadedFile;", "openFileEffect", "Lkotlinx/coroutines/flow/SharedFlow;", "getOpenFileEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CustomStatementDownloadViewModel extends androidx.view.ViewModel {
    public static final java.lang.String INVALID_FILE_NAME_ERROR = "Invalid file name";
    private final java.lang.String Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState> downloadState;
    private final com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.CustomStatementDownloadDestination getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiEffect> getHighSpeedVideoSizesFor;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.OpenDownloadedFile> openFileEffect;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState> uiState;
    public static final int $stable = 8;

    @javax.inject.Inject
    public CustomStatementDownloadViewModel(com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator downloadOrchestrator, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadReducer customStatementDownloadReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadOrchestrator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customStatementDownloadReducer, "");
        this.getHighSpeedVideoFpsRangesFor = downloadOrchestrator;
        java.lang.Object lastOrNull = kotlin.collections.CollectionsKt.lastOrNull((java.util.List<? extends java.lang.Object>) appNavigator.getBackStack());
        com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.CustomStatementDownloadDestination customStatementDownloadDestination = lastOrNull instanceof com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.CustomStatementDownloadDestination ? (com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.CustomStatementDownloadDestination) lastOrNull : null;
        this.getHighSpeedVideoFpsRanges = customStatementDownloadDestination;
        java.lang.String fileName = customStatementDownloadDestination != null ? customStatementDownloadDestination.getFileName() : null;
        java.lang.String str = fileName == null ? "" : fileName;
        this.Camera2StreamConfigurationMap = str;
        java.lang.String source = customStatementDownloadDestination != null ? customStatementDownloadDestination.getSource() : null;
        java.lang.String str2 = source == null ? "" : source;
        this.getHighSpeedVideoSizes = str2;
        com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent> middleware = new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent>() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent event = input.getEvent();
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadClicked.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.RetryClicked.INSTANCE)) {
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadViewModel.access$startDownload(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadViewModel.this);
                }
            }
        };
        this.getHighResolutionOutputSizeshNQ4ISI = middleware;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("CustomStatementDownloadViewModel.store", new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState.Content(str, str2, null, 4, null), customStatementDownloadReducer, kotlin.collections.CollectionsKt.listOf(middleware), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoSizesFor = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        this.downloadState = downloadOrchestrator.getState();
        this.openFileEffect = downloadOrchestrator.getEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState> getDownloadState() {
        return this.downloadState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.OpenDownloadedFile> getOpenFileEffect() {
        return this.openFileEffect;
    }

    public final void onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoSizesFor.onEvent(event);
    }

    public final void retryDownload() {
        com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState value = this.getHighSpeedVideoFpsRangesFor.getState().getValue();
        if (value instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Error) {
            this.getHighSpeedVideoFpsRangesFor.retryDownload(((com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Error) value).getDownloadUrl());
        }
    }

    public final void dismissDownloadError() {
        this.getHighSpeedVideoFpsRangesFor.dismissError();
    }

    public final void resetDownloadOrchestrator() {
        this.getHighSpeedVideoFpsRangesFor.cancelAndReset();
    }

    public static final /* synthetic */ void access$startDownload(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadViewModel customStatementDownloadViewModel) {
        if (kotlin.text.StringsKt.isBlank(customStatementDownloadViewModel.Camera2StreamConfigurationMap)) {
            customStatementDownloadViewModel.getHighSpeedVideoSizesFor.onEvent(new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadFailed("", INVALID_FILE_NAME_ERROR));
        } else {
            customStatementDownloadViewModel.getHighSpeedVideoFpsRangesFor.startDownload(com.paypal.oslo.feature.taxanddocumentcenter.ui.util.UrlUtils.INSTANCE.buildCustomStatementDownloadPath$tax_and_document_center_prodRelease(customStatementDownloadViewModel.Camera2StreamConfigurationMap));
        }
    }
}

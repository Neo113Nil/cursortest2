package com.paypal.oslo.feature.taxanddocumentcenter.ui.download;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a8\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010$\u001a\b\u0012\u0004\u0012\u00020 0#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010!\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/DownloadOrchestrator;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/DownloadDocumentUseCase;", "downloadDocumentUseCase", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/DownloadDocumentUseCase;Lkotlinx/coroutines/CoroutineScope;)V", "", "url", "", "startDownload", "(Ljava/lang/String;)V", "retryDownload", "dismissError", "()V", "cancelAndReset", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/DownloadDocumentUseCase;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/DownloadUiState;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/OpenDownloadedFile;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DownloadOrchestrator {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.OpenDownloadedFile> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.OpenDownloadedFile> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState> state;

    @javax.inject.Inject
    public DownloadOrchestrator(com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase downloadDocumentUseCase, @javax.inject.Named("downloadOrchestratorScope") kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadDocumentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoFpsRanges = downloadDocumentUseCase;
        this.getHighSpeedVideoSizes = coroutineScope;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Idle.INSTANCE);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.state = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.OpenDownloadedFile> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.Camera2StreamConfigurationMap = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.OpenDownloadedFile> getEffect() {
        return this.effect;
    }

    public final void startDownload(java.lang.String url) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlinx.coroutines.Job job = this.getHighSpeedVideoFpsRangesFor;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes, null, null, new com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator$startDownload$1(this, url, null), 3, null);
        this.getHighSpeedVideoFpsRangesFor = launch$default;
    }

    public final void retryDownload(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        startDownload(url);
    }

    public final void dismissError() {
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Idle.INSTANCE);
    }

    public final void cancelAndReset() {
        if (this.getHighSpeedVideoFpsRangesFor != null && (this.getHighResolutionOutputSizeshNQ4ISI.getValue() instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Downloading)) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Download cancelled by user navigation", null, null, 6, null);
        }
        kotlinx.coroutines.Job job = this.getHighSpeedVideoFpsRangesFor;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Idle.INSTANCE);
    }
}

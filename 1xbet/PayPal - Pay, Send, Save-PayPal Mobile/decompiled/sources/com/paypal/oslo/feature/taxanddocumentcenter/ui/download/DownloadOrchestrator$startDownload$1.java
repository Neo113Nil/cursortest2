package com.paypal.oslo.feature.taxanddocumentcenter.ui.download;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator$startDownload$1", f = "DownloadOrchestrator.kt", i = {1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 145}, m = "invokeSuspend", n = {"result"}, nl = {140, 153}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class DownloadOrchestrator$startDownload$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
    
        if (r4.emit(new com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.OpenDownloadedFile(r5.getFileUri(), r5.getFileName(), r5.getMimeType()), r18) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0155, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005c, code lost:
    
        if (r2 != r1) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase downloadDocumentUseCase;
        java.lang.Object invoke;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            if (!(mutableStateFlow.getValue() instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Downloading)) {
                mutableStateFlow2 = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                mutableStateFlow2.setValue(new com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Downloading(this.getHighResolutionOutputSizeshNQ4ISI));
                downloadDocumentUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = 1;
                invoke = downloadDocumentUseCase.invoke(this.getHighResolutionOutputSizeshNQ4ISI, this);
            } else {
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.download.DownloadResult downloadResult = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.download.DownloadResult) invoke;
        if (downloadResult instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.download.DownloadResult.Success) {
            mutableStateFlow4 = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow4.setValue(com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Idle.INSTANCE);
            mutableSharedFlow = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.download.DownloadResult.Success success = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.download.DownloadResult.Success) downloadResult;
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadResult);
            this.getHighSpeedVideoFpsRanges = 2;
        } else {
            if (!(downloadResult instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.download.DownloadResult.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.download.DownloadResult.Error error = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.download.DownloadResult.Error) downloadResult;
            com.paypal.oslo.downloads.api.model.DownloadError error2 = error.getError();
            if ((error2 instanceof com.paypal.oslo.downloads.api.model.DownloadError.NetworkError) || (error2 instanceof com.paypal.oslo.downloads.api.model.DownloadError.AuthenticationError) || (error2 instanceof com.paypal.oslo.downloads.api.model.DownloadError.StorageError) || (error2 instanceof com.paypal.oslo.downloads.api.model.DownloadError.ServerError)) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Download failed - expected error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("urlPath", this.getHighResolutionOutputSizeshNQ4ISI), kotlin.TuplesKt.to("errorType", error.getError().getClass().getSimpleName()), kotlin.TuplesKt.to("errorMessage", error.getError().getMessage())), null, 4, null);
            } else {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Download failed - unexpected error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("urlPath", this.getHighResolutionOutputSizeshNQ4ISI), kotlin.TuplesKt.to("errorType", error.getError().getClass().getSimpleName()), kotlin.TuplesKt.to("errorMessage", error.getError().getMessage())), null, null, 12, null);
            }
            mutableStateFlow3 = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow3.setValue(new com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Error(this.getHighResolutionOutputSizeshNQ4ISI, error.getError().getMessage()));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator$startDownload$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator$startDownload$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadOrchestrator$startDownload$1(com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator downloadOrchestrator, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator$startDownload$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = downloadOrchestrator;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}

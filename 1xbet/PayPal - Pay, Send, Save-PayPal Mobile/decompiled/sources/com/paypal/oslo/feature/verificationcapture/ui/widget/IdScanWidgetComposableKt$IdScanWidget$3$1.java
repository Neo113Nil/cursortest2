package com.paypal.oslo.feature.verificationcapture.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$IdScanWidget$3$1", f = "IdScanWidgetComposable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class IdScanWidgetComposableKt$IdScanWidget$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState access$IdScanWidget$lambda$4 = com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt.access$IdScanWidget$lambda$4(this.getHighSpeedVideoFpsRanges);
        if (access$IdScanWidget$lambda$4 instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Uploading) {
            com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetImpl.notifyListeners$verification_capture_prodRelease$default(this.getHighSpeedVideoSizes, com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode.UPLOADING, null, null, null, 14, null);
        } else if (access$IdScanWidget$lambda$4 instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success success = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success) access$IdScanWidget$lambda$4;
            java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> documents = success.getDocuments();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(documents, 10));
            for (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview documentPreview : documents) {
                java.lang.String fileId = documentPreview.getFileId();
                if (fileId == null) {
                    fileId = "";
                }
                java.lang.String str = fileId;
                java.lang.String docId = documentPreview.getDocId();
                byte[] imageData = documentPreview.getImageData();
                if (imageData == null) {
                    imageData = new byte[0];
                }
                arrayList.add(new com.paypal.oslo.feature.verificationcapture.api.widget.CapturedFile(str, docId, imageData, documentPreview.getMimeType(), okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE * documentPreview.getSizeKB(), true));
            }
            java.util.ArrayList arrayList2 = arrayList;
            this.getHighSpeedVideoSizes.setCachedResult$verification_capture_prodRelease(new com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetResult(success.getDocId(), arrayList2));
            com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetImpl.notifyListeners$verification_capture_prodRelease$default(this.getHighSpeedVideoSizes, com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode.DOC_UPLOADED, success.getDocId(), arrayList2, null, 8, null);
        } else if (access$IdScanWidget$lambda$4 instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready ready = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) access$IdScanWidget$lambda$4;
            if (ready.getDocuments().isEmpty() && ready.getError() == null) {
                this.getHighSpeedVideoSizes.setCachedResult$verification_capture_prodRelease(null);
                com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetImpl.notifyListeners$verification_capture_prodRelease$default(this.getHighSpeedVideoSizes, com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode.DOC_ALL_REMOVED, null, null, null, 14, null);
            } else if (ready.getError() != null) {
                java.lang.String str2 = this.Camera2StreamConfigurationMap;
                if (str2 == null) {
                    str2 = ready.getError().getMessage();
                }
                com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetImpl.notifyListeners$verification_capture_prodRelease$default(this.getHighSpeedVideoSizes, com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode.ERROR, null, null, str2, 6, null);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$IdScanWidget$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$IdScanWidget$3$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    IdScanWidgetComposableKt$IdScanWidget$3$1(com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetImpl idScanWidgetImpl, java.lang.String str, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$IdScanWidget$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = idScanWidgetImpl;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = state;
    }
}

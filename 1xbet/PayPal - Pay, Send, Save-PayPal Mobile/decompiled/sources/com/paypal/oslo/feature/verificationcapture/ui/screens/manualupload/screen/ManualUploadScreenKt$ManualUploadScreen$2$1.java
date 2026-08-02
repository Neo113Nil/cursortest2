package com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$2$1", f = "ManualUploadScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ManualUploadScreenKt$ManualUploadScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt.access$ManualUploadScreen$lambda$1(this.getHighSpeedVideoSizes) instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState access$ManualUploadScreen$lambda$1 = com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt.access$ManualUploadScreen$lambda$1(this.getHighSpeedVideoSizes);
            kotlin.jvm.internal.Intrinsics.checkNotNull(access$ManualUploadScreen$lambda$1, "");
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready ready = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) access$ManualUploadScreen$lambda$1;
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "STATE UPDATED", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("document_count", kotlin.coroutines.jvm.internal.Boxing.boxInt(ready.getDocuments().size()))), null, 4, null);
            for (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview documentPreview : ready.getDocuments()) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Document details", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("document_id", documentPreview.getId()), kotlin.TuplesKt.to(androidx.core.provider.FontsContractCompat.Columns.FILE_ID, documentPreview.getFileId()), kotlin.TuplesKt.to("is_uploaded", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(documentPreview.isUploaded())), kotlin.TuplesKt.to("is_uploading", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(documentPreview.isUploading()))), null, 4, null);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$2$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ManualUploadScreenKt$ManualUploadScreen$2$1(androidx.compose.runtime.State<? extends com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = state;
    }
}

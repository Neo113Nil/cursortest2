package com.paypal.oslo.feature.mosaic.widget;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.mosaic.widget.MosaicDocUploadWidgetImplKt$MosaicDocUploadWidgetBody$5$1", f = "MosaicDocUploadWidgetImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class MosaicDocUploadWidgetImplKt$MosaicDocUploadWidgetBody$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Error, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetInterface getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Success, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetConfig getHighSpeedVideoSizes;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.mosaic.widget.DocUploadWidgetStateImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputFormats != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetInterface idScanWidgetInterface = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String concat = "doc_upload_".concat(java.lang.String.valueOf(this.getHighSpeedVideoSizes.getDocCategory().name()));
        final androidx.compose.runtime.State<com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID> state = this.getHighSpeedVideoFpsRangesFor;
        final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetConfig docUploadWidgetConfig = this.getHighSpeedVideoSizes;
        final com.paypal.oslo.feature.mosaic.widget.DocUploadWidgetStateImpl docUploadWidgetStateImpl = this.getOutputMinFrameDuration;
        final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Success, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRanges;
        final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Error, kotlin.Unit> function12 = this.Camera2StreamConfigurationMap;
        idScanWidgetInterface.setListener(concat, new com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetListener() { // from class: com.paypal.oslo.feature.mosaic.widget.MosaicDocUploadWidgetImplKt$MosaicDocUploadWidgetBody$5$1$$ExternalSyntheticLambda0
            @Override // com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetListener
            public final void onStatusChange(com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetStatus idScanWidgetStatus) {
                com.paypal.oslo.feature.mosaic.widget.MosaicDocUploadWidgetImplKt$MosaicDocUploadWidgetBody$5$1.getHighSpeedVideoFpsRanges(androidx.compose.runtime.State.this, docUploadWidgetConfig, docUploadWidgetStateImpl, function1, function12, idScanWidgetStatus);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.compose.runtime.State state, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetConfig docUploadWidgetConfig, com.paypal.oslo.feature.mosaic.widget.DocUploadWidgetStateImpl docUploadWidgetStateImpl, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetStatus idScanWidgetStatus) {
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID = (com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID) state.getValue();
        if (documentTypeID == null) {
            documentTypeID = (com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID) kotlin.collections.CollectionsKt.first((java.util.List) docUploadWidgetConfig.getAllowedDocTypes());
        }
        com.paypal.oslo.feature.mosaic.widget.MosaicDocUploadWidgetImplKt.access$handleIdScanWidgetStatus(idScanWidgetStatus, documentTypeID, docUploadWidgetStateImpl, function1, function12);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.mosaic.widget.MosaicDocUploadWidgetImplKt$MosaicDocUploadWidgetBody$5$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.mosaic.widget.MosaicDocUploadWidgetImplKt$MosaicDocUploadWidgetBody$5$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MosaicDocUploadWidgetImplKt$MosaicDocUploadWidgetBody$5$1(com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetInterface idScanWidgetInterface, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetConfig docUploadWidgetConfig, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID> state, com.paypal.oslo.feature.mosaic.widget.DocUploadWidgetStateImpl docUploadWidgetStateImpl, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Success, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Error, kotlin.Unit> function12, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.mosaic.widget.MosaicDocUploadWidgetImplKt$MosaicDocUploadWidgetBody$5$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = idScanWidgetInterface;
        this.getHighSpeedVideoSizes = docUploadWidgetConfig;
        this.getHighSpeedVideoFpsRangesFor = state;
        this.getOutputMinFrameDuration = docUploadWidgetStateImpl;
        this.getHighSpeedVideoFpsRanges = function1;
        this.Camera2StreamConfigurationMap = function12;
    }
}

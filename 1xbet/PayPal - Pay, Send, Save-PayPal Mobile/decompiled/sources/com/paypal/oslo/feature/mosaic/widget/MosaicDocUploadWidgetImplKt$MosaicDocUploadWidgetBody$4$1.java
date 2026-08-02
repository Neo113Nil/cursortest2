package com.paypal.oslo.feature.mosaic.widget;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.mosaic.widget.MosaicDocUploadWidgetImplKt$MosaicDocUploadWidgetBody$4$1", f = "MosaicDocUploadWidgetImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class MosaicDocUploadWidgetImplKt$MosaicDocUploadWidgetBody$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetConfig Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetInterface getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID getHighSpeedVideoSizes;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputFormats != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID = this.getHighSpeedVideoSizes;
        if (documentTypeID == null) {
            documentTypeID = (com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID) kotlin.collections.CollectionsKt.first((java.util.List) this.Camera2StreamConfigurationMap.getAllowedDocTypes());
        }
        com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetInterface idScanWidgetInterface = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String idScanDocumentType = com.paypal.oslo.feature.mosaic.widget.DocUploadMappingsKt.toIdScanDocumentType(documentTypeID);
        int maxFiles = this.Camera2StreamConfigurationMap.getMaxFiles();
        int maxFileSize = this.Camera2StreamConfigurationMap.getMaxFileSize();
        java.lang.String flowName = com.paypal.oslo.feature.mosaic.widget.DocUploadMappingsKt.toFlowName(this.Camera2StreamConfigurationMap.getDocCategory());
        com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale supportedLocale = this.Camera2StreamConfigurationMap.getForceEnUSLocale() ? com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale.EN_US : null;
        java.lang.String client = this.Camera2StreamConfigurationMap.getClient();
        if (client == null) {
            client = "adroit";
        }
        idScanWidgetInterface.setConfig(new com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetConfig(client, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, flowName, idScanDocumentType, com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT, maxFiles, maxFileSize, null, true, supportedLocale, null, 2304, null));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.mosaic.widget.MosaicDocUploadWidgetImplKt$MosaicDocUploadWidgetBody$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.mosaic.widget.MosaicDocUploadWidgetImplKt$MosaicDocUploadWidgetBody$4$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MosaicDocUploadWidgetImplKt$MosaicDocUploadWidgetBody$4$1(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetConfig docUploadWidgetConfig, com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetInterface idScanWidgetInterface, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.mosaic.widget.MosaicDocUploadWidgetImplKt$MosaicDocUploadWidgetBody$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = documentTypeID;
        this.Camera2StreamConfigurationMap = docUploadWidgetConfig;
        this.getHighSpeedVideoFpsRangesFor = idScanWidgetInterface;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = str2;
    }
}

package com.paypal.oslo.feature.mosaic.widget;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.mosaic.widget.MosaicDocUploadWidgetImplKt$MosaicDocUploadWidgetBody$3$1", f = "MosaicDocUploadWidgetImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class MosaicDocUploadWidgetImplKt$MosaicDocUploadWidgetBody$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID, kotlin.Unit> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetConfig getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.Camera2StreamConfigurationMap != null) {
            java.util.List<com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID> allowedDocTypes = this.getHighSpeedVideoSizes.getAllowedDocTypes();
            java.lang.String str = this.Camera2StreamConfigurationMap;
            java.util.Iterator<T> it = allowedDocTypes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID) obj2).getKey(), str)) {
                    break;
                }
            }
            com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID = (com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID) obj2;
            if (documentTypeID != null) {
                this.getHighSpeedVideoFpsRanges.invoke(documentTypeID);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.mosaic.widget.MosaicDocUploadWidgetImplKt$MosaicDocUploadWidgetBody$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.mosaic.widget.MosaicDocUploadWidgetImplKt$MosaicDocUploadWidgetBody$3$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MosaicDocUploadWidgetImplKt$MosaicDocUploadWidgetBody$3$1(java.lang.String str, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetConfig docUploadWidgetConfig, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.mosaic.widget.MosaicDocUploadWidgetImplKt$MosaicDocUploadWidgetBody$3$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = docUploadWidgetConfig;
        this.getHighSpeedVideoFpsRanges = function1;
    }
}

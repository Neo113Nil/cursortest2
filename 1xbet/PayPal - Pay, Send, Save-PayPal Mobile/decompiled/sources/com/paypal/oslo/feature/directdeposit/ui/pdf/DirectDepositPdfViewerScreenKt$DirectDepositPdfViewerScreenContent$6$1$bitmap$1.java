package com.paypal.oslo.feature.directdeposit.ui.pdf;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfViewerScreenKt$DirectDepositPdfViewerScreenContent$6$1$bitmap$1", f = "DirectDepositPdfViewerScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DirectDepositPdfViewerScreenKt$DirectDepositPdfViewerScreenContent$6$1$bitmap$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super android.graphics.Bitmap>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableIntState Camera2StreamConfigurationMap;
    final /* synthetic */ java.io.File getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableIntState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfRenderer getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int intValue;
        int intValue2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfRenderer directDepositPdfRenderer = this.getHighSpeedVideoSizes;
        java.io.File file = this.getHighResolutionOutputSizeshNQ4ISI;
        intValue = this.getHighSpeedVideoFpsRangesFor.getIntValue();
        intValue2 = this.Camera2StreamConfigurationMap.getIntValue();
        return directDepositPdfRenderer.renderPageToBitmap(file, 0, intValue, intValue2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> continuation) {
        return ((com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfViewerScreenKt$DirectDepositPdfViewerScreenContent$6$1$bitmap$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfViewerScreenKt$DirectDepositPdfViewerScreenContent$6$1$bitmap$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectDepositPdfViewerScreenKt$DirectDepositPdfViewerScreenContent$6$1$bitmap$1(com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfRenderer directDepositPdfRenderer, java.io.File file, androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.runtime.MutableIntState mutableIntState2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfViewerScreenKt$DirectDepositPdfViewerScreenContent$6$1$bitmap$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = directDepositPdfRenderer;
        this.getHighResolutionOutputSizeshNQ4ISI = file;
        this.getHighSpeedVideoFpsRangesFor = mutableIntState;
        this.Camera2StreamConfigurationMap = mutableIntState2;
    }
}

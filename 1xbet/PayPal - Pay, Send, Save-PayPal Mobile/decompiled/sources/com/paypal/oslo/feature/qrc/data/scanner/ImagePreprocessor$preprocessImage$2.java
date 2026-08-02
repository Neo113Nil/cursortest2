package com.paypal.oslo.feature.qrc.data.scanner;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.data.scanner.ImagePreprocessor$preprocessImage$2", f = "ImagePreprocessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ImagePreprocessor$preprocessImage$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super android.graphics.Bitmap>, java.lang.Object> {
    final /* synthetic */ android.net.Uri getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.qrc.data.scanner.ImagePreprocessor getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            android.graphics.Bitmap loadBitmap$qrc_prodRelease = this.getHighSpeedVideoFpsRanges.loadBitmap$qrc_prodRelease(this.getHighResolutionOutputSizeshNQ4ISI);
            if (loadBitmap$qrc_prodRelease == null) {
                return null;
            }
            return this.getHighSpeedVideoFpsRanges.enhanceContrastAggressive$qrc_prodRelease(this.getHighSpeedVideoFpsRanges.adaptiveBinarization$qrc_prodRelease(this.getHighSpeedVideoFpsRanges.convertToGrayscale$qrc_prodRelease(this.getHighSpeedVideoFpsRanges.optimizeForMlKit$qrc_prodRelease(this.getHighSpeedVideoFpsRanges.correctedForExifRotation$qrc_prodRelease(this.getHighResolutionOutputSizeshNQ4ISI, loadBitmap$qrc_prodRelease)))));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> continuation) {
        return ((com.paypal.oslo.feature.qrc.data.scanner.ImagePreprocessor$preprocessImage$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.qrc.data.scanner.ImagePreprocessor$preprocessImage$2(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImagePreprocessor$preprocessImage$2(com.paypal.oslo.feature.qrc.data.scanner.ImagePreprocessor imagePreprocessor, android.net.Uri uri, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.data.scanner.ImagePreprocessor$preprocessImage$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = imagePreprocessor;
        this.getHighResolutionOutputSizeshNQ4ISI = uri;
    }
}

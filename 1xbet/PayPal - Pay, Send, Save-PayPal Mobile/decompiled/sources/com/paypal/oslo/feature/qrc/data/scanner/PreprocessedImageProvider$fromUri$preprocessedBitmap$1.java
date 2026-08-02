package com.paypal.oslo.feature.qrc.data.scanner;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.data.scanner.PreprocessedImageProvider$fromUri$preprocessedBitmap$1", f = "ImagePreprocessor.kt", i = {}, l = {341}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class PreprocessedImageProvider$fromUri$preprocessedBitmap$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super android.graphics.Bitmap>, java.lang.Object> {
    final /* synthetic */ android.net.Uri Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.qrc.data.scanner.PreprocessedImageProvider getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.qrc.data.scanner.ImagePreprocessor imagePreprocessor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        imagePreprocessor = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = 1;
        java.lang.Object preprocessImage = imagePreprocessor.preprocessImage(this.Camera2StreamConfigurationMap, this);
        return preprocessImage == coroutine_suspended ? coroutine_suspended : preprocessImage;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> continuation) {
        return ((com.paypal.oslo.feature.qrc.data.scanner.PreprocessedImageProvider$fromUri$preprocessedBitmap$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.qrc.data.scanner.PreprocessedImageProvider$fromUri$preprocessedBitmap$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreprocessedImageProvider$fromUri$preprocessedBitmap$1(com.paypal.oslo.feature.qrc.data.scanner.PreprocessedImageProvider preprocessedImageProvider, android.net.Uri uri, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.data.scanner.PreprocessedImageProvider$fromUri$preprocessedBitmap$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = preprocessedImageProvider;
        this.Camera2StreamConfigurationMap = uri;
    }
}

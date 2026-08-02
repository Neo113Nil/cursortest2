package com.paypal.oslo.core.pushnotification.data.media;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl$loadImage$2", f = "MediaImageLoaderImpl.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, nl = {69}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class MediaImageLoaderImpl$loadImage$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super android.graphics.Bitmap>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoSizes = 1;
                obj = com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl.access$loadImageWithCoil(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return (android.graphics.Bitmap) obj;
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.core.pushnotification.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("url", this.Camera2StreamConfigurationMap);
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            pairArr[1] = kotlin.TuplesKt.to("error", message);
            com.paypal.android.logger.Logger.w$default(logger, "Failed to load media image", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            return null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> continuation) {
        return ((com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl$loadImage$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl$loadImage$2(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaImageLoaderImpl$loadImage$2(com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl mediaImageLoaderImpl, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl$loadImage$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = mediaImageLoaderImpl;
        this.Camera2StreamConfigurationMap = str;
    }
}

package com.paypal.oslo.core.pushnotification.data.media;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl", f = "MediaImageLoaderImpl.kt", i = {0, 0}, l = {89}, m = "loadImageWithCoil", n = {"url", "request"}, nl = {90}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class MediaImageLoaderImpl$loadImageWithCoil$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl.access$loadImageWithCoil(this.getHighSpeedVideoFpsRanges, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaImageLoaderImpl$loadImageWithCoil$1(com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl mediaImageLoaderImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl$loadImageWithCoil$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = mediaImageLoaderImpl;
    }
}

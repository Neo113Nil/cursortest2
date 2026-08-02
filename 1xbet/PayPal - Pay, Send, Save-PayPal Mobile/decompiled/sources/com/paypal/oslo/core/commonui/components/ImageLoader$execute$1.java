package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.commonui.components.ImageLoader", f = "AsyncImage.kt", i = {0}, l = {1185}, m = "execute", n = {"request"}, nl = {1186}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class ImageLoader$execute$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.commonui.components.ImageLoader getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.execute(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageLoader$execute$1(com.paypal.oslo.core.commonui.components.ImageLoader imageLoader, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.commonui.components.ImageLoader$execute$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = imageLoader;
    }
}

package com.ingo.sdk.kotlin.common.features.check_images;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.check_images.CheckImagesApi", f = "CheckImagesApi.kt", i = {0, 1, 1}, l = {113, 50}, m = "processCheckImages", n = {"urlString", "urlString", "response"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes9.dex */
final class CheckImagesApi$processCheckImages$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.check_images.CheckImagesApi getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.processCheckImages(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckImagesApi$processCheckImages$1(com.ingo.sdk.kotlin.common.features.check_images.CheckImagesApi checkImagesApi, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.check_images.CheckImagesApi$processCheckImages$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = checkImagesApi;
    }
}

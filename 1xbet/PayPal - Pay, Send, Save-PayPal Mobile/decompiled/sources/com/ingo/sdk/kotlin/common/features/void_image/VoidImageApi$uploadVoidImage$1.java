package com.ingo.sdk.kotlin.common.features.void_image;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.void_image.VoidImageApi", f = "VoidImageApi.kt", i = {0, 1, 1}, l = {107, 47}, m = "uploadVoidImage", n = {"urlString", "urlString", "response"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes9.dex */
final class VoidImageApi$uploadVoidImage$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.void_image.VoidImageApi getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.uploadVoidImage(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VoidImageApi$uploadVoidImage$1(com.ingo.sdk.kotlin.common.features.void_image.VoidImageApi voidImageApi, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.void_image.VoidImageApi$uploadVoidImage$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = voidImageApi;
    }
}

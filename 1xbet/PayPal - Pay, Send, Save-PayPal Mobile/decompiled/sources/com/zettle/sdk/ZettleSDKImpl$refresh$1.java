package com.zettle.sdk;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.ZettleSDKImpl", f = "ZettleSDK.kt", i = {0}, l = {710}, m = "refresh$core_publicRelease", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class ZettleSDKImpl$refresh$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.zettle.sdk.ZettleSDKImpl Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.refresh$core_publicRelease(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ZettleSDKImpl$refresh$1(com.zettle.sdk.ZettleSDKImpl zettleSDKImpl, kotlin.coroutines.Continuation<? super com.zettle.sdk.ZettleSDKImpl$refresh$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = zettleSDKImpl;
    }
}

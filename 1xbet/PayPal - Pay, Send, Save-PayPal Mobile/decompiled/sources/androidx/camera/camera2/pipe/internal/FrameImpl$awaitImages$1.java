package androidx.camera.camera2.pipe.internal;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.internal.FrameImpl", f = "FrameImpl.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE}, m = "awaitImages-NYG5g8E", n = {"destination$iv$iv"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class FrameImpl$awaitImages$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.pipe.internal.FrameImpl getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.mo469awaitImagesNYG5g8E(0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrameImpl$awaitImages$1(androidx.camera.camera2.pipe.internal.FrameImpl frameImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.internal.FrameImpl$awaitImages$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = frameImpl;
    }
}

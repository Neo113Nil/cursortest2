package androidx.camera.camera2.pipe.internal;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.internal.FrameImpl", f = "FrameImpl.kt", i = {}, l = {154}, m = "awaitImage-NYG5g8E", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class FrameImpl$awaitImage$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.pipe.internal.FrameImpl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.mo468awaitImageNYG5g8E(0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrameImpl$awaitImage$1(androidx.camera.camera2.pipe.internal.FrameImpl frameImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.internal.FrameImpl$awaitImage$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = frameImpl;
    }
}

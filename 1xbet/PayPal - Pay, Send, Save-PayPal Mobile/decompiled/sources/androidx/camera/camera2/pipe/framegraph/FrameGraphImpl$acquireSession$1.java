package androidx.camera.camera2.pipe.framegraph;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.framegraph.FrameGraphImpl", f = "FrameGraphImpl.kt", i = {}, l = {153}, m = "acquireSession", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class FrameGraphImpl$acquireSession$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.camera.camera2.pipe.framegraph.FrameGraphImpl Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.acquireSession(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrameGraphImpl$acquireSession$1(androidx.camera.camera2.pipe.framegraph.FrameGraphImpl frameGraphImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.framegraph.FrameGraphImpl$acquireSession$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = frameGraphImpl;
    }
}

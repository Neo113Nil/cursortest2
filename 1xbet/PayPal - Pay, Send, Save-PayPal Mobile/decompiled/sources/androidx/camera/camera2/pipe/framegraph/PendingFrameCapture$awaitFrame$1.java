package androidx.camera.camera2.pipe.framegraph;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.framegraph.PendingFrameCapture", f = "PendingFrameCapture.kt", i = {}, l = {83, 83}, m = "awaitFrame", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class PendingFrameCapture$awaitFrame$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.pipe.framegraph.PendingFrameCapture getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.awaitFrame(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PendingFrameCapture$awaitFrame$1(androidx.camera.camera2.pipe.framegraph.PendingFrameCapture pendingFrameCapture, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.framegraph.PendingFrameCapture$awaitFrame$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = pendingFrameCapture;
    }
}

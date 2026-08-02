package androidx.camera.camera2.pipe;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.FrameCapture$Companion", f = "Frame.kt", i = {0, 0}, l = {374}, m = "useFrame", n = {"action", "capture"}, s = {"L$0", "L$2"}, v = 1)
/* loaded from: classes6.dex */
final class FrameCapture$Companion$useFrame$1<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.camera.camera2.pipe.FrameCapture.Companion getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getInputFormats.useFrame(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrameCapture$Companion$useFrame$1(androidx.camera.camera2.pipe.FrameCapture.Companion companion, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.FrameCapture$Companion$useFrame$1> continuation) {
        super(continuation);
        this.getInputFormats = companion;
    }
}

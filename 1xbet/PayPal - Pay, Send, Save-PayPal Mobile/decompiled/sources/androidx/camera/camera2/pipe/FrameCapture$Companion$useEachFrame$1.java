package androidx.camera.camera2.pipe;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.FrameCapture$Companion", f = "Frame.kt", i = {0, 0, 0, 0}, l = {386}, m = "useEachFrame", n = {"action", "closeables$iv$iv$iv", "i$iv$iv$iv", "capture"}, s = {"L$0", "L$1", "L$2", "L$4"}, v = 1)
/* loaded from: classes6.dex */
final class FrameCapture$Companion$useEachFrame$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    final /* synthetic */ androidx.camera.camera2.pipe.FrameCapture.Companion getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.useEachFrame(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrameCapture$Companion$useEachFrame$1(androidx.camera.camera2.pipe.FrameCapture.Companion companion, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrame$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = companion;
    }
}

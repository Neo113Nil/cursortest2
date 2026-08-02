package androidx.camera.camera2.pipe;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.FrameCapture$Companion", f = "Frame.kt", i = {0, 0, 0, 0, 0}, l = {401}, m = "useEachFrameIndexed", n = {"action", "closeables$iv$iv", "i$iv$iv", "capture", "idx"}, s = {"L$0", "L$1", "L$2", "L$4", "I$0"}, v = 1)
/* loaded from: classes6.dex */
final class FrameCapture$Companion$useEachFrameIndexed$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ androidx.camera.camera2.pipe.FrameCapture.Companion getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.useEachFrameIndexed(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrameCapture$Companion$useEachFrameIndexed$1(androidx.camera.camera2.pipe.FrameCapture.Companion companion, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameIndexed$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = companion;
    }
}

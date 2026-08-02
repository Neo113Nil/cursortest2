package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 0}, l = {897}, m = "awaitAllPointersUpWithSlopDetection", n = {"$this$awaitAllPointersUpWithSlopDetection", "pass", "pointer", "touchSlopDetector", "pointerSlopReached", "touchSlop"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "F$0"}, v = 1)
/* loaded from: classes6.dex */
final class DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    float getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitAllPointersUpWithSlopDetection(null, null, null, this);
    }

    DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1> continuation) {
        super(continuation);
    }
}

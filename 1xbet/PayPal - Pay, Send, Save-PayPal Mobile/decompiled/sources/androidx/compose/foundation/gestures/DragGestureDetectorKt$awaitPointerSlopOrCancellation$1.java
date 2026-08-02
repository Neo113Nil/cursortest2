package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {com.knotapi.knot.utilities.Constants.ID_SQUARE_SPACE, 871}, m = "awaitPointerSlopOrCancellation-6ksA65w", n = {"$this$awaitPointerSlopOrCancellation_u2d6ksA65w", "onPointerSlopReached", "pointer", "touchSlopDetector", "touchSlop", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w", "onPointerSlopReached", "pointer", "touchSlopDetector", "dragEvent", "touchSlop"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0"}, v = 1)
/* loaded from: classes6.dex */
final class DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    float getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.DragGestureDetectorKt.m1460awaitPointerSlopOrCancellation6ksA65w(null, 0L, 0, null, 0L, null, this);
    }

    DragGestureDetectorKt$awaitPointerSlopOrCancellation$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1> continuation) {
        super(continuation);
    }
}

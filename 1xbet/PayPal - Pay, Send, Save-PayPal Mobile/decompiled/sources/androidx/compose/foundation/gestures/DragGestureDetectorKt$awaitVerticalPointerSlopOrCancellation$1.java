package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {1116, 1161}, m = "awaitVerticalPointerSlopOrCancellation-gDDlDlE", n = {"onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0"}, v = 1)
/* loaded from: classes6.dex */
final class DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    float getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.DragGestureDetectorKt.m1464awaitVerticalPointerSlopOrCancellationgDDlDlE(null, 0L, 0, null, this);
    }

    DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1> continuation) {
        super(continuation);
    }
}

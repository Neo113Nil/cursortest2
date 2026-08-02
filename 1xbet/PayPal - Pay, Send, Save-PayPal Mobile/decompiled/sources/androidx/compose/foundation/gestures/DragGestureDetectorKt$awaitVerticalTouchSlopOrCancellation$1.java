package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {1116, 1161}, m = "awaitVerticalTouchSlopOrCancellation-jO51t88", n = {"onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0"}, v = 1)
/* loaded from: classes6.dex */
final class DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    float getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.DragGestureDetectorKt.m1465awaitVerticalTouchSlopOrCancellationjO51t88(null, 0L, null, this);
    }

    DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1> continuation) {
        super(continuation);
    }
}

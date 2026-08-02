package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 0}, l = {1103}, m = "drag-VnAYq1g", n = {"$this$drag_u2dVnAYq1g", "onDrag", "orientation", "motionConsumed", "$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 1)
/* loaded from: classes6.dex */
final class DragGestureDetectorKt$drag$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.DragGestureDetectorKt.m1466dragVnAYq1g(null, 0L, null, null, null, this);
    }

    DragGestureDetectorKt$drag$2(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$2> continuation) {
        super(continuation);
    }
}

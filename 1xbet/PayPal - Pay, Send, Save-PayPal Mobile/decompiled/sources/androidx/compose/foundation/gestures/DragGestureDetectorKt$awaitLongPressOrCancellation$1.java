package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0}, l = {1023}, m = "awaitLongPressOrCancellation-rnUCldI", n = {"initialDown", "longPress", "deepPress"}, s = {"L$0", "L$1", "L$2"}, v = 1)
/* loaded from: classes6.dex */
final class DragGestureDetectorKt$awaitLongPressOrCancellation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.DragGestureDetectorKt.m1459awaitLongPressOrCancellationrnUCldI(null, 0L, this);
    }

    DragGestureDetectorKt$awaitLongPressOrCancellation$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1> continuation) {
        super(continuation);
    }
}

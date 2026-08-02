package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", i = {0}, l = {659}, m = "processDragStop", n = {"event"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class DragGestureNode$processDragStop$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.gestures.DragGestureNode getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes((androidx.compose.foundation.gestures.DragEvent.DragStopped) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureNode$processDragStop$1(androidx.compose.foundation.gestures.DragGestureNode dragGestureNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = dragGestureNode;
    }
}

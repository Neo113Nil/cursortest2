package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", i = {0, 1, 1}, l = {649, 652}, m = "processDragStart", n = {"event", "event", "interaction"}, s = {"L$0", "L$0", "L$1"}, v = 1)
/* loaded from: classes6.dex */
final class DragGestureNode$processDragStart$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.gestures.DragGestureNode getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes((androidx.compose.foundation.gestures.DragEvent.DragStarted) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureNode$processDragStart$1(androidx.compose.foundation.gestures.DragGestureNode dragGestureNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = dragGestureNode;
    }
}

package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", i = {}, l = {667}, m = "processDragCancel", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class DragGestureNode$processDragCancel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.gestures.DragGestureNode getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureNode$processDragCancel$1(androidx.compose.foundation.gestures.DragGestureNode dragGestureNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = dragGestureNode;
    }
}

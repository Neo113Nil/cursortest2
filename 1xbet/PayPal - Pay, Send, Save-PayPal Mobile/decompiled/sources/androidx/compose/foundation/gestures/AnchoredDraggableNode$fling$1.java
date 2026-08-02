package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode", f = "AnchoredDraggable.kt", i = {1}, l = {457, 460}, m = "fling", n = {"leftoverVelocity"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class AnchoredDraggableNode$fling$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableNode<T> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(0.0f, (kotlin.coroutines.Continuation<? super java.lang.Float>) this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableNode$fling$1(androidx.compose.foundation.gestures.AnchoredDraggableNode<T> anchoredDraggableNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = anchoredDraggableNode;
    }
}

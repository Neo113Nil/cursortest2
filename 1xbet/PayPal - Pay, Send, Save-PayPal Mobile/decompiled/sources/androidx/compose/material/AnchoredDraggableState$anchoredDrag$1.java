package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {}, l = {523}, m = "anchoredDrag", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class AnchoredDraggableState$anchoredDrag$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material.AnchoredDraggableState<T> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.anchoredDrag(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableState$anchoredDrag$1(androidx.compose.material.AnchoredDraggableState<T> anchoredDraggableState, kotlin.coroutines.Continuation<? super androidx.compose.material.AnchoredDraggableState$anchoredDrag$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = anchoredDraggableState;
    }
}

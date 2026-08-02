package androidx.compose.material3.internal;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {}, l = {564}, m = "anchoredDrag", n = {}, s = {})
/* loaded from: classes.dex */
final class AnchoredDraggableState$anchoredDrag$3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.material3.internal.AnchoredDraggableState<T> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.anchoredDrag(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableState$anchoredDrag$3(androidx.compose.material3.internal.AnchoredDraggableState<T> anchoredDraggableState, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = anchoredDraggableState;
    }
}

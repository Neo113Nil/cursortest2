package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {}, l = {1173}, m = "anchoredDrag", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class AnchoredDraggableState$anchoredDrag$3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableState<T> getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.anchoredDrag(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableState$anchoredDrag$3(androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = anchoredDraggableState;
    }
}

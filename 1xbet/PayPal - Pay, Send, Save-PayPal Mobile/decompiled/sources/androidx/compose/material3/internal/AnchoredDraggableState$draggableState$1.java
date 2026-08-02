package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001JA\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/material3/internal/AnchoredDraggableState$draggableState$1;", "Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "drag", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", "dispatchRawDelta", "(F)V", "Landroidx/compose/material3/internal/AnchoredDraggableState$draggableState$1$dragScope$1;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/material3/internal/AnchoredDraggableState$draggableState$1$dragScope$1;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnchoredDraggableState$draggableState$1 implements androidx.compose.foundation.gestures.DraggableState {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$dragScope$1 getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material3.internal.AnchoredDraggableState<T> getHighSpeedVideoSizes;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$dragScope$1] */
    AnchoredDraggableState$draggableState$1(final androidx.compose.material3.internal.AnchoredDraggableState<T> anchoredDraggableState) {
        this.getHighSpeedVideoSizes = anchoredDraggableState;
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.foundation.gestures.DragScope() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public final void dragBy(float pixels) {
                androidx.compose.material3.internal.AnchoredDragScope anchoredDragScope;
                anchoredDragScope = ((androidx.compose.material3.internal.AnchoredDraggableState) anchoredDraggableState).getHighSpeedVideoSizes;
                androidx.compose.material3.internal.AnchoredDragScope.dragTo$default(anchoredDragScope, anchoredDraggableState.newOffsetForDelta$material3(pixels), 0.0f, 2, null);
            }
        };
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public final java.lang.Object drag(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.DragScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object anchoredDrag = this.getHighSpeedVideoSizes.anchoredDrag(mutatePriority, new androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$drag$2(this, function2, null), continuation);
        return anchoredDrag == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? anchoredDrag : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public final void dispatchRawDelta(float delta) {
        this.getHighSpeedVideoSizes.dispatchRawDelta(delta);
    }
}

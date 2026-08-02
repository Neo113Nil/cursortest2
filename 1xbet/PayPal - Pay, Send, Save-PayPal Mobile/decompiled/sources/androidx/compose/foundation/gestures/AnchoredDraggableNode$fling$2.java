package androidx.compose.foundation.gestures;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "it", "Landroidx/compose/foundation/gestures/DraggableAnchors;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2", f = "AnchoredDraggable.kt", i = {}, l = {471}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class AnchoredDraggableNode$fling$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.AnchoredDragScope, androidx.compose.foundation.gestures.DraggableAnchors<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ float Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableNode<T> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.internal.Ref.FloatRef getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.Ref.FloatRef floatRef;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope = (androidx.compose.foundation.gestures.AnchoredDragScope) this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.compose.foundation.gestures.AnchoredDraggableNode<T> anchoredDraggableNode = this.getHighSpeedVideoFpsRanges;
            androidx.compose.foundation.gestures.ScrollScope scrollScope = new androidx.compose.foundation.gestures.ScrollScope() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2$scrollScope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public final float scrollBy(float pixels) {
                    androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState;
                    androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState2;
                    anchoredDraggableState = ((androidx.compose.foundation.gestures.AnchoredDraggableNode) anchoredDraggableNode).getHighSpeedVideoFpsRanges;
                    float newOffsetForDelta$foundation = anchoredDraggableState.newOffsetForDelta$foundation(pixels);
                    anchoredDraggableState2 = ((androidx.compose.foundation.gestures.AnchoredDraggableNode) anchoredDraggableNode).getHighSpeedVideoFpsRanges;
                    float offset = anchoredDraggableState2.getOffset();
                    androidx.compose.foundation.gestures.AnchoredDragScope.dragTo$default(anchoredDragScope, newOffsetForDelta$foundation, 0.0f, 2, null);
                    return newOffsetForDelta$foundation - offset;
                }
            };
            androidx.compose.foundation.gestures.FlingBehavior highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges();
            kotlin.jvm.internal.Ref.FloatRef floatRef2 = this.getHighSpeedVideoFpsRangesFor;
            float f = this.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = floatRef2;
            this.getHighSpeedVideoSizes = 1;
            obj = highSpeedVideoFpsRanges.performFling(scrollScope, f, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            floatRef = floatRef2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = (kotlin.jvm.internal.Ref.FloatRef) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        floatRef.element = ((java.lang.Number) obj).floatValue();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return Camera2StreamConfigurationMap(anchoredDragScope, continuation);
    }

    private java.lang.Object Camera2StreamConfigurationMap(androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2 anchoredDraggableNode$fling$2 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        anchoredDraggableNode$fling$2.getHighResolutionOutputSizeshNQ4ISI = anchoredDragScope;
        return anchoredDraggableNode$fling$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableNode$fling$2(androidx.compose.foundation.gestures.AnchoredDraggableNode<T> anchoredDraggableNode, kotlin.jvm.internal.Ref.FloatRef floatRef, float f, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRanges = anchoredDraggableNode;
        this.getHighSpeedVideoFpsRangesFor = floatRef;
        this.Camera2StreamConfigurationMap = f;
    }
}

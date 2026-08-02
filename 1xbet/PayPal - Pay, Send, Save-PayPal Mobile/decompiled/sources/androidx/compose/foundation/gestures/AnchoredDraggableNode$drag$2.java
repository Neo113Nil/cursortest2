package androidx.compose.foundation.gestures;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "it", "Landroidx/compose/foundation/gestures/DraggableAnchors;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", f = "AnchoredDraggable.kt", i = {}, l = {410}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class AnchoredDraggableNode$drag$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.AnchoredDragScope, androidx.compose.foundation.gestures.DraggableAnchors<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableNode<T> getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope = (androidx.compose.foundation.gestures.AnchoredDragScope) this.getHighSpeedVideoSizes;
            kotlin.jvm.functions.Function2<kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.Camera2StreamConfigurationMap;
            final androidx.compose.foundation.gestures.AnchoredDraggableNode<T> anchoredDraggableNode = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.AnchoredDraggableNode.this, anchoredDragScope, (androidx.compose.foundation.gestures.DragEvent.DragDelta) obj2);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            };
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (function2.invoke(function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.foundation.gestures.AnchoredDraggableNode anchoredDraggableNode, final androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope, androidx.compose.foundation.gestures.DragEvent.DragDelta dragDelta) {
        long highSpeedVideoSizes;
        float highResolutionOutputSizeshNQ4ISI;
        androidx.compose.foundation.OverscrollEffect overscrollEffect;
        androidx.compose.foundation.OverscrollEffect overscrollEffect2;
        long highSpeedVideoFpsRangesFor;
        androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState;
        highSpeedVideoSizes = anchoredDraggableNode.getHighSpeedVideoSizes(dragDelta.getDelta());
        highResolutionOutputSizeshNQ4ISI = anchoredDraggableNode.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes);
        overscrollEffect = anchoredDraggableNode.getHighSpeedVideoFpsRangesFor;
        if (overscrollEffect == null) {
            anchoredDraggableState = anchoredDraggableNode.getHighSpeedVideoFpsRanges;
            androidx.compose.foundation.gestures.AnchoredDragScope.dragTo$default(anchoredDragScope, anchoredDraggableState.newOffsetForDelta$foundation(highResolutionOutputSizeshNQ4ISI), 0.0f, 2, null);
        } else {
            overscrollEffect2 = anchoredDraggableNode.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(overscrollEffect2);
            highSpeedVideoFpsRangesFor = anchoredDraggableNode.getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI);
            androidx.compose.ui.geometry.Offset.m5741boximpl(overscrollEffect2.mo1266applyToScrollRhakbz0(highSpeedVideoFpsRangesFor, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    androidx.compose.ui.geometry.Offset highSpeedVideoFpsRangesFor2;
                    highSpeedVideoFpsRangesFor2 = androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.gestures.AnchoredDraggableNode.this, anchoredDragScope, (androidx.compose.ui.geometry.Offset) obj);
                    return highSpeedVideoFpsRangesFor2;
                }
            }));
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.geometry.Offset getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.gestures.AnchoredDraggableNode anchoredDraggableNode, androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope, androidx.compose.ui.geometry.Offset offset) {
        androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState;
        float highResolutionOutputSizeshNQ4ISI;
        androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState2;
        long highSpeedVideoFpsRangesFor;
        anchoredDraggableState = anchoredDraggableNode.getHighSpeedVideoFpsRanges;
        highResolutionOutputSizeshNQ4ISI = anchoredDraggableNode.getHighResolutionOutputSizeshNQ4ISI(offset.m5762unboximpl());
        float newOffsetForDelta$foundation = anchoredDraggableState.newOffsetForDelta$foundation(highResolutionOutputSizeshNQ4ISI);
        anchoredDraggableState2 = anchoredDraggableNode.getHighSpeedVideoFpsRanges;
        highSpeedVideoFpsRangesFor = anchoredDraggableNode.getHighSpeedVideoFpsRangesFor(newOffsetForDelta$foundation - anchoredDraggableState2.requireOffset());
        androidx.compose.foundation.gestures.AnchoredDragScope.dragTo$default(anchoredDragScope, newOffsetForDelta$foundation, 0.0f, 2, null);
        return androidx.compose.ui.geometry.Offset.m5741boximpl(highSpeedVideoFpsRangesFor);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return getHighSpeedVideoFpsRanges(anchoredDragScope, continuation);
    }

    private java.lang.Object getHighSpeedVideoFpsRanges(androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$2 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        anchoredDraggableNode$drag$2.getHighSpeedVideoSizes = anchoredDragScope;
        return anchoredDraggableNode$drag$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnchoredDraggableNode$drag$2(kotlin.jvm.functions.Function2<? super kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, kotlin.Unit>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, androidx.compose.foundation.gestures.AnchoredDraggableNode<T> anchoredDraggableNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2> continuation) {
        super(3, continuation);
        this.Camera2StreamConfigurationMap = function2;
        this.getHighSpeedVideoFpsRanges = anchoredDraggableNode;
    }
}

package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/Drag2DScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.Draggable2DNode$drag$2", f = "Draggable2D.kt", i = {}, l = {257}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class Draggable2DNode$drag$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.Drag2DScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.gestures.Draggable2DNode getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.gestures.Drag2DScope drag2DScope = (androidx.compose.foundation.gestures.Drag2DScope) this.getHighSpeedVideoSizes;
            kotlin.jvm.functions.Function2<kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRanges;
            final androidx.compose.foundation.gestures.Draggable2DNode draggable2DNode = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.Draggable2DNode$drag$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.Draggable2DNode$drag$2.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.gestures.Drag2DScope.this, draggable2DNode, (androidx.compose.foundation.gestures.DragEvent.DragDelta) obj2);
                    return highSpeedVideoFpsRangesFor;
                }
            };
            this.getHighSpeedVideoFpsRangesFor = 1;
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
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.gestures.Drag2DScope drag2DScope, androidx.compose.foundation.gestures.Draggable2DNode draggable2DNode, androidx.compose.foundation.gestures.DragEvent.DragDelta dragDelta) {
        boolean z;
        long delta = dragDelta.getDelta();
        z = draggable2DNode.getHighSpeedVideoFpsRanges;
        if (z) {
            delta = androidx.compose.ui.geometry.Offset.m5744constructorimpl((-9223372034707292160L) ^ delta);
        }
        drag2DScope.mo1435dragByk4lQ0M(delta);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.foundation.gestures.Drag2DScope drag2DScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.Draggable2DNode$drag$2) create(drag2DScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.Draggable2DNode$drag$2 draggable2DNode$drag$2 = new androidx.compose.foundation.gestures.Draggable2DNode$drag$2(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        draggable2DNode$drag$2.getHighSpeedVideoSizes = obj;
        return draggable2DNode$drag$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Draggable2DNode$drag$2(kotlin.jvm.functions.Function2<? super kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, kotlin.Unit>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, androidx.compose.foundation.gestures.Draggable2DNode draggable2DNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.Draggable2DNode$drag$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = draggable2DNode;
    }
}

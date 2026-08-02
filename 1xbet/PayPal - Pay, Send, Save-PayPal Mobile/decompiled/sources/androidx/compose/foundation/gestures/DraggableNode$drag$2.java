package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", i = {}, l = {317}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class DraggableNode$drag$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.DragScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.gestures.DraggableNode getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.gestures.DragScope dragScope = (androidx.compose.foundation.gestures.DragScope) this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function2<kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.Camera2StreamConfigurationMap;
            final androidx.compose.foundation.gestures.DraggableNode draggableNode = this.getHighSpeedVideoSizes;
            kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.DraggableNode$drag$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.foundation.gestures.DraggableNode$drag$2.getHighSpeedVideoSizes(androidx.compose.foundation.gestures.DragScope.this, draggableNode, (androidx.compose.foundation.gestures.DragEvent.DragDelta) obj2);
                    return highSpeedVideoSizes;
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
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.gestures.DragScope dragScope, androidx.compose.foundation.gestures.DraggableNode draggableNode, androidx.compose.foundation.gestures.DragEvent.DragDelta dragDelta) {
        long highSpeedVideoSizes;
        androidx.compose.foundation.gestures.Orientation orientation;
        highSpeedVideoSizes = draggableNode.getHighSpeedVideoSizes(dragDelta.getDelta());
        orientation = draggableNode.getHighSpeedVideoSizes;
        dragScope.dragBy(androidx.compose.foundation.gestures.DraggableKt.m1473toFloat3MmeM6k(highSpeedVideoSizes, orientation));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.foundation.gestures.DragScope dragScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.DraggableNode$drag$2) create(dragScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.DraggableNode$drag$2 draggableNode$drag$2 = new androidx.compose.foundation.gestures.DraggableNode$drag$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
        draggableNode$drag$2.getHighSpeedVideoFpsRanges = obj;
        return draggableNode$drag$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DraggableNode$drag$2(kotlin.jvm.functions.Function2<? super kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, kotlin.Unit>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, androidx.compose.foundation.gestures.DraggableNode draggableNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DraggableNode$drag$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = function2;
        this.getHighSpeedVideoSizes = draggableNode;
    }
}

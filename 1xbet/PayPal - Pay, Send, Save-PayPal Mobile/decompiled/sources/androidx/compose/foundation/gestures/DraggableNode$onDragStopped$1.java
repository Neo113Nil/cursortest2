package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1", f = "Draggable.kt", i = {}, l = {com.visa.cbp.getCertUsage.getODAData}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class DraggableNode$onDragStopped$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.gestures.DraggableNode Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.gestures.DragEvent.DragStopped getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.functions.Function3 function3;
        long highSpeedVideoFpsRangesFor;
        androidx.compose.foundation.gestures.Orientation orientation;
        float highResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighResolutionOutputSizeshNQ4ISI;
            function3 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            highSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges.getVelocity());
            orientation = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.DraggableKt.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor, orientation);
            java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(highResolutionOutputSizeshNQ4ISI);
            this.getHighSpeedVideoSizes = 1;
            if (function3.invoke(coroutineScope, boxFloat, this) == coroutine_suspended) {
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
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1 draggableNode$onDragStopped$1 = new androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        draggableNode$onDragStopped$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return draggableNode$onDragStopped$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DraggableNode$onDragStopped$1(androidx.compose.foundation.gestures.DraggableNode draggableNode, androidx.compose.foundation.gestures.DragEvent.DragStopped dragStopped, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = draggableNode;
        this.getHighSpeedVideoFpsRanges = dragStopped;
    }
}

package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultDraggable2DState$drag$2", f = "Draggable2D.kt", i = {}, l = {320}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class DefaultDraggable2DState$drag$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.Drag2DScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.MutatePriority getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.gestures.DefaultDraggable2DState getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.MutatorMutex mutatorMutex;
        androidx.compose.foundation.gestures.Drag2DScope drag2DScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutatorMutex = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            drag2DScope = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (mutatorMutex.mutateWith(drag2DScope, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this) == coroutine_suspended) {
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
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.DefaultDraggable2DState$drag$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.gestures.DefaultDraggable2DState$drag$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DefaultDraggable2DState$drag$2(androidx.compose.foundation.gestures.DefaultDraggable2DState defaultDraggable2DState, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.Drag2DScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DefaultDraggable2DState$drag$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = defaultDraggable2DState;
        this.getHighSpeedVideoFpsRanges = mutatePriority;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }
}

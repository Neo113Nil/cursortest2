package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class SwipeableState$snapInternalToOffset$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.DragScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.material.SwipeableState<T> Camera2StreamConfigurationMap;
    final /* synthetic */ float getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.runtime.MutableFloatState mutableFloatState;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.compose.foundation.gestures.DragScope dragScope = (androidx.compose.foundation.gestures.DragScope) this.getHighSpeedVideoFpsRangesFor;
        float f = this.getHighResolutionOutputSizeshNQ4ISI;
        mutableFloatState = ((androidx.compose.material.SwipeableState) this.Camera2StreamConfigurationMap).getHighSpeedVideoFpsRanges;
        dragScope.dragBy(f - mutableFloatState.getFloatValue());
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.foundation.gestures.DragScope dragScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material.SwipeableState$snapInternalToOffset$2) create(dragScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.material.SwipeableState$snapInternalToOffset$2 swipeableState$snapInternalToOffset$2 = new androidx.compose.material.SwipeableState$snapInternalToOffset$2(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
        swipeableState$snapInternalToOffset$2.getHighSpeedVideoFpsRangesFor = obj;
        return swipeableState$snapInternalToOffset$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableState$snapInternalToOffset$2(float f, androidx.compose.material.SwipeableState<T> swipeableState, kotlin.coroutines.Continuation<? super androidx.compose.material.SwipeableState$snapInternalToOffset$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.Camera2StreamConfigurationMap = swipeableState;
    }
}

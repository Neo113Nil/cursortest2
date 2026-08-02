package androidx.constraintlayout.compose.carousel;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapInternalToOffset$2", f = "CarouselSwipeable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class CarouselSwipeableState$snapInternalToOffset$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.DragScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ float getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.runtime.MutableFloatState mutableFloatState;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.compose.foundation.gestures.DragScope dragScope = (androidx.compose.foundation.gestures.DragScope) this.getHighSpeedVideoFpsRanges;
        float f = this.getHighSpeedVideoFpsRangesFor;
        mutableFloatState = ((androidx.constraintlayout.compose.carousel.CarouselSwipeableState) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoSizes;
        dragScope.dragBy(f - mutableFloatState.getFloatValue());
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.foundation.gestures.DragScope dragScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapInternalToOffset$2) create(dragScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapInternalToOffset$2 carouselSwipeableState$snapInternalToOffset$2 = new androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapInternalToOffset$2(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        carouselSwipeableState$snapInternalToOffset$2.getHighSpeedVideoFpsRanges = obj;
        return carouselSwipeableState$snapInternalToOffset$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselSwipeableState$snapInternalToOffset$2(float f, androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> carouselSwipeableState, kotlin.coroutines.Continuation<? super androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapInternalToOffset$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getHighResolutionOutputSizeshNQ4ISI = carouselSwipeableState;
    }
}

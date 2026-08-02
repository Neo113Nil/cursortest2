package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.constraintlayout.compose.MotionCarouselKt$MotionCarousel$1$1", f = "MotionCarousel.kt", i = {}, l = {197}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class MotionCarouselKt$MotionCarousel$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.CarouselState> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.constraintlayout.compose.carousel.CarouselSwipeableState<java.lang.String> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<androidx.constraintlayout.compose.MotionItemsProvider> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (androidx.constraintlayout.compose.MotionCarouselKt.access$MotionCarousel$lambda$4(this.Camera2StreamConfigurationMap).getHighSpeedVideoFpsRangesFor + 1 < this.getHighSpeedVideoSizes.getValue().getCamera2StreamConfigurationMap()) {
                androidx.constraintlayout.compose.MotionCarouselKt.access$MotionCarousel$lambda$4(this.Camera2StreamConfigurationMap).getHighSpeedVideoFpsRangesFor++;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (this.getHighSpeedVideoFpsRanges.snapTo(this.getHighSpeedVideoFpsRangesFor, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.constraintlayout.compose.MotionCarouselKt.access$MotionCarousel$lambda$4(this.Camera2StreamConfigurationMap).getHighSpeedVideoFpsRanges = androidx.constraintlayout.compose.MotionCarouselDirection.FORWARD;
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.constraintlayout.compose.MotionCarouselKt$MotionCarousel$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.constraintlayout.compose.MotionCarouselKt$MotionCarousel$1$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MotionCarouselKt$MotionCarousel$1$1(androidx.compose.runtime.State<? extends androidx.constraintlayout.compose.MotionItemsProvider> state, androidx.constraintlayout.compose.carousel.CarouselSwipeableState<java.lang.String> carouselSwipeableState, java.lang.String str, androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.CarouselState> mutableState, kotlin.coroutines.Continuation<? super androidx.constraintlayout.compose.MotionCarouselKt$MotionCarousel$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = state;
        this.getHighSpeedVideoFpsRanges = carouselSwipeableState;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = mutableState;
    }
}

package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.constraintlayout.compose.MotionCarouselKt$MotionCarousel$2$1", f = "MotionCarousel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class MotionCarouselKt$MotionCarousel$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.constraintlayout.compose.carousel.CarouselSwipeableState<java.lang.String> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.CarouselState> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (androidx.constraintlayout.compose.MotionCarouselKt.access$MotionCarousel$lambda$4(this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoFpsRangesFor > 0) {
                androidx.constraintlayout.compose.MotionCarouselKt.access$MotionCarousel$lambda$4(this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoFpsRangesFor--;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (this.getHighSpeedVideoFpsRanges.snapTo(this.Camera2StreamConfigurationMap, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.constraintlayout.compose.MotionCarouselKt.access$MotionCarousel$lambda$4(this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoFpsRanges = androidx.constraintlayout.compose.MotionCarouselDirection.FORWARD;
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.constraintlayout.compose.MotionCarouselKt$MotionCarousel$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.constraintlayout.compose.MotionCarouselKt$MotionCarousel$2$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MotionCarouselKt$MotionCarousel$2$1(androidx.constraintlayout.compose.carousel.CarouselSwipeableState<java.lang.String> carouselSwipeableState, java.lang.String str, androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.CarouselState> mutableState, kotlin.coroutines.Continuation<? super androidx.constraintlayout.compose.MotionCarouselKt$MotionCarousel$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = carouselSwipeableState;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
    }
}

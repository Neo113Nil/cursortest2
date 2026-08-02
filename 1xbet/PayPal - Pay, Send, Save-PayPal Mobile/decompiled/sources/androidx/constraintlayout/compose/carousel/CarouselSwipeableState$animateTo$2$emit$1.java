package androidx.constraintlayout.compose.carousel;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState$animateTo$2", f = "CarouselSwipeable.kt", i = {0, 0}, l = {315}, m = "emit", n = {"this", "anchors"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
final class CarouselSwipeableState$animateTo$2$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.constraintlayout.compose.carousel.CarouselSwipeableState$animateTo$2<T> getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CarouselSwipeableState$animateTo$2$emit$1(androidx.constraintlayout.compose.carousel.CarouselSwipeableState$animateTo$2<? super T> carouselSwipeableState$animateTo$2, kotlin.coroutines.Continuation<? super androidx.constraintlayout.compose.carousel.CarouselSwipeableState$animateTo$2$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = carouselSwipeableState$animateTo$2;
    }
}

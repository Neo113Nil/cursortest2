package androidx.constraintlayout.compose.carousel;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2", f = "CarouselSwipeable.kt", i = {0}, l = {299}, m = "emit", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class CarouselSwipeableState$snapTo$2$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2<T> getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CarouselSwipeableState$snapTo$2$emit$1(androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2<? super T> carouselSwipeableState$snapTo$2, kotlin.coroutines.Continuation<? super androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = carouselSwipeableState$snapTo$2;
    }
}

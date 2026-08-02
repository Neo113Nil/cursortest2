package androidx.constraintlayout.compose.carousel;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState", f = "CarouselSwipeable.kt", i = {1, 1, 1, 2, 2, 2}, l = {146, 171, 174}, m = "processNewAnchors$constraintlayout_compose_release", n = {"this", "newAnchors", "targetOffset", "this", "newAnchors", "targetOffset"}, s = {"L$0", "L$1", "F$0", "L$0", "L$1", "F$0"})
/* loaded from: classes6.dex */
final class CarouselSwipeableState$processNewAnchors$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    float getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputFormats.processNewAnchors$constraintlayout_compose_release(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselSwipeableState$processNewAnchors$1(androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> carouselSwipeableState, kotlin.coroutines.Continuation<? super androidx.constraintlayout.compose.carousel.CarouselSwipeableState$processNewAnchors$1> continuation) {
        super(continuation);
        this.getInputFormats = carouselSwipeableState;
    }
}

package androidx.constraintlayout.compose.carousel;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1", f = "CarouselSwipeable.kt", i = {0}, l = {833}, m = "onPreFling-QWom1Mo", n = {com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY}, s = {"J$0"})
/* loaded from: classes6.dex */
final class CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1 getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    long getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.mo1753onPreFlingQWom1Mo(0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1(androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1 carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1, kotlin.coroutines.Continuation<? super androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1;
    }
}

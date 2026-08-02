package androidx.constraintlayout.compose.carousel;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1", f = "CarouselSwipeable.kt", i = {0}, l = {842}, m = "onPostFling-RZ2iAVY", n = {com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY}, s = {"J$0"})
/* loaded from: classes6.dex */
final class CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1 getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.mo1528onPostFlingRZ2iAVY(0L, 0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1(androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1 carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1, kotlin.coroutines.Continuation<? super androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1;
    }
}

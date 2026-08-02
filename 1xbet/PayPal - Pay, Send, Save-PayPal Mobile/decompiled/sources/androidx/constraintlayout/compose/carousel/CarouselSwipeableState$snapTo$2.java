package androidx.constraintlayout.compose.carousel;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "", "p0", "", "getHighSpeedVideoFpsRanges", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CarouselSwipeableState$snapTo$2<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ T $getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(java.util.Map<java.lang.Float, ? extends T> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2$emit$1 carouselSwipeableState$snapTo$2$emit$1;
        int i;
        java.lang.Object Camera2StreamConfigurationMap;
        androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2<T> carouselSwipeableState$snapTo$2;
        if (continuation instanceof androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2$emit$1) {
            carouselSwipeableState$snapTo$2$emit$1 = (androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2$emit$1) continuation;
            if ((carouselSwipeableState$snapTo$2$emit$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                carouselSwipeableState$snapTo$2$emit$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = carouselSwipeableState$snapTo$2$emit$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = carouselSwipeableState$snapTo$2$emit$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.Float access$getOffset = androidx.constraintlayout.compose.carousel.CarouselSwipeableKt.access$getOffset(map, this.$getHighResolutionOutputSizeshNQ4ISI);
                    if (access$getOffset == null) {
                        throw new java.lang.IllegalArgumentException("The target value must have an associated anchor.".toString());
                    }
                    androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> carouselSwipeableState = this.getHighSpeedVideoSizes;
                    float floatValue = access$getOffset.floatValue();
                    carouselSwipeableState$snapTo$2$emit$1.Camera2StreamConfigurationMap = this;
                    carouselSwipeableState$snapTo$2$emit$1.getHighSpeedVideoFpsRanges = 1;
                    Camera2StreamConfigurationMap = carouselSwipeableState.Camera2StreamConfigurationMap(floatValue, carouselSwipeableState$snapTo$2$emit$1);
                    if (Camera2StreamConfigurationMap == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    carouselSwipeableState$snapTo$2 = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    carouselSwipeableState$snapTo$2 = (androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2) carouselSwipeableState$snapTo$2$emit$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                carouselSwipeableState$snapTo$2.getHighSpeedVideoSizes.setCurrentValue(carouselSwipeableState$snapTo$2.$getHighResolutionOutputSizeshNQ4ISI);
                return kotlin.Unit.INSTANCE;
            }
        }
        carouselSwipeableState$snapTo$2$emit$1 = new androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2$emit$1(this, continuation);
        java.lang.Object obj2 = carouselSwipeableState$snapTo$2$emit$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = carouselSwipeableState$snapTo$2$emit$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        carouselSwipeableState$snapTo$2.getHighSpeedVideoSizes.setCurrentValue(carouselSwipeableState$snapTo$2.$getHighResolutionOutputSizeshNQ4ISI);
        return kotlin.Unit.INSTANCE;
    }

    CarouselSwipeableState$snapTo$2(T t, androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> carouselSwipeableState) {
        this.$getHighResolutionOutputSizeshNQ4ISI = t;
        this.getHighSpeedVideoSizes = carouselSwipeableState;
    }
}

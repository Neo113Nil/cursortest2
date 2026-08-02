package androidx.constraintlayout.compose.carousel;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "", "p0", "", "getHighSpeedVideoFpsRanges", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CarouselSwipeableState$animateTo$2<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ androidx.compose.animation.core.AnimationSpec<java.lang.Float> $Camera2StreamConfigurationMap;
    final /* synthetic */ T $getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(java.util.Map<java.lang.Float, ? extends T> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.constraintlayout.compose.carousel.CarouselSwipeableState$animateTo$2$emit$1 carouselSwipeableState$animateTo$2$emit$1;
        int i;
        androidx.constraintlayout.compose.carousel.CarouselSwipeableState$animateTo$2<T> carouselSwipeableState$animateTo$2;
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        androidx.compose.runtime.MutableFloatState mutableFloatState;
        java.lang.Object firstOrNull;
        androidx.compose.runtime.MutableFloatState mutableFloatState2;
        java.lang.Object firstOrNull2;
        if (continuation instanceof androidx.constraintlayout.compose.carousel.CarouselSwipeableState$animateTo$2$emit$1) {
            carouselSwipeableState$animateTo$2$emit$1 = (androidx.constraintlayout.compose.carousel.CarouselSwipeableState$animateTo$2$emit$1) continuation;
            if ((carouselSwipeableState$animateTo$2$emit$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                carouselSwipeableState$animateTo$2$emit$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = carouselSwipeableState$animateTo$2$emit$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = carouselSwipeableState$animateTo$2$emit$1.getHighSpeedVideoSizes;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = (java.util.Map) carouselSwipeableState$animateTo$2$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                    carouselSwipeableState$animateTo$2 = (androidx.constraintlayout.compose.carousel.CarouselSwipeableState$animateTo$2) carouselSwipeableState$animateTo$2$emit$1.getHighSpeedVideoFpsRangesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        mutableFloatState = ((androidx.constraintlayout.compose.carousel.CarouselSwipeableState) carouselSwipeableState$animateTo$2.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoSizes;
                        float floatValue = mutableFloatState.getFloatValue();
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        for (java.util.Map.Entry<java.lang.Float, ? extends T> entry : map.entrySet()) {
                            if (java.lang.Math.abs(entry.getKey().floatValue() - floatValue) < 0.5f) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        firstOrNull = kotlin.collections.CollectionsKt.firstOrNull(linkedHashMap.values());
                        if (firstOrNull == null) {
                            firstOrNull = carouselSwipeableState$animateTo$2.getHighResolutionOutputSizeshNQ4ISI.getCurrentValue();
                        }
                        carouselSwipeableState$animateTo$2.getHighResolutionOutputSizeshNQ4ISI.setCurrentValue(firstOrNull);
                        throw th;
                    }
                } else {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        java.lang.Float access$getOffset = androidx.constraintlayout.compose.carousel.CarouselSwipeableKt.access$getOffset(map, this.$getHighSpeedVideoFpsRangesFor);
                        if (access$getOffset == null) {
                            throw new java.lang.IllegalArgumentException("The target value must have an associated anchor.".toString());
                        }
                        androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> carouselSwipeableState = this.getHighResolutionOutputSizeshNQ4ISI;
                        float floatValue2 = access$getOffset.floatValue();
                        androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec = this.$Camera2StreamConfigurationMap;
                        carouselSwipeableState$animateTo$2$emit$1.getHighSpeedVideoFpsRangesFor = this;
                        carouselSwipeableState$animateTo$2$emit$1.getHighResolutionOutputSizeshNQ4ISI = map;
                        carouselSwipeableState$animateTo$2$emit$1.getHighSpeedVideoSizes = 1;
                        highResolutionOutputSizeshNQ4ISI = carouselSwipeableState.getHighResolutionOutputSizeshNQ4ISI(floatValue2, animationSpec, carouselSwipeableState$animateTo$2$emit$1);
                        if (highResolutionOutputSizeshNQ4ISI == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        carouselSwipeableState$animateTo$2 = this;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        carouselSwipeableState$animateTo$2 = this;
                        mutableFloatState = ((androidx.constraintlayout.compose.carousel.CarouselSwipeableState) carouselSwipeableState$animateTo$2.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoSizes;
                        float floatValue3 = mutableFloatState.getFloatValue();
                        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                        while (r7.hasNext()) {
                        }
                        firstOrNull = kotlin.collections.CollectionsKt.firstOrNull(linkedHashMap2.values());
                        if (firstOrNull == null) {
                        }
                        carouselSwipeableState$animateTo$2.getHighResolutionOutputSizeshNQ4ISI.setCurrentValue(firstOrNull);
                        throw th;
                    }
                }
                mutableFloatState2 = ((androidx.constraintlayout.compose.carousel.CarouselSwipeableState) carouselSwipeableState$animateTo$2.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoSizes;
                float floatValue4 = mutableFloatState2.getFloatValue();
                java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry<java.lang.Float, ? extends T> entry2 : map.entrySet()) {
                    if (java.lang.Math.abs(entry2.getKey().floatValue() - floatValue4) < 0.5f) {
                        linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                    }
                }
                firstOrNull2 = kotlin.collections.CollectionsKt.firstOrNull(linkedHashMap3.values());
                if (firstOrNull2 == null) {
                    firstOrNull2 = carouselSwipeableState$animateTo$2.getHighResolutionOutputSizeshNQ4ISI.getCurrentValue();
                }
                carouselSwipeableState$animateTo$2.getHighResolutionOutputSizeshNQ4ISI.setCurrentValue(firstOrNull2);
                return kotlin.Unit.INSTANCE;
            }
        }
        carouselSwipeableState$animateTo$2$emit$1 = new androidx.constraintlayout.compose.carousel.CarouselSwipeableState$animateTo$2$emit$1(this, continuation);
        java.lang.Object obj2 = carouselSwipeableState$animateTo$2$emit$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = carouselSwipeableState$animateTo$2$emit$1.getHighSpeedVideoSizes;
        if (i == 0) {
        }
        mutableFloatState2 = ((androidx.constraintlayout.compose.carousel.CarouselSwipeableState) carouselSwipeableState$animateTo$2.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoSizes;
        float floatValue42 = mutableFloatState2.getFloatValue();
        java.util.LinkedHashMap linkedHashMap32 = new java.util.LinkedHashMap();
        while (r7.hasNext()) {
        }
        firstOrNull2 = kotlin.collections.CollectionsKt.firstOrNull(linkedHashMap32.values());
        if (firstOrNull2 == null) {
        }
        carouselSwipeableState$animateTo$2.getHighResolutionOutputSizeshNQ4ISI.setCurrentValue(firstOrNull2);
        return kotlin.Unit.INSTANCE;
    }

    CarouselSwipeableState$animateTo$2(T t, androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> carouselSwipeableState, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec) {
        this.$getHighSpeedVideoFpsRangesFor = t;
        this.getHighResolutionOutputSizeshNQ4ISI = carouselSwipeableState;
        this.$Camera2StreamConfigurationMap = animationSpec;
    }
}

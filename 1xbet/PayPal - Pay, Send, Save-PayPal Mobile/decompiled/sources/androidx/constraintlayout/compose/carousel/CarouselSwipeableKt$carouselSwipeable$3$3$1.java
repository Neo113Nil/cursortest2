package androidx.constraintlayout.compose.carousel;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$3$1", f = "CarouselSwipeable.kt", i = {}, l = {584}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class CarouselSwipeableKt$carouselSwipeable$3$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<T, T, androidx.constraintlayout.compose.carousel.ThresholdConfig> Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.Map<java.lang.Float, T> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.constraintlayout.compose.carousel.ResistanceConfig getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.ui.unit.Density getHighSpeedVideoSizes;
    final /* synthetic */ float getInputFormats;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.Map anchors$constraintlayout_compose_release = this.getHighSpeedVideoFpsRanges.getAnchors$constraintlayout_compose_release();
            this.getHighSpeedVideoFpsRanges.setAnchors$constraintlayout_compose_release(this.getHighResolutionOutputSizeshNQ4ISI);
            this.getHighSpeedVideoFpsRanges.setResistance$constraintlayout_compose_release(this.getHighSpeedVideoFpsRangesFor);
            androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> carouselSwipeableState = this.getHighSpeedVideoFpsRanges;
            final java.util.Map<java.lang.Float, T> map = this.getHighResolutionOutputSizeshNQ4ISI;
            final kotlin.jvm.functions.Function2<T, T, androidx.constraintlayout.compose.carousel.ThresholdConfig> function2 = this.Camera2StreamConfigurationMap;
            final androidx.compose.ui.unit.Density density = this.getHighSpeedVideoSizes;
            carouselSwipeableState.setThresholds$constraintlayout_compose_release(new kotlin.jvm.functions.Function2<java.lang.Float, java.lang.Float, java.lang.Float>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$3$1.1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ java.lang.Float invoke(java.lang.Float f, java.lang.Float f2) {
                    return getHighResolutionOutputSizeshNQ4ISI(f.floatValue(), f2.floatValue());
                }

                public final java.lang.Float getHighResolutionOutputSizeshNQ4ISI(float f, float f2) {
                    return java.lang.Float.valueOf(function2.invoke(kotlin.collections.MapsKt.getValue(map, java.lang.Float.valueOf(f)), kotlin.collections.MapsKt.getValue(map, java.lang.Float.valueOf(f2))).computeThreshold(density, f, f2));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            });
            this.getHighSpeedVideoFpsRanges.setVelocityThreshold$constraintlayout_compose_release(this.getHighSpeedVideoSizes.mo1418toPx0680j_4(this.getInputFormats));
            this.getOutputFormats = 1;
            if (this.getHighSpeedVideoFpsRanges.processNewAnchors$constraintlayout_compose_release(anchors$constraintlayout_compose_release, this.getHighResolutionOutputSizeshNQ4ISI, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$3$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getInputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CarouselSwipeableKt$carouselSwipeable$3$3$1(androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> carouselSwipeableState, java.util.Map<java.lang.Float, ? extends T> map, androidx.constraintlayout.compose.carousel.ResistanceConfig resistanceConfig, androidx.compose.ui.unit.Density density, kotlin.jvm.functions.Function2<? super T, ? super T, ? extends androidx.constraintlayout.compose.carousel.ThresholdConfig> function2, float f, kotlin.coroutines.Continuation<? super androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = carouselSwipeableState;
        this.getHighResolutionOutputSizeshNQ4ISI = map;
        this.getHighSpeedVideoFpsRangesFor = resistanceConfig;
        this.getHighSpeedVideoSizes = density;
        this.Camera2StreamConfigurationMap = function2;
        this.getInputFormats = f;
    }
}

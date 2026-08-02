package androidx.constraintlayout.compose.carousel;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "velocity", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$4$1", f = "CarouselSwipeable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class CarouselSwipeableKt$carouselSwipeable$3$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Float, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ float getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$4$1$1", f = "CarouselSwipeable.kt", i = {}, l = {593}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$4$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ float getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoSizes = 1;
                if (this.getHighResolutionOutputSizeshNQ4ISI.performFling(this.getHighSpeedVideoFpsRangesFor, this) == coroutine_suspended) {
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
            return ((androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$4$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$4$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> carouselSwipeableState, float f, kotlin.coroutines.Continuation<? super androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$4$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = carouselSwipeableState;
            this.getHighSpeedVideoFpsRangesFor = f;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default((kotlinx.coroutines.CoroutineScope) this.getHighResolutionOutputSizeshNQ4ISI, null, null, new androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$4$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        float floatValue = f.floatValue();
        androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$4$1 carouselSwipeableKt$carouselSwipeable$3$4$1 = new androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$4$1(this.Camera2StreamConfigurationMap, continuation);
        carouselSwipeableKt$carouselSwipeable$3$4$1.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
        carouselSwipeableKt$carouselSwipeable$3$4$1.getHighSpeedVideoSizes = floatValue;
        return carouselSwipeableKt$carouselSwipeable$3$4$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselSwipeableKt$carouselSwipeable$3$4$1(androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> carouselSwipeableState, kotlin.coroutines.Continuation<? super androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$4$1> continuation) {
        super(3, continuation);
        this.Camera2StreamConfigurationMap = carouselSwipeableState;
    }
}

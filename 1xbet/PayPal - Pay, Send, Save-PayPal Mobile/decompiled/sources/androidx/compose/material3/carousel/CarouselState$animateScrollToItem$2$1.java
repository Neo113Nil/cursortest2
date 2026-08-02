package androidx.compose.material3.carousel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.carousel.CarouselState$animateScrollToItem$2$1", f = "CarouselState.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class CarouselState$animateScrollToItem$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.ScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.material3.carousel.CarouselPagerState getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope LazyLayoutScrollScope = androidx.compose.foundation.pager.PagerScrollScopeKt.LazyLayoutScrollScope(this.getHighSpeedVideoSizes, (androidx.compose.foundation.gestures.ScrollScope) this.getHighSpeedVideoFpsRangesFor);
            final androidx.compose.material3.carousel.CarouselPagerState carouselPagerState = this.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (androidx.compose.material3.carousel.CarouselStateKt.access$animateScrollToPage(LazyLayoutScrollScope, carouselPagerState, this.Camera2StreamConfigurationMap, 0.0f, this.getHighSpeedVideoFpsRanges, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.carousel.CarouselState$animateScrollToItem$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return androidx.compose.material3.carousel.CarouselState$animateScrollToItem$2$1.getHighSpeedVideoFpsRangesFor(androidx.compose.material3.carousel.CarouselPagerState.this, (androidx.compose.foundation.gestures.ScrollScope) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, this) == coroutine_suspended) {
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

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.material3.carousel.CarouselPagerState carouselPagerState, androidx.compose.foundation.gestures.ScrollScope scrollScope, int i) {
        carouselPagerState.updateTargetPage(scrollScope, i);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.foundation.gestures.ScrollScope scrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.carousel.CarouselState$animateScrollToItem$2$1) create(scrollScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.material3.carousel.CarouselState$animateScrollToItem$2$1 carouselState$animateScrollToItem$2$1 = new androidx.compose.material3.carousel.CarouselState$animateScrollToItem$2$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        carouselState$animateScrollToItem$2$1.getHighSpeedVideoFpsRangesFor = obj;
        return carouselState$animateScrollToItem$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselState$animateScrollToItem$2$1(androidx.compose.material3.carousel.CarouselPagerState carouselPagerState, int i, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super androidx.compose.material3.carousel.CarouselState$animateScrollToItem$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = carouselPagerState;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRanges = animationSpec;
    }
}

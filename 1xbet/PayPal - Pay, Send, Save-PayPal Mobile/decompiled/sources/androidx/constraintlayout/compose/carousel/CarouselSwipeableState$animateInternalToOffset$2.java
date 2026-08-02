package androidx.constraintlayout.compose.carousel;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState$animateInternalToOffset$2", f = "CarouselSwipeable.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class CarouselSwipeableState$animateInternalToOffset$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.DragScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ float Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.runtime.MutableState mutableState;
        androidx.compose.runtime.MutableFloatState mutableFloatState;
        androidx.compose.runtime.MutableState mutableState2;
        androidx.compose.runtime.MutableState mutableState3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final androidx.compose.foundation.gestures.DragScope dragScope = (androidx.compose.foundation.gestures.DragScope) this.getHighResolutionOutputSizeshNQ4ISI;
                final kotlin.jvm.internal.Ref.FloatRef floatRef = new kotlin.jvm.internal.Ref.FloatRef();
                mutableFloatState = ((androidx.constraintlayout.compose.carousel.CarouselSwipeableState) this.getHighSpeedVideoSizes).getHighSpeedVideoSizes;
                floatRef.element = mutableFloatState.getFloatValue();
                mutableState2 = ((androidx.constraintlayout.compose.carousel.CarouselSwipeableState) this.getHighSpeedVideoSizes).getHighResolutionOutputSizeshNQ4ISI;
                mutableState2.setValue(kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.Camera2StreamConfigurationMap));
                this.getHighSpeedVideoSizes.setAnimationRunning(true);
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (androidx.compose.animation.core.Animatable.animateTo$default(androidx.compose.animation.core.AnimatableKt.Animatable$default(floatRef.element, 0.0f, 2, null), kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.Camera2StreamConfigurationMap), this.getHighSpeedVideoFpsRanges, null, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>, kotlin.Unit>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$animateInternalToOffset$2.1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable) {
                        getHighSpeedVideoSizes(animatable);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighSpeedVideoSizes(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable) {
                        androidx.compose.foundation.gestures.DragScope.this.dragBy(animatable.getValue().floatValue() - floatRef.element);
                        floatRef.element = animatable.getValue().floatValue();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                }, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            mutableState3 = ((androidx.constraintlayout.compose.carousel.CarouselSwipeableState) this.getHighSpeedVideoSizes).getHighResolutionOutputSizeshNQ4ISI;
            mutableState3.setValue(null);
            this.getHighSpeedVideoSizes.setAnimationRunning(false);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutableState = ((androidx.constraintlayout.compose.carousel.CarouselSwipeableState) this.getHighSpeedVideoSizes).getHighResolutionOutputSizeshNQ4ISI;
            mutableState.setValue(null);
            this.getHighSpeedVideoSizes.setAnimationRunning(false);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.foundation.gestures.DragScope dragScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.constraintlayout.compose.carousel.CarouselSwipeableState$animateInternalToOffset$2) create(dragScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.constraintlayout.compose.carousel.CarouselSwipeableState$animateInternalToOffset$2 carouselSwipeableState$animateInternalToOffset$2 = new androidx.constraintlayout.compose.carousel.CarouselSwipeableState$animateInternalToOffset$2(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        carouselSwipeableState$animateInternalToOffset$2.getHighResolutionOutputSizeshNQ4ISI = obj;
        return carouselSwipeableState$animateInternalToOffset$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselSwipeableState$animateInternalToOffset$2(androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> carouselSwipeableState, float f, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super androidx.constraintlayout.compose.carousel.CarouselSwipeableState$animateInternalToOffset$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = carouselSwipeableState;
        this.Camera2StreamConfigurationMap = f;
        this.getHighSpeedVideoFpsRanges = animationSpec;
    }
}

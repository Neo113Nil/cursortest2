package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1", f = "Slider.kt", i = {}, l = {465}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class SliderKt$RangeSlider$2$gestureEndAction$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.internal.Ref.FloatRef getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ float getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.internal.Ref.FloatRef getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>, kotlin.Unit>> getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.runtime.MutableFloatState getInputFormats;
    final /* synthetic */ float getInputSizeshNQ4ISI;
    final /* synthetic */ kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> getOutputFormats;
    final /* synthetic */ androidx.compose.runtime.MutableFloatState getOutputMinFrameDuration;
    int getOutputSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.animation.core.TweenSpec tweenSpec;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.animation.core.Animatable Animatable$default = androidx.compose.animation.core.AnimatableKt.Animatable$default(this.getHighSpeedVideoFpsRanges, 0.0f, 2, null);
            java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.getInputSizeshNQ4ISI);
            tweenSpec = androidx.compose.material.SliderKt.getHighSpeedVideoFpsRanges;
            java.lang.Float boxFloat2 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f);
            final boolean z = this.Camera2StreamConfigurationMap;
            final androidx.compose.runtime.MutableFloatState mutableFloatState = this.getOutputMinFrameDuration;
            final androidx.compose.runtime.MutableFloatState mutableFloatState2 = this.getInputFormats;
            final androidx.compose.runtime.State<kotlin.jvm.functions.Function1<kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>, kotlin.Unit>> state = this.getHighSpeedVideoSizesFor;
            final kotlin.jvm.internal.Ref.FloatRef floatRef = this.getHighSpeedVideoFpsRangesFor;
            final kotlin.jvm.internal.Ref.FloatRef floatRef2 = this.getHighResolutionOutputSizeshNQ4ISI;
            final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange = this.getOutputFormats;
            this.getOutputSizes = 1;
            if (Animatable$default.animateTo(boxFloat, tweenSpec, boxFloat2, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1.getHighResolutionOutputSizeshNQ4ISI(z, mutableFloatState, mutableFloatState2, state, floatRef, floatRef2, closedFloatingPointRange, (androidx.compose.animation.core.Animatable) obj2);
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
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoSizes;
        if (function0 != null) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(boolean z, androidx.compose.runtime.MutableFloatState mutableFloatState, androidx.compose.runtime.MutableFloatState mutableFloatState2, androidx.compose.runtime.State state, kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.jvm.internal.Ref.FloatRef floatRef2, kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, androidx.compose.animation.core.Animatable animatable) {
        kotlin.ranges.ClosedFloatingPointRange highResolutionOutputSizeshNQ4ISI;
        (z ? mutableFloatState : mutableFloatState2).setFloatValue(((java.lang.Number) animatable.getValue()).floatValue());
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) state.getValue();
        highResolutionOutputSizeshNQ4ISI = androidx.compose.material.SliderKt.getHighResolutionOutputSizeshNQ4ISI(floatRef, floatRef2, closedFloatingPointRange, kotlin.ranges.RangesKt.rangeTo(mutableFloatState.getFloatValue(), mutableFloatState2.getFloatValue()));
        function1.invoke(highResolutionOutputSizeshNQ4ISI);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1(this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration, this.getInputFormats, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SliderKt$RangeSlider$2$gestureEndAction$1$1$1(float f, float f2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, boolean z, androidx.compose.runtime.MutableFloatState mutableFloatState, androidx.compose.runtime.MutableFloatState mutableFloatState2, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>, kotlin.Unit>> state, kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.jvm.internal.Ref.FloatRef floatRef2, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, kotlin.coroutines.Continuation<? super androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = f;
        this.getInputSizeshNQ4ISI = f2;
        this.getHighSpeedVideoSizes = function0;
        this.Camera2StreamConfigurationMap = z;
        this.getOutputMinFrameDuration = mutableFloatState;
        this.getInputFormats = mutableFloatState2;
        this.getHighSpeedVideoSizesFor = state;
        this.getHighSpeedVideoFpsRangesFor = floatRef;
        this.getHighResolutionOutputSizeshNQ4ISI = floatRef2;
        this.getOutputFormats = closedFloatingPointRange;
    }
}

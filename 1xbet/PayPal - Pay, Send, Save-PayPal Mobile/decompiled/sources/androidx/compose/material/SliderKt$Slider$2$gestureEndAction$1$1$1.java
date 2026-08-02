package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1$1", f = "Slider.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class SliderKt$Slider$2$gestureEndAction$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ float Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material.SliderDraggableState getHighSpeedVideoFpsRanges;
    final /* synthetic */ float getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ float getHighSpeedVideoSizes;
    int getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputFormats = 1;
            if (androidx.compose.material.SliderKt.access$animateToTarget(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (function0 != null) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SliderKt$Slider$2$gestureEndAction$1$1$1(androidx.compose.material.SliderDraggableState sliderDraggableState, float f, float f2, float f3, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = sliderDraggableState;
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getHighSpeedVideoSizes = f2;
        this.Camera2StreamConfigurationMap = f3;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
    }
}

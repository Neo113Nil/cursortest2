package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationResult;", "", "Landroidx/compose/animation/core/AnimationVector1D;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.AnalogTimePickerState$animateToCurrent$2", f = "TimePicker.kt", i = {}, l = {754}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class AnalogTimePickerState$animateToCurrent$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super androidx.compose.animation.core.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.AnalogTimePickerState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ float getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.animation.core.Animatable animatable;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        animatable = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
        this.Camera2StreamConfigurationMap = 1;
        java.lang.Object animateTo$default = androidx.compose.animation.core.Animatable.animateTo$default(animatable, kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.getHighSpeedVideoSizes), this.getHighSpeedVideoFpsRangesFor, null, null, this, 12, null);
        return animateTo$default == coroutine_suspended ? coroutine_suspended : animateTo$default;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super androidx.compose.animation.core.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> continuation) {
        return ((androidx.compose.material3.AnalogTimePickerState$animateToCurrent$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.AnalogTimePickerState$animateToCurrent$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnalogTimePickerState$animateToCurrent$2(androidx.compose.material3.AnalogTimePickerState analogTimePickerState, float f, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super androidx.compose.material3.AnalogTimePickerState$animateToCurrent$2> continuation) {
        super(1, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = analogTimePickerState;
        this.getHighSpeedVideoSizes = f;
        this.getHighSpeedVideoFpsRangesFor = animationSpec;
    }
}

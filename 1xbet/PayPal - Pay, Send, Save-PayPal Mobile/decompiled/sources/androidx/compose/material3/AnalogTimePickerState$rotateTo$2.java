package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.AnalogTimePickerState$rotateTo$2", f = "TimePicker.kt", i = {}, l = {823, 826}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class AnalogTimePickerState$rotateTo$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.lang.Object>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ float getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material3.AnalogTimePickerState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
    
        if (r12.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(androidx.compose.material3.AnalogTimePickerState.access$offsetAngle(r11.getHighSpeedVideoFpsRangesFor, r11.getHighSpeedVideoFpsRanges)), r11) != r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        float f;
        float highResolutionOutputSizeshNQ4ISI;
        androidx.compose.animation.core.Animatable animatable;
        androidx.compose.animation.core.Animatable animatable2;
        float f2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (androidx.compose.material3.TimePickerSelectionMode.m4054equalsimpl0(this.getHighSpeedVideoFpsRangesFor.mo2876getSelectionyecRtBI(), androidx.compose.material3.TimePickerSelectionMode.INSTANCE.m4058getHouryecRtBI())) {
                this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap = (androidx.compose.material3.AnalogTimePickerState.access$toHour(r12, this.getHighSpeedVideoFpsRanges) % 12) * 0.5235988f;
                androidx.compose.material3.TimePickerState state = this.getHighSpeedVideoFpsRangesFor.getState();
                androidx.compose.material3.AnalogTimePickerState analogTimePickerState = this.getHighSpeedVideoFpsRangesFor;
                f2 = analogTimePickerState.Camera2StreamConfigurationMap;
                state.setHour((androidx.compose.material3.AnalogTimePickerState.access$toHour(analogTimePickerState, f2) % 12) + (!androidx.compose.material3.TimePickerKt.isPm(this.getHighSpeedVideoFpsRangesFor) ? 0 : 12));
            } else {
                this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.material3.AnalogTimePickerState.access$toMinute(r12, this.getHighSpeedVideoFpsRanges) * 0.10471976f;
                androidx.compose.material3.TimePickerState state2 = this.getHighSpeedVideoFpsRangesFor.getState();
                androidx.compose.material3.AnalogTimePickerState analogTimePickerState2 = this.getHighSpeedVideoFpsRangesFor;
                f = analogTimePickerState2.getHighResolutionOutputSizeshNQ4ISI;
                state2.setMinute(androidx.compose.material3.AnalogTimePickerState.access$toMinute(analogTimePickerState2, f));
            }
            if (!this.Camera2StreamConfigurationMap) {
                animatable2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
            } else {
                androidx.compose.material3.AnalogTimePickerState analogTimePickerState3 = this.getHighSpeedVideoFpsRangesFor;
                highResolutionOutputSizeshNQ4ISI = analogTimePickerState3.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.AnalogTimePickerState.access$offsetAngle(analogTimePickerState3, this.getHighSpeedVideoFpsRanges));
                animatable = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
                this.getHighResolutionOutputSizeshNQ4ISI = 2;
                java.lang.Object animateTo$default = androidx.compose.animation.core.Animatable.animateTo$default(animatable, kotlin.coroutines.jvm.internal.Boxing.boxFloat(highResolutionOutputSizeshNQ4ISI), this.getHighSpeedVideoSizes, null, null, this, 12, null);
                if (animateTo$default != coroutine_suspended) {
                    return animateTo$default;
                }
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
        return ((androidx.compose.material3.AnalogTimePickerState$rotateTo$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.AnalogTimePickerState$rotateTo$2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnalogTimePickerState$rotateTo$2(androidx.compose.material3.AnalogTimePickerState analogTimePickerState, float f, boolean z, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super androidx.compose.material3.AnalogTimePickerState$rotateTo$2> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRangesFor = analogTimePickerState;
        this.getHighSpeedVideoFpsRanges = f;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoSizes = animationSpec;
    }
}

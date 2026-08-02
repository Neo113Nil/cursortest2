package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", f = "Transition.kt", i = {}, l = {458}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class SeekableTransitionState$snapTo$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.animation.core.Transition<S> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ S getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.animation.core.SeekableTransitionState<S> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        float f;
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI();
            ((androidx.compose.animation.core.SeekableTransitionState) this.getHighSpeedVideoSizes).Camera2StreamConfigurationMap = Long.MIN_VALUE;
            this.getHighSpeedVideoSizes.setFraction(0.0f);
            S s = this.getHighSpeedVideoFpsRanges;
            if (kotlin.jvm.internal.Intrinsics.areEqual(s, this.getHighSpeedVideoSizes.getCurrentState())) {
                f = -4.0f;
            } else {
                f = kotlin.jvm.internal.Intrinsics.areEqual(s, this.getHighSpeedVideoSizes.getTargetState()) ? -5.0f : -3.0f;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.updateTarget$animation_core(this.getHighSpeedVideoFpsRanges);
            this.getHighResolutionOutputSizeshNQ4ISI.setPlayTimeNanos(0L);
            this.getHighSpeedVideoSizes.setTargetState$animation_core(this.getHighSpeedVideoFpsRanges);
            this.getHighSpeedVideoSizes.setFraction(0.0f);
            this.getHighSpeedVideoSizes.setCurrentState$animation_core(this.getHighSpeedVideoFpsRanges);
            this.getHighResolutionOutputSizeshNQ4ISI.resetAnimationFraction$animation_core(f);
            if (f == -3.0f) {
                this.Camera2StreamConfigurationMap = 1;
                highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(this);
                if (highResolutionOutputSizeshNQ4ISI == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.onTransitionEnd$animation_core();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.animation.core.SeekableTransitionState$snapTo$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.animation.core.SeekableTransitionState$snapTo$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SeekableTransitionState$snapTo$2(androidx.compose.animation.core.SeekableTransitionState<S> seekableTransitionState, S s, androidx.compose.animation.core.Transition<S> transition, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.SeekableTransitionState$snapTo$2> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoSizes = seekableTransitionState;
        this.getHighSpeedVideoFpsRanges = s;
        this.getHighResolutionOutputSizeshNQ4ISI = transition;
    }
}

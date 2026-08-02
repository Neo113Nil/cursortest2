package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", i = {0, 0}, l = {1048}, m = "invokeSuspend", n = {"velocityLeft", "animationState"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes6.dex */
final class DefaultFlingBehavior$performFling$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Float>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.gestures.ScrollScope getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ float getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.foundation.gestures.DefaultFlingBehavior getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        float f;
        final kotlin.jvm.internal.Ref.FloatRef floatRef;
        androidx.compose.animation.core.AnimationState animationState;
        androidx.compose.animation.core.DecayAnimationSpec decayAnimationSpec;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (java.lang.Math.abs(this.getHighSpeedVideoFpsRangesFor) > 1.0f) {
                floatRef = new kotlin.jvm.internal.Ref.FloatRef();
                floatRef.element = this.getHighSpeedVideoFpsRangesFor;
                final kotlin.jvm.internal.Ref.FloatRef floatRef2 = new kotlin.jvm.internal.Ref.FloatRef();
                androidx.compose.animation.core.AnimationState AnimationState$default = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(0.0f, this.getHighSpeedVideoFpsRangesFor, 0L, 0L, false, 28, null);
                try {
                    decayAnimationSpec = this.getOutputFormats.getHighSpeedVideoFpsRanges;
                    final androidx.compose.foundation.gestures.ScrollScope scrollScope = this.getHighResolutionOutputSizeshNQ4ISI;
                    final androidx.compose.foundation.gestures.DefaultFlingBehavior defaultFlingBehavior = this.getOutputFormats;
                    this.getHighSpeedVideoFpsRanges = floatRef;
                    this.Camera2StreamConfigurationMap = AnimationState$default;
                    this.getHighSpeedVideoSizes = 1;
                    if (androidx.compose.animation.core.SuspendAnimationKt.animateDecay$default(AnimationState$default, decayAnimationSpec, false, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            kotlin.Unit Camera2StreamConfigurationMap;
                            Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2.Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.FloatRef.this, scrollScope, floatRef, defaultFlingBehavior, (androidx.compose.animation.core.AnimationScope) obj2);
                            return Camera2StreamConfigurationMap;
                        }
                    }, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (java.util.concurrent.CancellationException unused) {
                    animationState = AnimationState$default;
                    floatRef.element = ((java.lang.Number) animationState.getVelocity()).floatValue();
                    f = floatRef.element;
                    return kotlin.coroutines.jvm.internal.Boxing.boxFloat(f);
                }
            } else {
                f = this.getHighSpeedVideoFpsRangesFor;
                return kotlin.coroutines.jvm.internal.Boxing.boxFloat(f);
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            animationState = (androidx.compose.animation.core.AnimationState) this.Camera2StreamConfigurationMap;
            floatRef = (kotlin.jvm.internal.Ref.FloatRef) this.getHighSpeedVideoFpsRanges;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.util.concurrent.CancellationException unused2) {
                floatRef.element = ((java.lang.Number) animationState.getVelocity()).floatValue();
                f = floatRef.element;
                return kotlin.coroutines.jvm.internal.Boxing.boxFloat(f);
            }
        }
        f = floatRef.element;
        return kotlin.coroutines.jvm.internal.Boxing.boxFloat(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.FloatRef floatRef, androidx.compose.foundation.gestures.ScrollScope scrollScope, kotlin.jvm.internal.Ref.FloatRef floatRef2, androidx.compose.foundation.gestures.DefaultFlingBehavior defaultFlingBehavior, androidx.compose.animation.core.AnimationScope animationScope) {
        float floatValue = ((java.lang.Number) animationScope.getValue()).floatValue() - floatRef.element;
        float scrollBy = scrollScope.scrollBy(floatValue);
        floatRef.element = ((java.lang.Number) animationScope.getValue()).floatValue();
        floatRef2.element = ((java.lang.Number) animationScope.getVelocity()).floatValue();
        if (java.lang.Math.abs(floatValue - scrollBy) > 0.5f) {
            animationScope.cancelAnimation();
        }
        defaultFlingBehavior.setLastAnimationCycleCount(defaultFlingBehavior.getLastAnimationCycleCount() + 1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        return ((androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2(this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultFlingBehavior$performFling$2(float f, androidx.compose.foundation.gestures.DefaultFlingBehavior defaultFlingBehavior, androidx.compose.foundation.gestures.ScrollScope scrollScope, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getOutputFormats = defaultFlingBehavior;
        this.getHighResolutionOutputSizeshNQ4ISI = scrollScope;
    }
}

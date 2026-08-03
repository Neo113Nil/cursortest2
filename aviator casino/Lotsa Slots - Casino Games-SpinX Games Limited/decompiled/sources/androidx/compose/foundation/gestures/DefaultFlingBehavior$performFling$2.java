package androidx.compose.foundation.gestures;

/* compiled from: Scrollable.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", i = {0, 0}, l = {965}, m = "invokeSuspend", n = {"velocityLeft", "animationState"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
final class DefaultFlingBehavior$performFling$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Float>, java.lang.Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ androidx.compose.foundation.gestures.ScrollScope $this_performFling;
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ androidx.compose.foundation.gestures.DefaultFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultFlingBehavior$performFling$2(float f, androidx.compose.foundation.gestures.DefaultFlingBehavior defaultFlingBehavior, androidx.compose.foundation.gestures.ScrollScope scrollScope, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2> continuation) {
        super(2, continuation);
        this.$initialVelocity = f;
        this.this$0 = defaultFlingBehavior;
        this.$this_performFling = scrollScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2(this.$initialVelocity, this.this$0, this.$this_performFling, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        return ((androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        float f;
        final kotlin.jvm.internal.Ref.FloatRef floatRef;
        androidx.compose.animation.core.AnimationState animationState;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (java.lang.Math.abs(this.$initialVelocity) > 1.0f) {
                floatRef = new kotlin.jvm.internal.Ref.FloatRef();
                floatRef.element = this.$initialVelocity;
                final kotlin.jvm.internal.Ref.FloatRef floatRef2 = new kotlin.jvm.internal.Ref.FloatRef();
                androidx.compose.animation.core.AnimationState AnimationState$default = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(0.0f, this.$initialVelocity, 0L, 0L, false, 28, null);
                try {
                    androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> flingDecay = this.this$0.getFlingDecay();
                    final androidx.compose.foundation.gestures.ScrollScope scrollScope = this.$this_performFling;
                    final androidx.compose.foundation.gestures.DefaultFlingBehavior defaultFlingBehavior = this.this$0;
                    this.L$0 = floatRef;
                    this.L$1 = AnimationState$default;
                    this.label = 1;
                    if (androidx.compose.animation.core.SuspendAnimationKt.animateDecay$default(AnimationState$default, flingDecay, false, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>, kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationScope) {
                            invoke2(animationScope);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationScope) {
                            float floatValue = animationScope.getValue().floatValue() - kotlin.jvm.internal.Ref.FloatRef.this.element;
                            float scrollBy = scrollScope.scrollBy(floatValue);
                            kotlin.jvm.internal.Ref.FloatRef.this.element = animationScope.getValue().floatValue();
                            floatRef.element = animationScope.getVelocity().floatValue();
                            if (java.lang.Math.abs(floatValue - scrollBy) > 0.5f) {
                                animationScope.cancelAnimation();
                            }
                            androidx.compose.foundation.gestures.DefaultFlingBehavior defaultFlingBehavior2 = defaultFlingBehavior;
                            defaultFlingBehavior2.setLastAnimationCycleCount(defaultFlingBehavior2.getLastAnimationCycleCount() + 1);
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
                f = this.$initialVelocity;
                return kotlin.coroutines.jvm.internal.Boxing.boxFloat(f);
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            animationState = (androidx.compose.animation.core.AnimationState) this.L$1;
            floatRef = (kotlin.jvm.internal.Ref.FloatRef) this.L$0;
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
}

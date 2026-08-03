package androidx.compose.animation.core;

/* compiled from: Transition.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0016\u001a\u00020\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0019H\u0086@¢\u0006\u0002\u0010\u001aJ\u001e\u0010\u001b\u001a\u00020\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0019H\u0086@¢\u0006\u0002\u0010\u001aJ\b\u0010\u001c\u001a\u00020\u0017H\u0002J\u0018\u0010\u001d\u001a\u00020\u00172\b\b\u0001\u0010\u000e\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\u00172\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0010¢\u0006\u0002\b R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000e\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0013\u0010\fR\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Landroidx/compose/animation/core/SeekableTransitionState;", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "Landroidx/compose/animation/core/TransitionState;", "initialState", "targetState", "(Ljava/lang/Object;Ljava/lang/Object;)V", "animatedFraction", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "currentState", "getCurrentState", "()Ljava/lang/Object;", "Ljava/lang/Object;", "fraction", "getFraction", "()F", "observer", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "getTargetState", "transition", "Landroidx/compose/animation/core/Transition;", "animateToCurrentState", "", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToTargetState", "seekToFraction", "snapToFraction", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transitionConfigured", "transitionConfigured$animation_core_release", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SeekableTransitionState<S> extends androidx.compose.animation.core.TransitionState<S> {
    public static final int $stable = 8;
    private final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatedFraction;
    private final S currentState;
    private final androidx.compose.runtime.snapshots.SnapshotStateObserver observer;
    private final S targetState;
    private androidx.compose.animation.core.Transition<S> transition;

    @Override // androidx.compose.animation.core.TransitionState
    public S getTargetState() {
        return this.targetState;
    }

    public SeekableTransitionState(S s, S s2) {
        super(null);
        this.targetState = s2;
        androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> Animatable$default = androidx.compose.animation.core.AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        Animatable$default.updateBounds(java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(1.0f));
        this.animatedFraction = Animatable$default;
        this.observer = new androidx.compose.runtime.snapshots.SnapshotStateObserver(new kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function0<? extends kotlin.Unit>, kotlin.Unit>() { // from class: androidx.compose.animation.core.SeekableTransitionState$observer$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function0<? extends kotlin.Unit> function0) {
                invoke2((kotlin.jvm.functions.Function0<kotlin.Unit>) function0);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
                function0.invoke();
            }
        });
        this.currentState = s;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getCurrentState() {
        return this.currentState;
    }

    public final float getFraction() {
        return this.animatedFraction.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object snapToFraction(float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.animation.core.SeekableTransitionState$snapToFraction$1 seekableTransitionState$snapToFraction$1;
        int i;
        androidx.compose.animation.core.SeekableTransitionState<S> seekableTransitionState;
        if (continuation instanceof androidx.compose.animation.core.SeekableTransitionState$snapToFraction$1) {
            seekableTransitionState$snapToFraction$1 = (androidx.compose.animation.core.SeekableTransitionState$snapToFraction$1) continuation;
            if ((seekableTransitionState$snapToFraction$1.label & Integer.MIN_VALUE) != 0) {
                seekableTransitionState$snapToFraction$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = seekableTransitionState$snapToFraction$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = seekableTransitionState$snapToFraction$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (0.0f > f || f > 1.0f) {
                        throw new java.lang.IllegalArgumentException(("Expecting fraction between 0 and 1. Got " + f).toString());
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(getCurrentState(), getTargetState())) {
                        return kotlin.Unit.INSTANCE;
                    }
                    androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable = this.animatedFraction;
                    java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(f);
                    seekableTransitionState$snapToFraction$1.L$0 = this;
                    seekableTransitionState$snapToFraction$1.label = 1;
                    if (animatable.snapTo(boxFloat, seekableTransitionState$snapToFraction$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    seekableTransitionState = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    seekableTransitionState = (androidx.compose.animation.core.SeekableTransitionState) seekableTransitionState$snapToFraction$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                seekableTransitionState.seekToFraction();
                return kotlin.Unit.INSTANCE;
            }
        }
        seekableTransitionState$snapToFraction$1 = new androidx.compose.animation.core.SeekableTransitionState$snapToFraction$1(this, continuation);
        java.lang.Object obj2 = seekableTransitionState$snapToFraction$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = seekableTransitionState$snapToFraction$1.label;
        if (i != 0) {
        }
        seekableTransitionState.seekToFraction();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object animateToTargetState$default(androidx.compose.animation.core.SeekableTransitionState seekableTransitionState, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = seekableTransitionState.animatedFraction.getDefaultSpringSpec$animation_core_release();
        }
        return seekableTransitionState.animateToTargetState(finiteAnimationSpec, continuation);
    }

    public final java.lang.Object animateToTargetState(androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (this.transition == null || kotlin.jvm.internal.Intrinsics.areEqual(getCurrentState(), getTargetState())) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object animateTo$default = androidx.compose.animation.core.Animatable.animateTo$default(this.animatedFraction, kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f), finiteAnimationSpec, null, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>, kotlin.Unit>(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$animateToTargetState$2
            final /* synthetic */ androidx.compose.animation.core.SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable) {
                invoke2(animatable);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable) {
                this.this$0.seekToFraction();
            }
        }, continuation, 4, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object animateToCurrentState$default(androidx.compose.animation.core.SeekableTransitionState seekableTransitionState, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = seekableTransitionState.animatedFraction.getDefaultSpringSpec$animation_core_release();
        }
        return seekableTransitionState.animateToCurrentState(finiteAnimationSpec, continuation);
    }

    public final java.lang.Object animateToCurrentState(androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (this.transition == null || kotlin.jvm.internal.Intrinsics.areEqual(getCurrentState(), getTargetState())) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object animateTo$default = androidx.compose.animation.core.Animatable.animateTo$default(this.animatedFraction, kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f), finiteAnimationSpec, null, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>, kotlin.Unit>(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$animateToCurrentState$2
            final /* synthetic */ androidx.compose.animation.core.SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable) {
                invoke2(animatable);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable) {
                this.this$0.seekToFraction();
            }
        }, continuation, 4, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionConfigured$animation_core_release(androidx.compose.animation.core.Transition<S> transition) {
        androidx.compose.animation.core.Transition<S> transition2 = this.transition;
        if (transition2 != null && !kotlin.jvm.internal.Intrinsics.areEqual(transition, transition2)) {
            throw new java.lang.IllegalStateException(("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.transition + ", new instance: " + transition).toString());
        }
        this.transition = transition;
        seekToFraction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void seekToFraction() {
        final androidx.compose.animation.core.Transition<S> transition = this.transition;
        if (transition == null) {
            return;
        }
        final kotlin.jvm.internal.Ref.LongRef longRef = new kotlin.jvm.internal.Ref.LongRef();
        this.observer.observeReads(kotlin.Unit.INSTANCE, new kotlin.jvm.functions.Function1<kotlin.Unit, kotlin.Unit>(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$seekToFraction$1
            final /* synthetic */ androidx.compose.animation.core.SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.Unit unit) {
                invoke2(unit);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(kotlin.Unit unit) {
                this.this$0.seekToFraction();
            }
        }, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.animation.core.SeekableTransitionState$seekToFraction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                kotlin.jvm.internal.Ref.LongRef.this.element = transition.getTotalDurationNanos();
            }
        });
        transition.seek(getCurrentState(), getTargetState(), kotlin.math.MathKt.roundToLong(this.animatedFraction.getValue().floatValue() * longRef.element));
    }
}

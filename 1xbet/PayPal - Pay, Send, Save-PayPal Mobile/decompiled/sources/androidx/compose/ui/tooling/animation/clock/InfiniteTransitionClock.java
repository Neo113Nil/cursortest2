package androidx.compose.ui.tooling.animation.clock;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\b\u0010\u0019\u001a\u00020\bH\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00172\u0006\u0010\u001d\u001a\u00020\bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\bH\u0016J,\u0010 \u001a\u00020\b\"\u0004\b\u0000\u0010!\"\b\b\u0001\u0010\"*\u00020#*\u0012\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H\"0$R\u00020%H\u0002R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006&"}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/InfiniteTransitionClock;", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "", "animation", "maxDuration", "Lkotlin/Function0;", "", "<init>", "(Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;Lkotlin/jvm/functions/Function0;)V", "getAnimation", "()Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "state", "getState", "()Landroidx/compose/ui/tooling/animation/states/TargetState;", "setState", "(Landroidx/compose/ui/tooling/animation/states/TargetState;)V", "setStateParameters", "", "par1", "par2", "getAnimatedProperties", "", "Landroidx/compose/animation/tooling/ComposeAnimatedProperty;", "getMaxDurationPerIteration", "getMaxDuration", "getTransitions", "Landroidx/compose/animation/tooling/TransitionInfo;", "stepMillis", "setClockTime", "animationTimeNanos", "getIterationDuration", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "Landroidx/compose/animation/core/InfiniteTransition;", "ui-tooling"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InfiniteTransitionClock implements androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock<androidx.compose.ui.tooling.animation.InfiniteTransitionComposeAnimation, androidx.compose.ui.tooling.animation.states.TargetState<java.lang.Object>> {
    public static final int $stable = 8;
    private final kotlin.jvm.functions.Function0<java.lang.Long> Camera2StreamConfigurationMap;
    private final androidx.compose.ui.tooling.animation.InfiniteTransitionComposeAnimation getHighResolutionOutputSizeshNQ4ISI;
    private androidx.compose.ui.tooling.animation.states.TargetState<java.lang.Object> getHighSpeedVideoSizes;

    public static /* synthetic */ long $r8$lambda$Cr742IFdOJbk53dYvTy5GYs2qps() {
        return 0L;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final void setStateParameters(java.lang.Object par1, java.lang.Object par2) {
    }

    public InfiniteTransitionClock(androidx.compose.ui.tooling.animation.InfiniteTransitionComposeAnimation infiniteTransitionComposeAnimation, kotlin.jvm.functions.Function0<java.lang.Long> function0) {
        this.getHighResolutionOutputSizeshNQ4ISI = infiniteTransitionComposeAnimation;
        this.Camera2StreamConfigurationMap = function0;
        this.getHighSpeedVideoSizes = new androidx.compose.ui.tooling.animation.states.TargetState<>(0, 0);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    /* renamed from: getAnimation, reason: avoid collision after fix types in other method and from getter */
    public final androidx.compose.ui.tooling.animation.InfiniteTransitionComposeAnimation getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public /* synthetic */ InfiniteTransitionClock(androidx.compose.ui.tooling.animation.InfiniteTransitionComposeAnimation infiniteTransitionComposeAnimation, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(infiniteTransitionComposeAnimation, (i & 2) != 0 ? new kotlin.jvm.functions.Function0() { // from class: androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Long.valueOf(androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock.$r8$lambda$Cr742IFdOJbk53dYvTy5GYs2qps());
            }
        } : function0);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final androidx.compose.ui.tooling.animation.states.TargetState<java.lang.Object> getState() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final void setState(androidx.compose.ui.tooling.animation.states.TargetState<java.lang.Object> targetState) {
        this.getHighSpeedVideoSizes = targetState;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final java.util.List<androidx.compose.animation.tooling.ComposeAnimatedProperty> getAnimatedProperties() {
        java.util.List<androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState<?, ?>> animations = getGetHighResolutionOutputSizeshNQ4ISI().m8523getAnimationObject().getAnimations();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = animations.iterator();
        while (it.hasNext()) {
            androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState transitionAnimationState = (androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState) it.next();
            java.lang.Object value = transitionAnimationState.getValue();
            androidx.compose.animation.tooling.ComposeAnimatedProperty composeAnimatedProperty = value == null ? null : new androidx.compose.animation.tooling.ComposeAnimatedProperty(transitionAnimationState.getLabel(), value);
            if (composeAnimatedProperty != null) {
                arrayList.add(composeAnimatedProperty);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (!androidx.compose.ui.tooling.animation.clock.Utils_androidKt.getIGNORE_TRANSITIONS().contains(((androidx.compose.animation.tooling.ComposeAnimatedProperty) obj).getLabel())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final long getMaxDurationPerIteration() {
        java.lang.Long l;
        java.util.Iterator<T> it = getGetHighResolutionOutputSizeshNQ4ISI().m8523getAnimationObject().getAnimations().iterator();
        if (it.hasNext()) {
            java.lang.Long valueOf = java.lang.Long.valueOf(getHighResolutionOutputSizeshNQ4ISI((androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState) it.next()));
            while (it.hasNext()) {
                java.lang.Long valueOf2 = java.lang.Long.valueOf(getHighResolutionOutputSizeshNQ4ISI((androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState) it.next()));
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l = valueOf;
        } else {
            l = null;
        }
        java.lang.Long l2 = l;
        return androidx.compose.ui.tooling.animation.clock.Utils_androidKt.nanosToMillis(l2 != null ? l2.longValue() : 0L);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final long getMaxDuration() {
        return java.lang.Math.max(getMaxDurationPerIteration(), this.Camera2StreamConfigurationMap.invoke().longValue());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final java.util.List<androidx.compose.animation.tooling.TransitionInfo> getTransitions(long stepMillis) {
        java.util.List<androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState<?, ?>> animations = getGetHighResolutionOutputSizeshNQ4ISI().m8523getAnimationObject().getAnimations();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(animations, 10));
        java.util.Iterator<T> it = animations.iterator();
        while (it.hasNext()) {
            arrayList.add(androidx.compose.ui.tooling.animation.clock.Utils_androidKt.createTransitionInfo((androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState) it.next(), stepMillis, getMaxDuration()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (!androidx.compose.ui.tooling.animation.clock.Utils_androidKt.getIGNORE_TRANSITIONS().contains(((androidx.compose.animation.tooling.TransitionInfo) obj).getLabel())) {
                arrayList2.add(obj);
            }
        }
        return kotlin.collections.CollectionsKt.toList(arrayList2);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final void setClockTime(long animationTimeNanos) {
        getGetHighResolutionOutputSizeshNQ4ISI().setTimeNanos(animationTimeNanos);
    }

    private static <T, V extends androidx.compose.animation.core.AnimationVector> long getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState) {
        androidx.compose.animation.core.AnimationSpec<T> animationSpec = transitionAnimationState.getAnimationSpec();
        kotlin.jvm.internal.Intrinsics.checkNotNull(animationSpec, "");
        androidx.compose.animation.core.InfiniteRepeatableSpec infiniteRepeatableSpec = (androidx.compose.animation.core.InfiniteRepeatableSpec) animationSpec;
        int i = infiniteRepeatableSpec.getRepeatMode() == androidx.compose.animation.core.RepeatMode.Reverse ? 2 : 1;
        androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec<V> vectorize = infiniteRepeatableSpec.getAnimation().vectorize((androidx.compose.animation.core.TwoWayConverter) transitionAnimationState.getTypeConverter());
        return androidx.compose.ui.tooling.animation.clock.Utils_androidKt.millisToNanos(vectorize.getDelayMillis() + (vectorize.getDurationMillis() * i));
    }
}

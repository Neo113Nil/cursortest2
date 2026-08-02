package androidx.compose.ui.tooling.animation.clock;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00182\u0006\u0010\u001e\u001a\u00020\u0011H\u0016J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0011H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/TransitionClock;", "T", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "animation", "<init>", "(Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;)V", "getAnimation", "()Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "state", "getState", "()Landroidx/compose/ui/tooling/animation/states/TargetState;", "setState", "(Landroidx/compose/ui/tooling/animation/states/TargetState;)V", "currentClockTimeNanos", "", "setStateParameters", "", "par1", "", "par2", "getAnimatedProperties", "", "Landroidx/compose/animation/tooling/ComposeAnimatedProperty;", "getMaxDurationPerIteration", "getMaxDuration", "getTransitions", "Landroidx/compose/animation/tooling/TransitionInfo;", "stepMillis", "setClockTime", "animationTimeNanos", "ui-tooling"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransitionClock<T> implements androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock<androidx.compose.ui.tooling.animation.TransitionBasedAnimation<T>, androidx.compose.ui.tooling.animation.states.TargetState<T>> {
    public static final int $stable = 8;
    private androidx.compose.ui.tooling.animation.states.TargetState<T> Camera2StreamConfigurationMap = new androidx.compose.ui.tooling.animation.states.TargetState<>(getAnimation().m8517getAnimationObject().getCurrentState(), getAnimation().m8517getAnimationObject().getTargetState());
    private long getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.ui.tooling.animation.TransitionBasedAnimation<T> getHighSpeedVideoSizes;

    public TransitionClock(androidx.compose.ui.tooling.animation.TransitionBasedAnimation<T> transitionBasedAnimation) {
        this.getHighSpeedVideoSizes = transitionBasedAnimation;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final androidx.compose.ui.tooling.animation.TransitionBasedAnimation<T> getAnimation() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final androidx.compose.ui.tooling.animation.states.TargetState<T> getState() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final void setState(androidx.compose.ui.tooling.animation.states.TargetState<T> targetState) {
        this.Camera2StreamConfigurationMap = targetState;
        setClockTime(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final void setStateParameters(java.lang.Object par1, java.lang.Object par2) {
        androidx.compose.ui.tooling.animation.states.TargetState<T> parseParametersToValue = androidx.compose.ui.tooling.animation.clock.Utils_androidKt.parseParametersToValue(getState().getInitial(), par1, par2);
        if (parseParametersToValue != null) {
            setState((androidx.compose.ui.tooling.animation.states.TargetState) parseParametersToValue);
        }
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final java.util.List<androidx.compose.animation.tooling.ComposeAnimatedProperty> getAnimatedProperties() {
        java.util.List<androidx.compose.animation.core.Transition<?>.TransitionAnimationState<?, ?>> allAnimations = androidx.compose.ui.tooling.animation.clock.Utils_androidKt.allAnimations(getAnimation().m8517getAnimationObject());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = allAnimations.iterator();
        while (it.hasNext()) {
            androidx.compose.animation.core.Transition.TransitionAnimationState transitionAnimationState = (androidx.compose.animation.core.Transition.TransitionAnimationState) it.next();
            java.lang.Object value = transitionAnimationState.getValue();
            androidx.compose.animation.tooling.ComposeAnimatedProperty composeAnimatedProperty = value == null ? null : new androidx.compose.animation.tooling.ComposeAnimatedProperty(transitionAnimationState.getLabel(), value);
            if (composeAnimatedProperty != null) {
                arrayList.add(composeAnimatedProperty);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (T t : arrayList) {
            if (!androidx.compose.ui.tooling.animation.clock.Utils_androidKt.getIGNORE_TRANSITIONS().contains(((androidx.compose.animation.tooling.ComposeAnimatedProperty) t).getLabel())) {
                arrayList2.add(t);
            }
        }
        return arrayList2;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final long getMaxDurationPerIteration() {
        return androidx.compose.ui.tooling.animation.clock.Utils_androidKt.nanosToMillis(getAnimation().m8517getAnimationObject().getTotalDurationNanos());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final long getMaxDuration() {
        return androidx.compose.ui.tooling.animation.clock.Utils_androidKt.nanosToMillis(getAnimation().m8517getAnimationObject().getTotalDurationNanos());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final java.util.List<androidx.compose.animation.tooling.TransitionInfo> getTransitions(long stepMillis) {
        java.util.List<androidx.compose.animation.core.Transition<?>.TransitionAnimationState<?, ?>> allAnimations = androidx.compose.ui.tooling.animation.clock.Utils_androidKt.allAnimations(getAnimation().m8517getAnimationObject());
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(allAnimations, 10));
        java.util.Iterator<T> it = allAnimations.iterator();
        while (it.hasNext()) {
            arrayList.add(androidx.compose.ui.tooling.animation.clock.Utils_androidKt.createTransitionInfo((androidx.compose.animation.core.Transition.TransitionAnimationState) it.next(), stepMillis));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (T t : arrayList) {
            if (!androidx.compose.ui.tooling.animation.clock.Utils_androidKt.getIGNORE_TRANSITIONS().contains(((androidx.compose.animation.tooling.TransitionInfo) t).getLabel())) {
                arrayList2.add(t);
            }
        }
        return arrayList2;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final void setClockTime(long animationTimeNanos) {
        this.getHighSpeedVideoFpsRangesFor = animationTimeNanos;
        getAnimation().m8517getAnimationObject().seek(getState().getInitial(), getState().getTarget(), animationTimeNanos);
    }
}

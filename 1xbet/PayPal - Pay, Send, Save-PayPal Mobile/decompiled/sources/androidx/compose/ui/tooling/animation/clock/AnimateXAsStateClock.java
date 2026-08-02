package androidx.compose.ui.tooling.animation.clock;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00060\u0004B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001e2\u0006\u0010%\u001a\u00020!H\u0016J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020!H\u0016J\u0014\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017H\u0002R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR0\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000@BX\u0082\u000e¢\u0006\n\n\u0002\u0010\u0015\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010&\u001a\u00020!2\u0006\u0010\f\u001a\u00020!@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b'\u0010(¨\u0006,"}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/AnimateXAsStateClock;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "animation", "<init>", "(Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;)V", "getAnimation", "()Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "state", "getState", "()Landroidx/compose/ui/tooling/animation/states/TargetState;", "setState", "(Landroidx/compose/ui/tooling/animation/states/TargetState;)V", "currentValue", "setCurrentValue", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "currAnimation", "Landroidx/compose/animation/core/TargetBasedAnimation;", "setStateParameters", "", "par1", "", "par2", "getAnimatedProperties", "", "Landroidx/compose/animation/tooling/ComposeAnimatedProperty;", "getMaxDurationPerIteration", "", "getMaxDuration", "getTransitions", "Landroidx/compose/animation/tooling/TransitionInfo;", "stepMillis", "clockTimeNanos", "setClockTimeNanos", "(J)V", "setClockTime", "animationTimeNanos", "getCurrentAnimation", "ui-tooling"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnimateXAsStateClock<T, V extends androidx.compose.animation.core.AnimationVector> implements androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock<androidx.compose.ui.tooling.animation.AnimateXAsStateComposeAnimation<T, V>, androidx.compose.ui.tooling.animation.states.TargetState<T>> {
    public static final int $stable = 8;
    private long Camera2StreamConfigurationMap;
    private final androidx.compose.ui.tooling.animation.AnimateXAsStateComposeAnimation<T, V> getHighSpeedVideoSizes;
    private androidx.compose.ui.tooling.animation.states.TargetState<T> getHighSpeedVideoFpsRangesFor = new androidx.compose.ui.tooling.animation.states.TargetState<>(getAnimation().m8516getAnimationObject().getValue(), getAnimation().m8516getAnimationObject().getValue());
    private T getHighResolutionOutputSizeshNQ4ISI = getAnimation().getToolingState().getValue();
    private androidx.compose.animation.core.TargetBasedAnimation<T, V> getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRangesFor();

    public AnimateXAsStateClock(androidx.compose.ui.tooling.animation.AnimateXAsStateComposeAnimation<T, V> animateXAsStateComposeAnimation) {
        this.getHighSpeedVideoSizes = animateXAsStateComposeAnimation;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final androidx.compose.ui.tooling.animation.AnimateXAsStateComposeAnimation<T, V> getAnimation() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final androidx.compose.ui.tooling.animation.states.TargetState<T> getState() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final void setState(androidx.compose.ui.tooling.animation.states.TargetState<T> targetState) {
        this.getHighSpeedVideoFpsRangesFor = targetState;
        this.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRangesFor();
        setClockTime(this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final void setStateParameters(java.lang.Object par1, java.lang.Object par2) {
        androidx.compose.ui.tooling.animation.states.TargetState<T> parseParametersToValue = androidx.compose.ui.tooling.animation.clock.Utils_androidKt.parseParametersToValue(this.getHighResolutionOutputSizeshNQ4ISI, par1, par2);
        if (parseParametersToValue != null) {
            setState((androidx.compose.ui.tooling.animation.states.TargetState) parseParametersToValue);
        }
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final java.util.List<androidx.compose.animation.tooling.ComposeAnimatedProperty> getAnimatedProperties() {
        java.lang.String getHighSpeedVideoFpsRanges = getAnimation().getGetHighSpeedVideoFpsRanges();
        T t = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(t, "");
        return kotlin.collections.CollectionsKt.listOf(new androidx.compose.animation.tooling.ComposeAnimatedProperty(getHighSpeedVideoFpsRanges, t));
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final long getMaxDurationPerIteration() {
        return androidx.compose.ui.tooling.animation.clock.Utils_androidKt.nanosToMillis(this.getHighSpeedVideoFpsRanges.getDurationNanos());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final long getMaxDuration() {
        return androidx.compose.ui.tooling.animation.clock.Utils_androidKt.nanosToMillis(this.getHighSpeedVideoFpsRanges.getDurationNanos());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final java.util.List<androidx.compose.animation.tooling.TransitionInfo> getTransitions(long stepMillis) {
        return kotlin.collections.CollectionsKt.listOf(androidx.compose.ui.tooling.animation.clock.Utils_androidKt.createTransitionInfo(this.getHighSpeedVideoFpsRanges, getAnimation().getGetHighSpeedVideoFpsRanges(), getAnimation().getAnimationSpec(), stepMillis));
    }

    private final androidx.compose.animation.core.TargetBasedAnimation<T, V> getHighSpeedVideoFpsRangesFor() {
        return androidx.compose.animation.core.AnimationKt.TargetBasedAnimation(getAnimation().getAnimationSpec(), getAnimation().m8516getAnimationObject().getTypeConverter(), getState().getInitial(), getState().getTarget(), getAnimation().m8516getAnimationObject().getVelocity());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final void setClockTime(long animationTimeNanos) {
        this.Camera2StreamConfigurationMap = animationTimeNanos;
        T valueFromNanos = this.getHighSpeedVideoFpsRanges.getValueFromNanos(animationTimeNanos);
        this.getHighResolutionOutputSizeshNQ4ISI = valueFromNanos;
        getAnimation().getToolingState().setValue(valueFromNanos);
    }
}

package androidx.compose.animation.core;

/* compiled from: FloatAnimationSpec.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J \u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J(\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/animation/core/FloatTweenSpec;", "Landroidx/compose/animation/core/FloatAnimationSpec;", com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, "", "delay", "easing", "Landroidx/compose/animation/core/Easing;", "(IILandroidx/compose/animation/core/Easing;)V", "getDelay", "()I", "getDuration", "clampPlayTime", "", "playTime", "getDurationNanos", "initialValue", "", "targetValue", "initialVelocity", "getValueFromNanos", "playTimeNanos", "getVelocityFromNanos", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FloatTweenSpec implements androidx.compose.animation.core.FloatAnimationSpec {
    public static final int $stable = 0;
    private final int delay;
    private final int duration;
    private final androidx.compose.animation.core.Easing easing;

    public FloatTweenSpec() {
        this(0, 0, null, 7, null);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public /* synthetic */ float getEndVelocity(float f, float f2, float f3) {
        return androidx.compose.animation.core.FloatAnimationSpec.CC.$default$getEndVelocity(this, f, f2, f3);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public /* bridge */ /* synthetic */ androidx.compose.animation.core.VectorizedAnimationSpec vectorize(androidx.compose.animation.core.TwoWayConverter twoWayConverter) {
        androidx.compose.animation.core.VectorizedAnimationSpec vectorize;
        vectorize = vectorize(twoWayConverter);
        return vectorize;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public /* synthetic */ androidx.compose.animation.core.VectorizedFloatAnimationSpec vectorize(androidx.compose.animation.core.TwoWayConverter twoWayConverter) {
        return androidx.compose.animation.core.FloatAnimationSpec.CC.m132$default$vectorize((androidx.compose.animation.core.FloatAnimationSpec) this, twoWayConverter);
    }

    public FloatTweenSpec(int i, int i2, androidx.compose.animation.core.Easing easing) {
        this.duration = i;
        this.delay = i2;
        this.easing = easing;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getDelay() {
        return this.delay;
    }

    public /* synthetic */ FloatTweenSpec(int i, int i2, androidx.compose.animation.core.Easing easing, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing() : easing);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long clampPlayTime = clampPlayTime(playTimeNanos / 1000000);
        int i = this.duration;
        return androidx.compose.animation.core.VectorConvertersKt.lerp(initialValue, targetValue, this.easing.transform(kotlin.ranges.RangesKt.coerceIn(i == 0 ? 1.0f : clampPlayTime / i, 0.0f, 1.0f)));
    }

    private final long clampPlayTime(long playTime) {
        return kotlin.ranges.RangesKt.coerceIn(playTime - this.delay, 0L, this.duration);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float initialValue, float targetValue, float initialVelocity) {
        return (this.delay + this.duration) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long clampPlayTime = clampPlayTime(playTimeNanos / 1000000);
        if (clampPlayTime < 0) {
            return 0.0f;
        }
        if (clampPlayTime == 0) {
            return initialVelocity;
        }
        return (getValueFromNanos(clampPlayTime * 1000000, initialValue, targetValue, initialVelocity) - getValueFromNanos((clampPlayTime - 1) * 1000000, initialValue, targetValue, initialVelocity)) * 1000.0f;
    }
}

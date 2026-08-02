package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/animation/SplineBasedFloatDecayAnimationSpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "", "p0", "getHighSpeedVideoFpsRangesFor", "(F)F", "initialValue", "initialVelocity", "getTargetValue", "(FF)F", "", "playTimeNanos", "getValueFromNanos", "(JFF)F", "getDurationNanos", "(FF)J", "getVelocityFromNanos", "Landroidx/compose/animation/FlingCalculator;", "getHighSpeedVideoSizes", "Landroidx/compose/animation/FlingCalculator;", "Camera2StreamConfigurationMap", "getAbsVelocityThreshold", "()F", "absVelocityThreshold"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SplineBasedFloatDecayAnimationSpec implements androidx.compose.animation.core.FloatDecayAnimationSpec {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.animation.FlingCalculator Camera2StreamConfigurationMap;

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float getAbsVelocityThreshold() {
        return 0.0f;
    }

    public SplineBasedFloatDecayAnimationSpec(androidx.compose.ui.unit.Density density) {
        this.Camera2StreamConfigurationMap = new androidx.compose.animation.FlingCalculator(androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt.getPlatformFlingScrollFriction(), density);
    }

    private final float getHighSpeedVideoFpsRangesFor(float p0) {
        return this.Camera2StreamConfigurationMap.flingDistance(p0) * java.lang.Math.signum(p0);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float getTargetValue(float initialValue, float initialVelocity) {
        return initialValue + getHighSpeedVideoFpsRangesFor(initialVelocity);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float getValueFromNanos(long playTimeNanos, float initialValue, float initialVelocity) {
        return initialValue + this.Camera2StreamConfigurationMap.flingInfo(initialVelocity).position(playTimeNanos / 1000000);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final long getDurationNanos(float initialValue, float initialVelocity) {
        return this.Camera2StreamConfigurationMap.flingDuration(initialVelocity) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float getVelocityFromNanos(long playTimeNanos, float initialValue, float initialVelocity) {
        return this.Camera2StreamConfigurationMap.flingInfo(initialVelocity).velocity(playTimeNanos / 1000000);
    }
}

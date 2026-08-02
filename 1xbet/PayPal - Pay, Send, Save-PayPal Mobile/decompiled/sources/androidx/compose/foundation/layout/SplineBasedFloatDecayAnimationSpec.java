package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0012R\u0014\u0010\n\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/foundation/layout/SplineBasedFloatDecayAnimationSpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "Landroidx/compose/ui/unit/Density;", "p0", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "", "", "getHighSpeedVideoFpsRanges", "(F)D", "getHighSpeedVideoFpsRangesFor", "(F)F", "p1", "getTargetValue", "(FF)F", "", "p2", "getValueFromNanos", "(JFF)F", "getDurationNanos", "(FF)J", "getVelocityFromNanos", "getAbsVelocityThreshold", "()F", "Camera2StreamConfigurationMap", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SplineBasedFloatDecayAnimationSpec implements androidx.compose.animation.core.FloatDecayAnimationSpec {
    private final float Camera2StreamConfigurationMap;

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float getAbsVelocityThreshold() {
        return 0.0f;
    }

    public SplineBasedFloatDecayAnimationSpec(androidx.compose.ui.unit.Density density) {
        this.Camera2StreamConfigurationMap = density.getGetHighResolutionOutputSizeshNQ4ISI() * 386.0878f * 160.0f * 0.84f;
    }

    private final double getHighSpeedVideoFpsRanges(float p0) {
        float f;
        androidx.compose.foundation.layout.AndroidFlingSpline androidFlingSpline = androidx.compose.foundation.layout.AndroidFlingSpline.INSTANCE;
        f = androidx.compose.foundation.layout.WindowInsetsConnection_androidKt.Camera2StreamConfigurationMap;
        return androidx.compose.foundation.layout.AndroidFlingSpline.getHighSpeedVideoFpsRanges(p0, f * this.Camera2StreamConfigurationMap);
    }

    public final float getHighSpeedVideoFpsRangesFor(float p0) {
        float f;
        double d;
        double d2;
        double highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(p0);
        f = androidx.compose.foundation.layout.WindowInsetsConnection_androidKt.Camera2StreamConfigurationMap;
        double d3 = f * this.Camera2StreamConfigurationMap;
        d = androidx.compose.foundation.layout.WindowInsetsConnection_androidKt.getHighResolutionOutputSizeshNQ4ISI;
        d2 = androidx.compose.foundation.layout.WindowInsetsConnection_androidKt.getHighSpeedVideoFpsRangesFor;
        return ((float) (d3 * java.lang.Math.exp((d / d2) * highSpeedVideoFpsRanges))) * java.lang.Math.signum(p0);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float getTargetValue(float p0, float p1) {
        return p0 + getHighSpeedVideoFpsRangesFor(p1);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float getValueFromNanos(long p0, float p1, float p2) {
        long durationNanos = getDurationNanos(0.0f, p2);
        float f = durationNanos > 0 ? p0 / durationNanos : 1.0f;
        float highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(p2);
        androidx.compose.foundation.layout.AndroidFlingSpline androidFlingSpline = androidx.compose.foundation.layout.AndroidFlingSpline.INSTANCE;
        return p1 + (highSpeedVideoFpsRangesFor * androidx.compose.foundation.layout.AndroidFlingSpline.FlingResult.m1593getDistanceCoefficientimpl(androidx.compose.foundation.layout.AndroidFlingSpline.getHighSpeedVideoSizes(f)));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final long getDurationNanos(float p0, float p1) {
        double d;
        double highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(p1);
        d = androidx.compose.foundation.layout.WindowInsetsConnection_androidKt.getHighSpeedVideoFpsRangesFor;
        return (long) (java.lang.Math.exp(highSpeedVideoFpsRanges / d) * 1.0E9d);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float getVelocityFromNanos(long p0, float p1, float p2) {
        long durationNanos = getDurationNanos(0.0f, p2);
        float f = durationNanos > 0 ? p0 / durationNanos : 1.0f;
        float highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(p2);
        androidx.compose.foundation.layout.AndroidFlingSpline androidFlingSpline = androidx.compose.foundation.layout.AndroidFlingSpline.INSTANCE;
        return ((androidx.compose.foundation.layout.AndroidFlingSpline.FlingResult.m1594getVelocityCoefficientimpl(androidx.compose.foundation.layout.AndroidFlingSpline.getHighSpeedVideoSizes(f)) * highSpeedVideoFpsRangesFor) / durationNanos) * 1.0E9f;
    }
}

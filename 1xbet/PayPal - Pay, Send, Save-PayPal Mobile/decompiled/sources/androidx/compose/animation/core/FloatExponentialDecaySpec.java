package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012"}, d2 = {"Landroidx/compose/animation/core/FloatExponentialDecaySpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "", "frictionMultiplier", "absVelocityThreshold", "<init>", "(FF)V", "", "playTimeNanos", "initialValue", "initialVelocity", "getValueFromNanos", "(JFF)F", "getVelocityFromNanos", "getDurationNanos", "(FF)J", "getTargetValue", "(FF)F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getAbsVelocityThreshold", "()F", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FloatExponentialDecaySpec implements androidx.compose.animation.core.FloatDecayAnimationSpec {
    public static final int $stable = 0;
    private final float absVelocityThreshold;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float getHighSpeedVideoSizes;

    public FloatExponentialDecaySpec(float f, float f2) {
        this.absVelocityThreshold = java.lang.Math.max(1.0E-7f, java.lang.Math.abs(f2));
        this.getHighSpeedVideoSizes = java.lang.Math.max(1.0E-4f, f) * (-4.2f);
    }

    public /* synthetic */ FloatExponentialDecaySpec(float f, float f2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 0.1f : f2);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float getValueFromNanos(long playTimeNanos, float initialValue, float initialVelocity) {
        float f = initialVelocity / this.getHighSpeedVideoSizes;
        return (initialValue - f) + (f * ((float) java.lang.Math.exp((r0 * (playTimeNanos / 1000000)) / 1000.0f)));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float getVelocityFromNanos(long playTimeNanos, float initialValue, float initialVelocity) {
        return initialVelocity * ((float) java.lang.Math.exp(((playTimeNanos / 1000000) / 1000.0f) * this.getHighSpeedVideoSizes));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final long getDurationNanos(float initialValue, float initialVelocity) {
        return ((long) ((((float) java.lang.Math.log(getAbsVelocityThreshold() / java.lang.Math.abs(initialVelocity))) * 1000.0f) / this.getHighSpeedVideoSizes)) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float getTargetValue(float initialValue, float initialVelocity) {
        if (java.lang.Math.abs(initialVelocity) <= getAbsVelocityThreshold()) {
            return initialValue;
        }
        double log = java.lang.Math.log(java.lang.Math.abs(getAbsVelocityThreshold() / initialVelocity));
        float f = this.getHighSpeedVideoSizes;
        double d = f;
        float f2 = initialVelocity / f;
        return (initialValue - f2) + (f2 * ((float) java.lang.Math.exp((d * ((log / d) * 1000.0d)) / 1000.0d)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FloatExponentialDecaySpec() {
        this(r2, r2, 3, null);
        float f = 0.0f;
    }
}

package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0005R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0005R*\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/SpringSimulation;", "", "", "finalPosition", "<init>", "(F)V", "lastDisplacement", "lastVelocity", "getAcceleration", "(FF)F", "", "timeElapsed", "Landroidx/compose/animation/core/Motion;", "updateValues-IJZedt4$animation_core", "(FFJ)J", "updateValues", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getFinalPosition", "()F", "setFinalPosition", "", "getHighSpeedVideoSizes", "D", "getHighSpeedVideoFpsRangesFor", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getStiffness", "setStiffness", "stiffness", "dampingRatio", "getDampingRatio", "setDampingRatio"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SpringSimulation {
    public static final int $stable = 8;
    private float finalPosition;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private double getHighSpeedVideoFpsRangesFor = java.lang.Math.sqrt(50.0d);
    private float dampingRatio = 1.0f;

    public SpringSimulation(float f) {
        this.finalPosition = f;
    }

    public final float getFinalPosition() {
        return this.finalPosition;
    }

    public final void setFinalPosition(float f) {
        this.finalPosition = f;
    }

    public final void setStiffness(float f) {
        if (getStiffness() <= 0.0f) {
            androidx.compose.animation.core.PreconditionsKt.throwIllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.getHighSpeedVideoFpsRangesFor = java.lang.Math.sqrt(f);
    }

    public final float getStiffness() {
        double d = this.getHighSpeedVideoFpsRangesFor;
        return (float) (d * d);
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final void setDampingRatio(float f) {
        if (f < 0.0f) {
            androidx.compose.animation.core.PreconditionsKt.throwIllegalArgumentException("Damping ratio must be non-negative");
        }
        this.dampingRatio = f;
    }

    public final float getAcceleration(float lastDisplacement, float lastVelocity) {
        float f = this.finalPosition;
        double d = this.getHighSpeedVideoFpsRangesFor;
        return (float) (((-(d * d)) * (lastDisplacement - f)) - (((d * 2.0d) * this.dampingRatio) * lastVelocity));
    }

    /* renamed from: updateValues-IJZedt4$animation_core, reason: not valid java name */
    public final long m1216updateValuesIJZedt4$animation_core(float lastDisplacement, float lastVelocity, long timeElapsed) {
        double sin;
        double d;
        float f = lastDisplacement - this.finalPosition;
        double d2 = timeElapsed / 1000.0d;
        float f2 = this.dampingRatio;
        double d3 = f2;
        double d4 = d3 * d3;
        double d5 = this.getHighSpeedVideoFpsRangesFor;
        double d6 = (-f2) * d5;
        if (f2 > 1.0f) {
            double sqrt = d5 * java.lang.Math.sqrt(d4 - 1.0d);
            double d7 = d6 + sqrt;
            double d8 = d6 - sqrt;
            double d9 = f;
            double d10 = ((d8 * d9) - lastVelocity) / (d8 - d7);
            double d11 = d9 - d10;
            double d12 = d8 * d2;
            double d13 = d2 * d7;
            d = (java.lang.Math.exp(d12) * d11) + (java.lang.Math.exp(d13) * d10);
            sin = (d11 * d8 * java.lang.Math.exp(d12)) + (d10 * d7 * java.lang.Math.exp(d13));
        } else if (f2 == 1.0f) {
            double d14 = f;
            double d15 = lastVelocity + (d5 * d14);
            double d16 = (-d5) * d2;
            double d17 = d14 + (d2 * d15);
            d = d17 * java.lang.Math.exp(d16);
            sin = (d17 * java.lang.Math.exp(d16) * (-this.getHighSpeedVideoFpsRangesFor)) + (d15 * java.lang.Math.exp(d16));
        } else {
            double sqrt2 = d5 * java.lang.Math.sqrt(1.0d - d4);
            double d18 = f;
            double d19 = (1.0d / sqrt2) * (((-d6) * d18) + lastVelocity);
            double d20 = sqrt2 * d2;
            double d21 = d2 * d6;
            double exp = java.lang.Math.exp(d21) * ((java.lang.Math.cos(d20) * d18) + (java.lang.Math.sin(d20) * d19));
            sin = (d6 * exp) + ((((-sqrt2) * d18 * java.lang.Math.sin(d20)) + (sqrt2 * d19 * java.lang.Math.cos(d20))) * java.lang.Math.exp(d21));
            d = exp;
        }
        return androidx.compose.animation.core.Motion.m1206constructorimpl((java.lang.Float.floatToRawIntBits((float) sin) & 4294967295L) | (java.lang.Float.floatToRawIntBits((float) (d + this.finalPosition)) << 32));
    }
}

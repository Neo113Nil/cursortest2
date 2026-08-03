package androidx.compose.animation;

/* compiled from: FlingCalculator.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0003H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/compose/animation/FlingCalculator;", "", "friction", "", "density", "Landroidx/compose/ui/unit/Density;", "(FLandroidx/compose/ui/unit/Density;)V", "getDensity", "()Landroidx/compose/ui/unit/Density;", "magicPhysicalCoefficient", "computeDeceleration", "flingDistance", "velocity", "flingDuration", "", "flingInfo", "Landroidx/compose/animation/FlingCalculator$FlingInfo;", "getSplineDeceleration", "", "FlingInfo", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FlingCalculator {
    public static final int $stable = 0;
    private final androidx.compose.ui.unit.Density density;
    private final float friction;
    private final float magicPhysicalCoefficient;

    public FlingCalculator(float f, androidx.compose.ui.unit.Density density) {
        this.friction = f;
        this.density = density;
        this.magicPhysicalCoefficient = computeDeceleration(density);
    }

    public final androidx.compose.ui.unit.Density getDensity() {
        return this.density;
    }

    private final float computeDeceleration(androidx.compose.ui.unit.Density density) {
        float computeDeceleration;
        computeDeceleration = androidx.compose.animation.FlingCalculatorKt.computeDeceleration(0.84f, density.getDensity());
        return computeDeceleration;
    }

    private final double getSplineDeceleration(float velocity) {
        return androidx.compose.animation.AndroidFlingSpline.INSTANCE.deceleration(velocity, this.friction * this.magicPhysicalCoefficient);
    }

    public final long flingDuration(float velocity) {
        float f;
        double splineDeceleration = getSplineDeceleration(velocity);
        f = androidx.compose.animation.FlingCalculatorKt.DecelerationRate;
        return (long) (java.lang.Math.exp(splineDeceleration / (f - 1.0d)) * 1000.0d);
    }

    public final float flingDistance(float velocity) {
        float f;
        float f2;
        double splineDeceleration = getSplineDeceleration(velocity);
        f = androidx.compose.animation.FlingCalculatorKt.DecelerationRate;
        double d = f - 1.0d;
        double d2 = this.friction * this.magicPhysicalCoefficient;
        f2 = androidx.compose.animation.FlingCalculatorKt.DecelerationRate;
        return (float) (d2 * java.lang.Math.exp((f2 / d) * splineDeceleration));
    }

    public final androidx.compose.animation.FlingCalculator.FlingInfo flingInfo(float velocity) {
        float f;
        float f2;
        double splineDeceleration = getSplineDeceleration(velocity);
        f = androidx.compose.animation.FlingCalculatorKt.DecelerationRate;
        double d = f - 1.0d;
        double d2 = this.friction * this.magicPhysicalCoefficient;
        f2 = androidx.compose.animation.FlingCalculatorKt.DecelerationRate;
        return new androidx.compose.animation.FlingCalculator.FlingInfo(velocity, (float) (d2 * java.lang.Math.exp((f2 / d) * splineDeceleration)), (long) (java.lang.Math.exp(splineDeceleration / d) * 1000.0d));
    }

    /* compiled from: FlingCalculator.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0006J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u000e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/FlingCalculator$FlingInfo;", "", "initialVelocity", "", "distance", com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, "", "(FFJ)V", "getDistance", "()F", "getDuration", "()J", "getInitialVelocity", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "position", "time", "toString", "", "velocity", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class FlingInfo {
        public static final int $stable = 0;
        private final float distance;
        private final long duration;
        private final float initialVelocity;

        public static /* synthetic */ androidx.compose.animation.FlingCalculator.FlingInfo copy$default(androidx.compose.animation.FlingCalculator.FlingInfo flingInfo, float f, float f2, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = flingInfo.initialVelocity;
            }
            if ((i & 2) != 0) {
                f2 = flingInfo.distance;
            }
            if ((i & 4) != 0) {
                j = flingInfo.duration;
            }
            return flingInfo.copy(f, f2, j);
        }

        /* renamed from: component1, reason: from getter */
        public final float getInitialVelocity() {
            return this.initialVelocity;
        }

        /* renamed from: component2, reason: from getter */
        public final float getDistance() {
            return this.distance;
        }

        /* renamed from: component3, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        public final androidx.compose.animation.FlingCalculator.FlingInfo copy(float initialVelocity, float distance, long duration) {
            return new androidx.compose.animation.FlingCalculator.FlingInfo(initialVelocity, distance, duration);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.animation.FlingCalculator.FlingInfo)) {
                return false;
            }
            androidx.compose.animation.FlingCalculator.FlingInfo flingInfo = (androidx.compose.animation.FlingCalculator.FlingInfo) other;
            return java.lang.Float.compare(this.initialVelocity, flingInfo.initialVelocity) == 0 && java.lang.Float.compare(this.distance, flingInfo.distance) == 0 && this.duration == flingInfo.duration;
        }

        public int hashCode() {
            return (((java.lang.Float.floatToIntBits(this.initialVelocity) * 31) + java.lang.Float.floatToIntBits(this.distance)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.duration);
        }

        public java.lang.String toString() {
            return "FlingInfo(initialVelocity=" + this.initialVelocity + ", distance=" + this.distance + ", duration=" + this.duration + ')';
        }

        public FlingInfo(float f, float f2, long j) {
            this.initialVelocity = f;
            this.distance = f2;
            this.duration = j;
        }

        public final float getInitialVelocity() {
            return this.initialVelocity;
        }

        public final float getDistance() {
            return this.distance;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final float position(long time) {
            long j = this.duration;
            return this.distance * java.lang.Math.signum(this.initialVelocity) * androidx.compose.animation.AndroidFlingSpline.INSTANCE.flingPosition(j > 0 ? time / j : 1.0f).getDistanceCoefficient();
        }

        public final float velocity(long time) {
            long j = this.duration;
            return (((androidx.compose.animation.AndroidFlingSpline.INSTANCE.flingPosition(j > 0 ? time / j : 1.0f).getVelocityCoefficient() * java.lang.Math.signum(this.initialVelocity)) * this.distance) / this.duration) * 1000.0f;
        }
    }
}

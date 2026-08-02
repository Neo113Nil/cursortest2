package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017"}, d2 = {"Landroidx/compose/animation/FlingCalculator;", "", "", "friction", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(FLandroidx/compose/ui/unit/Density;)V", "p0", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/unit/Density;)F", "", "getHighSpeedVideoFpsRangesFor", "(F)D", "velocity", "", "flingDuration", "(F)J", "flingDistance", "(F)F", "Landroidx/compose/animation/FlingCalculator$FlingInfo;", "flingInfo", "(F)Landroidx/compose/animation/FlingCalculator$FlingInfo;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Camera2StreamConfigurationMap", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "FlingInfo"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FlingCalculator {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getHighSpeedVideoSizes;
    private final androidx.compose.ui.unit.Density density;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final float Camera2StreamConfigurationMap;

    public FlingCalculator(float f, androidx.compose.ui.unit.Density density) {
        this.Camera2StreamConfigurationMap = f;
        this.density = density;
        this.getHighSpeedVideoSizes = getHighSpeedVideoSizes(density);
    }

    public final androidx.compose.ui.unit.Density getDensity() {
        return this.density;
    }

    private static float getHighSpeedVideoSizes(androidx.compose.ui.unit.Density p0) {
        float highSpeedVideoFpsRangesFor;
        highSpeedVideoFpsRangesFor = androidx.compose.animation.FlingCalculatorKt.getHighSpeedVideoFpsRangesFor(0.84f, p0.getGetHighResolutionOutputSizeshNQ4ISI());
        return highSpeedVideoFpsRangesFor;
    }

    private final double getHighSpeedVideoFpsRangesFor(float p0) {
        return androidx.compose.animation.AndroidFlingSpline.INSTANCE.deceleration(p0, this.Camera2StreamConfigurationMap * this.getHighSpeedVideoSizes);
    }

    public final long flingDuration(float velocity) {
        float f;
        double highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(velocity);
        f = androidx.compose.animation.FlingCalculatorKt.getHighSpeedVideoFpsRangesFor;
        return (long) (java.lang.Math.exp(highSpeedVideoFpsRangesFor / (f - 1.0d)) * 1000.0d);
    }

    public final float flingDistance(float velocity) {
        float f;
        float f2;
        double highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(velocity);
        f = androidx.compose.animation.FlingCalculatorKt.getHighSpeedVideoFpsRangesFor;
        double d = f;
        double d2 = this.Camera2StreamConfigurationMap * this.getHighSpeedVideoSizes;
        f2 = androidx.compose.animation.FlingCalculatorKt.getHighSpeedVideoFpsRangesFor;
        return (float) (d2 * java.lang.Math.exp((f2 / (d - 1.0d)) * highSpeedVideoFpsRangesFor));
    }

    public final androidx.compose.animation.FlingCalculator.FlingInfo flingInfo(float velocity) {
        float f;
        float f2;
        double highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(velocity);
        f = androidx.compose.animation.FlingCalculatorKt.getHighSpeedVideoFpsRangesFor;
        double d = f - 1.0d;
        double d2 = this.Camera2StreamConfigurationMap * this.getHighSpeedVideoSizes;
        f2 = androidx.compose.animation.FlingCalculatorKt.getHighSpeedVideoFpsRangesFor;
        return new androidx.compose.animation.FlingCalculator.FlingInfo(velocity, (float) (d2 * java.lang.Math.exp((f2 / d) * highSpeedVideoFpsRangesFor)), (long) (java.lang.Math.exp(highSpeedVideoFpsRangesFor / d) * 1000.0d));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Landroidx/compose/animation/FlingCalculator$FlingInfo;", "", "", "initialVelocity", "distance", "", "duration", "<init>", "(FFJ)V", "time", com.daon.sdk.face.license.License.FEATURE_POSITION, "(J)F", "velocity", "component1", "()F", "component2", "component3", "()J", "copy", "(FFJ)Landroidx/compose/animation/FlingCalculator$FlingInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getInitialVelocity", "getDistance", "J", "getDuration"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FlingInfo {
        public static final int $stable = 0;
        private final float distance;
        private final long duration;
        private final float initialVelocity;

        public FlingInfo(float f, float f2, long j) {
            this.initialVelocity = f;
            this.distance = f2;
            this.duration = j;
        }

        public final float getDistance() {
            return this.distance;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final float getInitialVelocity() {
            return this.initialVelocity;
        }

        public final float position(long time) {
            long j = this.duration;
            return this.distance * java.lang.Math.signum(this.initialVelocity) * androidx.compose.animation.AndroidFlingSpline.INSTANCE.flingPosition(j > 0 ? time / j : 1.0f).getDistanceCoefficient();
        }

        public final float velocity(long time) {
            long j = this.duration;
            return (((androidx.compose.animation.AndroidFlingSpline.INSTANCE.flingPosition(j > 0 ? time / j : 1.0f).getVelocityCoefficient() * java.lang.Math.signum(this.initialVelocity)) * this.distance) / this.duration) * 1000.0f;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FlingInfo(initialVelocity=");
            sb.append(this.initialVelocity);
            sb.append(", distance=");
            sb.append(this.distance);
            sb.append(", duration=");
            sb.append(this.duration);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((java.lang.Float.hashCode(this.initialVelocity) * 31) + java.lang.Float.hashCode(this.distance)) * 31) + java.lang.Long.hashCode(this.duration);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.animation.FlingCalculator.FlingInfo)) {
                return false;
            }
            androidx.compose.animation.FlingCalculator.FlingInfo flingInfo = (androidx.compose.animation.FlingCalculator.FlingInfo) other;
            return java.lang.Float.compare(this.initialVelocity, flingInfo.initialVelocity) == 0 && java.lang.Float.compare(this.distance, flingInfo.distance) == 0 && this.duration == flingInfo.duration;
        }

        public final androidx.compose.animation.FlingCalculator.FlingInfo copy(float initialVelocity, float distance, long duration) {
            return new androidx.compose.animation.FlingCalculator.FlingInfo(initialVelocity, distance, duration);
        }

        /* renamed from: component3, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        /* renamed from: component2, reason: from getter */
        public final float getDistance() {
            return this.distance;
        }

        /* renamed from: component1, reason: from getter */
        public final float getInitialVelocity() {
            return this.initialVelocity;
        }

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
    }
}

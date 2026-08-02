package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"Landroidx/compose/animation/AndroidFlingSpline;", "", "<init>", "()V", "", "time", "Landroidx/compose/animation/AndroidFlingSpline$FlingResult;", "flingPosition", "(F)Landroidx/compose/animation/AndroidFlingSpline$FlingResult;", "velocity", "friction", "", "deceleration", "(FF)D", "", "getHighSpeedVideoSizes", "[F", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "FlingResult"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidFlingSpline {
    public static final int $stable;
    public static final androidx.compose.animation.AndroidFlingSpline INSTANCE = new androidx.compose.animation.AndroidFlingSpline();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final float[] getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final float[] getHighSpeedVideoFpsRanges;

    private AndroidFlingSpline() {
    }

    static {
        float[] fArr = new float[101];
        getHighSpeedVideoFpsRanges = fArr;
        float[] fArr2 = new float[101];
        getHighResolutionOutputSizeshNQ4ISI = fArr2;
        androidx.compose.animation.SplineBasedDecayKt.Camera2StreamConfigurationMap(fArr, fArr2, 100);
        $stable = 8;
    }

    public final androidx.compose.animation.AndroidFlingSpline.FlingResult flingPosition(float time) {
        float f = 0.0f;
        float f2 = 1.0f;
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(time, 0.0f, 1.0f);
        int i = (int) (coerceIn * 100.0f);
        if (i < 100) {
            float f3 = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = getHighSpeedVideoFpsRanges;
            float f4 = fArr[i];
            float f5 = (fArr[i2] - f4) / ((i2 / 100.0f) - f3);
            float f6 = ((coerceIn - f3) * f5) + f4;
            f = f5;
            f2 = f6;
        }
        return new androidx.compose.animation.AndroidFlingSpline.FlingResult(f2, f);
    }

    public final double deceleration(float velocity, float friction) {
        return java.lang.Math.log((java.lang.Math.abs(velocity) * 0.35f) / friction);
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Landroidx/compose/animation/AndroidFlingSpline$FlingResult;", "", "", "distanceCoefficient", "velocityCoefficient", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/animation/AndroidFlingSpline$FlingResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getDistanceCoefficient", "getVelocityCoefficient"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FlingResult {
        public static final int $stable = 0;
        private final float distanceCoefficient;
        private final float velocityCoefficient;

        public FlingResult(float f, float f2) {
            this.distanceCoefficient = f;
            this.velocityCoefficient = f2;
        }

        public final float getDistanceCoefficient() {
            return this.distanceCoefficient;
        }

        public final float getVelocityCoefficient() {
            return this.velocityCoefficient;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FlingResult(distanceCoefficient=");
            sb.append(this.distanceCoefficient);
            sb.append(", velocityCoefficient=");
            sb.append(this.velocityCoefficient);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Float.hashCode(this.distanceCoefficient) * 31) + java.lang.Float.hashCode(this.velocityCoefficient);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.animation.AndroidFlingSpline.FlingResult)) {
                return false;
            }
            androidx.compose.animation.AndroidFlingSpline.FlingResult flingResult = (androidx.compose.animation.AndroidFlingSpline.FlingResult) other;
            return java.lang.Float.compare(this.distanceCoefficient, flingResult.distanceCoefficient) == 0 && java.lang.Float.compare(this.velocityCoefficient, flingResult.velocityCoefficient) == 0;
        }

        public final androidx.compose.animation.AndroidFlingSpline.FlingResult copy(float distanceCoefficient, float velocityCoefficient) {
            return new androidx.compose.animation.AndroidFlingSpline.FlingResult(distanceCoefficient, velocityCoefficient);
        }

        /* renamed from: component2, reason: from getter */
        public final float getVelocityCoefficient() {
            return this.velocityCoefficient;
        }

        /* renamed from: component1, reason: from getter */
        public final float getDistanceCoefficient() {
            return this.distanceCoefficient;
        }

        public static /* synthetic */ androidx.compose.animation.AndroidFlingSpline.FlingResult copy$default(androidx.compose.animation.AndroidFlingSpline.FlingResult flingResult, float f, float f2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = flingResult.distanceCoefficient;
            }
            if ((i & 2) != 0) {
                f2 = flingResult.velocityCoefficient;
            }
            return flingResult.copy(f, f2);
        }
    }
}

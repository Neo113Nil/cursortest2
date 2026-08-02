package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f"}, d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline;", "", "<init>", "()V", "", "p0", "Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "getHighSpeedVideoSizes", "(F)J", "p1", "", "getHighSpeedVideoFpsRanges", "(FF)D", "", "getHighResolutionOutputSizeshNQ4ISI", "[F", "getHighSpeedVideoFpsRangesFor", "FlingResult"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AndroidFlingSpline {
    public static final androidx.compose.foundation.layout.AndroidFlingSpline INSTANCE = new androidx.compose.foundation.layout.AndroidFlingSpline();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final float[] getHighSpeedVideoSizes = new float[101];
    private static final float[] getHighSpeedVideoFpsRangesFor = new float[101];

    private AndroidFlingSpline() {
    }

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9 = 0.0f;
        int i = 0;
        float f10 = 0.0f;
        while (true) {
            float f11 = 1.0f;
            if (i < 100) {
                float f12 = i / 100.0f;
                float f13 = 1.0f;
                while (true) {
                    f = ((f13 - f9) / 2.0f) + f9;
                    f2 = 1.0f - f;
                    f3 = f * 3.0f * f2;
                    f4 = f * f * f;
                    float f14 = (((f2 * 0.175f) + (f * 0.35000002f)) * f3) + f4;
                    if (java.lang.Math.abs(f14 - f12) < 1.0E-5d) {
                        break;
                    } else if (f14 > f12) {
                        f13 = f;
                    } else {
                        f9 = f;
                    }
                }
                getHighSpeedVideoSizes[i] = (f3 * ((f2 * 0.5f) + f)) + f4;
                float f15 = 1.0f;
                while (true) {
                    f5 = ((f15 - f10) / 2.0f) + f10;
                    f6 = f11 - f5;
                    f7 = f5 * 3.0f * f6;
                    f8 = f5 * f5 * f5;
                    float f16 = (((f6 * 0.5f) + f5) * f7) + f8;
                    float f17 = f15;
                    if (java.lang.Math.abs(f16 - f12) >= 1.0E-5d) {
                        if (f16 > f12) {
                            f15 = f5;
                        } else {
                            f10 = f5;
                            f15 = f17;
                        }
                        f11 = 1.0f;
                    }
                }
                getHighSpeedVideoFpsRangesFor[i] = (f7 * ((f6 * 0.175f) + (f5 * 0.35000002f))) + f8;
                i++;
            } else {
                getHighSpeedVideoFpsRangesFor[100] = 1.0f;
                getHighSpeedVideoSizes[100] = 1.0f;
                return;
            }
        }
    }

    public static long getHighSpeedVideoSizes(float p0) {
        float f;
        float f2;
        int i = (int) (p0 * 100.0f);
        if (i < 100) {
            float f3 = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = getHighSpeedVideoSizes;
            float f4 = fArr[i];
            f2 = (fArr[i2] - f4) / ((i2 / 100.0f) - f3);
            f = f4 + ((p0 - f3) * f2);
        } else {
            f = 1.0f;
            f2 = 0.0f;
        }
        return androidx.compose.foundation.layout.AndroidFlingSpline.FlingResult.m1590constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L));
    }

    public static double getHighSpeedVideoFpsRanges(float p0, float p1) {
        return java.lang.Math.log((java.lang.Math.abs(p0) * 0.35f) / p1);
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "", "", "packedValue", "constructor-impl", "(J)J", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(J)I", "hashCode", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "getHighResolutionOutputSizeshNQ4ISI", "J", "Camera2StreamConfigurationMap", "", "getDistanceCoefficient-impl", "(J)F", "distanceCoefficient", "getVelocityCoefficient-impl", "velocityCoefficient"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class FlingResult {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final long Camera2StreamConfigurationMap;

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m1590constructorimpl(long j) {
            return j;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1592equalsimpl0(long j, long j2) {
            return j == j2;
        }

        private /* synthetic */ FlingResult(long j) {
            this.Camera2StreamConfigurationMap = j;
        }

        /* renamed from: getDistanceCoefficient-impl, reason: not valid java name */
        public static final float m1593getDistanceCoefficientimpl(long j) {
            return java.lang.Float.intBitsToFloat((int) (j >> 32));
        }

        /* renamed from: getVelocityCoefficient-impl, reason: not valid java name */
        public static final float m1594getVelocityCoefficientimpl(long j) {
            return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ long getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        public final java.lang.String toString() {
            return m1596toStringimpl(this.Camera2StreamConfigurationMap);
        }

        public final int hashCode() {
            return m1595hashCodeimpl(this.Camera2StreamConfigurationMap);
        }

        public final boolean equals(java.lang.Object obj) {
            return m1591equalsimpl(this.Camera2StreamConfigurationMap, obj);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m1596toStringimpl(long j) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FlingResult(packedValue=");
            sb.append(j);
            sb.append(')');
            return sb.toString();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1595hashCodeimpl(long j) {
            return java.lang.Long.hashCode(j);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1591equalsimpl(long j, java.lang.Object obj) {
            return (obj instanceof androidx.compose.foundation.layout.AndroidFlingSpline.FlingResult) && j == ((androidx.compose.foundation.layout.AndroidFlingSpline.FlingResult) obj).getCamera2StreamConfigurationMap();
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.compose.foundation.layout.AndroidFlingSpline.FlingResult m1589boximpl(long j) {
            return new androidx.compose.foundation.layout.AndroidFlingSpline.FlingResult(j);
        }
    }
}

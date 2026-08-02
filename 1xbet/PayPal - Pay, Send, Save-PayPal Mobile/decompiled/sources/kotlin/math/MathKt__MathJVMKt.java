package kotlin.math;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u0003\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0007\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0011¢\u0006\u0004\b\u0007\u0010\u0012\u001a\u0015\u0010\t\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u0011¢\u0006\u0004\b\t\u0010\u0013\u001a\u0015\u0010\n\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u0011¢\u0006\u0004\b\n\u0010\u0013\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\u0011¢\u0006\u0004\b\f\u0010\u0014\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0015\"\u001b\u0010\u001a\u001a\u00020\u000b*\u00020\u000b8G¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\"\u001b\u0010\u001a\u001a\u00020\u000b*\u00020\u000e8G¢\u0006\f\u0012\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u0016\u0010\u001b"}, d2 = {"", "x", "asinh", "(D)D", "acosh", "atanh", "base", "log", "(DD)D", "log2", "truncate", "", "roundToInt", "(D)I", "", "roundToLong", "(D)J", "", "(FF)F", "(F)F", "(F)I", "(F)J", "getSign", "(I)I", "getSign$annotations", "(I)V", "sign", "(J)I", "(J)V"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/math/MathKt")
/* loaded from: classes3.dex */
public class MathKt__MathJVMKt extends kotlin.math.MathKt__MathHKt {
    public static /* synthetic */ void getAbsoluteValue$annotations(double d) {
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(float f) {
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(int i) {
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(long j) {
    }

    public static /* synthetic */ void getSign$annotations(double d) {
    }

    public static /* synthetic */ void getSign$annotations(float f) {
    }

    public static /* synthetic */ void getSign$annotations(int i) {
    }

    public static /* synthetic */ void getSign$annotations(long j) {
    }

    public static /* synthetic */ void getUlp$annotations(double d) {
    }

    public static /* synthetic */ void getUlp$annotations(float f) {
    }

    public static final double asinh(double d) {
        if (d < kotlin.math.Constants.getHighSpeedVideoFpsRangesFor) {
            return d <= (-kotlin.math.Constants.getHighSpeedVideoFpsRangesFor) ? -kotlin.math.MathKt.asinh(-d) : java.lang.Math.abs(d) >= kotlin.math.Constants.getHighSpeedVideoSizes ? d - (((d * d) * d) / 6.0d) : d;
        }
        if (d <= kotlin.math.Constants.getInputFormats) {
            return java.lang.Math.log(d + java.lang.Math.sqrt((d * d) + 1.0d));
        }
        if (d > kotlin.math.Constants.getHighSpeedVideoFpsRanges) {
            return java.lang.Math.log(d) + kotlin.math.Constants.Camera2StreamConfigurationMap;
        }
        double d2 = d * 2.0d;
        return java.lang.Math.log(d2 + (1.0d / d2));
    }

    public static final double acosh(double d) {
        if (d < 1.0d) {
            return Double.NaN;
        }
        if (d > kotlin.math.Constants.getHighSpeedVideoFpsRanges) {
            return java.lang.Math.log(d) + kotlin.math.Constants.Camera2StreamConfigurationMap;
        }
        double d2 = d - 1.0d;
        if (d2 >= kotlin.math.Constants.getHighSpeedVideoFpsRangesFor) {
            return java.lang.Math.log(d + java.lang.Math.sqrt((d * d) - 1.0d));
        }
        double sqrt = java.lang.Math.sqrt(d2);
        if (sqrt >= kotlin.math.Constants.getHighSpeedVideoSizes) {
            sqrt -= ((sqrt * sqrt) * sqrt) / 12.0d;
        }
        return java.lang.Math.sqrt(2.0d) * sqrt;
    }

    public static final double atanh(double d) {
        if (java.lang.Math.abs(d) < kotlin.math.Constants.getHighSpeedVideoFpsRangesFor) {
            return java.lang.Math.abs(d) > kotlin.math.Constants.getHighSpeedVideoSizes ? d + (((d * d) * d) / 3.0d) : d;
        }
        return java.lang.Math.log((d + 1.0d) / (1.0d - d)) / 2.0d;
    }

    public static final double log(double d, double d2) {
        if (d2 <= 0.0d || d2 == 1.0d) {
            return Double.NaN;
        }
        return java.lang.Math.log(d) / java.lang.Math.log(d2);
    }

    public static final double log2(double d) {
        return java.lang.Math.log(d) / kotlin.math.Constants.Camera2StreamConfigurationMap;
    }

    public static final double truncate(double d) {
        if (java.lang.Double.isNaN(d) || java.lang.Double.isInfinite(d)) {
            return d;
        }
        if (d > 0.0d) {
            return java.lang.Math.floor(d);
        }
        return java.lang.Math.ceil(d);
    }

    public static final int roundToInt(double d) {
        if (java.lang.Double.isNaN(d)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) java.lang.Math.round(d);
    }

    public static final long roundToLong(double d) {
        if (java.lang.Double.isNaN(d)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        return java.lang.Math.round(d);
    }

    public static final float log(float f, float f2) {
        if (f2 <= 0.0f || f2 == 1.0f) {
            return Float.NaN;
        }
        return (float) (java.lang.Math.log(f) / java.lang.Math.log(f2));
    }

    public static final float log2(float f) {
        return (float) (java.lang.Math.log(f) / kotlin.math.Constants.Camera2StreamConfigurationMap);
    }

    public static final float truncate(float f) {
        double ceil;
        if (java.lang.Float.isNaN(f) || java.lang.Float.isInfinite(f)) {
            return f;
        }
        if (f > 0.0f) {
            ceil = java.lang.Math.floor(f);
        } else {
            ceil = java.lang.Math.ceil(f);
        }
        return (float) ceil;
    }

    public static final int roundToInt(float f) {
        if (java.lang.Float.isNaN(f)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        return java.lang.Math.round(f);
    }

    public static final long roundToLong(float f) {
        return kotlin.math.MathKt.roundToLong(f);
    }

    public static final int getSign(int i) {
        return java.lang.Integer.signum(i);
    }

    public static final int getSign(long j) {
        return java.lang.Long.signum(j);
    }
}

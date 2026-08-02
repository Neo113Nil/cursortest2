package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0012\u001a5\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\n\u001a=\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000e\u001a7\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a/\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a7\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001aG\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"", "stiffness", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "", "estimateAnimationDurationMillis", "(FFFFF)J", "", "(DDDDD)J", "springConstant", "dampingCoefficient", "mass", "(DDDDDD)J", "p0", "p1", "p2", "p3", "p4", "getHighSpeedVideoFpsRangesFor", "(DDDDD)D", "getHighSpeedVideoSizes", "(DDDD)D", "p5", "p6", "getHighSpeedVideoFpsRanges", "(DDDDDDD)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SpringEstimationKt {
    public static final long estimateAnimationDurationMillis(float f, float f2, float f3, float f4, float f5) {
        if (f2 == 0.0f) {
            return 9223372036854L;
        }
        return estimateAnimationDurationMillis(f, f2, f3, f4, f5);
    }

    public static final long estimateAnimationDurationMillis(double d, double d2, double d3, double d4, double d5) {
        double sqrt = 2.0d * d2 * java.lang.Math.sqrt(d);
        double d6 = (sqrt * sqrt) - (4.0d * d);
        double sqrt2 = d6 < 0.0d ? 0.0d : java.lang.Math.sqrt(d6);
        double d7 = -sqrt;
        return getHighSpeedVideoFpsRanges((d7 + sqrt2) * 0.5d, (d6 < 0.0d ? java.lang.Math.sqrt(java.lang.Math.abs(d6)) : 0.0d) * 0.5d, (d7 - sqrt2) * 0.5d, d2, d3, d4, d5);
    }

    public static final long estimateAnimationDurationMillis(double d, double d2, double d3, double d4, double d5, double d6) {
        double sqrt = d2 / (java.lang.Math.sqrt(d * d3) * 2.0d);
        double d7 = (d2 * d2) - ((4.0d * d3) * d);
        double d8 = 1.0d / (2.0d * d3);
        double sqrt2 = d7 < 0.0d ? 0.0d : java.lang.Math.sqrt(d7);
        double d9 = -d2;
        return getHighSpeedVideoFpsRanges((d9 + sqrt2) * d8, (d7 < 0.0d ? java.lang.Math.sqrt(java.lang.Math.abs(d7)) : 0.0d) * d8, (d9 - sqrt2) * d8, sqrt, d4, d5, d6);
    }

    private static final double getHighSpeedVideoFpsRangesFor(double d, double d2, double d3, double d4, double d5) {
        double d6 = (d4 - (d * d3)) / d2;
        return java.lang.Math.log(d5 / java.lang.Math.sqrt((d3 * d3) + (d6 * d6))) / d;
    }

    private static final double getHighSpeedVideoSizes(double d, double d2, double d3, double d4) {
        double d5;
        double d6 = d4;
        double d7 = d * d2;
        double d8 = d3 - d7;
        double log = java.lang.Math.log(java.lang.Math.abs(d6 / d2)) / d;
        double log2 = java.lang.Math.log(java.lang.Math.abs(d6 / d8));
        int i = 0;
        double d9 = log2;
        for (int i2 = 0; i2 < 6; i2++) {
            d9 = log2 - java.lang.Math.log(java.lang.Math.abs(d9 / d));
        }
        double d10 = d9 / d;
        if ((java.lang.Double.doubleToRawLongBits(log) & Long.MAX_VALUE) >= 9218868437227405312L) {
            log = d10;
        } else if ((java.lang.Double.doubleToRawLongBits(d10) & Long.MAX_VALUE) < 9218868437227405312L) {
            log = java.lang.Math.max(log, d10);
        }
        double d11 = (-(d7 + d8)) / (d * d8);
        double d12 = d * d11;
        double exp = java.lang.Math.exp(d12);
        double exp2 = java.lang.Math.exp(d12);
        if (!java.lang.Double.isNaN(d11) && d11 > 0.0d) {
            if (d11 <= 0.0d || (-((exp * d2) + (d11 * d8 * exp2))) >= d6) {
                log = (-(2.0d / d)) - (d2 / d8);
                d5 = Double.MAX_VALUE;
                while (d5 > 0.001d && i < 100) {
                    i++;
                    double d13 = d * log;
                    double exp3 = log - ((((d2 + (d8 * log)) * java.lang.Math.exp(d13)) + d6) / ((((1.0d + d13) * d8) + d7) * java.lang.Math.exp(d13)));
                    double abs = java.lang.Math.abs(log - exp3);
                    log = exp3;
                    d5 = abs;
                }
                return log;
            }
            if (d8 < 0.0d && d2 > 0.0d) {
                log = 0.0d;
            }
        }
        d6 = -d6;
        d5 = Double.MAX_VALUE;
        while (d5 > 0.001d) {
            i++;
            double d132 = d * log;
            double exp32 = log - ((((d2 + (d8 * log)) * java.lang.Math.exp(d132)) + d6) / ((((1.0d + d132) * d8) + d7) * java.lang.Math.exp(d132)));
            double abs2 = java.lang.Math.abs(log - exp32);
            log = exp32;
            d5 = abs2;
        }
        return log;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final double getHighSpeedVideoSizes(double d, double d2, double d3, double d4, double d5) {
        double d6;
        double d7;
        double d8;
        double d9 = d5;
        double d10 = d - d2;
        double d11 = ((d * d3) - d4) / d10;
        double d12 = d3 - d11;
        double log = java.lang.Math.log(java.lang.Math.abs(d9 / d12)) / d;
        double log2 = java.lang.Math.log(java.lang.Math.abs(d9 / d11)) / d2;
        if ((java.lang.Double.doubleToRawLongBits(log) & Long.MAX_VALUE) < 9218868437227405312L) {
            if ((java.lang.Double.doubleToRawLongBits(log2) & Long.MAX_VALUE) < 9218868437227405312L) {
                log = java.lang.Math.max(log, log2);
            }
            d6 = log;
        } else {
            d6 = log2;
        }
        double d13 = d12 * d;
        double log3 = java.lang.Math.log(d13 / ((-d11) * d2)) / (d2 - d);
        if (!java.lang.Double.isNaN(log3) && log3 > 0.0d) {
            if (log3 <= 0.0d || (-getHighSpeedVideoFpsRanges(d12, d, log3, d11, d2)) >= d9) {
                d7 = java.lang.Math.log((-((d11 * d2) * d2)) / (d13 * d)) / d10;
                d8 = d11 * d2;
                if (java.lang.Math.abs((java.lang.Math.exp(d * d7) * d13) + (java.lang.Math.exp(d2 * d7) * d8)) >= 1.0E-4d) {
                    return d7;
                }
                double d14 = Double.MAX_VALUE;
                int i = 0;
                while (d14 > 0.001d && i < 100) {
                    i++;
                    double d15 = d * d7;
                    double d16 = d2 * d7;
                    double exp = d7 - ((((java.lang.Math.exp(d15) * d12) + (java.lang.Math.exp(d16) * d11)) + d9) / ((java.lang.Math.exp(d15) * d13) + (java.lang.Math.exp(d16) * d8)));
                    double abs = java.lang.Math.abs(d7 - exp);
                    d7 = exp;
                    d14 = abs;
                }
                return d7;
            }
            if (d11 > 0.0d && d12 < 0.0d) {
                d6 = 0.0d;
            }
        }
        d9 = -d9;
        d7 = d6;
        d8 = d11 * d2;
        if (java.lang.Math.abs((java.lang.Math.exp(d * d7) * d13) + (java.lang.Math.exp(d2 * d7) * d8)) >= 1.0E-4d) {
        }
    }

    private static final double getHighSpeedVideoFpsRanges(double d, double d2, double d3, double d4, double d5) {
        return (d * java.lang.Math.exp(d2 * d3)) + (d4 * java.lang.Math.exp(d5 * d3));
    }

    private static final long getHighSpeedVideoFpsRanges(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        double highSpeedVideoSizes;
        double d8 = d5;
        if (d6 == 0.0d && d8 == 0.0d) {
            return 0L;
        }
        if (d6 < 0.0d) {
            d8 = -d8;
        }
        double abs = java.lang.Math.abs(d6);
        if (d4 > 1.0d) {
            highSpeedVideoSizes = getHighSpeedVideoSizes(d, d3, abs, d8, d7);
        } else if (d4 < 1.0d) {
            highSpeedVideoSizes = getHighSpeedVideoFpsRangesFor(d, d2, abs, d8, d7);
        } else {
            highSpeedVideoSizes = getHighSpeedVideoSizes(d, abs, d8, d7);
        }
        return (long) (highSpeedVideoSizes * 1000.0d);
    }
}

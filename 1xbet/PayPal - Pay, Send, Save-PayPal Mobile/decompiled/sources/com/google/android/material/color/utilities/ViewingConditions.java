package com.google.android.material.color.utilities;

/* loaded from: classes8.dex */
public final class ViewingConditions {
    public static final com.google.android.material.color.utilities.ViewingConditions DEFAULT = defaultWithBackgroundLstar(50.0d);
    private final double aw;
    private final double c;
    private final double fl;
    private final double flRoot;
    private final double n;
    private final double nbb;
    private final double nc;
    private final double ncb;
    private final double[] rgbD;
    private final double z;

    public final double getAw() {
        return this.aw;
    }

    public final double getN() {
        return this.n;
    }

    public final double getNbb() {
        return this.nbb;
    }

    final double getNcb() {
        return this.ncb;
    }

    final double getC() {
        return this.c;
    }

    final double getNc() {
        return this.nc;
    }

    public final double[] getRgbD() {
        return this.rgbD;
    }

    final double getFl() {
        return this.fl;
    }

    public final double getFlRoot() {
        return this.flRoot;
    }

    final double getZ() {
        return this.z;
    }

    public static com.google.android.material.color.utilities.ViewingConditions make(double[] dArr, double d, double d2, double d3, boolean z) {
        double lerp;
        double max = java.lang.Math.max(0.1d, d2);
        double[][] dArr2 = com.google.android.material.color.utilities.Cam16.XYZ_TO_CAM16RGB;
        double d4 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d5 = dArr3[0];
        double d6 = dArr[1];
        double d7 = dArr3[1];
        double d8 = dArr[2];
        double d9 = (d5 * d4) + (d7 * d6) + (dArr3[2] * d8);
        double[] dArr4 = dArr2[1];
        double d10 = (dArr4[0] * d4) + (dArr4[1] * d6) + (dArr4[2] * d8);
        double[] dArr5 = dArr2[2];
        double d11 = (d4 * dArr5[0]) + (d6 * dArr5[1]) + (d8 * dArr5[2]);
        double d12 = (d3 / 10.0d) + 0.8d;
        if (d12 >= 0.9d) {
            lerp = com.google.android.material.color.utilities.MathUtils.lerp(0.59d, 0.69d, (d12 - 0.9d) * 10.0d);
        } else {
            lerp = com.google.android.material.color.utilities.MathUtils.lerp(0.525d, 0.59d, 10.0d * (d12 - 0.8d));
        }
        double d13 = lerp;
        double clampDouble = com.google.android.material.color.utilities.MathUtils.clampDouble(0.0d, 1.0d, z ? 1.0d : (1.0d - (java.lang.Math.exp(((-d) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d12);
        double[] dArr6 = {(((100.0d / d9) * clampDouble) + 1.0d) - clampDouble, (((100.0d / d10) * clampDouble) + 1.0d) - clampDouble, (((100.0d / d11) * clampDouble) + 1.0d) - clampDouble};
        double d14 = 5.0d * d;
        double d15 = 1.0d / (d14 + 1.0d);
        double d16 = d15 * d15 * d15 * d15;
        double d17 = 1.0d - d16;
        double cbrt = (d16 * d) + (0.1d * d17 * d17 * java.lang.Math.cbrt(d14));
        double yFromLstar = com.google.android.material.color.utilities.ColorUtils.yFromLstar(max) / dArr[1];
        double sqrt = java.lang.Math.sqrt(yFromLstar);
        double pow = 0.725d / java.lang.Math.pow(yFromLstar, 0.2d);
        double[] dArr7 = {java.lang.Math.pow(((dArr6[0] * cbrt) * d9) / 100.0d, 0.42d), java.lang.Math.pow(((dArr6[1] * cbrt) * d10) / 100.0d, 0.42d), java.lang.Math.pow(((dArr6[2] * cbrt) * d11) / 100.0d, 0.42d)};
        double d18 = dArr7[0];
        double d19 = (d18 * 400.0d) / (d18 + 27.13d);
        double d20 = dArr7[1];
        double d21 = (d20 * 400.0d) / (d20 + 27.13d);
        double d22 = dArr7[2];
        double[] dArr8 = {d19, d21, (400.0d * d22) / (d22 + 27.13d)};
        return new com.google.android.material.color.utilities.ViewingConditions(yFromLstar, ((dArr8[0] * 2.0d) + dArr8[1] + (dArr8[2] * 0.05d)) * pow, pow, pow, d13, d12, dArr6, cbrt, java.lang.Math.pow(cbrt, 0.25d), sqrt + 1.48d);
    }

    public static com.google.android.material.color.utilities.ViewingConditions defaultWithBackgroundLstar(double d) {
        return make(com.google.android.material.color.utilities.ColorUtils.whitePointD65(), (com.google.android.material.color.utilities.ColorUtils.yFromLstar(50.0d) * 63.66197723675813d) / 100.0d, d, 2.0d, false);
    }

    private ViewingConditions(double d, double d2, double d3, double d4, double d5, double d6, double[] dArr, double d7, double d8, double d9) {
        this.n = d;
        this.aw = d2;
        this.nbb = d3;
        this.ncb = d4;
        this.c = d5;
        this.nc = d6;
        this.rgbD = dArr;
        this.fl = d7;
        this.flRoot = d8;
        this.z = d9;
    }
}

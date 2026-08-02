package com.google.android.material.color.utilities;

/* loaded from: classes8.dex */
public final class Cam16 {
    private final double astar;
    private final double bstar;
    private final double chroma;
    private final double hue;
    private final double j;
    private final double jstar;
    private final double m;
    private final double q;
    private final double s;
    private final double[] tempArray = {0.0d, 0.0d, 0.0d};
    static final double[][] XYZ_TO_CAM16RGB = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};
    static final double[][] CAM16RGB_TO_XYZ = {new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};

    final double distance(com.google.android.material.color.utilities.Cam16 cam16) {
        double jstar = getJstar() - cam16.getJstar();
        double astar = getAstar() - cam16.getAstar();
        double bstar = getBstar() - cam16.getBstar();
        return java.lang.Math.pow(java.lang.Math.sqrt((jstar * jstar) + (astar * astar) + (bstar * bstar)), 0.63d) * 1.41d;
    }

    public final double getHue() {
        return this.hue;
    }

    public final double getChroma() {
        return this.chroma;
    }

    public final double getJ() {
        return this.j;
    }

    public final double getQ() {
        return this.q;
    }

    public final double getM() {
        return this.m;
    }

    public final double getS() {
        return this.s;
    }

    public final double getJstar() {
        return this.jstar;
    }

    public final double getAstar() {
        return this.astar;
    }

    public final double getBstar() {
        return this.bstar;
    }

    private Cam16(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.hue = d;
        this.chroma = d2;
        this.j = d3;
        this.q = d4;
        this.m = d5;
        this.s = d6;
        this.jstar = d7;
        this.astar = d8;
        this.bstar = d9;
    }

    public static com.google.android.material.color.utilities.Cam16 fromInt(int i) {
        return fromIntInViewingConditions(i, com.google.android.material.color.utilities.ViewingConditions.DEFAULT);
    }

    static com.google.android.material.color.utilities.Cam16 fromIntInViewingConditions(int i, com.google.android.material.color.utilities.ViewingConditions viewingConditions) {
        double linearized = com.google.android.material.color.utilities.ColorUtils.linearized((16711680 & i) >> 16);
        double linearized2 = com.google.android.material.color.utilities.ColorUtils.linearized((65280 & i) >> 8);
        double linearized3 = com.google.android.material.color.utilities.ColorUtils.linearized(i & 255);
        return fromXyzInViewingConditions((0.41233895d * linearized) + (0.35762064d * linearized2) + (0.18051042d * linearized3), (0.2126d * linearized) + (0.7152d * linearized2) + (0.0722d * linearized3), (linearized * 0.01932141d) + (linearized2 * 0.11916382d) + (linearized3 * 0.95034478d), viewingConditions);
    }

    static com.google.android.material.color.utilities.Cam16 fromXyzInViewingConditions(double d, double d2, double d3, com.google.android.material.color.utilities.ViewingConditions viewingConditions) {
        double[][] dArr = XYZ_TO_CAM16RGB;
        double[] dArr2 = dArr[0];
        double d4 = dArr2[0];
        double d5 = dArr2[1];
        double d6 = dArr2[2];
        double[] dArr3 = dArr[1];
        double d7 = dArr3[0];
        double d8 = dArr3[1];
        double d9 = dArr3[2];
        double[] dArr4 = dArr[2];
        double d10 = dArr4[0];
        double d11 = dArr4[1];
        double d12 = dArr4[2];
        double d13 = viewingConditions.getRgbD()[0] * ((d4 * d) + (d5 * d2) + (d6 * d3));
        double d14 = viewingConditions.getRgbD()[1] * ((d7 * d) + (d8 * d2) + (d9 * d3));
        double d15 = viewingConditions.getRgbD()[2] * ((d10 * d) + (d11 * d2) + (d12 * d3));
        double pow = java.lang.Math.pow((viewingConditions.getFl() * java.lang.Math.abs(d13)) / 100.0d, 0.42d);
        double pow2 = java.lang.Math.pow((viewingConditions.getFl() * java.lang.Math.abs(d14)) / 100.0d, 0.42d);
        double pow3 = java.lang.Math.pow((viewingConditions.getFl() * java.lang.Math.abs(d15)) / 100.0d, 0.42d);
        double signum = ((java.lang.Math.signum(d13) * 400.0d) * pow) / (pow + 27.13d);
        double signum2 = ((java.lang.Math.signum(d14) * 400.0d) * pow2) / (pow2 + 27.13d);
        double signum3 = ((java.lang.Math.signum(d15) * 400.0d) * pow3) / (pow3 + 27.13d);
        double d16 = (((signum * 11.0d) + ((-12.0d) * signum2)) + signum3) / 11.0d;
        double d17 = ((signum + signum2) - (signum3 * 2.0d)) / 9.0d;
        double d18 = signum2 * 20.0d;
        double d19 = (((signum * 20.0d) + d18) + (21.0d * signum3)) / 20.0d;
        double d20 = (((signum * 40.0d) + d18) + signum3) / 20.0d;
        double degrees = java.lang.Math.toDegrees(java.lang.Math.atan2(d17, d16));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d21 = degrees;
        double radians = java.lang.Math.toRadians(d21);
        double pow4 = java.lang.Math.pow((d20 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ()) * 100.0d;
        double c = 4.0d / viewingConditions.getC();
        double d22 = pow4 / 100.0d;
        double sqrt = java.lang.Math.sqrt(d22);
        double aw = viewingConditions.getAw();
        double flRoot = viewingConditions.getFlRoot();
        double pow5 = java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, viewingConditions.getN()), 0.73d) * java.lang.Math.pow(((((((java.lang.Math.cos(java.lang.Math.toRadians(d21 < 20.14d ? d21 + 360.0d : d21) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * viewingConditions.getNc()) * viewingConditions.getNcb()) * java.lang.Math.hypot(d16, d17)) / (d19 + 0.305d), 0.9d);
        double sqrt2 = java.lang.Math.sqrt(d22) * pow5;
        double flRoot2 = sqrt2 * viewingConditions.getFlRoot();
        double sqrt3 = java.lang.Math.sqrt((pow5 * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0d));
        double d23 = (1.7000000000000002d * pow4) / ((0.007d * pow4) + 1.0d);
        double log1p = java.lang.Math.log1p(flRoot2 * 0.0228d) * 43.859649122807014d;
        return new com.google.android.material.color.utilities.Cam16(d21, sqrt2, pow4, flRoot * c * sqrt * (aw + 4.0d), flRoot2, sqrt3 * 50.0d, d23, log1p * java.lang.Math.cos(radians), log1p * java.lang.Math.sin(radians));
    }

    static com.google.android.material.color.utilities.Cam16 fromJch(double d, double d2, double d3) {
        return fromJchInViewingConditions(d, d2, d3, com.google.android.material.color.utilities.ViewingConditions.DEFAULT);
    }

    private static com.google.android.material.color.utilities.Cam16 fromJchInViewingConditions(double d, double d2, double d3, com.google.android.material.color.utilities.ViewingConditions viewingConditions) {
        double c = 4.0d / viewingConditions.getC();
        double d4 = d / 100.0d;
        double sqrt = java.lang.Math.sqrt(d4);
        double aw = viewingConditions.getAw();
        double flRoot = viewingConditions.getFlRoot();
        double flRoot2 = d2 * viewingConditions.getFlRoot();
        double sqrt2 = java.lang.Math.sqrt(((d2 / java.lang.Math.sqrt(d4)) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0d));
        double radians = java.lang.Math.toRadians(d3);
        double d5 = (1.7000000000000002d * d) / ((0.007d * d) + 1.0d);
        double log1p = java.lang.Math.log1p(flRoot2 * 0.0228d) * 43.859649122807014d;
        return new com.google.android.material.color.utilities.Cam16(d3, d2, d, c * sqrt * (aw + 4.0d) * flRoot, flRoot2, 50.0d * sqrt2, d5, log1p * java.lang.Math.cos(radians), log1p * java.lang.Math.sin(radians));
    }

    public static com.google.android.material.color.utilities.Cam16 fromUcs(double d, double d2, double d3) {
        return fromUcsInViewingConditions(d, d2, d3, com.google.android.material.color.utilities.ViewingConditions.DEFAULT);
    }

    public static com.google.android.material.color.utilities.Cam16 fromUcsInViewingConditions(double d, double d2, double d3, com.google.android.material.color.utilities.ViewingConditions viewingConditions) {
        double expm1 = (java.lang.Math.expm1(java.lang.Math.hypot(d2, d3) * 0.0228d) / 0.0228d) / viewingConditions.getFlRoot();
        double atan2 = java.lang.Math.atan2(d3, d2) * 57.29577951308232d;
        if (atan2 < 0.0d) {
            atan2 += 360.0d;
        }
        return fromJchInViewingConditions(d / (1.0d - ((d - 100.0d) * 0.007d)), expm1, atan2, viewingConditions);
    }

    public final int toInt() {
        return viewed(com.google.android.material.color.utilities.ViewingConditions.DEFAULT);
    }

    final int viewed(com.google.android.material.color.utilities.ViewingConditions viewingConditions) {
        double[] xyzInViewingConditions = xyzInViewingConditions(viewingConditions, this.tempArray);
        return com.google.android.material.color.utilities.ColorUtils.argbFromXyz(xyzInViewingConditions[0], xyzInViewingConditions[1], xyzInViewingConditions[2]);
    }

    final double[] xyzInViewingConditions(com.google.android.material.color.utilities.ViewingConditions viewingConditions, double[] dArr) {
        double pow = java.lang.Math.pow(((getChroma() == 0.0d || getJ() == 0.0d) ? 0.0d : getChroma() / java.lang.Math.sqrt(getJ() / 100.0d)) / java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double radians = java.lang.Math.toRadians(getHue());
        double cos = java.lang.Math.cos(2.0d + radians);
        double aw = viewingConditions.getAw();
        double pow2 = java.lang.Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.getC()) / viewingConditions.getZ());
        double nc = viewingConditions.getNc();
        double ncb = viewingConditions.getNcb();
        double nbb = (aw * pow2) / viewingConditions.getNbb();
        double sin = java.lang.Math.sin(radians);
        double cos2 = java.lang.Math.cos(radians);
        double d = (((nbb + 0.305d) * 23.0d) * pow) / ((((((((cos + 3.8d) * 0.25d) * 3846.153846153846d) * nc) * ncb) * 23.0d) + ((11.0d * pow) * cos2)) + ((pow * 108.0d) * sin));
        double d2 = cos2 * d;
        double d3 = d * sin;
        double d4 = nbb * 460.0d;
        double d5 = (((451.0d * d2) + d4) + (288.0d * d3)) / 1403.0d;
        double d6 = ((d4 - (891.0d * d2)) - (261.0d * d3)) / 1403.0d;
        double d7 = ((d4 - (d2 * 220.0d)) - (d3 * 6300.0d)) / 1403.0d;
        double max = java.lang.Math.max(0.0d, (java.lang.Math.abs(d5) * 27.13d) / (400.0d - java.lang.Math.abs(d5)));
        double signum = java.lang.Math.signum(d5);
        double fl = 100.0d / viewingConditions.getFl();
        double pow3 = java.lang.Math.pow(max, 2.380952380952381d);
        double max2 = java.lang.Math.max(0.0d, (java.lang.Math.abs(d6) * 27.13d) / (400.0d - java.lang.Math.abs(d6)));
        double signum2 = java.lang.Math.signum(d6);
        double fl2 = 100.0d / viewingConditions.getFl();
        double pow4 = java.lang.Math.pow(max2, 2.380952380952381d);
        double max3 = java.lang.Math.max(0.0d, (java.lang.Math.abs(d7) * 27.13d) / (400.0d - java.lang.Math.abs(d7)));
        double signum3 = java.lang.Math.signum(d7);
        double fl3 = 100.0d / viewingConditions.getFl();
        double pow5 = java.lang.Math.pow(max3, 2.380952380952381d);
        double d8 = ((signum * fl) * pow3) / viewingConditions.getRgbD()[0];
        double d9 = ((signum2 * fl2) * pow4) / viewingConditions.getRgbD()[1];
        double d10 = ((signum3 * fl3) * pow5) / viewingConditions.getRgbD()[2];
        double[][] dArr2 = CAM16RGB_TO_XYZ;
        double[] dArr3 = dArr2[0];
        double d11 = (dArr3[0] * d8) + (dArr3[1] * d9) + (dArr3[2] * d10);
        double[] dArr4 = dArr2[1];
        double d12 = (dArr4[0] * d8) + (dArr4[1] * d9) + (dArr4[2] * d10);
        double[] dArr5 = dArr2[2];
        double d13 = (d8 * dArr5[0]) + (d9 * dArr5[1]) + (d10 * dArr5[2]);
        if (dArr != null) {
            dArr[0] = d11;
            dArr[1] = d12;
            dArr[2] = d13;
            return dArr;
        }
        return new double[]{d11, d12, d13};
    }
}

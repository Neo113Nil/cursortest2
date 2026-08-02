package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes6.dex */
public class Easing {
    java.lang.String Camera2StreamConfigurationMap = "identity";
    static androidx.constraintlayout.core.motion.utils.Easing getHighSpeedVideoFpsRangesFor = new androidx.constraintlayout.core.motion.utils.Easing();
    public static java.lang.String[] NAMED_EASING = {"standard", "accelerate", "decelerate", "linear"};

    public double get(double d) {
        return d;
    }

    public double getDiff(double d) {
        return 1.0d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static androidx.constraintlayout.core.motion.utils.Easing getInterpolator(java.lang.String str) {
        char c;
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new androidx.constraintlayout.core.motion.utils.Easing.CubicEasing(str);
        }
        if (str.startsWith("spline")) {
            return new androidx.constraintlayout.core.motion.utils.StepCurve(str);
        }
        if (str.startsWith("Schlick")) {
            return new androidx.constraintlayout.core.motion.utils.Schlick(str);
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1197605014:
                if (str.equals("anticipate")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -749065269:
                if (str.equals("overshoot")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return new androidx.constraintlayout.core.motion.utils.Easing.CubicEasing("cubic(0.4, 0.05, 0.8, 0.7)");
        }
        if (c == 1) {
            return new androidx.constraintlayout.core.motion.utils.Easing.CubicEasing("cubic(0.0, 0.0, 0.2, 0.95)");
        }
        if (c == 2) {
            return new androidx.constraintlayout.core.motion.utils.Easing.CubicEasing("cubic(0.36, 0, 0.66, -0.56)");
        }
        if (c == 3) {
            return new androidx.constraintlayout.core.motion.utils.Easing.CubicEasing("cubic(1, 1, 0, 0)");
        }
        if (c == 4) {
            return new androidx.constraintlayout.core.motion.utils.Easing.CubicEasing("cubic(0.34, 1.56, 0.64, 1)");
        }
        if (c == 5) {
            return new androidx.constraintlayout.core.motion.utils.Easing.CubicEasing("cubic(0.4, 0.0, 0.2, 1)");
        }
        java.io.PrintStream printStream = java.lang.System.err;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or ");
        sb.append(java.util.Arrays.toString(NAMED_EASING));
        printStream.println(sb.toString());
        return getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.String toString() {
        return this.Camera2StreamConfigurationMap;
    }

    static class CubicEasing extends androidx.constraintlayout.core.motion.utils.Easing {
        private static double getHighSpeedVideoSizesFor = 1.0E-4d;
        private static double getInputSizeshNQ4ISI = 0.01d;
        double getHighResolutionOutputSizeshNQ4ISI;
        double getHighSpeedVideoFpsRanges;
        double getHighSpeedVideoSizes;
        double getOutputFormats;

        CubicEasing(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.getHighSpeedVideoSizes = java.lang.Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i);
            this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Double.parseDouble(str.substring(i, indexOf3).trim());
            int i2 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i2);
            this.getHighSpeedVideoFpsRanges = java.lang.Double.parseDouble(str.substring(i2, indexOf4).trim());
            int i3 = indexOf4 + 1;
            this.getOutputFormats = java.lang.Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        private double Camera2StreamConfigurationMap(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.getHighSpeedVideoSizes * d2 * d3 * d) + (this.getHighSpeedVideoFpsRanges * d3 * d * d) + (d * d * d);
        }

        private double getHighSpeedVideoFpsRangesFor(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.getHighResolutionOutputSizeshNQ4ISI * d2 * d3 * d) + (this.getOutputFormats * d3 * d * d) + (d * d * d);
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public double getDiff(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > getHighSpeedVideoSizesFor) {
                d2 *= 0.5d;
                d3 = Camera2StreamConfigurationMap(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d3 + d2;
            return (getHighSpeedVideoFpsRangesFor(d5) - getHighSpeedVideoFpsRangesFor(d4)) / (Camera2StreamConfigurationMap(d5) - Camera2StreamConfigurationMap(d4));
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public double get(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > getInputSizeshNQ4ISI) {
                d2 *= 0.5d;
                d3 = Camera2StreamConfigurationMap(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(d4);
            double d5 = d3 + d2;
            double Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(d5);
            double highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(d4);
            return (((getHighSpeedVideoFpsRangesFor(d5) - highSpeedVideoFpsRangesFor) * (d - Camera2StreamConfigurationMap)) / (Camera2StreamConfigurationMap2 - Camera2StreamConfigurationMap)) + highSpeedVideoFpsRangesFor;
        }
    }
}

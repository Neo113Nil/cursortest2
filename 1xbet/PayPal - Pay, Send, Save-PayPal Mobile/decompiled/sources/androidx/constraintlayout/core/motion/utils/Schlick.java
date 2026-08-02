package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes6.dex */
public class Schlick extends androidx.constraintlayout.core.motion.utils.Easing {
    double getHighResolutionOutputSizeshNQ4ISI;
    double getHighSpeedVideoFpsRanges;

    Schlick(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.getHighSpeedVideoFpsRanges = java.lang.Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i = indexOf2 + 1;
        this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double d) {
        double d2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (d < d2) {
            return (d2 * d) / (d + (this.getHighSpeedVideoFpsRanges * (d2 - d)));
        }
        return ((1.0d - d2) * (d - 1.0d)) / ((1.0d - d) - (this.getHighSpeedVideoFpsRanges * (d2 - d)));
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double d) {
        double d2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (d < d2) {
            double d3 = this.getHighSpeedVideoFpsRanges;
            double d4 = d3 * d2 * d2;
            double d5 = ((d2 - d) * d3) + d;
            return d4 / (d5 * d5);
        }
        double d6 = this.getHighSpeedVideoFpsRanges;
        double d7 = d2 - 1.0d;
        double d8 = d7 * d6 * d7;
        double d9 = (((-d6) * (d2 - d)) - d) + 1.0d;
        return d8 / (d9 * d9);
    }
}

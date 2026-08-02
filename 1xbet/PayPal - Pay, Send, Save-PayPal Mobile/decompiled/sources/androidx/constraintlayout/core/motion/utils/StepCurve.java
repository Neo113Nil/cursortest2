package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes6.dex */
public class StepCurve extends androidx.constraintlayout.core.motion.utils.Easing {
    androidx.constraintlayout.core.motion.utils.MonotonicCurveFit getHighSpeedVideoSizes;

    StepCurve(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
        double[] dArr = new double[this.Camera2StreamConfigurationMap.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i = 0;
        while (indexOf2 != -1) {
            dArr[i] = java.lang.Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i++;
        }
        dArr[i] = java.lang.Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        double[] copyOf = java.util.Arrays.copyOf(dArr, i + 1);
        int length = (copyOf.length * 3) - 2;
        int length2 = copyOf.length - 1;
        double d = 1.0d / length2;
        double[][] dArr2 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i2 = 0; i2 < copyOf.length; i2++) {
            double d2 = copyOf[i2];
            int i3 = i2 + length2;
            dArr2[i3][0] = d2;
            double d3 = i2 * d;
            dArr3[i3] = d3;
            if (i2 > 0) {
                int i4 = (length2 * 2) + i2;
                dArr2[i4][0] = d2 + 1.0d;
                dArr3[i4] = d3 + 1.0d;
                int i5 = i2 - 1;
                dArr2[i5][0] = (d2 - 1.0d) - d;
                dArr3[i5] = (d3 - 1.0d) - d;
            }
        }
        androidx.constraintlayout.core.motion.utils.MonotonicCurveFit monotonicCurveFit = new androidx.constraintlayout.core.motion.utils.MonotonicCurveFit(dArr3, dArr2);
        java.io.PrintStream printStream = java.lang.System.out;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" 0 ");
        sb.append(monotonicCurveFit.getPos(0.0d, 0));
        printStream.println(sb.toString());
        java.io.PrintStream printStream2 = java.lang.System.out;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" 1 ");
        sb2.append(monotonicCurveFit.getPos(1.0d, 0));
        printStream2.println(sb2.toString());
        this.getHighSpeedVideoSizes = monotonicCurveFit;
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double d) {
        return this.getHighSpeedVideoSizes.getSlope(d, 0);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double d) {
        return this.getHighSpeedVideoSizes.getPos(d, 0);
    }
}

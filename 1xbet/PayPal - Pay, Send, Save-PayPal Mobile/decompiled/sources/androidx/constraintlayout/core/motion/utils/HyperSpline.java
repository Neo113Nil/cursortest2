package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes6.dex */
public class HyperSpline {
    double[][] Camera2StreamConfigurationMap;
    double[] getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    androidx.constraintlayout.core.motion.utils.HyperSpline.Cubic[][] getHighSpeedVideoSizes;
    double getInputSizeshNQ4ISI;

    public HyperSpline(double[][] dArr) {
        setup(dArr);
    }

    public HyperSpline() {
    }

    public void setup(double[][] dArr) {
        int i;
        int length = dArr[0].length;
        this.getHighSpeedVideoFpsRanges = length;
        int length2 = dArr.length;
        this.getHighSpeedVideoFpsRangesFor = length2;
        this.Camera2StreamConfigurationMap = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, length, length2);
        this.getHighSpeedVideoSizes = new androidx.constraintlayout.core.motion.utils.HyperSpline.Cubic[this.getHighSpeedVideoFpsRanges][];
        for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRanges; i2++) {
            for (int i3 = 0; i3 < this.getHighSpeedVideoFpsRangesFor; i3++) {
                this.Camera2StreamConfigurationMap[i2][i3] = dArr[i3][i2];
            }
        }
        int i4 = 0;
        while (true) {
            i = this.getHighSpeedVideoFpsRanges;
            int i5 = 1;
            if (i4 >= i) {
                break;
            }
            androidx.constraintlayout.core.motion.utils.HyperSpline.Cubic[][] cubicArr = this.getHighSpeedVideoSizes;
            double[] dArr2 = this.Camera2StreamConfigurationMap[i4];
            int length3 = dArr2.length;
            double[] dArr3 = new double[length3];
            double[] dArr4 = new double[length3];
            double[] dArr5 = new double[length3];
            int i6 = length3 - 1;
            dArr3[0] = 0.5d;
            for (int i7 = 1; i7 < i6; i7++) {
                dArr3[i7] = 1.0d / (4.0d - dArr3[i7 - 1]);
            }
            int i8 = length3 - 2;
            dArr3[i6] = 1.0d / (2.0d - dArr3[i8]);
            dArr4[0] = (dArr2[1] - dArr2[0]) * 3.0d * dArr3[0];
            while (i5 < i6) {
                int i9 = i5 + 1;
                int i10 = i5 - 1;
                dArr4[i5] = (((dArr2[i9] - dArr2[i10]) * 3.0d) - dArr4[i10]) * dArr3[i5];
                i5 = i9;
            }
            double d = (((dArr2[i6] - dArr2[i8]) * 3.0d) - dArr4[i8]) * dArr3[i6];
            dArr4[i6] = d;
            dArr5[i6] = d;
            while (i8 >= 0) {
                dArr5[i8] = dArr4[i8] - (dArr3[i8] * dArr5[i8 + 1]);
                i8--;
            }
            androidx.constraintlayout.core.motion.utils.HyperSpline.Cubic[] cubicArr2 = new androidx.constraintlayout.core.motion.utils.HyperSpline.Cubic[i6];
            int i11 = 0;
            while (i11 < i6) {
                double d2 = dArr2[i11];
                double d3 = dArr5[i11];
                int i12 = i11 + 1;
                double d4 = dArr2[i12];
                double d5 = dArr5[i12];
                cubicArr2[i11] = new androidx.constraintlayout.core.motion.utils.HyperSpline.Cubic((float) d2, d3, (((d4 - d2) * 3.0d) - (d3 * 2.0d)) - d5, ((d2 - d4) * 2.0d) + d3 + d5);
                i11 = i12;
            }
            cubicArr[i4] = cubicArr2;
            i4++;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new double[this.getHighSpeedVideoFpsRangesFor - 1];
        this.getInputSizeshNQ4ISI = 0.0d;
        androidx.constraintlayout.core.motion.utils.HyperSpline.Cubic[] cubicArr3 = new androidx.constraintlayout.core.motion.utils.HyperSpline.Cubic[i];
        for (int i13 = 0; i13 < this.getHighResolutionOutputSizeshNQ4ISI.length; i13++) {
            for (int i14 = 0; i14 < this.getHighSpeedVideoFpsRanges; i14++) {
                cubicArr3[i14] = this.getHighSpeedVideoSizes[i14][i13];
            }
            double d6 = this.getInputSizeshNQ4ISI;
            double[] dArr6 = this.getHighResolutionOutputSizeshNQ4ISI;
            double approxLength = approxLength(cubicArr3);
            dArr6[i13] = approxLength;
            this.getInputSizeshNQ4ISI = d6 + approxLength;
        }
    }

    public void getVelocity(double d, double[] dArr) {
        double d2 = d * this.getInputSizeshNQ4ISI;
        int i = 0;
        while (true) {
            double[] dArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i >= dArr2.length - 1) {
                break;
            }
            double d3 = dArr2[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr[i2] = this.getHighSpeedVideoSizes[i2][i].vel(d2 / this.getHighResolutionOutputSizeshNQ4ISI[i]);
        }
    }

    public void getPos(double d, double[] dArr) {
        double d2 = d * this.getInputSizeshNQ4ISI;
        int i = 0;
        while (true) {
            double[] dArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i >= dArr2.length - 1) {
                break;
            }
            double d3 = dArr2[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr[i2] = this.getHighSpeedVideoSizes[i2][i].eval(d2 / this.getHighResolutionOutputSizeshNQ4ISI[i]);
        }
    }

    public void getPos(double d, float[] fArr) {
        double d2 = d * this.getInputSizeshNQ4ISI;
        int i = 0;
        while (true) {
            double[] dArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i >= dArr.length - 1) {
                break;
            }
            double d3 = dArr[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = (float) this.getHighSpeedVideoSizes[i2][i].eval(d2 / this.getHighResolutionOutputSizeshNQ4ISI[i]);
        }
    }

    public double getPos(double d, int i) {
        double[] dArr;
        double d2 = d * this.getInputSizeshNQ4ISI;
        int i2 = 0;
        while (true) {
            dArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i2 >= dArr.length - 1) {
                break;
            }
            double d3 = dArr[i2];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i2++;
        }
        return this.getHighSpeedVideoSizes[i][i2].eval(d2 / dArr[i2]);
    }

    public double approxLength(androidx.constraintlayout.core.motion.utils.HyperSpline.Cubic[] cubicArr) {
        int i;
        int length = cubicArr.length;
        double[] dArr = new double[length];
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        while (true) {
            i = 0;
            if (d2 >= 1.0d) {
                break;
            }
            double d4 = 0.0d;
            while (i < length) {
                double d5 = dArr[i];
                double eval = cubicArr[i].eval(d2);
                dArr[i] = eval;
                double d6 = d5 - eval;
                d4 += d6 * d6;
                i++;
            }
            if (d2 > 0.0d) {
                d3 += java.lang.Math.sqrt(d4);
            }
            d2 += 0.1d;
        }
        while (i < length) {
            double d7 = dArr[i];
            double eval2 = cubicArr[i].eval(1.0d);
            dArr[i] = eval2;
            double d8 = d7 - eval2;
            d += d8 * d8;
            i++;
        }
        return d3 + java.lang.Math.sqrt(d);
    }

    public static class Cubic {
        double getHighResolutionOutputSizeshNQ4ISI;
        double getHighSpeedVideoFpsRanges;
        double getHighSpeedVideoFpsRangesFor;
        double getHighSpeedVideoSizes;

        public Cubic(double d, double d2, double d3, double d4) {
            this.getHighResolutionOutputSizeshNQ4ISI = d;
            this.getHighSpeedVideoFpsRanges = d2;
            this.getHighSpeedVideoSizes = d3;
            this.getHighSpeedVideoFpsRangesFor = d4;
        }

        public double eval(double d) {
            return (((((this.getHighSpeedVideoFpsRangesFor * d) + this.getHighSpeedVideoSizes) * d) + this.getHighSpeedVideoFpsRanges) * d) + this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public double vel(double d) {
            return (((this.getHighSpeedVideoFpsRangesFor * 3.0d * d) + (this.getHighSpeedVideoSizes * 2.0d)) * d) + this.getHighSpeedVideoFpsRanges;
        }
    }
}

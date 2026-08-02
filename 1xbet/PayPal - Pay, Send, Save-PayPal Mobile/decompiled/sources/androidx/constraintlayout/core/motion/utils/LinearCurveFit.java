package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes6.dex */
public class LinearCurveFit extends androidx.constraintlayout.core.motion.utils.CurveFit {
    private double[] Camera2StreamConfigurationMap;
    double[] getHighResolutionOutputSizeshNQ4ISI;
    private double getHighSpeedVideoFpsRanges;
    private double[][] getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes = true;

    public LinearCurveFit(double[] dArr, double[][] dArr2) {
        this.getHighSpeedVideoFpsRanges = Double.NaN;
        int length = dArr2[0].length;
        this.getHighResolutionOutputSizeshNQ4ISI = new double[length];
        this.Camera2StreamConfigurationMap = dArr;
        this.getHighSpeedVideoFpsRangesFor = dArr2;
        if (length > 2) {
            for (int i = 0; i < dArr.length; i++) {
                double d = dArr2[i][0];
            }
            this.getHighSpeedVideoFpsRanges = 0.0d;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d, double[] dArr) {
        double[] dArr2 = this.Camera2StreamConfigurationMap;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.getHighSpeedVideoFpsRangesFor[0].length;
        if (this.getHighSpeedVideoSizes) {
            double d2 = dArr2[0];
            if (d <= d2) {
                getSlope(d2, this.getHighResolutionOutputSizeshNQ4ISI);
                for (int i2 = 0; i2 < length2; i2++) {
                    dArr[i2] = this.getHighSpeedVideoFpsRangesFor[0][i2] + ((d - this.Camera2StreamConfigurationMap[0]) * this.getHighResolutionOutputSizeshNQ4ISI[i2]);
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr2[i3];
            if (d >= d3) {
                getSlope(d3, this.getHighResolutionOutputSizeshNQ4ISI);
                while (i < length2) {
                    dArr[i] = this.getHighSpeedVideoFpsRangesFor[i3][i] + ((d - this.Camera2StreamConfigurationMap[i3]) * this.getHighResolutionOutputSizeshNQ4ISI[i]);
                    i++;
                }
                return;
            }
        } else {
            if (d <= dArr2[0]) {
                for (int i4 = 0; i4 < length2; i4++) {
                    dArr[i4] = this.getHighSpeedVideoFpsRangesFor[0][i4];
                }
                return;
            }
            int i5 = length - 1;
            if (d >= dArr2[i5]) {
                while (i < length2) {
                    dArr[i] = this.getHighSpeedVideoFpsRangesFor[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.Camera2StreamConfigurationMap[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.getHighSpeedVideoFpsRangesFor[i6][i7];
                }
            }
            double[] dArr3 = this.Camera2StreamConfigurationMap;
            int i8 = i6 + 1;
            double d4 = dArr3[i8];
            if (d < d4) {
                double d5 = dArr3[i6];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    double[][] dArr4 = this.getHighSpeedVideoFpsRangesFor;
                    dArr[i] = (dArr4[i6][i] * (1.0d - d6)) + (dArr4[i8][i] * d6);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d, float[] fArr) {
        double[] dArr = this.Camera2StreamConfigurationMap;
        int length = dArr.length;
        int i = 0;
        int length2 = this.getHighSpeedVideoFpsRangesFor[0].length;
        if (this.getHighSpeedVideoSizes) {
            double d2 = dArr[0];
            if (d <= d2) {
                getSlope(d2, this.getHighResolutionOutputSizeshNQ4ISI);
                for (int i2 = 0; i2 < length2; i2++) {
                    fArr[i2] = (float) (this.getHighSpeedVideoFpsRangesFor[0][i2] + ((d - this.Camera2StreamConfigurationMap[0]) * this.getHighResolutionOutputSizeshNQ4ISI[i2]));
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr[i3];
            if (d >= d3) {
                getSlope(d3, this.getHighResolutionOutputSizeshNQ4ISI);
                while (i < length2) {
                    fArr[i] = (float) (this.getHighSpeedVideoFpsRangesFor[i3][i] + ((d - this.Camera2StreamConfigurationMap[i3]) * this.getHighResolutionOutputSizeshNQ4ISI[i]));
                    i++;
                }
                return;
            }
        } else {
            if (d <= dArr[0]) {
                for (int i4 = 0; i4 < length2; i4++) {
                    fArr[i4] = (float) this.getHighSpeedVideoFpsRangesFor[0][i4];
                }
                return;
            }
            int i5 = length - 1;
            if (d >= dArr[i5]) {
                while (i < length2) {
                    fArr[i] = (float) this.getHighSpeedVideoFpsRangesFor[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.Camera2StreamConfigurationMap[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) this.getHighSpeedVideoFpsRangesFor[i6][i7];
                }
            }
            double[] dArr2 = this.Camera2StreamConfigurationMap;
            int i8 = i6 + 1;
            double d4 = dArr2[i8];
            if (d < d4) {
                double d5 = dArr2[i6];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    double[][] dArr3 = this.getHighSpeedVideoFpsRangesFor;
                    fArr[i] = (float) ((dArr3[i6][i] * (1.0d - d6)) + (dArr3[i8][i] * d6));
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d, int i) {
        double d2;
        double d3;
        double slope;
        double[] dArr = this.Camera2StreamConfigurationMap;
        int length = dArr.length;
        int i2 = 0;
        if (this.getHighSpeedVideoSizes) {
            double d4 = dArr[0];
            if (d <= d4) {
                d2 = this.getHighSpeedVideoFpsRangesFor[0][i];
                d3 = d - d4;
                slope = getSlope(d4, i);
            } else {
                int i3 = length - 1;
                double d5 = dArr[i3];
                if (d >= d5) {
                    d2 = this.getHighSpeedVideoFpsRangesFor[i3][i];
                    d3 = d - d5;
                    slope = getSlope(d5, i);
                }
            }
            return d2 + (d3 * slope);
        }
        if (d <= dArr[0]) {
            return this.getHighSpeedVideoFpsRangesFor[0][i];
        }
        int i4 = length - 1;
        if (d >= dArr[i4]) {
            return this.getHighSpeedVideoFpsRangesFor[i4][i];
        }
        while (i2 < length - 1) {
            double[] dArr2 = this.Camera2StreamConfigurationMap;
            double d6 = dArr2[i2];
            if (d == d6) {
                return this.getHighSpeedVideoFpsRangesFor[i2][i];
            }
            int i5 = i2 + 1;
            double d7 = dArr2[i5];
            if (d < d7) {
                double d8 = (d - d6) / (d7 - d6);
                double[][] dArr3 = this.getHighSpeedVideoFpsRangesFor;
                return (dArr3[i2][i] * (1.0d - d8)) + (dArr3[i5][i] * d8);
            }
            i2 = i5;
        }
        return 0.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0017, code lost:
    
        if (r13 >= r4) goto L4;
     */
    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getSlope(double d, double[] dArr) {
        double[] dArr2 = this.Camera2StreamConfigurationMap;
        int length = dArr2.length;
        int length2 = this.getHighSpeedVideoFpsRangesFor[0].length;
        double d2 = dArr2[0];
        if (d > d2) {
            d2 = dArr2[length - 1];
        }
        d = d2;
        int i = 0;
        while (i < length - 1) {
            double[] dArr3 = this.Camera2StreamConfigurationMap;
            int i2 = i + 1;
            double d3 = dArr3[i2];
            if (d <= d3) {
                double d4 = dArr3[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    double[][] dArr4 = this.getHighSpeedVideoFpsRangesFor;
                    dArr[i3] = (dArr4[i2][i3] - dArr4[i][i3]) / (d3 - d4);
                }
                return;
            }
            i = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0012, code lost:
    
        if (r9 >= r3) goto L4;
     */
    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public double getSlope(double d, int i) {
        double[] dArr = this.Camera2StreamConfigurationMap;
        int length = dArr.length;
        int i2 = 0;
        double d2 = dArr[0];
        if (d >= d2) {
            d2 = dArr[length - 1];
        }
        d = d2;
        while (i2 < length - 1) {
            double[] dArr2 = this.Camera2StreamConfigurationMap;
            int i3 = i2 + 1;
            double d3 = dArr2[i3];
            if (d <= d3) {
                double d4 = dArr2[i2];
                double[][] dArr3 = this.getHighSpeedVideoFpsRangesFor;
                return (dArr3[i3][i] - dArr3[i2][i]) / (d3 - d4);
            }
            i2 = i3;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.Camera2StreamConfigurationMap;
    }
}

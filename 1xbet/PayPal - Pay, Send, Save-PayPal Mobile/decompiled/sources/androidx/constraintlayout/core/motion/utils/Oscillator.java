package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes6.dex */
public class Oscillator {
    public static final int BOUNCE = 6;
    public static final int COS_WAVE = 5;
    public static final int CUSTOM = 7;
    public static final int REVERSE_SAW_WAVE = 4;
    public static final int SAW_WAVE = 3;
    public static final int SIN_WAVE = 0;
    public static final int SQUARE_WAVE = 1;
    public static java.lang.String TAG = "Oscillator";
    public static final int TRIANGLE_WAVE = 2;
    androidx.constraintlayout.core.motion.utils.MonotonicCurveFit getHighSpeedVideoFpsRanges;
    java.lang.String getHighSpeedVideoFpsRangesFor;
    double[] getHighSpeedVideoSizes;
    int getInputFormats;
    float[] getHighResolutionOutputSizeshNQ4ISI = new float[0];
    double[] getHighSpeedVideoSizesFor = new double[0];
    double Camera2StreamConfigurationMap = 6.283185307179586d;
    private boolean getInputSizeshNQ4ISI = false;

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("pos =");
        sb.append(java.util.Arrays.toString(this.getHighSpeedVideoSizesFor));
        sb.append(" period=");
        sb.append(java.util.Arrays.toString(this.getHighResolutionOutputSizeshNQ4ISI));
        return sb.toString();
    }

    public void setType(int i, java.lang.String str) {
        this.getInputFormats = i;
        this.getHighSpeedVideoFpsRangesFor = str;
        if (str != null) {
            this.getHighSpeedVideoFpsRanges = androidx.constraintlayout.core.motion.utils.MonotonicCurveFit.buildWave(str);
        }
    }

    public void addPoint(double d, float f) {
        int length = this.getHighResolutionOutputSizeshNQ4ISI.length + 1;
        int binarySearch = java.util.Arrays.binarySearch(this.getHighSpeedVideoSizesFor, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.getHighSpeedVideoSizesFor = java.util.Arrays.copyOf(this.getHighSpeedVideoSizesFor, length);
        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Arrays.copyOf(this.getHighResolutionOutputSizeshNQ4ISI, length);
        this.getHighSpeedVideoSizes = new double[length];
        double[] dArr = this.getHighSpeedVideoSizesFor;
        java.lang.System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.getHighSpeedVideoSizesFor[binarySearch] = d;
        this.getHighResolutionOutputSizeshNQ4ISI[binarySearch] = f;
        this.getInputSizeshNQ4ISI = false;
    }

    public void normalize() {
        double d = 0.0d;
        int i = 0;
        while (true) {
            if (i >= this.getHighResolutionOutputSizeshNQ4ISI.length) {
                break;
            }
            d += r6[i];
            i++;
        }
        double d2 = 0.0d;
        int i2 = 1;
        while (true) {
            float[] fArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i2 >= fArr.length) {
                break;
            }
            int i3 = i2 - 1;
            float f = (fArr[i3] + fArr[i2]) / 2.0f;
            double[] dArr = this.getHighSpeedVideoSizesFor;
            d2 += (dArr[i2] - dArr[i3]) * f;
            i2++;
        }
        int i4 = 0;
        while (true) {
            float[] fArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i4 >= fArr2.length) {
                break;
            }
            fArr2[i4] = fArr2[i4] * ((float) (d / d2));
            i4++;
        }
        this.getHighSpeedVideoSizes[0] = 0.0d;
        int i5 = 1;
        while (true) {
            float[] fArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i5 < fArr3.length) {
                int i6 = i5 - 1;
                float f2 = (fArr3[i6] + fArr3[i5]) / 2.0f;
                double[] dArr2 = this.getHighSpeedVideoSizesFor;
                double d3 = dArr2[i5];
                double d4 = dArr2[i6];
                double[] dArr3 = this.getHighSpeedVideoSizes;
                dArr3[i5] = dArr3[i6] + ((d3 - d4) * f2);
                i5++;
            } else {
                this.getInputSizeshNQ4ISI = true;
                return;
            }
        }
    }

    private double getHighSpeedVideoFpsRangesFor(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        int binarySearch = java.util.Arrays.binarySearch(this.getHighSpeedVideoSizesFor, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        float[] fArr = this.getHighResolutionOutputSizeshNQ4ISI;
        float f = fArr[binarySearch];
        int i = binarySearch - 1;
        float f2 = fArr[i];
        double d2 = f - f2;
        double[] dArr = this.getHighSpeedVideoSizesFor;
        double d3 = dArr[binarySearch];
        double d4 = dArr[i];
        double d5 = d2 / (d3 - d4);
        return this.getHighSpeedVideoSizes[i] + ((f2 - (d5 * d4)) * (d - d4)) + ((d5 * ((d * d) - (d4 * d4))) / 2.0d);
    }

    public double getValue(double d, double d2) {
        double abs;
        double highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(d) + d2;
        switch (this.getInputFormats) {
            case 1:
                return java.lang.Math.signum(0.5d - (highSpeedVideoFpsRangesFor % 1.0d));
            case 2:
                abs = java.lang.Math.abs((((highSpeedVideoFpsRangesFor * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((highSpeedVideoFpsRangesFor * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((highSpeedVideoFpsRangesFor * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return java.lang.Math.cos(this.Camera2StreamConfigurationMap * (d2 + highSpeedVideoFpsRangesFor));
            case 6:
                double abs2 = 1.0d - java.lang.Math.abs(((highSpeedVideoFpsRangesFor * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.getHighSpeedVideoFpsRanges.getPos(highSpeedVideoFpsRangesFor % 1.0d, 0);
            default:
                return java.lang.Math.sin(this.Camera2StreamConfigurationMap * highSpeedVideoFpsRangesFor);
        }
        return 1.0d - abs;
    }

    public double getSlope(double d, double d2, double d3) {
        double d4;
        double highSpeedVideoFpsRangesFor = d2 + getHighSpeedVideoFpsRangesFor(d);
        if (d <= 0.0d) {
            d4 = 0.0d;
        } else if (d >= 1.0d) {
            d4 = 1.0d;
        } else {
            int binarySearch = java.util.Arrays.binarySearch(this.getHighSpeedVideoSizesFor, d);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            float[] fArr = this.getHighResolutionOutputSizeshNQ4ISI;
            float f = fArr[binarySearch];
            int i = binarySearch - 1;
            float f2 = fArr[i];
            double d5 = f - f2;
            double[] dArr = this.getHighSpeedVideoSizesFor;
            double d6 = dArr[binarySearch];
            double d7 = dArr[i];
            double d8 = d5 / (d6 - d7);
            d4 = (d * d8) + (f2 - (d8 * d7));
        }
        double d9 = d4 + d3;
        switch (this.getInputFormats) {
            case 1:
                return 0.0d;
            case 2:
                return d9 * 4.0d * java.lang.Math.signum((((highSpeedVideoFpsRangesFor * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return d9 * 2.0d;
            case 4:
                return (-d9) * 2.0d;
            case 5:
                double d10 = this.Camera2StreamConfigurationMap;
                return (-d10) * d9 * java.lang.Math.sin(d10 * highSpeedVideoFpsRangesFor);
            case 6:
                return d9 * 4.0d * ((((highSpeedVideoFpsRangesFor * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.getHighSpeedVideoFpsRanges.getSlope(highSpeedVideoFpsRangesFor % 1.0d, 0);
            default:
                double d11 = this.Camera2StreamConfigurationMap;
                return d9 * d11 * java.lang.Math.cos(d11 * highSpeedVideoFpsRangesFor);
        }
    }
}

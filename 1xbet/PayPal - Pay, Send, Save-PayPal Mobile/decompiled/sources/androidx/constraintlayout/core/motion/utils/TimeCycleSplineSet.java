package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes6.dex */
public abstract class TimeCycleSplineSet {
    protected static final int CURVE_OFFSET = 2;
    protected static final int CURVE_PERIOD = 1;
    protected static final int CURVE_VALUE = 0;
    protected static float sVal2PI = 6.2831855f;
    protected int mCount;
    protected androidx.constraintlayout.core.motion.utils.CurveFit mCurveFit;
    protected long mLastTime;
    protected java.lang.String mType;
    protected int mWaveShape = 0;
    protected int[] mTimePoints = new int[10];
    protected float[][] mValues = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, 10, 3);
    protected float[] mCache = new float[3];
    protected boolean mContinue = false;
    protected float mLastCycle = Float.NaN;

    public java.lang.String toString() {
        java.lang.String str = this.mType;
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("##.##");
        for (int i = 0; i < this.mCount; i++) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append("[");
            sb.append(this.mTimePoints[i]);
            sb.append(" , ");
            sb.append(decimalFormat.format(this.mValues[i]));
            sb.append("] ");
            str = sb.toString();
        }
        return str;
    }

    public void setType(java.lang.String str) {
        this.mType = str;
    }

    protected float calcWave(float f) {
        float abs;
        switch (this.mWaveShape) {
            case 1:
                return java.lang.Math.signum(f * sVal2PI);
            case 2:
                abs = java.lang.Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) java.lang.Math.cos(f * sVal2PI);
            case 6:
                float abs2 = 1.0f - java.lang.Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) java.lang.Math.sin(f * sVal2PI);
        }
        return 1.0f - abs;
    }

    public androidx.constraintlayout.core.motion.utils.CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public void setStartTime(long j) {
        this.mLastTime = j;
    }

    public void setPoint(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.mTimePoints;
        int i3 = this.mCount;
        iArr[i3] = i;
        float[] fArr = this.mValues[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.mWaveShape = java.lang.Math.max(this.mWaveShape, i2);
        this.mCount++;
    }

    public static class CustomSet extends androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet {
        androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomArray Camera2StreamConfigurationMap;
        float[] getHighResolutionOutputSizeshNQ4ISI;
        float[] getHighSpeedVideoFpsRanges;
        java.lang.String getHighSpeedVideoFpsRangesFor;
        androidx.constraintlayout.core.motion.utils.KeyFrameArray.FloatArray getHighSpeedVideoSizes = new androidx.constraintlayout.core.motion.utils.KeyFrameArray.FloatArray();

        public CustomSet(java.lang.String str, androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomArray customArray) {
            this.getHighSpeedVideoFpsRangesFor = str.split(",")[1];
            this.Camera2StreamConfigurationMap = customArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i) {
            int size = this.Camera2StreamConfigurationMap.size();
            int numberOfInterpolatedValues = this.Camera2StreamConfigurationMap.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i2 = numberOfInterpolatedValues + 2;
            this.getHighResolutionOutputSizeshNQ4ISI = new float[i2];
            this.getHighSpeedVideoFpsRanges = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.Camera2StreamConfigurationMap.keyAt(i3);
                androidx.constraintlayout.core.motion.CustomAttribute valueAt = this.Camera2StreamConfigurationMap.valueAt(i3);
                androidx.constraintlayout.core.motion.utils.KeyFrameArray.FloatArray floatArray = this.getHighSpeedVideoSizes;
                float[] fArr = floatArray.getHighSpeedVideoFpsRangesFor[floatArray.getHighSpeedVideoFpsRanges[i3]];
                dArr[i3] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.getHighResolutionOutputSizeshNQ4ISI);
                int i4 = 0;
                while (true) {
                    if (i4 < this.getHighResolutionOutputSizeshNQ4ISI.length) {
                        dArr2[i3][i4] = r7[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[numberOfInterpolatedValues] = fArr[0];
                dArr3[numberOfInterpolatedValues + 1] = fArr[1];
            }
            this.mCurveFit = androidx.constraintlayout.core.motion.utils.CurveFit.get(i, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i, float f, float f2, int i2, float f3) {
            throw new java.lang.RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public void setPoint(int i, androidx.constraintlayout.core.motion.CustomAttribute customAttribute, float f, int i2, float f2) {
            this.Camera2StreamConfigurationMap.append(i, customAttribute);
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(i, new float[]{f, f2});
            this.mWaveShape = java.lang.Math.max(this.mWaveShape, i2);
        }

        public boolean setProperty(androidx.constraintlayout.core.motion.MotionWidget motionWidget, float f, long j, androidx.constraintlayout.core.motion.utils.KeyCache keyCache) {
            this.mCurveFit.getPos(f, this.getHighResolutionOutputSizeshNQ4ISI);
            float[] fArr = this.getHighResolutionOutputSizeshNQ4ISI;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = this.mLastTime;
            if (java.lang.Float.isNaN(this.mLastCycle)) {
                this.mLastCycle = keyCache.getFloatValue(motionWidget, this.getHighSpeedVideoFpsRangesFor, 0);
                if (java.lang.Float.isNaN(this.mLastCycle)) {
                    this.mLastCycle = 0.0f;
                }
            }
            this.mLastCycle = (float) ((this.mLastCycle + (((j - j2) * 1.0E-9d) * f2)) % 1.0d);
            this.mLastTime = j;
            float calcWave = calcWave(this.mLastCycle);
            this.mContinue = false;
            for (int i = 0; i < this.getHighSpeedVideoFpsRanges.length; i++) {
                this.mContinue |= ((double) this.getHighResolutionOutputSizeshNQ4ISI[i]) != 0.0d;
                this.getHighSpeedVideoFpsRanges[i] = (this.getHighResolutionOutputSizeshNQ4ISI[i] * calcWave) + f3;
            }
            motionWidget.setInterpolatedValue(this.Camera2StreamConfigurationMap.valueAt(0), this.getHighSpeedVideoFpsRanges);
            if (f2 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }
    }

    public void setup(int i) {
        int i2;
        int i3 = this.mCount;
        if (i3 == 0) {
            java.io.PrintStream printStream = java.lang.System.err;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error no points added to ");
            sb.append(this.mType);
            printStream.println(sb.toString());
            return;
        }
        androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet.Sort.Camera2StreamConfigurationMap(this.mTimePoints, this.mValues, i3 - 1);
        int i4 = 0;
        int i5 = 1;
        while (true) {
            int[] iArr = this.mTimePoints;
            if (i5 >= iArr.length) {
                break;
            }
            if (iArr[i5] != iArr[i5 - 1]) {
                i4++;
            }
            i5++;
        }
        if (i4 == 0) {
            i4 = 1;
        }
        double[] dArr = new double[i4];
        double[][] dArr2 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, i4, 3);
        int i6 = 0;
        for (0; i2 < this.mCount; i2 + 1) {
            if (i2 > 0) {
                int[] iArr2 = this.mTimePoints;
                i2 = iArr2[i2] == iArr2[i2 - 1] ? i2 + 1 : 0;
            }
            dArr[i6] = this.mTimePoints[i2] * 0.01d;
            double[] dArr3 = dArr2[i6];
            float[] fArr = this.mValues[i2];
            dArr3[0] = fArr[0];
            dArr3[1] = fArr[1];
            dArr3[2] = fArr[2];
            i6++;
        }
        this.mCurveFit = androidx.constraintlayout.core.motion.utils.CurveFit.get(i, dArr, dArr2);
    }

    protected static class Sort {
        protected Sort() {
        }

        static void Camera2StreamConfigurationMap(int[] iArr, float[][] fArr, int i) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i;
            iArr2[1] = 0;
            int i2 = 2;
            while (i2 > 0) {
                int i3 = i2 - 1;
                int i4 = iArr2[i3];
                int i5 = i2 - 2;
                int i6 = iArr2[i5];
                if (i4 < i6) {
                    int i7 = iArr[i6];
                    int i8 = i4;
                    int i9 = i8;
                    while (i8 < i6) {
                        int i10 = iArr[i8];
                        if (i10 <= i7) {
                            int i11 = iArr[i9];
                            iArr[i9] = i10;
                            iArr[i8] = i11;
                            float[] fArr2 = fArr[i9];
                            fArr[i9] = fArr[i8];
                            fArr[i8] = fArr2;
                            i9++;
                        }
                        i8++;
                    }
                    int i12 = iArr[i9];
                    iArr[i9] = iArr[i6];
                    iArr[i6] = i12;
                    float[] fArr3 = fArr[i9];
                    fArr[i9] = fArr[i6];
                    fArr[i6] = fArr3;
                    iArr2[i5] = i9 - 1;
                    iArr2[i3] = i4;
                    iArr2[i2] = i6;
                    iArr2[i2 + 1] = i9 + 1;
                    i2 += 2;
                } else {
                    i2 = i5;
                }
            }
        }
    }

    public static class CustomVarSet extends androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet {
        androidx.constraintlayout.core.motion.utils.KeyFrameArray.FloatArray Camera2StreamConfigurationMap = new androidx.constraintlayout.core.motion.utils.KeyFrameArray.FloatArray();
        java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar getHighSpeedVideoFpsRanges;
        float[] getHighSpeedVideoFpsRangesFor;
        float[] getHighSpeedVideoSizes;

        public CustomVarSet(java.lang.String str, androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar customVar) {
            this.getHighResolutionOutputSizeshNQ4ISI = str.split(",")[1];
            this.getHighSpeedVideoFpsRanges = customVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i) {
            int size = this.getHighSpeedVideoFpsRanges.size();
            int numberOfInterpolatedValues = this.getHighSpeedVideoFpsRanges.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i2 = numberOfInterpolatedValues + 2;
            this.getHighSpeedVideoSizes = new float[i2];
            this.getHighSpeedVideoFpsRangesFor = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.getHighSpeedVideoFpsRanges.keyAt(i3);
                androidx.constraintlayout.core.motion.CustomVariable valueAt = this.getHighSpeedVideoFpsRanges.valueAt(i3);
                androidx.constraintlayout.core.motion.utils.KeyFrameArray.FloatArray floatArray = this.Camera2StreamConfigurationMap;
                float[] fArr = floatArray.getHighSpeedVideoFpsRangesFor[floatArray.getHighSpeedVideoFpsRanges[i3]];
                dArr[i3] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.getHighSpeedVideoSizes);
                int i4 = 0;
                while (true) {
                    if (i4 < this.getHighSpeedVideoSizes.length) {
                        dArr2[i3][i4] = r7[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[numberOfInterpolatedValues] = fArr[0];
                dArr3[numberOfInterpolatedValues + 1] = fArr[1];
            }
            this.mCurveFit = androidx.constraintlayout.core.motion.utils.CurveFit.get(i, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i, float f, float f2, int i2, float f3) {
            throw new java.lang.RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public void setPoint(int i, androidx.constraintlayout.core.motion.CustomVariable customVariable, float f, int i2, float f2) {
            this.getHighSpeedVideoFpsRanges.append(i, customVariable);
            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(i, new float[]{f, f2});
            this.mWaveShape = java.lang.Math.max(this.mWaveShape, i2);
        }

        public boolean setProperty(androidx.constraintlayout.core.motion.MotionWidget motionWidget, float f, long j, androidx.constraintlayout.core.motion.utils.KeyCache keyCache) {
            this.mCurveFit.getPos(f, this.getHighSpeedVideoSizes);
            float[] fArr = this.getHighSpeedVideoSizes;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = this.mLastTime;
            if (java.lang.Float.isNaN(this.mLastCycle)) {
                this.mLastCycle = keyCache.getFloatValue(motionWidget, this.getHighResolutionOutputSizeshNQ4ISI, 0);
                if (java.lang.Float.isNaN(this.mLastCycle)) {
                    this.mLastCycle = 0.0f;
                }
            }
            this.mLastCycle = (float) ((this.mLastCycle + (((j - j2) * 1.0E-9d) * f2)) % 1.0d);
            this.mLastTime = j;
            float calcWave = calcWave(this.mLastCycle);
            this.mContinue = false;
            for (int i = 0; i < this.getHighSpeedVideoFpsRangesFor.length; i++) {
                this.mContinue |= ((double) this.getHighSpeedVideoSizes[i]) != 0.0d;
                this.getHighSpeedVideoFpsRangesFor[i] = (this.getHighSpeedVideoSizes[i] * calcWave) + f3;
            }
            this.getHighSpeedVideoFpsRanges.valueAt(0).setInterpolatedValue(motionWidget, this.getHighSpeedVideoFpsRangesFor);
            if (f2 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }
    }
}

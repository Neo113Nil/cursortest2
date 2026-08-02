package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes6.dex */
public abstract class SplineSet {
    private java.lang.String Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRangesFor;
    protected androidx.constraintlayout.core.motion.utils.CurveFit mCurveFit;
    protected int[] mTimePoints = new int[10];
    protected float[] mValues = new float[10];

    public void setProperty(androidx.constraintlayout.core.motion.utils.TypedValues typedValues, float f) {
        typedValues.setValue(androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.getId(this.Camera2StreamConfigurationMap), get(f));
    }

    public java.lang.String toString() {
        java.lang.String str = this.Camera2StreamConfigurationMap;
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("##.##");
        for (int i = 0; i < this.getHighSpeedVideoFpsRangesFor; i++) {
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
        this.Camera2StreamConfigurationMap = str;
    }

    public float get(float f) {
        return (float) this.mCurveFit.getPos(f, 0);
    }

    public float getSlope(float f) {
        return (float) this.mCurveFit.getSlope(f, 0);
    }

    public androidx.constraintlayout.core.motion.utils.CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public void setPoint(int i, float f) {
        int[] iArr = this.mTimePoints;
        if (iArr.length < this.getHighSpeedVideoFpsRangesFor + 1) {
            this.mTimePoints = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.mValues;
            this.mValues = java.util.Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.mTimePoints;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        iArr2[i2] = i;
        this.mValues[i2] = f;
        this.getHighSpeedVideoFpsRangesFor = i2 + 1;
    }

    public void setup(int i) {
        int i2;
        int i3 = this.getHighSpeedVideoFpsRangesFor;
        if (i3 == 0) {
            return;
        }
        androidx.constraintlayout.core.motion.utils.SplineSet.Sort.Camera2StreamConfigurationMap(this.mTimePoints, this.mValues, i3 - 1);
        int i4 = 1;
        for (int i5 = 1; i5 < this.getHighSpeedVideoFpsRangesFor; i5++) {
            int[] iArr = this.mTimePoints;
            if (iArr[i5 - 1] != iArr[i5]) {
                i4++;
            }
        }
        double[] dArr = new double[i4];
        double[][] dArr2 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, i4, 1);
        int i6 = 0;
        for (0; i2 < this.getHighSpeedVideoFpsRangesFor; i2 + 1) {
            if (i2 > 0) {
                int[] iArr2 = this.mTimePoints;
                i2 = iArr2[i2] == iArr2[i2 - 1] ? i2 + 1 : 0;
            }
            dArr[i6] = this.mTimePoints[i2] * 0.01d;
            dArr2[i6][0] = this.mValues[i2];
            i6++;
        }
        this.mCurveFit = androidx.constraintlayout.core.motion.utils.CurveFit.get(i, dArr, dArr2);
    }

    public static androidx.constraintlayout.core.motion.utils.SplineSet makeCustomSpline(java.lang.String str, androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomArray customArray) {
        return new androidx.constraintlayout.core.motion.utils.SplineSet.CustomSet(str, customArray);
    }

    public static androidx.constraintlayout.core.motion.utils.SplineSet makeCustomSplineSet(java.lang.String str, androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar customVar) {
        return new androidx.constraintlayout.core.motion.utils.SplineSet.CustomSpline(str, customVar);
    }

    public static androidx.constraintlayout.core.motion.utils.SplineSet makeSpline(java.lang.String str, long j) {
        return new androidx.constraintlayout.core.motion.utils.SplineSet.CoreSpline(str, j);
    }

    static class Sort {
        private Sort() {
        }

        static void Camera2StreamConfigurationMap(int[] iArr, float[] fArr, int i) {
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
                        if (iArr[i8] <= i7) {
                            getHighSpeedVideoFpsRangesFor(iArr, fArr, i9, i8);
                            i9++;
                        }
                        i8++;
                    }
                    getHighSpeedVideoFpsRangesFor(iArr, fArr, i9, i6);
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

        private static void getHighSpeedVideoFpsRangesFor(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    public static class CustomSet extends androidx.constraintlayout.core.motion.utils.SplineSet {
        float[] Camera2StreamConfigurationMap;
        androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomArray getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String getHighSpeedVideoFpsRangesFor;

        public CustomSet(java.lang.String str, androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomArray customArray) {
            this.getHighSpeedVideoFpsRangesFor = str.split(",")[1];
            this.getHighResolutionOutputSizeshNQ4ISI = customArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i) {
            int size = this.getHighResolutionOutputSizeshNQ4ISI.size();
            int numberOfInterpolatedValues = this.getHighResolutionOutputSizeshNQ4ISI.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.Camera2StreamConfigurationMap = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, size, numberOfInterpolatedValues);
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = this.getHighResolutionOutputSizeshNQ4ISI.keyAt(i2);
                androidx.constraintlayout.core.motion.CustomAttribute valueAt = this.getHighResolutionOutputSizeshNQ4ISI.valueAt(i2);
                dArr[i2] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.Camera2StreamConfigurationMap);
                int i3 = 0;
                while (true) {
                    if (i3 < this.Camera2StreamConfigurationMap.length) {
                        dArr2[i2][i3] = r6[i3];
                        i3++;
                    }
                }
            }
            this.mCurveFit = androidx.constraintlayout.core.motion.utils.CurveFit.get(i, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i, float f) {
            throw new java.lang.RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void setPoint(int i, androidx.constraintlayout.core.motion.CustomAttribute customAttribute) {
            this.getHighResolutionOutputSizeshNQ4ISI.append(i, customAttribute);
        }

        public void setProperty(androidx.constraintlayout.core.state.WidgetFrame widgetFrame, float f) {
            this.mCurveFit.getPos(f, this.Camera2StreamConfigurationMap);
            widgetFrame.setCustomValue(this.getHighResolutionOutputSizeshNQ4ISI.valueAt(0), this.Camera2StreamConfigurationMap);
        }
    }

    static class CoreSpline extends androidx.constraintlayout.core.motion.utils.SplineSet {
        java.lang.String Camera2StreamConfigurationMap;
        long getHighSpeedVideoSizes;

        CoreSpline(java.lang.String str, long j) {
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoSizes = j;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setProperty(androidx.constraintlayout.core.motion.utils.TypedValues typedValues, float f) {
            typedValues.setValue(typedValues.getId(this.Camera2StreamConfigurationMap), get(f));
        }
    }

    public static class CustomSpline extends androidx.constraintlayout.core.motion.utils.SplineSet {
        androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar Camera2StreamConfigurationMap;
        java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        float[] getHighSpeedVideoFpsRanges;

        public CustomSpline(java.lang.String str, androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar customVar) {
            this.getHighResolutionOutputSizeshNQ4ISI = str.split(",")[1];
            this.Camera2StreamConfigurationMap = customVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i) {
            int size = this.Camera2StreamConfigurationMap.size();
            int numberOfInterpolatedValues = this.Camera2StreamConfigurationMap.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.getHighSpeedVideoFpsRanges = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, size, numberOfInterpolatedValues);
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = this.Camera2StreamConfigurationMap.keyAt(i2);
                androidx.constraintlayout.core.motion.CustomVariable valueAt = this.Camera2StreamConfigurationMap.valueAt(i2);
                dArr[i2] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.getHighSpeedVideoFpsRanges);
                int i3 = 0;
                while (true) {
                    if (i3 < this.getHighSpeedVideoFpsRanges.length) {
                        dArr2[i2][i3] = r6[i3];
                        i3++;
                    }
                }
            }
            this.mCurveFit = androidx.constraintlayout.core.motion.utils.CurveFit.get(i, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i, float f) {
            throw new java.lang.RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setProperty(androidx.constraintlayout.core.motion.utils.TypedValues typedValues, float f) {
            setProperty((androidx.constraintlayout.core.motion.MotionWidget) typedValues, f);
        }

        public void setPoint(int i, androidx.constraintlayout.core.motion.CustomVariable customVariable) {
            this.Camera2StreamConfigurationMap.append(i, customVariable);
        }

        public void setProperty(androidx.constraintlayout.core.motion.MotionWidget motionWidget, float f) {
            this.mCurveFit.getPos(f, this.getHighSpeedVideoFpsRanges);
            this.Camera2StreamConfigurationMap.valueAt(0).setInterpolatedValue(motionWidget, this.getHighSpeedVideoFpsRanges);
        }
    }
}

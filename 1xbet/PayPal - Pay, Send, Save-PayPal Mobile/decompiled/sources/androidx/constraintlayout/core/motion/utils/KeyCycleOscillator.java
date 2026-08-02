package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes6.dex */
public abstract class KeyCycleOscillator {
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.CycleOscillator getHighSpeedVideoFpsRangesFor;
    private androidx.constraintlayout.core.motion.utils.CurveFit getHighSpeedVideoSizes;
    private int Camera2StreamConfigurationMap = 0;
    private java.lang.String getHighSpeedVideoSizesFor = null;
    public int mVariesBy = 0;
    java.util.ArrayList<androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.WavePoint> getHighSpeedVideoFpsRanges = new java.util.ArrayList<>();

    protected void setCustom(java.lang.Object obj) {
    }

    public void setProperty(androidx.constraintlayout.core.motion.MotionWidget motionWidget, float f) {
    }

    public static androidx.constraintlayout.core.motion.utils.KeyCycleOscillator makeWidgetCycle(java.lang.String str) {
        if (str.equals("pathRotate")) {
            return new androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.PathRotateSet(str);
        }
        return new androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.CoreSpline(str);
    }

    static class CoreSpline extends androidx.constraintlayout.core.motion.utils.KeyCycleOscillator {
        java.lang.String Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRangesFor;

        CoreSpline(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRangesFor = androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.getId(str);
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(androidx.constraintlayout.core.motion.MotionWidget motionWidget, float f) {
            motionWidget.setValue(this.getHighSpeedVideoFpsRangesFor, get(f));
        }
    }

    public static class PathRotateSet extends androidx.constraintlayout.core.motion.utils.KeyCycleOscillator {
        java.lang.String getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        public PathRotateSet(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighSpeedVideoSizes = androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.getId(str);
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(androidx.constraintlayout.core.motion.MotionWidget motionWidget, float f) {
            motionWidget.setValue(this.getHighSpeedVideoSizes, get(f));
        }

        public void setPathRotate(androidx.constraintlayout.core.motion.MotionWidget motionWidget, float f, double d, double d2) {
            motionWidget.setRotationZ(get(f) + ((float) java.lang.Math.toDegrees(java.lang.Math.atan2(d2, d))));
        }
    }

    public boolean variesByPath() {
        return this.mVariesBy == 1;
    }

    static class WavePoint {
        float Camera2StreamConfigurationMap;
        float getHighResolutionOutputSizeshNQ4ISI;
        float getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        float getHighSpeedVideoSizes;

        WavePoint(int i, float f, float f2, float f3, float f4) {
            this.getHighSpeedVideoFpsRangesFor = i;
            this.Camera2StreamConfigurationMap = f4;
            this.getHighResolutionOutputSizeshNQ4ISI = f2;
            this.getHighSpeedVideoSizes = f;
            this.getHighSpeedVideoFpsRanges = f3;
        }
    }

    public java.lang.String toString() {
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("##.##");
        java.util.Iterator<androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.WavePoint> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.WavePoint next = it.next();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append("[");
            sb.append(next.getHighSpeedVideoFpsRangesFor);
            sb.append(" , ");
            sb.append(decimalFormat.format(next.Camera2StreamConfigurationMap));
            sb.append("] ");
            str = sb.toString();
        }
        return str;
    }

    public void setType(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    public float get(float f) {
        androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.CycleOscillator cycleOscillator = this.getHighSpeedVideoFpsRangesFor;
        androidx.constraintlayout.core.motion.utils.CurveFit curveFit = cycleOscillator.Camera2StreamConfigurationMap;
        if (curveFit != null) {
            curveFit.getPos(f, cycleOscillator.getOutputFormats);
        } else {
            double[] dArr = cycleOscillator.getOutputFormats;
            dArr[0] = cycleOscillator.getHighSpeedVideoFpsRangesFor[0];
            dArr[1] = cycleOscillator.getOutputMinFrameDuration[0];
            dArr[2] = cycleOscillator.getOutputStallDurationlomOqCM[0];
        }
        double[] dArr2 = cycleOscillator.getOutputFormats;
        double d = dArr2[0];
        java.util.Objects.requireNonNull(cycleOscillator);
        return (float) (d + (cycleOscillator.getHighSpeedVideoFpsRanges.getValue(f, dArr2[1]) * cycleOscillator.getOutputFormats[2]));
    }

    public float getSlope(float f) {
        androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.CycleOscillator cycleOscillator = this.getHighSpeedVideoFpsRangesFor;
        androidx.constraintlayout.core.motion.utils.CurveFit curveFit = cycleOscillator.Camera2StreamConfigurationMap;
        if (curveFit != null) {
            double d = f;
            curveFit.getSlope(d, cycleOscillator.getInputSizeshNQ4ISI);
            cycleOscillator.Camera2StreamConfigurationMap.getPos(d, cycleOscillator.getOutputFormats);
        } else {
            double[] dArr = cycleOscillator.getInputSizeshNQ4ISI;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
            dArr[2] = 0.0d;
        }
        double d2 = f;
        double value = cycleOscillator.getHighSpeedVideoFpsRanges.getValue(d2, cycleOscillator.getOutputFormats[1]);
        double slope = cycleOscillator.getHighSpeedVideoFpsRanges.getSlope(d2, cycleOscillator.getOutputFormats[1], cycleOscillator.getInputSizeshNQ4ISI[1]);
        double[] dArr2 = cycleOscillator.getInputSizeshNQ4ISI;
        return (float) (dArr2[0] + (value * dArr2[2]) + (slope * cycleOscillator.getOutputFormats[2]));
    }

    public androidx.constraintlayout.core.motion.utils.CurveFit getCurveFit() {
        return this.getHighSpeedVideoSizes;
    }

    public void setPoint(int i, int i2, java.lang.String str, int i3, float f, float f2, float f3, float f4, java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges.add(new androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.WavePoint(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.mVariesBy = i3;
        }
        this.Camera2StreamConfigurationMap = i2;
        setCustom(obj);
        this.getHighSpeedVideoSizesFor = str;
    }

    public void setPoint(int i, int i2, java.lang.String str, int i3, float f, float f2, float f3, float f4) {
        this.getHighSpeedVideoFpsRanges.add(new androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.WavePoint(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.mVariesBy = i3;
        }
        this.Camera2StreamConfigurationMap = i2;
        this.getHighSpeedVideoSizesFor = str;
    }

    public void setup(float f) {
        int size = this.getHighSpeedVideoFpsRanges.size();
        if (size == 0) {
            return;
        }
        java.util.Collections.sort(this.getHighSpeedVideoFpsRanges, new java.util.Comparator<androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.WavePoint>() { // from class: androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.1
            @Override // java.util.Comparator
            public /* bridge */ /* synthetic */ int compare(androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.WavePoint wavePoint, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.WavePoint wavePoint2) {
                return java.lang.Integer.compare(wavePoint.getHighSpeedVideoFpsRangesFor, wavePoint2.getHighSpeedVideoFpsRangesFor);
            }
        });
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, size, 3);
        this.getHighSpeedVideoFpsRangesFor = new androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.CycleOscillator(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, this.mVariesBy, size);
        java.util.Iterator<androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.WavePoint> it = this.getHighSpeedVideoFpsRanges.iterator();
        int i = 0;
        while (it.hasNext()) {
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.WavePoint next = it.next();
            dArr[i] = next.getHighSpeedVideoSizes * 0.01d;
            dArr2[i][0] = next.Camera2StreamConfigurationMap;
            dArr2[i][1] = next.getHighResolutionOutputSizeshNQ4ISI;
            dArr2[i][2] = next.getHighSpeedVideoFpsRanges;
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.CycleOscillator cycleOscillator = this.getHighSpeedVideoFpsRangesFor;
            int i2 = next.getHighSpeedVideoFpsRangesFor;
            float f2 = next.getHighSpeedVideoSizes;
            float f3 = next.getHighResolutionOutputSizeshNQ4ISI;
            float f4 = next.getHighSpeedVideoFpsRanges;
            float f5 = next.Camera2StreamConfigurationMap;
            cycleOscillator.getInputFormats[i] = i2 / 100.0d;
            cycleOscillator.getHighSpeedVideoSizes[i] = f2;
            cycleOscillator.getHighSpeedVideoFpsRangesFor[i] = f3;
            cycleOscillator.getOutputMinFrameDuration[i] = f4;
            cycleOscillator.getOutputStallDurationlomOqCM[i] = f5;
            i++;
            dArr2 = dArr2;
        }
        double[][] dArr3 = dArr2;
        androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.CycleOscillator cycleOscillator2 = this.getHighSpeedVideoFpsRangesFor;
        cycleOscillator2.getHighResolutionOutputSizeshNQ4ISI = f;
        double[][] dArr4 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, cycleOscillator2.getInputFormats.length, 3);
        float[] fArr = cycleOscillator2.getOutputStallDurationlomOqCM;
        cycleOscillator2.getOutputFormats = new double[fArr.length + 2];
        cycleOscillator2.getInputSizeshNQ4ISI = new double[fArr.length + 2];
        if (cycleOscillator2.getInputFormats[0] > 0.0d) {
            cycleOscillator2.getHighSpeedVideoFpsRanges.addPoint(0.0d, cycleOscillator2.getHighSpeedVideoSizes[0]);
        }
        double[] dArr5 = cycleOscillator2.getInputFormats;
        int length = dArr5.length - 1;
        if (dArr5[length] < 1.0d) {
            cycleOscillator2.getHighSpeedVideoFpsRanges.addPoint(1.0d, cycleOscillator2.getHighSpeedVideoSizes[length]);
        }
        for (int i3 = 0; i3 < dArr4.length; i3++) {
            double[] dArr6 = dArr4[i3];
            dArr6[0] = cycleOscillator2.getHighSpeedVideoFpsRangesFor[i3];
            dArr6[1] = cycleOscillator2.getOutputMinFrameDuration[i3];
            dArr6[2] = cycleOscillator2.getOutputStallDurationlomOqCM[i3];
            cycleOscillator2.getHighSpeedVideoFpsRanges.addPoint(cycleOscillator2.getInputFormats[i3], cycleOscillator2.getHighSpeedVideoSizes[i3]);
        }
        cycleOscillator2.getHighSpeedVideoFpsRanges.normalize();
        double[] dArr7 = cycleOscillator2.getInputFormats;
        if (dArr7.length > 1) {
            cycleOscillator2.Camera2StreamConfigurationMap = androidx.constraintlayout.core.motion.utils.CurveFit.get(0, dArr7, dArr4);
        } else {
            cycleOscillator2.Camera2StreamConfigurationMap = null;
        }
        this.getHighSpeedVideoSizes = androidx.constraintlayout.core.motion.utils.CurveFit.get(0, dArr, dArr3);
    }

    static class CycleOscillator {
        androidx.constraintlayout.core.motion.utils.CurveFit Camera2StreamConfigurationMap;
        float getHighResolutionOutputSizeshNQ4ISI;
        androidx.constraintlayout.core.motion.utils.Oscillator getHighSpeedVideoFpsRanges;
        float[] getHighSpeedVideoFpsRangesFor;
        float[] getHighSpeedVideoSizes;
        float[] getHighSpeedVideoSizesFor;
        double[] getInputFormats;
        double[] getInputSizeshNQ4ISI;
        double[] getOutputFormats;
        float[] getOutputMinFrameDuration;
        int getOutputMinFrameDurationlomOqCM;
        private final int getOutputSizes;
        private final int getOutputSizeshNQ4ISI;
        private final int getOutputStallDuration;
        float[] getOutputStallDurationlomOqCM;
        private final int unwrapAs;

        CycleOscillator(int i, java.lang.String str, int i2, int i3) {
            androidx.constraintlayout.core.motion.utils.Oscillator oscillator = new androidx.constraintlayout.core.motion.utils.Oscillator();
            this.getHighSpeedVideoFpsRanges = oscillator;
            this.getOutputSizes = 0;
            this.getOutputStallDuration = 1;
            this.getOutputSizeshNQ4ISI = 2;
            this.getOutputMinFrameDurationlomOqCM = i;
            this.unwrapAs = i2;
            oscillator.setType(i, str);
            this.getOutputStallDurationlomOqCM = new float[i3];
            this.getInputFormats = new double[i3];
            this.getHighSpeedVideoSizes = new float[i3];
            this.getHighSpeedVideoFpsRangesFor = new float[i3];
            this.getOutputMinFrameDuration = new float[i3];
            this.getHighSpeedVideoSizesFor = new float[i3];
        }
    }
}

package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes6.dex */
public class SpringStopEngine implements androidx.constraintlayout.core.motion.utils.StopEngine {
    private float getHighResolutionOutputSizeshNQ4ISI;
    private double getHighSpeedVideoSizes;
    private float getHighSpeedVideoSizesFor;
    private double getInputFormats;
    private float getInputSizeshNQ4ISI;
    private double getOutputFormats;
    private float getOutputMinFrameDuration;
    private float getOutputMinFrameDurationlomOqCM;
    double getHighSpeedVideoFpsRanges = 0.5d;
    private boolean getHighSpeedVideoFpsRangesFor = false;
    private int Camera2StreamConfigurationMap = 0;

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public java.lang.String debug(java.lang.String str, float f) {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return 0.0f;
    }

    public void springConfig(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        this.getInputFormats = f2;
        this.getHighSpeedVideoFpsRanges = f6;
        this.getHighSpeedVideoFpsRangesFor = false;
        this.getInputSizeshNQ4ISI = f;
        this.getHighSpeedVideoSizes = f3;
        this.getOutputFormats = f5;
        this.getOutputMinFrameDuration = f4;
        this.getHighSpeedVideoSizesFor = f7;
        this.Camera2StreamConfigurationMap = i;
        this.getHighResolutionOutputSizeshNQ4ISI = 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f) {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f) {
        androidx.constraintlayout.core.motion.utils.SpringStopEngine springStopEngine = this;
        double d = f - springStopEngine.getHighResolutionOutputSizeshNQ4ISI;
        if (d > 0.0d) {
            double d2 = springStopEngine.getOutputFormats;
            double d3 = springStopEngine.getHighSpeedVideoFpsRanges;
            int sqrt = (int) ((9.0d / ((java.lang.Math.sqrt(d2 / springStopEngine.getOutputMinFrameDuration) * d) * 4.0d)) + 1.0d);
            double d4 = d / sqrt;
            int i = 0;
            while (i < sqrt) {
                float f2 = springStopEngine.getInputSizeshNQ4ISI;
                double d5 = f2;
                double d6 = springStopEngine.getInputFormats;
                int i2 = sqrt;
                int i3 = i;
                double d7 = -d2;
                float f3 = springStopEngine.getOutputMinFrameDurationlomOqCM;
                double d8 = d2;
                double d9 = f3;
                double d10 = springStopEngine.getOutputMinFrameDuration;
                double d11 = (((((d7 * (d5 - d6)) - (d9 * d3)) / d10) * d4) / 2.0d) + d9;
                double d12 = ((((-((d5 + ((d4 * d11) / 2.0d)) - d6)) * d8) - (d11 * d3)) / d10) * d4;
                float f4 = f3 + ((float) d12);
                this.getOutputMinFrameDurationlomOqCM = f4;
                float f5 = f2 + ((float) ((d9 + (d12 / 2.0d)) * d4));
                this.getInputSizeshNQ4ISI = f5;
                int i4 = this.Camera2StreamConfigurationMap;
                if (i4 > 0) {
                    if (f5 < 0.0f && (i4 & 1) == 1) {
                        this.getInputSizeshNQ4ISI = -f5;
                        this.getOutputMinFrameDurationlomOqCM = -f4;
                    }
                    float f6 = this.getInputSizeshNQ4ISI;
                    if (f6 > 1.0f && (i4 & 2) == 2) {
                        this.getInputSizeshNQ4ISI = 2.0f - f6;
                        this.getOutputMinFrameDurationlomOqCM = -this.getOutputMinFrameDurationlomOqCM;
                    }
                }
                i = i3 + 1;
                springStopEngine = this;
                sqrt = i2;
                d2 = d8;
            }
        }
        androidx.constraintlayout.core.motion.utils.SpringStopEngine springStopEngine2 = springStopEngine;
        springStopEngine2.getHighResolutionOutputSizeshNQ4ISI = f;
        if (isStopped()) {
            springStopEngine2.getInputSizeshNQ4ISI = (float) springStopEngine2.getInputFormats;
        }
        return springStopEngine2.getInputSizeshNQ4ISI;
    }

    public float getAcceleration() {
        return ((float) (((-this.getOutputFormats) * (this.getInputSizeshNQ4ISI - this.getInputFormats)) - (this.getHighSpeedVideoFpsRanges * this.getOutputMinFrameDurationlomOqCM))) / this.getOutputMinFrameDuration;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        double d = this.getInputSizeshNQ4ISI - this.getInputFormats;
        double d2 = this.getOutputFormats;
        double d3 = this.getOutputMinFrameDurationlomOqCM;
        return java.lang.Math.sqrt((((d3 * d3) * ((double) this.getOutputMinFrameDuration)) + ((d2 * d) * d)) / d2) <= ((double) this.getHighSpeedVideoSizesFor);
    }
}

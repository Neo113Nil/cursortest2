package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes6.dex */
public class VelocityMatrix {
    float Camera2StreamConfigurationMap;
    float getHighResolutionOutputSizeshNQ4ISI;
    float getHighSpeedVideoFpsRanges;
    float getHighSpeedVideoFpsRangesFor;
    float getHighSpeedVideoSizes;
    float getInputSizeshNQ4ISI;

    public void clear() {
        this.getHighResolutionOutputSizeshNQ4ISI = 0.0f;
        this.getHighSpeedVideoSizes = 0.0f;
        this.getHighSpeedVideoFpsRanges = 0.0f;
        this.getHighSpeedVideoFpsRangesFor = 0.0f;
        this.Camera2StreamConfigurationMap = 0.0f;
    }

    public void setRotationVelocity(androidx.constraintlayout.core.motion.utils.SplineSet splineSet, float f) {
        if (splineSet != null) {
            this.getHighResolutionOutputSizeshNQ4ISI = splineSet.getSlope(f);
            this.getInputSizeshNQ4ISI = splineSet.get(f);
        }
    }

    public void setTranslationVelocity(androidx.constraintlayout.core.motion.utils.SplineSet splineSet, androidx.constraintlayout.core.motion.utils.SplineSet splineSet2, float f) {
        if (splineSet != null) {
            this.getHighSpeedVideoFpsRanges = splineSet.getSlope(f);
        }
        if (splineSet2 != null) {
            this.getHighSpeedVideoSizes = splineSet2.getSlope(f);
        }
    }

    public void setScaleVelocity(androidx.constraintlayout.core.motion.utils.SplineSet splineSet, androidx.constraintlayout.core.motion.utils.SplineSet splineSet2, float f) {
        if (splineSet != null) {
            this.Camera2StreamConfigurationMap = splineSet.getSlope(f);
        }
        if (splineSet2 != null) {
            this.getHighSpeedVideoFpsRangesFor = splineSet2.getSlope(f);
        }
    }

    public void setRotationVelocity(androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator, float f) {
        if (keyCycleOscillator != null) {
            this.getHighResolutionOutputSizeshNQ4ISI = keyCycleOscillator.getSlope(f);
        }
    }

    public void setTranslationVelocity(androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator2, float f) {
        if (keyCycleOscillator != null) {
            this.getHighSpeedVideoFpsRanges = keyCycleOscillator.getSlope(f);
        }
        if (keyCycleOscillator2 != null) {
            this.getHighSpeedVideoSizes = keyCycleOscillator2.getSlope(f);
        }
    }

    public void setScaleVelocity(androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator2, float f) {
        if (keyCycleOscillator != null) {
            this.Camera2StreamConfigurationMap = keyCycleOscillator.getSlope(f);
        }
        if (keyCycleOscillator2 != null) {
            this.getHighSpeedVideoFpsRangesFor = keyCycleOscillator2.getSlope(f);
        }
    }

    public void applyTransform(float f, float f2, int i, int i2, float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f2 - 0.5f) * 2.0f;
        float f6 = this.getHighSpeedVideoFpsRanges;
        float f7 = this.getHighSpeedVideoSizes;
        float f8 = this.Camera2StreamConfigurationMap;
        float f9 = this.getHighSpeedVideoFpsRangesFor;
        float radians = (float) java.lang.Math.toRadians(this.getInputSizeshNQ4ISI);
        float radians2 = (float) java.lang.Math.toRadians(this.getHighResolutionOutputSizeshNQ4ISI);
        double d = radians;
        double d2 = i2 * f5;
        float sin = (float) ((((-i) * r7) * java.lang.Math.sin(d)) - (java.lang.Math.cos(d) * d2));
        float cos = (float) (((i * r7) * java.lang.Math.cos(d)) - (d2 * java.lang.Math.sin(d)));
        fArr[0] = f3 + f6 + (f8 * (f - 0.5f) * 2.0f) + (sin * radians2);
        fArr[1] = f4 + f7 + (f9 * f5) + (radians2 * cos);
    }
}

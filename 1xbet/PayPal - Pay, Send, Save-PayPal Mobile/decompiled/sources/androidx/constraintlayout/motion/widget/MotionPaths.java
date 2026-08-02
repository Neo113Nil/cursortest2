package androidx.constraintlayout.motion.widget;

/* loaded from: classes7.dex */
class MotionPaths implements java.lang.Comparable<androidx.constraintlayout.motion.widget.MotionPaths> {
    static java.lang.String[] getHighSpeedVideoFpsRanges = {com.daon.sdk.face.license.License.FEATURE_POSITION, "x", "y", "width", "height", "pathRotate"};
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> getHighSpeedVideoSizes;
    androidx.constraintlayout.core.motion.utils.Easing getHighSpeedVideoSizesFor;
    int getInputFormats;
    float getInputSizeshNQ4ISI;
    float getOutputFormats;
    int getOutputMinFrameDuration;
    float getOutputMinFrameDurationlomOqCM;
    androidx.constraintlayout.motion.widget.MotionController getOutputSizes;
    float getOutputSizeshNQ4ISI;
    float getOutputStallDuration;
    double[] getOutputStallDurationlomOqCM;
    double[] getValidOutputFormatsForInputhNQ4ISI;
    float isOutputSupportedFor;
    float isOutputSupportedForhNQ4ISI;
    float toString;
    float unwrapAs;

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(androidx.constraintlayout.motion.widget.MotionPaths motionPaths) {
        return java.lang.Float.compare(this.getOutputMinFrameDurationlomOqCM, motionPaths.getOutputMinFrameDurationlomOqCM);
    }

    MotionPaths() {
        this.Camera2StreamConfigurationMap = 0;
        this.getInputSizeshNQ4ISI = Float.NaN;
        this.getOutputStallDuration = Float.NaN;
        this.getInputFormats = androidx.constraintlayout.motion.widget.Key.UNSET;
        this.getHighSpeedVideoFpsRangesFor = androidx.constraintlayout.motion.widget.Key.UNSET;
        this.getOutputSizeshNQ4ISI = Float.NaN;
        this.getOutputSizes = null;
        this.getHighSpeedVideoSizes = new java.util.LinkedHashMap<>();
        this.getOutputMinFrameDuration = 0;
        this.getValidOutputFormatsForInputhNQ4ISI = new double[18];
        this.getOutputStallDurationlomOqCM = new double[18];
    }

    MotionPaths(int i, int i2, androidx.constraintlayout.motion.widget.KeyPosition keyPosition, androidx.constraintlayout.motion.widget.MotionPaths motionPaths, androidx.constraintlayout.motion.widget.MotionPaths motionPaths2) {
        int i3;
        float f;
        float min;
        float f2;
        this.Camera2StreamConfigurationMap = 0;
        this.getInputSizeshNQ4ISI = Float.NaN;
        this.getOutputStallDuration = Float.NaN;
        this.getInputFormats = androidx.constraintlayout.motion.widget.Key.UNSET;
        this.getHighSpeedVideoFpsRangesFor = androidx.constraintlayout.motion.widget.Key.UNSET;
        this.getOutputSizeshNQ4ISI = Float.NaN;
        this.getOutputSizes = null;
        this.getHighSpeedVideoSizes = new java.util.LinkedHashMap<>();
        this.getOutputMinFrameDuration = 0;
        this.getValidOutputFormatsForInputhNQ4ISI = new double[18];
        this.getOutputStallDurationlomOqCM = new double[18];
        if (motionPaths.getHighSpeedVideoFpsRangesFor == androidx.constraintlayout.motion.widget.Key.UNSET) {
            int i4 = keyPosition.getOutputStallDurationlomOqCM;
            if (i4 == 1) {
                float f3 = keyPosition.getHighResolutionOutputSizeshNQ4ISI / 100.0f;
                this.isOutputSupportedForhNQ4ISI = f3;
                this.Camera2StreamConfigurationMap = keyPosition.getInputFormats;
                float f4 = java.lang.Float.isNaN(keyPosition.getOutputMinFrameDuration) ? f3 : keyPosition.getOutputMinFrameDuration;
                float f5 = java.lang.Float.isNaN(keyPosition.getInputSizeshNQ4ISI) ? f3 : keyPosition.getInputSizeshNQ4ISI;
                float f6 = motionPaths2.unwrapAs;
                float f7 = motionPaths.unwrapAs;
                float f8 = motionPaths2.getOutputFormats;
                float f9 = motionPaths.getOutputFormats;
                this.getOutputMinFrameDurationlomOqCM = this.isOutputSupportedForhNQ4ISI;
                f3 = java.lang.Float.isNaN(keyPosition.getOutputStallDuration) ? f3 : keyPosition.getOutputStallDuration;
                float f10 = motionPaths.isOutputSupportedFor;
                float f11 = motionPaths.unwrapAs;
                float f12 = motionPaths.toString;
                float f13 = motionPaths.getOutputFormats;
                float f14 = (motionPaths2.isOutputSupportedFor + (motionPaths2.unwrapAs / 2.0f)) - ((f11 / 2.0f) + f10);
                float f15 = (motionPaths2.toString + (motionPaths2.getOutputFormats / 2.0f)) - ((f13 / 2.0f) + f12);
                float f16 = f14 * f3;
                float f17 = ((f6 - f7) * f4) / 2.0f;
                this.isOutputSupportedFor = (int) ((f10 + f16) - f17);
                float f18 = f3 * f15;
                float f19 = ((f8 - f9) * f5) / 2.0f;
                this.toString = (int) ((f12 + f18) - f19);
                this.unwrapAs = (int) (f11 + r7);
                this.getOutputFormats = (int) (f13 + r9);
                float f20 = java.lang.Float.isNaN(keyPosition.getOutputMinFrameDurationlomOqCM) ? 0.0f : keyPosition.getOutputMinFrameDurationlomOqCM;
                this.getOutputMinFrameDuration = 1;
                float f21 = (int) ((motionPaths.isOutputSupportedFor + f16) - f17);
                this.isOutputSupportedFor = f21;
                float f22 = (int) ((motionPaths.toString + f18) - f19);
                this.isOutputSupportedFor = f21 + ((-f15) * f20);
                this.toString = f22 + (f14 * f20);
                this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoSizesFor = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(keyPosition.getOutputSizeshNQ4ISI);
                this.getInputFormats = keyPosition.getHighSpeedVideoSizesFor;
                return;
            }
            if (i4 == 2) {
                float f23 = keyPosition.getHighResolutionOutputSizeshNQ4ISI / 100.0f;
                this.isOutputSupportedForhNQ4ISI = f23;
                this.Camera2StreamConfigurationMap = keyPosition.getInputFormats;
                float f24 = java.lang.Float.isNaN(keyPosition.getOutputMinFrameDuration) ? f23 : keyPosition.getOutputMinFrameDuration;
                float f25 = java.lang.Float.isNaN(keyPosition.getInputSizeshNQ4ISI) ? f23 : keyPosition.getInputSizeshNQ4ISI;
                float f26 = motionPaths2.unwrapAs;
                float f27 = motionPaths.unwrapAs;
                float f28 = motionPaths2.getOutputFormats;
                float f29 = motionPaths.getOutputFormats;
                this.getOutputMinFrameDurationlomOqCM = this.isOutputSupportedForhNQ4ISI;
                float f30 = motionPaths.isOutputSupportedFor;
                float f31 = motionPaths.toString;
                float f32 = motionPaths2.isOutputSupportedFor;
                float f33 = f26 / 2.0f;
                float f34 = motionPaths2.toString;
                float f35 = f28 / 2.0f;
                float f36 = (f26 - f27) * f24;
                this.isOutputSupportedFor = (int) ((f30 + (((f32 + f33) - ((f27 / 2.0f) + f30)) * f23)) - (f36 / 2.0f));
                float f37 = (f28 - f29) * f25;
                this.toString = (int) ((f31 + (((f34 + f35) - ((f29 / 2.0f) + f31)) * f23)) - (f37 / 2.0f));
                this.unwrapAs = (int) (f27 + f36);
                this.getOutputFormats = (int) (f29 + f37);
                this.getOutputMinFrameDuration = 2;
                if (!java.lang.Float.isNaN(keyPosition.getOutputStallDuration)) {
                    this.isOutputSupportedFor = (int) (keyPosition.getOutputStallDuration * (i - ((int) this.unwrapAs)));
                }
                if (!java.lang.Float.isNaN(keyPosition.getOutputMinFrameDurationlomOqCM)) {
                    this.toString = (int) (keyPosition.getOutputMinFrameDurationlomOqCM * (i2 - ((int) this.getOutputFormats)));
                }
                this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoSizesFor = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(keyPosition.getOutputSizeshNQ4ISI);
                this.getInputFormats = keyPosition.getHighSpeedVideoSizesFor;
                return;
            }
            if (i4 != 3) {
                float f38 = keyPosition.getHighResolutionOutputSizeshNQ4ISI / 100.0f;
                this.isOutputSupportedForhNQ4ISI = f38;
                this.Camera2StreamConfigurationMap = keyPosition.getInputFormats;
                float f39 = java.lang.Float.isNaN(keyPosition.getOutputMinFrameDuration) ? f38 : keyPosition.getOutputMinFrameDuration;
                float f40 = java.lang.Float.isNaN(keyPosition.getInputSizeshNQ4ISI) ? f38 : keyPosition.getInputSizeshNQ4ISI;
                float f41 = motionPaths2.unwrapAs;
                float f42 = motionPaths.unwrapAs;
                float f43 = motionPaths2.getOutputFormats;
                float f44 = motionPaths.getOutputFormats;
                this.getOutputMinFrameDurationlomOqCM = this.isOutputSupportedForhNQ4ISI;
                float f45 = motionPaths.isOutputSupportedFor;
                float f46 = motionPaths.toString;
                float f47 = (motionPaths2.isOutputSupportedFor + (f41 / 2.0f)) - ((f42 / 2.0f) + f45);
                float f48 = (motionPaths2.toString + (f43 / 2.0f)) - (f46 + (f44 / 2.0f));
                float f49 = ((f41 - f42) * f39) / 2.0f;
                this.isOutputSupportedFor = (int) ((f45 + (f47 * f38)) - f49);
                float f50 = ((f43 - f44) * f40) / 2.0f;
                this.toString = (int) ((f46 + (f48 * f38)) - f50);
                this.unwrapAs = (int) (f42 + r8);
                this.getOutputFormats = (int) (f44 + r12);
                float f51 = java.lang.Float.isNaN(keyPosition.getOutputStallDuration) ? f38 : keyPosition.getOutputStallDuration;
                float f52 = java.lang.Float.isNaN(keyPosition.getOutputFormats) ? 0.0f : keyPosition.getOutputFormats;
                f38 = java.lang.Float.isNaN(keyPosition.getOutputMinFrameDurationlomOqCM) ? f38 : keyPosition.getOutputMinFrameDurationlomOqCM;
                float f53 = !java.lang.Float.isNaN(keyPosition.getHighSpeedVideoFpsRangesFor) ? keyPosition.getHighSpeedVideoFpsRangesFor : 0.0f;
                this.getOutputMinFrameDuration = 0;
                this.isOutputSupportedFor = (int) (((motionPaths.isOutputSupportedFor + (f51 * f47)) + (f53 * f48)) - f49);
                this.toString = (int) (((motionPaths.toString + (f47 * f52)) + (f48 * f38)) - f50);
                this.getHighSpeedVideoSizesFor = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(keyPosition.getOutputSizeshNQ4ISI);
                this.getInputFormats = keyPosition.getHighSpeedVideoSizesFor;
                return;
            }
            float f54 = keyPosition.getHighResolutionOutputSizeshNQ4ISI / 100.0f;
            this.isOutputSupportedForhNQ4ISI = f54;
            this.Camera2StreamConfigurationMap = keyPosition.getInputFormats;
            float f55 = java.lang.Float.isNaN(keyPosition.getOutputMinFrameDuration) ? f54 : keyPosition.getOutputMinFrameDuration;
            float f56 = java.lang.Float.isNaN(keyPosition.getInputSizeshNQ4ISI) ? f54 : keyPosition.getInputSizeshNQ4ISI;
            float f57 = motionPaths2.unwrapAs;
            float f58 = motionPaths.unwrapAs;
            float f59 = motionPaths2.getOutputFormats;
            float f60 = motionPaths.getOutputFormats;
            this.getOutputMinFrameDurationlomOqCM = this.isOutputSupportedForhNQ4ISI;
            float f61 = (f58 / 2.0f) + motionPaths.isOutputSupportedFor;
            float f62 = (f60 / 2.0f) + motionPaths.toString;
            float f63 = motionPaths2.isOutputSupportedFor + (f57 / 2.0f);
            float f64 = motionPaths2.toString + (f59 / 2.0f);
            if (f61 > f63) {
                f61 = f63;
                f63 = f61;
            }
            if (f62 <= f64) {
                f62 = f64;
                f64 = f62;
            }
            float f65 = f63 - f61;
            float f66 = f62 - f64;
            float f67 = ((f57 - f58) * f55) / 2.0f;
            this.isOutputSupportedFor = (int) ((r12 + (f65 * f54)) - f67);
            float f68 = ((f59 - f60) * f56) / 2.0f;
            this.toString = (int) ((r14 + (f66 * f54)) - f68);
            this.unwrapAs = (int) (f58 + r7);
            this.getOutputFormats = (int) (f60 + r9);
            float f69 = java.lang.Float.isNaN(keyPosition.getOutputStallDuration) ? f54 : keyPosition.getOutputStallDuration;
            float f70 = java.lang.Float.isNaN(keyPosition.getOutputFormats) ? 0.0f : keyPosition.getOutputFormats;
            f54 = java.lang.Float.isNaN(keyPosition.getOutputMinFrameDurationlomOqCM) ? f54 : keyPosition.getOutputMinFrameDurationlomOqCM;
            if (java.lang.Float.isNaN(keyPosition.getHighSpeedVideoFpsRangesFor)) {
                i3 = 0;
                f = 0.0f;
            } else {
                f = keyPosition.getHighSpeedVideoFpsRangesFor;
                i3 = 0;
            }
            this.getOutputMinFrameDuration = i3;
            this.isOutputSupportedFor = (int) (((motionPaths.isOutputSupportedFor + (f69 * f65)) + (f * f66)) - f67);
            this.toString = (int) (((motionPaths.toString + (f65 * f70)) + (f66 * f54)) - f68);
            this.getHighSpeedVideoSizesFor = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(keyPosition.getOutputSizeshNQ4ISI);
            this.getInputFormats = keyPosition.getHighSpeedVideoSizesFor;
            return;
        }
        float f71 = keyPosition.getHighResolutionOutputSizeshNQ4ISI / 100.0f;
        this.isOutputSupportedForhNQ4ISI = f71;
        this.Camera2StreamConfigurationMap = keyPosition.getInputFormats;
        this.getOutputMinFrameDuration = keyPosition.getOutputStallDurationlomOqCM;
        float f72 = java.lang.Float.isNaN(keyPosition.getOutputMinFrameDuration) ? f71 : keyPosition.getOutputMinFrameDuration;
        float f73 = java.lang.Float.isNaN(keyPosition.getInputSizeshNQ4ISI) ? f71 : keyPosition.getInputSizeshNQ4ISI;
        float f74 = motionPaths2.unwrapAs;
        float f75 = motionPaths.unwrapAs;
        float f76 = motionPaths2.getOutputFormats;
        float f77 = motionPaths.getOutputFormats;
        this.getOutputMinFrameDurationlomOqCM = this.isOutputSupportedForhNQ4ISI;
        this.unwrapAs = (int) (f75 + ((f74 - f75) * f72));
        this.getOutputFormats = (int) (f77 + ((f76 - f77) * f73));
        if (keyPosition.getOutputStallDurationlomOqCM == 2) {
            if (java.lang.Float.isNaN(keyPosition.getOutputStallDuration)) {
                float f78 = motionPaths2.isOutputSupportedFor;
                float f79 = motionPaths.isOutputSupportedFor;
                min = ((f78 - f79) * f71) + f79;
            } else {
                min = java.lang.Math.min(f73, f72) * keyPosition.getOutputStallDuration;
            }
            this.isOutputSupportedFor = min;
            if (java.lang.Float.isNaN(keyPosition.getOutputMinFrameDurationlomOqCM)) {
                float f80 = motionPaths2.toString;
                float f81 = motionPaths.toString;
                f2 = (f71 * (f80 - f81)) + f81;
            } else {
                f2 = keyPosition.getOutputMinFrameDurationlomOqCM;
            }
            this.toString = f2;
        } else {
            float f82 = java.lang.Float.isNaN(keyPosition.getOutputStallDuration) ? f71 : keyPosition.getOutputStallDuration;
            float f83 = motionPaths2.isOutputSupportedFor;
            float f84 = motionPaths.isOutputSupportedFor;
            this.isOutputSupportedFor = (f82 * (f83 - f84)) + f84;
            f71 = java.lang.Float.isNaN(keyPosition.getOutputMinFrameDurationlomOqCM) ? f71 : keyPosition.getOutputMinFrameDurationlomOqCM;
            float f85 = motionPaths2.toString;
            float f86 = motionPaths.toString;
            this.toString = (f71 * (f85 - f86)) + f86;
        }
        this.getHighSpeedVideoFpsRangesFor = motionPaths.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizesFor = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(keyPosition.getOutputSizeshNQ4ISI);
        this.getInputFormats = keyPosition.getHighSpeedVideoSizesFor;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.constraintlayout.motion.widget.MotionController motionController, androidx.constraintlayout.motion.widget.MotionPaths motionPaths) {
        double d = ((this.isOutputSupportedFor + (this.unwrapAs / 2.0f)) - motionPaths.isOutputSupportedFor) - (motionPaths.unwrapAs / 2.0f);
        double d2 = ((this.toString + (this.getOutputFormats / 2.0f)) - motionPaths.toString) - (motionPaths.getOutputFormats / 2.0f);
        this.getOutputSizes = motionController;
        this.isOutputSupportedFor = (float) java.lang.Math.hypot(d2, d);
        if (java.lang.Float.isNaN(this.getOutputSizeshNQ4ISI)) {
            this.toString = (float) (java.lang.Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.toString = (float) java.lang.Math.toRadians(this.getOutputSizeshNQ4ISI);
        }
    }

    static boolean getHighSpeedVideoFpsRanges(float f, float f2) {
        return (java.lang.Float.isNaN(f) || java.lang.Float.isNaN(f2)) ? java.lang.Float.isNaN(f) != java.lang.Float.isNaN(f2) : java.lang.Math.abs(f - f2) > 1.0E-6f;
    }

    final void Camera2StreamConfigurationMap(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.isOutputSupportedFor;
        float f2 = this.toString;
        float f3 = this.unwrapAs;
        float f4 = this.getOutputFormats;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        androidx.constraintlayout.motion.widget.MotionController motionController = this.getOutputSizes;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.getCenter(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = f6;
            double d3 = f;
            double d4 = f2;
            f = (float) ((d2 + (java.lang.Math.sin(d4) * d3)) - (f3 / 2.0f));
            f2 = (float) ((f7 - (d3 * java.lang.Math.cos(d4))) - (f4 / 2.0f));
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    final void Camera2StreamConfigurationMap(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.isOutputSupportedFor;
        float f2 = this.toString;
        float f3 = this.unwrapAs;
        float f4 = this.getOutputFormats;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        androidx.constraintlayout.motion.widget.MotionController motionController = this.getOutputSizes;
        if (motionController != null) {
            float centerX = motionController.getCenterX();
            float centerY = this.getOutputSizes.getCenterY();
            double d = f;
            double d2 = f2;
            float sin = (float) ((centerX + (java.lang.Math.sin(d2) * d)) - (f3 / 2.0f));
            f2 = (float) ((centerY - (d * java.lang.Math.cos(d2))) - (f4 / 2.0f));
            f = sin;
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        float f8 = f + 0.0f;
        fArr[i] = f8;
        float f9 = f2 + 0.0f;
        fArr[i + 1] = f9;
        float f10 = f6 + 0.0f;
        fArr[i + 2] = f10;
        fArr[i + 3] = f9;
        fArr[i + 4] = f10;
        float f11 = f7 + 0.0f;
        fArr[i + 5] = f11;
        fArr[i + 6] = f8;
        fArr[i + 7] = f11;
    }

    static void getHighSpeedVideoFpsRangesFor(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((f4 * 0.0f) / 2.0f);
        float f9 = f5 - ((f6 * 0.0f) / 2.0f);
        fArr[0] = ((1.0f - f) * f8) + (((f4 * 1.0f) + f8) * f) + 0.0f;
        fArr[1] = ((1.0f - f2) * f9) + (((f6 * 1.0f) + f9) * f2) + 0.0f;
    }

    public final void getHighSpeedVideoFpsRangesFor(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint) {
        this.getHighSpeedVideoSizesFor = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(constraint.motion.mTransitionEasing);
        this.getInputFormats = constraint.motion.mPathMotionArc;
        this.getHighSpeedVideoFpsRangesFor = constraint.motion.mAnimateRelativeTo;
        this.getInputSizeshNQ4ISI = constraint.motion.mPathRotate;
        this.Camera2StreamConfigurationMap = constraint.motion.mDrawPath;
        this.getHighResolutionOutputSizeshNQ4ISI = constraint.motion.mAnimateCircleAngleTo;
        this.getOutputStallDuration = constraint.propertySet.mProgress;
        this.getOutputSizeshNQ4ISI = constraint.layout.circleAngle;
        for (java.lang.String str : constraint.mCustomConstraints.keySet()) {
            androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute != null && constraintAttribute.isContinuous()) {
                this.getHighSpeedVideoSizes.put(str, constraintAttribute);
            }
        }
    }
}

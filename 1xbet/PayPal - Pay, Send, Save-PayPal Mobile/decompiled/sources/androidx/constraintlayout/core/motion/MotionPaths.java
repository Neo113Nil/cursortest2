package androidx.constraintlayout.core.motion;

/* loaded from: classes6.dex */
public class MotionPaths implements java.lang.Comparable<androidx.constraintlayout.core.motion.MotionPaths> {
    public static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    public static final boolean OLD_WAY = false;
    public static final int PERPENDICULAR = 1;
    public static final int SCREEN = 2;
    public static final java.lang.String TAG = "MotionPaths";
    static java.lang.String[] getHighResolutionOutputSizeshNQ4ISI = {com.daon.sdk.face.license.License.FEATURE_POSITION, "x", "y", "width", "height", "pathRotate"};
    java.lang.String Camera2StreamConfigurationMap;
    java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    androidx.constraintlayout.core.motion.utils.Easing getHighSpeedVideoSizesFor;
    float getInputFormats;
    int getInputSizeshNQ4ISI;
    int getOutputFormats;
    float getOutputMinFrameDuration;
    float getOutputMinFrameDurationlomOqCM;
    androidx.constraintlayout.core.motion.Motion getOutputSizes;
    float getOutputSizeshNQ4ISI;
    float getOutputStallDuration;
    double[] getOutputStallDurationlomOqCM;
    double[] getValidOutputFormatsForInputhNQ4ISI;
    float isOutputSupportedFor;
    float isOutputSupportedForhNQ4ISI;
    public java.lang.String mId;
    float toString;
    float unwrapAs;

    public MotionPaths() {
        this.getHighSpeedVideoSizes = 0;
        this.getOutputMinFrameDuration = Float.NaN;
        this.getOutputStallDuration = Float.NaN;
        this.getOutputFormats = -1;
        this.Camera2StreamConfigurationMap = null;
        this.getOutputMinFrameDurationlomOqCM = Float.NaN;
        this.getOutputSizes = null;
        this.getHighSpeedVideoFpsRanges = new java.util.HashMap<>();
        this.getInputSizeshNQ4ISI = 0;
        this.getValidOutputFormatsForInputhNQ4ISI = new double[18];
        this.getOutputStallDurationlomOqCM = new double[18];
    }

    public MotionPaths(int i, int i2, androidx.constraintlayout.core.motion.key.MotionKeyPosition motionKeyPosition, androidx.constraintlayout.core.motion.MotionPaths motionPaths, androidx.constraintlayout.core.motion.MotionPaths motionPaths2) {
        float min;
        float f;
        this.getHighSpeedVideoSizes = 0;
        this.getOutputMinFrameDuration = Float.NaN;
        this.getOutputStallDuration = Float.NaN;
        this.getOutputFormats = -1;
        this.Camera2StreamConfigurationMap = null;
        this.getOutputMinFrameDurationlomOqCM = Float.NaN;
        this.getOutputSizes = null;
        this.getHighSpeedVideoFpsRanges = new java.util.HashMap<>();
        this.getInputSizeshNQ4ISI = 0;
        this.getValidOutputFormatsForInputhNQ4ISI = new double[18];
        this.getOutputStallDurationlomOqCM = new double[18];
        if (motionPaths.Camera2StreamConfigurationMap == null) {
            int i3 = motionKeyPosition.mPositionType;
            if (i3 == 1) {
                float f2 = motionKeyPosition.mFramePosition / 100.0f;
                this.toString = f2;
                this.getHighSpeedVideoSizes = motionKeyPosition.mDrawPath;
                float f3 = java.lang.Float.isNaN(motionKeyPosition.mPercentWidth) ? f2 : motionKeyPosition.mPercentWidth;
                float f4 = java.lang.Float.isNaN(motionKeyPosition.mPercentHeight) ? f2 : motionKeyPosition.mPercentHeight;
                float f5 = motionPaths2.isOutputSupportedForhNQ4ISI;
                float f6 = motionPaths.isOutputSupportedForhNQ4ISI;
                float f7 = motionPaths2.getInputFormats;
                float f8 = motionPaths.getInputFormats;
                this.getOutputSizeshNQ4ISI = this.toString;
                f2 = java.lang.Float.isNaN(motionKeyPosition.mPercentX) ? f2 : motionKeyPosition.mPercentX;
                float f9 = motionPaths.unwrapAs;
                float f10 = motionPaths.isOutputSupportedForhNQ4ISI;
                float f11 = motionPaths.isOutputSupportedFor;
                float f12 = motionPaths.getInputFormats;
                float f13 = (motionPaths2.unwrapAs + (motionPaths2.isOutputSupportedForhNQ4ISI / 2.0f)) - ((f10 / 2.0f) + f9);
                float f14 = (motionPaths2.isOutputSupportedFor + (motionPaths2.getInputFormats / 2.0f)) - ((f12 / 2.0f) + f11);
                float f15 = f13 * f2;
                float f16 = ((f5 - f6) * f3) / 2.0f;
                this.unwrapAs = (int) ((f9 + f15) - f16);
                float f17 = f2 * f14;
                float f18 = ((f7 - f8) * f4) / 2.0f;
                this.isOutputSupportedFor = (int) ((f11 + f17) - f18);
                this.isOutputSupportedForhNQ4ISI = (int) (f10 + r8);
                this.getInputFormats = (int) (f12 + r11);
                float f19 = java.lang.Float.isNaN(motionKeyPosition.mPercentY) ? 0.0f : motionKeyPosition.mPercentY;
                this.getInputSizeshNQ4ISI = 1;
                float f20 = (int) ((motionPaths.unwrapAs + f15) - f16);
                this.unwrapAs = f20;
                float f21 = (int) ((motionPaths.isOutputSupportedFor + f17) - f18);
                this.unwrapAs = f20 + ((-f14) * f19);
                this.isOutputSupportedFor = f21 + (f13 * f19);
                this.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoSizesFor = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
                this.getOutputFormats = motionKeyPosition.mPathMotionArc;
                return;
            }
            if (i3 != 2) {
                float f22 = motionKeyPosition.mFramePosition / 100.0f;
                this.toString = f22;
                this.getHighSpeedVideoSizes = motionKeyPosition.mDrawPath;
                float f23 = java.lang.Float.isNaN(motionKeyPosition.mPercentWidth) ? f22 : motionKeyPosition.mPercentWidth;
                float f24 = java.lang.Float.isNaN(motionKeyPosition.mPercentHeight) ? f22 : motionKeyPosition.mPercentHeight;
                float f25 = motionPaths2.isOutputSupportedForhNQ4ISI;
                float f26 = motionPaths.isOutputSupportedForhNQ4ISI;
                float f27 = motionPaths2.getInputFormats;
                float f28 = motionPaths.getInputFormats;
                this.getOutputSizeshNQ4ISI = this.toString;
                float f29 = motionPaths.unwrapAs;
                float f30 = motionPaths.isOutputSupportedFor;
                float f31 = (motionPaths2.unwrapAs + (f25 / 2.0f)) - ((f26 / 2.0f) + f29);
                float f32 = (motionPaths2.isOutputSupportedFor + (f27 / 2.0f)) - (f30 + (f28 / 2.0f));
                float f33 = ((f25 - f26) * f23) / 2.0f;
                this.unwrapAs = (int) ((f29 + (f31 * f22)) - f33);
                float f34 = ((f27 - f28) * f24) / 2.0f;
                this.isOutputSupportedFor = (int) ((f30 + (f32 * f22)) - f34);
                this.isOutputSupportedForhNQ4ISI = (int) (f26 + r8);
                this.getInputFormats = (int) (f28 + r12);
                float f35 = java.lang.Float.isNaN(motionKeyPosition.mPercentX) ? f22 : motionKeyPosition.mPercentX;
                float f36 = java.lang.Float.isNaN(motionKeyPosition.mAltPercentY) ? 0.0f : motionKeyPosition.mAltPercentY;
                f22 = java.lang.Float.isNaN(motionKeyPosition.mPercentY) ? f22 : motionKeyPosition.mPercentY;
                float f37 = !java.lang.Float.isNaN(motionKeyPosition.mAltPercentX) ? motionKeyPosition.mAltPercentX : 0.0f;
                this.getInputSizeshNQ4ISI = 0;
                this.unwrapAs = (int) (((motionPaths.unwrapAs + (f35 * f31)) + (f37 * f32)) - f33);
                this.isOutputSupportedFor = (int) (((motionPaths.isOutputSupportedFor + (f31 * f36)) + (f32 * f22)) - f34);
                this.getHighSpeedVideoSizesFor = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
                this.getOutputFormats = motionKeyPosition.mPathMotionArc;
                return;
            }
            float f38 = motionKeyPosition.mFramePosition / 100.0f;
            this.toString = f38;
            this.getHighSpeedVideoSizes = motionKeyPosition.mDrawPath;
            float f39 = java.lang.Float.isNaN(motionKeyPosition.mPercentWidth) ? f38 : motionKeyPosition.mPercentWidth;
            float f40 = java.lang.Float.isNaN(motionKeyPosition.mPercentHeight) ? f38 : motionKeyPosition.mPercentHeight;
            float f41 = motionPaths2.isOutputSupportedForhNQ4ISI;
            float f42 = motionPaths.isOutputSupportedForhNQ4ISI;
            float f43 = motionPaths2.getInputFormats;
            float f44 = motionPaths.getInputFormats;
            this.getOutputSizeshNQ4ISI = this.toString;
            float f45 = motionPaths.unwrapAs;
            float f46 = motionPaths.isOutputSupportedFor;
            float f47 = motionPaths2.unwrapAs;
            float f48 = f41 / 2.0f;
            float f49 = motionPaths2.isOutputSupportedFor;
            float f50 = f43 / 2.0f;
            float f51 = (f41 - f42) * f39;
            this.unwrapAs = (int) ((f45 + (((f47 + f48) - ((f42 / 2.0f) + f45)) * f38)) - (f51 / 2.0f));
            float f52 = (f43 - f44) * f40;
            this.isOutputSupportedFor = (int) ((f46 + (((f49 + f50) - ((f44 / 2.0f) + f46)) * f38)) - (f52 / 2.0f));
            this.isOutputSupportedForhNQ4ISI = (int) (f42 + f51);
            this.getInputFormats = (int) (f44 + f52);
            this.getInputSizeshNQ4ISI = 2;
            if (!java.lang.Float.isNaN(motionKeyPosition.mPercentX)) {
                this.unwrapAs = (int) (motionKeyPosition.mPercentX * (i - ((int) this.isOutputSupportedForhNQ4ISI)));
            }
            if (!java.lang.Float.isNaN(motionKeyPosition.mPercentY)) {
                this.isOutputSupportedFor = (int) (motionKeyPosition.mPercentY * (i2 - ((int) this.getInputFormats)));
            }
            this.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizesFor = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
            this.getOutputFormats = motionKeyPosition.mPathMotionArc;
            return;
        }
        float f53 = motionKeyPosition.mFramePosition / 100.0f;
        this.toString = f53;
        this.getHighSpeedVideoSizes = motionKeyPosition.mDrawPath;
        this.getInputSizeshNQ4ISI = motionKeyPosition.mPositionType;
        float f54 = java.lang.Float.isNaN(motionKeyPosition.mPercentWidth) ? f53 : motionKeyPosition.mPercentWidth;
        float f55 = java.lang.Float.isNaN(motionKeyPosition.mPercentHeight) ? f53 : motionKeyPosition.mPercentHeight;
        float f56 = motionPaths2.isOutputSupportedForhNQ4ISI;
        float f57 = motionPaths.isOutputSupportedForhNQ4ISI;
        float f58 = motionPaths2.getInputFormats;
        float f59 = motionPaths.getInputFormats;
        this.getOutputSizeshNQ4ISI = this.toString;
        this.isOutputSupportedForhNQ4ISI = (int) (f57 + ((f56 - f57) * f54));
        this.getInputFormats = (int) (f59 + ((f58 - f59) * f55));
        int i4 = motionKeyPosition.mPositionType;
        if (i4 == 1) {
            float f60 = java.lang.Float.isNaN(motionKeyPosition.mPercentX) ? f53 : motionKeyPosition.mPercentX;
            float f61 = motionPaths2.unwrapAs;
            float f62 = motionPaths.unwrapAs;
            this.unwrapAs = (f60 * (f61 - f62)) + f62;
            f53 = java.lang.Float.isNaN(motionKeyPosition.mPercentY) ? f53 : motionKeyPosition.mPercentY;
            float f63 = motionPaths2.isOutputSupportedFor;
            float f64 = motionPaths.isOutputSupportedFor;
            this.isOutputSupportedFor = (f53 * (f63 - f64)) + f64;
        } else if (i4 == 2) {
            if (java.lang.Float.isNaN(motionKeyPosition.mPercentX)) {
                float f65 = motionPaths2.unwrapAs;
                float f66 = motionPaths.unwrapAs;
                min = ((f65 - f66) * f53) + f66;
            } else {
                min = java.lang.Math.min(f55, f54) * motionKeyPosition.mPercentX;
            }
            this.unwrapAs = min;
            if (java.lang.Float.isNaN(motionKeyPosition.mPercentY)) {
                float f67 = motionPaths2.isOutputSupportedFor;
                float f68 = motionPaths.isOutputSupportedFor;
                f = (f53 * (f67 - f68)) + f68;
            } else {
                f = motionKeyPosition.mPercentY;
            }
            this.isOutputSupportedFor = f;
        } else {
            float f69 = java.lang.Float.isNaN(motionKeyPosition.mPercentX) ? f53 : motionKeyPosition.mPercentX;
            float f70 = motionPaths2.unwrapAs;
            float f71 = motionPaths.unwrapAs;
            this.unwrapAs = (f69 * (f70 - f71)) + f71;
            f53 = java.lang.Float.isNaN(motionKeyPosition.mPercentY) ? f53 : motionKeyPosition.mPercentY;
            float f72 = motionPaths2.isOutputSupportedFor;
            float f73 = motionPaths.isOutputSupportedFor;
            this.isOutputSupportedFor = (f53 * (f72 - f73)) + f73;
        }
        this.Camera2StreamConfigurationMap = motionPaths.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizesFor = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.getOutputFormats = motionKeyPosition.mPathMotionArc;
    }

    public void setupRelative(androidx.constraintlayout.core.motion.Motion motion, androidx.constraintlayout.core.motion.MotionPaths motionPaths) {
        double d = ((this.unwrapAs + (this.isOutputSupportedForhNQ4ISI / 2.0f)) - motionPaths.unwrapAs) - (motionPaths.isOutputSupportedForhNQ4ISI / 2.0f);
        double d2 = ((this.isOutputSupportedFor + (this.getInputFormats / 2.0f)) - motionPaths.isOutputSupportedFor) - (motionPaths.getInputFormats / 2.0f);
        this.getOutputSizes = motion;
        this.unwrapAs = (float) java.lang.Math.hypot(d2, d);
        if (java.lang.Float.isNaN(this.getOutputMinFrameDurationlomOqCM)) {
            this.isOutputSupportedFor = (float) (java.lang.Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.isOutputSupportedFor = (float) java.lang.Math.toRadians(this.getOutputMinFrameDurationlomOqCM);
        }
    }

    static boolean getHighSpeedVideoSizes(float f, float f2) {
        return (java.lang.Float.isNaN(f) || java.lang.Float.isNaN(f2)) ? java.lang.Float.isNaN(f) != java.lang.Float.isNaN(f2) : java.lang.Math.abs(f - f2) > 1.0E-6f;
    }

    final void getHighSpeedVideoSizes(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.unwrapAs;
        float f2 = this.isOutputSupportedFor;
        float f3 = this.isOutputSupportedForhNQ4ISI;
        float f4 = this.getInputFormats;
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
        androidx.constraintlayout.core.motion.Motion motion = this.getOutputSizes;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d, fArr2, new float[2]);
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

    static void getHighSpeedVideoSizes(float f, float f2, float[] fArr, int[] iArr, double[] dArr) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
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

    @Override // java.lang.Comparable
    public int compareTo(androidx.constraintlayout.core.motion.MotionPaths motionPaths) {
        return java.lang.Float.compare(this.getOutputSizeshNQ4ISI, motionPaths.getOutputSizeshNQ4ISI);
    }

    public void applyParameters(androidx.constraintlayout.core.motion.MotionWidget motionWidget) {
        this.getHighSpeedVideoSizesFor = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(motionWidget.Camera2StreamConfigurationMap.mTransitionEasing);
        this.getOutputFormats = motionWidget.Camera2StreamConfigurationMap.mPathMotionArc;
        this.Camera2StreamConfigurationMap = motionWidget.Camera2StreamConfigurationMap.mAnimateRelativeTo;
        this.getOutputMinFrameDuration = motionWidget.Camera2StreamConfigurationMap.mPathRotate;
        this.getHighSpeedVideoSizes = motionWidget.Camera2StreamConfigurationMap.mDrawPath;
        this.getHighSpeedVideoFpsRangesFor = motionWidget.Camera2StreamConfigurationMap.mAnimateCircleAngleTo;
        this.getOutputStallDuration = motionWidget.getHighResolutionOutputSizeshNQ4ISI.mProgress;
        if (motionWidget.getHighSpeedVideoFpsRanges != null && motionWidget.getHighSpeedVideoFpsRanges.widget != null) {
            this.getOutputMinFrameDurationlomOqCM = motionWidget.getHighSpeedVideoFpsRanges.widget.mCircleConstraintAngle;
        }
        for (java.lang.String str : motionWidget.getCustomAttributeNames()) {
            androidx.constraintlayout.core.motion.CustomVariable customAttribute = motionWidget.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.getHighSpeedVideoFpsRanges.put(str, customAttribute);
            }
        }
    }

    public void configureRelativeTo(androidx.constraintlayout.core.motion.Motion motion) {
        double d = this.getOutputStallDuration;
        motion.getHighSpeedVideoSizesFor[0].getPos(d, motion.Camera2StreamConfigurationMap);
        androidx.constraintlayout.core.motion.utils.CurveFit curveFit = motion.getHighSpeedVideoFpsRangesFor;
        if (curveFit != null) {
            double[] dArr = motion.Camera2StreamConfigurationMap;
            if (dArr.length > 0) {
                curveFit.getPos(d, dArr);
            }
        }
        double[] dArr2 = motion.Camera2StreamConfigurationMap;
    }
}

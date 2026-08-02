package androidx.constraintlayout.motion.widget;

/* loaded from: classes7.dex */
class MotionConstrainedPoint implements java.lang.Comparable<androidx.constraintlayout.motion.widget.MotionConstrainedPoint> {
    static java.lang.String[] getHighResolutionOutputSizeshNQ4ISI = {com.daon.sdk.face.license.License.FEATURE_POSITION, "x", "y", "width", "height", "pathRotate"};
    float ArtificialStackFrames;

    /* renamed from: a, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.Easing f2725a;
    float accessartificialFrame;
    private float b;
    float coroutineCreation;
    float getHighSpeedVideoSizes;
    int isOutputSupportedFor;
    public float CoroutineDebuggingKt = 0.0f;
    int coroutineBoundary = 0;
    java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap<>();
    int getOutputFormats = 0;
    double[] toString = new double[18];
    double[] getOutputSizes = new double[18];
    float Camera2StreamConfigurationMap = 1.0f;
    private boolean _CREATION = false;
    float getHighSpeedVideoFpsRanges = 0.0f;
    float getOutputMinFrameDurationlomOqCM = 0.0f;
    float getOutputSizeshNQ4ISI = 0.0f;
    float getOutputStallDuration = 1.0f;
    float getOutputStallDurationlomOqCM = 1.0f;
    float getInputFormats = Float.NaN;
    float getOutputMinFrameDuration = Float.NaN;
    float isOutputSupportedForhNQ4ISI = 0.0f;
    float getValidOutputFormatsForInputhNQ4ISI = 0.0f;
    float unwrapAs = 0.0f;
    private int _BOUNDARY = 0;
    float getHighSpeedVideoSizesFor = Float.NaN;
    float getInputSizeshNQ4ISI = Float.NaN;
    private int getARTIFICIAL_FRAME_PACKAGE_NAME = -1;

    MotionConstrainedPoint() {
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(androidx.constraintlayout.motion.widget.MotionConstrainedPoint motionConstrainedPoint) {
        return java.lang.Float.compare(this.b, motionConstrainedPoint.b);
    }

    static boolean getHighSpeedVideoFpsRangesFor(float f, float f2) {
        return (java.lang.Float.isNaN(f) || java.lang.Float.isNaN(f2)) ? java.lang.Float.isNaN(f) != java.lang.Float.isNaN(f2) : java.lang.Math.abs(f - f2) > 1.0E-6f;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(android.view.View view) {
        this.isOutputSupportedFor = view.getVisibility();
        this.Camera2StreamConfigurationMap = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this._CREATION = false;
        this.getHighSpeedVideoFpsRanges = view.getElevation();
        this.getOutputMinFrameDurationlomOqCM = view.getRotation();
        this.getOutputSizeshNQ4ISI = view.getRotationX();
        this.CoroutineDebuggingKt = view.getRotationY();
        this.getOutputStallDuration = view.getScaleX();
        this.getOutputStallDurationlomOqCM = view.getScaleY();
        this.getInputFormats = view.getPivotX();
        this.getOutputMinFrameDuration = view.getPivotY();
        this.isOutputSupportedForhNQ4ISI = view.getTranslationX();
        this.getValidOutputFormatsForInputhNQ4ISI = view.getTranslationY();
        this.unwrapAs = view.getTranslationZ();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void Camera2StreamConfigurationMap(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> hashMap, int i) {
        char c;
        for (java.lang.String str : hashMap.keySet()) {
            androidx.constraintlayout.motion.utils.ViewSpline viewSpline = hashMap.get(str);
            if (viewSpline != null) {
                str.hashCode();
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case -760884510:
                        if (str.equals(androidx.constraintlayout.motion.widget.Key.PIVOT_X)) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -760884509:
                        if (str.equals(androidx.constraintlayout.motion.widget.Key.PIVOT_Y)) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case -40300674:
                        if (str.equals(androidx.constraintlayout.motion.widget.Key.ROTATION)) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        viewSpline.setPoint(i, java.lang.Float.isNaN(this.getOutputSizeshNQ4ISI) ? 0.0f : this.getOutputSizeshNQ4ISI);
                        break;
                    case 1:
                        viewSpline.setPoint(i, java.lang.Float.isNaN(this.CoroutineDebuggingKt) ? 0.0f : this.CoroutineDebuggingKt);
                        break;
                    case 2:
                        viewSpline.setPoint(i, java.lang.Float.isNaN(this.isOutputSupportedForhNQ4ISI) ? 0.0f : this.isOutputSupportedForhNQ4ISI);
                        break;
                    case 3:
                        viewSpline.setPoint(i, java.lang.Float.isNaN(this.getValidOutputFormatsForInputhNQ4ISI) ? 0.0f : this.getValidOutputFormatsForInputhNQ4ISI);
                        break;
                    case 4:
                        viewSpline.setPoint(i, java.lang.Float.isNaN(this.unwrapAs) ? 0.0f : this.unwrapAs);
                        break;
                    case 5:
                        viewSpline.setPoint(i, java.lang.Float.isNaN(this.getInputSizeshNQ4ISI) ? 0.0f : this.getInputSizeshNQ4ISI);
                        break;
                    case 6:
                        viewSpline.setPoint(i, java.lang.Float.isNaN(this.getOutputStallDuration) ? 1.0f : this.getOutputStallDuration);
                        break;
                    case 7:
                        viewSpline.setPoint(i, java.lang.Float.isNaN(this.getOutputStallDurationlomOqCM) ? 1.0f : this.getOutputStallDurationlomOqCM);
                        break;
                    case '\b':
                        viewSpline.setPoint(i, java.lang.Float.isNaN(this.getInputFormats) ? 0.0f : this.getInputFormats);
                        break;
                    case '\t':
                        viewSpline.setPoint(i, java.lang.Float.isNaN(this.getOutputMinFrameDuration) ? 0.0f : this.getOutputMinFrameDuration);
                        break;
                    case '\n':
                        viewSpline.setPoint(i, java.lang.Float.isNaN(this.getOutputMinFrameDurationlomOqCM) ? 0.0f : this.getOutputMinFrameDurationlomOqCM);
                        break;
                    case 11:
                        viewSpline.setPoint(i, java.lang.Float.isNaN(this.getHighSpeedVideoFpsRanges) ? 0.0f : this.getHighSpeedVideoFpsRanges);
                        break;
                    case '\f':
                        viewSpline.setPoint(i, java.lang.Float.isNaN(this.getHighSpeedVideoSizesFor) ? 0.0f : this.getHighSpeedVideoSizesFor);
                        break;
                    case '\r':
                        viewSpline.setPoint(i, java.lang.Float.isNaN(this.Camera2StreamConfigurationMap) ? 1.0f : this.Camera2StreamConfigurationMap);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            java.lang.String str2 = str.split(",")[1];
                            if (this.getHighSpeedVideoFpsRangesFor.containsKey(str2)) {
                                androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = this.getHighSpeedVideoFpsRangesFor.get(str2);
                                if (viewSpline instanceof androidx.constraintlayout.motion.utils.ViewSpline.CustomSet) {
                                    ((androidx.constraintlayout.motion.utils.ViewSpline.CustomSet) viewSpline).setPoint(i, constraintAttribute);
                                    break;
                                } else {
                                    constraintAttribute.getValueToInterpolate();
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                }
            }
        }
    }

    public final void Camera2StreamConfigurationMap(android.view.View view) {
        float x = view.getX();
        float y = view.getY();
        float width = view.getWidth();
        float height = view.getHeight();
        this.ArtificialStackFrames = x;
        this.accessartificialFrame = y;
        this.coroutineCreation = width;
        this.getHighSpeedVideoSizes = height;
        getHighResolutionOutputSizeshNQ4ISI(view);
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(android.graphics.Rect rect, androidx.constraintlayout.widget.ConstraintSet constraintSet, int i, int i2) {
        float f = rect.left;
        float f2 = rect.top;
        float width = rect.width();
        float height = rect.height();
        this.ArtificialStackFrames = f;
        this.accessartificialFrame = f2;
        this.coroutineCreation = width;
        this.getHighSpeedVideoSizes = height;
        androidx.constraintlayout.widget.ConstraintSet.Constraint parameters = constraintSet.getParameters(i2);
        this.coroutineBoundary = parameters.propertySet.mVisibilityMode;
        this.isOutputSupportedFor = parameters.propertySet.visibility;
        this.Camera2StreamConfigurationMap = (parameters.propertySet.visibility == 0 || this.coroutineBoundary != 0) ? parameters.propertySet.alpha : 0.0f;
        this._CREATION = parameters.transform.applyElevation;
        this.getHighSpeedVideoFpsRanges = parameters.transform.elevation;
        this.getOutputMinFrameDurationlomOqCM = parameters.transform.rotation;
        this.getOutputSizeshNQ4ISI = parameters.transform.rotationX;
        this.CoroutineDebuggingKt = parameters.transform.rotationY;
        this.getOutputStallDuration = parameters.transform.scaleX;
        this.getOutputStallDurationlomOqCM = parameters.transform.scaleY;
        this.getInputFormats = parameters.transform.transformPivotX;
        this.getOutputMinFrameDuration = parameters.transform.transformPivotY;
        this.isOutputSupportedForhNQ4ISI = parameters.transform.translationX;
        this.getValidOutputFormatsForInputhNQ4ISI = parameters.transform.translationY;
        this.unwrapAs = parameters.transform.translationZ;
        this.f2725a = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(parameters.motion.mTransitionEasing);
        this.getHighSpeedVideoSizesFor = parameters.motion.mPathRotate;
        this._BOUNDARY = parameters.motion.mDrawPath;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = parameters.motion.mAnimateRelativeTo;
        this.getInputSizeshNQ4ISI = parameters.propertySet.mProgress;
        for (java.lang.String str : parameters.mCustomConstraints.keySet()) {
            androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = parameters.mCustomConstraints.get(str);
            if (constraintAttribute.isContinuous()) {
                this.getHighSpeedVideoFpsRangesFor.put(str, constraintAttribute);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f3 = this.getOutputMinFrameDurationlomOqCM + 90.0f;
            this.getOutputMinFrameDurationlomOqCM = f3;
            if (f3 > 180.0f) {
                this.getOutputMinFrameDurationlomOqCM = f3 - 360.0f;
                return;
            }
            return;
        }
        this.getOutputMinFrameDurationlomOqCM -= 90.0f;
    }
}

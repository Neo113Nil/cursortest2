package androidx.constraintlayout.core.motion;

/* loaded from: classes6.dex */
class MotionConstrainedPoint implements java.lang.Comparable<androidx.constraintlayout.core.motion.MotionConstrainedPoint> {
    static java.lang.String[] getHighSpeedVideoSizes = {com.daon.sdk.face.license.License.FEATURE_POSITION, "x", "y", "width", "height", "pathRotate"};
    float ArtificialStackFrames;
    float Camera2StreamConfigurationMap;
    float accessartificialFrame;
    private float b;
    float coroutineBoundary;
    int isOutputSupportedFor;
    float getHighSpeedVideoFpsRangesFor = 1.0f;
    int coroutineCreation = 0;
    private boolean getARTIFICIAL_FRAME_PACKAGE_NAME = false;
    float getHighSpeedVideoFpsRanges = 0.0f;
    float getOutputMinFrameDurationlomOqCM = 0.0f;
    float getOutputStallDuration = 0.0f;
    public float CoroutineDebuggingKt = 0.0f;
    float getOutputStallDurationlomOqCM = 1.0f;
    float getOutputSizeshNQ4ISI = 1.0f;
    float getHighSpeedVideoSizesFor = Float.NaN;
    float getInputFormats = Float.NaN;
    float toString = 0.0f;
    float unwrapAs = 0.0f;
    float getValidOutputFormatsForInputhNQ4ISI = 0.0f;
    private int _BOUNDARY = 0;
    float getOutputFormats = Float.NaN;
    float getInputSizeshNQ4ISI = Float.NaN;
    private int _CREATION = -1;
    java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap<>();
    int getOutputMinFrameDuration = 0;
    double[] isOutputSupportedForhNQ4ISI = new double[18];
    double[] getOutputSizes = new double[18];

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(androidx.constraintlayout.core.motion.MotionConstrainedPoint motionConstrainedPoint) {
        return java.lang.Float.compare(this.b, motionConstrainedPoint.b);
    }

    MotionConstrainedPoint() {
    }

    static boolean getHighSpeedVideoFpsRanges(float f, float f2) {
        return (java.lang.Float.isNaN(f) || java.lang.Float.isNaN(f2)) ? java.lang.Float.isNaN(f) != java.lang.Float.isNaN(f2) : java.lang.Math.abs(f - f2) > 1.0E-6f;
    }

    public final void getHighSpeedVideoFpsRangesFor(androidx.constraintlayout.core.motion.MotionWidget motionWidget) {
        this.isOutputSupportedFor = motionWidget.getVisibility();
        this.getHighSpeedVideoFpsRangesFor = motionWidget.getVisibility() != 4 ? 0.0f : motionWidget.getAlpha();
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = false;
        this.getOutputMinFrameDurationlomOqCM = motionWidget.getRotationZ();
        this.getOutputStallDuration = motionWidget.getRotationX();
        this.CoroutineDebuggingKt = motionWidget.getRotationY();
        this.getOutputStallDurationlomOqCM = motionWidget.getScaleX();
        this.getOutputSizeshNQ4ISI = motionWidget.getScaleY();
        this.getHighSpeedVideoSizesFor = motionWidget.getPivotX();
        this.getInputFormats = motionWidget.getPivotY();
        this.toString = motionWidget.getTranslationX();
        this.unwrapAs = motionWidget.getTranslationY();
        this.getValidOutputFormatsForInputhNQ4ISI = motionWidget.getTranslationZ();
        for (java.lang.String str : motionWidget.getCustomAttributeNames()) {
            androidx.constraintlayout.core.motion.CustomVariable customAttribute = motionWidget.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.getHighResolutionOutputSizeshNQ4ISI.put(str, customAttribute);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void getHighSpeedVideoFpsRangesFor(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> hashMap, int i) {
        char c;
        for (java.lang.String str : hashMap.keySet()) {
            androidx.constraintlayout.core.motion.utils.SplineSet splineSet = hashMap.get(str);
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
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        c = '\f';
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
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.getOutputStallDuration) ? 0.0f : this.getOutputStallDuration);
                    break;
                case 1:
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.CoroutineDebuggingKt) ? 0.0f : this.CoroutineDebuggingKt);
                    break;
                case 2:
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.getOutputMinFrameDurationlomOqCM) ? 0.0f : this.getOutputMinFrameDurationlomOqCM);
                    break;
                case 3:
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.toString) ? 0.0f : this.toString);
                    break;
                case 4:
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.unwrapAs) ? 0.0f : this.unwrapAs);
                    break;
                case 5:
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.getValidOutputFormatsForInputhNQ4ISI) ? 0.0f : this.getValidOutputFormatsForInputhNQ4ISI);
                    break;
                case 6:
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.getInputSizeshNQ4ISI) ? 0.0f : this.getInputSizeshNQ4ISI);
                    break;
                case 7:
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.getHighSpeedVideoSizesFor) ? 0.0f : this.getHighSpeedVideoSizesFor);
                    break;
                case '\b':
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.getInputFormats) ? 0.0f : this.getInputFormats);
                    break;
                case '\t':
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.getOutputStallDurationlomOqCM) ? 1.0f : this.getOutputStallDurationlomOqCM);
                    break;
                case '\n':
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.getOutputSizeshNQ4ISI) ? 1.0f : this.getOutputSizeshNQ4ISI);
                    break;
                case 11:
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor) ? 1.0f : this.getHighSpeedVideoFpsRangesFor);
                    break;
                case '\f':
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.getOutputFormats) ? 0.0f : this.getOutputFormats);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        java.lang.String str2 = str.split(",")[1];
                        if (this.getHighResolutionOutputSizeshNQ4ISI.containsKey(str2)) {
                            androidx.constraintlayout.core.motion.CustomVariable customVariable = this.getHighResolutionOutputSizeshNQ4ISI.get(str2);
                            if (splineSet instanceof androidx.constraintlayout.core.motion.utils.SplineSet.CustomSpline) {
                                ((androidx.constraintlayout.core.motion.utils.SplineSet.CustomSpline) splineSet).setPoint(i, customVariable);
                                break;
                            } else {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(str);
                                sb.append(" ViewSpline not a CustomSet frame = ");
                                sb.append(i);
                                sb.append(", value");
                                sb.append(customVariable.getValueToInterpolate());
                                sb.append(splineSet);
                                androidx.constraintlayout.core.motion.utils.Utils.loge(androidx.constraintlayout.core.motion.MotionPaths.TAG, sb.toString());
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        androidx.constraintlayout.core.motion.utils.Utils.loge(androidx.constraintlayout.core.motion.MotionPaths.TAG, "UNKNOWN spline ".concat(java.lang.String.valueOf(str)));
                        break;
                    }
            }
        }
    }
}

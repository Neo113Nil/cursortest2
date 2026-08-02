package androidx.constraintlayout.motion.widget;

/* loaded from: classes7.dex */
public class KeyCycle extends androidx.constraintlayout.motion.widget.Key {
    public static final int KEY_TYPE = 4;
    public static final int SHAPE_BOUNCE = 6;
    public static final int SHAPE_COS_WAVE = 5;
    public static final int SHAPE_REVERSE_SAW_WAVE = 4;
    public static final int SHAPE_SAW_WAVE = 3;
    public static final int SHAPE_SIN_WAVE = 0;
    public static final int SHAPE_SQUARE_WAVE = 1;
    public static final int SHAPE_TRIANGLE_WAVE = 2;
    public static final java.lang.String WAVE_OFFSET = "waveOffset";
    public static final java.lang.String WAVE_PERIOD = "wavePeriod";
    public static final java.lang.String WAVE_PHASE = "wavePhase";
    public static final java.lang.String WAVE_SHAPE = "waveShape";
    private java.lang.String getOutputSizeshNQ4ISI = null;
    private int getOutputMinFrameDuration = 0;
    private int CoroutineDebuggingKt = -1;
    private java.lang.String getInputFormats = null;
    private float accessartificialFrame = Float.NaN;
    private float isOutputSupportedFor = 0.0f;
    private float coroutineCreation = 0.0f;
    private float getOutputFormats = Float.NaN;
    private int ArtificialStackFrames = -1;
    private float getHighSpeedVideoFpsRangesFor = Float.NaN;
    private float getInputSizeshNQ4ISI = Float.NaN;
    private float getHighSpeedVideoSizesFor = Float.NaN;
    private float isOutputSupportedForhNQ4ISI = Float.NaN;
    private float getOutputMinFrameDurationlomOqCM = Float.NaN;
    private float getOutputStallDuration = Float.NaN;
    private float getOutputStallDurationlomOqCM = Float.NaN;
    private float getOutputSizes = Float.NaN;
    private float getValidOutputFormatsForInputhNQ4ISI = Float.NaN;
    private float toString = Float.NaN;
    private float unwrapAs = Float.NaN;

    public KeyCycle() {
        this.mType = 4;
        this.Camera2StreamConfigurationMap = new java.util.HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo9054clone() throws java.lang.CloneNotSupportedException {
        return mo9054clone();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context context, android.util.AttributeSet attributeSet) {
        androidx.constraintlayout.motion.widget.KeyCycle.Loader.getHighResolutionOutputSizeshNQ4ISI(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.KeyCycle));
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(java.util.HashSet<java.lang.String> hashSet) {
        if (!java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor)) {
            hashSet.add("alpha");
        }
        if (!java.lang.Float.isNaN(this.getInputSizeshNQ4ISI)) {
            hashSet.add("elevation");
        }
        if (!java.lang.Float.isNaN(this.getHighSpeedVideoSizesFor)) {
            hashSet.add(androidx.constraintlayout.motion.widget.Key.ROTATION);
        }
        if (!java.lang.Float.isNaN(this.getOutputMinFrameDurationlomOqCM)) {
            hashSet.add("rotationX");
        }
        if (!java.lang.Float.isNaN(this.getOutputStallDuration)) {
            hashSet.add("rotationY");
        }
        if (!java.lang.Float.isNaN(this.getOutputStallDurationlomOqCM)) {
            hashSet.add("scaleX");
        }
        if (!java.lang.Float.isNaN(this.getOutputSizes)) {
            hashSet.add("scaleY");
        }
        if (!java.lang.Float.isNaN(this.isOutputSupportedForhNQ4ISI)) {
            hashSet.add("transitionPathRotate");
        }
        if (!java.lang.Float.isNaN(this.getValidOutputFormatsForInputhNQ4ISI)) {
            hashSet.add("translationX");
        }
        if (!java.lang.Float.isNaN(this.toString)) {
            hashSet.add("translationY");
        }
        if (!java.lang.Float.isNaN(this.unwrapAs)) {
            hashSet.add("translationZ");
        }
        if (this.Camera2StreamConfigurationMap.size() > 0) {
            java.util.Iterator<java.lang.String> it = this.Camera2StreamConfigurationMap.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM,".concat(java.lang.String.valueOf(it.next())));
            }
        }
    }

    public void addCycleValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> hashMap) {
        androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator;
        androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator2;
        for (java.lang.String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = this.Camera2StreamConfigurationMap.get(str.substring(7));
                if (constraintAttribute != null && constraintAttribute.getType() == androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE && (viewOscillator = hashMap.get(str)) != null) {
                    viewOscillator.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.CoroutineDebuggingKt, this.getInputFormats, this.ArtificialStackFrames, this.accessartificialFrame, this.isOutputSupportedFor, this.coroutineCreation, constraintAttribute.getValueToInterpolate(), constraintAttribute);
                }
            } else {
                float value = getValue(str);
                if (!java.lang.Float.isNaN(value) && (viewOscillator2 = hashMap.get(str)) != null) {
                    viewOscillator2.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.CoroutineDebuggingKt, this.getInputFormats, this.ArtificialStackFrames, this.accessartificialFrame, this.isOutputSupportedFor, this.coroutineCreation, value);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public float getValue(java.lang.String str) {
        char c;
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
            case -40300674:
                if (str.equals(androidx.constraintlayout.motion.widget.Key.ROTATION)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
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
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1530034690:
                if (str.equals("wavePhase")) {
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
                return this.getOutputMinFrameDurationlomOqCM;
            case 1:
                return this.getOutputStallDuration;
            case 2:
                return this.getValidOutputFormatsForInputhNQ4ISI;
            case 3:
                return this.toString;
            case 4:
                return this.unwrapAs;
            case 5:
                return this.getOutputFormats;
            case 6:
                return this.getOutputStallDurationlomOqCM;
            case 7:
                return this.getOutputSizes;
            case '\b':
                return this.getHighSpeedVideoSizesFor;
            case '\t':
                return this.getInputSizeshNQ4ISI;
            case '\n':
                return this.isOutputSupportedForhNQ4ISI;
            case 11:
                return this.getHighSpeedVideoFpsRangesFor;
            case '\f':
                return this.isOutputSupportedFor;
            case '\r':
                return this.coroutineCreation;
            default:
                return Float.NaN;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> hashMap) {
        char c;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("add ");
        sb.append(hashMap.size());
        sb.append(" values");
        androidx.constraintlayout.motion.widget.Debug.logStack(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.NAME, sb.toString(), 2);
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
                    case -40300674:
                        if (str.equals(androidx.constraintlayout.motion.widget.Key.ROTATION)) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
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
                    case 156108012:
                        if (str.equals("waveOffset")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1530034690:
                        if (str.equals("wavePhase")) {
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
                        viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDurationlomOqCM);
                        break;
                    case 1:
                        viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputStallDuration);
                        break;
                    case 2:
                        viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getValidOutputFormatsForInputhNQ4ISI);
                        break;
                    case 3:
                        viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.toString);
                        break;
                    case 4:
                        viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.unwrapAs);
                        break;
                    case 5:
                        viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputFormats);
                        break;
                    case 6:
                        viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputStallDurationlomOqCM);
                        break;
                    case 7:
                        viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputSizes);
                        break;
                    case '\b':
                        viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor);
                        break;
                    case '\t':
                        viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI);
                        break;
                    case '\n':
                        viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.isOutputSupportedForhNQ4ISI);
                        break;
                    case 11:
                        viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
                        break;
                    case '\f':
                        viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.isOutputSupportedFor);
                        break;
                    case '\r':
                        viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.coroutineCreation);
                        break;
                    default:
                        str.startsWith("CUSTOM");
                        break;
                }
            }
        }
    }

    static class Loader {
        private static android.util.SparseIntArray Camera2StreamConfigurationMap;

        private Loader() {
        }

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            Camera2StreamConfigurationMap = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_motionTarget, 1);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_framePosition, 2);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_transitionEasing, 3);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_curveFit, 4);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_waveShape, 5);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_wavePeriod, 6);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_waveOffset, 7);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_waveVariesBy, 8);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_android_alpha, 9);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_android_elevation, 10);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_android_rotation, 11);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_android_rotationX, 12);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_android_rotationY, 13);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_transitionPathRotate, 14);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_android_scaleX, 15);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_android_scaleY, 16);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_android_translationX, 17);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_android_translationY, 18);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_android_translationZ, 19);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_motionProgress, 20);
            Camera2StreamConfigurationMap.append(androidx.constraintlayout.widget.R.styleable.KeyCycle_wavePhase, 21);
        }

        static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.constraintlayout.motion.widget.KeyCycle keyCycle, android.content.res.TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (Camera2StreamConfigurationMap.get(index)) {
                    case 1:
                        if (androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE) {
                            keyCycle.getHighSpeedVideoSizes = typedArray.getResourceId(index, keyCycle.getHighSpeedVideoSizes);
                            if (keyCycle.getHighSpeedVideoSizes == -1) {
                                keyCycle.getHighSpeedVideoFpsRanges = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            keyCycle.getHighSpeedVideoFpsRanges = typedArray.getString(index);
                            break;
                        } else {
                            keyCycle.getHighSpeedVideoSizes = typedArray.getResourceId(index, keyCycle.getHighSpeedVideoSizes);
                            break;
                        }
                    case 2:
                        keyCycle.getHighResolutionOutputSizeshNQ4ISI = typedArray.getInt(index, keyCycle.getHighResolutionOutputSizeshNQ4ISI);
                        break;
                    case 3:
                        keyCycle.getOutputSizeshNQ4ISI = typedArray.getString(index);
                        break;
                    case 4:
                        keyCycle.getOutputMinFrameDuration = typedArray.getInteger(index, keyCycle.getOutputMinFrameDuration);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type == 3) {
                            keyCycle.getInputFormats = typedArray.getString(index);
                            keyCycle.CoroutineDebuggingKt = 7;
                            break;
                        } else {
                            keyCycle.CoroutineDebuggingKt = typedArray.getInt(index, keyCycle.CoroutineDebuggingKt);
                            break;
                        }
                    case 6:
                        keyCycle.accessartificialFrame = typedArray.getFloat(index, keyCycle.accessartificialFrame);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            keyCycle.isOutputSupportedFor = typedArray.getDimension(index, keyCycle.isOutputSupportedFor);
                            break;
                        } else {
                            keyCycle.isOutputSupportedFor = typedArray.getFloat(index, keyCycle.isOutputSupportedFor);
                            break;
                        }
                    case 8:
                        keyCycle.ArtificialStackFrames = typedArray.getInt(index, keyCycle.ArtificialStackFrames);
                        break;
                    case 9:
                        keyCycle.getHighSpeedVideoFpsRangesFor = typedArray.getFloat(index, keyCycle.getHighSpeedVideoFpsRangesFor);
                        break;
                    case 10:
                        keyCycle.getInputSizeshNQ4ISI = typedArray.getDimension(index, keyCycle.getInputSizeshNQ4ISI);
                        break;
                    case 11:
                        keyCycle.getHighSpeedVideoSizesFor = typedArray.getFloat(index, keyCycle.getHighSpeedVideoSizesFor);
                        break;
                    case 12:
                        keyCycle.getOutputMinFrameDurationlomOqCM = typedArray.getFloat(index, keyCycle.getOutputMinFrameDurationlomOqCM);
                        break;
                    case 13:
                        keyCycle.getOutputStallDuration = typedArray.getFloat(index, keyCycle.getOutputStallDuration);
                        break;
                    case 14:
                        keyCycle.isOutputSupportedForhNQ4ISI = typedArray.getFloat(index, keyCycle.isOutputSupportedForhNQ4ISI);
                        break;
                    case 15:
                        keyCycle.getOutputStallDurationlomOqCM = typedArray.getFloat(index, keyCycle.getOutputStallDurationlomOqCM);
                        break;
                    case 16:
                        keyCycle.getOutputSizes = typedArray.getFloat(index, keyCycle.getOutputSizes);
                        break;
                    case 17:
                        keyCycle.getValidOutputFormatsForInputhNQ4ISI = typedArray.getDimension(index, keyCycle.getValidOutputFormatsForInputhNQ4ISI);
                        break;
                    case 18:
                        keyCycle.toString = typedArray.getDimension(index, keyCycle.toString);
                        break;
                    case 19:
                        keyCycle.unwrapAs = typedArray.getDimension(index, keyCycle.unwrapAs);
                        break;
                    case 20:
                        keyCycle.getOutputFormats = typedArray.getFloat(index, keyCycle.getOutputFormats);
                        break;
                    case 21:
                        keyCycle.coroutineCreation = typedArray.getFloat(index, keyCycle.coroutineCreation) / 360.0f;
                        break;
                    default:
                        Camera2StreamConfigurationMap.get(index);
                        break;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(java.lang.String str, java.lang.Object obj) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals(androidx.constraintlayout.motion.widget.Key.MOTIONPROGRESS)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -40300674:
                if (str.equals(androidx.constraintlayout.motion.widget.Key.ROTATION)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 184161818:
                if (str.equals("wavePeriod")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1530034690:
                if (str.equals("wavePhase")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1532805160:
                if (str.equals("waveShape")) {
                    c = 17;
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
                this.getOutputFormats = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 1:
                this.getOutputSizeshNQ4ISI = obj.toString();
                break;
            case 2:
                this.getOutputMinFrameDurationlomOqCM = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 3:
                this.getOutputStallDuration = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 4:
                this.getValidOutputFormatsForInputhNQ4ISI = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 5:
                this.toString = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 6:
                this.unwrapAs = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 7:
                this.getOutputStallDurationlomOqCM = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case '\b':
                this.getOutputSizes = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case '\t':
                this.getHighSpeedVideoSizesFor = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case '\n':
                this.getInputSizeshNQ4ISI = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 11:
                this.isOutputSupportedForhNQ4ISI = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case '\f':
                this.getHighSpeedVideoFpsRangesFor = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case '\r':
                this.isOutputSupportedFor = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 14:
                this.accessartificialFrame = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 15:
                this.getOutputMinFrameDuration = obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : java.lang.Integer.parseInt(obj.toString());
                break;
            case 16:
                this.coroutineCreation = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 17:
                boolean z = obj instanceof java.lang.Integer;
                if (z) {
                    this.CoroutineDebuggingKt = z ? ((java.lang.Integer) obj).intValue() : java.lang.Integer.parseInt(obj.toString());
                    break;
                } else {
                    this.CoroutineDebuggingKt = 7;
                    this.getInputFormats = obj.toString();
                    break;
                }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public androidx.constraintlayout.motion.widget.Key copy(androidx.constraintlayout.motion.widget.Key key) {
        super.copy(key);
        androidx.constraintlayout.motion.widget.KeyCycle keyCycle = (androidx.constraintlayout.motion.widget.KeyCycle) key;
        this.getOutputSizeshNQ4ISI = keyCycle.getOutputSizeshNQ4ISI;
        this.getOutputMinFrameDuration = keyCycle.getOutputMinFrameDuration;
        this.CoroutineDebuggingKt = keyCycle.CoroutineDebuggingKt;
        this.getInputFormats = keyCycle.getInputFormats;
        this.accessartificialFrame = keyCycle.accessartificialFrame;
        this.isOutputSupportedFor = keyCycle.isOutputSupportedFor;
        this.coroutineCreation = keyCycle.coroutineCreation;
        this.getOutputFormats = keyCycle.getOutputFormats;
        this.ArtificialStackFrames = keyCycle.ArtificialStackFrames;
        this.getHighSpeedVideoFpsRangesFor = keyCycle.getHighSpeedVideoFpsRangesFor;
        this.getInputSizeshNQ4ISI = keyCycle.getInputSizeshNQ4ISI;
        this.getHighSpeedVideoSizesFor = keyCycle.getHighSpeedVideoSizesFor;
        this.isOutputSupportedForhNQ4ISI = keyCycle.isOutputSupportedForhNQ4ISI;
        this.getOutputMinFrameDurationlomOqCM = keyCycle.getOutputMinFrameDurationlomOqCM;
        this.getOutputStallDuration = keyCycle.getOutputStallDuration;
        this.getOutputStallDurationlomOqCM = keyCycle.getOutputStallDurationlomOqCM;
        this.getOutputSizes = keyCycle.getOutputSizes;
        this.getValidOutputFormatsForInputhNQ4ISI = keyCycle.getValidOutputFormatsForInputhNQ4ISI;
        this.toString = keyCycle.toString;
        this.unwrapAs = keyCycle.unwrapAs;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: clone */
    public androidx.constraintlayout.motion.widget.Key mo9054clone() {
        return new androidx.constraintlayout.motion.widget.KeyCycle().copy(this);
    }
}

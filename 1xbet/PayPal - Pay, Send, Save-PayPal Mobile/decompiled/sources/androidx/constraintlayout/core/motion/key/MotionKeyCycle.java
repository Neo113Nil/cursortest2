package androidx.constraintlayout.core.motion.key;

/* loaded from: classes6.dex */
public class MotionKeyCycle extends androidx.constraintlayout.core.motion.key.MotionKey {
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
    private java.lang.String getOutputStallDuration = null;
    private int Camera2StreamConfigurationMap = 0;
    private int coroutineCreation = -1;
    private java.lang.String getHighSpeedVideoFpsRangesFor = null;
    private float toString = Float.NaN;
    private float isOutputSupportedFor = 0.0f;
    private float unwrapAs = 0.0f;
    private float getInputSizeshNQ4ISI = Float.NaN;
    private float getHighSpeedVideoSizes = Float.NaN;
    private float getHighSpeedVideoSizesFor = Float.NaN;
    private float getOutputFormats = Float.NaN;
    private float getOutputSizes = Float.NaN;
    private float getInputFormats = Float.NaN;
    private float getOutputMinFrameDuration = Float.NaN;
    private float getOutputStallDurationlomOqCM = Float.NaN;
    private float getOutputSizeshNQ4ISI = Float.NaN;
    private float getOutputMinFrameDurationlomOqCM = Float.NaN;
    private float isOutputSupportedForhNQ4ISI = Float.NaN;
    private float getValidOutputFormatsForInputhNQ4ISI = Float.NaN;

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> hashMap) {
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public androidx.constraintlayout.core.motion.key.MotionKey mo9052clone() {
        return null;
    }

    public MotionKeyCycle() {
        this.mType = 4;
        this.mCustom = new java.util.HashMap<>();
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo9052clone() throws java.lang.CloneNotSupportedException {
        return mo9052clone();
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(java.util.HashSet<java.lang.String> hashSet) {
        if (!java.lang.Float.isNaN(this.getHighSpeedVideoSizes)) {
            hashSet.add("alpha");
        }
        if (!java.lang.Float.isNaN(this.getHighSpeedVideoSizesFor)) {
            hashSet.add("elevation");
        }
        if (!java.lang.Float.isNaN(this.getOutputFormats)) {
            hashSet.add("rotationZ");
        }
        if (!java.lang.Float.isNaN(this.getInputFormats)) {
            hashSet.add("rotationX");
        }
        if (!java.lang.Float.isNaN(this.getOutputMinFrameDuration)) {
            hashSet.add("rotationY");
        }
        if (!java.lang.Float.isNaN(this.getOutputStallDurationlomOqCM)) {
            hashSet.add("scaleX");
        }
        if (!java.lang.Float.isNaN(this.getOutputSizeshNQ4ISI)) {
            hashSet.add("scaleY");
        }
        if (!java.lang.Float.isNaN(this.getOutputSizes)) {
            hashSet.add("pathRotate");
        }
        if (!java.lang.Float.isNaN(this.getOutputMinFrameDurationlomOqCM)) {
            hashSet.add("translationX");
        }
        if (!java.lang.Float.isNaN(this.isOutputSupportedForhNQ4ISI)) {
            hashSet.add("translationY");
        }
        if (!java.lang.Float.isNaN(this.getValidOutputFormatsForInputhNQ4ISI)) {
            hashSet.add("translationZ");
        }
        if (this.mCustom.size() > 0) {
            java.util.Iterator<java.lang.String> it = this.mCustom.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM,".concat(java.lang.String.valueOf(it.next())));
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        if (i == 401) {
            this.Camera2StreamConfigurationMap = i2;
            return true;
        }
        if (i == 421) {
            this.coroutineCreation = i2;
            return true;
        }
        if (setValue(i, i2)) {
            return true;
        }
        return super.setValue(i, i2);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, java.lang.String str) {
        if (i == 420) {
            this.getOutputStallDuration = str;
            return true;
        }
        if (i == 422) {
            this.getHighSpeedVideoFpsRangesFor = str;
            return true;
        }
        return super.setValue(i, str);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        if (i == 315) {
            this.getInputSizeshNQ4ISI = f;
            return true;
        }
        if (i == 403) {
            this.getHighSpeedVideoSizes = f;
            return true;
        }
        if (i != 416) {
            switch (i) {
                case 304:
                    this.getOutputMinFrameDurationlomOqCM = f;
                    return true;
                case 305:
                    this.isOutputSupportedForhNQ4ISI = f;
                    return true;
                case 306:
                    this.getValidOutputFormatsForInputhNQ4ISI = f;
                    return true;
                case 307:
                    this.getHighSpeedVideoSizesFor = f;
                    return true;
                case 308:
                    this.getInputFormats = f;
                    return true;
                case 309:
                    this.getOutputMinFrameDuration = f;
                    return true;
                case 310:
                    this.getOutputFormats = f;
                    return true;
                case 311:
                    this.getOutputStallDurationlomOqCM = f;
                    return true;
                case 312:
                    this.getOutputSizeshNQ4ISI = f;
                    return true;
                default:
                    switch (i) {
                        case androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PERIOD /* 423 */:
                            this.toString = f;
                            return true;
                        case androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET /* 424 */:
                            this.isOutputSupportedFor = f;
                            return true;
                        case androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE /* 425 */:
                            this.unwrapAs = f;
                            return true;
                        default:
                            return super.setValue(i, f);
                    }
            }
        }
        this.getOutputSizes = f;
        return true;
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
            case -1019779949:
                if (str.equals("offset")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
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
            case 92909918:
                if (str.equals("alpha")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 106629499:
                if (str.equals(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PHASE)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 803192288:
                if (str.equals("pathRotate")) {
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
                return this.getInputFormats;
            case 1:
                return this.getOutputMinFrameDuration;
            case 2:
                return this.getOutputFormats;
            case 3:
                return this.getOutputMinFrameDurationlomOqCM;
            case 4:
                return this.isOutputSupportedForhNQ4ISI;
            case 5:
                return this.getValidOutputFormatsForInputhNQ4ISI;
            case 6:
                return this.isOutputSupportedFor;
            case 7:
                return this.getInputSizeshNQ4ISI;
            case '\b':
                return this.getOutputStallDurationlomOqCM;
            case '\t':
                return this.getOutputSizeshNQ4ISI;
            case '\n':
                return this.getHighSpeedVideoSizesFor;
            case 11:
                return this.getHighSpeedVideoSizes;
            case '\f':
                return this.unwrapAs;
            case '\r':
                return this.getOutputSizes;
            default:
                return Float.NaN;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1581616630:
                if (str.equals(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_CUSTOM_WAVE_SHAPE)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1310311125:
                if (str.equals("easing")) {
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
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1019779949:
                if (str.equals("offset")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -991726143:
                if (str.equals(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PERIOD)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 106629499:
                if (str.equals(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PHASE)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 803192288:
                if (str.equals("pathRotate")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1532805160:
                if (str.equals("waveShape")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c = 20;
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
                return 422;
            case 1:
                return androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING;
            case 2:
                return 308;
            case 3:
                return 309;
            case 4:
                return 310;
            case 5:
                return 304;
            case 6:
                return 305;
            case 7:
                return 306;
            case '\b':
                return androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET;
            case '\t':
                return 315;
            case '\n':
                return androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PERIOD;
            case 11:
                return 313;
            case '\f':
                return 314;
            case '\r':
                return 311;
            case 14:
                return 312;
            case 15:
                return 403;
            case 16:
                return androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE;
            case 17:
                return 401;
            case 18:
                return androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_PATH_ROTATE;
            case 19:
                return 421;
            case 20:
                return androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_VISIBILITY;
            default:
                return -1;
        }
    }

    public void addCycleValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> hashMap) {
        androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator;
        androidx.constraintlayout.core.motion.utils.KeyCycleOscillator keyCycleOscillator2;
        for (java.lang.String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.core.motion.CustomVariable customVariable = this.mCustom.get(str.substring(7));
                if (customVariable != null && customVariable.getType() == 901 && (keyCycleOscillator = hashMap.get(str)) != null) {
                    keyCycleOscillator.setPoint(this.mFramePosition, this.coroutineCreation, this.getHighSpeedVideoFpsRangesFor, -1, this.toString, this.isOutputSupportedFor, this.unwrapAs / 360.0f, customVariable.getValueToInterpolate(), customVariable);
                }
            } else {
                float value = getValue(str);
                if (!java.lang.Float.isNaN(value) && (keyCycleOscillator2 = hashMap.get(str)) != null) {
                    keyCycleOscillator2.setPoint(this.mFramePosition, this.coroutineCreation, this.getHighSpeedVideoFpsRangesFor, -1, this.toString, this.isOutputSupportedFor, this.unwrapAs / 360.0f, value);
                }
            }
        }
    }

    public void dump() {
        java.io.PrintStream printStream = java.lang.System.out;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MotionKeyCycle{mWaveShape=");
        sb.append(this.coroutineCreation);
        sb.append(", mWavePeriod=");
        sb.append(this.toString);
        sb.append(", mWaveOffset=");
        sb.append(this.isOutputSupportedFor);
        sb.append(", mWavePhase=");
        sb.append(this.unwrapAs);
        sb.append(", mRotation=");
        sb.append(this.getOutputFormats);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        printStream.println(sb.toString());
    }

    public void printAttributes() {
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>();
        getAttributeNames(hashSet);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" ------------- ");
        sb.append(this.mFramePosition);
        sb.append(" -------------");
        androidx.constraintlayout.core.motion.utils.Utils.log(sb.toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("MotionKeyCycle{Shape=");
        sb2.append(this.coroutineCreation);
        sb2.append(", Period=");
        sb2.append(this.toString);
        sb2.append(", Offset=");
        sb2.append(this.isOutputSupportedFor);
        sb2.append(", Phase=");
        sb2.append(this.unwrapAs);
        sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        androidx.constraintlayout.core.motion.utils.Utils.log(sb2.toString());
        java.lang.String[] strArr = (java.lang.String[]) hashSet.toArray(new java.lang.String[0]);
        for (int i = 0; i < strArr.length; i++) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(strArr[i]);
            sb3.append(io.ktor.sse.ServerSentEventKt.COLON);
            sb3.append(getValue(strArr[i]));
            androidx.constraintlayout.core.motion.utils.Utils.log(sb3.toString());
        }
    }
}

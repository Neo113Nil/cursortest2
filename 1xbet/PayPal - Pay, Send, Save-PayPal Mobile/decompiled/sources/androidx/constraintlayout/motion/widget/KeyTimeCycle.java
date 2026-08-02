package androidx.constraintlayout.motion.widget;

/* loaded from: classes7.dex */
public class KeyTimeCycle extends androidx.constraintlayout.motion.widget.Key {
    public static final int KEY_TYPE = 3;
    public static final int SHAPE_BOUNCE = 6;
    public static final int SHAPE_COS_WAVE = 5;
    public static final int SHAPE_REVERSE_SAW_WAVE = 4;
    public static final int SHAPE_SAW_WAVE = 3;
    public static final int SHAPE_SIN_WAVE = 0;
    public static final int SHAPE_SQUARE_WAVE = 1;
    public static final int SHAPE_TRIANGLE_WAVE = 2;
    public static final java.lang.String WAVE_OFFSET = "waveOffset";
    public static final java.lang.String WAVE_PERIOD = "wavePeriod";
    public static final java.lang.String WAVE_SHAPE = "waveShape";
    private java.lang.String getOutputSizeshNQ4ISI;
    private int getInputSizeshNQ4ISI = -1;
    private float getHighSpeedVideoFpsRangesFor = Float.NaN;
    private float getOutputFormats = Float.NaN;
    private float getOutputMinFrameDuration = Float.NaN;
    private float getOutputStallDuration = Float.NaN;
    private float getOutputStallDurationlomOqCM = Float.NaN;
    private float toString = Float.NaN;
    private float getOutputMinFrameDurationlomOqCM = Float.NaN;
    private float getOutputSizes = Float.NaN;
    private float unwrapAs = Float.NaN;
    private float isOutputSupportedFor = Float.NaN;
    private float getValidOutputFormatsForInputhNQ4ISI = Float.NaN;
    private float getInputFormats = Float.NaN;
    private int CoroutineDebuggingKt = 0;
    private java.lang.String getHighSpeedVideoSizesFor = null;
    private float accessartificialFrame = Float.NaN;
    private float isOutputSupportedForhNQ4ISI = 0.0f;

    public KeyTimeCycle() {
        this.mType = 3;
        this.Camera2StreamConfigurationMap = new java.util.HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo9054clone() throws java.lang.CloneNotSupportedException {
        return mo9054clone();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context context, android.util.AttributeSet attributeSet) {
        androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.getHighResolutionOutputSizeshNQ4ISI(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.KeyTimeCycle));
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(java.util.HashSet<java.lang.String> hashSet) {
        if (!java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor)) {
            hashSet.add("alpha");
        }
        if (!java.lang.Float.isNaN(this.getOutputFormats)) {
            hashSet.add("elevation");
        }
        if (!java.lang.Float.isNaN(this.getOutputMinFrameDuration)) {
            hashSet.add(androidx.constraintlayout.motion.widget.Key.ROTATION);
        }
        if (!java.lang.Float.isNaN(this.getOutputStallDuration)) {
            hashSet.add("rotationX");
        }
        if (!java.lang.Float.isNaN(this.getOutputStallDurationlomOqCM)) {
            hashSet.add("rotationY");
        }
        if (!java.lang.Float.isNaN(this.unwrapAs)) {
            hashSet.add("translationX");
        }
        if (!java.lang.Float.isNaN(this.isOutputSupportedFor)) {
            hashSet.add("translationY");
        }
        if (!java.lang.Float.isNaN(this.getValidOutputFormatsForInputhNQ4ISI)) {
            hashSet.add("translationZ");
        }
        if (!java.lang.Float.isNaN(this.toString)) {
            hashSet.add("transitionPathRotate");
        }
        if (!java.lang.Float.isNaN(this.getOutputMinFrameDurationlomOqCM)) {
            hashSet.add("scaleX");
        }
        if (!java.lang.Float.isNaN(this.getOutputSizes)) {
            hashSet.add("scaleY");
        }
        if (!java.lang.Float.isNaN(this.getInputFormats)) {
            hashSet.add("progress");
        }
        if (this.Camera2StreamConfigurationMap.size() > 0) {
            java.util.Iterator<java.lang.String> it = this.Camera2StreamConfigurationMap.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM,".concat(java.lang.String.valueOf(it.next())));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setInterpolation(java.util.HashMap<java.lang.String, java.lang.Integer> hashMap) {
        if (this.getInputSizeshNQ4ISI != -1) {
            if (!java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor)) {
                hashMap.put("alpha", java.lang.Integer.valueOf(this.getInputSizeshNQ4ISI));
            }
            if (!java.lang.Float.isNaN(this.getOutputFormats)) {
                hashMap.put("elevation", java.lang.Integer.valueOf(this.getInputSizeshNQ4ISI));
            }
            if (!java.lang.Float.isNaN(this.getOutputMinFrameDuration)) {
                hashMap.put(androidx.constraintlayout.motion.widget.Key.ROTATION, java.lang.Integer.valueOf(this.getInputSizeshNQ4ISI));
            }
            if (!java.lang.Float.isNaN(this.getOutputStallDuration)) {
                hashMap.put("rotationX", java.lang.Integer.valueOf(this.getInputSizeshNQ4ISI));
            }
            if (!java.lang.Float.isNaN(this.getOutputStallDurationlomOqCM)) {
                hashMap.put("rotationY", java.lang.Integer.valueOf(this.getInputSizeshNQ4ISI));
            }
            if (!java.lang.Float.isNaN(this.unwrapAs)) {
                hashMap.put("translationX", java.lang.Integer.valueOf(this.getInputSizeshNQ4ISI));
            }
            if (!java.lang.Float.isNaN(this.isOutputSupportedFor)) {
                hashMap.put("translationY", java.lang.Integer.valueOf(this.getInputSizeshNQ4ISI));
            }
            if (!java.lang.Float.isNaN(this.getValidOutputFormatsForInputhNQ4ISI)) {
                hashMap.put("translationZ", java.lang.Integer.valueOf(this.getInputSizeshNQ4ISI));
            }
            if (!java.lang.Float.isNaN(this.toString)) {
                hashMap.put("transitionPathRotate", java.lang.Integer.valueOf(this.getInputSizeshNQ4ISI));
            }
            if (!java.lang.Float.isNaN(this.getOutputMinFrameDurationlomOqCM)) {
                hashMap.put("scaleX", java.lang.Integer.valueOf(this.getInputSizeshNQ4ISI));
            }
            if (!java.lang.Float.isNaN(this.getOutputMinFrameDurationlomOqCM)) {
                hashMap.put("scaleY", java.lang.Integer.valueOf(this.getInputSizeshNQ4ISI));
            }
            if (!java.lang.Float.isNaN(this.getInputFormats)) {
                hashMap.put("progress", java.lang.Integer.valueOf(this.getInputSizeshNQ4ISI));
            }
            if (this.Camera2StreamConfigurationMap.size() > 0) {
                java.util.Iterator<java.lang.String> it = this.Camera2StreamConfigurationMap.keySet().iterator();
                while (it.hasNext()) {
                    hashMap.put("CUSTOM,".concat(java.lang.String.valueOf(it.next())), java.lang.Integer.valueOf(this.getInputSizeshNQ4ISI));
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> hashMap) {
        throw new java.lang.IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0084, code lost:
    
        if (r1.equals("scaleY") != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addTimeValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> hashMap) {
        java.util.Iterator<java.lang.String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            androidx.constraintlayout.motion.utils.ViewTimeCycle viewTimeCycle = hashMap.get(next);
            if (viewTimeCycle != null) {
                char c = 7;
                if (next.startsWith("CUSTOM")) {
                    androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = this.Camera2StreamConfigurationMap.get(next.substring(7));
                    if (constraintAttribute != null) {
                        ((androidx.constraintlayout.motion.utils.ViewTimeCycle.CustomSet) viewTimeCycle).setPoint(this.getHighResolutionOutputSizeshNQ4ISI, constraintAttribute, this.accessartificialFrame, this.CoroutineDebuggingKt, this.isOutputSupportedForhNQ4ISI);
                    }
                } else {
                    next.hashCode();
                    switch (next.hashCode()) {
                        case -1249320806:
                            if (next.equals("rotationX")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1249320805:
                            if (next.equals("rotationY")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497657:
                            if (next.equals("translationX")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497656:
                            if (next.equals("translationY")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497655:
                            if (next.equals("translationZ")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1001078227:
                            if (next.equals("progress")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189618:
                            if (next.equals("scaleX")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189617:
                            break;
                        case -40300674:
                            if (next.equals(androidx.constraintlayout.motion.widget.Key.ROTATION)) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -4379043:
                            if (next.equals("elevation")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 37232917:
                            if (next.equals("transitionPathRotate")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 92909918:
                            if (next.equals("alpha")) {
                                c = 11;
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
                            if (!java.lang.Float.isNaN(this.getOutputStallDuration)) {
                                viewTimeCycle.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputStallDuration, this.accessartificialFrame, this.CoroutineDebuggingKt, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (!java.lang.Float.isNaN(this.getOutputStallDurationlomOqCM)) {
                                viewTimeCycle.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputStallDurationlomOqCM, this.accessartificialFrame, this.CoroutineDebuggingKt, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (!java.lang.Float.isNaN(this.unwrapAs)) {
                                viewTimeCycle.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.unwrapAs, this.accessartificialFrame, this.CoroutineDebuggingKt, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (!java.lang.Float.isNaN(this.isOutputSupportedFor)) {
                                viewTimeCycle.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.isOutputSupportedFor, this.accessartificialFrame, this.CoroutineDebuggingKt, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (!java.lang.Float.isNaN(this.getValidOutputFormatsForInputhNQ4ISI)) {
                                viewTimeCycle.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getValidOutputFormatsForInputhNQ4ISI, this.accessartificialFrame, this.CoroutineDebuggingKt, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (!java.lang.Float.isNaN(this.getInputFormats)) {
                                viewTimeCycle.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, this.accessartificialFrame, this.CoroutineDebuggingKt, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (!java.lang.Float.isNaN(this.getOutputMinFrameDurationlomOqCM)) {
                                viewTimeCycle.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDurationlomOqCM, this.accessartificialFrame, this.CoroutineDebuggingKt, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (!java.lang.Float.isNaN(this.getOutputSizes)) {
                                viewTimeCycle.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputSizes, this.accessartificialFrame, this.CoroutineDebuggingKt, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case '\b':
                            if (!java.lang.Float.isNaN(this.getOutputMinFrameDuration)) {
                                viewTimeCycle.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.accessartificialFrame, this.CoroutineDebuggingKt, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case '\t':
                            if (!java.lang.Float.isNaN(this.getOutputFormats)) {
                                viewTimeCycle.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputFormats, this.accessartificialFrame, this.CoroutineDebuggingKt, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case '\n':
                            if (!java.lang.Float.isNaN(this.toString)) {
                                viewTimeCycle.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.toString, this.accessartificialFrame, this.CoroutineDebuggingKt, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (!java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor)) {
                                viewTimeCycle.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.accessartificialFrame, this.CoroutineDebuggingKt, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                    }
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
            case 1532805160:
                if (str.equals("waveShape")) {
                    c = 16;
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
                this.getInputFormats = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 1:
                this.getOutputSizeshNQ4ISI = obj.toString();
                break;
            case 2:
                this.getOutputStallDuration = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 3:
                this.getOutputStallDurationlomOqCM = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 4:
                this.unwrapAs = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 5:
                this.isOutputSupportedFor = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 6:
                this.getValidOutputFormatsForInputhNQ4ISI = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 7:
                this.getOutputMinFrameDurationlomOqCM = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case '\b':
                this.getOutputSizes = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case '\t':
                this.getOutputMinFrameDuration = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case '\n':
                this.getOutputFormats = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 11:
                this.toString = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case '\f':
                this.getHighSpeedVideoFpsRangesFor = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case '\r':
                this.isOutputSupportedForhNQ4ISI = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 14:
                this.accessartificialFrame = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 15:
                this.getInputSizeshNQ4ISI = obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : java.lang.Integer.parseInt(obj.toString());
                break;
            case 16:
                boolean z = obj instanceof java.lang.Integer;
                if (z) {
                    this.CoroutineDebuggingKt = z ? ((java.lang.Integer) obj).intValue() : java.lang.Integer.parseInt(obj.toString());
                    break;
                } else {
                    this.CoroutineDebuggingKt = 7;
                    this.getHighSpeedVideoSizesFor = obj.toString();
                    break;
                }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public androidx.constraintlayout.motion.widget.Key copy(androidx.constraintlayout.motion.widget.Key key) {
        super.copy(key);
        androidx.constraintlayout.motion.widget.KeyTimeCycle keyTimeCycle = (androidx.constraintlayout.motion.widget.KeyTimeCycle) key;
        this.getOutputSizeshNQ4ISI = keyTimeCycle.getOutputSizeshNQ4ISI;
        this.getInputSizeshNQ4ISI = keyTimeCycle.getInputSizeshNQ4ISI;
        this.CoroutineDebuggingKt = keyTimeCycle.CoroutineDebuggingKt;
        this.accessartificialFrame = keyTimeCycle.accessartificialFrame;
        this.isOutputSupportedForhNQ4ISI = keyTimeCycle.isOutputSupportedForhNQ4ISI;
        this.getInputFormats = keyTimeCycle.getInputFormats;
        this.getHighSpeedVideoFpsRangesFor = keyTimeCycle.getHighSpeedVideoFpsRangesFor;
        this.getOutputFormats = keyTimeCycle.getOutputFormats;
        this.getOutputMinFrameDuration = keyTimeCycle.getOutputMinFrameDuration;
        this.toString = keyTimeCycle.toString;
        this.getOutputStallDuration = keyTimeCycle.getOutputStallDuration;
        this.getOutputStallDurationlomOqCM = keyTimeCycle.getOutputStallDurationlomOqCM;
        this.getOutputMinFrameDurationlomOqCM = keyTimeCycle.getOutputMinFrameDurationlomOqCM;
        this.getOutputSizes = keyTimeCycle.getOutputSizes;
        this.unwrapAs = keyTimeCycle.unwrapAs;
        this.isOutputSupportedFor = keyTimeCycle.isOutputSupportedFor;
        this.getValidOutputFormatsForInputhNQ4ISI = keyTimeCycle.getValidOutputFormatsForInputhNQ4ISI;
        this.getHighSpeedVideoSizesFor = keyTimeCycle.getHighSpeedVideoSizesFor;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: clone */
    public androidx.constraintlayout.motion.widget.Key mo9054clone() {
        return new androidx.constraintlayout.motion.widget.KeyTimeCycle().copy(this);
    }

    static class Loader {
        private static android.util.SparseIntArray getHighSpeedVideoSizes;

        private Loader() {
        }

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            getHighSpeedVideoSizes = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_alpha, 1);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_elevation, 2);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_rotation, 4);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_rotationX, 5);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_rotationY, 6);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_scaleX, 7);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_transitionPathRotate, 8);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_transitionEasing, 9);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_motionTarget, 10);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_framePosition, 12);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_curveFit, 13);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_scaleY, 14);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_translationX, 15);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_translationY, 16);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_translationZ, 17);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_motionProgress, 18);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_wavePeriod, 20);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_waveOffset, 21);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_waveShape, 19);
        }

        public static void getHighResolutionOutputSizeshNQ4ISI(androidx.constraintlayout.motion.widget.KeyTimeCycle keyTimeCycle, android.content.res.TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (getHighSpeedVideoSizes.get(index)) {
                    case 1:
                        keyTimeCycle.getHighSpeedVideoFpsRangesFor = typedArray.getFloat(index, keyTimeCycle.getHighSpeedVideoFpsRangesFor);
                        break;
                    case 2:
                        keyTimeCycle.getOutputFormats = typedArray.getDimension(index, keyTimeCycle.getOutputFormats);
                        break;
                    case 3:
                    case 11:
                    default:
                        getHighSpeedVideoSizes.get(index);
                        break;
                    case 4:
                        keyTimeCycle.getOutputMinFrameDuration = typedArray.getFloat(index, keyTimeCycle.getOutputMinFrameDuration);
                        break;
                    case 5:
                        keyTimeCycle.getOutputStallDuration = typedArray.getFloat(index, keyTimeCycle.getOutputStallDuration);
                        break;
                    case 6:
                        keyTimeCycle.getOutputStallDurationlomOqCM = typedArray.getFloat(index, keyTimeCycle.getOutputStallDurationlomOqCM);
                        break;
                    case 7:
                        keyTimeCycle.getOutputMinFrameDurationlomOqCM = typedArray.getFloat(index, keyTimeCycle.getOutputMinFrameDurationlomOqCM);
                        break;
                    case 8:
                        keyTimeCycle.toString = typedArray.getFloat(index, keyTimeCycle.toString);
                        break;
                    case 9:
                        keyTimeCycle.getOutputSizeshNQ4ISI = typedArray.getString(index);
                        break;
                    case 10:
                        if (androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE) {
                            keyTimeCycle.getHighSpeedVideoSizes = typedArray.getResourceId(index, keyTimeCycle.getHighSpeedVideoSizes);
                            if (keyTimeCycle.getHighSpeedVideoSizes == -1) {
                                keyTimeCycle.getHighSpeedVideoFpsRanges = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            keyTimeCycle.getHighSpeedVideoFpsRanges = typedArray.getString(index);
                            break;
                        } else {
                            keyTimeCycle.getHighSpeedVideoSizes = typedArray.getResourceId(index, keyTimeCycle.getHighSpeedVideoSizes);
                            break;
                        }
                    case 12:
                        keyTimeCycle.getHighResolutionOutputSizeshNQ4ISI = typedArray.getInt(index, keyTimeCycle.getHighResolutionOutputSizeshNQ4ISI);
                        break;
                    case 13:
                        keyTimeCycle.getInputSizeshNQ4ISI = typedArray.getInteger(index, keyTimeCycle.getInputSizeshNQ4ISI);
                        break;
                    case 14:
                        keyTimeCycle.getOutputSizes = typedArray.getFloat(index, keyTimeCycle.getOutputSizes);
                        break;
                    case 15:
                        keyTimeCycle.unwrapAs = typedArray.getDimension(index, keyTimeCycle.unwrapAs);
                        break;
                    case 16:
                        keyTimeCycle.isOutputSupportedFor = typedArray.getDimension(index, keyTimeCycle.isOutputSupportedFor);
                        break;
                    case 17:
                        keyTimeCycle.getValidOutputFormatsForInputhNQ4ISI = typedArray.getDimension(index, keyTimeCycle.getValidOutputFormatsForInputhNQ4ISI);
                        break;
                    case 18:
                        keyTimeCycle.getInputFormats = typedArray.getFloat(index, keyTimeCycle.getInputFormats);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type == 3) {
                            keyTimeCycle.getHighSpeedVideoSizesFor = typedArray.getString(index);
                            keyTimeCycle.CoroutineDebuggingKt = 7;
                            break;
                        } else {
                            keyTimeCycle.CoroutineDebuggingKt = typedArray.getInt(index, keyTimeCycle.CoroutineDebuggingKt);
                            break;
                        }
                    case 20:
                        keyTimeCycle.accessartificialFrame = typedArray.getFloat(index, keyTimeCycle.accessartificialFrame);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            keyTimeCycle.isOutputSupportedForhNQ4ISI = typedArray.getDimension(index, keyTimeCycle.isOutputSupportedForhNQ4ISI);
                            break;
                        } else {
                            keyTimeCycle.isOutputSupportedForhNQ4ISI = typedArray.getFloat(index, keyTimeCycle.isOutputSupportedForhNQ4ISI);
                            break;
                        }
                }
            }
        }
    }
}

package androidx.constraintlayout.core.motion.key;

/* loaded from: classes6.dex */
public class MotionKeyTimeCycle extends androidx.constraintlayout.core.motion.key.MotionKey {
    public static final int KEY_TYPE = 3;
    private java.lang.String getOutputSizes;
    private int getHighSpeedVideoFpsRangesFor = -1;
    private float Camera2StreamConfigurationMap = Float.NaN;
    private float getInputSizeshNQ4ISI = Float.NaN;
    private float getOutputFormats = Float.NaN;
    private float getInputFormats = Float.NaN;
    private float getHighSpeedVideoSizesFor = Float.NaN;
    private float getOutputSizeshNQ4ISI = Float.NaN;
    private float getOutputMinFrameDurationlomOqCM = Float.NaN;
    private float getOutputStallDuration = Float.NaN;
    private float getOutputStallDurationlomOqCM = Float.NaN;
    private float isOutputSupportedFor = Float.NaN;
    private float toString = Float.NaN;
    private float getOutputMinFrameDuration = Float.NaN;
    private int getValidOutputFormatsForInputhNQ4ISI = 0;
    private java.lang.String getHighSpeedVideoSizes = null;
    private float unwrapAs = Float.NaN;
    private float isOutputSupportedForhNQ4ISI = 0.0f;

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> hashMap) {
    }

    public MotionKeyTimeCycle() {
        this.mType = 3;
        this.mCustom = new java.util.HashMap<>();
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo9052clone() throws java.lang.CloneNotSupportedException {
        return mo9052clone();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0084, code lost:
    
        if (r1.equals("scaleX") != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addTimeValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> hashMap) {
        java.util.Iterator<java.lang.String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet timeCycleSplineSet = hashMap.get(next);
            if (timeCycleSplineSet != null) {
                char c = 7;
                if (next.startsWith("CUSTOM")) {
                    androidx.constraintlayout.core.motion.CustomVariable customVariable = this.mCustom.get(next.substring(7));
                    if (customVariable != null) {
                        ((androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet.CustomVarSet) timeCycleSplineSet).setPoint(this.mFramePosition, customVariable, this.unwrapAs, this.getValidOutputFormatsForInputhNQ4ISI, this.isOutputSupportedForhNQ4ISI);
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
                        case -1249320804:
                            if (next.equals("rotationZ")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497657:
                            if (next.equals("translationX")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497656:
                            if (next.equals("translationY")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497655:
                            if (next.equals("translationZ")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1001078227:
                            if (next.equals("progress")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189618:
                            break;
                        case -908189617:
                            if (next.equals("scaleY")) {
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
                        case 92909918:
                            if (next.equals("alpha")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 803192288:
                            if (next.equals("pathRotate")) {
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
                            if (!java.lang.Float.isNaN(this.getInputFormats)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.getInputFormats, this.unwrapAs, this.getValidOutputFormatsForInputhNQ4ISI, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (!java.lang.Float.isNaN(this.getHighSpeedVideoSizesFor)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.getHighSpeedVideoSizesFor, this.unwrapAs, this.getValidOutputFormatsForInputhNQ4ISI, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (!java.lang.Float.isNaN(this.getOutputFormats)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.getOutputFormats, this.unwrapAs, this.getValidOutputFormatsForInputhNQ4ISI, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (!java.lang.Float.isNaN(this.getOutputStallDurationlomOqCM)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.getOutputStallDurationlomOqCM, this.unwrapAs, this.getValidOutputFormatsForInputhNQ4ISI, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (!java.lang.Float.isNaN(this.isOutputSupportedFor)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.isOutputSupportedFor, this.unwrapAs, this.getValidOutputFormatsForInputhNQ4ISI, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (!java.lang.Float.isNaN(this.toString)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.toString, this.unwrapAs, this.getValidOutputFormatsForInputhNQ4ISI, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (!java.lang.Float.isNaN(this.getOutputMinFrameDuration)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.getOutputMinFrameDuration, this.unwrapAs, this.getValidOutputFormatsForInputhNQ4ISI, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (!java.lang.Float.isNaN(this.getOutputMinFrameDurationlomOqCM)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.getOutputMinFrameDurationlomOqCM, this.unwrapAs, this.getValidOutputFormatsForInputhNQ4ISI, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case '\b':
                            if (!java.lang.Float.isNaN(this.getOutputStallDuration)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.getOutputStallDuration, this.unwrapAs, this.getValidOutputFormatsForInputhNQ4ISI, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case '\t':
                            if (!java.lang.Float.isNaN(this.toString)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.toString, this.unwrapAs, this.getValidOutputFormatsForInputhNQ4ISI, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case '\n':
                            if (!java.lang.Float.isNaN(this.Camera2StreamConfigurationMap)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.Camera2StreamConfigurationMap, this.unwrapAs, this.getValidOutputFormatsForInputhNQ4ISI, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (!java.lang.Float.isNaN(this.getOutputSizeshNQ4ISI)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.getOutputSizeshNQ4ISI, this.unwrapAs, this.getValidOutputFormatsForInputhNQ4ISI, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        default:
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("UNKNOWN addValues \"");
                            sb.append(next);
                            sb.append("\"");
                            androidx.constraintlayout.core.motion.utils.Utils.loge("KeyTimeCycles", sb.toString());
                            break;
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        if (i == 100) {
            this.mFramePosition = i2;
            return true;
        }
        if (i == 421) {
            this.getValidOutputFormatsForInputhNQ4ISI = i2;
            return true;
        }
        return super.setValue(i, i2);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        if (i == 315) {
            java.lang.Float valueOf = java.lang.Float.valueOf(f);
            this.getOutputMinFrameDuration = valueOf instanceof java.lang.Float ? valueOf.floatValue() : java.lang.Float.parseFloat(valueOf.toString());
            return true;
        }
        if (i == 401) {
            this.getHighSpeedVideoFpsRangesFor = java.lang.Integer.parseInt(java.lang.Float.valueOf(f).toString());
            return true;
        }
        if (i == 403) {
            this.Camera2StreamConfigurationMap = f;
            return true;
        }
        if (i == 416) {
            java.lang.Float valueOf2 = java.lang.Float.valueOf(f);
            this.getOutputSizeshNQ4ISI = valueOf2 instanceof java.lang.Float ? valueOf2.floatValue() : java.lang.Float.parseFloat(valueOf2.toString());
            return true;
        }
        if (i == 423) {
            java.lang.Float valueOf3 = java.lang.Float.valueOf(f);
            this.unwrapAs = valueOf3 instanceof java.lang.Float ? valueOf3.floatValue() : java.lang.Float.parseFloat(valueOf3.toString());
            return true;
        }
        if (i != 424) {
            switch (i) {
                case 304:
                    java.lang.Float valueOf4 = java.lang.Float.valueOf(f);
                    this.getOutputStallDurationlomOqCM = valueOf4 instanceof java.lang.Float ? valueOf4.floatValue() : java.lang.Float.parseFloat(valueOf4.toString());
                    return true;
                case 305:
                    java.lang.Float valueOf5 = java.lang.Float.valueOf(f);
                    this.isOutputSupportedFor = valueOf5 instanceof java.lang.Float ? valueOf5.floatValue() : java.lang.Float.parseFloat(valueOf5.toString());
                    return true;
                case 306:
                    java.lang.Float valueOf6 = java.lang.Float.valueOf(f);
                    this.toString = valueOf6 instanceof java.lang.Float ? valueOf6.floatValue() : java.lang.Float.parseFloat(valueOf6.toString());
                    return true;
                case 307:
                    java.lang.Float valueOf7 = java.lang.Float.valueOf(f);
                    this.getInputSizeshNQ4ISI = valueOf7 instanceof java.lang.Float ? valueOf7.floatValue() : java.lang.Float.parseFloat(valueOf7.toString());
                    return true;
                case 308:
                    java.lang.Float valueOf8 = java.lang.Float.valueOf(f);
                    this.getInputFormats = valueOf8 instanceof java.lang.Float ? valueOf8.floatValue() : java.lang.Float.parseFloat(valueOf8.toString());
                    return true;
                case 309:
                    java.lang.Float valueOf9 = java.lang.Float.valueOf(f);
                    this.getHighSpeedVideoSizesFor = valueOf9 instanceof java.lang.Float ? valueOf9.floatValue() : java.lang.Float.parseFloat(valueOf9.toString());
                    return true;
                case 310:
                    java.lang.Float valueOf10 = java.lang.Float.valueOf(f);
                    this.getOutputFormats = valueOf10 instanceof java.lang.Float ? valueOf10.floatValue() : java.lang.Float.parseFloat(valueOf10.toString());
                    return true;
                case 311:
                    java.lang.Float valueOf11 = java.lang.Float.valueOf(f);
                    this.getOutputMinFrameDurationlomOqCM = valueOf11 instanceof java.lang.Float ? valueOf11.floatValue() : java.lang.Float.parseFloat(valueOf11.toString());
                    return true;
                case 312:
                    java.lang.Float valueOf12 = java.lang.Float.valueOf(f);
                    this.getOutputStallDuration = valueOf12 instanceof java.lang.Float ? valueOf12.floatValue() : java.lang.Float.parseFloat(valueOf12.toString());
                    return true;
                default:
                    return super.setValue(i, f);
            }
        }
        java.lang.Float valueOf13 = java.lang.Float.valueOf(f);
        this.isOutputSupportedForhNQ4ISI = valueOf13 instanceof java.lang.Float ? valueOf13.floatValue() : java.lang.Float.parseFloat(valueOf13.toString());
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, java.lang.String str) {
        if (i == 420) {
            this.getOutputSizes = str;
            return true;
        }
        if (i == 421) {
            this.getValidOutputFormatsForInputhNQ4ISI = 7;
            this.getHighSpeedVideoSizes = str;
            return true;
        }
        return super.setValue(i, str);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, boolean z) {
        return super.setValue(i, z);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle copy(androidx.constraintlayout.core.motion.key.MotionKey motionKey) {
        super.copy(motionKey);
        androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle motionKeyTimeCycle = (androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle) motionKey;
        this.getOutputSizes = motionKeyTimeCycle.getOutputSizes;
        this.getHighSpeedVideoFpsRangesFor = motionKeyTimeCycle.getHighSpeedVideoFpsRangesFor;
        this.getValidOutputFormatsForInputhNQ4ISI = motionKeyTimeCycle.getValidOutputFormatsForInputhNQ4ISI;
        this.unwrapAs = motionKeyTimeCycle.unwrapAs;
        this.isOutputSupportedForhNQ4ISI = motionKeyTimeCycle.isOutputSupportedForhNQ4ISI;
        this.getOutputMinFrameDuration = motionKeyTimeCycle.getOutputMinFrameDuration;
        this.Camera2StreamConfigurationMap = motionKeyTimeCycle.Camera2StreamConfigurationMap;
        this.getInputSizeshNQ4ISI = motionKeyTimeCycle.getInputSizeshNQ4ISI;
        this.getOutputFormats = motionKeyTimeCycle.getOutputFormats;
        this.getOutputSizeshNQ4ISI = motionKeyTimeCycle.getOutputSizeshNQ4ISI;
        this.getInputFormats = motionKeyTimeCycle.getInputFormats;
        this.getHighSpeedVideoSizesFor = motionKeyTimeCycle.getHighSpeedVideoSizesFor;
        this.getOutputMinFrameDurationlomOqCM = motionKeyTimeCycle.getOutputMinFrameDurationlomOqCM;
        this.getOutputStallDuration = motionKeyTimeCycle.getOutputStallDuration;
        this.getOutputStallDurationlomOqCM = motionKeyTimeCycle.getOutputStallDurationlomOqCM;
        this.isOutputSupportedFor = motionKeyTimeCycle.isOutputSupportedFor;
        this.toString = motionKeyTimeCycle.toString;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(java.util.HashSet<java.lang.String> hashSet) {
        if (!java.lang.Float.isNaN(this.Camera2StreamConfigurationMap)) {
            hashSet.add("alpha");
        }
        if (!java.lang.Float.isNaN(this.getInputSizeshNQ4ISI)) {
            hashSet.add("elevation");
        }
        if (!java.lang.Float.isNaN(this.getOutputFormats)) {
            hashSet.add("rotationZ");
        }
        if (!java.lang.Float.isNaN(this.getInputFormats)) {
            hashSet.add("rotationX");
        }
        if (!java.lang.Float.isNaN(this.getHighSpeedVideoSizesFor)) {
            hashSet.add("rotationY");
        }
        if (!java.lang.Float.isNaN(this.getOutputMinFrameDurationlomOqCM)) {
            hashSet.add("scaleX");
        }
        if (!java.lang.Float.isNaN(this.getOutputStallDuration)) {
            hashSet.add("scaleY");
        }
        if (!java.lang.Float.isNaN(this.getOutputSizeshNQ4ISI)) {
            hashSet.add("pathRotate");
        }
        if (!java.lang.Float.isNaN(this.getOutputStallDurationlomOqCM)) {
            hashSet.add("translationX");
        }
        if (!java.lang.Float.isNaN(this.isOutputSupportedFor)) {
            hashSet.add("translationY");
        }
        if (!java.lang.Float.isNaN(this.toString)) {
            hashSet.add("translationZ");
        }
        if (this.mCustom.size() > 0) {
            java.util.Iterator<java.lang.String> it = this.mCustom.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM,".concat(java.lang.String.valueOf(it.next())));
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public androidx.constraintlayout.core.motion.key.MotionKey mo9052clone() {
        return new androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle().copy((androidx.constraintlayout.core.motion.key.MotionKey) this);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String str) {
        return androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.getId(str);
    }
}

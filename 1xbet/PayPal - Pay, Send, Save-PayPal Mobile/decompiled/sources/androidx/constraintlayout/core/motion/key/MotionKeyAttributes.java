package androidx.constraintlayout.core.motion.key;

/* loaded from: classes6.dex */
public class MotionKeyAttributes extends androidx.constraintlayout.core.motion.key.MotionKey {
    public static final int KEY_TYPE = 1;
    private java.lang.String getOutputSizeshNQ4ISI;
    private int Camera2StreamConfigurationMap = -1;
    private int getValidOutputFormatsForInputhNQ4ISI = 0;
    private float getHighSpeedVideoFpsRangesFor = Float.NaN;
    private float getHighSpeedVideoSizes = Float.NaN;
    private float getOutputMinFrameDuration = Float.NaN;
    private float getInputSizeshNQ4ISI = Float.NaN;
    private float getOutputStallDurationlomOqCM = Float.NaN;
    private float getHighSpeedVideoSizesFor = Float.NaN;
    private float getInputFormats = Float.NaN;
    private float getOutputSizes = Float.NaN;
    private float getOutputMinFrameDurationlomOqCM = Float.NaN;
    private float getOutputStallDuration = Float.NaN;
    private float isOutputSupportedFor = Float.NaN;
    private float toString = Float.NaN;
    private float unwrapAs = Float.NaN;
    private float getOutputFormats = Float.NaN;

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public androidx.constraintlayout.core.motion.key.MotionKey mo9052clone() {
        return null;
    }

    public MotionKeyAttributes() {
        this.mType = 1;
        this.mCustom = new java.util.HashMap<>();
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo9052clone() throws java.lang.CloneNotSupportedException {
        return mo9052clone();
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(java.util.HashSet<java.lang.String> hashSet) {
        if (!java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor)) {
            hashSet.add("alpha");
        }
        if (!java.lang.Float.isNaN(this.getHighSpeedVideoSizes)) {
            hashSet.add("elevation");
        }
        if (!java.lang.Float.isNaN(this.getOutputMinFrameDuration)) {
            hashSet.add("rotationZ");
        }
        if (!java.lang.Float.isNaN(this.getInputSizeshNQ4ISI)) {
            hashSet.add("rotationX");
        }
        if (!java.lang.Float.isNaN(this.getOutputStallDurationlomOqCM)) {
            hashSet.add("rotationY");
        }
        if (!java.lang.Float.isNaN(this.getHighSpeedVideoSizesFor)) {
            hashSet.add("pivotX");
        }
        if (!java.lang.Float.isNaN(this.getInputFormats)) {
            hashSet.add("pivotY");
        }
        if (!java.lang.Float.isNaN(this.isOutputSupportedFor)) {
            hashSet.add("translationX");
        }
        if (!java.lang.Float.isNaN(this.toString)) {
            hashSet.add("translationY");
        }
        if (!java.lang.Float.isNaN(this.unwrapAs)) {
            hashSet.add("translationZ");
        }
        if (!java.lang.Float.isNaN(this.getOutputSizes)) {
            hashSet.add("pathRotate");
        }
        if (!java.lang.Float.isNaN(this.getOutputMinFrameDurationlomOqCM)) {
            hashSet.add("scaleX");
        }
        if (!java.lang.Float.isNaN(this.getOutputStallDuration)) {
            hashSet.add("scaleY");
        }
        if (!java.lang.Float.isNaN(this.getOutputFormats)) {
            hashSet.add("progress");
        }
        if (this.mCustom.size() > 0) {
            java.util.Iterator<java.lang.String> it = this.mCustom.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM,".concat(java.lang.String.valueOf(it.next())));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0093, code lost:
    
        if (r1.equals("pivotX") != false) goto L59;
     */
    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> hashMap) {
        java.util.Iterator<java.lang.String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            androidx.constraintlayout.core.motion.utils.SplineSet splineSet = hashMap.get(next);
            if (splineSet != null) {
                char c = 7;
                if (next.startsWith("CUSTOM")) {
                    androidx.constraintlayout.core.motion.CustomVariable customVariable = this.mCustom.get(next.substring(7));
                    if (customVariable != null) {
                        ((androidx.constraintlayout.core.motion.utils.SplineSet.CustomSpline) splineSet).setPoint(this.mFramePosition, customVariable);
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
                        case -987906986:
                            break;
                        case -987906985:
                            if (next.equals("pivotY")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189618:
                            if (next.equals("scaleX")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189617:
                            if (next.equals("scaleY")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case -4379043:
                            if (next.equals("elevation")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 92909918:
                            if (next.equals("alpha")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 803192288:
                            if (next.equals("pathRotate")) {
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
                            if (!java.lang.Float.isNaN(this.getInputSizeshNQ4ISI)) {
                                splineSet.setPoint(this.mFramePosition, this.getInputSizeshNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (!java.lang.Float.isNaN(this.getOutputStallDurationlomOqCM)) {
                                splineSet.setPoint(this.mFramePosition, this.getOutputStallDurationlomOqCM);
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (!java.lang.Float.isNaN(this.getOutputMinFrameDuration)) {
                                splineSet.setPoint(this.mFramePosition, this.getOutputMinFrameDuration);
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (!java.lang.Float.isNaN(this.isOutputSupportedFor)) {
                                splineSet.setPoint(this.mFramePosition, this.isOutputSupportedFor);
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (!java.lang.Float.isNaN(this.toString)) {
                                splineSet.setPoint(this.mFramePosition, this.toString);
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (!java.lang.Float.isNaN(this.unwrapAs)) {
                                splineSet.setPoint(this.mFramePosition, this.unwrapAs);
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (!java.lang.Float.isNaN(this.getOutputFormats)) {
                                splineSet.setPoint(this.mFramePosition, this.getOutputFormats);
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (!java.lang.Float.isNaN(this.getInputSizeshNQ4ISI)) {
                                splineSet.setPoint(this.mFramePosition, this.getHighSpeedVideoSizesFor);
                                break;
                            } else {
                                break;
                            }
                        case '\b':
                            if (!java.lang.Float.isNaN(this.getOutputStallDurationlomOqCM)) {
                                splineSet.setPoint(this.mFramePosition, this.getInputFormats);
                                break;
                            } else {
                                break;
                            }
                        case '\t':
                            if (!java.lang.Float.isNaN(this.getOutputMinFrameDurationlomOqCM)) {
                                splineSet.setPoint(this.mFramePosition, this.getOutputMinFrameDurationlomOqCM);
                                break;
                            } else {
                                break;
                            }
                        case '\n':
                            if (!java.lang.Float.isNaN(this.getOutputStallDuration)) {
                                splineSet.setPoint(this.mFramePosition, this.getOutputStallDuration);
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (!java.lang.Float.isNaN(this.getHighSpeedVideoSizes)) {
                                splineSet.setPoint(this.mFramePosition, this.getHighSpeedVideoSizes);
                                break;
                            } else {
                                break;
                            }
                        case '\f':
                            if (!java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor)) {
                                splineSet.setPoint(this.mFramePosition, this.getHighSpeedVideoFpsRangesFor);
                                break;
                            } else {
                                break;
                            }
                        case '\r':
                            if (!java.lang.Float.isNaN(this.getOutputSizes)) {
                                splineSet.setPoint(this.mFramePosition, this.getOutputSizes);
                                break;
                            } else {
                                break;
                            }
                        default:
                            java.lang.System.err.println("not supported by KeyAttributes ".concat(java.lang.String.valueOf(next)));
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
        if (i == 301) {
            this.Camera2StreamConfigurationMap = i2;
            return true;
        }
        if (i == 302) {
            this.getValidOutputFormatsForInputhNQ4ISI = i2;
            return true;
        }
        if (setValue(i, i2)) {
            return true;
        }
        return super.setValue(i, i2);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        if (i != 100) {
            switch (i) {
                case 303:
                    this.getHighSpeedVideoFpsRangesFor = f;
                    return true;
                case 304:
                    this.isOutputSupportedFor = f;
                    return true;
                case 305:
                    this.toString = f;
                    return true;
                case 306:
                    this.unwrapAs = f;
                    return true;
                case 307:
                    this.getHighSpeedVideoSizes = f;
                    return true;
                case 308:
                    this.getInputSizeshNQ4ISI = f;
                    return true;
                case 309:
                    this.getOutputStallDurationlomOqCM = f;
                    return true;
                case 310:
                    this.getOutputMinFrameDuration = f;
                    return true;
                case 311:
                    this.getOutputMinFrameDurationlomOqCM = f;
                    return true;
                case 312:
                    this.getOutputStallDuration = f;
                    return true;
                case 313:
                    this.getHighSpeedVideoSizesFor = f;
                    return true;
                case 314:
                    this.getInputFormats = f;
                    return true;
                case 315:
                    this.getOutputFormats = f;
                    return true;
                case 316:
                    this.getOutputSizes = f;
                    return true;
                default:
                    return super.setValue(i, f);
            }
        }
        this.getOutputSizes = f;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void setInterpolation(java.util.HashMap<java.lang.String, java.lang.Integer> hashMap) {
        if (!java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor)) {
            hashMap.put("alpha", java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap));
        }
        if (!java.lang.Float.isNaN(this.getHighSpeedVideoSizes)) {
            hashMap.put("elevation", java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap));
        }
        if (!java.lang.Float.isNaN(this.getOutputMinFrameDuration)) {
            hashMap.put("rotationZ", java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap));
        }
        if (!java.lang.Float.isNaN(this.getInputSizeshNQ4ISI)) {
            hashMap.put("rotationX", java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap));
        }
        if (!java.lang.Float.isNaN(this.getOutputStallDurationlomOqCM)) {
            hashMap.put("rotationY", java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap));
        }
        if (!java.lang.Float.isNaN(this.getHighSpeedVideoSizesFor)) {
            hashMap.put("pivotX", java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap));
        }
        if (!java.lang.Float.isNaN(this.getInputFormats)) {
            hashMap.put("pivotY", java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap));
        }
        if (!java.lang.Float.isNaN(this.isOutputSupportedFor)) {
            hashMap.put("translationX", java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap));
        }
        if (!java.lang.Float.isNaN(this.toString)) {
            hashMap.put("translationY", java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap));
        }
        if (!java.lang.Float.isNaN(this.unwrapAs)) {
            hashMap.put("translationZ", java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap));
        }
        if (!java.lang.Float.isNaN(this.getOutputSizes)) {
            hashMap.put("pathRotate", java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap));
        }
        if (!java.lang.Float.isNaN(this.getOutputMinFrameDurationlomOqCM)) {
            hashMap.put("scaleX", java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap));
        }
        if (!java.lang.Float.isNaN(this.getOutputStallDuration)) {
            hashMap.put("scaleY", java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap));
        }
        if (!java.lang.Float.isNaN(this.getOutputFormats)) {
            hashMap.put("progress", java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap));
        }
        if (this.mCustom.size() > 0) {
            java.util.Iterator<java.lang.String> it = this.mCustom.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put("CUSTOM,".concat(java.lang.String.valueOf(it.next())), java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap));
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, java.lang.String str) {
        if (i == 101) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            return true;
        }
        if (i == 317) {
            this.getOutputSizeshNQ4ISI = str;
            return true;
        }
        return super.setValue(i, str);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String str) {
        return androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.getId(str);
    }

    public int getCurveFit() {
        return this.Camera2StreamConfigurationMap;
    }

    public void printAttributes() {
        float f;
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>();
        getAttributeNames(hashSet);
        java.io.PrintStream printStream = java.lang.System.out;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" ------------- ");
        sb.append(this.mFramePosition);
        sb.append(" -------------");
        printStream.println(sb.toString());
        java.lang.String[] strArr = (java.lang.String[]) hashSet.toArray(new java.lang.String[0]);
        for (int i = 0; i < strArr.length; i++) {
            int id = androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.getId(strArr[i]);
            java.io.PrintStream printStream2 = java.lang.System.out;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(strArr[i]);
            sb2.append(io.ktor.sse.ServerSentEventKt.COLON);
            if (id != 100) {
                switch (id) {
                    case 303:
                        f = this.getHighSpeedVideoFpsRangesFor;
                        break;
                    case 304:
                        f = this.isOutputSupportedFor;
                        break;
                    case 305:
                        f = this.toString;
                        break;
                    case 306:
                        f = this.unwrapAs;
                        break;
                    case 307:
                        f = this.getHighSpeedVideoSizes;
                        break;
                    case 308:
                        f = this.getInputSizeshNQ4ISI;
                        break;
                    case 309:
                        f = this.getOutputStallDurationlomOqCM;
                        break;
                    case 310:
                        f = this.getOutputMinFrameDuration;
                        break;
                    case 311:
                        f = this.getOutputMinFrameDurationlomOqCM;
                        break;
                    case 312:
                        f = this.getOutputStallDuration;
                        break;
                    case 313:
                        f = this.getHighSpeedVideoSizesFor;
                        break;
                    case 314:
                        f = this.getInputFormats;
                        break;
                    case 315:
                        f = this.getOutputFormats;
                        break;
                    case 316:
                        f = this.getOutputSizes;
                        break;
                    default:
                        f = Float.NaN;
                        break;
                }
            } else {
                f = this.mFramePosition;
            }
            sb2.append(f);
            printStream2.println(sb2.toString());
        }
    }
}

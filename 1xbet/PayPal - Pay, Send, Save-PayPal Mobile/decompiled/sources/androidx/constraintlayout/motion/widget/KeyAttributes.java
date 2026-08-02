package androidx.constraintlayout.motion.widget;

/* loaded from: classes7.dex */
public class KeyAttributes extends androidx.constraintlayout.motion.widget.Key {
    public static final int KEY_TYPE = 1;
    private java.lang.String getValidOutputFormatsForInputhNQ4ISI;
    private int getInputFormats = -1;
    private boolean coroutineBoundary = false;
    private float getHighSpeedVideoFpsRangesFor = Float.NaN;
    private float getOutputFormats = Float.NaN;
    private float getOutputSizes = Float.NaN;
    private float getOutputSizeshNQ4ISI = Float.NaN;
    private float getOutputMinFrameDurationlomOqCM = Float.NaN;
    private float getHighSpeedVideoSizesFor = Float.NaN;
    private float getInputSizeshNQ4ISI = Float.NaN;
    private float isOutputSupportedFor = Float.NaN;
    private float getOutputStallDurationlomOqCM = Float.NaN;
    private float getOutputStallDuration = Float.NaN;
    private float unwrapAs = Float.NaN;
    private float isOutputSupportedForhNQ4ISI = Float.NaN;
    private float toString = Float.NaN;
    private float getOutputMinFrameDuration = Float.NaN;

    public KeyAttributes() {
        this.mType = 1;
        this.Camera2StreamConfigurationMap = new java.util.HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo9054clone() throws java.lang.CloneNotSupportedException {
        return mo9054clone();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context context, android.util.AttributeSet attributeSet) {
        androidx.constraintlayout.motion.widget.KeyAttributes.Loader.getHighSpeedVideoFpsRangesFor(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.KeyAttribute));
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(java.util.HashSet<java.lang.String> hashSet) {
        if (!java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor)) {
            hashSet.add("alpha");
        }
        if (!java.lang.Float.isNaN(this.getOutputFormats)) {
            hashSet.add("elevation");
        }
        if (!java.lang.Float.isNaN(this.getOutputSizes)) {
            hashSet.add(androidx.constraintlayout.motion.widget.Key.ROTATION);
        }
        if (!java.lang.Float.isNaN(this.getOutputSizeshNQ4ISI)) {
            hashSet.add("rotationX");
        }
        if (!java.lang.Float.isNaN(this.getOutputMinFrameDurationlomOqCM)) {
            hashSet.add("rotationY");
        }
        if (!java.lang.Float.isNaN(this.getHighSpeedVideoSizesFor)) {
            hashSet.add(androidx.constraintlayout.motion.widget.Key.PIVOT_X);
        }
        if (!java.lang.Float.isNaN(this.getInputSizeshNQ4ISI)) {
            hashSet.add(androidx.constraintlayout.motion.widget.Key.PIVOT_Y);
        }
        if (!java.lang.Float.isNaN(this.unwrapAs)) {
            hashSet.add("translationX");
        }
        if (!java.lang.Float.isNaN(this.isOutputSupportedForhNQ4ISI)) {
            hashSet.add("translationY");
        }
        if (!java.lang.Float.isNaN(this.toString)) {
            hashSet.add("translationZ");
        }
        if (!java.lang.Float.isNaN(this.isOutputSupportedFor)) {
            hashSet.add("transitionPathRotate");
        }
        if (!java.lang.Float.isNaN(this.getOutputStallDurationlomOqCM)) {
            hashSet.add("scaleX");
        }
        if (!java.lang.Float.isNaN(this.getOutputStallDuration)) {
            hashSet.add("scaleY");
        }
        if (!java.lang.Float.isNaN(this.getOutputMinFrameDuration)) {
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
        if (this.getInputFormats != -1) {
            if (!java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor)) {
                hashMap.put("alpha", java.lang.Integer.valueOf(this.getInputFormats));
            }
            if (!java.lang.Float.isNaN(this.getOutputFormats)) {
                hashMap.put("elevation", java.lang.Integer.valueOf(this.getInputFormats));
            }
            if (!java.lang.Float.isNaN(this.getOutputSizes)) {
                hashMap.put(androidx.constraintlayout.motion.widget.Key.ROTATION, java.lang.Integer.valueOf(this.getInputFormats));
            }
            if (!java.lang.Float.isNaN(this.getOutputSizeshNQ4ISI)) {
                hashMap.put("rotationX", java.lang.Integer.valueOf(this.getInputFormats));
            }
            if (!java.lang.Float.isNaN(this.getOutputMinFrameDurationlomOqCM)) {
                hashMap.put("rotationY", java.lang.Integer.valueOf(this.getInputFormats));
            }
            if (!java.lang.Float.isNaN(this.getHighSpeedVideoSizesFor)) {
                hashMap.put(androidx.constraintlayout.motion.widget.Key.PIVOT_X, java.lang.Integer.valueOf(this.getInputFormats));
            }
            if (!java.lang.Float.isNaN(this.getInputSizeshNQ4ISI)) {
                hashMap.put(androidx.constraintlayout.motion.widget.Key.PIVOT_Y, java.lang.Integer.valueOf(this.getInputFormats));
            }
            if (!java.lang.Float.isNaN(this.unwrapAs)) {
                hashMap.put("translationX", java.lang.Integer.valueOf(this.getInputFormats));
            }
            if (!java.lang.Float.isNaN(this.isOutputSupportedForhNQ4ISI)) {
                hashMap.put("translationY", java.lang.Integer.valueOf(this.getInputFormats));
            }
            if (!java.lang.Float.isNaN(this.toString)) {
                hashMap.put("translationZ", java.lang.Integer.valueOf(this.getInputFormats));
            }
            if (!java.lang.Float.isNaN(this.isOutputSupportedFor)) {
                hashMap.put("transitionPathRotate", java.lang.Integer.valueOf(this.getInputFormats));
            }
            if (!java.lang.Float.isNaN(this.getOutputStallDurationlomOqCM)) {
                hashMap.put("scaleX", java.lang.Integer.valueOf(this.getInputFormats));
            }
            if (!java.lang.Float.isNaN(this.getOutputStallDuration)) {
                hashMap.put("scaleY", java.lang.Integer.valueOf(this.getInputFormats));
            }
            if (!java.lang.Float.isNaN(this.getOutputMinFrameDuration)) {
                hashMap.put("progress", java.lang.Integer.valueOf(this.getInputFormats));
            }
            if (this.Camera2StreamConfigurationMap.size() > 0) {
                java.util.Iterator<java.lang.String> it = this.Camera2StreamConfigurationMap.keySet().iterator();
                while (it.hasNext()) {
                    hashMap.put("CUSTOM,".concat(java.lang.String.valueOf(it.next())), java.lang.Integer.valueOf(this.getInputFormats));
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0093, code lost:
    
        if (r1.equals("scaleY") != false) goto L59;
     */
    @Override // androidx.constraintlayout.motion.widget.Key
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> hashMap) {
        java.util.Iterator<java.lang.String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            androidx.constraintlayout.motion.utils.ViewSpline viewSpline = hashMap.get(next);
            if (viewSpline != null) {
                char c = 7;
                if (next.startsWith("CUSTOM")) {
                    androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = this.Camera2StreamConfigurationMap.get(next.substring(7));
                    if (constraintAttribute != null) {
                        ((androidx.constraintlayout.motion.utils.ViewSpline.CustomSet) viewSpline).setPoint(this.getHighResolutionOutputSizeshNQ4ISI, constraintAttribute);
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
                        case -760884510:
                            if (next.equals(androidx.constraintlayout.motion.widget.Key.PIVOT_X)) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -760884509:
                            if (next.equals(androidx.constraintlayout.motion.widget.Key.PIVOT_Y)) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case -40300674:
                            if (next.equals(androidx.constraintlayout.motion.widget.Key.ROTATION)) {
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
                        case 37232917:
                            if (next.equals("transitionPathRotate")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 92909918:
                            if (next.equals("alpha")) {
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
                            if (!java.lang.Float.isNaN(this.getOutputSizeshNQ4ISI)) {
                                viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputSizeshNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (!java.lang.Float.isNaN(this.getOutputMinFrameDurationlomOqCM)) {
                                viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDurationlomOqCM);
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (!java.lang.Float.isNaN(this.unwrapAs)) {
                                viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.unwrapAs);
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (!java.lang.Float.isNaN(this.isOutputSupportedForhNQ4ISI)) {
                                viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.isOutputSupportedForhNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (!java.lang.Float.isNaN(this.toString)) {
                                viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.toString);
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (!java.lang.Float.isNaN(this.getOutputMinFrameDuration)) {
                                viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration);
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (!java.lang.Float.isNaN(this.getOutputStallDurationlomOqCM)) {
                                viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputStallDurationlomOqCM);
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (!java.lang.Float.isNaN(this.getOutputStallDuration)) {
                                viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputStallDuration);
                                break;
                            } else {
                                break;
                            }
                        case '\b':
                            if (!java.lang.Float.isNaN(this.getOutputSizeshNQ4ISI)) {
                                viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor);
                                break;
                            } else {
                                break;
                            }
                        case '\t':
                            if (!java.lang.Float.isNaN(this.getOutputMinFrameDurationlomOqCM)) {
                                viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI);
                                break;
                            } else {
                                break;
                            }
                        case '\n':
                            if (!java.lang.Float.isNaN(this.getOutputSizes)) {
                                viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputSizes);
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (!java.lang.Float.isNaN(this.getOutputFormats)) {
                                viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputFormats);
                                break;
                            } else {
                                break;
                            }
                        case '\f':
                            if (!java.lang.Float.isNaN(this.isOutputSupportedFor)) {
                                viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.isOutputSupportedFor);
                                break;
                            } else {
                                break;
                            }
                        case '\r':
                            if (!java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor)) {
                                viewSpline.setPoint(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
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
            case -760884510:
                if (str.equals(androidx.constraintlayout.motion.widget.Key.PIVOT_X)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -760884509:
                if (str.equals(androidx.constraintlayout.motion.widget.Key.PIVOT_Y)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -40300674:
                if (str.equals(androidx.constraintlayout.motion.widget.Key.ROTATION)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
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
            case 1941332754:
                if (str.equals("visibility")) {
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
                this.getOutputMinFrameDuration = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 1:
                this.getValidOutputFormatsForInputhNQ4ISI = obj.toString();
                break;
            case 2:
                this.getOutputSizeshNQ4ISI = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 3:
                this.getOutputMinFrameDurationlomOqCM = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 4:
                this.unwrapAs = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 5:
                this.isOutputSupportedForhNQ4ISI = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 6:
                this.toString = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 7:
                this.getOutputStallDurationlomOqCM = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case '\b':
                this.getOutputStallDuration = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case '\t':
                this.getHighSpeedVideoSizesFor = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case '\n':
                this.getInputSizeshNQ4ISI = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 11:
                this.getOutputSizes = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case '\f':
                this.getOutputFormats = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case '\r':
                this.isOutputSupportedFor = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 14:
                this.getHighSpeedVideoFpsRangesFor = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case 15:
                this.getInputFormats = obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : java.lang.Integer.parseInt(obj.toString());
                break;
            case 16:
                this.coroutineBoundary = obj instanceof java.lang.Boolean ? ((java.lang.Boolean) obj).booleanValue() : java.lang.Boolean.parseBoolean(obj.toString());
                break;
        }
    }

    static class Loader {
        private static android.util.SparseIntArray getHighResolutionOutputSizeshNQ4ISI;

        private Loader() {
        }

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            getHighResolutionOutputSizeshNQ4ISI = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_alpha, 1);
            getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_elevation, 2);
            getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_rotation, 4);
            getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_rotationX, 5);
            getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_rotationY, 6);
            getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_transformPivotX, 19);
            getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_transformPivotY, 20);
            getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_scaleX, 7);
            getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_transitionPathRotate, 8);
            getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_transitionEasing, 9);
            getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_motionTarget, 10);
            getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_framePosition, 12);
            getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_curveFit, 13);
            getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_scaleY, 14);
            getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_translationX, 15);
            getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_translationY, 16);
            getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_translationZ, 17);
            getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_motionProgress, 18);
        }

        public static void getHighSpeedVideoFpsRangesFor(androidx.constraintlayout.motion.widget.KeyAttributes keyAttributes, android.content.res.TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (getHighResolutionOutputSizeshNQ4ISI.get(index)) {
                    case 1:
                        keyAttributes.getHighSpeedVideoFpsRangesFor = typedArray.getFloat(index, keyAttributes.getHighSpeedVideoFpsRangesFor);
                        break;
                    case 2:
                        keyAttributes.getOutputFormats = typedArray.getDimension(index, keyAttributes.getOutputFormats);
                        break;
                    case 3:
                    case 11:
                    default:
                        getHighResolutionOutputSizeshNQ4ISI.get(index);
                        break;
                    case 4:
                        keyAttributes.getOutputSizes = typedArray.getFloat(index, keyAttributes.getOutputSizes);
                        break;
                    case 5:
                        keyAttributes.getOutputSizeshNQ4ISI = typedArray.getFloat(index, keyAttributes.getOutputSizeshNQ4ISI);
                        break;
                    case 6:
                        keyAttributes.getOutputMinFrameDurationlomOqCM = typedArray.getFloat(index, keyAttributes.getOutputMinFrameDurationlomOqCM);
                        break;
                    case 7:
                        keyAttributes.getOutputStallDurationlomOqCM = typedArray.getFloat(index, keyAttributes.getOutputStallDurationlomOqCM);
                        break;
                    case 8:
                        keyAttributes.isOutputSupportedFor = typedArray.getFloat(index, keyAttributes.isOutputSupportedFor);
                        break;
                    case 9:
                        keyAttributes.getValidOutputFormatsForInputhNQ4ISI = typedArray.getString(index);
                        break;
                    case 10:
                        if (androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE) {
                            keyAttributes.getHighSpeedVideoSizes = typedArray.getResourceId(index, keyAttributes.getHighSpeedVideoSizes);
                            if (keyAttributes.getHighSpeedVideoSizes == -1) {
                                keyAttributes.getHighSpeedVideoFpsRanges = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            keyAttributes.getHighSpeedVideoFpsRanges = typedArray.getString(index);
                            break;
                        } else {
                            keyAttributes.getHighSpeedVideoSizes = typedArray.getResourceId(index, keyAttributes.getHighSpeedVideoSizes);
                            break;
                        }
                    case 12:
                        keyAttributes.getHighResolutionOutputSizeshNQ4ISI = typedArray.getInt(index, keyAttributes.getHighResolutionOutputSizeshNQ4ISI);
                        break;
                    case 13:
                        keyAttributes.getInputFormats = typedArray.getInteger(index, keyAttributes.getInputFormats);
                        break;
                    case 14:
                        keyAttributes.getOutputStallDuration = typedArray.getFloat(index, keyAttributes.getOutputStallDuration);
                        break;
                    case 15:
                        keyAttributes.unwrapAs = typedArray.getDimension(index, keyAttributes.unwrapAs);
                        break;
                    case 16:
                        keyAttributes.isOutputSupportedForhNQ4ISI = typedArray.getDimension(index, keyAttributes.isOutputSupportedForhNQ4ISI);
                        break;
                    case 17:
                        keyAttributes.toString = typedArray.getDimension(index, keyAttributes.toString);
                        break;
                    case 18:
                        keyAttributes.getOutputMinFrameDuration = typedArray.getFloat(index, keyAttributes.getOutputMinFrameDuration);
                        break;
                    case 19:
                        keyAttributes.getHighSpeedVideoSizesFor = typedArray.getDimension(index, keyAttributes.getHighSpeedVideoSizesFor);
                        break;
                    case 20:
                        keyAttributes.getInputSizeshNQ4ISI = typedArray.getDimension(index, keyAttributes.getInputSizeshNQ4ISI);
                        break;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public androidx.constraintlayout.motion.widget.Key copy(androidx.constraintlayout.motion.widget.Key key) {
        super.copy(key);
        androidx.constraintlayout.motion.widget.KeyAttributes keyAttributes = (androidx.constraintlayout.motion.widget.KeyAttributes) key;
        this.getInputFormats = keyAttributes.getInputFormats;
        this.coroutineBoundary = keyAttributes.coroutineBoundary;
        this.getHighSpeedVideoFpsRangesFor = keyAttributes.getHighSpeedVideoFpsRangesFor;
        this.getOutputFormats = keyAttributes.getOutputFormats;
        this.getOutputSizes = keyAttributes.getOutputSizes;
        this.getOutputSizeshNQ4ISI = keyAttributes.getOutputSizeshNQ4ISI;
        this.getOutputMinFrameDurationlomOqCM = keyAttributes.getOutputMinFrameDurationlomOqCM;
        this.getHighSpeedVideoSizesFor = keyAttributes.getHighSpeedVideoSizesFor;
        this.getInputSizeshNQ4ISI = keyAttributes.getInputSizeshNQ4ISI;
        this.isOutputSupportedFor = keyAttributes.isOutputSupportedFor;
        this.getOutputStallDurationlomOqCM = keyAttributes.getOutputStallDurationlomOqCM;
        this.getOutputStallDuration = keyAttributes.getOutputStallDuration;
        this.unwrapAs = keyAttributes.unwrapAs;
        this.isOutputSupportedForhNQ4ISI = keyAttributes.isOutputSupportedForhNQ4ISI;
        this.toString = keyAttributes.toString;
        this.getOutputMinFrameDuration = keyAttributes.getOutputMinFrameDuration;
        this.getValidOutputFormatsForInputhNQ4ISI = keyAttributes.getValidOutputFormatsForInputhNQ4ISI;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: clone */
    public androidx.constraintlayout.motion.widget.Key mo9054clone() {
        return new androidx.constraintlayout.motion.widget.KeyAttributes().copy(this);
    }
}

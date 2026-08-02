package androidx.constraintlayout.motion.widget;

/* loaded from: classes7.dex */
public class KeyTrigger extends androidx.constraintlayout.motion.widget.Key {
    public static final java.lang.String CROSS = "CROSS";
    public static final int KEY_TYPE = 5;
    public static final java.lang.String NEGATIVE_CROSS = "negativeCross";
    public static final java.lang.String POSITIVE_CROSS = "positiveCross";
    public static final java.lang.String POST_LAYOUT = "postLayout";
    public static final java.lang.String TRIGGER_COLLISION_ID = "triggerCollisionId";
    public static final java.lang.String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
    public static final java.lang.String TRIGGER_ID = "triggerID";
    public static final java.lang.String TRIGGER_RECEIVER = "triggerReceiver";
    public static final java.lang.String TRIGGER_SLACK = "triggerSlack";
    public static final java.lang.String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
    public static final java.lang.String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
    public static final java.lang.String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";
    private float getOutputStallDurationlomOqCM;
    float getHighSpeedVideoSizesFor = 0.1f;
    int getInputFormats = UNSET;
    int getOutputSizeshNQ4ISI = UNSET;
    int getOutputFormats = UNSET;
    android.graphics.RectF getHighSpeedVideoFpsRangesFor = new android.graphics.RectF();
    android.graphics.RectF getOutputMinFrameDuration = new android.graphics.RectF();
    java.util.HashMap<java.lang.String, java.lang.reflect.Method> getInputSizeshNQ4ISI = new java.util.HashMap<>();
    private int getOutputSizes = -1;
    private java.lang.String getOutputMinFrameDurationlomOqCM = null;
    private int CoroutineDebuggingKt = UNSET;
    private java.lang.String getValidOutputFormatsForInputhNQ4ISI = null;
    private java.lang.String toString = null;
    private int accessartificialFrame = UNSET;
    private int coroutineBoundary = UNSET;
    private android.view.View ArtificialStackFrames = null;
    private boolean getOutputStallDuration = true;
    private boolean unwrapAs = true;
    private boolean isOutputSupportedForhNQ4ISI = true;
    private float isOutputSupportedFor = Float.NaN;
    private boolean coroutineCreation = false;

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> hashMap) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(java.util.HashSet<java.lang.String> hashSet) {
    }

    public KeyTrigger() {
        this.mType = 5;
        this.Camera2StreamConfigurationMap = new java.util.HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo9054clone() throws java.lang.CloneNotSupportedException {
        return mo9054clone();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context context, android.util.AttributeSet attributeSet) {
        androidx.constraintlayout.motion.widget.KeyTrigger.Loader.getHighSpeedVideoSizes(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.KeyTrigger));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(java.lang.String str, java.lang.Object obj) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1594793529:
                if (str.equals("positiveCross")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -966421266:
                if (str.equals("viewTransitionOnPositiveCross")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -786670827:
                if (str.equals("triggerCollisionId")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -648752941:
                if (str.equals("triggerID")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -638126837:
                if (str.equals("negativeCross")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -76025313:
                if (str.equals("triggerCollisionView")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -9754574:
                if (str.equals("viewTransitionOnNegativeCross")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 64397344:
                if (str.equals("CROSS")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 364489912:
                if (str.equals("triggerSlack")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1301930599:
                if (str.equals("viewTransitionOnCross")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1401391082:
                if (str.equals("postLayout")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1535404999:
                if (str.equals("triggerReceiver")) {
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
                this.toString = obj.toString();
                break;
            case 1:
                this.getOutputSizeshNQ4ISI = obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : java.lang.Integer.parseInt(obj.toString());
                break;
            case 2:
                this.coroutineBoundary = obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : java.lang.Integer.parseInt(obj.toString());
                break;
            case 3:
                this.accessartificialFrame = obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : java.lang.Integer.parseInt(obj.toString());
                break;
            case 4:
                this.getValidOutputFormatsForInputhNQ4ISI = obj.toString();
                break;
            case 5:
                this.ArtificialStackFrames = (android.view.View) obj;
                break;
            case 6:
                this.getInputFormats = obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : java.lang.Integer.parseInt(obj.toString());
                break;
            case 7:
                this.getOutputMinFrameDurationlomOqCM = obj.toString();
                break;
            case '\b':
                this.getHighSpeedVideoSizesFor = obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
                break;
            case '\t':
                this.getOutputFormats = obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : java.lang.Integer.parseInt(obj.toString());
                break;
            case '\n':
                this.coroutineCreation = obj instanceof java.lang.Boolean ? ((java.lang.Boolean) obj).booleanValue() : java.lang.Boolean.parseBoolean(obj.toString());
                break;
            case 11:
                this.CoroutineDebuggingKt = obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : java.lang.Integer.parseInt(obj.toString());
                break;
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(android.graphics.RectF rectF, android.view.View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void conditionallyFire(float f, android.view.View view) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        boolean z6 = false;
        if (this.coroutineBoundary != UNSET) {
            if (this.ArtificialStackFrames == null) {
                this.ArtificialStackFrames = ((android.view.ViewGroup) view.getParent()).findViewById(this.coroutineBoundary);
            }
            getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, this.ArtificialStackFrames, this.coroutineCreation);
            getHighSpeedVideoFpsRangesFor(this.getOutputMinFrameDuration, view, this.coroutineCreation);
            if (this.getHighSpeedVideoFpsRangesFor.intersect(this.getOutputMinFrameDuration)) {
                if (this.getOutputStallDuration) {
                    this.getOutputStallDuration = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.isOutputSupportedForhNQ4ISI) {
                    this.isOutputSupportedForhNQ4ISI = false;
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.unwrapAs = true;
                z5 = z4;
            } else {
                if (this.getOutputStallDuration) {
                    z = false;
                } else {
                    this.getOutputStallDuration = true;
                    z = true;
                }
                if (this.unwrapAs) {
                    this.unwrapAs = false;
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.isOutputSupportedForhNQ4ISI = true;
                z5 = false;
                z6 = z3;
            }
        } else {
            if (this.getOutputStallDuration) {
                float f2 = this.isOutputSupportedFor;
                if ((f - f2) * (this.getOutputStallDurationlomOqCM - f2) < 0.0f) {
                    this.getOutputStallDuration = false;
                    z = true;
                    if (!this.unwrapAs) {
                        float f3 = this.isOutputSupportedFor;
                        float f4 = f - f3;
                        if ((this.getOutputStallDurationlomOqCM - f3) * f4 < 0.0f && f4 < 0.0f) {
                            this.unwrapAs = false;
                            z2 = true;
                            if (this.isOutputSupportedForhNQ4ISI) {
                                float f5 = this.isOutputSupportedFor;
                                float f6 = f - f5;
                                if ((this.getOutputStallDurationlomOqCM - f5) * f6 >= 0.0f || f6 <= 0.0f) {
                                    z5 = false;
                                } else {
                                    this.isOutputSupportedForhNQ4ISI = false;
                                }
                                z6 = z2;
                            } else {
                                if (java.lang.Math.abs(f - this.isOutputSupportedFor) > this.getHighSpeedVideoSizesFor) {
                                    this.isOutputSupportedForhNQ4ISI = true;
                                }
                                z3 = z2;
                                z5 = false;
                                z6 = z3;
                            }
                        }
                    } else if (java.lang.Math.abs(f - this.isOutputSupportedFor) > this.getHighSpeedVideoSizesFor) {
                        this.unwrapAs = true;
                    }
                    z2 = false;
                    if (this.isOutputSupportedForhNQ4ISI) {
                    }
                }
            } else if (java.lang.Math.abs(f - this.isOutputSupportedFor) > this.getHighSpeedVideoSizesFor) {
                this.getOutputStallDuration = true;
            }
            z = false;
            if (!this.unwrapAs) {
            }
            z2 = false;
            if (this.isOutputSupportedForhNQ4ISI) {
            }
        }
        this.getOutputStallDurationlomOqCM = f;
        if (z6 || z || z5) {
            ((androidx.constraintlayout.motion.widget.MotionLayout) view.getParent()).fireTrigger(this.accessartificialFrame, z5, f);
        }
        android.view.View findViewById = this.CoroutineDebuggingKt == UNSET ? view : ((androidx.constraintlayout.motion.widget.MotionLayout) view.getParent()).findViewById(this.CoroutineDebuggingKt);
        if (z6) {
            java.lang.String str = this.getValidOutputFormatsForInputhNQ4ISI;
            if (str != null) {
                getHighSpeedVideoSizes(str, findViewById);
            }
            if (this.getInputFormats != UNSET) {
                ((androidx.constraintlayout.motion.widget.MotionLayout) view.getParent()).viewTransition(this.getInputFormats, findViewById);
            }
        }
        if (z5) {
            java.lang.String str2 = this.toString;
            if (str2 != null) {
                getHighSpeedVideoSizes(str2, findViewById);
            }
            if (this.getOutputSizeshNQ4ISI != UNSET) {
                ((androidx.constraintlayout.motion.widget.MotionLayout) view.getParent()).viewTransition(this.getOutputSizeshNQ4ISI, findViewById);
            }
        }
        if (z) {
            java.lang.String str3 = this.getOutputMinFrameDurationlomOqCM;
            if (str3 != null) {
                getHighSpeedVideoSizes(str3, findViewById);
            }
            if (this.getOutputFormats != UNSET) {
                ((androidx.constraintlayout.motion.widget.MotionLayout) view.getParent()).viewTransition(this.getOutputFormats, findViewById);
            }
        }
    }

    private void getHighSpeedVideoSizes(java.lang.String str, android.view.View view) {
        java.lang.reflect.Method method;
        if (str != null) {
            if (!str.startsWith(".")) {
                if (this.getInputSizeshNQ4ISI.containsKey(str)) {
                    method = this.getInputSizeshNQ4ISI.get(str);
                    if (method == null) {
                        return;
                    }
                } else {
                    method = null;
                }
                if (method == null) {
                    try {
                        method = view.getClass().getMethod(str, new java.lang.Class[0]);
                        this.getInputSizeshNQ4ISI.put(str, method);
                    } catch (java.lang.NoSuchMethodException unused) {
                        this.getInputSizeshNQ4ISI.put(str, null);
                        androidx.constraintlayout.motion.widget.Debug.getName(view);
                        return;
                    }
                }
                try {
                    method.invoke(view, new java.lang.Object[0]);
                    return;
                } catch (java.lang.Exception unused2) {
                    androidx.constraintlayout.motion.widget.Debug.getName(view);
                    return;
                }
            }
            boolean z = str.length() == 1;
            if (!z) {
                str = str.substring(1).toLowerCase(java.util.Locale.ROOT);
            }
            for (java.lang.String str2 : this.Camera2StreamConfigurationMap.keySet()) {
                java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
                if (z || lowerCase.matches(str)) {
                    androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = this.Camera2StreamConfigurationMap.get(str2);
                    if (constraintAttribute != null) {
                        constraintAttribute.applyCustom(view);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public androidx.constraintlayout.motion.widget.Key copy(androidx.constraintlayout.motion.widget.Key key) {
        super.copy(key);
        androidx.constraintlayout.motion.widget.KeyTrigger keyTrigger = (androidx.constraintlayout.motion.widget.KeyTrigger) key;
        this.getOutputSizes = keyTrigger.getOutputSizes;
        this.getOutputMinFrameDurationlomOqCM = keyTrigger.getOutputMinFrameDurationlomOqCM;
        this.CoroutineDebuggingKt = keyTrigger.CoroutineDebuggingKt;
        this.getValidOutputFormatsForInputhNQ4ISI = keyTrigger.getValidOutputFormatsForInputhNQ4ISI;
        this.toString = keyTrigger.toString;
        this.accessartificialFrame = keyTrigger.accessartificialFrame;
        this.coroutineBoundary = keyTrigger.coroutineBoundary;
        this.ArtificialStackFrames = keyTrigger.ArtificialStackFrames;
        this.getHighSpeedVideoSizesFor = keyTrigger.getHighSpeedVideoSizesFor;
        this.getOutputStallDuration = keyTrigger.getOutputStallDuration;
        this.unwrapAs = keyTrigger.unwrapAs;
        this.isOutputSupportedForhNQ4ISI = keyTrigger.isOutputSupportedForhNQ4ISI;
        this.isOutputSupportedFor = keyTrigger.isOutputSupportedFor;
        this.getOutputStallDurationlomOqCM = keyTrigger.getOutputStallDurationlomOqCM;
        this.coroutineCreation = keyTrigger.coroutineCreation;
        this.getHighSpeedVideoFpsRangesFor = keyTrigger.getHighSpeedVideoFpsRangesFor;
        this.getOutputMinFrameDuration = keyTrigger.getOutputMinFrameDuration;
        this.getInputSizeshNQ4ISI = keyTrigger.getInputSizeshNQ4ISI;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: clone */
    public androidx.constraintlayout.motion.widget.Key mo9054clone() {
        return new androidx.constraintlayout.motion.widget.KeyTrigger().copy(this);
    }

    static class Loader {
        private static android.util.SparseIntArray getHighSpeedVideoFpsRanges;

        private Loader() {
        }

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            getHighSpeedVideoFpsRanges = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_framePosition, 8);
            getHighSpeedVideoFpsRanges.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_onCross, 4);
            getHighSpeedVideoFpsRanges.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_onNegativeCross, 1);
            getHighSpeedVideoFpsRanges.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_onPositiveCross, 2);
            getHighSpeedVideoFpsRanges.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_motionTarget, 7);
            getHighSpeedVideoFpsRanges.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_triggerId, 6);
            getHighSpeedVideoFpsRanges.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_triggerSlack, 5);
            getHighSpeedVideoFpsRanges.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_motion_triggerOnCollision, 9);
            getHighSpeedVideoFpsRanges.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_motion_postLayoutCollision, 10);
            getHighSpeedVideoFpsRanges.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_triggerReceiver, 11);
            getHighSpeedVideoFpsRanges.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_viewTransitionOnCross, 12);
            getHighSpeedVideoFpsRanges.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_viewTransitionOnNegativeCross, 13);
            getHighSpeedVideoFpsRanges.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        public static void getHighSpeedVideoSizes(androidx.constraintlayout.motion.widget.KeyTrigger keyTrigger, android.content.res.TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (getHighSpeedVideoFpsRanges.get(index)) {
                    case 1:
                        keyTrigger.getValidOutputFormatsForInputhNQ4ISI = typedArray.getString(index);
                        break;
                    case 2:
                        keyTrigger.toString = typedArray.getString(index);
                        break;
                    case 3:
                    default:
                        getHighSpeedVideoFpsRanges.get(index);
                        break;
                    case 4:
                        keyTrigger.getOutputMinFrameDurationlomOqCM = typedArray.getString(index);
                        break;
                    case 5:
                        keyTrigger.getHighSpeedVideoSizesFor = typedArray.getFloat(index, keyTrigger.getHighSpeedVideoSizesFor);
                        break;
                    case 6:
                        keyTrigger.accessartificialFrame = typedArray.getResourceId(index, keyTrigger.accessartificialFrame);
                        break;
                    case 7:
                        if (androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE) {
                            keyTrigger.getHighSpeedVideoSizes = typedArray.getResourceId(index, keyTrigger.getHighSpeedVideoSizes);
                            if (keyTrigger.getHighSpeedVideoSizes == -1) {
                                keyTrigger.getHighSpeedVideoFpsRanges = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            keyTrigger.getHighSpeedVideoFpsRanges = typedArray.getString(index);
                            break;
                        } else {
                            keyTrigger.getHighSpeedVideoSizes = typedArray.getResourceId(index, keyTrigger.getHighSpeedVideoSizes);
                            break;
                        }
                    case 8:
                        keyTrigger.getHighResolutionOutputSizeshNQ4ISI = typedArray.getInteger(index, keyTrigger.getHighResolutionOutputSizeshNQ4ISI);
                        keyTrigger.isOutputSupportedFor = (keyTrigger.getHighResolutionOutputSizeshNQ4ISI + 0.5f) / 100.0f;
                        break;
                    case 9:
                        keyTrigger.coroutineBoundary = typedArray.getResourceId(index, keyTrigger.coroutineBoundary);
                        break;
                    case 10:
                        keyTrigger.coroutineCreation = typedArray.getBoolean(index, keyTrigger.coroutineCreation);
                        break;
                    case 11:
                        keyTrigger.CoroutineDebuggingKt = typedArray.getResourceId(index, keyTrigger.CoroutineDebuggingKt);
                        break;
                    case 12:
                        keyTrigger.getOutputFormats = typedArray.getResourceId(index, keyTrigger.getOutputFormats);
                        break;
                    case 13:
                        keyTrigger.getInputFormats = typedArray.getResourceId(index, keyTrigger.getInputFormats);
                        break;
                    case 14:
                        keyTrigger.getOutputSizeshNQ4ISI = typedArray.getResourceId(index, keyTrigger.getOutputSizeshNQ4ISI);
                        break;
                }
            }
        }
    }
}

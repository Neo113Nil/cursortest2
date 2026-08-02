package androidx.constraintlayout.core.motion.key;

/* loaded from: classes6.dex */
public class MotionKeyTrigger extends androidx.constraintlayout.core.motion.key.MotionKey {
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
    public static final int TYPE_CROSS = 312;
    public static final int TYPE_NEGATIVE_CROSS = 310;
    public static final int TYPE_POSITIVE_CROSS = 309;
    public static final int TYPE_POST_LAYOUT = 304;
    public static final int TYPE_TRIGGER_COLLISION_ID = 307;
    public static final int TYPE_TRIGGER_COLLISION_VIEW = 306;
    public static final int TYPE_TRIGGER_ID = 308;
    public static final int TYPE_TRIGGER_RECEIVER = 311;
    public static final int TYPE_TRIGGER_SLACK = 305;
    public static final int TYPE_VIEW_TRANSITION_ON_CROSS = 301;
    public static final int TYPE_VIEW_TRANSITION_ON_NEGATIVE_CROSS = 303;
    public static final int TYPE_VIEW_TRANSITION_ON_POSITIVE_CROSS = 302;
    public static final java.lang.String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
    public static final java.lang.String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
    public static final java.lang.String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";
    private float getOutputStallDuration;
    private int getOutputMinFrameDuration = -1;
    private java.lang.String getInputSizeshNQ4ISI = null;
    private int accessartificialFrame = UNSET;
    private java.lang.String getValidOutputFormatsForInputhNQ4ISI = null;
    private java.lang.String unwrapAs = null;
    private int isOutputSupportedForhNQ4ISI = UNSET;
    private int toString = UNSET;
    float Camera2StreamConfigurationMap = 0.1f;
    private boolean getOutputMinFrameDurationlomOqCM = true;
    private boolean getOutputStallDurationlomOqCM = true;
    private boolean getOutputSizes = true;
    private float getOutputSizeshNQ4ISI = Float.NaN;
    private boolean isOutputSupportedFor = false;
    int getHighSpeedVideoSizesFor = UNSET;
    int getInputFormats = UNSET;
    int getOutputFormats = UNSET;
    androidx.constraintlayout.core.motion.utils.FloatRect getHighSpeedVideoFpsRangesFor = new androidx.constraintlayout.core.motion.utils.FloatRect();
    androidx.constraintlayout.core.motion.utils.FloatRect getHighSpeedVideoSizes = new androidx.constraintlayout.core.motion.utils.FloatRect();

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> hashMap) {
    }

    public void conditionallyFire(float f, androidx.constraintlayout.core.motion.MotionWidget motionWidget) {
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(java.util.HashSet<java.lang.String> hashSet) {
    }

    public MotionKeyTrigger() {
        this.mType = 5;
        this.mCustom = new java.util.HashMap<>();
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo9052clone() throws java.lang.CloneNotSupportedException {
        return mo9052clone();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String str) {
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
            case 364489912:
                if (str.equals("triggerSlack")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1301930599:
                if (str.equals("viewTransitionOnCross")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1401391082:
                if (str.equals("postLayout")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1535404999:
                if (str.equals("triggerReceiver")) {
                    c = '\n';
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
                return 309;
            case 1:
                return 302;
            case 2:
                return 307;
            case 3:
                return 308;
            case 4:
                return 310;
            case 5:
                return 306;
            case 6:
                return 303;
            case 7:
                return 305;
            case '\b':
                return 301;
            case '\t':
                return 304;
            case '\n':
                return 311;
            default:
                return -1;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public androidx.constraintlayout.core.motion.key.MotionKeyTrigger copy(androidx.constraintlayout.core.motion.key.MotionKey motionKey) {
        super.copy(motionKey);
        androidx.constraintlayout.core.motion.key.MotionKeyTrigger motionKeyTrigger = (androidx.constraintlayout.core.motion.key.MotionKeyTrigger) motionKey;
        this.getOutputMinFrameDuration = motionKeyTrigger.getOutputMinFrameDuration;
        this.getInputSizeshNQ4ISI = motionKeyTrigger.getInputSizeshNQ4ISI;
        this.accessartificialFrame = motionKeyTrigger.accessartificialFrame;
        this.getValidOutputFormatsForInputhNQ4ISI = motionKeyTrigger.getValidOutputFormatsForInputhNQ4ISI;
        this.unwrapAs = motionKeyTrigger.unwrapAs;
        this.isOutputSupportedForhNQ4ISI = motionKeyTrigger.isOutputSupportedForhNQ4ISI;
        this.toString = motionKeyTrigger.toString;
        this.Camera2StreamConfigurationMap = motionKeyTrigger.Camera2StreamConfigurationMap;
        this.getOutputMinFrameDurationlomOqCM = motionKeyTrigger.getOutputMinFrameDurationlomOqCM;
        this.getOutputStallDurationlomOqCM = motionKeyTrigger.getOutputStallDurationlomOqCM;
        this.getOutputSizes = motionKeyTrigger.getOutputSizes;
        this.getOutputSizeshNQ4ISI = motionKeyTrigger.getOutputSizeshNQ4ISI;
        this.getOutputStallDuration = motionKeyTrigger.getOutputStallDuration;
        this.isOutputSupportedFor = motionKeyTrigger.isOutputSupportedFor;
        this.getHighSpeedVideoFpsRangesFor = motionKeyTrigger.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes = motionKeyTrigger.getHighSpeedVideoSizes;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public androidx.constraintlayout.core.motion.key.MotionKey mo9052clone() {
        return new androidx.constraintlayout.core.motion.key.MotionKeyTrigger().copy((androidx.constraintlayout.core.motion.key.MotionKey) this);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        if (i == 307) {
            this.toString = i2;
            return true;
        }
        if (i == 308) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i2);
            this.isOutputSupportedForhNQ4ISI = valueOf instanceof java.lang.Integer ? valueOf.intValue() : java.lang.Integer.parseInt(valueOf.toString());
            return true;
        }
        if (i == 311) {
            this.accessartificialFrame = i2;
            return true;
        }
        switch (i) {
            case 301:
                this.getOutputFormats = i2;
                return true;
            case 302:
                this.getInputFormats = i2;
                return true;
            case 303:
                this.getHighSpeedVideoSizesFor = i2;
                return true;
            default:
                return super.setValue(i, i2);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        if (i == 305) {
            this.Camera2StreamConfigurationMap = f;
            return true;
        }
        return super.setValue(i, f);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, java.lang.String str) {
        if (i == 309) {
            this.unwrapAs = str;
            return true;
        }
        if (i == 310) {
            this.getValidOutputFormatsForInputhNQ4ISI = str;
            return true;
        }
        if (i == 312) {
            this.getInputSizeshNQ4ISI = str;
            return true;
        }
        return super.setValue(i, str);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, boolean z) {
        if (i == 304) {
            this.isOutputSupportedFor = z;
            return true;
        }
        return super.setValue(i, z);
    }
}

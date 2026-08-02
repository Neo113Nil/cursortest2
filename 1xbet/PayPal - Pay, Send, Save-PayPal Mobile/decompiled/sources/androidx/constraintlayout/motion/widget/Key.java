package androidx.constraintlayout.motion.widget;

/* loaded from: classes7.dex */
public abstract class Key {
    public static final java.lang.String ALPHA = "alpha";
    public static final java.lang.String CURVEFIT = "curveFit";
    public static final java.lang.String CUSTOM = "CUSTOM";
    public static final java.lang.String ELEVATION = "elevation";
    public static final java.lang.String MOTIONPROGRESS = "motionProgress";
    public static final java.lang.String PIVOT_X = "transformPivotX";
    public static final java.lang.String PIVOT_Y = "transformPivotY";
    public static final java.lang.String PROGRESS = "progress";
    public static final java.lang.String ROTATION = "rotation";
    public static final java.lang.String ROTATION_X = "rotationX";
    public static final java.lang.String ROTATION_Y = "rotationY";
    public static final java.lang.String SCALE_X = "scaleX";
    public static final java.lang.String SCALE_Y = "scaleY";
    public static final java.lang.String TRANSITIONEASING = "transitionEasing";
    public static final java.lang.String TRANSITION_PATH_ROTATE = "transitionPathRotate";
    public static final java.lang.String TRANSLATION_X = "translationX";
    public static final java.lang.String TRANSLATION_Y = "translationY";
    public static final java.lang.String TRANSLATION_Z = "translationZ";
    public static int UNSET = -1;
    public static final java.lang.String VISIBILITY = "visibility";
    public static final java.lang.String WAVE_OFFSET = "waveOffset";
    public static final java.lang.String WAVE_PERIOD = "wavePeriod";
    public static final java.lang.String WAVE_PHASE = "wavePhase";
    public static final java.lang.String WAVE_VARIES_BY = "waveVariesBy";
    java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;
    protected int mType;

    public abstract void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> hashMap);

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract androidx.constraintlayout.motion.widget.Key mo9054clone();

    abstract void getAttributeNames(java.util.HashSet<java.lang.String> hashSet);

    abstract void load(android.content.Context context, android.util.AttributeSet attributeSet);

    public void setInterpolation(java.util.HashMap<java.lang.String, java.lang.Integer> hashMap) {
    }

    public abstract void setValue(java.lang.String str, java.lang.Object obj);

    public Key() {
        int i = UNSET;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = null;
    }

    public androidx.constraintlayout.motion.widget.Key copy(androidx.constraintlayout.motion.widget.Key key) {
        this.getHighResolutionOutputSizeshNQ4ISI = key.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = key.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRanges = key.getHighSpeedVideoFpsRanges;
        this.mType = key.mType;
        this.Camera2StreamConfigurationMap = key.Camera2StreamConfigurationMap;
        return this;
    }

    public androidx.constraintlayout.motion.widget.Key setViewId(int i) {
        this.getHighSpeedVideoSizes = i;
        return this;
    }

    public void setFramePosition(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public int getFramePosition() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}

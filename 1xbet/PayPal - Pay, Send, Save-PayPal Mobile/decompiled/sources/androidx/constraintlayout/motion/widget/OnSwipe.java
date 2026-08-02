package androidx.constraintlayout.motion.widget;

/* loaded from: classes7.dex */
public class OnSwipe {
    public static final int COMPLETE_MODE_CONTINUOUS_VELOCITY = 0;
    public static final int COMPLETE_MODE_SPRING = 1;
    public static final int DRAG_ANTICLOCKWISE = 7;
    public static final int DRAG_CLOCKWISE = 6;
    public static final int DRAG_DOWN = 1;
    public static final int DRAG_END = 5;
    public static final int DRAG_LEFT = 2;
    public static final int DRAG_RIGHT = 3;
    public static final int DRAG_START = 4;
    public static final int DRAG_UP = 0;
    public static final int FLAG_DISABLE_POST_SCROLL = 1;
    public static final int FLAG_DISABLE_SCROLL = 2;
    public static final int ON_UP_AUTOCOMPLETE = 0;
    public static final int ON_UP_AUTOCOMPLETE_TO_END = 2;
    public static final int ON_UP_AUTOCOMPLETE_TO_START = 1;
    public static final int ON_UP_DECELERATE = 4;
    public static final int ON_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int ON_UP_NEVER_TO_END = 7;
    public static final int ON_UP_NEVER_TO_START = 6;
    public static final int ON_UP_STOP = 3;
    public static final int SIDE_BOTTOM = 3;
    public static final int SIDE_END = 6;
    public static final int SIDE_LEFT = 1;
    public static final int SIDE_MIDDLE = 4;
    public static final int SIDE_RIGHT = 2;
    public static final int SIDE_START = 5;
    public static final int SIDE_TOP = 0;
    public static final int SPRING_BOUNDARY_BOUNCEBOTH = 3;
    public static final int SPRING_BOUNDARY_BOUNCEEND = 2;
    public static final int SPRING_BOUNDARY_BOUNCESTART = 1;
    public static final int SPRING_BOUNDARY_OVERSHOOT = 0;
    private int getHighSpeedVideoSizes = 0;
    private int getValidOutputFormatsForInputhNQ4ISI = 0;
    private int isOutputSupportedFor = -1;
    private int isOutputSupportedForhNQ4ISI = -1;
    private int getInputFormats = -1;
    private int getHighSpeedVideoSizesFor = 0;
    private int getOutputMinFrameDurationlomOqCM = -1;
    private float getOutputMinFrameDuration = 4.0f;
    private float getInputSizeshNQ4ISI = 1.2f;
    private boolean getOutputFormats = true;
    private float getHighSpeedVideoFpsRanges = 1.0f;
    private int Camera2StreamConfigurationMap = 0;
    private float getHighSpeedVideoFpsRangesFor = 10.0f;
    private float getOutputStallDurationlomOqCM = Float.NaN;
    private float getOutputStallDuration = 1.0f;
    private float getOutputSizeshNQ4ISI = Float.NaN;
    private float unwrapAs = Float.NaN;
    private int getOutputSizes = 0;
    private int getHighResolutionOutputSizeshNQ4ISI = 0;

    public androidx.constraintlayout.motion.widget.OnSwipe setTouchAnchorId(int i) {
        this.isOutputSupportedFor = i;
        return this;
    }

    public int getTouchAnchorId() {
        return this.isOutputSupportedFor;
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setTouchAnchorSide(int i) {
        this.getValidOutputFormatsForInputhNQ4ISI = i;
        return this;
    }

    public int getTouchAnchorSide() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setDragDirection(int i) {
        this.getHighSpeedVideoSizes = i;
        return this;
    }

    public int getDragDirection() {
        return this.getHighSpeedVideoSizes;
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setMaxVelocity(int i) {
        this.getOutputMinFrameDuration = i;
        return this;
    }

    public float getMaxVelocity() {
        return this.getOutputMinFrameDuration;
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setMaxAcceleration(int i) {
        this.getInputSizeshNQ4ISI = i;
        return this;
    }

    public float getMaxAcceleration() {
        return this.getInputSizeshNQ4ISI;
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setMoveWhenScrollAtTop(boolean z) {
        this.getOutputFormats = z;
        return this;
    }

    public boolean getMoveWhenScrollAtTop() {
        return this.getOutputFormats;
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setDragScale(int i) {
        this.getHighSpeedVideoFpsRanges = i;
        return this;
    }

    public float getDragScale() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setDragThreshold(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
        return this;
    }

    public float getDragThreshold() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setTouchRegionId(int i) {
        this.isOutputSupportedForhNQ4ISI = i;
        return this;
    }

    public int getTouchRegionId() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setOnTouchUp(int i) {
        this.getHighSpeedVideoSizesFor = i;
        return this;
    }

    public int getOnTouchUp() {
        return this.getHighSpeedVideoSizesFor;
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setNestedScrollFlags(int i) {
        this.Camera2StreamConfigurationMap = i;
        return this;
    }

    public int getNestedScrollFlags() {
        return this.Camera2StreamConfigurationMap;
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setLimitBoundsTo(int i) {
        this.getInputFormats = i;
        return this;
    }

    public int getLimitBoundsTo() {
        return this.getInputFormats;
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setRotateCenter(int i) {
        this.getOutputMinFrameDurationlomOqCM = i;
        return this;
    }

    public int getRotationCenterId() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public float getSpringDamping() {
        return this.getOutputStallDurationlomOqCM;
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setSpringDamping(float f) {
        this.getOutputStallDurationlomOqCM = f;
        return this;
    }

    public float getSpringMass() {
        return this.getOutputStallDuration;
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setSpringMass(float f) {
        this.getOutputStallDuration = f;
        return this;
    }

    public float getSpringStiffness() {
        return this.getOutputSizeshNQ4ISI;
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setSpringStiffness(float f) {
        this.getOutputSizeshNQ4ISI = f;
        return this;
    }

    public float getSpringStopThreshold() {
        return this.unwrapAs;
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setSpringStopThreshold(float f) {
        this.unwrapAs = f;
        return this;
    }

    public int getSpringBoundary() {
        return this.getOutputSizes;
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setSpringBoundary(int i) {
        this.getOutputSizes = i;
        return this;
    }

    public int getAutoCompleteMode() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setAutoCompleteMode(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }
}

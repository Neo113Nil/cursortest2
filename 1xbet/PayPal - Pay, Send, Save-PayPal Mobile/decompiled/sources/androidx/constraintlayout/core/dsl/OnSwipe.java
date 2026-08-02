package androidx.constraintlayout.core.dsl;

/* loaded from: classes6.dex */
public class OnSwipe {
    public static final int FLAG_DISABLE_POST_SCROLL = 1;
    public static final int FLAG_DISABLE_SCROLL = 2;
    private androidx.constraintlayout.core.dsl.OnSwipe.Mode Camera2StreamConfigurationMap;
    private float getHighResolutionOutputSizeshNQ4ISI;
    private float getHighSpeedVideoFpsRanges;
    private androidx.constraintlayout.core.dsl.OnSwipe.Drag getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;
    private java.lang.String getHighSpeedVideoSizesFor;
    private androidx.constraintlayout.core.dsl.OnSwipe.TouchUp getInputFormats;
    private androidx.constraintlayout.core.dsl.OnSwipe.Boundary getInputSizeshNQ4ISI;
    private float getOutputFormats;
    private float getOutputMinFrameDuration;
    private float getOutputMinFrameDurationlomOqCM;
    private float getOutputSizes;
    private float getOutputSizeshNQ4ISI;
    private java.lang.String getOutputStallDuration;
    private float getOutputStallDurationlomOqCM;
    private androidx.constraintlayout.core.dsl.OnSwipe.Side unwrapAs;

    public enum Boundary {
        OVERSHOOT,
        BOUNCE_START,
        BOUNCE_END,
        BOUNCE_BOTH
    }

    public enum Drag {
        UP,
        DOWN,
        LEFT,
        RIGHT,
        START,
        END,
        CLOCKWISE,
        ANTICLOCKWISE
    }

    public enum Mode {
        VELOCITY,
        SPRING
    }

    public enum Side {
        TOP,
        LEFT,
        RIGHT,
        BOTTOM,
        MIDDLE,
        START,
        END
    }

    public enum TouchUp {
        AUTOCOMPLETE,
        TO_START,
        NEVER_COMPLETE_END,
        TO_END,
        STOP,
        DECELERATE,
        DECELERATE_COMPLETE,
        NEVER_COMPLETE_START
    }

    public OnSwipe() {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.unwrapAs = null;
        this.getOutputStallDuration = null;
        this.getHighSpeedVideoSizes = null;
        this.getInputFormats = null;
        this.getHighSpeedVideoSizesFor = null;
        this.getOutputMinFrameDuration = Float.NaN;
        this.getOutputFormats = Float.NaN;
        this.getHighSpeedVideoFpsRanges = Float.NaN;
        this.getHighResolutionOutputSizeshNQ4ISI = Float.NaN;
        this.getOutputSizeshNQ4ISI = Float.NaN;
        this.getOutputMinFrameDurationlomOqCM = Float.NaN;
        this.getOutputSizes = Float.NaN;
        this.getOutputStallDurationlomOqCM = Float.NaN;
        this.getInputSizeshNQ4ISI = null;
        this.Camera2StreamConfigurationMap = null;
    }

    public OnSwipe(java.lang.String str, androidx.constraintlayout.core.dsl.OnSwipe.Side side, androidx.constraintlayout.core.dsl.OnSwipe.Drag drag) {
        this.getHighSpeedVideoSizes = null;
        this.getInputFormats = null;
        this.getHighSpeedVideoSizesFor = null;
        this.getOutputMinFrameDuration = Float.NaN;
        this.getOutputFormats = Float.NaN;
        this.getHighSpeedVideoFpsRanges = Float.NaN;
        this.getHighResolutionOutputSizeshNQ4ISI = Float.NaN;
        this.getOutputSizeshNQ4ISI = Float.NaN;
        this.getOutputMinFrameDurationlomOqCM = Float.NaN;
        this.getOutputSizes = Float.NaN;
        this.getOutputStallDurationlomOqCM = Float.NaN;
        this.getInputSizeshNQ4ISI = null;
        this.Camera2StreamConfigurationMap = null;
        this.getOutputStallDuration = str;
        this.unwrapAs = side;
        this.getHighSpeedVideoFpsRangesFor = drag;
    }

    public androidx.constraintlayout.core.dsl.OnSwipe setTouchAnchorId(java.lang.String str) {
        this.getOutputStallDuration = str;
        return this;
    }

    public java.lang.String getTouchAnchorId() {
        return this.getOutputStallDuration;
    }

    public androidx.constraintlayout.core.dsl.OnSwipe setTouchAnchorSide(androidx.constraintlayout.core.dsl.OnSwipe.Side side) {
        this.unwrapAs = side;
        return this;
    }

    public androidx.constraintlayout.core.dsl.OnSwipe.Side getTouchAnchorSide() {
        return this.unwrapAs;
    }

    public androidx.constraintlayout.core.dsl.OnSwipe setDragDirection(androidx.constraintlayout.core.dsl.OnSwipe.Drag drag) {
        this.getHighSpeedVideoFpsRangesFor = drag;
        return this;
    }

    public androidx.constraintlayout.core.dsl.OnSwipe.Drag getDragDirection() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public androidx.constraintlayout.core.dsl.OnSwipe setMaxVelocity(int i) {
        this.getOutputMinFrameDuration = i;
        return this;
    }

    public float getMaxVelocity() {
        return this.getOutputMinFrameDuration;
    }

    public androidx.constraintlayout.core.dsl.OnSwipe setMaxAcceleration(int i) {
        this.getOutputFormats = i;
        return this;
    }

    public float getMaxAcceleration() {
        return this.getOutputFormats;
    }

    public androidx.constraintlayout.core.dsl.OnSwipe setDragScale(int i) {
        this.getHighSpeedVideoFpsRanges = i;
        return this;
    }

    public float getDragScale() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public androidx.constraintlayout.core.dsl.OnSwipe setDragThreshold(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        return this;
    }

    public float getDragThreshold() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public androidx.constraintlayout.core.dsl.OnSwipe setOnTouchUp(androidx.constraintlayout.core.dsl.OnSwipe.TouchUp touchUp) {
        this.getInputFormats = touchUp;
        return this;
    }

    public androidx.constraintlayout.core.dsl.OnSwipe.TouchUp getOnTouchUp() {
        return this.getInputFormats;
    }

    public androidx.constraintlayout.core.dsl.OnSwipe setLimitBoundsTo(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
        return this;
    }

    public java.lang.String getLimitBoundsTo() {
        return this.getHighSpeedVideoSizes;
    }

    public androidx.constraintlayout.core.dsl.OnSwipe setRotateCenter(java.lang.String str) {
        this.getHighSpeedVideoSizesFor = str;
        return this;
    }

    public java.lang.String getRotationCenterId() {
        return this.getHighSpeedVideoSizesFor;
    }

    public float getSpringDamping() {
        return this.getOutputSizeshNQ4ISI;
    }

    public androidx.constraintlayout.core.dsl.OnSwipe setSpringDamping(float f) {
        this.getOutputSizeshNQ4ISI = f;
        return this;
    }

    public float getSpringMass() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public androidx.constraintlayout.core.dsl.OnSwipe setSpringMass(float f) {
        this.getOutputMinFrameDurationlomOqCM = f;
        return this;
    }

    public float getSpringStiffness() {
        return this.getOutputSizes;
    }

    public androidx.constraintlayout.core.dsl.OnSwipe setSpringStiffness(float f) {
        this.getOutputSizes = f;
        return this;
    }

    public float getSpringStopThreshold() {
        return this.getOutputStallDurationlomOqCM;
    }

    public androidx.constraintlayout.core.dsl.OnSwipe setSpringStopThreshold(float f) {
        this.getOutputStallDurationlomOqCM = f;
        return this;
    }

    public androidx.constraintlayout.core.dsl.OnSwipe.Boundary getSpringBoundary() {
        return this.getInputSizeshNQ4ISI;
    }

    public androidx.constraintlayout.core.dsl.OnSwipe setSpringBoundary(androidx.constraintlayout.core.dsl.OnSwipe.Boundary boundary) {
        this.getInputSizeshNQ4ISI = boundary;
        return this;
    }

    public androidx.constraintlayout.core.dsl.OnSwipe.Mode getAutoCompleteMode() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setAutoCompleteMode(androidx.constraintlayout.core.dsl.OnSwipe.Mode mode) {
        this.Camera2StreamConfigurationMap = mode;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSwipe:{\n");
        if (this.getOutputStallDuration != null) {
            sb.append("anchor:'");
            sb.append(this.getOutputStallDuration);
            sb.append("',\n");
        }
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            sb.append("direction:'");
            sb.append(this.getHighSpeedVideoFpsRangesFor.toString().toLowerCase());
            sb.append("',\n");
        }
        if (this.unwrapAs != null) {
            sb.append("side:'");
            sb.append(this.unwrapAs.toString().toLowerCase());
            sb.append("',\n");
        }
        if (!java.lang.Float.isNaN(this.getHighSpeedVideoFpsRanges)) {
            sb.append("scale:'");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append("',\n");
        }
        if (!java.lang.Float.isNaN(this.getHighResolutionOutputSizeshNQ4ISI)) {
            sb.append("threshold:'");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append("',\n");
        }
        if (!java.lang.Float.isNaN(this.getOutputMinFrameDuration)) {
            sb.append("maxVelocity:'");
            sb.append(this.getOutputMinFrameDuration);
            sb.append("',\n");
        }
        if (!java.lang.Float.isNaN(this.getOutputFormats)) {
            sb.append("maxAccel:'");
            sb.append(this.getOutputFormats);
            sb.append("',\n");
        }
        if (this.getHighSpeedVideoSizes != null) {
            sb.append("limitBounds:'");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append("',\n");
        }
        if (this.Camera2StreamConfigurationMap != null) {
            sb.append("mode:'");
            sb.append(this.Camera2StreamConfigurationMap.toString().toLowerCase());
            sb.append("',\n");
        }
        if (this.getInputFormats != null) {
            sb.append("touchUp:'");
            sb.append(this.getInputFormats.toString().toLowerCase());
            sb.append("',\n");
        }
        if (!java.lang.Float.isNaN(this.getOutputMinFrameDurationlomOqCM)) {
            sb.append("springMass:'");
            sb.append(this.getOutputMinFrameDurationlomOqCM);
            sb.append("',\n");
        }
        if (!java.lang.Float.isNaN(this.getOutputSizes)) {
            sb.append("springStiffness:'");
            sb.append(this.getOutputSizes);
            sb.append("',\n");
        }
        if (!java.lang.Float.isNaN(this.getOutputSizeshNQ4ISI)) {
            sb.append("springDamping:'");
            sb.append(this.getOutputSizeshNQ4ISI);
            sb.append("',\n");
        }
        if (!java.lang.Float.isNaN(this.getOutputStallDurationlomOqCM)) {
            sb.append("stopThreshold:'");
            sb.append(this.getOutputStallDurationlomOqCM);
            sb.append("',\n");
        }
        if (this.getInputSizeshNQ4ISI != null) {
            sb.append("springBoundary:'");
            sb.append(this.getInputSizeshNQ4ISI);
            sb.append("',\n");
        }
        if (this.getHighSpeedVideoSizesFor != null) {
            sb.append("around:'");
            sb.append(this.getHighSpeedVideoSizesFor);
            sb.append("',\n");
        }
        sb.append("},\n");
        return sb.toString();
    }
}

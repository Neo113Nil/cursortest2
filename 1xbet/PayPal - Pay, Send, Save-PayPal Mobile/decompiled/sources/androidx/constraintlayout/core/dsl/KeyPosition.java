package androidx.constraintlayout.core.dsl;

/* loaded from: classes6.dex */
public class KeyPosition extends androidx.constraintlayout.core.dsl.Keys {
    private int getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoSizesFor;
    private java.lang.String getInputFormats = null;
    private float getHighResolutionOutputSizeshNQ4ISI = Float.NaN;
    private float getHighSpeedVideoFpsRangesFor = Float.NaN;
    private float Camera2StreamConfigurationMap = Float.NaN;
    private float getHighSpeedVideoSizes = Float.NaN;
    private androidx.constraintlayout.core.dsl.KeyPosition.Type getOutputMinFrameDuration = androidx.constraintlayout.core.dsl.KeyPosition.Type.CARTESIAN;

    public enum Type {
        CARTESIAN,
        SCREEN,
        PATH
    }

    public KeyPosition(java.lang.String str, int i) {
        this.getHighSpeedVideoSizesFor = null;
        this.getHighSpeedVideoFpsRanges = 0;
        this.getHighSpeedVideoSizesFor = str;
        this.getHighSpeedVideoFpsRanges = i;
    }

    public java.lang.String getTransitionEasing() {
        return this.getInputFormats;
    }

    public void setTransitionEasing(java.lang.String str) {
        this.getInputFormats = str;
    }

    public int getFrames() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setFrames(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    public float getPercentWidth() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setPercentWidth(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
    }

    public float getPercentHeight() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setPercentHeight(float f) {
        this.getHighSpeedVideoFpsRangesFor = f;
    }

    public float getPercentX() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setPercentX(float f) {
        this.Camera2StreamConfigurationMap = f;
    }

    public float getPercentY() {
        return this.getHighSpeedVideoSizes;
    }

    public void setPercentY(float f) {
        this.getHighSpeedVideoSizes = f;
    }

    public androidx.constraintlayout.core.dsl.KeyPosition.Type getPositionType() {
        return this.getOutputMinFrameDuration;
    }

    public void setPositionType(androidx.constraintlayout.core.dsl.KeyPosition.Type type) {
        this.getOutputMinFrameDuration = type;
    }

    public java.lang.String getTarget() {
        return this.getHighSpeedVideoSizesFor;
    }

    public void setTarget(java.lang.String str) {
        this.getHighSpeedVideoSizesFor = str;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("KeyPositions:{\n");
        append(sb, androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, this.getHighSpeedVideoSizesFor);
        sb.append("frame:");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(",\n");
        if (this.getOutputMinFrameDuration != null) {
            sb.append("type:'");
            sb.append(this.getOutputMinFrameDuration);
            sb.append("',\n");
        }
        append(sb, "easing", this.getInputFormats);
        append(sb, "percentX", this.Camera2StreamConfigurationMap);
        append(sb, "percentY", this.getHighSpeedVideoSizes);
        append(sb, "percentWidth", this.getHighResolutionOutputSizeshNQ4ISI);
        append(sb, "percentHeight", this.getHighSpeedVideoFpsRangesFor);
        sb.append("},\n");
        return sb.toString();
    }
}

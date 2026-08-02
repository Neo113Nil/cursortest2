package androidx.constraintlayout.core.dsl;

/* loaded from: classes6.dex */
public class KeyPositions extends androidx.constraintlayout.core.dsl.Keys {
    private int[] getHighSpeedVideoFpsRanges;
    private java.lang.String[] getInputFormats;
    private java.lang.String getInputSizeshNQ4ISI = null;
    private androidx.constraintlayout.core.dsl.KeyPositions.Type getOutputFormats = null;
    private float[] Camera2StreamConfigurationMap = null;
    private float[] getHighSpeedVideoFpsRangesFor = null;
    private float[] getHighSpeedVideoSizes = null;
    private float[] getHighResolutionOutputSizeshNQ4ISI = null;

    public enum Type {
        CARTESIAN,
        SCREEN,
        PATH
    }

    public KeyPositions(int i, java.lang.String... strArr) {
        this.getHighSpeedVideoFpsRanges = null;
        this.getInputFormats = strArr;
        this.getHighSpeedVideoFpsRanges = new int[i];
        float f = 100.0f / (i + 1);
        int i2 = 0;
        while (true) {
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            if (i2 >= iArr.length) {
                return;
            }
            iArr[i2] = (int) ((i2 * f) + f);
            i2++;
        }
    }

    public java.lang.String getTransitionEasing() {
        return this.getInputSizeshNQ4ISI;
    }

    public void setTransitionEasing(java.lang.String str) {
        this.getInputSizeshNQ4ISI = str;
    }

    public int[] getFrames() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setFrames(int... iArr) {
        this.getHighSpeedVideoFpsRanges = iArr;
    }

    public float[] getPercentWidth() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setPercentWidth(float... fArr) {
        this.Camera2StreamConfigurationMap = fArr;
    }

    public float[] getPercentHeight() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setPercentHeight(float... fArr) {
        this.getHighSpeedVideoFpsRangesFor = fArr;
    }

    public float[] getPercentX() {
        return this.getHighSpeedVideoSizes;
    }

    public void setPercentX(float... fArr) {
        this.getHighSpeedVideoSizes = fArr;
    }

    public float[] getPercentY() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setPercentY(float... fArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = fArr;
    }

    public androidx.constraintlayout.core.dsl.KeyPositions.Type getPositionType() {
        return this.getOutputFormats;
    }

    public void setPositionType(androidx.constraintlayout.core.dsl.KeyPositions.Type type) {
        this.getOutputFormats = type;
    }

    public java.lang.String[] getTarget() {
        return this.getInputFormats;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("KeyPositions:{\n");
        append(sb, androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, this.getInputFormats);
        sb.append("frame:");
        sb.append(java.util.Arrays.toString(this.getHighSpeedVideoFpsRanges));
        sb.append(",\n");
        if (this.getOutputFormats != null) {
            sb.append("type:'");
            sb.append(this.getOutputFormats);
            sb.append("',\n");
        }
        append(sb, "easing", this.getInputSizeshNQ4ISI);
        append(sb, "percentX", this.getHighSpeedVideoSizes);
        append(sb, "percentX", this.getHighResolutionOutputSizeshNQ4ISI);
        append(sb, "percentWidth", this.Camera2StreamConfigurationMap);
        append(sb, "percentHeight", this.getHighSpeedVideoFpsRangesFor);
        sb.append("},\n");
        return sb.toString();
    }
}

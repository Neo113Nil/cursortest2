package androidx.constraintlayout.core.dsl;

/* loaded from: classes6.dex */
public class KeyAttributes extends androidx.constraintlayout.core.dsl.Keys {
    private float[] Camera2StreamConfigurationMap;
    protected java.lang.String TYPE;
    private float[] getHighResolutionOutputSizeshNQ4ISI;
    private androidx.constraintlayout.core.dsl.KeyAttributes.Fit getHighSpeedVideoFpsRanges;
    private int[] getHighSpeedVideoFpsRangesFor;
    private float[] getHighSpeedVideoSizes;
    private float[] getHighSpeedVideoSizesFor;
    private float[] getInputFormats;
    private float[] getInputSizeshNQ4ISI;
    private float[] getOutputFormats;
    private float[] getOutputMinFrameDuration;
    private float[] getOutputMinFrameDurationlomOqCM;
    private java.lang.String[] getOutputSizes;
    private float[] getOutputSizeshNQ4ISI;
    private float[] getOutputStallDuration;
    private java.lang.String getOutputStallDurationlomOqCM;
    private float[] isOutputSupportedFor;
    private androidx.constraintlayout.core.dsl.KeyAttributes.Visibility[] toString;

    public enum Fit {
        SPLINE,
        LINEAR
    }

    public enum Visibility {
        VISIBLE,
        INVISIBLE,
        GONE
    }

    public java.lang.String[] getTarget() {
        return this.getOutputSizes;
    }

    public void setTarget(java.lang.String[] strArr) {
        this.getOutputSizes = strArr;
    }

    public java.lang.String getTransitionEasing() {
        return this.getOutputStallDurationlomOqCM;
    }

    public void setTransitionEasing(java.lang.String str) {
        this.getOutputStallDurationlomOqCM = str;
    }

    public androidx.constraintlayout.core.dsl.KeyAttributes.Fit getCurveFit() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setCurveFit(androidx.constraintlayout.core.dsl.KeyAttributes.Fit fit) {
        this.getHighSpeedVideoFpsRanges = fit;
    }

    public androidx.constraintlayout.core.dsl.KeyAttributes.Visibility[] getVisibility() {
        return this.toString;
    }

    public void setVisibility(androidx.constraintlayout.core.dsl.KeyAttributes.Visibility... visibilityArr) {
        this.toString = visibilityArr;
    }

    public float[] getAlpha() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setAlpha(float... fArr) {
        this.Camera2StreamConfigurationMap = fArr;
    }

    public float[] getRotation() {
        return this.getOutputMinFrameDuration;
    }

    public void setRotation(float... fArr) {
        this.getOutputMinFrameDuration = fArr;
    }

    public float[] getRotationX() {
        return this.getInputFormats;
    }

    public void setRotationX(float... fArr) {
        this.getInputFormats = fArr;
    }

    public float[] getRotationY() {
        return this.getHighSpeedVideoSizesFor;
    }

    public void setRotationY(float... fArr) {
        this.getHighSpeedVideoSizesFor = fArr;
    }

    public float[] getPivotX() {
        return this.getHighSpeedVideoSizes;
    }

    public void setPivotX(float... fArr) {
        this.getHighSpeedVideoSizes = fArr;
    }

    public float[] getPivotY() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setPivotY(float... fArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = fArr;
    }

    public float[] getTransitionPathRotate() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public void setTransitionPathRotate(float... fArr) {
        this.getOutputMinFrameDurationlomOqCM = fArr;
    }

    public float[] getScaleX() {
        return this.getOutputFormats;
    }

    public void setScaleX(float[] fArr) {
        this.getOutputFormats = fArr;
    }

    public float[] getScaleY() {
        return this.getInputSizeshNQ4ISI;
    }

    public void setScaleY(float[] fArr) {
        this.getInputSizeshNQ4ISI = fArr;
    }

    public float[] getTranslationX() {
        return this.getOutputSizeshNQ4ISI;
    }

    public void setTranslationX(float[] fArr) {
        this.getOutputSizeshNQ4ISI = fArr;
    }

    public float[] getTranslationY() {
        return this.getOutputStallDuration;
    }

    public void setTranslationY(float[] fArr) {
        this.getOutputStallDuration = fArr;
    }

    public float[] getTranslationZ() {
        return this.isOutputSupportedFor;
    }

    public void setTranslationZ(float[] fArr) {
        this.isOutputSupportedFor = fArr;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.TYPE);
        sb.append(":{\n");
        attributesToString(sb);
        sb.append("},\n");
        return sb.toString();
    }

    protected void attributesToString(java.lang.StringBuilder sb) {
        append(sb, androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, this.getOutputSizes);
        sb.append("frame:");
        sb.append(java.util.Arrays.toString(this.getHighSpeedVideoFpsRangesFor));
        sb.append(",\n");
        append(sb, "easing", this.getOutputStallDurationlomOqCM);
        if (this.getHighSpeedVideoFpsRanges != null) {
            sb.append("fit:'");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append("',\n");
        }
        if (this.toString != null) {
            sb.append("visibility:'");
            sb.append(java.util.Arrays.toString(this.toString));
            sb.append("',\n");
        }
        append(sb, "alpha", this.Camera2StreamConfigurationMap);
        append(sb, "rotationX", this.getInputFormats);
        append(sb, "rotationY", this.getHighSpeedVideoSizesFor);
        append(sb, "rotationZ", this.getOutputMinFrameDuration);
        append(sb, "pivotX", this.getHighSpeedVideoSizes);
        append(sb, "pivotY", this.getHighResolutionOutputSizeshNQ4ISI);
        append(sb, "pathRotate", this.getOutputMinFrameDurationlomOqCM);
        append(sb, "scaleX", this.getOutputFormats);
        append(sb, "scaleY", this.getInputSizeshNQ4ISI);
        append(sb, "translationX", this.getOutputSizeshNQ4ISI);
        append(sb, "translationY", this.getOutputStallDuration);
        append(sb, "translationZ", this.isOutputSupportedFor);
    }
}

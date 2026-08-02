package androidx.constraintlayout.core.dsl;

/* loaded from: classes6.dex */
public class KeyAttribute extends androidx.constraintlayout.core.dsl.Keys {
    private int getHighSpeedVideoFpsRangesFor;
    private java.lang.String getOutputSizeshNQ4ISI;
    private java.lang.String getOutputStallDurationlomOqCM;
    protected java.lang.String TYPE = androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.NAME;
    private androidx.constraintlayout.core.dsl.KeyAttribute.Fit getHighSpeedVideoSizes = null;
    private androidx.constraintlayout.core.dsl.KeyAttribute.Visibility toString = null;
    private float getHighResolutionOutputSizeshNQ4ISI = Float.NaN;
    private float getInputSizeshNQ4ISI = Float.NaN;
    private float getHighSpeedVideoSizesFor = Float.NaN;
    private float getOutputFormats = Float.NaN;
    private float getHighSpeedVideoFpsRanges = Float.NaN;
    private float Camera2StreamConfigurationMap = Float.NaN;
    private float getOutputMinFrameDurationlomOqCM = Float.NaN;
    private float getInputFormats = Float.NaN;
    private float getOutputMinFrameDuration = Float.NaN;
    private float getOutputStallDuration = Float.NaN;
    private float getOutputSizes = Float.NaN;
    private float unwrapAs = Float.NaN;

    public enum Fit {
        SPLINE,
        LINEAR
    }

    public enum Visibility {
        VISIBLE,
        INVISIBLE,
        GONE
    }

    public KeyAttribute(int i, java.lang.String str) {
        this.getOutputStallDurationlomOqCM = str;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public java.lang.String getTarget() {
        return this.getOutputStallDurationlomOqCM;
    }

    public void setTarget(java.lang.String str) {
        this.getOutputStallDurationlomOqCM = str;
    }

    public java.lang.String getTransitionEasing() {
        return this.getOutputSizeshNQ4ISI;
    }

    public void setTransitionEasing(java.lang.String str) {
        this.getOutputSizeshNQ4ISI = str;
    }

    public androidx.constraintlayout.core.dsl.KeyAttribute.Fit getCurveFit() {
        return this.getHighSpeedVideoSizes;
    }

    public void setCurveFit(androidx.constraintlayout.core.dsl.KeyAttribute.Fit fit) {
        this.getHighSpeedVideoSizes = fit;
    }

    public androidx.constraintlayout.core.dsl.KeyAttribute.Visibility getVisibility() {
        return this.toString;
    }

    public void setVisibility(androidx.constraintlayout.core.dsl.KeyAttribute.Visibility visibility) {
        this.toString = visibility;
    }

    public float getAlpha() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setAlpha(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
    }

    public float getRotation() {
        return this.getInputSizeshNQ4ISI;
    }

    public void setRotation(float f) {
        this.getInputSizeshNQ4ISI = f;
    }

    public float getRotationX() {
        return this.getHighSpeedVideoSizesFor;
    }

    public void setRotationX(float f) {
        this.getHighSpeedVideoSizesFor = f;
    }

    public float getRotationY() {
        return this.getOutputFormats;
    }

    public void setRotationY(float f) {
        this.getOutputFormats = f;
    }

    public float getPivotX() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setPivotX(float f) {
        this.getHighSpeedVideoFpsRanges = f;
    }

    public float getPivotY() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setPivotY(float f) {
        this.Camera2StreamConfigurationMap = f;
    }

    public float getTransitionPathRotate() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public void setTransitionPathRotate(float f) {
        this.getOutputMinFrameDurationlomOqCM = f;
    }

    public float getScaleX() {
        return this.getInputFormats;
    }

    public void setScaleX(float f) {
        this.getInputFormats = f;
    }

    public float getScaleY() {
        return this.getOutputMinFrameDuration;
    }

    public void setScaleY(float f) {
        this.getOutputMinFrameDuration = f;
    }

    public float getTranslationX() {
        return this.getOutputStallDuration;
    }

    public void setTranslationX(float f) {
        this.getOutputStallDuration = f;
    }

    public float getTranslationY() {
        return this.getOutputSizes;
    }

    public void setTranslationY(float f) {
        this.getOutputSizes = f;
    }

    public float getTranslationZ() {
        return this.unwrapAs;
    }

    public void setTranslationZ(float f) {
        this.unwrapAs = f;
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
        append(sb, androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, this.getOutputStallDurationlomOqCM);
        sb.append("frame:");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(",\n");
        append(sb, "easing", this.getOutputSizeshNQ4ISI);
        if (this.getHighSpeedVideoSizes != null) {
            sb.append("fit:'");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append("',\n");
        }
        if (this.toString != null) {
            sb.append("visibility:'");
            sb.append(this.toString);
            sb.append("',\n");
        }
        append(sb, "alpha", this.getHighResolutionOutputSizeshNQ4ISI);
        append(sb, "rotationX", this.getHighSpeedVideoSizesFor);
        append(sb, "rotationY", this.getOutputFormats);
        append(sb, "rotationZ", this.getInputSizeshNQ4ISI);
        append(sb, "pivotX", this.getHighSpeedVideoFpsRanges);
        append(sb, "pivotY", this.Camera2StreamConfigurationMap);
        append(sb, "pathRotate", this.getOutputMinFrameDurationlomOqCM);
        append(sb, "scaleX", this.getInputFormats);
        append(sb, "scaleY", this.getOutputMinFrameDuration);
        append(sb, "translationX", this.getOutputStallDuration);
        append(sb, "translationY", this.getOutputSizes);
        append(sb, "translationZ", this.unwrapAs);
    }
}

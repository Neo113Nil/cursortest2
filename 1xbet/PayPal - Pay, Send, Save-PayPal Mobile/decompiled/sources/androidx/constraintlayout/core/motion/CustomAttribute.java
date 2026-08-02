package androidx.constraintlayout.core.motion;

/* loaded from: classes6.dex */
public class CustomAttribute {
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private float getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    java.lang.String getHighSpeedVideoSizes;
    private boolean getHighSpeedVideoSizesFor;
    private androidx.constraintlayout.core.motion.CustomAttribute.AttributeType getInputFormats;
    private java.lang.String getInputSizeshNQ4ISI;

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public static int hsvToRgb(float f, float f2, float f3) {
        float f4 = f * 6.0f;
        int i = (int) f4;
        float f5 = f4 - i;
        float f6 = f3 * 255.0f;
        int i2 = (int) (((1.0f - f2) * f6) + 0.5f);
        int i3 = (int) (((1.0f - (f5 * f2)) * f6) + 0.5f);
        int i4 = (int) (((1.0f - ((1.0f - f5) * f2)) * f6) + 0.5f);
        int i5 = (int) (f6 + 0.5f);
        if (i == 0) {
            return ((i5 << 16) + (i4 << 8) + i2) | (-16777216);
        }
        if (i == 1) {
            return ((i3 << 16) + (i5 << 8) + i2) | (-16777216);
        }
        if (i == 2) {
            return ((i2 << 16) + (i5 << 8) + i4) | (-16777216);
        }
        if (i == 3) {
            return ((i2 << 16) + (i3 << 8) + i5) | (-16777216);
        }
        if (i == 4) {
            return ((i4 << 16) + (i2 << 8) + i5) | (-16777216);
        }
        if (i != 5) {
            return 0;
        }
        return ((i5 << 16) + (i2 << 8) + i3) | (-16777216);
    }

    public androidx.constraintlayout.core.motion.CustomAttribute.AttributeType getType() {
        return this.getInputFormats;
    }

    public boolean isContinuous() {
        int ordinal = this.getInputFormats.ordinal();
        return (ordinal == 4 || ordinal == 5 || ordinal == 7) ? false : true;
    }

    public void setFloatValue(float f) {
        this.getHighSpeedVideoFpsRanges = f;
    }

    public void setColorValue(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public void setIntValue(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    public void setStringValue(java.lang.String str) {
        this.getInputSizeshNQ4ISI = str;
    }

    public int numberOfInterpolatedValues() {
        int ordinal = this.getInputFormats.ordinal();
        return (ordinal == 2 || ordinal == 3) ? 4 : 1;
    }

    public float getValueToInterpolate() {
        switch (this.getInputFormats) {
            case INT_TYPE:
                return this.Camera2StreamConfigurationMap;
            case FLOAT_TYPE:
                return this.getHighSpeedVideoFpsRanges;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                throw new java.lang.RuntimeException("Color does not have a single color to interpolate");
            case STRING_TYPE:
                throw new java.lang.RuntimeException("Cannot interpolate String");
            case BOOLEAN_TYPE:
                return this.getHighSpeedVideoFpsRangesFor ? 1.0f : 0.0f;
            case DIMENSION_TYPE:
                return this.getHighSpeedVideoFpsRanges;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (this.getInputFormats) {
            case INT_TYPE:
                fArr[0] = this.Camera2StreamConfigurationMap;
                return;
            case FLOAT_TYPE:
                fArr[0] = this.getHighSpeedVideoFpsRanges;
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                float pow = (float) java.lang.Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) java.lang.Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) java.lang.Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = ((i >> 24) & 255) / 255.0f;
                return;
            case STRING_TYPE:
                throw new java.lang.RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                fArr[0] = this.getHighSpeedVideoFpsRangesFor ? 1.0f : 0.0f;
                return;
            case DIMENSION_TYPE:
                fArr[0] = this.getHighSpeedVideoFpsRanges;
                return;
            default:
                return;
        }
    }

    public void setValue(float[] fArr) {
        switch (this.getInputFormats) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.Camera2StreamConfigurationMap = (int) fArr[0];
                return;
            case FLOAT_TYPE:
                this.getHighSpeedVideoFpsRanges = fArr[0];
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int hsvToRgb = hsvToRgb(fArr[0], fArr[1], fArr[2]);
                int i = (int) (fArr[3] * 255.0f);
                int i2 = (i & (~(i >> 31))) - 255;
                this.getHighResolutionOutputSizeshNQ4ISI = (((i2 & (i2 >> 31)) + 255) << 24) | (hsvToRgb & 16777215);
                return;
            case STRING_TYPE:
                throw new java.lang.RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                this.getHighSpeedVideoFpsRangesFor = ((double) fArr[0]) > 0.5d;
                return;
            case DIMENSION_TYPE:
                this.getHighSpeedVideoFpsRanges = fArr[0];
                return;
            default:
                return;
        }
    }

    public boolean diff(androidx.constraintlayout.core.motion.CustomAttribute customAttribute) {
        androidx.constraintlayout.core.motion.CustomAttribute.AttributeType attributeType;
        if (customAttribute != null && (attributeType = this.getInputFormats) == customAttribute.getInputFormats) {
            switch (attributeType) {
                case INT_TYPE:
                case REFERENCE_TYPE:
                    if (this.Camera2StreamConfigurationMap == customAttribute.Camera2StreamConfigurationMap) {
                        return true;
                    }
                    break;
                case FLOAT_TYPE:
                    return this.getHighSpeedVideoFpsRanges == customAttribute.getHighSpeedVideoFpsRanges;
                case COLOR_TYPE:
                case COLOR_DRAWABLE_TYPE:
                    return this.getHighResolutionOutputSizeshNQ4ISI == customAttribute.getHighResolutionOutputSizeshNQ4ISI;
                case STRING_TYPE:
                    return this.Camera2StreamConfigurationMap == customAttribute.Camera2StreamConfigurationMap;
                case BOOLEAN_TYPE:
                    return this.getHighSpeedVideoFpsRangesFor == customAttribute.getHighSpeedVideoFpsRangesFor;
                case DIMENSION_TYPE:
                    return this.getHighSpeedVideoFpsRanges == customAttribute.getHighSpeedVideoFpsRanges;
                default:
                    return false;
            }
        }
        return false;
    }

    public CustomAttribute(java.lang.String str, androidx.constraintlayout.core.motion.CustomAttribute.AttributeType attributeType) {
        this.getHighSpeedVideoSizesFor = false;
        this.getHighSpeedVideoSizes = str;
        this.getInputFormats = attributeType;
    }

    public CustomAttribute(java.lang.String str, androidx.constraintlayout.core.motion.CustomAttribute.AttributeType attributeType, java.lang.Object obj, boolean z) {
        this.getHighSpeedVideoSizes = str;
        this.getInputFormats = attributeType;
        this.getHighSpeedVideoSizesFor = z;
        setValue(obj);
    }

    public CustomAttribute(androidx.constraintlayout.core.motion.CustomAttribute customAttribute, java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = false;
        this.getHighSpeedVideoSizes = customAttribute.getHighSpeedVideoSizes;
        this.getInputFormats = customAttribute.getInputFormats;
        setValue(obj);
    }

    public void setValue(java.lang.Object obj) {
        switch (this.getInputFormats) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.Camera2StreamConfigurationMap = ((java.lang.Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.getHighSpeedVideoFpsRanges = ((java.lang.Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.getHighResolutionOutputSizeshNQ4ISI = ((java.lang.Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.getInputSizeshNQ4ISI = (java.lang.String) obj;
                break;
            case BOOLEAN_TYPE:
                this.getHighSpeedVideoFpsRangesFor = ((java.lang.Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.getHighSpeedVideoFpsRanges = ((java.lang.Float) obj).floatValue();
                break;
        }
    }
}

package androidx.constraintlayout.core.motion;

/* loaded from: classes6.dex */
public class CustomVariable {
    java.lang.String Camera2StreamConfigurationMap;
    private float getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;
    private int getOutputFormats;

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

    public static int rgbaTocColor(float f, float f2, float f3, float f4) {
        int i = (int) (f * 255.0f);
        int i2 = (i & (~(i >> 31))) - 255;
        int i3 = (int) (f2 * 255.0f);
        int i4 = (i3 & (~(i3 >> 31))) - 255;
        int i5 = (int) (f3 * 255.0f);
        int i6 = (i5 & (~(i5 >> 31))) - 255;
        int i7 = (int) (f4 * 255.0f);
        int i8 = (i7 & (~(i7 >> 31))) - 255;
        return (((i2 & (i2 >> 31)) + 255) << 16) | (((i8 & (i8 >> 31)) + 255) << 24) | (((i4 & (i4 >> 31)) + 255) << 8) | ((i6 & (i6 >> 31)) + 255);
    }

    public androidx.constraintlayout.core.motion.CustomVariable copy() {
        return new androidx.constraintlayout.core.motion.CustomVariable(this);
    }

    public CustomVariable(androidx.constraintlayout.core.motion.CustomVariable customVariable) {
        this.getHighSpeedVideoFpsRangesFor = Integer.MIN_VALUE;
        this.getHighResolutionOutputSizeshNQ4ISI = Float.NaN;
        this.getHighSpeedVideoSizes = null;
        this.Camera2StreamConfigurationMap = customVariable.Camera2StreamConfigurationMap;
        this.getOutputFormats = customVariable.getOutputFormats;
        this.getHighSpeedVideoFpsRangesFor = customVariable.getHighSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = customVariable.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = customVariable.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRanges = customVariable.getHighSpeedVideoFpsRanges;
    }

    public CustomVariable(java.lang.String str, int i, java.lang.String str2) {
        this.getHighSpeedVideoFpsRangesFor = Integer.MIN_VALUE;
        this.getHighResolutionOutputSizeshNQ4ISI = Float.NaN;
        this.Camera2StreamConfigurationMap = str;
        this.getOutputFormats = i;
        this.getHighSpeedVideoSizes = str2;
    }

    public CustomVariable(java.lang.String str, int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor = Integer.MIN_VALUE;
        this.getHighResolutionOutputSizeshNQ4ISI = Float.NaN;
        this.getHighSpeedVideoSizes = null;
        this.Camera2StreamConfigurationMap = str;
        this.getOutputFormats = i;
        if (i == 901) {
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
        } else {
            this.getHighSpeedVideoFpsRangesFor = i2;
        }
    }

    public CustomVariable(java.lang.String str, int i, float f) {
        this.getHighSpeedVideoFpsRangesFor = Integer.MIN_VALUE;
        this.getHighSpeedVideoSizes = null;
        this.Camera2StreamConfigurationMap = str;
        this.getOutputFormats = i;
        this.getHighResolutionOutputSizeshNQ4ISI = f;
    }

    public CustomVariable(java.lang.String str, int i, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = Integer.MIN_VALUE;
        this.getHighResolutionOutputSizeshNQ4ISI = Float.NaN;
        this.getHighSpeedVideoSizes = null;
        this.Camera2StreamConfigurationMap = str;
        this.getOutputFormats = i;
        this.getHighSpeedVideoFpsRanges = z;
    }

    public static java.lang.String colorString(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.visa.cbp.getEncExpo.isEngagementSignalsApiAvailable);
        sb.append(java.lang.Integer.toHexString(i));
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("#");
        sb2.append(obj.substring(obj.length() - 8));
        return sb2.toString();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        java.lang.String obj = sb.toString();
        switch (this.getOutputFormats) {
            case 900:
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(obj);
                sb2.append(this.getHighSpeedVideoFpsRangesFor);
                return sb2.toString();
            case 901:
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(obj);
                sb3.append(this.getHighResolutionOutputSizeshNQ4ISI);
                return sb3.toString();
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR /* 902 */:
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(obj);
                sb4.append(colorString(this.getHighSpeedVideoFpsRangesFor));
                return sb4.toString();
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING /* 903 */:
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                sb5.append(obj);
                sb5.append(this.getHighSpeedVideoSizes);
                return sb5.toString();
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(obj);
                sb6.append(java.lang.Boolean.valueOf(this.getHighSpeedVideoFpsRanges));
                return sb6.toString();
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(obj);
                sb7.append(this.getHighResolutionOutputSizeshNQ4ISI);
                return sb7.toString();
            default:
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(obj);
                sb8.append("????");
                return sb8.toString();
        }
    }

    public int getType() {
        return this.getOutputFormats;
    }

    public boolean getBooleanValue() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public float getFloatValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getColorValue() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getIntegerValue() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.String getStringValue() {
        return this.getHighSpeedVideoSizes;
    }

    public boolean isContinuous() {
        int i = this.getOutputFormats;
        return (i == 903 || i == 904 || i == 906) ? false : true;
    }

    public void setFloatValue(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
    }

    public void setBooleanValue(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
    }

    public void setIntValue(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public void setStringValue(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    public int numberOfInterpolatedValues() {
        return this.getOutputFormats != 902 ? 1 : 4;
    }

    public float getValueToInterpolate() {
        switch (this.getOutputFormats) {
            case 900:
                return this.getHighSpeedVideoFpsRangesFor;
            case 901:
                return this.getHighResolutionOutputSizeshNQ4ISI;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR /* 902 */:
                throw new java.lang.RuntimeException("Color does not have a single color to interpolate");
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING /* 903 */:
                throw new java.lang.RuntimeException("Cannot interpolate String");
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                return this.getHighSpeedVideoFpsRanges ? 1.0f : 0.0f;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                return this.getHighResolutionOutputSizeshNQ4ISI;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (this.getOutputFormats) {
            case 900:
                fArr[0] = this.getHighSpeedVideoFpsRangesFor;
                return;
            case 901:
                fArr[0] = this.getHighResolutionOutputSizeshNQ4ISI;
                return;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR /* 902 */:
                int i = this.getHighSpeedVideoFpsRangesFor;
                float pow = (float) java.lang.Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) java.lang.Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) java.lang.Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = ((i >> 24) & 255) / 255.0f;
                return;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING /* 903 */:
                throw new java.lang.RuntimeException("Cannot interpolate String");
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                fArr[0] = this.getHighSpeedVideoFpsRanges ? 1.0f : 0.0f;
                return;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                fArr[0] = this.getHighResolutionOutputSizeshNQ4ISI;
                return;
            default:
                return;
        }
    }

    public void setValue(float[] fArr) {
        switch (this.getOutputFormats) {
            case 900:
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                this.getHighSpeedVideoFpsRangesFor = (int) fArr[0];
                return;
            case 901:
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                this.getHighResolutionOutputSizeshNQ4ISI = fArr[0];
                return;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR /* 902 */:
                this.getHighSpeedVideoFpsRangesFor = ((java.lang.Math.round(fArr[3] * 255.0f) & 255) << 24) | ((java.lang.Math.round(((float) java.lang.Math.pow(fArr[0], 0.5d)) * 255.0f) & 255) << 16) | ((java.lang.Math.round(((float) java.lang.Math.pow(fArr[1], 0.5d)) * 255.0f) & 255) << 8) | (java.lang.Math.round(((float) java.lang.Math.pow(fArr[2], 0.5d)) * 255.0f) & 255);
                return;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING /* 903 */:
                throw new java.lang.RuntimeException("Cannot interpolate String");
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                this.getHighSpeedVideoFpsRanges = ((double) fArr[0]) > 0.5d;
                return;
            default:
                return;
        }
    }

    public boolean diff(androidx.constraintlayout.core.motion.CustomVariable customVariable) {
        int i;
        if (customVariable != null && (i = this.getOutputFormats) == customVariable.getOutputFormats) {
            switch (i) {
                case 900:
                case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                    if (this.getHighSpeedVideoFpsRangesFor == customVariable.getHighSpeedVideoFpsRangesFor) {
                        return true;
                    }
                    break;
                case 901:
                    return this.getHighResolutionOutputSizeshNQ4ISI == customVariable.getHighResolutionOutputSizeshNQ4ISI;
                case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR /* 902 */:
                    return this.getHighSpeedVideoFpsRangesFor == customVariable.getHighSpeedVideoFpsRangesFor;
                case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING /* 903 */:
                    return this.getHighSpeedVideoFpsRangesFor == customVariable.getHighSpeedVideoFpsRangesFor;
                case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                    return this.getHighSpeedVideoFpsRanges == customVariable.getHighSpeedVideoFpsRanges;
                case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                    return this.getHighResolutionOutputSizeshNQ4ISI == customVariable.getHighResolutionOutputSizeshNQ4ISI;
                default:
                    return false;
            }
        }
        return false;
    }

    public CustomVariable(java.lang.String str, int i) {
        this.getHighSpeedVideoFpsRangesFor = Integer.MIN_VALUE;
        this.getHighResolutionOutputSizeshNQ4ISI = Float.NaN;
        this.getHighSpeedVideoSizes = null;
        this.Camera2StreamConfigurationMap = str;
        this.getOutputFormats = i;
    }

    public CustomVariable(java.lang.String str, int i, java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = Integer.MIN_VALUE;
        this.getHighResolutionOutputSizeshNQ4ISI = Float.NaN;
        this.getHighSpeedVideoSizes = null;
        this.Camera2StreamConfigurationMap = str;
        this.getOutputFormats = i;
        setValue(obj);
    }

    public CustomVariable(androidx.constraintlayout.core.motion.CustomVariable customVariable, java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = Integer.MIN_VALUE;
        this.getHighResolutionOutputSizeshNQ4ISI = Float.NaN;
        this.getHighSpeedVideoSizes = null;
        this.Camera2StreamConfigurationMap = customVariable.Camera2StreamConfigurationMap;
        this.getOutputFormats = customVariable.getOutputFormats;
        setValue(obj);
    }

    public void setValue(java.lang.Object obj) {
        switch (this.getOutputFormats) {
            case 900:
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                this.getHighSpeedVideoFpsRangesFor = ((java.lang.Integer) obj).intValue();
                break;
            case 901:
                this.getHighResolutionOutputSizeshNQ4ISI = ((java.lang.Float) obj).floatValue();
                break;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR /* 902 */:
                this.getHighSpeedVideoFpsRangesFor = ((java.lang.Integer) obj).intValue();
                break;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING /* 903 */:
                this.getHighSpeedVideoSizes = (java.lang.String) obj;
                break;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                this.getHighSpeedVideoFpsRanges = ((java.lang.Boolean) obj).booleanValue();
                break;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                this.getHighResolutionOutputSizeshNQ4ISI = ((java.lang.Float) obj).floatValue();
                break;
        }
    }

    public int getInterpolatedColor(float[] fArr) {
        int pow = (int) (((float) java.lang.Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f);
        int i = (pow & (~(pow >> 31))) - 255;
        int pow2 = (int) (((float) java.lang.Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f);
        int i2 = (pow2 & (~(pow2 >> 31))) - 255;
        int pow3 = (int) (((float) java.lang.Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f);
        int i3 = (pow3 & (~(pow3 >> 31))) - 255;
        int i4 = (int) (fArr[3] * 255.0f);
        int i5 = (i4 & (~(i4 >> 31))) - 255;
        return (((i5 & (i5 >> 31)) + 255) << 24) | (((i & (i >> 31)) + 255) << 16) | (((i2 & (i2 >> 31)) + 255) << 8) | ((i3 & (i3 >> 31)) + 255);
    }

    public void setInterpolatedValue(androidx.constraintlayout.core.motion.MotionWidget motionWidget, float[] fArr) {
        int i = this.getOutputFormats;
        switch (i) {
            case 900:
                motionWidget.setCustomAttribute(this.Camera2StreamConfigurationMap, i, (int) fArr[0]);
                return;
            case 901:
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                motionWidget.setCustomAttribute(this.Camera2StreamConfigurationMap, i, fArr[0]);
                return;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR /* 902 */:
                int pow = (int) (((float) java.lang.Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f);
                int i2 = (pow & (~(pow >> 31))) - 255;
                int pow2 = (int) (((float) java.lang.Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f);
                int i3 = (pow2 & (~(pow2 >> 31))) - 255;
                int pow3 = (int) (((float) java.lang.Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f);
                int i4 = (pow3 & (~(pow3 >> 31))) - 255;
                int i5 = (int) (fArr[3] * 255.0f);
                int i6 = (i5 & (~(i5 >> 31))) - 255;
                motionWidget.setCustomAttribute(this.Camera2StreamConfigurationMap, this.getOutputFormats, (((i6 & (i6 >> 31)) + 255) << 24) | (((i2 & (i2 >> 31)) + 255) << 16) | (((i3 & (i3 >> 31)) + 255) << 8) | ((i4 & (i4 >> 31)) + 255));
                return;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING /* 903 */:
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to interpolate ");
                sb.append(this.Camera2StreamConfigurationMap);
                throw new java.lang.RuntimeException(sb.toString());
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                motionWidget.setCustomAttribute(this.Camera2StreamConfigurationMap, i, fArr[0] > 0.5f);
                return;
            default:
                return;
        }
    }

    public void applyToWidget(androidx.constraintlayout.core.motion.MotionWidget motionWidget) {
        int i = this.getOutputFormats;
        switch (i) {
            case 900:
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR /* 902 */:
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                motionWidget.setCustomAttribute(this.Camera2StreamConfigurationMap, i, this.getHighSpeedVideoFpsRangesFor);
                break;
            case 901:
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                motionWidget.setCustomAttribute(this.Camera2StreamConfigurationMap, i, this.getHighResolutionOutputSizeshNQ4ISI);
                break;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING /* 903 */:
                motionWidget.setCustomAttribute(this.Camera2StreamConfigurationMap, i, this.getHighSpeedVideoSizes);
                break;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                motionWidget.setCustomAttribute(this.Camera2StreamConfigurationMap, i, this.getHighSpeedVideoFpsRanges);
                break;
        }
    }

    public java.lang.String getName() {
        return this.Camera2StreamConfigurationMap;
    }
}

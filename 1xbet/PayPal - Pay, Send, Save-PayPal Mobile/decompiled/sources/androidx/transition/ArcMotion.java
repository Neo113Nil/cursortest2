package androidx.transition;

/* loaded from: classes7.dex */
public class ArcMotion extends androidx.transition.PathMotion {
    private static final float getHighSpeedVideoSizes = (float) java.lang.Math.tan(java.lang.Math.toRadians(35.0d));
    private float Camera2StreamConfigurationMap;
    private float getHighResolutionOutputSizeshNQ4ISI;
    private float getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;
    private float getInputSizeshNQ4ISI;
    private float getOutputFormats;

    public ArcMotion() {
        this.getHighSpeedVideoFpsRangesFor = 0.0f;
        this.getInputSizeshNQ4ISI = 0.0f;
        this.Camera2StreamConfigurationMap = 70.0f;
        this.getHighSpeedVideoFpsRanges = 0.0f;
        this.getOutputFormats = 0.0f;
        this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoSizes;
    }

    public ArcMotion(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getHighSpeedVideoFpsRangesFor = 0.0f;
        this.getInputSizeshNQ4ISI = 0.0f;
        this.Camera2StreamConfigurationMap = 70.0f;
        this.getHighSpeedVideoFpsRanges = 0.0f;
        this.getOutputFormats = 0.0f;
        this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoSizes;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.transition.Styleable.getHighResolutionOutputSizeshNQ4ISI);
        org.xmlpull.v1.XmlPullParser xmlPullParser = (org.xmlpull.v1.XmlPullParser) attributeSet;
        setMinimumVerticalAngle(androidx.core.content.res.TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        setMinimumHorizontalAngle(androidx.core.content.res.TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        setMaximumAngle(androidx.core.content.res.TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }

    public void setMinimumHorizontalAngle(float f) {
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(f);
    }

    public float getMinimumHorizontalAngle() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setMinimumVerticalAngle(float f) {
        this.getInputSizeshNQ4ISI = f;
        this.getOutputFormats = getHighSpeedVideoFpsRanges(f);
    }

    public float getMinimumVerticalAngle() {
        return this.getInputSizeshNQ4ISI;
    }

    public void setMaximumAngle(float f) {
        this.Camera2StreamConfigurationMap = f;
        this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRanges(f);
    }

    public float getMaximumAngle() {
        return this.Camera2StreamConfigurationMap;
    }

    private static float getHighSpeedVideoFpsRanges(float f) {
        if (f < 0.0f || f > 90.0f) {
            throw new java.lang.IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) java.lang.Math.tan(java.lang.Math.toRadians(f / 2.0f));
    }

    @Override // androidx.transition.PathMotion
    public android.graphics.Path getPath(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(f, f2);
        float f8 = f3 - f;
        float f9 = f4 - f2;
        float f10 = (f8 * f8) + (f9 * f9);
        float f11 = (f + f3) / 2.0f;
        float f12 = (f2 + f4) / 2.0f;
        float f13 = 0.25f * f10;
        boolean z = f2 > f4;
        if (java.lang.Math.abs(f8) < java.lang.Math.abs(f9)) {
            float abs = java.lang.Math.abs(f10 / (f9 * 2.0f));
            if (z) {
                f6 = abs + f4;
                f5 = f3;
            } else {
                f6 = abs + f2;
                f5 = f;
            }
            f7 = this.getOutputFormats;
        } else {
            float f14 = f10 / (f8 * 2.0f);
            if (z) {
                f6 = f2;
                f5 = f14 + f;
            } else {
                f5 = f3 - f14;
                f6 = f4;
            }
            f7 = this.getHighSpeedVideoFpsRanges;
        }
        float f15 = f13 * f7 * f7;
        float f16 = f11 - f5;
        float f17 = f12 - f6;
        float f18 = (f16 * f16) + (f17 * f17);
        float f19 = this.getHighResolutionOutputSizeshNQ4ISI;
        float f20 = f13 * f19 * f19;
        if (f18 >= f15) {
            f15 = f18 > f20 ? f20 : 0.0f;
        }
        if (f15 != 0.0f) {
            float sqrt = (float) java.lang.Math.sqrt(f15 / f18);
            f5 = ((f5 - f11) * sqrt) + f11;
            f6 = f12 + (sqrt * (f6 - f12));
        }
        path.cubicTo((f + f5) / 2.0f, (f2 + f6) / 2.0f, (f5 + f3) / 2.0f, (f6 + f4) / 2.0f, f3, f4);
        return path;
    }
}

package androidx.vectordrawable.graphics.drawable;

/* loaded from: classes7.dex */
public class PathInterpolatorCompat implements android.view.animation.Interpolator {
    public static final double EPSILON = 1.0E-5d;
    public static final int MAX_NUM_POINTS = 3000;
    private float[] Camera2StreamConfigurationMap;
    private float[] getHighResolutionOutputSizeshNQ4ISI;

    public PathInterpolatorCompat(android.content.Context context, android.util.AttributeSet attributeSet, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public PathInterpolatorCompat(android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        android.content.res.TypedArray obtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.AndroidResources.getInputSizeshNQ4ISI);
        getHighSpeedVideoFpsRangesFor(obtainAttributes, xmlPullParser);
        obtainAttributes.recycle();
    }

    private void getHighSpeedVideoFpsRangesFor(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        if (androidx.core.content.res.TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
            java.lang.String namedString = androidx.core.content.res.TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "pathData", 4);
            android.graphics.Path createPathFromPathData = androidx.core.graphics.PathParser.createPathFromPathData(namedString);
            if (createPathFromPathData == null) {
                throw new android.view.InflateException("The path is null, which is created from ".concat(java.lang.String.valueOf(namedString)));
            }
            getHighResolutionOutputSizeshNQ4ISI(createPathFromPathData);
            return;
        }
        if (!androidx.core.content.res.TypedArrayUtils.hasAttribute(xmlPullParser, "controlX1")) {
            throw new android.view.InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if (!androidx.core.content.res.TypedArrayUtils.hasAttribute(xmlPullParser, "controlY1")) {
            throw new android.view.InflateException("pathInterpolator requires the controlY1 attribute");
        }
        float namedFloat = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
        float namedFloat2 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
        boolean hasAttribute = androidx.core.content.res.TypedArrayUtils.hasAttribute(xmlPullParser, "controlX2");
        if (hasAttribute != androidx.core.content.res.TypedArrayUtils.hasAttribute(xmlPullParser, "controlY2")) {
            throw new android.view.InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        }
        if (!hasAttribute) {
            getHighResolutionOutputSizeshNQ4ISI(namedFloat, namedFloat2);
        } else {
            getHighSpeedVideoFpsRanges(namedFloat, namedFloat2, androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlX2", 2, 0.0f), androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(float f, float f2) {
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        getHighResolutionOutputSizeshNQ4ISI(path);
    }

    private void getHighSpeedVideoFpsRanges(float f, float f2, float f3, float f4) {
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        getHighResolutionOutputSizeshNQ4ISI(path);
    }

    private void getHighResolutionOutputSizeshNQ4ISI(android.graphics.Path path) {
        int i = 0;
        android.graphics.PathMeasure pathMeasure = new android.graphics.PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = java.lang.Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            throw new java.lang.IllegalArgumentException("The Path has a invalid length ".concat(java.lang.String.valueOf(length)));
        }
        this.Camera2StreamConfigurationMap = new float[min];
        this.getHighResolutionOutputSizeshNQ4ISI = new float[min];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < min; i2++) {
            pathMeasure.getPosTan((i2 * length) / (min - 1), fArr, null);
            this.Camera2StreamConfigurationMap[i2] = fArr[0];
            this.getHighResolutionOutputSizeshNQ4ISI[i2] = fArr[1];
        }
        if (java.lang.Math.abs(this.Camera2StreamConfigurationMap[0]) <= 1.0E-5d && java.lang.Math.abs(this.getHighResolutionOutputSizeshNQ4ISI[0]) <= 1.0E-5d) {
            int i3 = min - 1;
            if (java.lang.Math.abs(this.Camera2StreamConfigurationMap[i3] - 1.0f) <= 1.0E-5d && java.lang.Math.abs(this.getHighResolutionOutputSizeshNQ4ISI[i3] - 1.0f) <= 1.0E-5d) {
                float f = 0.0f;
                int i4 = 0;
                while (i < min) {
                    float[] fArr2 = this.Camera2StreamConfigurationMap;
                    float f2 = fArr2[i4];
                    if (f2 < f) {
                        throw new java.lang.IllegalArgumentException("The Path cannot loop back on itself, x :".concat(java.lang.String.valueOf(f2)));
                    }
                    fArr2[i] = f2;
                    i++;
                    i4++;
                    f = f2;
                }
                if (pathMeasure.nextContour()) {
                    throw new java.lang.IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.Camera2StreamConfigurationMap[0]);
        sb.append(",");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI[0]);
        sb.append(" end:");
        int i5 = min - 1;
        sb.append(this.Camera2StreamConfigurationMap[i5]);
        sb.append(",");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI[i5]);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.Camera2StreamConfigurationMap.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.Camera2StreamConfigurationMap[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.Camera2StreamConfigurationMap;
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        if (f4 == 0.0f) {
            return this.getHighResolutionOutputSizeshNQ4ISI[i];
        }
        float f5 = (f - f3) / f4;
        float[] fArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
        float f6 = fArr2[i];
        return f6 + (f5 * (fArr2[length] - f6));
    }
}

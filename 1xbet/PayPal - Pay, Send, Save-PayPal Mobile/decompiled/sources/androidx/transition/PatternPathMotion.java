package androidx.transition;

/* loaded from: classes7.dex */
public class PatternPathMotion extends androidx.transition.PathMotion {
    private final android.graphics.Path Camera2StreamConfigurationMap;
    private android.graphics.Path getHighSpeedVideoFpsRanges;
    private final android.graphics.Matrix getHighSpeedVideoFpsRangesFor;

    public PatternPathMotion() {
        android.graphics.Path path = new android.graphics.Path();
        this.Camera2StreamConfigurationMap = path;
        this.getHighSpeedVideoFpsRangesFor = new android.graphics.Matrix();
        path.lineTo(1.0f, 0.0f);
        this.getHighSpeedVideoFpsRanges = path;
    }

    public PatternPathMotion(android.content.Context context, android.util.AttributeSet attributeSet) {
        this.Camera2StreamConfigurationMap = new android.graphics.Path();
        this.getHighSpeedVideoFpsRangesFor = new android.graphics.Matrix();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.transition.Styleable.getHighSpeedVideoSizes);
        try {
            java.lang.String namedString = androidx.core.content.res.TypedArrayUtils.getNamedString(obtainStyledAttributes, (org.xmlpull.v1.XmlPullParser) attributeSet, "patternPathData", 0);
            if (namedString == null) {
                throw new java.lang.RuntimeException("pathData must be supplied for patternPathMotion");
            }
            setPatternPath(androidx.core.graphics.PathParser.createPathFromPathData(namedString));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public PatternPathMotion(android.graphics.Path path) {
        this.Camera2StreamConfigurationMap = new android.graphics.Path();
        this.getHighSpeedVideoFpsRangesFor = new android.graphics.Matrix();
        setPatternPath(path);
    }

    public android.graphics.Path getPatternPath() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setPatternPath(android.graphics.Path path) {
        android.graphics.PathMeasure pathMeasure = new android.graphics.PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new java.lang.IllegalArgumentException("pattern must not end at the starting point");
        }
        this.getHighSpeedVideoFpsRangesFor.setTranslate(-f3, -f4);
        float f5 = f2 - f4;
        float sqrt = 1.0f / ((float) java.lang.Math.sqrt((r2 * r2) + (f5 * f5)));
        this.getHighSpeedVideoFpsRangesFor.postScale(sqrt, sqrt);
        this.getHighSpeedVideoFpsRangesFor.postRotate((float) java.lang.Math.toDegrees(-java.lang.Math.atan2(f5, f - f3)));
        path.transform(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
        this.getHighSpeedVideoFpsRanges = path;
    }

    @Override // androidx.transition.PathMotion
    public android.graphics.Path getPath(float f, float f2, float f3, float f4) {
        float f5 = f4 - f2;
        float sqrt = (float) java.lang.Math.sqrt((r6 * r6) + (f5 * f5));
        double atan2 = java.lang.Math.atan2(f5, f3 - f);
        this.getHighSpeedVideoFpsRangesFor.setScale(sqrt, sqrt);
        this.getHighSpeedVideoFpsRangesFor.postRotate((float) java.lang.Math.toDegrees(atan2));
        this.getHighSpeedVideoFpsRangesFor.postTranslate(f, f2);
        android.graphics.Path path = new android.graphics.Path();
        this.Camera2StreamConfigurationMap.transform(this.getHighSpeedVideoFpsRangesFor, path);
        return path;
    }
}

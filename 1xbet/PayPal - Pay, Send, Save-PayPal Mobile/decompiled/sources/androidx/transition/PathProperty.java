package androidx.transition;

/* loaded from: classes7.dex */
class PathProperty<T> extends android.util.Property<T, java.lang.Float> {
    private float Camera2StreamConfigurationMap;
    private final float getHighResolutionOutputSizeshNQ4ISI;
    private final float[] getHighSpeedVideoFpsRanges;
    private final android.graphics.PathMeasure getHighSpeedVideoFpsRangesFor;
    private final android.graphics.PointF getHighSpeedVideoSizes;
    private final android.util.Property<T, android.graphics.PointF> getOutputFormats;

    @Override // android.util.Property
    public /* synthetic */ void set(java.lang.Object obj, java.lang.Float f) {
        java.lang.Float f2 = f;
        this.Camera2StreamConfigurationMap = f2.floatValue();
        this.getHighSpeedVideoFpsRangesFor.getPosTan(this.getHighResolutionOutputSizeshNQ4ISI * f2.floatValue(), this.getHighSpeedVideoFpsRanges, null);
        this.getHighSpeedVideoSizes.x = this.getHighSpeedVideoFpsRanges[0];
        this.getHighSpeedVideoSizes.y = this.getHighSpeedVideoFpsRanges[1];
        this.getOutputFormats.set(obj, this.getHighSpeedVideoSizes);
    }

    @Override // android.util.Property
    public /* synthetic */ java.lang.Float get(java.lang.Object obj) {
        return java.lang.Float.valueOf(this.Camera2StreamConfigurationMap);
    }
}

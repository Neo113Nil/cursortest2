package androidx.interpolator.view.animation;

/* loaded from: classes7.dex */
abstract class LookupTableInterpolator implements android.view.animation.Interpolator {
    private final float Camera2StreamConfigurationMap;
    private final float[] getHighSpeedVideoFpsRangesFor;

    protected LookupTableInterpolator(float[] fArr) {
        this.getHighSpeedVideoFpsRangesFor = fArr;
        this.Camera2StreamConfigurationMap = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.getHighSpeedVideoFpsRangesFor;
        int min = java.lang.Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.Camera2StreamConfigurationMap;
        float f3 = (f - (min * f2)) / f2;
        float[] fArr2 = this.getHighSpeedVideoFpsRangesFor;
        float f4 = fArr2[min];
        return f4 + (f3 * (fArr2[min + 1] - f4));
    }
}

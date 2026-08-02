package androidx.transition;

/* loaded from: classes3.dex */
class VelocityTracker1D {
    long[] Camera2StreamConfigurationMap;
    float[] getHighResolutionOutputSizeshNQ4ISI = new float[20];
    int getHighSpeedVideoFpsRangesFor = 0;

    VelocityTracker1D() {
        long[] jArr = new long[20];
        this.Camera2StreamConfigurationMap = jArr;
        java.util.Arrays.fill(jArr, Long.MIN_VALUE);
    }

    public final void getHighSpeedVideoFpsRangesFor(long j, float f) {
        int i = (this.getHighSpeedVideoFpsRangesFor + 1) % 20;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap[i] = j;
        this.getHighResolutionOutputSizeshNQ4ISI[i] = f;
    }

    static float getHighSpeedVideoSizes(float f) {
        return (float) (java.lang.Math.signum(f) * java.lang.Math.sqrt(java.lang.Math.abs(f) * 2.0f));
    }
}

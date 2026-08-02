package androidx.core.view;

/* loaded from: classes7.dex */
class VelocityTrackerFallback {
    final float[] getHighResolutionOutputSizeshNQ4ISI = new float[20];
    final long[] Camera2StreamConfigurationMap = new long[20];
    float getHighSpeedVideoFpsRangesFor = 0.0f;
    int getHighSpeedVideoFpsRanges = 0;
    int getHighSpeedVideoSizes = 0;

    VelocityTrackerFallback() {
    }

    static float Camera2StreamConfigurationMap(float f) {
        return (f < 0.0f ? -1.0f : 1.0f) * ((float) java.lang.Math.sqrt(java.lang.Math.abs(f) * 2.0f));
    }
}

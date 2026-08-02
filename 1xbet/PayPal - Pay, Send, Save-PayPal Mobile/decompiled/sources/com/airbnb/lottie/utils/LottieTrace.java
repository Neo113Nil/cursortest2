package com.airbnb.lottie.utils;

/* loaded from: classes7.dex */
public class LottieTrace {
    private final java.lang.String[] getHighSpeedVideoFpsRanges = new java.lang.String[5];
    private final long[] getHighResolutionOutputSizeshNQ4ISI = new long[5];
    private int getHighSpeedVideoSizes = 0;
    private int Camera2StreamConfigurationMap = 0;

    public void beginSection(java.lang.String str) {
        int i = this.getHighSpeedVideoSizes;
        if (i == 5) {
            this.Camera2StreamConfigurationMap++;
            return;
        }
        this.getHighSpeedVideoFpsRanges[i] = str;
        this.getHighResolutionOutputSizeshNQ4ISI[i] = java.lang.System.nanoTime();
        androidx.core.os.TraceCompat.beginSection(str);
        this.getHighSpeedVideoSizes++;
    }

    public float endSection(java.lang.String str) {
        int i = this.Camera2StreamConfigurationMap;
        if (i > 0) {
            this.Camera2StreamConfigurationMap = i - 1;
            return 0.0f;
        }
        int i2 = this.getHighSpeedVideoSizes - 1;
        this.getHighSpeedVideoSizes = i2;
        if (i2 == -1) {
            throw new java.lang.IllegalStateException("Can't end trace section. There are none.");
        }
        if (!str.equals(this.getHighSpeedVideoFpsRanges[i2])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unbalanced trace call ");
            sb.append(str);
            sb.append(". Expected ");
            sb.append(this.getHighSpeedVideoFpsRanges[this.getHighSpeedVideoSizes]);
            sb.append(".");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        androidx.core.os.TraceCompat.endSection();
        return (java.lang.System.nanoTime() - this.getHighResolutionOutputSizeshNQ4ISI[this.getHighSpeedVideoSizes]) / 1000000.0f;
    }
}

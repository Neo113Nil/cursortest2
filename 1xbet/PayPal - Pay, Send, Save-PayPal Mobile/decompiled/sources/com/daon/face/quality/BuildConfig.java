package com.daon.face.quality;

/* loaded from: classes7.dex */
public final class BuildConfig {
    public static final java.lang.String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final java.lang.String LIBRARY_PACKAGE_NAME = "com.daon.face.quality";
    public static int getHighResolutionOutputSizeshNQ4ISI;
    public static int getHighSpeedVideoFpsRanges;

    public static int getHighSpeedVideoSizes() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i % 5932376;
        getHighSpeedVideoFpsRanges = i + 1;
        if (i2 != 0) {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
        int maxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
        getHighResolutionOutputSizeshNQ4ISI = maxMemory;
        return maxMemory;
    }
}

package com.gemalto.mfs.mwsdk;

/* loaded from: classes3.dex */
public final class SDKEnv {
    private static char[] Camera2StreamConfigurationMap = null;
    public static final boolean DEBUG = false;
    public static final java.lang.String SDK_BUILD_NUMBER;
    public static final java.lang.String SDK_VERSION;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private static long getHighSpeedVideoSizes;
    private static final java.lang.String getHighSpeedVideoSizesFor;
    private static int getOutputMinFrameDuration;

    static {
        getHighSpeedVideoFpsRanges();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 27, android.view.View.resolveSize(0, 0), (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 40521), objArr);
        SDK_BUILD_NUMBER = ((java.lang.String) objArr[0]).intern();
        int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(11 - (edgeSlop >> 16), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 27, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr2);
        SDK_VERSION = ((java.lang.String) objArr2[0]).intern();
        getHighSpeedVideoSizesFor = com.gemalto.mfs.mwsdk.SDKEnv.class.getName();
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 13) % 128;
    }

    private SDKEnv() {
    }

    public static void displaySDKVersion() {
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 103) % 128;
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            jArr[rbVar.f2651] = (((char) (Camera2StreamConfigurationMap[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoSizes))) ^ c;
            rbVar.f2651++;
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 21) % 128;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 71) % 128;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static void getHighSpeedVideoFpsRanges() {
        Camera2StreamConfigurationMap = new char[]{632, 23917, 48151, 8059, 32344, 55784, 14546, 39860, 64193, 23165, 46348, 5142, 30521, 54787, 12782, 37065, 62381, 21141, 45684, 3422, 27706, 53016, 11780, 35299, 59591, 19372, 43650, 39991, 49970, 8714, 33124, 57435, 18336, 42625, 1464, 25738, 50228, 11026};
        getHighSpeedVideoSizes = -7910836448562199780L;
    }
}

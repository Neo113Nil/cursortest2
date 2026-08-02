package com.gemalto.mfs.mwsdk.sdkconfig;

/* loaded from: classes8.dex */
public class SecureLogConstants {
    private static int Camera2StreamConfigurationMap = 0;
    public static final java.lang.String DEFAULT_DIRECTORY;
    public static final java.lang.String DEFAULT_FILEID;
    public static final com.thalesgroup.gemalto.securelog.SecureLogLevel DEFAULT_LEVEL;
    public static final int DEFAULT_MAX_FILE_COUNT = 8;
    public static final int DEFAULT_MAX_FILE_SIZE = 1024;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private static long getHighSpeedVideoSizes;

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("Ẑ\uf879Ễ珆\ue671\uf1e1룀", android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, objArr);
        DEFAULT_FILEID = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("\uf67e孀\uf60a탟\uee91嵐윋\ud9bd\ue0b9ꥺ擢럣ꥬ끩馄枪礁䇛", android.view.ViewConfiguration.getFadingEdgeLength() >> 16, objArr2);
        DEFAULT_DIRECTORY = ((java.lang.String) objArr2[0]).intern();
        DEFAULT_LEVEL = com.thalesgroup.gemalto.securelog.SecureLogLevel.WARN;
        int i = getHighResolutionOutputSizeshNQ4ISI + 11;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 25) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoSizes ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 19) % 128;
        while (aVar.f2623 < m27721.length) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 41) % 128;
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighSpeedVideoSizes ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        java.lang.String str2 = new java.lang.String(m27721, 4, m27721.length - 4);
        int i2 = getHighSpeedVideoFpsRangesFor + 29;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoSizes = -7005008163359591484L;
    }
}

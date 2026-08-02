package com.gemalto.mfs.mwsdk.mobilegateway;

/* loaded from: classes8.dex */
public final class SDKEnv {
    private static int Camera2StreamConfigurationMap = 0;
    public static final boolean DEBUG = false;
    public static final java.lang.String SDK_VERSION;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static char getHighSpeedVideoFpsRanges = 0;
    private static char getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static char getHighSpeedVideoSizesFor = 0;
    private static int getInputSizeshNQ4ISI = 1;
    private static char getOutputMinFrameDuration;

    private SDKEnv() {
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getOutputMinFrameDuration = (char) 8368;
        getHighSpeedVideoFpsRangesFor = (char) 4701;
        getHighSpeedVideoSizesFor = (char) 11470;
        getHighSpeedVideoFpsRanges = (char) 31369;
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        int i = (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10;
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 37;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = "ㄕ픳콙짵\ue963滢뚠㵨毥ꆣ₌\uf7e4".toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 99) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighSpeedVideoFpsRanges ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L))) ^ (c3 + i3)) ^ ((c3 >>> 5) + ((char) (getHighSpeedVideoFpsRangesFor ^ 3155153533016530592L)))));
                i3 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        SDK_VERSION = new java.lang.String(cArr, 0, i).intern();
        int i5 = Camera2StreamConfigurationMap + 117;
        getInputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}

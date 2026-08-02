package com.gemalto.mfs.mwsdk.mobilegateway.enrollment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes8.dex */
public final class InstrumentDataType {
    public static final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType CARDDATA;
    private static int Camera2StreamConfigurationMap = 1;
    public static final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType ISSUER_PUSH_RECEIPT;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor;
    private static char getHighSpeedVideoSizes;
    private static char getHighSpeedVideoSizesFor;
    private static char getInputFormats;
    private static final /* synthetic */ com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType[] getOutputFormats;
    private static char getOutputMinFrameDuration;

    private InstrumentDataType(java.lang.String str, int i) {
    }

    public static com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType valueOf(java.lang.String str) {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 81) % 128;
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType instrumentDataType = (com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType) java.lang.Enum.valueOf(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType.class, str);
        int i = Camera2StreamConfigurationMap + 115;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return instrumentDataType;
        }
        throw null;
    }

    public static com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType[] values() {
        int i = getHighSpeedVideoFpsRanges + 121;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType[] instrumentDataTypeArr = (com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType[]) getOutputFormats.clone();
        int i2 = getHighSpeedVideoFpsRanges + 89;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return instrumentDataTypeArr;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType[] instrumentDataTypeArr;
        getHighSpeedVideoFpsRangesFor();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("麢\ude02鏊ﹽᡐ熍\ueba8㛍", 9 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType instrumentDataType = new com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType(((java.lang.String) objArr[0]).intern(), 0);
        CARDDATA = instrumentDataType;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("䨶५斩䀥雔瓶瑚䆱䨷\udae1ᦃ\ue3d3轃棕繽ㅒ쮄皵蓹\ue59f", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 19, objArr2);
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType instrumentDataType2 = new com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType(((java.lang.String) objArr2[0]).intern(), 1);
        ISSUER_PUSH_RECEIPT = instrumentDataType2;
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 105;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            instrumentDataTypeArr = new com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType[4];
            instrumentDataTypeArr[0] = instrumentDataType;
            instrumentDataTypeArr[0] = instrumentDataType2;
        } else {
            instrumentDataTypeArr = new com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType[]{instrumentDataType, instrumentDataType2};
        }
        int i3 = i + 95;
        int i4 = i3 % 128;
        Camera2StreamConfigurationMap = i4;
        if (i3 % 2 != 0) {
            getOutputFormats = instrumentDataTypeArr;
            int i5 = i4 + 7;
            getHighSpeedVideoFpsRanges = i5 % 128;
            if (i5 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        throw null;
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 75) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getInputFormats ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getHighSpeedVideoSizes ^ 3155153533016530592L))) ^ (c3 + i2)) ^ ((c3 >>> 5) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))));
                i2 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 23) % 128;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoSizes = (char) 58705;
        getHighSpeedVideoSizesFor = (char) 27843;
        getOutputMinFrameDuration = (char) 41456;
        getInputFormats = (char) 63511;
    }
}

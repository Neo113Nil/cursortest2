package com.gemalto.mfs.mwsdk.dcm;

/* loaded from: classes3.dex */
public final class DigitalizedCardManager {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;

    static {
        int i = getHighResolutionOutputSizeshNQ4ISI + 13;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private DigitalizedCardManager() {
    }

    public static com.gemalto.mfs.mwsdk.utils.async.AsyncToken<java.lang.String[]> getAllCards(com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler<java.lang.String[]> abstractAsyncHandler) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f837);
        sb.append(util.h.xy.al.ra.f339);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.utils.async.AsyncToken<java.lang.String[]> m26251 = util.h.xy.d.re.m26251(abstractAsyncHandler);
        int i = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = (((i | 39) << 1) - (i ^ 39)) % 128;
        return m26251;
    }

    public static com.gemalto.mfs.mwsdk.utils.async.AsyncToken<java.lang.Void> unsetDefaultCard(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler<java.lang.Void> abstractAsyncHandler) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f837);
        sb.append(util.h.xy.al.ra.f414);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.utils.async.AsyncToken<java.lang.Void> m26255 = util.h.xy.d.re.m26255(paymentType, abstractAsyncHandler);
        int i = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i ^ 117) + ((i & 117) << 1)) % 128;
        return m26255;
    }

    public static com.gemalto.mfs.mwsdk.utils.async.AsyncToken<java.lang.String> getDefault(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler<java.lang.String> abstractAsyncHandler) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f837);
        sb.append(util.h.xy.al.ra.f446);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.utils.async.AsyncToken<java.lang.String> m26250 = util.h.xy.d.re.m26250(paymentType, abstractAsyncHandler);
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 35) + (i | 35);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return m26250;
        }
        throw null;
    }

    public static com.gemalto.mfs.mwsdk.dcm.DigitalizedCard getDigitalizedCard(java.lang.String str) {
        java.lang.String str2 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f837);
        sb.append(util.h.xy.al.ra.f436);
        util.h.xy.am.ma.m25027(str2, sb.toString());
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCard m26254 = util.h.xy.d.re.m26254(str);
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 15) + ((i & 15) << 1)) % 128;
        return m26254;
    }

    public static java.lang.String getDigitalCardId(java.lang.String str) {
        java.lang.String str2 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f837);
        sb.append(util.h.xy.al.ra.f753);
        util.h.xy.am.ma.m25027(str2, sb.toString());
        java.lang.String m26256 = util.h.xy.d.re.m26256(str);
        int i = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i & 29) + (i | 29)) % 128;
        return m26256;
    }

    public static java.lang.String getTokenizedCardId(java.lang.String str) {
        java.lang.String str2 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f837);
        sb.append(util.h.xy.al.ra.f435);
        util.h.xy.am.ma.m25027(str2, sb.toString());
        java.lang.String m26252 = util.h.xy.d.re.m26252(str);
        int i = getHighResolutionOutputSizeshNQ4ISI + 93;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            return m26252;
        }
        throw new java.lang.ArithmeticException();
    }

    public static boolean isTokenSyncAllowed() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f837);
        sb.append(util.h.xy.al.ra.f450);
        util.h.xy.am.ma.m25027(str, sb.toString());
        boolean m25862 = util.h.xy.cc.ma.m25860().m25862();
        int i = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i ^ 45) + ((i & 45) << 1)) % 128;
        return m25862;
    }

    public static void invokeTokenSync(com.gemalto.mfs.mwsdk.dcm.TokenSyncListener tokenSyncListener) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f837);
        sb.append(util.h.xy.al.ra.f465);
        util.h.xy.am.ma.m25027(str, sb.toString());
        util.h.xy.cc.ma.m25860().m25869(tokenSyncListener);
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i = ~currentTimeMillis;
        int i2 = ~(((-2144051669) ^ i) | (i & (-2144051669)));
        int i3 = (-961178007) - (~(-(-(((i2 ^ 746627456) | (i2 & 746627456)) * (-1188)))));
        int i4 = ~(currentTimeMillis | 2144051668);
        int i5 = ~(((-1398753879) ^ i) | (i & (-1398753879)));
        int i6 = ((i4 ^ 746627456) | (i4 & 746627456) | i5) * 594;
        int i7 = ~((i & 2144051668) | (i ^ 2144051668));
        int i8 = (i7 ^ 1329666) | (i7 & 1329666);
        int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
        int i9 = (currentTimeMillis2 ^ 109755353) | (currentTimeMillis2 & 109755353);
        int i10 = ((~i9) | 1927119383) * (-668);
        int i11 = ~(currentTimeMillis2 | 1927119383);
        int i12 = ((((i10 | 698899433) << 1) - (i10 ^ 698899433)) - (~(-(-(((i11 ^ 109755353) | (i11 & 109755353)) * 1336))))) - 1;
        int i13 = (i9 | 1927119383) * 668;
        if ((((i3 | i6) << 1) - (i6 ^ i3)) + (((i8 & i5) | (i8 ^ i5)) * 594) <= ((i12 | i13) << 1) - (i13 ^ i12)) {
            throw null;
        }
    }

    public static long getTokenSyncSchedule() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f837);
        sb.append(util.h.xy.al.ra.f567);
        util.h.xy.am.ma.m25027(str, sb.toString());
        long m25863 = util.h.xy.cc.ma.m25860().m25863();
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return m25863;
    }
}

package com.gemalto.mfs.mwsdk.dcm;

/* loaded from: classes8.dex */
public class DigitalizedCardAdditionalPaymentData {
    public static final byte TAG_PAYMENT_OPTION = 79;
    public static final byte TAG_PAYMENT_OPTION_DATA_ENTRY = 97;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private final java.util.Map<java.lang.String, byte[]> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();

    public java.lang.String[] getPaths() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f580);
        sb.append(util.h.xy.al.ra.f438);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.util.Set<java.lang.String> keySet = this.getHighResolutionOutputSizeshNQ4ISI.keySet();
        java.lang.String[] strArr = (java.lang.String[]) keySet.toArray(new java.lang.String[keySet.size()]);
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 81) % 128;
        return strArr;
    }

    public byte[] getValue(java.lang.String str) {
        java.lang.String str2 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f580);
        sb.append(util.h.xy.al.ra.f474);
        util.h.xy.am.ma.m25027(str2, sb.toString());
        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI.get(str);
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 119) % 128;
        return bArr;
    }

    public void set(java.lang.String str, byte[] bArr) {
        java.lang.String str2 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f580);
        sb.append(31);
        util.h.xy.am.ma.m25027(str2, sb.toString());
        if (str != null) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 5) % 128;
            this.getHighResolutionOutputSizeshNQ4ISI.put(str, bArr);
            int i = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoSizes = ((i ^ 113) + ((i & 113) << 1)) % 128;
        }
        int i2 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = (((i2 | 67) << 1) - (i2 ^ 67)) % 128;
    }
}

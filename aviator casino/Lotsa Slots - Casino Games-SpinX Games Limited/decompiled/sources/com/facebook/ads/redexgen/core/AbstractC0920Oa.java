package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Oa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0920Oa {
    public static java.lang.String A00;
    public static java.lang.String A01;
    public static byte[] A02;
    public static java.lang.String[] A03 = {"Q2DZPMAW2yeQLbmmbfWH", "FQ0yrAaGYgr4mdqTvnLCAfi7gpajL", "1hQSRsoeRQ52OVueqemqWssHdomhD1Oc", "dcU3JA", "DGXXVImbyRvx6", "DMg70IVEwE3Kkzjo7dV3", "", "yfZMPiXEj5vSY"};
    public static final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.internal.adnotification.InternalAppAdCTAClickNotificationListener> A04;
    public static final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.InterfaceC0922Oc> A05;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 81);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{6, com.google.common.base.Ascii.VT, 17, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SO, 3, com.google.common.base.Ascii.ESC, kotlin.io.encoding.Base64.padSymbol, 4, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SI, 3, com.google.common.base.Ascii.SYN, 40, 41, 6, 55, 55, 6, 35, 4, 19, 6, 4, 43, 46, 36, 44, 69, 68, 99, 71, 90, 88, 79, 89, 89, 67, 69, 68, 8, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DLE, 36, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.RS, 9, 8, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK};
    }

    static {
        A01();
        A01 = A00(41, 11, 42);
        A00 = A00(0, 14, 51);
        A05 = new java.util.concurrent.atomic.AtomicReference<>();
        A04 = new java.util.concurrent.atomic.AtomicReference<>();
    }

    public static void A02(java.lang.String str, android.os.Bundle bundle) {
        java.util.ArrayList arrayList;
        A05.get();
        if (0 != 0) {
            bundle.getString(A01);
            bundle.getString(A00);
            throw new java.lang.NullPointerException(A00(29, 12, 123));
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.util.List<com.facebook.ads.AdSDKNotificationListener> listeners = com.facebook.ads.AdSDKNotificationManager.getNotificationListeners();
        synchronized (listeners) {
            arrayList = new java.util.ArrayList(com.facebook.ads.AdSDKNotificationManager.getNotificationListeners());
        }
        com.facebook.ads.redexgen.core.Y4.A00(new com.facebook.ads.redexgen.core.OZ(arrayList, str));
    }

    public static void A03(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (A04 != null) {
            com.facebook.ads.internal.adnotification.InternalAppAdCTAClickNotificationListener internalAppAdCTAClickNotificationListener = A04.get();
            java.lang.String[] strArr = A03;
            if (strArr[3].length() == strArr[6].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A03;
            strArr2[5] = "6F2nH21UZcfDLDfNhpfU";
            strArr2[4] = "szNZ34FR6m0ld";
            if (internalAppAdCTAClickNotificationListener != null) {
                A04.get();
                throw new java.lang.NullPointerException(A00(14, 15, 22));
            }
        }
    }
}

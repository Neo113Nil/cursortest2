package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class XD {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static final java.util.Map<java.lang.String, java.lang.String> A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 29);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-10, -14, -66, -11, -62, -11, -66, -76, -80, 124, -64, -61, -68, -68, -73, -68, -75, -83, -77, Byte.MIN_VALUE, -77, -84, -86, -83, -99};
    }

    static {
        A03();
        A01 = false;
        A00 = false;
        A03 = java.util.Collections.synchronizedMap(new java.util.HashMap());
    }

    public static synchronized java.lang.String A01(java.lang.String str) {
        synchronized (com.facebook.ads.redexgen.core.XD.class) {
            if (!A04()) {
                return null;
            }
            return java.lang.System.getProperty(A00(0, 7, 115) + str);
        }
    }

    public static java.util.Map<java.lang.String, java.lang.String> A02() {
        if (!A04()) {
            return java.util.Collections.emptyMap();
        }
        return A03;
    }

    public static synchronized boolean A04() {
        boolean z;
        synchronized (com.facebook.ads.redexgen.core.XD.class) {
            if (!A00) {
                A01 = A00(21, 4, 27).equals(java.lang.System.getProperty(A00(7, 14, 49)));
                A00 = true;
            }
            z = A01;
        }
        return z;
    }

    public static synchronized boolean A05(java.lang.String str) {
        boolean z;
        synchronized (com.facebook.ads.redexgen.core.XD.class) {
            z = !android.text.TextUtils.isEmpty(A01(str));
        }
        return z;
    }
}

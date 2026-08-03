package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.35, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass35 {
    public static boolean A00;
    public static java.lang.String A01;
    public static byte[] A02;
    public static java.lang.String[] A03 = {"xIpC", "lOutcBeb", "y6lcWPY0M5vgnnr832pPoLFOGrBEwJN", "eNaaWw40USiw6vcri4oIxijcBQWus6T9", androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST, "oHSXRLDm", "pbRsDBVUOoB3mv", "LvjaTOAqlauNDNt2xP6XrUFLIm1SBtnY"};
    public static final java.util.HashSet<java.lang.String> A04;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 95);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        if (A03[0].length() == 28) {
            throw new java.lang.RuntimeException();
        }
        A03[6] = "8";
        A02 = new byte[]{-61, -73, 49, 57, 57, 49, -8, 47, 66, 57, -8, 45, 57, 60, 47};
    }

    static {
        A02();
        A00 = true;
        A04 = new java.util.HashSet<>();
        A01 = A01(2, 13, 107);
    }

    public static synchronized java.lang.String A00() {
        java.lang.String str;
        synchronized (com.facebook.ads.redexgen.core.AnonymousClass35.class) {
            str = A01;
        }
        return str;
    }

    public static synchronized void A03(java.lang.String str) {
        synchronized (com.facebook.ads.redexgen.core.AnonymousClass35.class) {
            if (A04.add(str)) {
                A01 += A01(0, 2, 56) + str;
            }
        }
    }
}

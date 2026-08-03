package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.qW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2208qW {
    public static byte[] A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 86);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{49, 53, 46, 54, 51, 52, 116, 48, 44, 55, 116, 60, 47, 52, 57, 46, 51, 53, 52, 41, 116};
    }

    public final java.lang.String A02(com.facebook.ads.redexgen.core.AY ay) {
        java.lang.String obj = ay.getClass().getGenericInterfaces()[0].toString();
        java.lang.String A002 = A00(0, 21, 12);
        return obj.startsWith(A002) ? obj.substring(A002.length()) : obj;
    }

    public final java.lang.String A03(com.facebook.ads.redexgen.core.AbstractC03621o abstractC03621o) {
        return A02(abstractC03621o);
    }
}

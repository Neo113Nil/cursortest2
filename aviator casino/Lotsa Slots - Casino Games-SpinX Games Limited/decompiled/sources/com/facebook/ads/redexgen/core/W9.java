package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class W9 {
    public static boolean A00;
    public static byte[] A01;
    public static final java.util.Map<java.lang.String, java.lang.Long> A02;
    public static final java.util.Map<java.lang.String, java.lang.Long> A03;
    public static final java.util.Map<java.lang.String, java.lang.String> A04;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 88);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{96, 54, Byte.MAX_VALUE, 96, 54, Byte.MAX_VALUE, 96, 33, Byte.MAX_VALUE, 96, 33, Byte.MAX_VALUE, 96, 33, 82, 92, 4, 92, 0, 87, 85, 85, com.google.common.base.Ascii.VT, 45, 55, 48, 57, 126, 50, 63, 45, 42, 126, 63, 58, 126, 44, 59, 45, 46, 49, 48, 45, 59, 65, 67, 82, 106, 71, 85, 82, 116, 67, 85, 86, 73, 72, 85, 67};
    }

    static {
        A04();
        A03 = new java.util.concurrent.ConcurrentHashMap();
        A02 = new java.util.concurrent.ConcurrentHashMap();
        A04 = new java.util.concurrent.ConcurrentHashMap();
        A00 = false;
    }

    public static long A00(java.lang.String str, com.facebook.ads.redexgen.core.EnumC1111Vq enumC1111Vq) {
        if (A03.containsKey(str)) {
            return A03.get(str).longValue();
        }
        switch (enumC1111Vq) {
            case A0E:
            case A0F:
            case A0G:
            case A0D:
                return 15000L;
            default:
                return -1000L;
        }
    }

    public static java.lang.String A02(com.facebook.ads.redexgen.core.WA wa) {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A01(44, 15, 126), A01(22, 22, 6), A01(14, 8, 61));
        return A04.get(A03(wa));
    }

    public static java.lang.String A03(com.facebook.ads.redexgen.core.WA wa) {
        return java.lang.String.format(java.util.Locale.US, A01(0, 14, 29), wa.A09(), wa.A07(), java.lang.Integer.valueOf(wa.A08() == null ? 0 : wa.A08().A00()), java.lang.Integer.valueOf(wa.A08() == null ? 0 : wa.A08().A01()), java.lang.Integer.valueOf(wa.A04()));
    }

    public static void A05(long j, com.facebook.ads.redexgen.core.WA wa) {
        A03.put(A03(wa), java.lang.Long.valueOf(j));
    }

    public static void A06(com.facebook.ads.redexgen.core.WA wa) {
        A02.put(A03(wa), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public static void A07(java.lang.String str, com.facebook.ads.redexgen.core.WA wa) {
        A04.put(A03(wa), str);
    }

    public static boolean A08(com.facebook.ads.redexgen.core.WA wa) {
        if (A00) {
            return false;
        }
        java.lang.String A032 = A03(wa);
        if (A02.containsKey(A032)) {
            return java.lang.System.currentTimeMillis() - A02.get(A032).longValue() < A00(A032, wa.A07());
        }
        return false;
    }
}

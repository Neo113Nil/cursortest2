package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class VI {
    public static byte[] A02;
    public final com.facebook.ads.redexgen.core.VA A00;
    public final java.lang.String A01;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 45);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-15, -13, -32, -14, -9, -18, -29};
    }

    public VI(java.lang.String str, com.facebook.ads.redexgen.core.VA va) {
        this.A01 = str;
        this.A00 = va;
    }

    public static void A02(com.facebook.ads.redexgen.core.VH vh, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, com.facebook.ads.redexgen.core.VA va) {
        A03(vh.A03(), map, str, va);
    }

    public static void A03(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, com.facebook.ads.redexgen.core.VA va) {
        if (!com.facebook.ads.redexgen.core.VK.A0B(str2, str)) {
            return;
        }
        if (map == null) {
            map = new java.util.HashMap<>();
        }
        map.put(A00(0, 7, 81), str);
        va.ABF(str2, map);
    }

    public final void A04(com.facebook.ads.redexgen.core.VH vh, java.util.Map<java.lang.String, java.lang.String> data) {
        A05(vh.A03(), data);
    }

    public final void A05(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        A03(str, data, this.A01, this.A00);
    }
}

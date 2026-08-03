package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.8G, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C8G extends com.facebook.ads.redexgen.core.AbstractC1857kY<com.facebook.ads.redexgen.core.M5> {
    public static byte[] A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 115);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{83, 90, 81, 81};
    }

    public C8G(java.lang.String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1857kY
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C0868Lz A04(com.facebook.ads.redexgen.core.M5 m5) {
        return new com.facebook.ads.redexgen.core.C0868Lz(this, m5 == null ? A00(0, 4, 114) : m5.A03());
    }
}

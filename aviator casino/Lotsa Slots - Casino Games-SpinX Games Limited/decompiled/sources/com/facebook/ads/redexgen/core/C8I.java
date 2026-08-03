package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.8I, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C8I extends com.facebook.ads.redexgen.core.AbstractC1857kY<com.facebook.ads.redexgen.core.EnumC0860Lr> {
    public static byte[] A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 44);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-56, -49, -58, -58};
    }

    public C8I(java.lang.String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1857kY
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C0868Lz A04(com.facebook.ads.redexgen.core.EnumC0860Lr enumC0860Lr) {
        return new com.facebook.ads.redexgen.core.C0868Lz(this, enumC0860Lr == null ? A00(0, 4, 46) : A00(0, 0, 18) + enumC0860Lr.A03());
    }
}

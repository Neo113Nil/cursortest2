package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.7m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05127m extends com.facebook.ads.redexgen.core.AbstractC1801jd {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 49);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{52, 59, 46, 51, 44, 63};
    }

    public C05127m(java.util.List<com.facebook.ads.redexgen.core.NR> list) {
        super(list);
    }

    public static com.facebook.ads.redexgen.core.C05127m A00(org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        com.facebook.ads.redexgen.core.C05127m c05127m = new com.facebook.ads.redexgen.core.C05127m(com.facebook.ads.redexgen.core.AbstractC1801jd.A08(jSONObject, c1636gi, new com.facebook.ads.redexgen.core.C1793jR()));
        c05127m.A2I(jSONObject);
        c05127m.A1N(A01(0, 6, 107));
        return c05127m;
    }

    @Override // com.facebook.ads.redexgen.core.NQ
    public final int A0o() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.NQ
    public final int A0p() {
        return 0;
    }
}

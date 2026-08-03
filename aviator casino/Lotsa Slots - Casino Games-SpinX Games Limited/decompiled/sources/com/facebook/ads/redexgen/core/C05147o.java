package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.7o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05147o extends com.facebook.ads.redexgen.core.AbstractC1801jd {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 91);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{63, 60, 51, 51, 56, 47};
    }

    public C05147o(java.util.List<com.facebook.ads.redexgen.core.NR> list) {
        super(list);
    }

    public static com.facebook.ads.redexgen.core.C05147o A00(org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        com.facebook.ads.redexgen.core.C05147o c05147o = new com.facebook.ads.redexgen.core.C05147o(com.facebook.ads.redexgen.core.AbstractC1801jd.A08(jSONObject, c1636gi, new com.facebook.ads.redexgen.core.C1799jb()));
        c05147o.A2I(jSONObject);
        c05147o.A1N(A01(0, 6, 6));
        return c05147o;
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

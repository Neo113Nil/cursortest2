package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.7n, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05137n extends com.facebook.ads.redexgen.core.AbstractC1801jd implements java.io.Serializable {
    public static byte[] A00 = null;
    public static java.lang.String[] A01 = {"", "DwBpRdjhynFrlzLsBFrR", "QSeBoONoLaQYOKTzvkglRPiKzJDmlw8V", "7gQnCJoaPerIMpa6ilCeIjK7d9DzDLkx", "0G82UgBGsFbmab2LaOSe1R1N", "BET7yFkEMT8u6XlB2K", "", "QGCw11GNV2Lw2F7bA4MSMYlzIGOyIq"};
    public static final long serialVersionUID = 5751287062553772011L;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
            if (A01[5].length() != 18) {
                throw new java.lang.RuntimeException();
            }
            A01[4] = "xBe8M";
            copyOfRange[i4] = b;
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{86, 81, 75, 90, 77, 76, 75, 86, 75, 86, 94, 83};
    }

    static {
        A02();
    }

    public C05137n(java.util.List<com.facebook.ads.redexgen.core.NR> list) {
        super(list);
    }

    public static com.facebook.ads.redexgen.core.C05137n A00(org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        com.facebook.ads.redexgen.core.C05137n c05137n = new com.facebook.ads.redexgen.core.C05137n(com.facebook.ads.redexgen.core.AbstractC1801jd.A08(jSONObject, c1636gi, new com.facebook.ads.redexgen.core.C1794jS()));
        c05137n.A2I(jSONObject);
        c05137n.A1N(A01(0, 12, 9));
        return c05137n;
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

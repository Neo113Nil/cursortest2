package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Lz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0868Lz {
    public static byte[] A02;
    public final com.facebook.ads.redexgen.core.M0 A00;
    public final java.lang.String A01;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 50);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{55, 36, 63, 63, 52, kotlin.io.encoding.Base64.padSymbol, com.google.common.base.Ascii.SO};
    }

    public C0868Lz(com.facebook.ads.redexgen.core.M0 m0, java.lang.String str) {
        this.A00 = m0;
        this.A01 = str;
    }

    public final void A02(org.json.JSONObject jSONObject) {
        try {
            jSONObject.put(A00(0, 7, 99) + this.A00.getName(), this.A01);
        } catch (org.json.JSONException unused) {
        }
    }
}

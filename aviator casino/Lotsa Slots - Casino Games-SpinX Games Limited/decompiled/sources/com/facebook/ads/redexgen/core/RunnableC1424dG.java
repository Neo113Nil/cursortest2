package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1424dG implements java.lang.Runnable {
    public static byte[] A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1427dJ A00;
    public final /* synthetic */ java.lang.String A01;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 97);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{com.google.common.base.Ascii.CR, 33, 59, 34, 42, 110, 32, 33, 58, 110, 62, 47, 60, kotlin.io.encoding.Base64.padSymbol, 43, 110, kotlin.io.encoding.Base64.padSymbol, 43, 60, 56, 43, 60, 110, 35, 43, kotlin.io.encoding.Base64.padSymbol, kotlin.io.encoding.Base64.padSymbol, 47, 41, 43, 72, Byte.MAX_VALUE, Byte.MAX_VALUE, 98, Byte.MAX_VALUE, 45, 125, 108, Byte.MAX_VALUE, 126, 100, 99, 106, 45, 71, 94, 66, 67, 45, 100, 99, 45, 125, 98, 126, 121, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 104, 126, 126, 108, 106, 104, 45, 87, 67, 66, 94, 125, 83, 79, 53, 40, 36, 34, 49, com.google.common.base.Ascii.SI, 52, 49, 36, 49, com.google.common.base.Ascii.SO, 3, 10, com.google.common.base.Ascii.US, 58, 60};
    }

    public RunnableC1424dG(com.facebook.ads.redexgen.core.C1427dJ c1427dJ, java.lang.String str) {
        this.A00 = c1427dJ;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.facebook.ads.redexgen.core.C1407cz c1407cz;
        java.lang.String str;
        com.facebook.ads.redexgen.core.C1407cz c1407cz2;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.A01);
                str = this.A00.A05;
                if (str.equals(jSONObject.optString(A00(64, 7, 87)))) {
                    this.A00.A0C(com.facebook.ads.redexgen.core.EnumC1425dH.A00(jSONObject.optString(A00(81, 4, 27))), jSONObject.optString(A00(71, 10, 49), A00(85, 2, 32)));
                } else {
                    c1407cz2 = this.A00.A04;
                    c1407cz2.A04(com.facebook.ads.redexgen.core.AbstractC1048Td.A11, A00(0, 30, 47));
                }
            } catch (org.json.JSONException e) {
                c1407cz = this.A00.A04;
                c1407cz.A04(com.facebook.ads.redexgen.core.AbstractC1048Td.A15, A00(30, 34, 108) + e.getMessage());
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}

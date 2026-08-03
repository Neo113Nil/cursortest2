package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ti, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1053Ti {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 112);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{com.google.common.base.Ascii.ETB, 52, 60, 60, 50, 53, 60, 123, com.google.common.base.Ascii.NAK, 62, 47, 44, 52, 41, 48, 123, com.google.common.base.Ascii.RS, 45, 62, 53, 47, 34, 51, 52, 39, 50, 47, 41, 40, 96, 119, 119, 106, 119, 32, 60, 60, 56, com.google.common.base.Ascii.ETB, 59, 60, 41, 60, kotlin.io.encoding.Base64.padSymbol, 59, com.google.common.base.Ascii.ETB, 43, 39, 44, 45, 98, 105, 120, 123, 99, 126, 103, 41, 56, 32, 53, 54, 56, kotlin.io.encoding.Base64.padSymbol, 6, 42, 48, 35, 60, 55, 48, 37, 54, 48, com.google.common.base.Ascii.ESC, 48, 45, 41, 33, 40, 45, 49, 50, 60, 57, 2, 46, 52, 39, 56};
    }

    public static org.json.JSONObject A01(com.facebook.ads.redexgen.core.T8 t8, long j, long j2, long j3, long j4, int i, java.lang.Exception exc) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            try {
                jSONObject.put(A00(69, 10, 52), j);
                try {
                    jSONObject.put(A00(21, 8, 54), j2 / 1000.0d);
                    try {
                        jSONObject.put(A00(57, 12, 41), j3);
                        try {
                            jSONObject.put(A00(79, 11, 45), j4);
                        } catch (org.json.JSONException e) {
                            e = e;
                        }
                    } catch (org.json.JSONException e2) {
                        e = e2;
                    }
                } catch (org.json.JSONException e3) {
                    e = e3;
                }
            } catch (org.json.JSONException e4) {
                e = e4;
            }
        } catch (org.json.JSONException e5) {
            e = e5;
        }
        try {
            jSONObject.put(A00(34, 16, 56), i);
            if (exc != null) {
                jSONObject.put(A00(29, 5, 117), exc.getMessage());
            }
        } catch (org.json.JSONException e6) {
            e = e6;
            t8.A08().A4I(e);
            return jSONObject;
        }
        return jSONObject;
    }

    public static void A03(com.facebook.ads.redexgen.core.T8 t8, long j, long j2, long j3, long j4, int i, java.lang.Exception exc) {
        com.facebook.ads.redexgen.core.C1049Te c1049Te = new com.facebook.ads.redexgen.core.C1049Te(A00(0, 21, 43));
        c1049Te.A05(1);
        c1049Te.A07(A01(t8, j, j2, j3, j4, i, exc));
        t8.A08().ACA(A00(50, 7, 124), com.facebook.ads.redexgen.core.AbstractC1048Td.A20, c1049Te);
    }
}

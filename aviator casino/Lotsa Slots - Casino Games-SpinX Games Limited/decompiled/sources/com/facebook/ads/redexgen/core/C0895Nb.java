package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Nb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0895Nb implements java.io.Serializable {
    public static byte[] A03 = null;
    public static final long serialVersionUID = 6010729991575063286L;
    public final int A00;
    public final int A01;
    public final java.lang.String A02;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 117);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.EM, 37, 89, 86, 80, 2, -12, -17, -1, -13};
    }

    public C0895Nb(java.lang.String str, int i, int i2) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    public static com.facebook.ads.redexgen.core.C0895Nb A00(org.json.JSONObject jSONObject) {
        java.lang.String optString;
        if (jSONObject == null || (optString = jSONObject.optString(A01(6, 3, 111))) == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.C0895Nb(optString, jSONObject.optInt(A01(9, 5, 22), 0), jSONObject.optInt(A01(0, 6, 60), 0));
    }

    public final int A03() {
        return this.A00;
    }

    public final int A04() {
        return this.A01;
    }

    public final java.lang.String A05() {
        return this.A02;
    }
}

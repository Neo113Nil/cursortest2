package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Nc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0896Nc implements java.io.Serializable {
    public static byte[] A04 = null;
    public static final long serialVersionUID = -4041915335826065133L;
    public final java.lang.String A00;
    public final java.lang.String A01;
    public final java.lang.String A02;
    public final java.lang.String A03;

    static {
        A03();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 78);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{-3, 4, -5, -5, -21, -24, -30};
    }

    public C0896Nc(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, java.lang.String str3) {
        this.A03 = A01(str);
        this.A02 = A01(str2);
        this.A00 = A01(str3);
        this.A01 = A02(jSONObject);
    }

    public static java.lang.String A01(java.lang.String str) {
        if (A00(0, 4, 65).equalsIgnoreCase(str)) {
            return A00(0, 0, 123);
        }
        return str;
    }

    private java.lang.String A02(org.json.JSONObject jSONObject) {
        java.lang.String A00 = A00(0, 0, 123);
        if (jSONObject == null) {
            return A00;
        }
        return jSONObject.optString(A00(4, 3, 40), A00);
    }

    public final java.lang.String A04() {
        return this.A02;
    }

    public final java.lang.String A05() {
        return this.A03;
    }

    public final boolean A06() {
        return !android.text.TextUtils.isEmpty(this.A01);
    }
}

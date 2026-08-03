package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Nj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0903Nj implements java.io.Serializable {
    public static byte[] A04 = null;
    public static final long serialVersionUID = 351643298236575729L;
    public final java.lang.String A00;
    public final java.lang.String A01;
    public final java.lang.String A02;
    public final java.lang.String A03;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 63);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-124, -2, -26, -8, -11, -11, -24, -15, -26, -4, 0, -36, -46, -42, -62, -49, -43, -54, -43, -38, -34};
    }

    public C0903Nj(com.facebook.ads.redexgen.core.C0902Ni c0902Ni) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        str = c0902Ni.A02;
        this.A02 = str;
        str2 = c0902Ni.A03;
        this.A03 = str2;
        str3 = c0902Ni.A00;
        this.A00 = str3;
        str4 = c0902Ni.A01;
        this.A01 = str4;
    }

    public static java.lang.String A01(java.lang.String str, java.lang.String str2, int i) {
        java.lang.String replace = str.replace(A00(1, 10, 68), str2);
        java.lang.String A00 = A00(0, 0, 39);
        if (i > 0) {
            java.lang.StringBuilder append = new java.lang.StringBuilder().append(i);
            java.lang.String updatedString = A00(0, 1, 37);
            A00 = append.append(updatedString).toString();
        }
        java.lang.String updatedString2 = A00(11, 10, 34);
        return replace.replace(updatedString2, A00);
    }

    public final java.lang.String A03() {
        return this.A00;
    }

    public final java.lang.String A04() {
        return this.A01;
    }

    public final java.lang.String A05() {
        return this.A02;
    }

    public final java.lang.String A06(java.lang.String str, int i) {
        return A01(this.A03, str, i);
    }
}

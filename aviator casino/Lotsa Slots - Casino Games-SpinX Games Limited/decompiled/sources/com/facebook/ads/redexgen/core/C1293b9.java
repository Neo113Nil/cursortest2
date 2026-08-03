package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.b9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1293b9 {
    public static byte[] A01;
    public final java.util.Map<java.lang.String, java.lang.String> A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 55);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-25, -6, -10, -12, -29, -31, -22, -21, -16, -10, -11, -37, -42, -36, -54, -49};
    }

    public C1293b9() {
        this.A00 = new java.util.HashMap();
    }

    public C1293b9(java.util.Map<java.lang.String, java.lang.String> extraData) {
        this.A00 = extraData;
    }

    public final com.facebook.ads.redexgen.core.C1293b9 A02(com.facebook.ads.redexgen.core.Y2 y2) {
        if (y2 != null) {
            this.A00.put(A00(11, 5, 48), com.facebook.ads.redexgen.core.AbstractC1147Xd.A01(y2.A04()));
        }
        return this;
    }

    public final com.facebook.ads.redexgen.core.C1293b9 A03(com.facebook.ads.redexgen.core.C1581fp c1581fp) {
        if (c1581fp != null) {
            this.A00.putAll(c1581fp.A0S());
        }
        return this;
    }

    public final com.facebook.ads.redexgen.core.C1293b9 A04(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.A00.put(A00(0, 11, 75), str);
        }
        return this;
    }

    public final java.util.Map<java.lang.String, java.lang.String> A05() {
        return this.A00;
    }
}

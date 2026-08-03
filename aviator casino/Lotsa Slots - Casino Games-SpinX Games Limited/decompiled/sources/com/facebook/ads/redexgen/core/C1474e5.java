package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.e5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1474e5 {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final com.facebook.ads.redexgen.core.NR A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 112);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{89, 91, 72, 94, 89, 84, 78, 7, 5, com.google.common.base.Ascii.SYN, 0, com.google.common.base.Ascii.CR, 10, 0};
    }

    public C1474e5(int i, int i2, com.facebook.ads.redexgen.core.NR nr) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = nr;
    }

    public final int A02() {
        return this.A01;
    }

    public final com.facebook.ads.redexgen.core.NR A03() {
        return this.A02;
    }

    public final java.util.Map<java.lang.String, java.lang.String> A04() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.StringBuilder append = new java.lang.StringBuilder().append(this.A01);
        java.lang.String A00 = A00(0, 0, 41);
        hashMap.put(A00(7, 7, 20), append.append(A00).toString());
        hashMap.put(A00(0, 7, 74), this.A00 + A00);
        return hashMap;
    }
}

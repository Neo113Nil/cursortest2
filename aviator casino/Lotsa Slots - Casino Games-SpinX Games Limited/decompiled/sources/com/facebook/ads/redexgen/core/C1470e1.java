package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.e1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1470e1 implements com.facebook.ads.redexgen.core.InterfaceC1585ft {
    public static byte[] A01;
    public final com.facebook.ads.redexgen.core.C1632ge A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 74);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{82, 39, 76, 72, 39, 90, 101, 101, 102, 39, 88, 101, Byte.MAX_VALUE, 126, 99, 100, 109, 39, 94, 101, 97, 111, 100, com.google.common.base.Ascii.FF, 10, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.VT, 84, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CR};
    }

    public C1470e1(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        this.A00 = c1632ge;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1585ft
    public final java.util.Map<java.lang.String, java.lang.String> A6g(boolean z) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!com.facebook.ads.redexgen.core.SZ.A00().A04()) {
            hashMap.put(A00(0, 23, 64), com.facebook.ads.redexgen.core.UG.A00().A01(this.A00, true).A04());
        }
        hashMap.put(A00(23, 10, 51), com.facebook.ads.redexgen.core.UJ.A06(new com.facebook.ads.redexgen.core.C1059To(this.A00), this.A00, z));
        return hashMap;
    }
}

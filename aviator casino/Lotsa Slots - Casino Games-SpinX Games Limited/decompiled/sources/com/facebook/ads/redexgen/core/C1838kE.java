package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1838kE extends com.facebook.ads.redexgen.core.AbstractC0888Mt {
    public static byte[] A01;
    public static final java.lang.String A02;
    public final android.net.Uri A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 98);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{com.google.common.base.Ascii.DLE, 43, 51, 54, 47, 46, -22, 62, 57, -22, 57, 58, 47, 56, -22, 54, 51, 56, 53, -22, 63, 60, 54, 4, -22};
    }

    static {
        A01();
        A02 = com.facebook.ads.redexgen.core.C1838kE.class.getSimpleName();
    }

    public C1838kE(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, java.lang.String str, android.net.Uri uri) {
        super(c1636gi, va, str);
        this.A00 = uri;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0888Mt
    public final com.facebook.ads.redexgen.core.EnumC0885Mq A0G(java.lang.String str) {
        try {
            com.facebook.ads.redexgen.core.X6.A0E(new com.facebook.ads.redexgen.core.X6(), this.A01, this.A00, this.A03);
        } catch (java.lang.Exception unused) {
            java.lang.String str2 = A00(0, 25, 104) + this.A00.toString();
        }
        return com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
    }
}

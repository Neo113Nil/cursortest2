package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.85, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass85 extends com.facebook.ads.redexgen.core.AbstractC1840kH {
    public static byte[] A02;
    public java.util.Map<java.lang.String, java.lang.String> A00;
    public final android.net.Uri A01;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{36, 33, 38, 35};
    }

    public AnonymousClass85(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, java.lang.String str, android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> mExtraData) {
        super(c1636gi, va, str, null, true, true);
        this.A01 = uri;
        this.A00 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1840kH
    public final com.facebook.ads.redexgen.core.EnumC0885Mq A0H() {
        A0J(this.A00, null);
        return com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
    }

    public final android.net.Uri A0M() {
        java.lang.String uri = this.A01.getQueryParameter(A00(0, 4, 5));
        if (uri == null) {
            uri = A00(0, 0, 121);
        }
        return com.facebook.ads.redexgen.core.XB.A00(uri);
    }
}

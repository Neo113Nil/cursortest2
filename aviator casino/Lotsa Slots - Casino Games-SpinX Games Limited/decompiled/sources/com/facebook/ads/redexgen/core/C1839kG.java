package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1839kG extends com.facebook.ads.redexgen.core.AbstractC0888Mt {
    public static byte[] A02;
    public static final java.lang.String A03;
    public final android.net.Uri A00;
    public final java.util.Map<java.lang.String, java.lang.String> A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 87);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{52, 54, 45, 51, 54, 45, 56, kotlin.io.encoding.Base64.padSymbol, -32, -27, -36, -47};
    }

    static {
        A01();
        A03 = com.facebook.ads.redexgen.core.C1839kG.class.getSimpleName();
    }

    public C1839kG(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, java.lang.String str, android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> mExtraData) {
        super(c1636gi, va, str);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0888Mt
    public final com.facebook.ads.redexgen.core.EnumC0885Mq A0G(java.lang.String str) {
        com.facebook.ads.redexgen.core.VC vc = com.facebook.ads.redexgen.core.VC.A05;
        java.lang.String queryParameter = this.A00.getQueryParameter(A00(0, 8, 109));
        if (!android.text.TextUtils.isEmpty(queryParameter)) {
            try {
                vc = com.facebook.ads.redexgen.core.VC.values()[java.lang.Integer.valueOf(queryParameter).intValue()];
            } catch (java.lang.Exception unused) {
            }
        }
        this.A02.ABq(this.A03, this.A01, this.A00.getQueryParameter(A00(8, 4, 21)), vc);
        return com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
    }
}

package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1700hl implements com.facebook.ads.redexgen.core.QM {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C7M A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + androidx.media3.common.PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-10, 0, -9};
    }

    public C1700hl(com.facebook.ads.redexgen.core.C7M c7m) {
        this.A00 = c7m;
    }

    private final void A02(com.facebook.ads.redexgen.core.QN qn) {
        throw new java.lang.NullPointerException(A00(0, 3, 40));
    }

    @Override // com.facebook.ads.redexgen.core.QM
    public final void ADg(com.facebook.ads.redexgen.core.QN qn) {
        A02(qn);
        throw null;
    }
}

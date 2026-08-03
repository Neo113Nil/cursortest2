package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class GU extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C4V A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 30);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{102, 89, 84, 85, 95, com.google.common.base.Ascii.DLE, 71, 81, 67, com.google.common.base.Ascii.DLE, 94, 85, 70, 85, 66, com.google.common.base.Ascii.DLE, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 66, 85, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 81, 66, 85, 84};
    }

    public GU(com.facebook.ads.redexgen.core.C4V c4v) {
        this.A00 = c4v;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        boolean z;
        z = this.A00.A0E;
        if (!z) {
            this.A00.A0Q(A00(0, 24, 46));
        }
    }
}

package com.facebook.ads.redexgen.core;

@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("non-final in Fb vs final in Exo since TigonDataSource uses FailoverStreamDryException that extends this exception")
/* loaded from: assets/audience_network/classes2.dex */
public class AK extends com.facebook.ads.redexgen.core.C2122p5 {
    public static byte[] A04;
    public final int A00;
    public final java.lang.String A01;
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> A02;
    public final byte[] A03;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 101);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{com.google.common.base.Ascii.DLE, 39, 49, 50, 45, 44, 49, 39, 98, 33, 45, 38, 39, 120, 98};
    }

    public AK(int i, java.lang.String str, java.io.IOException iOException, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, com.facebook.ads.redexgen.core.C04565i c04565i, byte[] bArr) {
        super(A01(0, 15, 39) + i, iOException, c04565i, 2004, 1);
        this.A00 = i;
        this.A01 = str;
        this.A02 = map;
        this.A03 = bArr;
    }
}

package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.oq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2107oq implements com.facebook.ads.redexgen.core.G2, com.facebook.ads.redexgen.core.GR, com.facebook.ads.redexgen.core.InterfaceC05027c {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"s2pX1dUuV9yMGkOQMpNHWy9uhNawnk9Y", "g94kU4b", "NzGTwCFJguijRpsE4vnu2khyHl2vzHxI", "mcwg2", "3H7kdFWigyqN00XNlLPoaD6s2Om", "arwBjFb", "zwCIEju4cqvLZ8D4reT2LOc82uEYQHt6", "4voNbHG588W1rePZ0VIdJriIAfqG9T"};
    public com.facebook.ads.redexgen.core.G2 A00;
    public com.facebook.ads.redexgen.core.G2 A01;
    public com.facebook.ads.redexgen.core.GR A02;
    public com.facebook.ads.redexgen.core.GR A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 1);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{2, 0, 17, 51, com.google.common.base.Ascii.FF, 1, 0, 10, 35, com.google.common.base.Ascii.ETB, 4, 8, 0, 40, 0, 17, 4, 1, 4, 17, 4, 41, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SYN, 17, 0, com.google.common.base.Ascii.VT, 0, com.google.common.base.Ascii.ETB};
    }

    static {
        A01();
    }

    public C2107oq() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05027c
    public final void A9i(int i, java.lang.Object obj) {
        switch (i) {
            case 7:
                this.A01 = (com.facebook.ads.redexgen.core.G2) obj;
                return;
            case 8:
                this.A02 = (com.facebook.ads.redexgen.core.GR) obj;
                return;
            case 10000:
                if (0 == 0) {
                    this.A00 = null;
                    this.A03 = null;
                    return;
                }
                throw new java.lang.NullPointerException(A00(0, 29, 100));
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.core.G2
    public final void AGS(long j, long j2, com.facebook.ads.redexgen.core.C2196qI c2196qI, android.media.MediaFormat mediaFormat) {
        if (this.A00 != null) {
            com.facebook.ads.redexgen.core.G2 g2 = this.A00;
            if (A05[0].charAt(20) != 'W') {
                throw new java.lang.RuntimeException();
            }
            A05[4] = "rCzQpO90p93bI0FQ7tWj9IORt31";
            g2.AGS(j, j2, c2196qI, mediaFormat);
        }
        if (this.A01 != null) {
            this.A01.AGS(j, j2, c2196qI, mediaFormat);
        }
    }
}

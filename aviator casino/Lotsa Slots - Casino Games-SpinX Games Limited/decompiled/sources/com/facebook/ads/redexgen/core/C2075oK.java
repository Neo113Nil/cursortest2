package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.oK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2075oK implements com.facebook.ads.redexgen.core.InterfaceC05448v {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"", "W3zKx7uimPBnuqB79eRuk71Lq6Q9Tdtq", "pdw5IcOEDsyx", "PznYxCtiabQ1XXQUVp9BfEAYIGk6ZsUE", "E1k4hPJKfb0MvebzJOZYusmHHBWvORO7", "bmueFxdYYt0nqn8p", "GRfRtgnBgmJZB0Qq", "VS7ML1wDeymmTLeKFRcttz7uEm3bVRGQ"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.AnonymousClass12 A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A02;
            if (strArr[5].length() != strArr[6].length()) {
                throw new java.lang.RuntimeException();
            }
            A02[4] = "fuFs1gweK6T0kCx4bj1F2DHsk5QuVwMS";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 8);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{47, com.google.common.base.Ascii.ESC, 10, 7, 1, 78, com.google.common.base.Ascii.GS, 7, 0, 5, 78, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.FS, 1, com.google.common.base.Ascii.FS, 32, 8, 9, 4, com.google.common.base.Ascii.FF, 46, 2, 9, 8, com.google.common.base.Ascii.SO, 44, com.google.common.base.Ascii.CAN, 9, 4, 2, 63, 8, 3, 9, 8, com.google.common.base.Ascii.US, 8, com.google.common.base.Ascii.US, 55, 54, com.google.common.base.Ascii.VT, 52, kotlin.io.encoding.Base64.padSymbol, kotlin.io.encoding.Base64.padSymbol, 40, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.EM, 32, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.DC2, 2, 7};
    }

    static {
        A01();
    }

    public C2075oK(com.facebook.ads.redexgen.core.AnonymousClass12 anonymousClass12) {
        this.A00 = anonymousClass12;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05448v
    public final void AD6(java.lang.Exception exc) {
        com.facebook.ads.redexgen.core.C05398o c05398o;
        com.facebook.ads.redexgen.core.AbstractC04284g.A08(A00(16, 23, 101), A00(0, 16, 102), exc);
        c05398o = this.A00.A0F;
        c05398o.A0D(exc);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05448v
    public final void AD7(com.facebook.ads.redexgen.core.C05418r c05418r) {
        com.facebook.ads.redexgen.core.C05398o c05398o;
        c05398o = this.A00.A0F;
        c05398o.A0B(c05418r);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05448v
    public final void AD8(com.facebook.ads.redexgen.core.C05418r c05418r) {
        com.facebook.ads.redexgen.core.C05398o c05398o;
        c05398o = this.A00.A0F;
        c05398o.A0C(c05418r);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05448v
    public final void AF2() {
        com.facebook.ads.redexgen.core.AnonymousClass12.A05(this.A00);
        if (0 != 0) {
            com.facebook.ads.redexgen.core.AnonymousClass12.A05(this.A00);
            throw new java.lang.NullPointerException(A00(46, 8, 127));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05448v
    public final void AF3() {
        com.facebook.ads.redexgen.core.AnonymousClass12.A05(this.A00);
        if (0 != 0) {
            com.facebook.ads.redexgen.core.AnonymousClass12.A05(this.A00);
            throw new java.lang.NullPointerException(A00(39, 7, 80));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05448v
    public final void AFN(long j) {
        com.facebook.ads.redexgen.core.C05398o c05398o;
        c05398o = this.A00.A0F;
        c05398o.A03(j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05448v
    public final void AFO() {
        this.A00.A26();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05448v
    public final void AFy(boolean z) {
        com.facebook.ads.redexgen.core.C05398o c05398o;
        c05398o = this.A00.A0F;
        c05398o.A0I(z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05448v
    public final void AGJ(int i, long j, long j2) {
        com.facebook.ads.redexgen.core.C05398o c05398o;
        c05398o = this.A00.A0F;
        c05398o.A01(i, j, j2);
    }
}

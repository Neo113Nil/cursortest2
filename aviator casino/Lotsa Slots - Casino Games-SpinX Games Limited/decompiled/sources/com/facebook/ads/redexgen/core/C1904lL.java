package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1904lL implements com.facebook.ads.redexgen.core.InterfaceC0838Kv {
    public static byte[] A0B;
    public static java.lang.String[] A0C = {"Sri33Nkjg2q1UfSTa8c1c4poMbcRpRLi", "09hX7cFAjusi8bmxYUkedKuhTIWBBFyj", "9Nq5ciBjH0E2wAdqO8kDicSSF4ASqfED", "QsWxT4gaPPGppGCvyiz5txfiFuAY8zGx", "IfMd", "WTVPPiGNk6qIrjWgxgkH9oFnGfUzUO7U", "kZSjpU6etDs1IBDvrqsQrqQjBcHBIo8z", "H6v3RmW3GvMpIK1G5kWvIHPLiCmsEM1C"};
    public static final float[] A0D;
    public long A00;
    public long A01;
    public com.facebook.ads.redexgen.core.InterfaceC0743Hd A02;
    public com.facebook.ads.redexgen.core.C0842Kz A03;
    public java.lang.String A04;
    public boolean A05;
    public final com.facebook.ads.redexgen.core.C04434v A06;
    public final com.facebook.ads.redexgen.core.C0841Ky A07;
    public final com.facebook.ads.redexgen.core.L4 A08;
    public final com.facebook.ads.redexgen.core.LJ A09;
    public final boolean[] A0A;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 69);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A0B = new byte[]{66, 56, 60, 57, 88, 111, 107, 110, 111, 120, com.google.common.base.Ascii.DC2, 53, 45, 58, 55, 50, 63, 123, 58, 40, 43, 62, 56, 47, 123, 41, 58, 47, 50, 52, 125, 90, 66, 85, 88, 93, 80, com.google.common.base.Ascii.DC4, 66, 91, 68, 107, 93, 90, 87, 70, 81, 89, 81, 90, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 107, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 93, 89, 81, 107, 70, 81, 71, 91, 88, 65, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 93, 91, 90, 77, 118, 112, 121, 118, 124, 116, 125, 124, 56, 110, 113, 124, 125, 119, 56, 119, 122, 114, 125, 123, 108, 56, 116, 121, 97, 125, 106, 56, 107, 112, 121, 104, 125, 45, 50, 63, 62, 52, 116, 54, 43, 111, 45, 118, 62, 40};
    }

    static {
        A02();
        A0D = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    }

    public C1904lL() {
        this(null);
    }

    public C1904lL(com.facebook.ads.redexgen.core.LJ lj) {
        this.A09 = lj;
        this.A0A = new boolean[4];
        this.A07 = new com.facebook.ads.redexgen.core.C0841Ky(128);
        this.A00 = -9223372036854775807L;
        if (lj != null) {
            this.A08 = new com.facebook.ads.redexgen.core.L4(178, 128);
            this.A06 = new com.facebook.ads.redexgen.core.C04434v();
        } else {
            this.A08 = null;
            this.A06 = null;
        }
    }

    public static com.facebook.ads.redexgen.core.C2196qI A00(com.facebook.ads.redexgen.core.C0841Ky c0841Ky, int i, java.lang.String str) {
        float f;
        byte[] copyOf = java.util.Arrays.copyOf(c0841Ky.A02, c0841Ky.A00);
        com.facebook.ads.redexgen.core.C04424u c04424u = new com.facebook.ads.redexgen.core.C04424u(copyOf);
        c04424u.A0A(i);
        c04424u.A0A(4);
        c04424u.A07();
        c04424u.A09(8);
        if (c04424u.A0H()) {
            c04424u.A09(4);
            c04424u.A09(3);
        }
        int A04 = c04424u.A04(4);
        java.lang.String A01 = A01(10, 20, 30);
        java.lang.String A012 = A01(0, 10, 79);
        if (A04 == 15) {
            int A042 = c04424u.A04(8);
            java.lang.String[] strArr = A0C;
            if (strArr[1].charAt(10) != strArr[6].charAt(10)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0C;
            strArr2[1] = "pNVnHJusVCsmPjFYzkWaaBxpUvIALZFH";
            strArr2[6] = "5W5bueKBkmsFSlOt61KpehVGJe26nslO";
            int A043 = c04424u.A04(8);
            if (A043 == 0) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A07(A012, A01);
                f = 1.0f;
            } else {
                f = A042 / A043;
            }
        } else if (A04 < A0D.length) {
            f = A0D[A04];
        } else {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A012, A01);
            f = 1.0f;
        }
        if (c04424u.A0H()) {
            c04424u.A09(2);
            c04424u.A09(1);
            boolean A0H = c04424u.A0H();
            if (A0C[2].charAt(24) != 'F') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr3 = A0C;
            strArr3[1] = "a7iwuG0S7TsvBO2g0yc87XIFTOWCV0GN";
            strArr3[6] = "G4F0gcHQBssTN40k2zdU8kwKQEhYA5ZF";
            if (A0H) {
                c04424u.A09(15);
                c04424u.A07();
                c04424u.A09(15);
                c04424u.A07();
                c04424u.A09(15);
                c04424u.A07();
                c04424u.A09(3);
                c04424u.A09(11);
                c04424u.A07();
                c04424u.A09(15);
                c04424u.A07();
            }
        }
        if (c04424u.A04(2) != 0) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A012, A01(67, 34, 93));
        }
        c04424u.A07();
        int A044 = c04424u.A04(16);
        c04424u.A07();
        if (c04424u.A0H()) {
            if (A044 == 0) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A07(A012, A01(30, 37, 113));
            } else {
                int i2 = 0;
                for (int i3 = A044 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                c04424u.A09(i2);
            }
        }
        c04424u.A07();
        int videoObjectLayerWidth = c04424u.A04(13);
        c04424u.A07();
        int A045 = c04424u.A04(13);
        c04424u.A07();
        c04424u.A07();
        return new com.facebook.ads.redexgen.core.C03872p().A0y(str).A11(A01(101, 13, 30)).A0r(videoObjectLayerWidth).A0f(A045).A0Y(f).A12(java.util.Collections.singletonList(copyOf)).A14();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x009e, code lost:
    
        throw new java.lang.RuntimeException();
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0838Kv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A5A(com.facebook.ads.redexgen.core.C04434v c04434v) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A02(this.A03);
        com.facebook.ads.redexgen.core.AbstractC04203y.A02(this.A02);
        int A09 = c04434v.A09();
        int A0A = c04434v.A0A();
        byte[] A0l = c04434v.A0l();
        long j = this.A01;
        int offset = c04434v.A07();
        this.A01 = j + offset;
        com.facebook.ads.redexgen.core.InterfaceC0743Hd interfaceC0743Hd = this.A02;
        int offset2 = c04434v.A07();
        interfaceC0743Hd.AIr(c04434v, offset2);
        while (true) {
            int lengthToStartCode = com.facebook.ads.redexgen.core.HS.A04(A0l, A09, A0A, this.A0A);
            if (lengthToStartCode == A0A) {
                if (!this.A05) {
                    com.facebook.ads.redexgen.core.C0841Ky c0841Ky = this.A07;
                    int limit = A0C[7].charAt(0);
                    if (limit != 51) {
                        A0C[4] = "80MY";
                        c0841Ky.A03(A0l, A09, A0A);
                    }
                }
                this.A03.A03(A0l, A09, A0A);
                if (this.A08 != null) {
                    this.A08.A02(A0l, A09, A0A);
                    return;
                }
                return;
            }
            int offset3 = lengthToStartCode + 3;
            int startCodeValue = c04434v.A0l()[offset3] & 255;
            int i = lengthToStartCode - A09;
            if (!this.A05) {
                if (i > 0) {
                    this.A07.A03(A0l, A09, lengthToStartCode);
                }
                int limit2 = i < 0 ? -i : 0;
                if (this.A07.A04(startCodeValue, limit2)) {
                    com.facebook.ads.redexgen.core.InterfaceC0743Hd interfaceC0743Hd2 = this.A02;
                    com.facebook.ads.redexgen.core.C0841Ky c0841Ky2 = this.A07;
                    java.lang.String[] strArr = A0C;
                    java.lang.String str = strArr[1];
                    java.lang.String str2 = strArr[6];
                    int limit3 = str.charAt(10);
                    int offset4 = str2.charAt(10);
                    if (limit3 != offset4) {
                        break;
                    }
                    java.lang.String[] strArr2 = A0C;
                    strArr2[1] = "jCMcU5kX01siyiD9Xw2jZ38LNAQD3esf";
                    strArr2[6] = "NTL8nbB45bsjwa3rfW6th5wXRcuqzfwM";
                    int limit4 = this.A07.A01;
                    interfaceC0743Hd2.A6e(A00(c0841Ky2, limit4, (java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A04)));
                    this.A05 = true;
                }
            }
            this.A03.A03(A0l, A09, lengthToStartCode);
            if (this.A08 != null) {
                int i2 = 0;
                if (i > 0) {
                    com.facebook.ads.redexgen.core.L4 l4 = this.A08;
                    int limit5 = A0C[4].length();
                    if (limit5 != 4) {
                        break;
                    }
                    A0C[2] = "pGtfbhZ8gA4Y3zya71EFVTXhFPoVLYfI";
                    l4.A02(A0l, A09, lengthToStartCode);
                } else {
                    i2 = -i;
                }
                if (this.A08.A04(i2)) {
                    byte[] bArr = this.A08.A01;
                    int offset5 = this.A08.A00;
                    ((com.facebook.ads.redexgen.core.C04434v) com.facebook.ads.redexgen.core.C5C.A0f(this.A06)).A0j(this.A08.A01, com.facebook.ads.redexgen.core.HS.A02(bArr, offset5));
                    ((com.facebook.ads.redexgen.core.LJ) com.facebook.ads.redexgen.core.C5C.A0f(this.A09)).A02(this.A00, this.A06);
                }
                if (startCodeValue == 178) {
                    int offset6 = lengthToStartCode + 2;
                    if (c04434v.A0l()[offset6] == 1) {
                        this.A08.A01(startCodeValue);
                    }
                }
            }
            int i3 = A0A - lengthToStartCode;
            this.A03.A02(this.A01 - i3, i3, this.A05);
            this.A03.A01(startCodeValue, this.A00);
            A09 = lengthToStartCode + 3;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0838Kv
    public final void A5c(com.facebook.ads.redexgen.core.HA ha, com.facebook.ads.redexgen.core.LG lg) {
        lg.A05();
        this.A04 = lg.A04();
        this.A02 = ha.AKS(lg.A03(), 2);
        this.A03 = new com.facebook.ads.redexgen.core.C0842Kz(this.A02);
        if (this.A09 != null) {
            this.A09.A03(ha, lg);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0838Kv
    public final void AGp() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0838Kv
    public final void AGq(long j, int i) {
        if (j != -9223372036854775807L) {
            this.A00 = j;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0838Kv
    public final void AJ5() {
        com.facebook.ads.redexgen.core.HS.A0H(this.A0A);
        this.A07.A02();
        if (this.A03 != null) {
            this.A03.A00();
        }
        if (this.A08 != null) {
            this.A08.A00();
        }
        if (A0C[4].length() != 4) {
            throw new java.lang.RuntimeException();
        }
        A0C[2] = "KHBnxT5PT6gCJIZCrRbgphkbFp7MF5Ts";
        this.A01 = 0L;
        this.A00 = -9223372036854775807L;
    }
}

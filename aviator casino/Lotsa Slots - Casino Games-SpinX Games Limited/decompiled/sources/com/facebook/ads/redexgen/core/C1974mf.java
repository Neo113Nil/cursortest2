package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.mf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1974mf extends com.facebook.ads.redexgen.core.AbstractC0760Hu {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"lB4dHhjpy3abWZhQq1wH5EBAR", "ZuPpDuw", "FbPLOQU", "", "U7rP1AfGJoZ3goBfYNThYKT2IP", "TmhX3SF8er8D0wPa9QxyxNkwR", "Alay8YZwXgHUhbAemAZh94CmGu", "aeAWKwor"};
    public static final int[] A05;
    public int A00;
    public boolean A01;
    public boolean A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 29);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        java.lang.String[] strArr = A04;
        if (strArr[6].length() != strArr[4].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A04;
        strArr2[6] = "jv2UBL9GlnQlzNWQDlysyfO0pU";
        strArr2[4] = "rlPmYvRzpLfwn1KnxKXQ0LEEGB";
        A03 = new byte[]{-37, com.google.common.base.Ascii.SI, -2, 3, 9, -70, 0, 9, com.google.common.base.Ascii.FF, 7, -5, com.google.common.base.Ascii.SO, -70, 8, 9, com.google.common.base.Ascii.SO, -70, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SI, 10, 10, 9, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SO, -1, -2, -44, -70, -33, -13, -30, -25, -19, -83, -27, -75, -81, -81, -85, -33, -22, -33, -11, -88, -68, -85, -80, -74, 118, -82, 126, 120, 120, 116, -76, -77, -88, -66, 126, -110, -127, -122, -116, 76, -118, -115, 81, 126, 74, -119, 126, -111, -118, -72, -52, -69, -64, -58, -122, -60, -57, -68, -66};
    }

    static {
        A01();
        A05 = new int[]{5512, 11025, 22050, 44100};
    }

    public C1974mf(com.facebook.ads.redexgen.core.InterfaceC0743Hd interfaceC0743Hd) {
        super(interfaceC0743Hd);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0760Hu
    public final boolean A0B(com.facebook.ads.redexgen.core.C04434v c04434v) throws com.facebook.ads.redexgen.core.C1970mb {
        if (!this.A02) {
            int A0I = c04434v.A0I();
            int header = A0I >> 4;
            this.A00 = header & 15;
            if (this.A00 == 2) {
                int header2 = A0I >> 2;
                super.A00.A6e(new com.facebook.ads.redexgen.core.C03872p().A11(A00(73, 10, 58)).A0b(1).A0m(A05[header2 & 3]).A14());
                this.A01 = true;
            } else if (this.A00 == 7 || this.A00 == 8) {
                super.A00.A6e(new com.facebook.ads.redexgen.core.C03872p().A11(this.A00 == 7 ? A00(28, 15, 97) : A00(43, 15, 42)).A0b(1).A0m(8000).A14());
                this.A01 = true;
            } else if (this.A00 != 10) {
                throw new com.facebook.ads.redexgen.core.C1970mb(A00(0, 28, 125) + this.A00);
            }
            this.A02 = true;
        } else {
            c04434v.A0g(1);
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0760Hu
    public final boolean A0C(com.facebook.ads.redexgen.core.C04434v c04434v, long j) throws com.facebook.ads.redexgen.core.C3K {
        if (this.A00 == 2) {
            int A07 = c04434v.A07();
            super.A00.AIr(c04434v, A07);
            super.A00.AIu(j, 1, A07, 0, null);
            return true;
        }
        int A0I = c04434v.A0I();
        if (A0I == 0 && !this.A01) {
            int packetType = c04434v.A07();
            byte[] bArr = new byte[packetType];
            int packetType2 = bArr.length;
            c04434v.A0k(bArr, 0, packetType2);
            com.facebook.ads.redexgen.core.C0726Gm A032 = com.facebook.ads.redexgen.core.AbstractC0727Gn.A03(bArr);
            com.facebook.ads.redexgen.core.C03872p A0w = new com.facebook.ads.redexgen.core.C03872p().A11(A00(58, 15, 0)).A0w(A032.A02);
            int packetType3 = A032.A00;
            com.facebook.ads.redexgen.core.C03872p A0b = A0w.A0b(packetType3);
            int packetType4 = A032.A01;
            super.A00.A6e(A0b.A0m(packetType4).A12(java.util.Collections.singletonList(bArr)).A14());
            this.A01 = true;
            return false;
        }
        if (this.A00 == 10 && A0I != 1) {
            return false;
        }
        int A072 = c04434v.A07();
        super.A00.AIr(c04434v, A072);
        super.A00.AIu(j, 1, A072, 0, null);
        return true;
    }
}

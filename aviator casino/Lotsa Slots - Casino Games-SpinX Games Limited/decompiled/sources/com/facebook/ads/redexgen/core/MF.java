package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class MF implements com.facebook.ads.redexgen.core.InterfaceC1201Zf {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"8F1ylXiPLmOJlxHuSB0OfTD8ERnub0Jc", "S6BOYeNFrgFu99vNdASrFyo", "dJPilyeR7SZ6Rr21hdX", "myhsKKLHgmC4nogMMn1nxIO", "jSXY2xjzyKT8sDO", "m4o2VQ2UIP9pfbMg6FrqdCCZlyPN5tpn", "ArrKoNW9WxnAbKv8I1vfh8MoVmXkp7wv", "MU6Xe0UyfSgNRnTq3TqZG"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC1199Zd A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{1, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SI, 76, 4, 3, 1, 7, 0, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.CR, 9, 76, 3, 6, 17, 76, 3, 6, com.google.common.base.Ascii.DLE, 7, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 5, 76, 36, 43, 44, 43, 49, 42, kotlin.io.encoding.Base64.padSymbol, 35, 38, kotlin.io.encoding.Base64.padSymbol, 48, 39, 50, 45, 48, 54, 43, 44, 37, kotlin.io.encoding.Base64.padSymbol, 36, 46, 45, 53};
    }

    static {
        A01();
    }

    public MF(com.facebook.ads.redexgen.core.AbstractC1199Zd abstractC1199Zd) {
        this.A00 = abstractC1199Zd;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1201Zf
    public final void A53() {
        com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh;
        com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh2;
        interfaceC1177Yh = this.A00.A09;
        if (interfaceC1177Yh == null) {
            return;
        }
        interfaceC1177Yh2 = this.A00.A09;
        interfaceC1177Yh2.A4j(A00(0, 53, 115));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1201Zf
    public final void A54() {
        com.facebook.ads.redexgen.core.InterfaceC1178Yi interfaceC1178Yi;
        com.facebook.ads.redexgen.core.InterfaceC1198Zc interfaceC1198Zc;
        com.facebook.ads.redexgen.core.InterfaceC1198Zc interfaceC1198Zc2;
        com.facebook.ads.redexgen.core.InterfaceC1178Yi interfaceC1178Yi2;
        this.A00.A0P();
        interfaceC1178Yi = this.A00.A0A;
        if (interfaceC1178Yi != null) {
            interfaceC1178Yi2 = this.A00.A0A;
            interfaceC1178Yi2.AFi(true);
        }
        interfaceC1198Zc = this.A00.A05;
        if (interfaceC1198Zc != null) {
            interfaceC1198Zc2 = this.A00.A05;
            interfaceC1198Zc2.ACr();
        }
        this.A00.A0E();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1201Zf
    public final void A9c() {
        com.facebook.ads.redexgen.core.C0930Ok c0930Ok;
        com.facebook.ads.redexgen.core.C0930Ok c0930Ok2;
        com.facebook.ads.redexgen.core.C0930Ok c0930Ok3;
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        c0930Ok = this.A00.A04;
        if (c0930Ok == null) {
            A54();
            if (A02[0].charAt(15) == 'S') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A02;
            strArr[1] = "E4Sw3glaT0j7tztglKcmJ4X";
            strArr[3] = "i6sG1P4DTWmVPFfNkRQLKmp";
            return;
        }
        com.facebook.ads.redexgen.core.AbstractC1199Zd.A03(this.A00);
        c0930Ok2 = this.A00.A04;
        if (c0930Ok2.A02() != null) {
            com.facebook.ads.redexgen.core.AbstractC1199Zd abstractC1199Zd = this.A00;
            c0930Ok3 = this.A00.A04;
            abstractC1199Zd.A0H(c0930Ok3.A02());
        } else {
            this.A00.A0F();
        }
        c1636gi = this.A00.A07;
        if (com.facebook.ads.redexgen.core.C1086Up.A2Z(c1636gi)) {
            this.A00.performAccessibilityAction(128, null);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1201Zf
    public final void AAp() {
        com.facebook.ads.redexgen.core.C0926Og c0926Og;
        com.facebook.ads.redexgen.core.C0929Oj c0929Oj;
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.C0926Og c0926Og2;
        java.lang.String str;
        c0926Og = this.A00.A06;
        if (!android.text.TextUtils.isEmpty(c0926Og.A0I())) {
            com.facebook.ads.redexgen.core.X6 x6 = new com.facebook.ads.redexgen.core.X6();
            c1636gi = this.A00.A07;
            c0926Og2 = this.A00.A06;
            android.net.Uri A00 = com.facebook.ads.redexgen.core.XB.A00(c0926Og2.A0I());
            str = this.A00.A0B;
            com.facebook.ads.redexgen.core.X6.A0O(x6, c1636gi, A00, str);
        }
        c0929Oj = this.A00.A03;
        c0929Oj.A04();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1201Zf
    public final void AAq() {
        com.facebook.ads.redexgen.core.InterfaceC1178Yi interfaceC1178Yi;
        com.facebook.ads.redexgen.core.C0926Og c0926Og;
        com.facebook.ads.redexgen.core.C0929Oj c0929Oj;
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.C0926Og c0926Og2;
        java.lang.String str;
        com.facebook.ads.redexgen.core.InterfaceC1178Yi interfaceC1178Yi2;
        this.A00.A0P();
        interfaceC1178Yi = this.A00.A0A;
        if (interfaceC1178Yi != null) {
            interfaceC1178Yi2 = this.A00.A0A;
            interfaceC1178Yi2.AFi(true);
        }
        c0926Og = this.A00.A06;
        if (!android.text.TextUtils.isEmpty(c0926Og.A0C())) {
            com.facebook.ads.redexgen.core.X6 x6 = new com.facebook.ads.redexgen.core.X6();
            c1636gi = this.A00.A07;
            c0926Og2 = this.A00.A06;
            android.net.Uri A00 = com.facebook.ads.redexgen.core.XB.A00(c0926Og2.A0C());
            str = this.A00.A0B;
            com.facebook.ads.redexgen.core.X6.A0O(x6, c1636gi, A00, str);
        }
        c0929Oj = this.A00.A03;
        c0929Oj.A06();
        this.A00.A0E();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1201Zf
    public final void AEr(com.facebook.ads.redexgen.core.EnumC0928Oi enumC0928Oi) {
        com.facebook.ads.redexgen.core.EnumC0928Oi enumC0928Oi2;
        com.facebook.ads.redexgen.core.C0926Og c0926Og;
        com.facebook.ads.redexgen.core.C0930Ok A0B;
        com.facebook.ads.redexgen.core.C0926Og c0926Og2;
        com.facebook.ads.redexgen.core.C0926Og c0926Og3;
        com.facebook.ads.redexgen.core.AbstractC1199Zd.A02(this.A00);
        this.A00.A02 = enumC0928Oi;
        enumC0928Oi2 = this.A00.A02;
        if (enumC0928Oi2 != com.facebook.ads.redexgen.core.EnumC0928Oi.A04) {
            com.facebook.ads.redexgen.core.AbstractC1199Zd abstractC1199Zd = this.A00;
            if (A02[0].charAt(15) != 'S') {
                java.lang.String[] strArr = A02;
                strArr[6] = "aVWWA7RlXQ4WxwD1lKH3adLgfY6YTeho";
                strArr[5] = "uW2I9G42iXHj1OU85KkNtz4HKFKkrOfh";
                c0926Og2 = abstractC1199Zd.A06;
                A0B = c0926Og2.A0B();
            } else {
                c0926Og = abstractC1199Zd.A06;
                A0B = c0926Og.A0B();
            }
        } else {
            c0926Og3 = this.A00.A06;
            A0B = c0926Og3.A0A();
        }
        com.facebook.ads.redexgen.core.AbstractC1199Zd abstractC1199Zd2 = this.A00;
        java.lang.String[] strArr2 = A02;
        if (strArr2[6].charAt(11) == strArr2[5].charAt(11)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr3 = A02;
        strArr3[1] = "uGU0gkKbqe2rkd9hIKZj6BU";
        strArr3[3] = "Cw3GzUJKwEhWx9AKZcDfceI";
        abstractC1199Zd2.A0H(A0B);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1201Zf
    public final void AF4(com.facebook.ads.redexgen.core.C0930Ok c0930Ok) {
        com.facebook.ads.redexgen.core.C0929Oj c0929Oj;
        com.facebook.ads.redexgen.core.AbstractC1199Zd.A02(this.A00);
        c0929Oj = this.A00.A03;
        c0929Oj.A07(c0930Ok.A01());
        if (!c0930Ok.A05().isEmpty()) {
            com.facebook.ads.redexgen.core.AbstractC1199Zd abstractC1199Zd = this.A00;
            java.lang.String[] strArr = A02;
            if (strArr[2].length() == strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[6] = "wullz3k0Ma2cYDBinBI95xBWIfHYuzlI";
            strArr2[5] = "wkJ6jlNGXVBBqnzofRVuEUhlZdNAnE5y";
            abstractC1199Zd.A0H(c0930Ok);
            return;
        }
        this.A00.A0G(c0930Ok);
    }
}

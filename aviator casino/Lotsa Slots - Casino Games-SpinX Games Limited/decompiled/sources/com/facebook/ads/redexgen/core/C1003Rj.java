package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Rj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1003Rj {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"MJXAzUwyiLvMzZCrP1QJf8uMs9b", "sHuNTXgsBnW3HGqskl7KH5QkikNWpABj", "q8u9vKEVkpk3dMxroB1EFzM5kwDKfJOq", "eyGwnlQBA4bCraIcft5FxvFgN7f8TC5N", "FmmRYKiwjJl3dX1FB2pV6kIWJpsNLC6h", "flBitaWG3wpDSjkerYNuTkR3r5UhRox3", "xkUQOvOGGj42jMnQjSDdoLzQvdQiYUba", "XqZ9VL6XKZ5Y"};
    public final android.content.Intent A00;
    public final com.facebook.ads.redexgen.core.C0998Re A01;
    public final com.facebook.ads.redexgen.core.C1636gi A02;
    public final com.facebook.ads.redexgen.core.VA A03;

    public static java.lang.String A0K(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 59);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0L() {
        A04 = new byte[]{99, Byte.MAX_VALUE, 4, 1, 58, 1, 4, 17, 4, 58, 7, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.VT, 1, 9, 0, 43, 41, 36, 36, 45, 58, com.google.common.base.Ascii.FS, 49, 56, 45, 119, 124, 117, 125, 122, 113, 112, 85, 112, 80, 117, 96, 117, 86, 97, 122, 112, 120, 113, 35, 44, 41, 49, 32, 55, 32, 33, com.google.common.base.Ascii.SUB, 38, 41, 44, 38, 46, com.google.common.base.Ascii.SUB, 33, 32, 41, 36, 60, com.google.common.base.Ascii.SUB, 40, 54, 123, 97, 77, 100, 32, 77, 118, 119, 97, 123, 117, 124, 116, 123, 110, 115, 108, Byte.MAX_VALUE, 91, 126, 94, 123, 110, 123, 88, 111, 116, 126, 118, Byte.MAX_VALUE, 32, 55, 37, 51, 32, 54, 55, 54, 4, 59, 54, 55, kotlin.io.encoding.Base64.padSymbol, 19, 54, com.google.common.base.Ascii.SYN, 51, 38, 51, com.google.common.base.Ascii.DLE, 39, 60, 54, 62, 55, com.google.common.base.Ascii.SYN, 9, 4, 5, com.google.common.base.Ascii.SI, 63, com.google.common.base.Ascii.DC4, 9, com.google.common.base.Ascii.CR, 5, 63, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.FF, 9, com.google.common.base.Ascii.SO, 7, 63, 9, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.DC4, 5, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SYN, 1, com.google.common.base.Ascii.FF};
    }

    static {
        A0L();
    }

    public C1003Rj(com.facebook.ads.redexgen.core.C0998Re c0998Re, android.content.Intent intent, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this.A01 = c0998Re;
        this.A00 = intent;
        this.A03 = va;
        this.A02 = c1636gi;
    }

    private com.facebook.ads.redexgen.core.AbstractC1801jd A00() {
        int i = android.os.Build.VERSION.SDK_INT;
        java.lang.String A0K = A0K(80, 18, 33);
        if (i >= 33) {
            return (com.facebook.ads.redexgen.core.AbstractC1801jd) this.A00.getSerializableExtra(A0K, com.facebook.ads.redexgen.core.AbstractC1801jd.class);
        }
        android.content.Intent intent = this.A00;
        java.lang.String[] strArr = A05;
        if (strArr[6].charAt(13) != strArr[2].charAt(13)) {
            throw new java.lang.RuntimeException();
        }
        A05[1] = "LmjecX6z1NXmevkMdudhCsYVgseeBlBL";
        return (com.facebook.ads.redexgen.core.AbstractC1801jd) intent.getSerializableExtra(A0K);
    }

    private com.facebook.ads.redexgen.core.C1795jT A01() {
        int i = android.os.Build.VERSION.SDK_INT;
        java.lang.String A0K = A0K(26, 19, 47);
        if (i >= 33) {
            return (com.facebook.ads.redexgen.core.C1795jT) this.A00.getSerializableExtra(A0K, com.facebook.ads.redexgen.core.C1795jT.class);
        }
        return (com.facebook.ads.redexgen.core.C1795jT) this.A00.getSerializableExtra(A0K);
    }

    private com.facebook.ads.redexgen.core.C05137n A02() {
        int i = android.os.Build.VERSION.SDK_INT;
        java.lang.String A0K = A0K(2, 14, 94);
        if (i >= 33) {
            return (com.facebook.ads.redexgen.core.C05137n) this.A00.getSerializableExtra(A0K, com.facebook.ads.redexgen.core.C05137n.class);
        }
        return (com.facebook.ads.redexgen.core.C05137n) this.A00.getSerializableExtra(A0K);
    }

    private com.facebook.ads.redexgen.core.C05117l A03() {
        int i = android.os.Build.VERSION.SDK_INT;
        java.lang.String A0K = A0K(98, 25, 105);
        if (i >= 33) {
            return (com.facebook.ads.redexgen.core.C05117l) this.A00.getSerializableExtra(A0K, com.facebook.ads.redexgen.core.C05117l.class);
        }
        return (com.facebook.ads.redexgen.core.C05117l) this.A00.getSerializableExtra(A0K);
    }

    private com.facebook.ads.redexgen.core.InterfaceC1178Yi A05() {
        boolean booleanExtra = this.A00.getBooleanExtra(A0K(68, 12, 41), false);
        boolean isV2Design = com.facebook.ads.redexgen.core.C1086Up.A2w(this.A02);
        if (isV2Design) {
            java.lang.String stringExtra = this.A00.getStringExtra(A0K(45, 23, 126));
            com.facebook.ads.redexgen.core.C0998Re c0998Re = this.A01;
            com.facebook.ads.redexgen.core.C1636gi c1636gi = this.A02;
            com.facebook.ads.redexgen.core.VA va = this.A03;
            com.facebook.ads.redexgen.core.C1682hS c1682hS = new com.facebook.ads.redexgen.core.C1682hS(this.A01);
            java.lang.String stringExtra2 = this.A00.getStringExtra(A0K(16, 10, 115));
            if (stringExtra == null) {
                stringExtra = A0K(0, 2, 117);
            }
            int parseInt = java.lang.Integer.parseInt(stringExtra);
            java.lang.String clickDelayMs = A05[5];
            if (clickDelayMs.charAt(3) != 'i') {
                throw new java.lang.RuntimeException();
            }
            A05[4] = "YY09SF1W0j6b6KfCSgRusx8TJPca7HgC";
            return new com.facebook.ads.redexgen.core.ViewOnClickListenerC04976x(c0998Re, c1636gi, va, c1682hS, stringExtra2, parseInt);
        }
        return new com.facebook.ads.redexgen.core.PZ(this.A01, this.A02, this.A03, new com.facebook.ads.redexgen.core.C1682hS(this.A01), booleanExtra);
    }

    private com.facebook.ads.redexgen.core.InterfaceC1178Yi A06() {
        com.facebook.ads.redexgen.core.C05137n A02 = A02();
        if (A02 == null) {
            return null;
        }
        return A08(new com.facebook.ads.redexgen.core.AnonymousClass77(this.A01), A02, A02.A1G(), new com.facebook.ads.redexgen.core.MH());
    }

    private com.facebook.ads.redexgen.core.InterfaceC1178Yi A07() {
        com.facebook.ads.redexgen.core.C05117l A03 = A03();
        if (A03 == null) {
            return null;
        }
        return A08(new com.facebook.ads.redexgen.core.AnonymousClass77(this.A01), A03, A03.A1G(), new com.facebook.ads.redexgen.core.MG());
    }

    private com.facebook.ads.redexgen.core.InterfaceC1178Yi A08(com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, java.lang.String str, com.facebook.ads.redexgen.core.ZU zu) {
        if (abstractC1801jd.A29().A0H().A07() != null) {
            com.facebook.ads.redexgen.core.C0908No A07 = abstractC1801jd.A29().A0H().A07();
            if (abstractC1801jd.A1n()) {
                return new com.facebook.ads.redexgen.core.MW(this.A02, this.A03, interfaceC1177Yh, abstractC1801jd, A07, str, zu);
            }
            return new com.facebook.ads.redexgen.core.NO(this.A02, this.A03, interfaceC1177Yh, abstractC1801jd, str, zu);
        }
        interfaceC1177Yh.A4j(zu.A81());
        interfaceC1177Yh.A4j(zu.A7w());
        return null;
    }

    private com.facebook.ads.redexgen.core.PJ A09(com.facebook.ads.redexgen.core.WK wk) {
        com.facebook.ads.redexgen.core.AbstractC1801jd A02;
        if (wk == com.facebook.ads.redexgen.core.WK.A0G) {
            A02 = A03();
            java.lang.String[] strArr = A05;
            if (strArr[6].charAt(13) != strArr[2].charAt(13)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A05;
            strArr2[6] = "BHjTvXd0Vicw2MzqRZQvpavg35ntNS6w";
            strArr2[2] = "NWBwsXtlP0iXXM4o1NBUiSzzY7vvtUxs";
            if (A02 == null) {
                return null;
            }
        } else if (wk != com.facebook.ads.redexgen.core.WK.A0A || (A02 = A02()) == null) {
            return null;
        }
        A02.A1L(this.A01.A08());
        if (A02.A1a()) {
            return new com.facebook.ads.redexgen.core.C4U(this.A02, this.A03, new com.facebook.ads.redexgen.core.C1042Sx(this.A02), new com.facebook.ads.redexgen.core.C1682hS(this.A01), A02);
        }
        return new com.facebook.ads.redexgen.core.C4T(this.A02, this.A03, new com.facebook.ads.redexgen.core.C1042Sx(this.A02), new com.facebook.ads.redexgen.core.C1682hS(this.A01), A02);
    }

    private final com.facebook.ads.redexgen.core.MT A0A() {
        return new com.facebook.ads.redexgen.core.MT(this.A02, this.A01);
    }

    private com.facebook.ads.redexgen.core.MI A0B(android.widget.RelativeLayout relativeLayout) {
        com.facebook.ads.redexgen.core.MI mi = new com.facebook.ads.redexgen.core.MI(this.A02, new com.facebook.ads.redexgen.core.C1681hR(this), this.A03, new com.facebook.ads.redexgen.core.C1682hS(this.A01));
        mi.A05(relativeLayout);
        mi.A04(this.A00.getIntExtra(A0K(123, 27, 91), 200));
        com.facebook.ads.redexgen.core.YB.A0N(relativeLayout, androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        return mi;
    }

    private com.facebook.ads.redexgen.core.AnonymousClass66 A0C() {
        com.facebook.ads.redexgen.core.C05137n A02 = A02();
        if (A02 == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.AnonymousClass66(this.A02, this.A03, new com.facebook.ads.redexgen.core.C1682hS(this.A01), A02, new com.facebook.ads.redexgen.core.MH(), 1);
    }

    private com.facebook.ads.redexgen.core.AnonymousClass66 A0D() {
        com.facebook.ads.redexgen.core.C05117l A03 = A03();
        if (A03 == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.AnonymousClass66(this.A02, this.A03, new com.facebook.ads.redexgen.core.C1682hS(this.A01), A03, new com.facebook.ads.redexgen.core.MG(), 0);
    }

    private com.facebook.ads.redexgen.core.JD A0E() {
        com.facebook.ads.redexgen.core.C1420dC A02;
        com.facebook.ads.redexgen.core.AbstractC1801jd A00 = A00();
        if (A00 == null || (A02 = com.facebook.ads.redexgen.core.AbstractC1421dD.A02(A00.A1D())) == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.JD(this.A02, new com.facebook.ads.redexgen.core.C1682hS(this.A01), A02, A00.A2E());
    }

    private com.facebook.ads.redexgen.core.C0718Ge A0F(com.facebook.ads.redexgen.core.WK wk) {
        com.facebook.ads.redexgen.core.ZU mg;
        com.facebook.ads.redexgen.core.InterfaceC1177Yh anonymousClass77;
        com.facebook.ads.redexgen.core.C1795jT A01 = A01();
        if (A01 == null) {
            return null;
        }
        if (wk == com.facebook.ads.redexgen.core.WK.A04) {
            mg = new com.facebook.ads.redexgen.core.MH();
            anonymousClass77 = new com.facebook.ads.redexgen.core.C1682hS(this.A01);
        } else {
            mg = new com.facebook.ads.redexgen.core.MG();
            anonymousClass77 = new com.facebook.ads.redexgen.core.AnonymousClass77(this.A01);
        }
        return new com.facebook.ads.redexgen.core.C0718Ge(this.A02, mg, this.A03, A01, new com.facebook.ads.redexgen.core.C1042Sx(this.A02), anonymousClass77);
    }

    private com.facebook.ads.redexgen.core.C04454x A0G() {
        com.facebook.ads.redexgen.core.C05137n A02 = A02();
        if (A02 != null) {
            return new com.facebook.ads.redexgen.core.C04454x(this.A02, new com.facebook.ads.redexgen.core.MH(), this.A03, A02, new com.facebook.ads.redexgen.core.C1042Sx(this.A02), new com.facebook.ads.redexgen.core.C1682hS(this.A01));
        }
        if (A05[1].charAt(5) != 'X') {
            throw new java.lang.RuntimeException();
        }
        A05[3] = "TvLwsmu9uaa0faVP4fF8b7PGg31O8U7I";
        return null;
    }

    private com.facebook.ads.redexgen.core.C4V A0H() {
        com.facebook.ads.redexgen.core.C05137n A02 = A02();
        if (A02 == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.C4V(this.A02, new com.facebook.ads.redexgen.core.MH(), this.A03, A02, new com.facebook.ads.redexgen.core.C1042Sx(this.A02), new com.facebook.ads.redexgen.core.C1682hS(this.A01));
    }

    private com.facebook.ads.redexgen.core.C4V A0I() {
        com.facebook.ads.redexgen.core.C05117l A03 = A03();
        if (A03 == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.C4V(this.A02, new com.facebook.ads.redexgen.core.MG(), this.A03, A03, new com.facebook.ads.redexgen.core.C1042Sx(this.A02), new com.facebook.ads.redexgen.core.AnonymousClass77(this.A01));
    }

    private com.facebook.ads.redexgen.core.GB A0J(com.facebook.ads.redexgen.core.WK wk) {
        com.facebook.ads.redexgen.core.AbstractC1801jd A02;
        com.facebook.ads.redexgen.core.AbstractC1801jd A022;
        if (wk == com.facebook.ads.redexgen.core.WK.A0J) {
            A02 = A03();
            if (A02 == null || (A022 = A03()) == null) {
                return null;
            }
        } else if (wk != com.facebook.ads.redexgen.core.WK.A0E || (A02 = A02()) == null || (A022 = A02()) == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.GB(this.A02, this.A03, A02, A022, new com.facebook.ads.redexgen.core.AnonymousClass77(this.A01), this.A01, wk);
    }

    public final com.facebook.ads.redexgen.core.InterfaceC1178Yi A0M(com.facebook.ads.redexgen.core.WK wk, android.widget.RelativeLayout relativeLayout) {
        if (wk == null) {
            return null;
        }
        switch (com.facebook.ads.redexgen.core.C1002Ri.A00[wk.ordinal()]) {
            case 1:
                if (relativeLayout != null) {
                    return A0B(relativeLayout);
                }
                return null;
            case 2:
            case 3:
                return A09(wk);
            case 4:
                return A0I();
            case 5:
                return A07();
            case 6:
                com.facebook.ads.redexgen.core.InterfaceC1178Yi A052 = A05();
                if (A05[4].charAt(13) != '3') {
                    A05[1] = "IIJ0HXviRARge0yizoGTY0JUA2Nzjczv";
                    return A052;
                }
                java.lang.String[] strArr = A05;
                strArr[6] = "UHMFNKnwuKHYyMbevaCPtufG1H9dhH1t";
                strArr[2] = "s6UgSHR7PtydXMVItCKPjBxPhDp7nABU";
                return A052;
            case 7:
                return A0H();
            case 8:
                return A0G();
            case 9:
                return A06();
            case 10:
                return A0E();
            case 11:
                com.facebook.ads.redexgen.core.AnonymousClass66 A0C = A0C();
                if (A05[5].charAt(3) != 'i') {
                    throw new java.lang.RuntimeException();
                }
                A05[3] = "7AQwH6OZkLua7JLoKEhUfmskdEmJStMK";
                return A0C;
            case 12:
                return A0D();
            case 13:
            case 14:
                return A0F(wk);
            case 15:
                return A0A();
            case 16:
            case 17:
                return A0J(wk);
            default:
                return null;
        }
    }
}

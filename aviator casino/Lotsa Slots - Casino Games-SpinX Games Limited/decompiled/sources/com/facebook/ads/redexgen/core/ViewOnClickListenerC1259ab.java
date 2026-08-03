package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ab, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1259ab implements android.view.View.OnClickListener {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"sP3gpwd6Zoi5atkrMGPTc5EXN8BQ3Rhb", "CuI3HGsHCqf5OUDiTkLeplOhcTm9T7NI", "qUh1oDSzqsBPPR1tLa2Ioa4F3OHVyWz", "9USBf0H8rgb5C7JYpIITcKF8xtKeHlI", "rVv7rCrqZ3PnTP4EIzYeJpV", "KXSca88saLVPZ5uec2yV3IdyBKC0ygXP", "JOf8s03jk9aSXntkdxYTuuj", "1B5kCc4TTNYrg"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.M8 A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[5].charAt(30) == 'J') {
                throw new java.lang.RuntimeException();
            }
            A02[6] = "NOG9o";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-68, -67, -54, -48, -49, -107, -67, -57, -68, -55, -58, -106, -93, -108, -106, -104, -87, -98, -85, -98, -87, -82, com.google.common.base.Ascii.DC4, 33, com.google.common.base.Ascii.ETB, 37, 34, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.ETB, -31, com.google.common.base.Ascii.FS, 33, 39, com.google.common.base.Ascii.CAN, 33, 39, -31, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SYN, 39, com.google.common.base.Ascii.FS, 34, 33, -31, 9, -4, -8, 10};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.C1636gi c1636gi2;
        com.facebook.ads.redexgen.core.C1636gi c1636gi3;
        com.facebook.ads.redexgen.core.InterfaceC1278au interfaceC1278au;
        com.facebook.ads.redexgen.core.InterfaceC1278au interfaceC1278au2;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            str = this.A00.A06;
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            java.lang.String A00 = A00(0, 11, 38);
            str2 = this.A00.A06;
            if (A00.equals(str2)) {
                return;
            }
            java.lang.String A002 = A00(22, 26, 126);
            str3 = this.A00.A06;
            android.content.Intent intent = new android.content.Intent(A002, com.facebook.ads.redexgen.core.XB.A00(str3));
            intent.addFlags(268435456);
            c1636gi = this.A00.A08;
            c1636gi.A0F().A9y();
            try {
                c1636gi3 = this.A00.A08;
                com.facebook.ads.redexgen.core.C1140Wu.A0D(c1636gi3, intent);
                interfaceC1278au = this.A00.A05;
                if (interfaceC1278au != null) {
                    interfaceC1278au2 = this.A00.A05;
                    interfaceC1278au2.AF0();
                }
            } catch (com.facebook.ads.redexgen.core.C1138Ws e) {
                java.lang.Throwable cause = e.getCause();
                java.lang.Throwable th = e;
                if (cause != null) {
                    th = e.getCause();
                }
                c1636gi2 = this.A00.A08;
                c1636gi2.A08().ABC(A00(11, 11, 0), com.facebook.ads.redexgen.core.AbstractC1048Td.A00, new com.facebook.ads.redexgen.core.C1049Te(th));
            }
        } catch (java.lang.Throwable th2) {
            com.facebook.ads.redexgen.core.WU.A00(th2, this);
        }
    }

    static {
        A01();
    }

    public ViewOnClickListenerC1259ab(com.facebook.ads.redexgen.core.M8 m8) {
        this.A00 = m8;
    }
}

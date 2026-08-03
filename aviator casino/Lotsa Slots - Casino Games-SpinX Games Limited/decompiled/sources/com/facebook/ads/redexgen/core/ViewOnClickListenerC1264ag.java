package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ag, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1264ag implements android.view.View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.M6 A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 124);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-23, -22, -9, -3, -4, -62, -22, -12, -23, -10, -13, -32, -19, -34, -32, -30, -13, -24, -11, -24, -13, -8, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.GS, 19, 33, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.CAN, 19, -35, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.GS, 35, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.GS, 35, -35, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.DC2, 35, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.GS, -35, 5, -8, -12, 6};
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
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            str = this.A00.A07;
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            java.lang.String A00 = A00(0, 11, 12);
            str2 = this.A00.A07;
            if (A00.equals(str2)) {
                return;
            }
            java.lang.String A002 = A00(22, 26, 51);
            str3 = this.A00.A07;
            android.content.Intent intent = new android.content.Intent(A002, com.facebook.ads.redexgen.core.XB.A00(str3));
            intent.addFlags(268435456);
            c1636gi = this.A00.A09;
            c1636gi.A0F().A9y();
            try {
                c1636gi3 = this.A00.A09;
                com.facebook.ads.redexgen.core.C1140Wu.A0D(c1636gi3, intent);
                interfaceC1278au = this.A00.A06;
                interfaceC1278au.AF0();
            } catch (com.facebook.ads.redexgen.core.C1138Ws e) {
                java.lang.Throwable cause = e.getCause();
                java.lang.Throwable th = e;
                if (cause != null) {
                    th = e.getCause();
                }
                c1636gi2 = this.A00.A09;
                c1636gi2.A08().ABC(A00(11, 11, 3), com.facebook.ads.redexgen.core.AbstractC1048Td.A00, new com.facebook.ads.redexgen.core.C1049Te(th));
            }
        } catch (java.lang.Throwable th2) {
            com.facebook.ads.redexgen.core.WU.A00(th2, this);
        }
    }

    public ViewOnClickListenerC1264ag(com.facebook.ads.redexgen.core.M6 m6) {
        this.A00 = m6;
    }
}

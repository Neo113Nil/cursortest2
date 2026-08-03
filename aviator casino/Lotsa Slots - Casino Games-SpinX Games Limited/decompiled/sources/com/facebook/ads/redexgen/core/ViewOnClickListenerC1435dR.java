package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1435dR implements android.view.View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C5F A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 76);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, 39, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.US, 38};
    }

    public ViewOnClickListenerC1435dR(com.facebook.ads.redexgen.core.C5F c5f) {
        this.A00 = c5f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z;
        com.facebook.ads.redexgen.core.C1385cd c1385cd;
        com.facebook.ads.redexgen.core.InterfaceC1456dm interfaceC1456dm;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0K;
            if (!z) {
                c1385cd = this.A00.A0H;
                c1385cd.A02(A00(0, 9, 103));
                interfaceC1456dm = this.A00.A0Z;
                interfaceC1456dm.ACQ();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}

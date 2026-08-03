package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1455dl implements android.view.View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0718Ge A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 66);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{126, 115, 119, 114, 115, 100};
    }

    public ViewOnClickListenerC1455dl(com.facebook.ads.redexgen.core.C0718Ge c0718Ge) {
        this.A00 = c0718Ge;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.AbstractC0775Ij abstractC0775Ij;
        com.facebook.ads.redexgen.core.AbstractC0775Ij abstractC0775Ij2;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            abstractC0775Ij = this.A00.A04;
            if (abstractC0775Ij != null) {
                abstractC0775Ij2 = this.A00.A04;
                abstractC0775Ij2.A1D(A00(0, 6, 84));
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}

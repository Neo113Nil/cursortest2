package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1460dr implements android.view.View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C4V A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 41);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{89, 84, 80, 85, 84, 67};
    }

    public ViewOnClickListenerC1460dr(com.facebook.ads.redexgen.core.C4V c4v) {
        this.A00 = c4v;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c3;
        com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c32;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            abstractC1349c3 = this.A00.A02;
            if (abstractC1349c3 != null) {
                abstractC1349c32 = this.A00.A02;
                abstractC1349c32.A1B(A00(0, 6, 24));
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}

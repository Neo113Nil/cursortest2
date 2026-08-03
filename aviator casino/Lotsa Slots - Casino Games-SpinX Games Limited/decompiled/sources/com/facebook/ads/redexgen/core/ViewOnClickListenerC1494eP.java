package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.eP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1494eP implements android.view.View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1497eS A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{4, com.google.common.base.Ascii.SI, 5, 2, 0, 19, 5, com.google.common.base.Ascii.DC2};
    }

    public ViewOnClickListenerC1494eP(com.facebook.ads.redexgen.core.C1497eS c1497eS) {
        this.A00 = c1497eS;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr;
        com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr2;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            viewOnClickListenerC0834Kr = this.A00.A0l;
            if (viewOnClickListenerC0834Kr == null) {
                return;
            }
            viewOnClickListenerC0834Kr2 = this.A00.A0l;
            viewOnClickListenerC0834Kr2.A0E(A00(0, 8, 44));
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}

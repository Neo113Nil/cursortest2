package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1395cn implements android.view.View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0799Ji A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 52);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{7, -6, -11, -10, 0};
    }

    public ViewOnClickListenerC1395cn(com.facebook.ads.redexgen.core.C0799Ji c0799Ji) {
        this.A00 = c0799Ji;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.C1353c7 c1353c7;
        com.facebook.ads.redexgen.core.C1353c7 c1353c72;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0p(A00(0, 5, 93));
            c1353c7 = this.A00.A0b;
            if (c1353c7.A0D() != null) {
                c1353c72 = this.A00.A0b;
                c1353c72.A0D().ACQ();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}

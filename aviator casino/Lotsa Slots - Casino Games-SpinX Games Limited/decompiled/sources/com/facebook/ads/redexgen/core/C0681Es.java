package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Es, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0681Es extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0673Ek A00;

    public C0681Es(com.facebook.ads.redexgen.core.C0673Ek c0673Ek) {
        this.A00 = c0673Ek;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        boolean z;
        com.facebook.ads.redexgen.core.UM um;
        android.os.Handler handler;
        int i;
        z = this.A00.A04;
        if (!z) {
            um = this.A00.A0C;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            um.A02(new com.facebook.ads.redexgen.core.EB(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.4A
            });
            handler = this.A00.A08;
            i = this.A00.A01;
            handler.postDelayed(this, i);
        }
    }
}

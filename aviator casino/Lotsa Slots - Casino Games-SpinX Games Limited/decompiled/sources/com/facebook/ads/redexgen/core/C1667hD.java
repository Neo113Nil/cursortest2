package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1667hD implements com.facebook.ads.redexgen.core.XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1666hC A01;

    public C1667hD(com.facebook.ads.redexgen.core.C1666hC c1666hC, int i) {
        this.A01 = c1666hC;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void ADS() {
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        c1636gi = this.A01.A0C;
        c1636gi.A0F().ABa();
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void AFV(float f) {
        com.facebook.ads.redexgen.core.C1317bX c1317bX;
        com.facebook.ads.redexgen.core.C1317bX c1317bX2;
        float f2 = 1.0f - (f / this.A00);
        c1317bX = this.A01.A0G;
        if (c1317bX != null) {
            c1317bX2 = this.A01.A0G;
            c1317bX2.setProgressWithAnimation(100.0f * f2);
        }
    }
}

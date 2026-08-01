package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.hD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2961hD implements XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C2960hC A01;

    public C2961hD(C2960hC c2960hC, int i) {
        this.A01 = c2960hC;
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        C2930gi c2930gi;
        c2930gi = this.A01.A0C;
        c2930gi.A0F().ABa();
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f) {
        C2611bX c2611bX;
        C2611bX c2611bX2;
        float f2 = 1.0f - (f / this.A00);
        c2611bX = this.A01.A0G;
        if (c2611bX != null) {
            c2611bX2 = this.A01.A0G;
            c2611bX2.setProgressWithAnimation(100.0f * f2);
        }
    }
}

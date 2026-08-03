package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class H0 implements com.facebook.ads.redexgen.core.XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC0723Gj A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.DZ A03;

    public H0(com.facebook.ads.redexgen.core.AbstractC0723Gj abstractC0723Gj, int i, com.facebook.ads.redexgen.core.DZ dz, com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc abstractRunnableC1123Wc) {
        this.A02 = abstractC0723Gj;
        this.A00 = i;
        this.A03 = dz;
        this.A01 = abstractRunnableC1123Wc;
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void ADS() {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void AFV(float f) {
        this.A02.A09.setProgress(100.0f * (1.0f - (f / this.A00)));
        if (this.A03 != null) {
            com.facebook.ads.redexgen.core.DZ dz = this.A03;
            float percentage = this.A00;
            dz.A07((int) ((percentage - f) * 1000.0f));
        }
    }
}

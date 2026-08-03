package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class KV implements com.facebook.ads.redexgen.core.XN {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C6H A00;

    public KV(com.facebook.ads.redexgen.core.C6H c6h) {
        this.A00 = c6h;
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void ADS() {
        com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb;
        com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb2;
        this.A00.A0B = false;
        abstractC1171Yb = this.A00.A05;
        if (abstractC1171Yb != null) {
            abstractC1171Yb2 = this.A00.A05;
            abstractC1171Yb2.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void AFV(float f) {
        com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb;
        com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb2;
        abstractC1171Yb = this.A00.A05;
        if (abstractC1171Yb != null) {
            abstractC1171Yb2 = this.A00.A05;
            abstractC1171Yb2.setProgressImmediate(100.0f * (1.0f - (f / this.A00.getAdInfo().A0K().A00())));
        }
    }
}

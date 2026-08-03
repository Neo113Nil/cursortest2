package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1689hZ extends com.facebook.ads.redexgen.core.R7 {
    public boolean A00 = false;
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC1684hU A01;

    public C1689hZ(com.facebook.ads.redexgen.core.AbstractC1684hU abstractC1684hU) {
        this.A01 = abstractC1684hU;
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public final void A0L(com.facebook.ads.redexgen.core.C7M c7m, int i) {
        super.A0L(c7m, i);
        if (i == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public final void A0M(com.facebook.ads.redexgen.core.C7M c7m, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.A00 = true;
        }
    }
}

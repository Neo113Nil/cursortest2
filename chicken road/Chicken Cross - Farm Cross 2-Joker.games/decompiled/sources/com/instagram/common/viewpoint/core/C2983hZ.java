package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.hZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2983hZ extends R7 {
    public boolean A00 = false;
    public final /* synthetic */ AbstractC2978hU A01;

    public C2983hZ(AbstractC2978hU abstractC2978hU) {
        this.A01 = abstractC2978hU;
    }

    @Override // com.instagram.common.viewpoint.core.R7
    public final void A0L(C7M c7m, int i) {
        super.A0L(c7m, i);
        if (i == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0F();
        }
    }

    @Override // com.instagram.common.viewpoint.core.R7
    public final void A0M(C7M c7m, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.A00 = true;
        }
    }
}

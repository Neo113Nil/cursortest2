package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class WX extends com.facebook.ads.redexgen.core.UO<java.lang.String> {
    public final /* synthetic */ com.facebook.ads.redexgen.core.V7 A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.WW A01;

    public WX(com.facebook.ads.redexgen.core.WW ww, com.facebook.ads.redexgen.core.V7 v7) {
        this.A01 = ww;
        this.A00 = v7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UO
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A02(java.lang.String str) {
        com.facebook.ads.redexgen.core.V9 v9;
        com.facebook.ads.redexgen.core.V9 v92;
        super.A02(str);
        if (this.A00.A0B()) {
            v92 = this.A01.A02;
            v92.A62();
        } else {
            v9 = this.A01.A02;
            v9.A61();
        }
    }

    @Override // com.facebook.ads.redexgen.core.UO
    public final void A01(int i, java.lang.String str) {
        super.A01(i, str);
    }
}

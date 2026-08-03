package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Nz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0919Nz implements com.facebook.ads.redexgen.core.InterfaceC1327bh {
    public final /* synthetic */ com.facebook.ads.redexgen.core.NO A00;

    public C0919Nz(com.facebook.ads.redexgen.core.NO no) {
        this.A00 = no;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1327bh
    public final void ACt() {
        boolean A0X;
        A0X = this.A00.A0X();
        if (A0X) {
            this.A00.A0N();
            this.A00.A0g.setToolbarActionMessage("");
            this.A00.A0g.setToolbarActionMode(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1327bh
    public final void AEm() {
        com.facebook.ads.redexgen.core.XO xo;
        this.A00.A0K = false;
        xo = this.A00.A0U;
        xo.A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1327bh
    public final void AEn() {
        com.facebook.ads.redexgen.core.XO xo;
        this.A00.A0K = true;
        xo = this.A00.A0U;
        xo.A06();
    }
}

package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Jt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0810Jt implements com.facebook.ads.redexgen.core.InterfaceC1314bU {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0799Ji A00;

    public C0810Jt(com.facebook.ads.redexgen.core.C0799Ji c0799Ji) {
        this.A00 = c0799Ji;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1314bU
    public final void ADY() {
        com.facebook.ads.redexgen.core.VI vi;
        com.facebook.ads.redexgen.core.AbstractC0888Mt abstractC0888Mt;
        com.facebook.ads.redexgen.core.C1353c7 c1353c7;
        com.facebook.ads.redexgen.core.C1313bT c1313bT;
        com.facebook.ads.redexgen.core.C1313bT c1313bT2;
        com.facebook.ads.redexgen.core.C1353c7 c1353c72;
        com.facebook.ads.redexgen.core.AbstractC0888Mt abstractC0888Mt2;
        vi = this.A00.A0Y;
        vi.A04(com.facebook.ads.redexgen.core.VH.A0J, null);
        abstractC0888Mt = this.A00.A0W;
        if (abstractC0888Mt != null) {
            com.facebook.ads.redexgen.core.C0799Ji c0799Ji = this.A00;
            abstractC0888Mt2 = this.A00.A0W;
            c0799Ji.A0m(((com.facebook.ads.redexgen.core.AnonymousClass85) abstractC0888Mt2).A0M().toString());
        }
        c1353c7 = this.A00.A0b;
        if (c1353c7.A0D() != null) {
            c1353c72 = this.A00.A0b;
            c1353c72.A0D().ACQ();
        }
        c1313bT = this.A00.A09;
        if (c1313bT != null) {
            c1313bT2 = this.A00.A09;
            c1313bT2.A0B();
            this.A00.A09 = null;
        }
        this.A00.A0q(true);
    }
}

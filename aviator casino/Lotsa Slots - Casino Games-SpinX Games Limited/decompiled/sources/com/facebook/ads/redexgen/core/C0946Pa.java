package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Pa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0946Pa implements com.facebook.ads.redexgen.core.InterfaceC1274aq {
    public final /* synthetic */ com.facebook.ads.redexgen.core.PZ A00;

    public C0946Pa(com.facebook.ads.redexgen.core.PZ pz) {
        this.A00 = pz;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1274aq
    public final void AF7(java.lang.String str) {
        this.A00.A0C.setProgress(100);
        this.A00.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1274aq
    public final void AF9(java.lang.String str) {
        this.A00.A05 = true;
        this.A00.A0F.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1274aq
    public final void AFY(int i) {
        if (this.A00.A05) {
            this.A00.A0C.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1274aq
    public final void AFb(java.lang.String str) {
        this.A00.A0F.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1274aq
    public final void AFe() {
        this.A00.A0B.ADJ(14);
    }
}

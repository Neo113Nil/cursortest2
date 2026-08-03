package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.jF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1784jF implements com.facebook.ads.redexgen.core.SM {
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC1801jd A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.InterfaceC0913Nt A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0914Nu A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1636gi A03;
    public final /* synthetic */ boolean A04;

    public C1784jF(com.facebook.ads.redexgen.core.C0914Nu c0914Nu, com.facebook.ads.redexgen.core.C1636gi c1636gi, boolean z, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.InterfaceC0913Nt interfaceC0913Nt) {
        this.A02 = c0914Nu;
        this.A03 = c1636gi;
        this.A04 = z;
        this.A00 = abstractC1801jd;
        this.A01 = interfaceC0913Nt;
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACx() {
        java.util.ArrayList arrayList;
        if (com.facebook.ads.redexgen.core.C1086Up.A1q(this.A03) && this.A04) {
            arrayList = this.A02.A02;
            arrayList.add(com.facebook.ads.redexgen.core.AbstractC1421dD.A01(this.A03, this.A00, 1, new com.facebook.ads.redexgen.core.C1785jG(this)));
        } else {
            this.A01.ACp();
        }
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACy() {
        this.A01.ACo(com.facebook.ads.AdError.CACHE_ERROR);
    }
}

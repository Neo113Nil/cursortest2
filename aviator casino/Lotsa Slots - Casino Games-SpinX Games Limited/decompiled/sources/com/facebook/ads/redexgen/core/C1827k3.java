package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.k3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1827k3 extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1826k2 A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.AnonymousClass62 A01;

    public C1827k3(com.facebook.ads.redexgen.core.C1826k2 c1826k2, com.facebook.ads.redexgen.core.AnonymousClass62 anonymousClass62) {
        this.A00 = c1826k2;
        this.A01 = anonymousClass62;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        com.facebook.ads.redexgen.core.C1581fp c1581fp;
        com.facebook.ads.redexgen.core.C1581fp c1581fp2;
        com.facebook.ads.redexgen.core.C1581fp c1581fp3;
        this.A00.A00.A0A();
        c1581fp = this.A00.A00.A0B;
        if (c1581fp != null) {
            com.facebook.ads.redexgen.core.AnonymousClass62 anonymousClass62 = this.A01;
            c1581fp2 = this.A00.A00.A0B;
            anonymousClass62.setAdViewabilityChecker(c1581fp2);
            c1581fp3 = this.A00.A00.A0B;
            c1581fp3.A0U();
        }
    }
}

package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.k3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3121k3 extends AbstractRunnableC2417Wc {
    public final /* synthetic */ C3120k2 A00;
    public final /* synthetic */ AnonymousClass62 A01;

    public C3121k3(C3120k2 c3120k2, AnonymousClass62 anonymousClass62) {
        this.A00 = c3120k2;
        this.A01 = anonymousClass62;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        C2875fp c2875fp;
        C2875fp c2875fp2;
        C2875fp c2875fp3;
        this.A00.A00.A0A();
        c2875fp = this.A00.A00.A0B;
        if (c2875fp != null) {
            AnonymousClass62 anonymousClass62 = this.A01;
            c2875fp2 = this.A00.A00.A0B;
            anonymousClass62.setAdViewabilityChecker(c2875fp2);
            c2875fp3 = this.A00.A00.A0B;
            c2875fp3.A0U();
        }
    }
}

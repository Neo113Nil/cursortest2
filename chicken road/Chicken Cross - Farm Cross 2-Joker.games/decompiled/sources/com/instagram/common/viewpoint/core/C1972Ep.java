package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ep, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1972Ep extends AbstractRunnableC2417Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C1967Ek A02;

    public C1972Ep(C1967Ek c1967Ek, int i, int i2) {
        this.A02 = c1967Ek;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        UM um;
        um = this.A02.A0C;
        um.A02(new C1955Dy(this.A00, this.A01));
    }
}

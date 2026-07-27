package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.f4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2828f4 extends AbstractRunnableC2417Wc {
    public final /* synthetic */ C2926ge A00;

    public C2828f4(C2926ge c2926ge) {
        this.A00 = c2926ge;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        for (TY ty : TX.A02()) {
            TX.A0A(this.A00, ty.A02(), ty.A00(), ty.A01(), false);
        }
        TX.A02().clear();
    }
}

package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class EN extends com.facebook.ads.redexgen.core.UN<com.facebook.ads.redexgen.core.E3> {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C4L A00;

    public EN(com.facebook.ads.redexgen.core.C4L c4l) {
        this.A00 = c4l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(com.facebook.ads.redexgen.core.E3 e3) {
        boolean z;
        z = this.A00.A02;
        if (!z) {
            this.A00.A02 = true;
        } else {
            this.A00.A0d();
        }
    }

    @Override // com.facebook.ads.redexgen.core.UN
    public final java.lang.Class<com.facebook.ads.redexgen.core.E3> A01() {
        return com.facebook.ads.redexgen.core.E3.class;
    }
}

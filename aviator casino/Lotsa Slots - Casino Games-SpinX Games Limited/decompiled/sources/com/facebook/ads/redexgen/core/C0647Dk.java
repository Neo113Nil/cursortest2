package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Dk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0647Dk extends com.facebook.ads.redexgen.core.UN<com.facebook.ads.redexgen.core.C4A> {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0646Dj A00;

    public C0647Dk(com.facebook.ads.redexgen.core.C0646Dj c0646Dj) {
        this.A00 = c0646Dj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(com.facebook.ads.redexgen.core.C4A c4a) {
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek2;
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek3;
        java.lang.String A02;
        c0673Ek = this.A00.A00;
        if (c0673Ek == null) {
            return;
        }
        com.facebook.ads.redexgen.core.C0646Dj c0646Dj = this.A00;
        com.facebook.ads.redexgen.core.C0646Dj c0646Dj2 = this.A00;
        c0673Ek2 = this.A00.A00;
        int duration = c0673Ek2.getDuration();
        c0673Ek3 = this.A00.A00;
        A02 = c0646Dj2.A02(duration - c0673Ek3.getCurrentPositionInMillis());
        c0646Dj.setText(A02);
    }

    @Override // com.facebook.ads.redexgen.core.UN
    public final java.lang.Class<com.facebook.ads.redexgen.core.C4A> A01() {
        return com.facebook.ads.redexgen.core.C4A.class;
    }
}

package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Dk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1941Dk extends UN<C4A> {
    public final /* synthetic */ C1940Dj A00;

    public C1941Dk(C1940Dj c1940Dj) {
        this.A00 = c1940Dj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C4A c4a) {
        C1967Ek c1967Ek;
        C1967Ek c1967Ek2;
        C1967Ek c1967Ek3;
        String A02;
        c1967Ek = this.A00.A00;
        if (c1967Ek == null) {
            return;
        }
        C1940Dj c1940Dj = this.A00;
        C1940Dj c1940Dj2 = this.A00;
        c1967Ek2 = this.A00.A00;
        int duration = c1967Ek2.getDuration();
        c1967Ek3 = this.A00.A00;
        A02 = c1940Dj2.A02(duration - c1967Ek3.getCurrentPositionInMillis());
        c1940Dj.setText(A02);
    }

    @Override // com.instagram.common.viewpoint.core.UN
    public final Class<C4A> A01() {
        return C4A.class;
    }
}

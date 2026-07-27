package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.7y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C18187y extends AbstractC3069j4 {
    public final /* synthetic */ C18167w A00;
    public final /* synthetic */ AbstractC3099jh A01;
    public final /* synthetic */ C18057l A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18187y(C18167w c18167w, boolean z, boolean z2, C18057l c18057l, AbstractC3099jh abstractC3099jh) {
        super(z);
        this.A00 = c18167w;
        this.A03 = z2;
        this.A02 = c18057l;
        this.A01 = abstractC3099jh;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3069j4
    public final void A00() {
        NJ nj;
        nj = this.A00.A01;
        nj.AFp(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3069j4
    public final void A01(boolean z) {
        C2930gi c2930gi;
        WK wk;
        AtomicBoolean atomicBoolean;
        NJ nj;
        C2930gi c2930gi2;
        C2930gi c2930gi3;
        c2930gi = this.A00.A04;
        if (!C2380Up.A1t(c2930gi) || !this.A03) {
            wk = this.A00.A05;
            if (wk == WK.A0J) {
                c2930gi2 = this.A00.A04;
                c2930gi2.A0F().AER();
            }
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            nj = this.A00.A01;
            nj.AFm(this.A01);
            return;
        }
        C18167w c18167w = this.A00;
        c2930gi3 = this.A00.A04;
        c18167w.A06 = AbstractC2715dD.A01(c2930gi3, this.A02, 0, new C3108jq(this));
    }
}

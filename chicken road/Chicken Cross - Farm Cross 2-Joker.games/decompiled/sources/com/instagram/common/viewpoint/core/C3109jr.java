package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.jr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3109jr implements SM {
    public final /* synthetic */ C18167w A00;
    public final /* synthetic */ boolean A01;

    public C3109jr(C18167w c18167w, boolean z) {
        this.A00 = c18167w;
        this.A01 = z;
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACx() {
        C2930gi c2930gi;
        AtomicBoolean atomicBoolean;
        NJ nj;
        C2930gi c2930gi2;
        NQ nq;
        c2930gi = this.A00.A04;
        if (!C2380Up.A1t(c2930gi) || !this.A01) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            nj = this.A00.A01;
            nj.AFm(this.A00);
            return;
        }
        C18167w c18167w = this.A00;
        c2930gi2 = this.A00.A04;
        nq = this.A00.A03;
        c18167w.A06 = AbstractC2715dD.A01(c2930gi2, (C18057l) nq, 0, new C3110js(this));
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACy() {
        NJ nj;
        nj = this.A00.A01;
        nj.AFp(this.A00, AdError.CACHE_ERROR);
    }
}

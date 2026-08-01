package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.jp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3107jp implements SM {
    public final /* synthetic */ C18167w A00;

    public C3107jp(C18167w c18167w) {
        this.A00 = c18167w;
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACx() {
        AtomicBoolean atomicBoolean;
        NJ nj;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        nj = this.A00.A01;
        nj.AFm(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACy() {
        NJ nj;
        nj = this.A00.A01;
        nj.AFp(this.A00, AdError.CACHE_ERROR);
    }
}

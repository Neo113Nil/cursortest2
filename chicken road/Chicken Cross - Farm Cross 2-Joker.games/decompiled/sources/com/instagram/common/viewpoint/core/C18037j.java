package com.instagram.common.viewpoint.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.7j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C18037j extends AbstractC3065j0 {
    public C18037j(C2930gi c2930gi, O7 o7) {
        super(c2930gi, o7);
    }

    private C3063iy A00(Runnable runnable) {
        return new C3063iy(this, runnable);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3065j0
    public final NQ A0I() {
        C3117jz successfullyLoadedAdapter = (C3117jz) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3065j0
    public final void A0P() {
        C3117jz interstitialAdapter = (C3117jz) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3065j0
    public final void A0R(N1 n1, C2361Tw c2361Tw, C2359Tu c2359Tu, O8 o8) {
        C3117jz c3117jz = (C3117jz) n1;
        C3064iz c3064iz = new C3064iz(this, o8, c3117jz);
        A0H().postDelayed(c3064iz, c2361Tw.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c3117jz.A0A(this.A0B, A00(c3064iz), o8, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}

package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.mJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1675mJ implements InterfaceC0351Cr, InterfaceC0352Cs {
    public final int A00;
    public final /* synthetic */ C9A A01;

    public C1675mJ(C9A c9a, int i) {
        this.A01 = c9a;
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0352Cs
    @MetaExoPlayerCustomization("Added in D21840558 for FBVP")
    public final long A81() {
        C1670mE[] c1670mEArr;
        c1670mEArr = this.A01.A0L;
        return c1670mEArr[this.A00].A0S();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0351Cr
    public final boolean AAV() {
        return this.A01.A0f(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0351Cr
    public final void ABs() throws IOException {
        this.A01.A0d(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0351Cr
    public final int AGf(C6N c6n, C1752nY c1752nY, int i) {
        return this.A01.A0Y(this.A00, c6n, c1752nY, i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0351Cr
    public final int AJI(long j) {
        return this.A01.A0X(this.A00, j);
    }
}

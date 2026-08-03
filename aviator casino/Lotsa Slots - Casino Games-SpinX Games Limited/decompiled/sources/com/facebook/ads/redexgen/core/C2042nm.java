package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.nm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2042nm implements com.facebook.ads.redexgen.core.DT, com.facebook.ads.redexgen.core.DU {
    public final int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C05599p A01;

    public C2042nm(com.facebook.ads.redexgen.core.C05599p c05599p, int i) {
        this.A01 = c05599p;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.DU
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Added in D21840558 for FBVP")
    public final long A89() {
        com.facebook.ads.redexgen.core.C2030na[] c2030naArr;
        c2030naArr = this.A01.A0L;
        return c2030naArr[this.A00].A0S();
    }

    @Override // com.facebook.ads.redexgen.core.DT
    public final boolean AAe() {
        return this.A01.A0f(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.DT
    public final void ACR() throws java.io.IOException {
        this.A01.A0d(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.DT
    public final int AHP(com.facebook.ads.redexgen.core.C04996z c04996z, com.facebook.ads.redexgen.core.C2117p0 c2117p0, int i) {
        return this.A01.A0Y(this.A00, c04996z, c2117p0, i);
    }

    @Override // com.facebook.ads.redexgen.core.DT
    public final int AK2(long j) {
        return this.A01.A0X(this.A00, j);
    }
}

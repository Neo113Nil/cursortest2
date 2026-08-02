package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.lI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1614lI implements InterfaceC0460Gw {
    public final long A00;
    public final C0459Gv A01;

    public C1614lI(long j) {
        this(j, 0L);
    }

    public C1614lI(long j, long j2) {
        this.A00 = j;
        this.A01 = new C0459Gv(j2 == 0 ? C0461Gx.A04 : new C0461Gx(0L, j2));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0460Gw
    public final long A7l() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0460Gw
    public final C0459Gv A8t(long j) {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0460Gw
    public final boolean AAa() {
        return false;
    }
}

package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.iz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1485iz implements InterfaceC01614t {
    public InterfaceC0580Ln A02;
    public long A01 = 5242880;
    public int A00 = 20480;

    public final C1485iz A00(InterfaceC0580Ln interfaceC0580Ln) {
        this.A02 = interfaceC0580Ln;
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01614t
    public final C1484iy A59() {
        return new C1484iy((InterfaceC0580Ln) C3M.A01(this.A02), this.A01, this.A00);
    }
}

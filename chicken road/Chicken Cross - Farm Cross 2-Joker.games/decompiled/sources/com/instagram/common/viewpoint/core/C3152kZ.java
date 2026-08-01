package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.kZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3152kZ implements InterfaceC2160Lx {
    public final InterfaceC2157Lu A00;

    public C3152kZ(InterfaceC2157Lu interfaceC2157Lu) {
        this.A00 = interfaceC2157Lu;
    }

    public final InterfaceC2157Lu A00() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2160Lx
    public final C8J ACL() {
        return new C8J(this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2160Lx
    public final C3156kd ACM() {
        return new C3156kd(this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2160Lx
    public final C3156kd ACN(String str) {
        return new C3156kd(this, str);
    }
}

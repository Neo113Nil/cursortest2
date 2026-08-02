package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ye, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1834ye extends AbstractC1744we {
    @Override // com.google.android.gms.internal.ads.AbstractC1744we
    public final void k() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1744we
    public final boolean q(String str) {
        String n5 = U2.e.n(str, "MD5");
        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) this.f16125m.get();
        if (interfaceC0677Re != null && n5 != null) {
            interfaceC0677Re.u0(n5, this);
        }
        U2.j.i("VideoStreamNoopCache is doing nothing.");
        l(str, n5, "noop", "Noop cache is a noop.");
        return false;
    }
}

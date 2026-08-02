package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1838yi implements InterfaceC1434pi {

    /* renamed from: k, reason: collision with root package name */
    public int f16461k;

    /* renamed from: l, reason: collision with root package name */
    public int f16462l;

    @Override // com.google.android.gms.internal.ads.InterfaceC1434pi
    public final synchronized void B0(Sq sq) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.h1)).booleanValue()) {
            try {
                Nq nq = (Nq) sq.f11596b.f13762m;
                this.f16461k = nq.f10824c;
                this.f16462l = nq.f10825d;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1434pi
    public final void D(C1428pc c1428pc) {
    }

    public final synchronized int a() {
        return this.f16461k;
    }
}

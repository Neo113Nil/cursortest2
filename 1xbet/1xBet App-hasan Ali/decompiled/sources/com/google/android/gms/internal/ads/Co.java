package com.google.android.gms.internal.ads;

import Q2.InterfaceC0392x;
import android.content.Context;

/* loaded from: classes.dex */
public final class Co extends Q2.C {

    /* renamed from: k, reason: collision with root package name */
    public final C0905dr f8088k;

    public Co(Context context, C0554Af c0554Af, Vq vq, Kj kj, InterfaceC0392x interfaceC0392x) {
        C0905dr c0905dr = new C0905dr(kj, (C1482ql) c0554Af.f7688x.d());
        ((Eo) c0905dr.f13187m).f8595k.set(interfaceC0392x);
        C1324n6 c1324n6 = new C1324n6();
        c1324n6.f14579l = c0554Af;
        c1324n6.f14582o = context;
        c1324n6.f14580m = c0905dr;
        c1324n6.f14578k = vq;
        c1324n6.f14581n = c0554Af.C();
        vq.f11958r = (Eo) c0905dr.f13187m;
        this.f8088k = new C0905dr(21, c1324n6, vq.f11945c);
    }

    @Override // Q2.D
    public final synchronized void F0(Q2.X0 x02, int i) {
        this.f8088k.D(x02, i);
    }

    @Override // Q2.D
    public final void Z0(Q2.X0 x02) {
        this.f8088k.D(x02, 1);
    }

    @Override // Q2.D
    public final synchronized String b() {
        return this.f8088k.m();
    }

    @Override // Q2.D
    public final synchronized String c() {
        return this.f8088k.t();
    }

    @Override // Q2.D
    public final synchronized boolean e() {
        return this.f8088k.G();
    }
}

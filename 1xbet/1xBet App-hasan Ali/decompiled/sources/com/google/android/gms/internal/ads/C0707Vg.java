package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Vg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0707Vg implements InterfaceC0808bi, L5 {

    /* renamed from: k, reason: collision with root package name */
    public final Lq f11906k;

    /* renamed from: l, reason: collision with root package name */
    public final Uh f11907l;

    /* renamed from: m, reason: collision with root package name */
    public final C0986fi f11908m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f11909n = new AtomicBoolean();

    /* renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f11910o = new AtomicBoolean();

    public C0707Vg(Lq lq, Uh uh, C0986fi c0986fi) {
        this.f11906k = lq;
        this.f11907l = uh;
        this.f11908m = c0986fi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0808bi
    public final synchronized void j0() {
        if (this.f11906k.f10497e != 1) {
            if (this.f11909n.compareAndSet(false, true)) {
                this.f11907l.i();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.L5
    public final void z0(K5 k5) {
        if (this.f11906k.f10497e == 1 && k5.f10128j && this.f11909n.compareAndSet(false, true)) {
            this.f11907l.i();
        }
        if (k5.f10128j && this.f11910o.compareAndSet(false, true)) {
            C0986fi c0986fi = this.f11908m;
            synchronized (c0986fi) {
                c0986fi.n1(new Jh(11));
            }
        }
    }
}

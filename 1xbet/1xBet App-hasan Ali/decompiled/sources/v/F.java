package v;

import a3.AbstractC0467k;
import k0.C2022b;
import p4.AbstractC2282w;
import y.C2654j;
import z0.C2733I;
import z0.InterfaceC2757n;

/* loaded from: classes.dex */
public final class F extends b0.o implements InterfaceC2757n {

    /* renamed from: A, reason: collision with root package name */
    public boolean f20144A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f20145B;

    /* renamed from: y, reason: collision with root package name */
    public final C2654j f20146y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f20147z;

    public F(C2654j c2654j) {
        this.f20146y = c2654j;
    }

    @Override // z0.InterfaceC2757n
    public final /* synthetic */ void f0() {
    }

    @Override // z0.InterfaceC2757n
    public final void g(C2733I c2733i) {
        c2733i.a();
        boolean z3 = this.f20147z;
        C2022b c2022b = c2733i.f21647k;
        if (z3) {
            AbstractC0467k.m(c2733i, i0.p.b(0.3f, i0.p.f17289b), c2022b.f17540l.A(), 122);
        } else if (this.f20144A || this.f20145B) {
            AbstractC0467k.m(c2733i, i0.p.b(0.1f, i0.p.f17289b), c2022b.f17540l.A(), 122);
        }
    }

    @Override // b0.o
    public final void o0() {
        AbstractC2282w.p(k0(), null, new E(this, null), 3);
    }
}

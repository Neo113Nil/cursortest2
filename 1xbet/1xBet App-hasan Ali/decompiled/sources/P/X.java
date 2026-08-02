package P;

import a0.C0446b;
import java.util.concurrent.CancellationException;
import k4.AbstractC2036a;
import p4.AbstractC2282w;
import p4.C2285z;
import p4.InterfaceC2278s;

/* loaded from: classes.dex */
public final class X implements G0, InterfaceC2278s {

    /* renamed from: k, reason: collision with root package name */
    public final a4.h f4419k;

    /* renamed from: l, reason: collision with root package name */
    public final i4.e f4420l;

    /* renamed from: m, reason: collision with root package name */
    public final u4.c f4421m;

    /* renamed from: n, reason: collision with root package name */
    public C2285z f4422n;

    public X(a4.h hVar, i4.e eVar) {
        this.f4419k = hVar;
        this.f4420l = eVar;
        this.f4421m = AbstractC2282w.a(hVar.m(hVar.l(C0446b.f6363l) != null ? this : a4.i.f6649k));
    }

    @Override // a4.h
    public final Object A(i4.e eVar, Object obj) {
        return eVar.invoke(obj, this);
    }

    @Override // P.G0
    public final void a() {
        C2285z c2285z = this.f4422n;
        if (c2285z != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            c2285z.d(cancellationException);
        }
        this.f4422n = AbstractC2282w.p(this.f4421m, null, this.f4420l, 3);
    }

    @Override // P.G0
    public final void c() {
        C2285z c2285z = this.f4422n;
        if (c2285z != null) {
            c2285z.z(new M(1));
        }
        this.f4422n = null;
    }

    @Override // P.G0
    public final void e() {
        C2285z c2285z = this.f4422n;
        if (c2285z != null) {
            c2285z.z(new M(1));
        }
        this.f4422n = null;
    }

    @Override // a4.f
    public final a4.g getKey() {
        return p4.r.f18818k;
    }

    @Override // p4.InterfaceC2278s
    public final void k(a4.h hVar, Throwable th) {
        C0446b c0446b = (C0446b) hVar.l(C0446b.f6363l);
        if (c0446b != null) {
            AbstractC2036a.Y(th, new C0328y0(4, c0446b, this));
        }
        InterfaceC2278s interfaceC2278s = (InterfaceC2278s) this.f4419k.l(p4.r.f18818k);
        if (interfaceC2278s == null) {
            throw th;
        }
        interfaceC2278s.k(hVar, th);
    }

    @Override // a4.h
    public final a4.f l(a4.g gVar) {
        return G4.l.y(this, gVar);
    }

    @Override // a4.h
    public final a4.h m(a4.h hVar) {
        return G4.l.H(this, hVar);
    }

    @Override // a4.h
    public final a4.h r(a4.g gVar) {
        return G4.l.F(this, gVar);
    }
}

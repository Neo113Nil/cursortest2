package d;

import A0.AbstractC0015c;
import G1.C0145p;
import c.C0522a;
import e.C1918a;
import java.util.concurrent.CancellationException;
import p4.AbstractC2282w;
import p4.C2285z;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class i extends AbstractC0015c {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2280u f16817c;

    /* renamed from: d, reason: collision with root package name */
    public i4.e f16818d;

    /* renamed from: e, reason: collision with root package name */
    public r4.c f16819e;
    public C2285z f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16820g;

    public i(InterfaceC2280u interfaceC2280u, k kVar) {
        super(kVar);
        this.f16817c = interfaceC2280u;
        this.f16818d = new f(2, null);
    }

    @Override // A0.AbstractC0015c
    public final void g() {
        r4.c cVar = this.f16819e;
        if (cVar != null) {
            cVar.h(new CancellationException("onBack cancelled"), true);
        }
        C2285z c2285z = this.f;
        if (c2285z != null) {
            c2285z.d(null);
        }
        this.f16819e = null;
        this.f = null;
        this.f16820g = false;
    }

    @Override // A0.AbstractC0015c
    public final void h() {
        if (this.f16819e != null && !this.f16820g) {
            g();
        }
        if (this.f16819e == null) {
            this.f16820g = false;
            this.f16819e = r4.j.a(-2, 4, r4.a.f19106k);
            this.f = AbstractC2282w.p(this.f16817c, null, new h(this, null), 3);
        }
        r4.c cVar = this.f16819e;
        if (cVar != null) {
            cVar.h(null, false);
        }
        this.f16820g = false;
    }

    @Override // A0.AbstractC0015c
    public final void i(C0522a c0522a) {
        r4.c cVar = this.f16819e;
        if (cVar != null) {
            cVar.q(c0522a);
        }
    }

    @Override // A0.AbstractC0015c
    public final void j() {
        g();
        if (super.f()) {
            this.f16820g = true;
            this.f16819e = r4.j.a(-2, 4, r4.a.f19106k);
            this.f = AbstractC2282w.p(this.f16817c, null, new h(this, null), 3);
        }
    }

    public final void q(boolean z3) {
        C2285z c2285z;
        if (!z3 && super.f() && (c2285z = this.f) != null && !c2285z.b()) {
            g();
        }
        ((C0145p) this.f474a).d(z3);
        ((C1918a) this.f475b).f(z3);
    }
}

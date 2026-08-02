package o0;

import A0.C0040k0;
import P.AbstractC0329z;
import P.C0299j0;
import P.C0305m0;
import h0.C1991e;
import i0.C2006k;
import k0.C2022b;
import k0.C2023c;
import n0.AbstractC2157b;
import z0.C2733I;

/* renamed from: o0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2195B extends AbstractC2157b {

    /* renamed from: o, reason: collision with root package name */
    public final C0305m0 f18502o = AbstractC0329z.t(new C1991e(0));

    /* renamed from: p, reason: collision with root package name */
    public final C0305m0 f18503p = AbstractC0329z.t(Boolean.FALSE);

    /* renamed from: q, reason: collision with root package name */
    public final x f18504q;

    /* renamed from: r, reason: collision with root package name */
    public final C0299j0 f18505r;

    /* renamed from: s, reason: collision with root package name */
    public float f18506s;

    /* renamed from: t, reason: collision with root package name */
    public C2006k f18507t;

    /* renamed from: u, reason: collision with root package name */
    public int f18508u;

    public C2195B(C2198b c2198b) {
        x xVar = new x(c2198b);
        xVar.f = new C0040k0(22, this);
        this.f18504q = xVar;
        this.f18505r = new C0299j0(0);
        this.f18506s = 1.0f;
        this.f18508u = -1;
    }

    @Override // n0.AbstractC2157b
    public final void b(float f) {
        this.f18506s = f;
    }

    @Override // n0.AbstractC2157b
    public final void d(C2006k c2006k) {
        this.f18507t = c2006k;
    }

    @Override // n0.AbstractC2157b
    public final long h() {
        return ((C1991e) this.f18502o.getValue()).f17204a;
    }

    @Override // n0.AbstractC2157b
    public final void i(C2733I c2733i) {
        C2006k c2006k = this.f18507t;
        x xVar = this.f18504q;
        if (c2006k == null) {
            c2006k = (C2006k) xVar.f18595g.getValue();
        }
        if (((Boolean) this.f18503p.getValue()).booleanValue() && c2733i.getLayoutDirection() == W0.m.f6017l) {
            C2022b c2022b = c2733i.f21647k;
            long Q5 = c2022b.Q();
            v3.e eVar = c2022b.f17540l;
            long A3 = eVar.A();
            eVar.v().k();
            try {
                ((C2023c) eVar.f20432l).z(-1.0f, 1.0f, Q5);
                xVar.e(c2733i, this.f18506s, c2006k);
            } finally {
                eVar.v().j();
                eVar.P(A3);
            }
        } else {
            xVar.e(c2733i, this.f18506s, c2006k);
        }
        this.f18508u = this.f18505r.h();
    }
}

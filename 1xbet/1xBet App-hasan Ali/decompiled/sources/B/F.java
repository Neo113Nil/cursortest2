package B;

import A.C0004d;
import m4.InterfaceC2104g;
import m4.InterfaceC2105h;
import x.P;
import z0.v0;

/* loaded from: classes.dex */
public final class F extends b0.o implements v0 {

    /* renamed from: A, reason: collision with root package name */
    public P f618A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f619B;

    /* renamed from: C, reason: collision with root package name */
    public H0.h f620C;

    /* renamed from: D, reason: collision with root package name */
    public final D f621D = new D(this, 0);

    /* renamed from: E, reason: collision with root package name */
    public D f622E;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC2104g f623y;

    /* renamed from: z, reason: collision with root package name */
    public C0004d f624z;

    public F(InterfaceC2104g interfaceC2104g, C0004d c0004d, P p5, boolean z3) {
        this.f623y = interfaceC2104g;
        this.f624z = c0004d;
        this.f618A = p5;
        this.f619B = z3;
        y0();
    }

    @Override // z0.v0
    public final /* synthetic */ boolean X() {
        return false;
    }

    @Override // z0.v0
    public final /* synthetic */ boolean Z() {
        return false;
    }

    @Override // z0.v0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // z0.v0
    public final void j0(H0.j jVar) {
        InterfaceC2105h[] interfaceC2105hArr = H0.u.f2183a;
        H0.v vVar = H0.s.f2167m;
        InterfaceC2105h[] interfaceC2105hArr2 = H0.u.f2183a;
        InterfaceC2105h interfaceC2105h = interfaceC2105hArr2[6];
        vVar.a(jVar, Boolean.TRUE);
        jVar.f(H0.s.f2153L, this.f621D);
        if (this.f618A == P.f20695k) {
            H0.h hVar = this.f620C;
            if (hVar == null) {
                kotlin.jvm.internal.l.k("scrollAxisRange");
                throw null;
            }
            H0.v vVar2 = H0.s.f2175u;
            InterfaceC2105h interfaceC2105h2 = interfaceC2105hArr2[12];
            vVar2.a(jVar, hVar);
        } else {
            H0.h hVar2 = this.f620C;
            if (hVar2 == null) {
                kotlin.jvm.internal.l.k("scrollAxisRange");
                throw null;
            }
            H0.v vVar3 = H0.s.f2174t;
            InterfaceC2105h interfaceC2105h3 = interfaceC2105hArr2[11];
            vVar3.a(jVar, hVar2);
        }
        D d5 = this.f622E;
        if (d5 != null) {
            jVar.f(H0.i.f, new H0.a(null, d5));
        }
        jVar.f(H0.i.f2078B, new H0.a(null, new A.B(16, new C(this, 0))));
        this.f624z.getClass();
        H0.b bVar = new H0.b(-1, 1);
        H0.v vVar4 = H0.s.f;
        InterfaceC2105h interfaceC2105h4 = interfaceC2105hArr2[22];
        vVar4.a(jVar, bVar);
    }

    @Override // b0.o
    public final boolean l0() {
        return false;
    }

    public final void y0() {
        this.f620C = new H0.h(new C(this, 1), new C(this, 2));
        this.f622E = this.f619B ? new D(this, 1) : null;
    }
}

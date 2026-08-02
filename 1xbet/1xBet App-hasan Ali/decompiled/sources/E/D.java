package E;

import A0.C0060u;
import m4.InterfaceC2105h;

/* loaded from: classes.dex */
public final class D extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P0.D f1009l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P0.w f1010m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f1011n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ P0.k f1012o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z f1013p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P0.q f1014q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I.O f1015r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g0.o f1016s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(P0.D d5, P0.w wVar, boolean z3, P0.k kVar, Z z5, P0.q qVar, I.O o5, g0.o oVar) {
        super(1);
        this.f1009l = d5;
        this.f1010m = wVar;
        this.f1011n = z3;
        this.f1012o = kVar;
        this.f1013p = z5;
        this.f1014q = qVar;
        this.f1015r = o5;
        this.f1016s = oVar;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        H0.j jVar = (H0.j) obj;
        P0.D d5 = this.f1009l;
        InterfaceC2105h[] interfaceC2105hArr = H0.u.f2183a;
        H0.v vVar = H0.s.f2148E;
        InterfaceC2105h[] interfaceC2105hArr2 = H0.u.f2183a;
        InterfaceC2105h interfaceC2105h = interfaceC2105hArr2[18];
        vVar.a(jVar, d5.f4618a);
        P0.w wVar = this.f1010m;
        H0.v vVar2 = H0.s.f2149F;
        InterfaceC2105h interfaceC2105h2 = interfaceC2105hArr2[19];
        long j5 = wVar.f4680b;
        vVar2.a(jVar, new K0.N(j5));
        W3.o oVar = W3.o.f6046a;
        boolean z3 = this.f1011n;
        if (!z3) {
            jVar.f(H0.s.i, oVar);
        }
        H0.v vVar3 = H0.s.f2154M;
        InterfaceC2105h interfaceC2105h3 = interfaceC2105hArr2[25];
        vVar3.a(jVar, Boolean.valueOf(z3));
        Z z5 = this.f1013p;
        H0.u.a(jVar, new C0116v(z5, 2));
        if (z3) {
            jVar.f(H0.i.f2086j, new H0.a(null, new C0116v(z5, jVar)));
            jVar.f(H0.i.f2090n, new H0.a(null, new B(z3, z5, jVar, wVar)));
        }
        P0.q qVar = this.f1014q;
        I.O o5 = this.f1015r;
        jVar.f(H0.i.i, new H0.a(null, new C(qVar, this.f1011n, wVar, o5, z5)));
        P0.k kVar = this.f1012o;
        int i = kVar.f4662e;
        C0060u c0060u = new C0060u(4, z5, kVar);
        jVar.f(H0.s.f2150G, new P0.j(i));
        jVar.f(H0.i.f2091o, new H0.a(null, c0060u));
        jVar.f(H0.i.f2080b, new H0.a(null, new C0060u(5, z5, this.f1016s)));
        jVar.f(H0.i.f2081c, new H0.a(null, new A(o5, 1)));
        if (!K0.N.b(j5)) {
            jVar.f(H0.i.f2092p, new H0.a(null, new A(o5, 2)));
            if (z3) {
                jVar.f(H0.i.f2093q, new H0.a(null, new A(o5, 3)));
            }
        }
        if (z3) {
            jVar.f(H0.i.f2094r, new H0.a(null, new A(o5, 0)));
        }
        return oVar;
    }
}

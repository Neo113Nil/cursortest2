package E;

import p4.AbstractC2282w;
import p4.InterfaceC2280u;

/* renamed from: E.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118x extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f1366l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f1367m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ P0.x f1368n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ P0.w f1369o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ P0.k f1370p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P0.q f1371q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I.O f1372r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2280u f1373s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C.c f1374t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0118x(Z z3, boolean z5, P0.x xVar, P0.w wVar, P0.k kVar, P0.q qVar, I.O o5, InterfaceC2280u interfaceC2280u, C.c cVar) {
        super(1);
        this.f1366l = z3;
        this.f1367m = z5;
        this.f1368n = xVar;
        this.f1369o = wVar;
        this.f1370p = kVar;
        this.f1371q = qVar;
        this.f1372r = o5;
        this.f1373s = interfaceC2280u;
        this.f1374t = cVar;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        F0 d5;
        g0.r rVar = (g0.r) obj;
        Z z3 = this.f1366l;
        if (z3.b() != rVar.a()) {
            z3.f.setValue(Boolean.valueOf(rVar.a()));
            boolean b3 = z3.b();
            P0.q qVar = this.f1371q;
            P0.w wVar = this.f1369o;
            if (b3 && this.f1367m) {
                W.j(this.f1368n, z3, wVar, this.f1370p, qVar);
            } else {
                W.g(z3);
            }
            if (rVar.a() && (d5 = z3.d()) != null) {
                AbstractC2282w.p(this.f1373s, null, new C0117w(this.f1374t, wVar, z3, d5, qVar, null), 3);
            }
            if (!rVar.a()) {
                this.f1372r.e(null);
            }
        }
        return W3.o.f6046a;
    }
}

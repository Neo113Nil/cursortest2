package u2;

import P.C0315s;
import s4.M;
import x0.InterfaceC2624j;
import z.C2715q;

/* loaded from: classes.dex */
public final class z implements i4.f {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ F2.i f20067k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ X.d f20068l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2497l f20069m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b0.d f20070n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2624j f20071o;

    public z(F2.i iVar, X.d dVar, C2497l c2497l, b0.d dVar2, InterfaceC2624j interfaceC2624j) {
        this.f20067k = iVar;
        this.f20068l = dVar;
        this.f20069m = c2497l;
        this.f20070n = dVar2;
        this.f20071o = interfaceC2624j;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        C2715q c2715q = (C2715q) obj;
        C0315s c0315s = (C0315s) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 14) == 0) {
            intValue |= c0315s.f(c2715q) ? 4 : 2;
        }
        if ((intValue & 91) == 18 && c0315s.B()) {
            c0315s.S();
        } else {
            r rVar = (r) this.f20067k;
            W0.a aVar = new W0.a(c2715q.f21565b);
            M m5 = rVar.f20031k;
            m5.getClass();
            m5.j(null, aVar);
            this.f20068l.b(new w(c2715q, this.f20069m, this.f20070n, this.f20071o), c0315s, 0);
        }
        return W3.o.f6046a;
    }
}

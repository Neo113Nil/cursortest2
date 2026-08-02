package H1;

import A0.C0022e0;
import G1.C0140k;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import a.AbstractC0444a;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0140k f2218l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f2219m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y.d f2220n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z.p f2221o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n f2222p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C0140k c0140k, o oVar, Y.d dVar, Z.p pVar, n nVar) {
        super(2);
        this.f2218l = c0140k;
        this.f2219m = oVar;
        this.f2220n = dVar;
        this.f2221o = pVar;
        this.f2222p = nVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        C0315s c0315s = (C0315s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            C0140k c0140k = this.f2218l;
            boolean h3 = c0315s.h(c0140k);
            o oVar = this.f2219m;
            boolean f = h3 | c0315s.f(oVar);
            Object M5 = c0315s.M();
            if (f || M5 == C0302l.f4480a) {
                M5 = new A.s(this.f2221o, c0140k, oVar, 4);
                c0315s.i0(M5);
            }
            AbstractC0329z.c(c0140k, (i4.c) M5, c0315s);
            AbstractC0444a.c(c0140k, this.f2220n, X.e.d(-497631156, new C0022e0(4, this.f2222p, c0140k), c0315s), c0315s, 384);
        }
        return W3.o.f6046a;
    }
}

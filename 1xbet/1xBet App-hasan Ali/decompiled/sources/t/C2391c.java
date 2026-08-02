package t;

import A.C0006f;
import A0.C0009a;
import E.E0;
import E.l0;
import P.C0302l;
import P.C0305m0;
import P.C0315s;
import a3.AbstractC0467k;
import u.t0;
import z0.Z;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2391c extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t0 f19359l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f19360m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i4.c f19361n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2400l f19362o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z.p f19363p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ X.d f19364q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2391c(t0 t0Var, Object obj, i4.c cVar, C2400l c2400l, Z.p pVar, X.d dVar) {
        super(2);
        this.f19359l = t0Var;
        this.f19360m = obj;
        this.f19361n = cVar;
        this.f19362o = c2400l;
        this.f19363p = pVar;
        this.f19364q = dVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        C0315s c0315s = (C0315s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            Object M5 = c0315s.M();
            Object obj3 = C0302l.f4480a;
            i4.c cVar = this.f19361n;
            C2400l c2400l = this.f19362o;
            if (M5 == obj3) {
                M5 = (u) cVar.c(c2400l);
                c0315s.i0(M5);
            }
            u uVar = (u) M5;
            t0 t0Var = this.f19359l;
            Object c5 = t0Var.f().c();
            Object obj4 = this.f19360m;
            boolean g5 = c0315s.g(kotlin.jvm.internal.l.a(c5, obj4));
            Object M6 = c0315s.M();
            if (g5 || M6 == obj3) {
                M6 = kotlin.jvm.internal.l.a(t0Var.f().c(), obj4) ? C2384F.f19341b : ((u) cVar.c(c2400l)).f19412b;
                c0315s.i0(M6);
            }
            C2384F c2384f = (C2384F) M6;
            Object M7 = c0315s.M();
            C0305m0 c0305m0 = t0Var.f19940d;
            if (M7 == obj3) {
                M7 = new C2397i(kotlin.jvm.internal.l.a(obj4, c0305m0.getValue()));
                c0315s.i0(M7);
            }
            C2397i c2397i = (C2397i) M7;
            C2383E c2383e = uVar.f19411a;
            boolean h3 = c0315s.h(uVar);
            Object M8 = c0315s.M();
            if (h3 || M8 == obj3) {
                M8 = new E0(3, uVar);
                c0315s.i0(M8);
            }
            b0.p b3 = androidx.compose.ui.layout.a.b((i4.f) M8);
            c2397i.f19378k.setValue(Boolean.valueOf(kotlin.jvm.internal.l.a(obj4, c0305m0.getValue())));
            b0.p d5 = AbstractC0467k.d((Z) b3, c2397i);
            boolean h4 = c0315s.h(obj4);
            Object M9 = c0315s.M();
            if (h4 || M9 == obj3) {
                M9 = new C0006f(1, obj4);
                c0315s.i0(M9);
            }
            i4.c cVar2 = (i4.c) M9;
            boolean f = c0315s.f(c2384f);
            Object M10 = c0315s.M();
            if (f || M10 == obj3) {
                M10 = new C0009a(10, c2384f);
                c0315s.i0(M10);
            }
            androidx.compose.animation.a.a(this.f19359l, cVar2, d5, c2383e, c2384f, (i4.e) M10, X.e.d(-616195562, new l0(this.f19363p, obj4, c2400l, this.f19364q, 1), c0315s), c0315s, 12582912);
        }
        return W3.o.f6046a;
    }
}

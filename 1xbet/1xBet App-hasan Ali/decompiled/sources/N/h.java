package N;

import A.B;
import K0.O;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.InterfaceC0314r0;
import b0.p;
import n.AbstractC2107A;
import u.r0;
import z.AbstractC2710l;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements i4.f {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r0 f3683l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f3684m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ O f3685n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i4.e f3686o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r0 r0Var, long j5, O o5, i4.e eVar) {
        super(3);
        this.f3683l = r0Var;
        this.f3684m = j5;
        this.f3685n = o5;
        this.f3686o = eVar;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        p pVar = (p) obj;
        C0315s c0315s = (C0315s) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c0315s.f(pVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && c0315s.B()) {
            c0315s.S();
        } else {
            r0 r0Var = this.f3683l;
            boolean f = c0315s.f(r0Var);
            Object M5 = c0315s.M();
            if (f || M5 == C0302l.f4480a) {
                M5 = new B(19, r0Var);
                c0315s.i0(M5);
            }
            p a5 = androidx.compose.ui.graphics.a.a(pVar, (i4.c) M5);
            x0.O e3 = AbstractC2710l.e(b0.c.f7137k, false);
            int p5 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l5 = c0315s.l();
            p c5 = b0.a.c(c0315s, a5);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, C2752i.f21833e, e3);
            AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
            C2751h c2751h = C2752i.f;
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s, p5, c2751h);
            }
            AbstractC0329z.y(c0315s, C2752i.f21831c, c5);
            n.b(this.f3684m, this.f3685n, this.f3686o, c0315s, 0);
            c0315s.q(true);
        }
        return W3.o.f6046a;
    }
}

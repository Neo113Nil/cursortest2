package M;

import P.AbstractC0329z;
import P.C0315s;
import P.InterfaceC0314r0;
import n.AbstractC2107A;
import z.AbstractC2685I;
import z.AbstractC2706h;
import z.AbstractC2710l;
import z.C2681E;
import z.C2686J;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f3481l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2681E f3482m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ X.d f3483n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f3484o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ X.d f3485p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(float f, C2681E c2681e, X.d dVar, long j5, X.d dVar2, long j6) {
        super(2);
        this.f3481l = f;
        this.f3482m = c2681e;
        this.f3483n = dVar;
        this.f3484o = j5;
        this.f3485p = dVar2;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        C0315s c0315s = (C0315s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            b0.m mVar = b0.m.f7161k;
            b0.p e3 = androidx.compose.foundation.layout.b.e(androidx.compose.foundation.layout.c.a(mVar, Float.NaN, this.f3481l), this.f3482m);
            C0246q c0246q = C0246q.f3441a;
            int p5 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l5 = c0315s.l();
            b0.p c5 = b0.a.c(c0315s, e3);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            C2751h c2751h = C2752i.f21833e;
            AbstractC0329z.y(c0315s, c2751h, c0246q);
            C2751h c2751h2 = C2752i.f21832d;
            AbstractC0329z.y(c0315s, c2751h2, l5);
            C2751h c2751h3 = C2752i.f;
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s, p5, c2751h3);
            }
            C2751h c2751h4 = C2752i.f21831c;
            AbstractC0329z.y(c0315s, c2751h4, c5);
            c0315s.X(-1293169671);
            b0.h hVar = b0.c.f7141o;
            X.d dVar = this.f3483n;
            if (dVar != null) {
                b0.p c6 = androidx.compose.ui.layout.a.c(mVar, "leadingIcon");
                x0.O e5 = AbstractC2710l.e(hVar, false);
                int p6 = AbstractC0329z.p(c0315s);
                InterfaceC0314r0 l6 = c0315s.l();
                b0.p c7 = b0.a.c(c0315s, c6);
                c0315s.b0();
                if (c0315s.f4530S) {
                    c0315s.k(c2768z);
                } else {
                    c0315s.l0();
                }
                AbstractC0329z.y(c0315s, c2751h, e5);
                AbstractC0329z.y(c0315s, c2751h2, l6);
                if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p6))) {
                    AbstractC2107A.y(p6, c0315s, p6, c2751h3);
                }
                AbstractC0329z.y(c0315s, c2751h4, c7);
                if (dVar != null) {
                    c0315s.X(832788565);
                    AbstractC0329z.a(AbstractC0253y.f3582a.a(new i0.p(this.f3484o)), dVar, c0315s, 8);
                    c0315s.q(false);
                } else {
                    c0315s.X(833040347);
                    c0315s.q(false);
                }
                c0315s.q(true);
            }
            c0315s.q(false);
            b0.p g5 = androidx.compose.foundation.layout.b.g(androidx.compose.ui.layout.a.c(mVar, "label"), AbstractC0248t.f3496a, 0);
            C2686J a5 = AbstractC2685I.a(AbstractC2706h.f21534a, b0.c.f7147u, c0315s, 54);
            int p7 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l7 = c0315s.l();
            b0.p c8 = b0.a.c(c0315s, g5);
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, c2751h, a5);
            AbstractC0329z.y(c0315s, c2751h2, l7);
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p7))) {
                AbstractC2107A.y(p7, c0315s, p7, c2751h3);
            }
            AbstractC0329z.y(c0315s, c2751h4, c8);
            this.f3485p.invoke(c0315s, 0);
            c0315s.q(true);
            c0315s.X(-1293135324);
            c0315s.q(false);
            c0315s.q(true);
        }
        return W3.o.f6046a;
    }
}

package z;

import A0.C0009a;
import P.AbstractC0329z;
import P.C0315s;
import P.C0326x0;
import P.InterfaceC0314r0;
import a.AbstractC0444a;
import java.util.HashMap;
import n.AbstractC2107A;
import x0.Y;
import x0.Z;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* renamed from: z.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2710l {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f21547a = c(true);

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f21548b = c(false);

    /* renamed from: c, reason: collision with root package name */
    public static final C2709k f21549c;

    static {
        new C2713o(b0.c.f7137k, false);
        f21549c = C2709k.f21544b;
    }

    public static final void a(b0.p pVar, C0315s c0315s, int i) {
        c0315s.Z(-211209833);
        if ((((c0315s.f(pVar) ? 4 : 2) | i) & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            int p5 = AbstractC0329z.p(c0315s);
            b0.p c5 = b0.a.c(c0315s, pVar);
            InterfaceC0314r0 l5 = c0315s.l();
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, C2752i.f21833e, f21549c);
            AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
            AbstractC0329z.y(c0315s, C2752i.f21831c, c5);
            C2751h c2751h = C2752i.f;
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s, p5, c2751h);
            }
            c0315s.q(true);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0009a(i, 13, pVar);
        }
    }

    public static final void b(Y y5, Z z3, x0.N n5, W0.m mVar, int i, int i5, b0.d dVar) {
        b0.h hVar;
        Object k5 = n5.k();
        C2707i c2707i = k5 instanceof C2707i ? (C2707i) k5 : null;
        Y.h(y5, z3, ((c2707i == null || (hVar = c2707i.f21539y) == null) ? dVar : hVar).a(AbstractC0444a.b(z3.f20973k, z3.f20974l), AbstractC0444a.b(i, i5), mVar));
    }

    public static final HashMap c(boolean z3) {
        HashMap hashMap = new HashMap(9);
        d(hashMap, z3, b0.c.f7137k);
        d(hashMap, z3, b0.c.f7138l);
        d(hashMap, z3, b0.c.f7139m);
        d(hashMap, z3, b0.c.f7140n);
        d(hashMap, z3, b0.c.f7141o);
        d(hashMap, z3, b0.c.f7142p);
        d(hashMap, z3, b0.c.f7143q);
        d(hashMap, z3, b0.c.f7144r);
        d(hashMap, z3, b0.c.f7145s);
        return hashMap;
    }

    public static final void d(HashMap hashMap, boolean z3, b0.h hVar) {
        hashMap.put(hVar, new C2713o(hVar, z3));
    }

    public static final x0.O e(b0.d dVar, boolean z3) {
        x0.O o5 = (x0.O) (z3 ? f21547a : f21548b).get(dVar);
        return o5 == null ? new C2713o(dVar, z3) : o5;
    }
}

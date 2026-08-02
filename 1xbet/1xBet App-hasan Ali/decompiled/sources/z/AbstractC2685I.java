package z;

import P.C0302l;
import P.C0315s;

/* renamed from: z.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2685I {

    /* renamed from: a, reason: collision with root package name */
    public static final C2686J f21481a = new C2686J(AbstractC2706h.f21534a, b0.c.f7146t);

    public static final C2686J a(InterfaceC2702d interfaceC2702d, b0.g gVar, C0315s c0315s, int i) {
        if (kotlin.jvm.internal.l.a(interfaceC2702d, AbstractC2706h.f21534a) && kotlin.jvm.internal.l.a(gVar, b0.c.f7146t)) {
            c0315s.X(-849081669);
            c0315s.q(false);
            return f21481a;
        }
        c0315s.X(-849030798);
        boolean z3 = true;
        boolean z5 = (((i & 14) ^ 6) > 4 && c0315s.f(interfaceC2702d)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !c0315s.f(gVar)) && (i & 48) != 32) {
            z3 = false;
        }
        boolean z6 = z5 | z3;
        Object M5 = c0315s.M();
        if (z6 || M5 == C0302l.f4480a) {
            M5 = new C2686J(interfaceC2702d, gVar);
            c0315s.i0(M5);
        }
        C2686J c2686j = (C2686J) M5;
        c0315s.q(false);
        return c2686j;
    }
}

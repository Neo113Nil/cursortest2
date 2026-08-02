package z;

import P.C0302l;
import P.C0315s;

/* renamed from: z.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2716r {

    /* renamed from: a, reason: collision with root package name */
    public static final C2717s f21566a = new C2717s(AbstractC2706h.f21535b, b0.c.f7148v);

    public static final C2717s a(InterfaceC2704f interfaceC2704f, b0.f fVar, C0315s c0315s, int i) {
        if (kotlin.jvm.internal.l.a(interfaceC2704f, AbstractC2706h.f21535b) && fVar.equals(b0.c.f7148v)) {
            c0315s.X(345962472);
            c0315s.q(false);
            return f21566a;
        }
        c0315s.X(346016319);
        boolean z3 = true;
        boolean z5 = (((i & 14) ^ 6) > 4 && c0315s.f(interfaceC2704f)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !c0315s.f(fVar)) && (i & 48) != 32) {
            z3 = false;
        }
        boolean z6 = z5 | z3;
        Object M5 = c0315s.M();
        if (z6 || M5 == C0302l.f4480a) {
            M5 = new C2717s(interfaceC2704f, fVar);
            c0315s.i0(M5);
        }
        C2717s c2717s = (C2717s) M5;
        c0315s.q(false);
        return c2717s;
    }
}

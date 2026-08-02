package w;

import A0.C0022e0;
import E.C0107l;
import E.z0;
import P.C0315s;
import P.C0326x0;
import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Z.p f20464a = new Z.p();

    public static void b(h hVar, C0107l c0107l, boolean z3, InterfaceC2015a interfaceC2015a) {
        hVar.getClass();
        hVar.f20464a.add(new X.d(262103052, new z0(c0107l, z3, interfaceC2015a), true));
    }

    public final void a(C2539b c2539b, C0315s c0315s, int i) {
        c0315s.Z(1320309496);
        int i5 = (c0315s.f(c2539b) ? 4 : 2) | i | (c0315s.f(this) ? 32 : 16);
        if ((i5 & 19) == 18 && c0315s.B()) {
            c0315s.S();
        } else {
            Z.p pVar = this.f20464a;
            int size = pVar.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((i4.f) pVar.get(i6)).b(c2539b, c0315s, Integer.valueOf(i5 & 14));
            }
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0022e0(i, 15, this, c2539b);
        }
    }
}

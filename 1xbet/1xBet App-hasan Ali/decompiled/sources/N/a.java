package N;

import K0.O;
import K0.y;
import K0.z;
import M.AbstractC0253y;
import M.u0;
import P.AbstractC0329z;
import P.C0315s;
import P.C0322v0;
import P.C0326x0;
import P.D;
import i0.p;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final z f3664a = new z(null, new y());

    public static final void a(long j5, O o5, i4.e eVar, C0315s c0315s, int i) {
        int i5;
        c0315s.Z(-716124955);
        if ((i & 6) == 0) {
            i5 = (c0315s.e(j5) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.f(o5) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= c0315s.h(eVar) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && c0315s.B()) {
            c0315s.S();
        } else {
            D d5 = u0.f3551a;
            AbstractC0329z.b(new C0322v0[]{AbstractC0253y.f3582a.a(new p(j5)), d5.a(((O) c0315s.j(d5)).d(o5))}, eVar, c0315s, ((i5 >> 3) & 112) | 8);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new d(j5, o5, eVar, i, 0);
        }
    }
}

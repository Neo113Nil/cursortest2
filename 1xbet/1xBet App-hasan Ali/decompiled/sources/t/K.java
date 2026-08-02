package t;

import P.C0302l;
import P.C0315s;
import P.d1;
import u.A0;
import u.AbstractC2459g;
import u.B0;
import u.z0;

/* loaded from: classes.dex */
public abstract class K {
    public static final d1 a(long j5, z0 z0Var, C0315s c0315s, int i, int i5) {
        String str = (i5 & 4) != 0 ? "ColorAnimation" : "tileBg";
        boolean f = c0315s.f(i0.p.f(j5));
        Object M5 = c0315s.M();
        if (f || M5 == C0302l.f4480a) {
            j0.c f5 = i0.p.f(j5);
            t tVar = t.f19406m;
            A.B b3 = new A.B(28, f5);
            A0 a02 = B0.f19645a;
            A0 a03 = new A0(tVar, b3);
            c0315s.i0(a03);
            M5 = a03;
        }
        return AbstractC2459g.a(new i0.p(j5), (A0) M5, z0Var, str, c0315s, 384 | ((i << 6) & 57344));
    }
}

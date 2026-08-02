package Q;

import I.C0160m;
import P.AbstractC0317t;
import P.C0280a;
import P.InterfaceC0284c;
import P.M0;
import P.P0;
import Q2.C0;

/* loaded from: classes.dex */
public final class t extends I {

    /* renamed from: c, reason: collision with root package name */
    public static final t f4844c = new t(0, 3, 1);

    @Override // Q.I
    public final void a(C0160m c0160m, InterfaceC0284c interfaceC0284c, P0 p02, C0 c02, J j5) {
        v3.g gVar;
        M0 m02 = (M0) c0160m.e(1);
        C0280a c0280a = (C0280a) c0160m.e(0);
        C0338c c0338c = (C0338c) c0160m.e(2);
        P0 f = m02.f();
        if (j5 != null) {
            try {
                gVar = new v3.g(10, j5, p02);
            } catch (Throwable th) {
                f.e(false);
                throw th;
            }
        } else {
            gVar = null;
        }
        if (!c0338c.f4824g.u0()) {
            AbstractC0317t.c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        c0338c.f.t0(interfaceC0284c, f, c02, gVar);
        f.e(true);
        p02.d();
        c0280a.getClass();
        p02.z(m02, m02.c(c0280a));
        p02.k();
    }
}

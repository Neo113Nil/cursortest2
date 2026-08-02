package u;

import A0.C0060u;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.InterfaceC0289e0;
import P.d1;
import a.AbstractC0444a;
import i4.InterfaceC2015a;

/* renamed from: u.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2459g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f19814a = 0;

    static {
        Object obj = G0.f19673a;
        AbstractC0444a.d(0.5f, 0.5f);
        G4.d.d(0.5f, 0.5f);
    }

    public static final d1 a(Object obj, A0 a02, InterfaceC2464k interfaceC2464k, String str, C0315s c0315s, int i) {
        Object obj2 = C0302l.f4480a;
        Object M5 = c0315s.M();
        if (M5 == obj2) {
            M5 = AbstractC0329z.t(null);
            c0315s.i0(M5);
        }
        InterfaceC0289e0 interfaceC0289e0 = (InterfaceC0289e0) M5;
        Object M6 = c0315s.M();
        if (M6 == obj2) {
            M6 = new C2451c(obj, a02, null);
            c0315s.i0(M6);
        }
        C2451c c2451c = (C2451c) M6;
        InterfaceC0289e0 w5 = AbstractC0329z.w(null, c0315s);
        InterfaceC0289e0 w6 = AbstractC0329z.w(interfaceC2464k, c0315s);
        Object M7 = c0315s.M();
        if (M7 == obj2) {
            M7 = r4.j.a(-1, 6, null);
            c0315s.i0(M7);
        }
        r4.g gVar = (r4.g) M7;
        boolean h3 = c0315s.h(gVar) | c0315s.h(obj);
        Object M8 = c0315s.M();
        if (h3 || M8 == obj2) {
            M8 = new C0060u(11, gVar, obj);
            c0315s.i0(M8);
        }
        AbstractC0329z.g((InterfaceC2015a) M8, c0315s);
        boolean h4 = c0315s.h(gVar) | c0315s.h(c2451c) | c0315s.f(w6) | c0315s.f(w5);
        Object M9 = c0315s.M();
        if (h4 || M9 == obj2) {
            Object c2457f = new C2457f(gVar, c2451c, w6, w5, null);
            c0315s.i0(c2457f);
            M9 = c2457f;
        }
        AbstractC0329z.e(c0315s, (i4.e) M9, gVar);
        d1 d1Var = (d1) interfaceC0289e0.getValue();
        return d1Var == null ? c2451c.f19762c : d1Var;
    }
}

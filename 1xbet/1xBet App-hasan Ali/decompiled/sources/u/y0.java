package u;

import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;

/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f19969a = G4.d.D(W3.f.f6034k, u0.f19952l);

    /* JADX WARN: Type inference failed for: r2v4, types: [i4.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r4v3, types: [i4.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r5v5, types: [i4.c, kotlin.jvm.internal.m] */
    public static final o0 a(t0 t0Var, A0 a02, String str, C0315s c0315s, int i, int i5) {
        n0 n0Var;
        if ((i5 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean f = c0315s.f(t0Var);
        Object M5 = c0315s.M();
        Object obj = C0302l.f4480a;
        if (f || M5 == obj) {
            M5 = new o0(t0Var, a02, str);
            c0315s.i0(M5);
        }
        o0 o0Var = (o0) M5;
        boolean f5 = c0315s.f(t0Var) | c0315s.h(o0Var);
        Object M6 = c0315s.M();
        if (f5 || M6 == obj) {
            M6 = new i0.K(7, t0Var, o0Var);
            c0315s.i0(M6);
        }
        AbstractC0329z.c(o0Var, (i4.c) M6, c0315s);
        if (t0Var.g() && (n0Var = (n0) o0Var.f19891b.getValue()) != null) {
            ?? r22 = n0Var.f19885m;
            t0 t0Var2 = o0Var.f19892c;
            n0Var.f19883k.g(r22.c(t0Var2.f().b()), n0Var.f19885m.c(t0Var2.f().c()), (InterfaceC2430A) n0Var.f19884l.c(t0Var2.f()));
        }
        return o0Var;
    }

    public static final r0 b(t0 t0Var, Object obj, Object obj2, InterfaceC2430A interfaceC2430A, A0 a02, C0315s c0315s) {
        boolean f = c0315s.f(t0Var);
        Object M5 = c0315s.M();
        Object obj3 = C0302l.f4480a;
        if (f || M5 == obj3) {
            AbstractC2470q abstractC2470q = (AbstractC2470q) a02.f19643a.c(obj2);
            abstractC2470q.d();
            M5 = new r0(t0Var, obj, abstractC2470q, a02);
            c0315s.i0(M5);
        }
        r0 r0Var = (r0) M5;
        if (t0Var.g()) {
            r0Var.g(obj, obj2, interfaceC2430A);
        } else {
            r0Var.h(obj2, interfaceC2430A);
        }
        boolean f5 = c0315s.f(t0Var) | c0315s.f(r0Var);
        Object M6 = c0315s.M();
        if (f5 || M6 == obj3) {
            M6 = new i0.K(8, t0Var, r0Var);
            c0315s.i0(M6);
        }
        AbstractC0329z.c(r0Var, (i4.c) M6, c0315s);
        return r0Var;
    }
}

package b0;

import A0.C0009a;
import P.C0315s;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final e f7134a = new e(-1.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final e f7135b = new e(1.0f);

    public static final p a(p pVar, i4.f fVar) {
        return pVar.c(new k(fVar));
    }

    public static final p b(C0315s c0315s, p pVar) {
        if (pVar.j(l.f7160l)) {
            return pVar;
        }
        c0315s.Y(1219399079);
        p pVar2 = (p) pVar.d(new C0009a(9, c0315s), m.f7161k);
        c0315s.q(false);
        return pVar2;
    }

    public static final p c(C0315s c0315s, p pVar) {
        c0315s.X(439770924);
        p b3 = b(c0315s, pVar);
        c0315s.q(false);
        return b3;
    }
}

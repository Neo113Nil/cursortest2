package G4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k4.AbstractC1341c;
import k4.C1343e;

/* loaded from: classes2.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2871a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2872b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2873c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2874d;

    public A(boolean z4) {
        this.f2871a = z4;
    }

    public static C1343e b(E4.C c3, AbstractC1341c abstractC1341c) {
        C1343e c1343e = new C1343e(Collections.emptyList(), c3.a());
        Iterator it = abstractC1341c.iterator();
        while (it.hasNext()) {
            H4.k kVar = (H4.k) ((Map.Entry) it.next()).getValue();
            if (c3.g(kVar)) {
                c1343e = c1343e.l(kVar);
            }
        }
        return c1343e;
    }

    public static boolean d(E4.C c3, int i7, C1343e c1343e, H4.n nVar) {
        if (!(c3.f2097h != -1)) {
            return false;
        }
        AbstractC1341c abstractC1341c = c1343e.f14775a;
        if (i7 != abstractC1341c.size()) {
            return true;
        }
        H4.k kVar = c3.f2098i == 1 ? (H4.k) abstractC1341c.y() : (H4.k) abstractC1341c.z();
        if (kVar == null) {
            return false;
        }
        return kVar.c() || t.e.b(kVar.f3328f, 2) || kVar.f3325c.compareTo(nVar) > 0;
    }

    public AbstractC1341c a(C1343e c1343e, E4.C c3, H4.b bVar) {
        AbstractC1341c x4 = ((k1.g) this.f2873c).x(c3, bVar, null);
        Iterator it = c1343e.iterator();
        while (true) {
            E3.F f7 = (E3.F) it;
            if (!((Iterator) f7.f1994b).hasNext()) {
                return x4;
            }
            H4.k kVar = (H4.k) f7.next();
            x4 = x4.D(kVar.f3323a, kVar);
        }
    }

    public void c(Y5.a... aVarArr) {
        if (!this.f2871a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[aVarArr.length];
        for (int i7 = 0; i7 < aVarArr.length; i7++) {
            strArr[i7] = aVarArr[i7].f7770a;
        }
        this.f2873c = strArr;
    }

    public AbstractC1341c e(E4.C c3) {
        if (c3.h()) {
            return null;
        }
        E4.I i7 = c3.i();
        int m7 = ((InterfaceC0273f) this.f2874d).m(i7);
        if (t.e.b(m7, 1)) {
            return null;
        }
        if ((c3.f2097h != -1) && t.e.b(m7, 2)) {
            return e(c3.f(-1L));
        }
        List F7 = ((InterfaceC0273f) this.f2874d).F(i7);
        p3.f.O("index manager must return results for partial and full indexes.", F7 != null, new Object[0]);
        AbstractC1341c v6 = ((k1.g) this.f2873c).v(F7);
        H4.b L7 = ((InterfaceC0273f) this.f2874d).L(i7);
        C1343e b7 = b(c3, v6);
        return d(c3, ((ArrayList) F7).size(), b7, L7.f3305a) ? e(c3.f(-1L)) : a(b7, c3, L7);
    }

    public void f(Y5.l... lVarArr) {
        if (!this.f2871a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (lVarArr.length == 0) {
            throw new IllegalArgumentException("At least one TlsVersion is required");
        }
        String[] strArr = new String[lVarArr.length];
        for (int i7 = 0; i7 < lVarArr.length; i7++) {
            strArr[i7] = lVarArr[i7].f7817a;
        }
        this.f2874d = strArr;
    }

    public A(Y5.b bVar) {
        this.f2871a = bVar.f7772a;
        this.f2873c = bVar.f7773b;
        this.f2874d = bVar.f7774c;
        this.f2872b = bVar.f7775d;
    }
}

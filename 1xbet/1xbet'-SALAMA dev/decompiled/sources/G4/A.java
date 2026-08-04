package G4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2874d;

    public A(boolean z4) {
        this.f2871a = z4;
    }

    public static p075k4.e b(E4.C c3, p075k4.c cVar) {
        p075k4.e eVar = new p075k4.e(Collections.emptyList(), c3.a());
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            H4.k kVar = (H4.k) ((Map.Entry) it.next()).getValue();
            if (c3.g(kVar)) {
                eVar = eVar.l(kVar);
            }
        }
        return eVar;
    }

    public static boolean d(E4.C c3, int i7, p075k4.e eVar, H4.n nVar) {
        if (!(c3.f2097h != -1)) {
            return false;
        }
        p075k4.c cVar = eVar.f14781a;
        if (i7 != cVar.size()) {
            return true;
        }
        H4.k kVar = c3.f2098i == 1 ? (H4.k) cVar.y() : (H4.k) cVar.z();
        if (kVar == null) {
            return false;
        }
        return kVar.c() || p136t.e.b(kVar.f3328f, 2) || kVar.f3325c.compareTo(nVar) > 0;
    }

    public p075k4.c a(p075k4.e eVar, E4.C c3, H4.b bVar) {
        p075k4.c cVarX = ((p072k1.g) this.f2873c).x(c3, bVar, null);
        Iterator it = eVar.iterator();
        while (true) {
            E3.F f7 = (E3.F) it;
            if (!((Iterator) f7.f1994b).hasNext()) {
                return cVarX;
            }
            H4.k kVar = (H4.k) f7.next();
            cVarX = cVarX.D(kVar.f3323a, kVar);
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

    public p075k4.c e(E4.C c3) {
        if (c3.h()) {
            return null;
        }
        E4.I i7 = c3.i();
        int iM = ((InterfaceC0273f) this.f2874d).m(i7);
        if (p136t.e.b(iM, 1)) {
            return null;
        }
        if ((c3.f2097h != -1) && p136t.e.b(iM, 2)) {
            return e(c3.f(-1L));
        }
        List listF = ((InterfaceC0273f) this.f2874d).F(i7);
        p113p3.f.O("index manager must return results for partial and full indexes.", listF != null, new Object[0]);
        p075k4.c cVarV = ((p072k1.g) this.f2873c).v(listF);
        H4.b bVarL = ((InterfaceC0273f) this.f2874d).L(i7);
        p075k4.e eVarB = b(c3, cVarV);
        return d(c3, ((ArrayList) listF).size(), eVarB, bVarL.f3305a) ? e(c3.f(-1L)) : a(eVarB, c3, bVarL);
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

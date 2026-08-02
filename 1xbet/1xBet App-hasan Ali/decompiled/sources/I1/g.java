package I1;

import X3.s;
import X3.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import r0.AbstractC2346c;
import s4.C;
import s4.M;
import s4.x;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final M f2577a = C.b(h.f2589n);

    /* renamed from: b, reason: collision with root package name */
    public final M f2578b;

    /* renamed from: c, reason: collision with root package name */
    public final x f2579c;

    /* renamed from: d, reason: collision with root package name */
    public final X3.k f2580d;

    /* renamed from: e, reason: collision with root package name */
    public final X3.k f2581e;
    public d f;

    /* renamed from: g, reason: collision with root package name */
    public int f2582g;

    /* renamed from: h, reason: collision with root package name */
    public f f2583h;
    public final LinkedHashSet i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f2584j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f2585k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2586l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2587m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2588n;

    public g() {
        M b3 = C.b(new e());
        this.f2578b = b3;
        this.f2579c = new x(b3);
        this.f2580d = new X3.k();
        this.f2581e = new X3.k();
        this.i = new LinkedHashSet();
        this.f2584j = new LinkedHashSet();
        this.f2585k = new LinkedHashSet();
    }

    public final void a(m2.g gVar, f fVar, int i) {
        kotlin.jvm.internal.l.f("dispatcher", gVar);
        if (fVar.f2575a == null) {
            (i != 0 ? i != 1 ? this.i : this.f2584j : this.f2585k).add(fVar);
            fVar.f2575a = gVar;
            kotlin.jvm.internal.l.f("history", (e) ((M) this.f2579c.f19316k).getValue());
            fVar.b(i != 0 ? i != 1 ? this.f2588n : this.f2586l : this.f2587m);
            return;
        }
        throw new IllegalArgumentException(("Input '" + fVar + "' is already added to dispatcher " + fVar.f2575a + '.').toString());
    }

    public final void b() {
        boolean z3;
        boolean z5;
        e eVar;
        X3.k kVar = this.f2580d;
        if (!(kVar != null) || !kVar.isEmpty()) {
            Iterator it = kVar.iterator();
            while (it.hasNext()) {
                if (((d) it.next()).f2571b) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        X3.k kVar2 = this.f2581e;
        if (kVar2 == null || !kVar2.isEmpty()) {
            Iterator it2 = kVar2.iterator();
            while (it2.hasNext()) {
                if (((d) it2.next()).f2571b) {
                    z5 = true;
                    break;
                }
            }
        }
        z5 = false;
        boolean z6 = z3 || z5;
        boolean z7 = this.f2587m != z3;
        boolean z8 = this.f2586l != z5;
        boolean z9 = this.f2588n != z6;
        LinkedHashSet linkedHashSet = this.f2585k;
        if (z7) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((f) it3.next()).b(z3);
            }
        }
        LinkedHashSet linkedHashSet2 = this.f2584j;
        if (z8) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((f) it4.next()).b(z5);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z9) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((f) it5.next()).b(z6);
            }
        }
        this.f2587m = z3;
        this.f2586l = z5;
        this.f2588n = z6;
        d dVar = this.f;
        if (dVar == null) {
            dVar = c(0);
        }
        d dVar2 = this.f;
        if (dVar2 == null) {
            dVar2 = c(0);
        }
        if (kotlin.jvm.internal.l.a(dVar2, dVar)) {
            if (dVar2 == null) {
                eVar = new e();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = kVar.iterator();
                while (it6.hasNext()) {
                    boolean z10 = ((d) it6.next()).f2571b;
                }
                Iterator<E> it7 = kVar2.iterator();
                while (it7.hasNext()) {
                    boolean z11 = ((d) it7.next()).f2571b;
                }
                v vVar = v.f6090k;
                AbstractC2346c abstractC2346c = dVar2.f2570a;
                Y3.c cVar = new Y3.c(10);
                s.U(arrayList, cVar);
                cVar.add(abstractC2346c);
                s.U(vVar, cVar);
                eVar = new e(arrayList.size(), AbstractC2346c.e(cVar));
            }
            M m5 = this.f2578b;
            if (kotlin.jvm.internal.l.a((e) m5.getValue(), eVar)) {
                return;
            }
            m5.j(null, eVar);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((f) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((f) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((f) it10.next()).getClass();
            }
        }
    }

    public final d c(int i) {
        Object obj;
        Object obj2;
        X3.k kVar = this.f2581e;
        X3.k kVar2 = this.f2580d;
        Object obj3 = null;
        if (i == -1) {
            Iterator it = kVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((d) obj).f2571b) {
                    break;
                }
            }
            d dVar = (d) obj;
            if (dVar != null) {
                return dVar;
            }
            Iterator it2 = kVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((d) next).f2571b) {
                    obj3 = next;
                    break;
                }
            }
            return (d) obj3;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = kVar2.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).getClass();
            }
            Iterator it4 = kVar.iterator();
            while (it4.hasNext()) {
                ((d) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = kVar2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((d) obj2).f2571b) {
                break;
            }
        }
        d dVar2 = (d) obj2;
        if (dVar2 != null) {
            return dVar2;
        }
        Iterator it6 = kVar.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next2 = it6.next();
            if (((d) next2).f2571b) {
                obj3 = next2;
                break;
            }
        }
        return (d) obj3;
    }
}

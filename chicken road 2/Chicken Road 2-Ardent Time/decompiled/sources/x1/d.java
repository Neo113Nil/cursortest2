package x1;

/* loaded from: classes.dex */
public abstract class d extends x1.e {
    public static x1.c E(java.util.Iterator it) {
        kotlin.jvm.internal.i.e(it, "<this>");
        return new x1.a(new i1.C0197p(1, it));
    }

    public static java.util.List F(x1.c cVar) {
        java.util.Iterator it = cVar.iterator();
        if (!it.hasNext()) {
            return i1.C0199r.f3325a;
        }
        java.lang.Object next = it.next();
        if (!it.hasNext()) {
            return u0.AbstractC0995a.q(next);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static java.util.Set G(x1.c cVar) {
        java.util.Iterator it = cVar.iterator();
        if (!it.hasNext()) {
            return i1.C0201t.f3327a;
        }
        java.lang.Object next = it.next();
        if (!it.hasNext()) {
            java.util.Set singleton = java.util.Collections.singleton(next);
            kotlin.jvm.internal.i.d(singleton, "singleton(...)");
            return singleton;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }
}

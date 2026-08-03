package i1;

/* renamed from: i1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0202u extends i1.AbstractC0203v {
    public static java.util.Map G(h1.C0172d... c0172dArr) {
        if (c0172dArr.length <= 0) {
            return i1.C0200s.f3326a;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(i1.AbstractC0203v.E(c0172dArr.length));
        H(linkedHashMap, c0172dArr);
        return linkedHashMap;
    }

    public static final void H(java.util.LinkedHashMap linkedHashMap, h1.C0172d[] c0172dArr) {
        for (h1.C0172d c0172d : c0172dArr) {
            linkedHashMap.put(c0172d.f3295a, c0172d.f3296b);
        }
    }

    public static java.util.List I(java.util.Map map) {
        int size = map.size();
        i1.C0199r c0199r = i1.C0199r.f3325a;
        if (size == 0) {
            return c0199r;
        }
        java.util.Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return c0199r;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
        if (!it.hasNext()) {
            return u0.AbstractC0995a.q(new h1.C0172d(entry.getKey(), entry.getValue()));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        arrayList.add(new h1.C0172d(entry.getKey(), entry.getValue()));
        do {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
            arrayList.add(new h1.C0172d(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static java.util.Map J(java.util.ArrayList arrayList) {
        i1.C0200s c0200s = i1.C0200s.f3326a;
        int size = arrayList.size();
        if (size == 0) {
            return c0200s;
        }
        if (size == 1) {
            return i1.AbstractC0203v.F((h1.C0172d) arrayList.get(0));
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(i1.AbstractC0203v.E(arrayList.size()));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h1.C0172d c0172d = (h1.C0172d) it.next();
            linkedHashMap.put(c0172d.f3295a, c0172d.f3296b);
        }
        return linkedHashMap;
    }

    public static java.util.Map K(java.util.Map map) {
        kotlin.jvm.internal.i.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return i1.C0200s.f3326a;
        }
        if (size != 1) {
            return L(map);
        }
        kotlin.jvm.internal.i.e(map, "<this>");
        java.util.Map.Entry entry = (java.util.Map.Entry) map.entrySet().iterator().next();
        java.util.Map singletonMap = java.util.Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.i.d(singletonMap, "with(...)");
        return singletonMap;
    }

    public static java.util.LinkedHashMap L(java.util.Map map) {
        kotlin.jvm.internal.i.e(map, "<this>");
        return new java.util.LinkedHashMap(map);
    }
}

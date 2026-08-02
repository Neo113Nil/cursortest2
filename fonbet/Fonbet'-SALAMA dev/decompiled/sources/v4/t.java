package v4;

/* loaded from: classes2.dex */
public final class t extends k {

    /* renamed from: a, reason: collision with root package name */
    public static final t f17199a = new t();

    @Override // v4.k
    public final String a() {
        throw new IllegalArgumentException("Can't get query definition on priority index!");
    }

    @Override // v4.k
    public final boolean b(r rVar) {
        return !rVar.e().isEmpty();
    }

    @Override // v4.k
    public final p c(c cVar, r rVar) {
        return new p(cVar, new v("[PRIORITY-POST]", rVar));
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        p pVar = (p) obj;
        p pVar2 = (p) obj2;
        int compareTo = pVar.f17196b.e().compareTo(pVar2.f17196b.e());
        return compareTo != 0 ? compareTo : pVar.f17195a.compareTo(pVar2.f17195a);
    }

    @Override // v4.k
    public final p d() {
        return c(c.f17170c, r.f17197u);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj instanceof t;
    }

    public final int hashCode() {
        return 3155577;
    }

    public final String toString() {
        return "PriorityIndex";
    }
}

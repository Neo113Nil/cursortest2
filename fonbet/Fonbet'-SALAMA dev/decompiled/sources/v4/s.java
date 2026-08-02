package v4;

import n4.C1473g;

/* loaded from: classes2.dex */
public final class s extends k {

    /* renamed from: a, reason: collision with root package name */
    public final C1473g f17198a;

    public s(C1473g c1473g) {
        if (c1473g.size() == 1 && c1473g.B().equals(c.f17171d)) {
            throw new IllegalArgumentException("Can't create PathIndex with '.priority' as key. Please use PriorityIndex instead!");
        }
        this.f17198a = c1473g;
    }

    @Override // v4.k
    public final String a() {
        return this.f17198a.F();
    }

    @Override // v4.k
    public final boolean b(r rVar) {
        return !rVar.g(this.f17198a).isEmpty();
    }

    @Override // v4.k
    public final p c(c cVar, r rVar) {
        return new p(cVar, j.f17184e.q(this.f17198a, rVar));
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        p pVar = (p) obj;
        p pVar2 = (p) obj2;
        r rVar = pVar.f17196b;
        C1473g c1473g = this.f17198a;
        int compareTo = rVar.g(c1473g).compareTo(pVar2.f17196b.g(c1473g));
        return compareTo == 0 ? pVar.f17195a.compareTo(pVar2.f17195a) : compareTo;
    }

    @Override // v4.k
    public final p d() {
        return new p(c.f17170c, j.f17184e.q(this.f17198a, r.f17197u));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && s.class == obj.getClass() && this.f17198a.equals(((s) obj).f17198a);
    }

    public final int hashCode() {
        return this.f17198a.hashCode();
    }
}

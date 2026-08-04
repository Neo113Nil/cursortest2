package v4;

import p098n4.C0934g;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0934g f17204a;

    public s(C0934g c0934g) {
        if (c0934g.size() == 1 && c0934g.B().equals(c.f17177d)) {
            throw new IllegalArgumentException("Can't create PathIndex with '.priority' as key. Please use PriorityIndex instead!");
        }
        this.f17204a = c0934g;
    }

    @Override // v4.k
    public final String a() {
        return this.f17204a.F();
    }

    @Override // v4.k
    public final boolean b(r rVar) {
        return !rVar.g(this.f17204a).isEmpty();
    }

    @Override // v4.k
    public final p c(c cVar, r rVar) {
        return new p(cVar, j.f17190e.q(this.f17204a, rVar));
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        p pVar = (p) obj;
        p pVar2 = (p) obj2;
        r rVar = pVar.f17202b;
        C0934g c0934g = this.f17204a;
        int iCompareTo = rVar.g(c0934g).compareTo(pVar2.f17202b.g(c0934g));
        return iCompareTo == 0 ? pVar.f17201a.compareTo(pVar2.f17201a) : iCompareTo;
    }

    @Override // v4.k
    public final p d() {
        return new p(c.f17176c, j.f17190e.q(this.f17204a, r.f17203u));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && s.class == obj.getClass() && this.f17204a.equals(((s) obj).f17204a);
    }

    public final int hashCode() {
        return this.f17204a.hashCode();
    }
}

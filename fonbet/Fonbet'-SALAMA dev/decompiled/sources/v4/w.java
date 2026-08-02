package v4;

/* loaded from: classes2.dex */
public final class w extends k {

    /* renamed from: a, reason: collision with root package name */
    public static final w f17204a = new w();

    @Override // v4.k
    public final String a() {
        return ".value";
    }

    @Override // v4.k
    public final boolean b(r rVar) {
        return true;
    }

    @Override // v4.k
    public final p c(c cVar, r rVar) {
        return new p(cVar, rVar);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        p pVar = (p) obj;
        p pVar2 = (p) obj2;
        int compareTo = pVar.f17196b.compareTo(pVar2.f17196b);
        return compareTo == 0 ? pVar.f17195a.compareTo(pVar2.f17195a) : compareTo;
    }

    @Override // v4.k
    public final p d() {
        return new p(c.f17170c, r.f17197u);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj instanceof w;
    }

    public final int hashCode() {
        return 4;
    }

    public final String toString() {
        return "ValueIndex";
    }
}

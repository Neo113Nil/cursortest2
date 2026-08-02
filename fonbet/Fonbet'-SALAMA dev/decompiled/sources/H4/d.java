package H4;

/* loaded from: classes2.dex */
public final class d implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final j f3310a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3311b;

    public d(int i7, j jVar) {
        if (jVar == null) {
            throw new NullPointerException("Null fieldPath");
        }
        this.f3310a = jVar;
        if (i7 == 0) {
            throw new NullPointerException("Null kind");
        }
        this.f3311b = i7;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        int compareTo = this.f3310a.compareTo(dVar.f3310a);
        return compareTo != 0 ? compareTo : t.e.a(this.f3311b, dVar.f3311b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3310a.equals(dVar.f3310a) && t.e.b(this.f3311b, dVar.f3311b);
    }

    public final int hashCode() {
        return ((this.f3310a.hashCode() ^ 1000003) * 1000003) ^ t.e.e(this.f3311b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Segment{fieldPath=");
        sb.append(this.f3310a);
        sb.append(", kind=");
        int i7 = this.f3311b;
        sb.append(i7 != 1 ? i7 != 2 ? i7 != 3 ? "null" : "CONTAINS" : "DESCENDING" : "ASCENDING");
        sb.append("}");
        return sb.toString();
    }
}

package H4;

import G4.C0269b;

/* loaded from: classes2.dex */
public final class b implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f3303d = new b(n.f3332b, h.b(), -1);

    /* renamed from: e, reason: collision with root package name */
    public static final C0269b f3304e = new C0269b(7);

    /* renamed from: a, reason: collision with root package name */
    public final n f3305a;

    /* renamed from: b, reason: collision with root package name */
    public final h f3306b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3307c;

    public b(n nVar, h hVar, int i7) {
        if (nVar == null) {
            throw new NullPointerException("Null readTime");
        }
        this.f3305a = nVar;
        if (hVar == null) {
            throw new NullPointerException("Null documentKey");
        }
        this.f3306b = hVar;
        this.f3307c = i7;
    }

    public static b b(k kVar) {
        return new b(kVar.f3326d, kVar.f3323a, -1);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(b bVar) {
        int compareTo = this.f3305a.compareTo(bVar.f3305a);
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = this.f3306b.compareTo(bVar.f3306b);
        return compareTo2 != 0 ? compareTo2 : Integer.compare(this.f3307c, bVar.f3307c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3305a.equals(bVar.f3305a) && this.f3306b.equals(bVar.f3306b) && this.f3307c == bVar.f3307c;
    }

    public final int hashCode() {
        return ((((this.f3305a.f3333a.hashCode() ^ 1000003) * 1000003) ^ this.f3306b.f3318a.hashCode()) * 1000003) ^ this.f3307c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndexOffset{readTime=");
        sb.append(this.f3305a);
        sb.append(", documentKey=");
        sb.append(this.f3306b);
        sb.append(", largestBatchId=");
        return e1.k.g(sb, this.f3307c, "}");
    }
}

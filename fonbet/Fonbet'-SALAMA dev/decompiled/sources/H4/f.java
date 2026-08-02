package H4;

/* loaded from: classes2.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final String f3313a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3314b;

    public f(String str, String str2) {
        this.f3313a = str;
        this.f3314b = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        int compareTo = this.f3313a.compareTo(fVar.f3313a);
        return compareTo != 0 ? compareTo : this.f3314b.compareTo(fVar.f3314b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f3313a.equals(fVar.f3313a) && this.f3314b.equals(fVar.f3314b);
    }

    public final int hashCode() {
        return this.f3314b.hashCode() + (this.f3313a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DatabaseId(");
        sb.append(this.f3313a);
        sb.append(", ");
        return e1.k.i(sb, this.f3314b, ")");
    }
}

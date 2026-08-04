package H4;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3314b;

    public f(String str, String str2) {
        this.f3313a = str;
        this.f3314b = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        int iCompareTo = this.f3313a.compareTo(fVar.f3313a);
        return iCompareTo != 0 ? iCompareTo : this.f3314b.compareTo(fVar.f3314b);
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
        return p031e1.k.i(sb, this.f3314b, ")");
    }
}

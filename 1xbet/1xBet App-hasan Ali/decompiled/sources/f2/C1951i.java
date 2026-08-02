package f2;

/* renamed from: f2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1951i extends l {

    /* renamed from: a, reason: collision with root package name */
    public final C1948f f16999a = C1948f.f16993c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1951i.class != obj.getClass()) {
            return false;
        }
        return this.f16999a.equals(((C1951i) obj).f16999a);
    }

    public final int hashCode() {
        return this.f16999a.hashCode() + (C1951i.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f16999a + '}';
    }
}

package s0;

/* loaded from: classes.dex */
public final class n extends q {

    /* renamed from: a, reason: collision with root package name */
    public final g f11789a = g.f11777c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        return this.f11789a.equals(((n) obj).f11789a);
    }

    public final int hashCode() {
        return this.f11789a.hashCode() + (n.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f11789a + '}';
    }
}

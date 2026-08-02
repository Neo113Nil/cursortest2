package d1;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: a, reason: collision with root package name */
    public final C0954g f12363a;

    public l(C0954g c0954g) {
        this.f12363a = c0954g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return this.f12363a.equals(((l) obj).f12363a);
    }

    public final int hashCode() {
        return this.f12363a.hashCode() + (l.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f12363a + '}';
    }
}

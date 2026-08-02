package f2;

/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: a, reason: collision with root package name */
    public final C1948f f17000a;

    public k(C1948f c1948f) {
        this.f17000a = c1948f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        return this.f17000a.equals(((k) obj).f17000a);
    }

    public final int hashCode() {
        return this.f17000a.hashCode() + (k.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f17000a + '}';
    }
}

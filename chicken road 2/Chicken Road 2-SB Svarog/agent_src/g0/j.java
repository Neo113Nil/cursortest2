package g0;

/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f545a;

    public j(Class cls) {
        this.f545a = cls;
    }

    @Override // g0.d
    public final Class a() {
        return this.f545a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return h.a(this.f545a, ((j) obj).f545a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f545a.hashCode();
    }

    public final String toString() {
        return this.f545a.toString() + " (Kotlin reflection is not available)";
    }
}

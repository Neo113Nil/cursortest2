package t6;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f16474a;

    public k(Class cls) {
        this.f16474a = cls;
    }

    @Override // t6.c
    public final Class a() {
        return this.f16474a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (h.a(this.f16474a, ((k) obj).f16474a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16474a.hashCode();
    }

    public final String toString() {
        return this.f16474a + " (Kotlin reflection is not available)";
    }
}

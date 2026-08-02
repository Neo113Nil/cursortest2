package t6;

/* loaded from: classes2.dex */
public final class k implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Class f16468a;

    public k(Class cls) {
        this.f16468a = cls;
    }

    @Override // t6.c
    public final Class a() {
        return this.f16468a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (h.a(this.f16468a, ((k) obj).f16468a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16468a.hashCode();
    }

    public final String toString() {
        return this.f16468a + " (Kotlin reflection is not available)";
    }
}

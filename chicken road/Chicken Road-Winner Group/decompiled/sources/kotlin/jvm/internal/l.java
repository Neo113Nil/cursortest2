package kotlin.jvm.internal;

/* loaded from: classes.dex */
public final class l implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f9668a;

    public l(Class jClass) {
        j.e(jClass, "jClass");
        this.f9668a = jClass;
    }

    @Override // kotlin.jvm.internal.d
    public final Class a() {
        return this.f9668a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return j.a(this.f9668a, ((l) obj).f9668a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9668a.hashCode();
    }

    public final String toString() {
        return this.f9668a + " (Kotlin reflection is not available)";
    }
}

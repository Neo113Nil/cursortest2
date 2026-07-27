package kotlin.jvm.internal;

/* loaded from: classes.dex */
public final class m implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Class f10738a;

    public m(Class jClass) {
        i.e(jClass, "jClass");
        this.f10738a = jClass;
    }

    @Override // kotlin.jvm.internal.c
    public final Class a() {
        return this.f10738a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            if (i.a(this.f10738a, ((m) obj).f10738a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f10738a.hashCode();
    }

    public final String toString() {
        return this.f10738a.toString() + " (Kotlin reflection is not available)";
    }
}

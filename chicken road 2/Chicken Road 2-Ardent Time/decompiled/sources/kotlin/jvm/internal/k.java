package kotlin.jvm.internal;

/* loaded from: classes.dex */
public final class k implements kotlin.jvm.internal.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f7956a;

    public k(java.lang.Class jClass) {
        kotlin.jvm.internal.i.e(jClass, "jClass");
        this.f7956a = jClass;
    }

    @Override // kotlin.jvm.internal.c
    public final java.lang.Class a() {
        return this.f7956a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof kotlin.jvm.internal.k) {
            if (kotlin.jvm.internal.i.a(this.f7956a, ((kotlin.jvm.internal.k) obj).f7956a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7956a.hashCode();
    }

    public final java.lang.String toString() {
        return this.f7956a + " (Kotlin reflection is not available)";
    }
}

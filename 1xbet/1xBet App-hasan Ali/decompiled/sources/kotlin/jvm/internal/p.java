package kotlin.jvm.internal;

/* loaded from: classes.dex */
public final class p implements d {

    /* renamed from: k, reason: collision with root package name */
    public final Class f17618k;

    public p(Class cls) {
        l.f("jClass", cls);
        this.f17618k = cls;
    }

    @Override // kotlin.jvm.internal.d
    public final Class a() {
        return this.f17618k;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return l.a(this.f17618k, ((p) obj).f17618k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17618k.hashCode();
    }

    public final String toString() {
        return this.f17618k + " (Kotlin reflection is not available)";
    }
}

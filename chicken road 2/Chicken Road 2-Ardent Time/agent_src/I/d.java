package I;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f648a;

    public d(java.lang.String name) {
        kotlin.jvm.internal.i.e(name, "name");
        this.f648a = name;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof I.d)) {
            return false;
        }
        return kotlin.jvm.internal.i.a(this.f648a, ((I.d) obj).f648a);
    }

    public final int hashCode() {
        return this.f648a.hashCode();
    }

    public final java.lang.String toString() {
        return this.f648a;
    }
}

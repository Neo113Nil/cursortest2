package e0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f12502a;

    public e(String str) {
        t6.h.e(str, "name");
        this.f12502a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return t6.h.a(this.f12502a, ((e) obj).f12502a);
    }

    public final int hashCode() {
        return this.f12502a.hashCode();
    }

    public final String toString() {
        return this.f12502a;
    }
}

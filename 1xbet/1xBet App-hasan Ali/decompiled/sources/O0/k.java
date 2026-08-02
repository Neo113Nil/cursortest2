package O0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f4025a;

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f4025a == ((k) obj).f4025a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4025a;
    }

    public final String toString() {
        int i = this.f4025a;
        return i == 0 ? "None" : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? "All" : "Invalid";
    }
}

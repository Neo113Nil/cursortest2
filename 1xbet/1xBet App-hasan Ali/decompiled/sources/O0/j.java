package O0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f4024a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f4024a == ((j) obj).f4024a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4024a;
    }

    public final String toString() {
        int i = this.f4024a;
        return i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid";
    }
}

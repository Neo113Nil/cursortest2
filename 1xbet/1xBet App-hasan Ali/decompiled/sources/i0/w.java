package i0;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f17300a;

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.f17300a == ((w) obj).f17300a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17300a;
    }

    public final String toString() {
        int i = this.f17300a;
        return i == 0 ? "Argb8888" : i == 1 ? "Alpha8" : i == 2 ? "Rgb565" : i == 3 ? "F16" : i == 4 ? "Gpu" : "Unknown";
    }
}

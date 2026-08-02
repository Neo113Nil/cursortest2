package V0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f5929a;

    public static String a(int i) {
        return i == 1 ? "Hyphens.None" : i == 2 ? "Hyphens.Auto" : i == Integer.MIN_VALUE ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f5929a == ((d) obj).f5929a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5929a;
    }

    public final String toString() {
        return a(this.f5929a);
    }
}

package V0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f5943a;

    public static String a(int i) {
        return i == 1 ? "Left" : i == 2 ? "Right" : i == 3 ? "Center" : i == 4 ? "Justify" : i == 5 ? "Start" : i == 6 ? "End" : i == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f5943a == ((k) obj).f5943a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5943a;
    }

    public final String toString() {
        return a(this.f5943a);
    }
}

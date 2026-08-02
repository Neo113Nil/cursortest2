package P0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f4656a;

    public static String a(int i) {
        return i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Default" : i == 2 ? "Go" : i == 3 ? "Search" : i == 4 ? "Send" : i == 5 ? "Previous" : i == 6 ? "Next" : i == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f4656a == ((j) obj).f4656a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4656a;
    }

    public final String toString() {
        return a(this.f4656a);
    }
}

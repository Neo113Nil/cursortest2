package V0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f5956a;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f5956a == ((r) obj).f5956a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5956a;
    }

    public final String toString() {
        int i = this.f5956a;
        return i == 1 ? "Linearity.Linear" : i == 2 ? "Linearity.FontHinting" : i == 3 ? "Linearity.None" : "Invalid";
    }
}

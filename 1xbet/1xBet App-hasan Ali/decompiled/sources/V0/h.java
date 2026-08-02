package V0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f5936a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f5936a == ((h) obj).f5936a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5936a;
    }

    public final String toString() {
        int i = this.f5936a;
        return i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}

package Q2;

/* loaded from: classes.dex */
public final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    public final double f2491a;

    public j(double d6) {
        this.f2491a = d6;
    }

    @Override // Q2.g
    public final String a() {
        return String.valueOf(this.f2491a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Double.valueOf(this.f2491a).equals(((g) obj).getValue());
    }

    @Override // Q2.g
    public final int getType() {
        return 4;
    }

    @Override // Q2.g
    public final Object getValue() {
        return Double.valueOf(this.f2491a);
    }

    public final int hashCode() {
        return Double.hashCode(this.f2491a);
    }

    public final String toString() {
        return "ValueDouble{" + String.valueOf(this.f2491a) + "}";
    }
}

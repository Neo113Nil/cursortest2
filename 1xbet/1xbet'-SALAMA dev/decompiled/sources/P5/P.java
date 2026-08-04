package P5;

/* JADX INFO: loaded from: classes2.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N f5639b;

    public P(String str, N n2) {
        this.f5638a = str;
        this.f5639b = n2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p5 = (P) obj;
        return t6.h.a(this.f5638a, p5.f5638a) && this.f5639b == p5.f5639b;
    }

    public final int hashCode() {
        String str = this.f5638a;
        return this.f5639b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f5638a + ", type=" + this.f5639b + ")";
    }
}

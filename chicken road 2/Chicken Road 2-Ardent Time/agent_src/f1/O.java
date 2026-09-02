package f1;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f2826a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.M f2827b;

    public O(java.lang.String str, f1.M m2) {
        this.f2826a = str;
        this.f2827b = m2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof f1.O)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        f1.O o2 = (f1.O) obj;
        return Q1.l.i(i1.AbstractC0191j.H(this.f2826a, this.f2827b), i1.AbstractC0191j.H(o2.f2826a, o2.f2827b));
    }

    public final int hashCode() {
        return i1.AbstractC0191j.H(this.f2826a, this.f2827b).hashCode();
    }

    public final java.lang.String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f2826a + ", type=" + this.f2827b + ")";
    }
}

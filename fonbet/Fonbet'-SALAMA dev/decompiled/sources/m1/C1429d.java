package m1;

/* renamed from: m1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1429d {

    /* renamed from: a, reason: collision with root package name */
    public final String f15208a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15209b;

    public C1429d(String str, int i7) {
        this.f15208a = str;
        this.f15209b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1429d)) {
            return false;
        }
        C1429d c1429d = (C1429d) obj;
        if (this.f15209b != c1429d.f15209b) {
            return false;
        }
        return this.f15208a.equals(c1429d.f15208a);
    }

    public final int hashCode() {
        return (this.f15208a.hashCode() * 31) + this.f15209b;
    }
}

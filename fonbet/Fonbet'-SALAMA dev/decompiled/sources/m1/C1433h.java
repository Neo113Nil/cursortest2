package m1;

/* renamed from: m1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1433h {

    /* renamed from: a, reason: collision with root package name */
    public String f15214a;

    /* renamed from: b, reason: collision with root package name */
    public int f15215b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1433h)) {
            return false;
        }
        C1433h c1433h = (C1433h) obj;
        if (this.f15215b != c1433h.f15215b) {
            return false;
        }
        return this.f15214a.equals(c1433h.f15214a);
    }

    public final int hashCode() {
        return t.e.e(this.f15215b) + (this.f15214a.hashCode() * 31);
    }
}

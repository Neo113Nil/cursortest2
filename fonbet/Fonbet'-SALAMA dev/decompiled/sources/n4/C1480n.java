package n4;

/* renamed from: n4.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1480n {

    /* renamed from: a, reason: collision with root package name */
    public String f15462a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15463b;

    /* renamed from: c, reason: collision with root package name */
    public String f15464c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1480n.class != obj.getClass()) {
            return false;
        }
        C1480n c1480n = (C1480n) obj;
        if (this.f15463b == c1480n.f15463b && this.f15462a.equals(c1480n.f15462a)) {
            return this.f15464c.equals(c1480n.f15464c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15464c.hashCode() + (((this.f15462a.hashCode() * 31) + (this.f15463b ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("http");
        sb.append(this.f15463b ? "s" : "");
        sb.append("://");
        sb.append(this.f15462a);
        return sb.toString();
    }
}

package p098n4;

/* JADX INFO: renamed from: n4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0941n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15470c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0941n.class != obj.getClass()) {
            return false;
        }
        C0941n c0941n = (C0941n) obj;
        if (this.f15469b == c0941n.f15469b && this.f15468a.equals(c0941n.f15468a)) {
            return this.f15470c.equals(c0941n.f15470c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15470c.hashCode() + (((this.f15468a.hashCode() * 31) + (this.f15469b ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("http");
        sb.append(this.f15469b ? "s" : "");
        sb.append("://");
        sb.append(this.f15468a);
        return sb.toString();
    }
}

package A1;

/* JADX INFO: renamed from: A1.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0039q implements InterfaceC0027k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f531c;

    public C0039q(int i7, int i8, int i9) {
        this.f529a = i7;
        this.f530b = i8;
        this.f531c = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0039q)) {
            return false;
        }
        C0039q c0039q = (C0039q) obj;
        return this.f529a == c0039q.f529a && this.f530b == c0039q.f530b && this.f531c == c0039q.f531c;
    }

    public final int hashCode() {
        return ((((527 + this.f529a) * 31) + this.f530b) * 31) + this.f531c;
    }
}

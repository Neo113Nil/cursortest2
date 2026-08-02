package I;

/* renamed from: I.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0161n {

    /* renamed from: a, reason: collision with root package name */
    public final V0.j f2502a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2503b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2504c;

    public C0161n(V0.j jVar, int i, long j5) {
        this.f2502a = jVar;
        this.f2503b = i;
        this.f2504c = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0161n)) {
            return false;
        }
        C0161n c0161n = (C0161n) obj;
        return this.f2502a == c0161n.f2502a && this.f2503b == c0161n.f2503b && this.f2504c == c0161n.f2504c;
    }

    public final int hashCode() {
        int hashCode = ((this.f2502a.hashCode() * 31) + this.f2503b) * 31;
        long j5 = this.f2504c;
        return hashCode + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f2502a + ", offset=" + this.f2503b + ", selectableId=" + this.f2504c + ')';
    }
}

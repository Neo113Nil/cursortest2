package L0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f3001a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3002b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3003c;

    public d(int i, int i5, boolean z3) {
        this.f3001a = i;
        this.f3002b = i5;
        this.f3003c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3001a == dVar.f3001a && this.f3002b == dVar.f3002b && this.f3003c == dVar.f3003c;
    }

    public final int hashCode() {
        return (((this.f3001a * 31) + this.f3002b) * 31) + (this.f3003c ? 1231 : 1237);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f3001a + ", end=" + this.f3002b + ", isRtl=" + this.f3003c + ')';
    }
}

package I4;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f3664a;

    /* renamed from: b, reason: collision with root package name */
    public final h f3665b;

    public d(int i7, h hVar) {
        this.f3664a = i7;
        this.f3665b = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3664a == dVar.f3664a && this.f3665b.equals(dVar.f3665b);
    }

    public final int hashCode() {
        return ((this.f3664a ^ 1000003) * 1000003) ^ this.f3665b.hashCode();
    }

    public final String toString() {
        return "Overlay{largestBatchId=" + this.f3664a + ", mutation=" + this.f3665b + "}";
    }
}

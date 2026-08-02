package Ve;

/* loaded from: classes10.dex */
public final class Fi {

    /* renamed from: a, reason: collision with root package name */
    public final int f29007a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29008b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29009c;

    public Fi(int i11, boolean z11, boolean z12) {
        this.f29007a = i11;
        this.f29008b = z11;
        this.f29009c = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fi)) {
            return false;
        }
        Fi fi2 = (Fi) obj;
        return this.f29007a == fi2.f29007a && this.f29008b == fi2.f29008b && this.f29009c == fi2.f29009c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f29007a) * 31;
        boolean z11 = this.f29008b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        boolean z12 = this.f29009c;
        return i12 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpasiboButtonState(bonuses=");
        sb2.append(this.f29007a);
        sb2.append(", isSwitcherOn=");
        sb2.append(this.f29008b);
        sb2.append(", isZeroOrder=");
        return Pk0.a.a(")", sb2, this.f29009c);
    }
}

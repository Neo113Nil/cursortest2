package p060i1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13838d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f13835a == aVar.f13835a && this.f13836b == aVar.f13836b && this.f13837c == aVar.f13837c && this.f13838d == aVar.f13838d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public final int hashCode() {
        boolean z4 = this.f13836b;
        ?? r7 = this.f13835a;
        int i7 = r7;
        if (z4) {
            i7 = r7 + 16;
        }
        int i8 = i7;
        if (this.f13837c) {
            i8 = i7 + 256;
        }
        return this.f13838d ? i8 + 4096 : i8;
    }

    public final String toString() {
        return "[ Connected=" + this.f13835a + " Validated=" + this.f13836b + " Metered=" + this.f13837c + " NotRoaming=" + this.f13838d + " ]";
    }
}

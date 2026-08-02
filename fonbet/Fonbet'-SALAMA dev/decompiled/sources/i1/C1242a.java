package i1;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1242a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13829a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13830b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13831c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13832d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1242a)) {
            return false;
        }
        C1242a c1242a = (C1242a) obj;
        return this.f13829a == c1242a.f13829a && this.f13830b == c1242a.f13830b && this.f13831c == c1242a.f13831c && this.f13832d == c1242a.f13832d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public final int hashCode() {
        boolean z4 = this.f13830b;
        ?? r12 = this.f13829a;
        int i7 = r12;
        if (z4) {
            i7 = r12 + 16;
        }
        int i8 = i7;
        if (this.f13831c) {
            i8 = i7 + 256;
        }
        return this.f13832d ? i8 + 4096 : i8;
    }

    public final String toString() {
        return "[ Connected=" + this.f13829a + " Validated=" + this.f13830b + " Metered=" + this.f13831c + " NotRoaming=" + this.f13832d + " ]";
    }
}

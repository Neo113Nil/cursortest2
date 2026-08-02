package k2;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2030a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17578a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17579b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17580c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17581d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2030a)) {
            return false;
        }
        C2030a c2030a = (C2030a) obj;
        return this.f17578a == c2030a.f17578a && this.f17579b == c2030a.f17579b && this.f17580c == c2030a.f17580c && this.f17581d == c2030a.f17581d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public final int hashCode() {
        boolean z3 = this.f17579b;
        ?? r1 = this.f17578a;
        int i = r1;
        if (z3) {
            i = r1 + 16;
        }
        int i5 = i;
        if (this.f17580c) {
            i5 = i + 256;
        }
        return this.f17581d ? i5 + 4096 : i5;
    }

    public final String toString() {
        return "[ Connected=" + this.f17578a + " Validated=" + this.f17579b + " Metered=" + this.f17580c + " NotRoaming=" + this.f17581d + " ]";
    }
}

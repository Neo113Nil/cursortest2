package Z1;

import B0.C2454a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final o f35326e = new o(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private final int f35327a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35328b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35329c;

    /* renamed from: d, reason: collision with root package name */
    private final int f35330d;

    public o(int i11, int i12, int i13, int i14) {
        this.f35327a = i11;
        this.f35328b = i12;
        this.f35329c = i13;
        this.f35330d = i14;
    }

    public static o b(o oVar, int i11, int i12) {
        int i13 = oVar.f35327a;
        int i14 = oVar.f35329c;
        oVar.getClass();
        return new o(i13, i11, i14, i12);
    }

    public final int c() {
        return this.f35330d;
    }

    public final int d() {
        return this.f35330d - this.f35328b;
    }

    public final int e() {
        return this.f35327a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f35327a == oVar.f35327a && this.f35328b == oVar.f35328b && this.f35329c == oVar.f35329c && this.f35330d == oVar.f35330d;
    }

    public final int f() {
        return this.f35329c;
    }

    public final int g() {
        return this.f35328b;
    }

    public final long h() {
        return n.a(this.f35327a, this.f35328b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35330d) + C2454a.a(this.f35329c, C2454a.a(this.f35328b, Integer.hashCode(this.f35327a) * 31, 31), 31);
    }

    public final int i() {
        return this.f35329c - this.f35327a;
    }

    public final boolean j() {
        return this.f35327a >= this.f35329c || this.f35328b >= this.f35330d;
    }

    @NotNull
    public final o k(int i11) {
        return new o(this.f35327a, this.f35328b + i11, this.f35329c, this.f35330d + i11);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f35327a);
        sb2.append(", ");
        sb2.append(this.f35328b);
        sb2.append(", ");
        sb2.append(this.f35329c);
        sb2.append(", ");
        return Ek.a.d(sb2, this.f35330d, ')');
    }
}

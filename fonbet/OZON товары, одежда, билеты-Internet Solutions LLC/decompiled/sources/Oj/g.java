package Oj;

import Kk.C3532b;
import Sc.InterfaceC3999a;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f20450a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20451b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20452c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f20453d;

    public g() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f20450a == gVar.f20450a && this.f20451b == gVar.f20451b && this.f20452c == gVar.f20452c && this.f20453d == gVar.f20453d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20453d) + C3532b.a(C3532b.a(Boolean.hashCode(this.f20450a) * 31, 31, this.f20451b), 31, this.f20452c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Corners(topLeft=");
        sb2.append(this.f20450a);
        sb2.append(", bottomLeft=");
        sb2.append(this.f20451b);
        sb2.append(", topRight=");
        sb2.append(this.f20452c);
        sb2.append(", bottomRight=");
        return Pk0.a.a(")", sb2, this.f20453d);
    }

    public g(Object obj) {
        this.f20450a = true;
        this.f20451b = true;
        this.f20452c = true;
        this.f20453d = true;
    }
}

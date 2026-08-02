package I0;

import B0.EnumC2526y0;
import k1.C7459e;
import org.jetbrains.annotations.NotNull;

/* renamed from: I0.l0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3194l0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final EnumC2526y0 f11558a;

    /* renamed from: b, reason: collision with root package name */
    private final long f11559b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final EnumC3192k0 f11560c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f11561d;

    public C3194l0(EnumC2526y0 enumC2526y0, long j11, EnumC3192k0 enumC3192k0, boolean z11) {
        this.f11558a = enumC2526y0;
        this.f11559b = j11;
        this.f11560c = enumC3192k0;
        this.f11561d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3194l0)) {
            return false;
        }
        C3194l0 c3194l0 = (C3194l0) obj;
        return this.f11558a == c3194l0.f11558a && C7459e.d(this.f11559b, c3194l0.f11559b) && this.f11560c == c3194l0.f11560c && this.f11561d == c3194l0.f11561d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11561d) + ((this.f11560c.hashCode() + Pk0.c.a(this.f11558a.hashCode() * 31, 31, this.f11559b)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionHandleInfo(handle=");
        sb2.append(this.f11558a);
        sb2.append(", position=");
        sb2.append((Object) C7459e.m(this.f11559b));
        sb2.append(", anchor=");
        sb2.append(this.f11560c);
        sb2.append(", visible=");
        return B4.V.d(sb2, this.f11561d, ')');
    }
}

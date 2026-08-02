package E0;

import org.jetbrains.annotations.NotNull;

/* renamed from: E0.t0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2948t0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f7306a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final g1 f7307b;

    public C2948t0(@NotNull g1 g1Var) {
        this.f7306a = g1Var;
        this.f7307b = g1Var;
    }

    @NotNull
    public final g1 a() {
        return this.f7306a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2948t0)) {
            return false;
        }
        C2948t0 c2948t0 = (C2948t0) obj;
        return this.f7306a == c2948t0.f7306a && this.f7307b == c2948t0.f7307b;
    }

    public final int hashCode() {
        return this.f7307b.hashCode() + (this.f7306a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.f7306a + ", endAffinity=" + this.f7307b + ')';
    }
}

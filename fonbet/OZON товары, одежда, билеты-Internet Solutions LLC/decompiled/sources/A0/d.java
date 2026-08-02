package A0;

import B4.V;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    private final float f158a;

    public d(float f7) {
        this.f158a = f7;
    }

    @Override // A0.b
    public final float a(@NotNull Z1.d dVar, long j11) {
        return dVar.v1(this.f158a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Z1.h.b(this.f158a, ((d) obj).f158a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f158a);
    }

    @NotNull
    public final String toString() {
        return V.b(this.f158a, ".dp)", new StringBuilder("CornerSize(size = "));
    }
}

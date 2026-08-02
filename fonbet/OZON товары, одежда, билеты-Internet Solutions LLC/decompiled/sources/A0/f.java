package A0;

import B4.V;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class f implements b {

    /* renamed from: a, reason: collision with root package name */
    private final float f160a;

    public f(float f7) {
        this.f160a = f7;
    }

    @Override // A0.b
    public final float a(@NotNull Z1.d dVar, long j11) {
        return this.f160a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.compare(this.f160a, ((f) obj).f160a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f160a);
    }

    @NotNull
    public final String toString() {
        return V.b(this.f160a, ".px)", new StringBuilder("CornerSize(size = "));
    }
}

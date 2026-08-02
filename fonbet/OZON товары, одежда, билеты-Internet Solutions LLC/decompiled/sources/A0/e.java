package A0;

import B4.V;
import k1.C7464j;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    private final float f159a;

    public e(float f7) {
        this.f159a = f7;
        if (f7 < 0.0f || f7 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // A0.b
    public final float a(@NotNull Z1.d dVar, long j11) {
        return (this.f159a / 100.0f) * C7464j.e(j11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f159a, ((e) obj).f159a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f159a);
    }

    @NotNull
    public final String toString() {
        return V.b(this.f159a, "%)", new StringBuilder("CornerSize(size = "));
    }
}

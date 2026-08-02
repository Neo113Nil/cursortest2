package D;

import h0.C1991e;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float f915a;

    public c(float f) {
        this.f915a = f;
        if (f < 0.0f || f > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // D.a
    public final float a(long j5, W0.c cVar) {
        return (this.f915a / 100.0f) * C1991e.c(j5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.f915a, ((c) obj).f915a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f915a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f915a + "%)";
    }
}

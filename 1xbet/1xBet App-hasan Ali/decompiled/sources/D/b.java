package D;

import W0.f;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float f914a;

    public b(float f) {
        this.f914a = f;
    }

    @Override // D.a
    public final float a(long j5, W0.c cVar) {
        return cVar.y(this.f914a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && f.a(this.f914a, ((b) obj).f914a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f914a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f914a + ".dp)";
    }
}

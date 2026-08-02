package W0;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class n implements X0.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f6019a;

    public n(float f) {
        this.f6019a = f;
    }

    @Override // X0.a
    public final float a(float f) {
        return f / this.f6019a;
    }

    @Override // X0.a
    public final float b(float f) {
        return f * this.f6019a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Float.compare(this.f6019a, ((n) obj).f6019a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f6019a);
    }

    public final String toString() {
        return AbstractC2107A.s(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f6019a, ')');
    }
}

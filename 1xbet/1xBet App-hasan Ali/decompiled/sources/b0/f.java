package b0;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f7152a;

    public f(float f) {
        this.f7152a = f;
    }

    public final int a(int i, int i5, W0.m mVar) {
        float f = (i5 - i) / 2.0f;
        W0.m mVar2 = W0.m.f6016k;
        float f5 = this.f7152a;
        if (mVar != mVar2) {
            f5 *= -1;
        }
        return Math.round((1 + f5) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.compare(this.f7152a, ((f) obj).f7152a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f7152a);
    }

    public final String toString() {
        return AbstractC2107A.s(new StringBuilder("Horizontal(bias="), this.f7152a, ')');
    }
}

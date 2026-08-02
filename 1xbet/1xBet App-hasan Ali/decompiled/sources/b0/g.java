package b0;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final float f7153a;

    public g(float f) {
        this.f7153a = f;
    }

    public final int a(int i, int i5) {
        return Math.round((1 + this.f7153a) * ((i5 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Float.compare(this.f7153a, ((g) obj).f7153a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f7153a);
    }

    public final String toString() {
        return AbstractC2107A.s(new StringBuilder("Vertical(bias="), this.f7153a, ')');
    }
}

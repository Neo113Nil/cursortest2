package t;

import n.AbstractC2107A;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2389a {

    /* renamed from: a, reason: collision with root package name */
    public final float f19356a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19357b;

    public C2389a(float f, float f5) {
        this.f19356a = f;
        this.f19357b = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2389a)) {
            return false;
        }
        C2389a c2389a = (C2389a) obj;
        return Float.compare(this.f19356a, c2389a.f19356a) == 0 && Float.compare(this.f19357b, c2389a.f19357b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f19357b) + (Float.floatToIntBits(this.f19356a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f19356a);
        sb.append(", velocityCoefficient=");
        return AbstractC2107A.s(sb, this.f19357b, ')');
    }
}

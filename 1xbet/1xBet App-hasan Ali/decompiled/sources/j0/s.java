package j0;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final float f17481a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17482b;

    public s(float f, float f5) {
        this.f17481a = f;
        this.f17482b = f5;
    }

    public final float[] a() {
        float f = this.f17481a;
        float f5 = this.f17482b;
        return new float[]{f / f5, 1.0f, ((1.0f - f) - f5) / f5};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f17481a, sVar.f17481a) == 0 && Float.compare(this.f17482b, sVar.f17482b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f17482b) + (Float.floatToIntBits(this.f17481a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f17481a);
        sb.append(", y=");
        return AbstractC2107A.s(sb, this.f17482b, ')');
    }
}

package L;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f2936a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2937b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2938c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2939d;

    public h(float f, float f5, float f6, float f7) {
        this.f2936a = f;
        this.f2937b = f5;
        this.f2938c = f6;
        this.f2939d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f2936a == hVar.f2936a && this.f2937b == hVar.f2937b && this.f2938c == hVar.f2938c && this.f2939d == hVar.f2939d;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f2939d) + AbstractC2107A.n(this.f2938c, AbstractC2107A.n(this.f2937b, Float.floatToIntBits(this.f2936a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f2936a);
        sb.append(", focusedAlpha=");
        sb.append(this.f2937b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f2938c);
        sb.append(", pressedAlpha=");
        return AbstractC2107A.s(sb, this.f2939d, ')');
    }
}

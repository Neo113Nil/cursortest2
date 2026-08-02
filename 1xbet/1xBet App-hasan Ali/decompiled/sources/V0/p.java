package V0;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f5950c = new p(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f5951a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5952b;

    public p(float f, float f5) {
        this.f5951a = f;
        this.f5952b = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f5951a == pVar.f5951a && this.f5952b == pVar.f5952b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f5952b) + (Float.floatToIntBits(this.f5951a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f5951a);
        sb.append(", skewX=");
        return AbstractC2107A.s(sb, this.f5952b, ')');
    }
}

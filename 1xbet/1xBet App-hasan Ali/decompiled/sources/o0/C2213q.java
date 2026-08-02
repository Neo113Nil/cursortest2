package o0;

import n.AbstractC2107A;

/* renamed from: o0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2213q extends u {

    /* renamed from: b, reason: collision with root package name */
    public final float f18579b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18580c;

    public C2213q(float f, float f5) {
        super(3);
        this.f18579b = f;
        this.f18580c = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2213q)) {
            return false;
        }
        C2213q c2213q = (C2213q) obj;
        return Float.compare(this.f18579b, c2213q.f18579b) == 0 && Float.compare(this.f18580c, c2213q.f18580c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18580c) + (Float.floatToIntBits(this.f18579b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f18579b);
        sb.append(", dy=");
        return AbstractC2107A.s(sb, this.f18580c, ')');
    }
}

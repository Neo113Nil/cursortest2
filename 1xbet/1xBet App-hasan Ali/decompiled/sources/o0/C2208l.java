package o0;

import n.AbstractC2107A;

/* renamed from: o0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2208l extends u {

    /* renamed from: b, reason: collision with root package name */
    public final float f18565b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18566c;

    public C2208l(float f, float f5) {
        super(3);
        this.f18565b = f;
        this.f18566c = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2208l)) {
            return false;
        }
        C2208l c2208l = (C2208l) obj;
        return Float.compare(this.f18565b, c2208l.f18565b) == 0 && Float.compare(this.f18566c, c2208l.f18566c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18566c) + (Float.floatToIntBits(this.f18565b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f18565b);
        sb.append(", y=");
        return AbstractC2107A.s(sb, this.f18566c, ')');
    }
}

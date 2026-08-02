package o0;

import n.AbstractC2107A;

/* renamed from: o0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2209m extends u {

    /* renamed from: b, reason: collision with root package name */
    public final float f18567b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18568c;

    public C2209m(float f, float f5) {
        super(3);
        this.f18567b = f;
        this.f18568c = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2209m)) {
            return false;
        }
        C2209m c2209m = (C2209m) obj;
        return Float.compare(this.f18567b, c2209m.f18567b) == 0 && Float.compare(this.f18568c, c2209m.f18568c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18568c) + (Float.floatToIntBits(this.f18567b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f18567b);
        sb.append(", y=");
        return AbstractC2107A.s(sb, this.f18568c, ')');
    }
}

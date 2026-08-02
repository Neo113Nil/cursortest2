package o0;

import n.AbstractC2107A;

/* renamed from: o0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2212p extends u {

    /* renamed from: b, reason: collision with root package name */
    public final float f18578b;

    public C2212p(float f) {
        super(3);
        this.f18578b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2212p) && Float.compare(this.f18578b, ((C2212p) obj).f18578b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18578b);
    }

    public final String toString() {
        return AbstractC2107A.s(new StringBuilder("RelativeHorizontalTo(dx="), this.f18578b, ')');
    }
}

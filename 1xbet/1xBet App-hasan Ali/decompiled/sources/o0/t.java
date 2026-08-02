package o0;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class t extends u {

    /* renamed from: b, reason: collision with root package name */
    public final float f18586b;

    public t(float f) {
        super(3);
        this.f18586b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Float.compare(this.f18586b, ((t) obj).f18586b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18586b);
    }

    public final String toString() {
        return AbstractC2107A.s(new StringBuilder("VerticalTo(y="), this.f18586b, ')');
    }
}

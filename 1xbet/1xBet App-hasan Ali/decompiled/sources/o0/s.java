package o0;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class s extends u {

    /* renamed from: b, reason: collision with root package name */
    public final float f18585b;

    public s(float f) {
        super(3);
        this.f18585b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Float.compare(this.f18585b, ((s) obj).f18585b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18585b);
    }

    public final String toString() {
        return AbstractC2107A.s(new StringBuilder("RelativeVerticalTo(dy="), this.f18585b, ')');
    }
}

package o0;

import n.AbstractC2107A;

/* renamed from: o0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2207k extends u {

    /* renamed from: b, reason: collision with root package name */
    public final float f18564b;

    public C2207k(float f) {
        super(3);
        this.f18564b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2207k) && Float.compare(this.f18564b, ((C2207k) obj).f18564b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18564b);
    }

    public final String toString() {
        return AbstractC2107A.s(new StringBuilder("HorizontalTo(x="), this.f18564b, ')');
    }
}

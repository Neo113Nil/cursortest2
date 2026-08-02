package V0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f5925a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f5925a, ((a) obj).f5925a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f5925a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f5925a + ')';
    }
}

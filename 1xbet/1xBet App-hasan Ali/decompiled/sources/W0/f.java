package W0;

/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: k, reason: collision with root package name */
    public final float f6006k;

    public static final boolean a(float f, float f5) {
        return Float.compare(f, f5) == 0;
    }

    public static String b(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f6006k, ((f) obj).f6006k);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f6006k, ((f) obj).f6006k) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f6006k);
    }

    public final String toString() {
        return b(this.f6006k);
    }
}

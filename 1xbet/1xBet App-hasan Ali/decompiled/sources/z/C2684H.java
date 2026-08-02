package z;

/* renamed from: z.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2684H {

    /* renamed from: a, reason: collision with root package name */
    public float f21479a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21480b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2684H)) {
            return false;
        }
        C2684H c2684h = (C2684H) obj;
        return Float.compare(this.f21479a, c2684h.f21479a) == 0 && this.f21480b == c2684h.f21480b;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f21479a) * 31) + (this.f21480b ? 1231 : 1237)) * 961;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f21479a + ", fill=" + this.f21480b + ", crossAxisAlignment=null, flowLayoutData=null)";
    }
}

package V0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final i f5937c = new i(17, f.f5933c);

    /* renamed from: a, reason: collision with root package name */
    public final float f5938a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5939b;

    public i(int i, float f) {
        this.f5938a = f;
        this.f5939b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        float f = iVar.f5938a;
        float f5 = f.f5932b;
        return Float.compare(this.f5938a, f) == 0 && this.f5939b == iVar.f5939b;
    }

    public final int hashCode() {
        float f = f.f5932b;
        return ((Float.floatToIntBits(this.f5938a) * 31) + this.f5939b) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) f.b(this.f5938a));
        sb.append(", trim=");
        int i = this.f5939b;
        sb.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=Mode(value=0))");
        return sb.toString();
    }
}

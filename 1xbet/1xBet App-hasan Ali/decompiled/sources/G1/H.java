package G1;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1856a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1857b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1858c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1859d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1860e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1861g;

    /* renamed from: h, reason: collision with root package name */
    public String f1862h;

    public H(boolean z3, boolean z5, int i, boolean z6, boolean z7, int i5, int i6) {
        this.f1856a = z3;
        this.f1857b = z5;
        this.f1858c = i;
        this.f1859d = z6;
        this.f1860e = z7;
        this.f = i5;
        this.f1861g = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof H)) {
            return false;
        }
        H h3 = (H) obj;
        return this.f1856a == h3.f1856a && this.f1857b == h3.f1857b && this.f1858c == h3.f1858c && kotlin.jvm.internal.l.a(this.f1862h, h3.f1862h) && this.f1859d == h3.f1859d && this.f1860e == h3.f1860e && this.f == h3.f && this.f1861g == h3.f1861g;
    }

    public final int hashCode() {
        int i = (((((this.f1856a ? 1 : 0) * 31) + (this.f1857b ? 1 : 0)) * 31) + this.f1858c) * 31;
        return ((((((((((((i + (this.f1862h != null ? r1.hashCode() : 0)) * 29791) + (this.f1859d ? 1 : 0)) * 31) + (this.f1860e ? 1 : 0)) * 31) + this.f) * 31) + this.f1861g) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(H.class.getSimpleName());
        sb.append("(");
        if (this.f1856a) {
            sb.append("launchSingleTop ");
        }
        if (this.f1857b) {
            sb.append("restoreState ");
        }
        String str = this.f1862h;
        if ((str != null || this.f1858c != -1) && str != null) {
            sb.append("popUpTo(");
            sb.append(str);
            if (this.f1859d) {
                sb.append(" inclusive");
            }
            if (this.f1860e) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        int i = this.f1861g;
        int i5 = this.f;
        if (i5 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i5));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(")");
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("sb.toString()", sb2);
        return sb2;
    }
}

package G1;

/* renamed from: G1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0135f {

    /* renamed from: a, reason: collision with root package name */
    public final M f1891a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1892b = false;

    public C0135f(M m5) {
        this.f1891a = m5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0135f.class.equals(obj.getClass())) {
            return false;
        }
        C0135f c0135f = (C0135f) obj;
        return this.f1892b == c0135f.f1892b && this.f1891a.equals(c0135f.f1891a);
    }

    public final int hashCode() {
        return ((this.f1891a.hashCode() * 961) + (this.f1892b ? 1 : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0135f.class.getSimpleName());
        sb.append(" Type: " + this.f1891a);
        sb.append(" Nullable: false");
        if (this.f1892b) {
            sb.append(" DefaultValue: null");
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("sb.toString()", sb2);
        return sb2;
    }
}

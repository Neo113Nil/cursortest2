package K0;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final G f2797a;

    /* renamed from: b, reason: collision with root package name */
    public final G f2798b;

    /* renamed from: c, reason: collision with root package name */
    public final G f2799c;

    /* renamed from: d, reason: collision with root package name */
    public final G f2800d;

    public M(G g5, G g6, G g7, G g8) {
        this.f2797a = g5;
        this.f2798b = g6;
        this.f2799c = g7;
        this.f2800d = g8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof M)) {
            return false;
        }
        M m5 = (M) obj;
        return kotlin.jvm.internal.l.a(this.f2797a, m5.f2797a) && kotlin.jvm.internal.l.a(this.f2798b, m5.f2798b) && kotlin.jvm.internal.l.a(this.f2799c, m5.f2799c) && kotlin.jvm.internal.l.a(this.f2800d, m5.f2800d);
    }

    public final int hashCode() {
        G g5 = this.f2797a;
        int hashCode = (g5 != null ? g5.hashCode() : 0) * 31;
        G g6 = this.f2798b;
        int hashCode2 = (hashCode + (g6 != null ? g6.hashCode() : 0)) * 31;
        G g7 = this.f2799c;
        int hashCode3 = (hashCode2 + (g7 != null ? g7.hashCode() : 0)) * 31;
        G g8 = this.f2800d;
        return hashCode3 + (g8 != null ? g8.hashCode() : 0);
    }
}

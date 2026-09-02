package W;

/* loaded from: classes.dex */
public final class i implements java.lang.Comparable {

    /* renamed from: f, reason: collision with root package name */
    public static final W.i f1821f;

    /* renamed from: a, reason: collision with root package name */
    public final int f1822a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1823b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1824c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f1825d;

    /* renamed from: e, reason: collision with root package name */
    public final h1.C0175g f1826e = Q1.l.q(new F.U(5, this));

    static {
        new W.i(0, 0, 0, "");
        f1821f = new W.i(0, 1, 0, "");
        new W.i(1, 0, 0, "");
    }

    public i(int i2, int i3, int i4, java.lang.String str) {
        this.f1822a = i2;
        this.f1823b = i3;
        this.f1824c = i4;
        this.f1825d = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        W.i other = (W.i) obj;
        kotlin.jvm.internal.i.e(other, "other");
        java.lang.Object a2 = this.f1826e.a();
        kotlin.jvm.internal.i.d(a2, "<get-bigInteger>(...)");
        java.lang.Object a3 = other.f1826e.a();
        kotlin.jvm.internal.i.d(a3, "<get-bigInteger>(...)");
        return ((java.math.BigInteger) a2).compareTo((java.math.BigInteger) a3);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof W.i)) {
            return false;
        }
        W.i iVar = (W.i) obj;
        return this.f1822a == iVar.f1822a && this.f1823b == iVar.f1823b && this.f1824c == iVar.f1824c;
    }

    public final int hashCode() {
        return ((((527 + this.f1822a) * 31) + this.f1823b) * 31) + this.f1824c;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2 = this.f1825d;
        if (y1.g.T(str2)) {
            str = "";
        } else {
            str = "-" + str2;
        }
        return this.f1822a + '.' + this.f1823b + '.' + this.f1824c + str;
    }
}

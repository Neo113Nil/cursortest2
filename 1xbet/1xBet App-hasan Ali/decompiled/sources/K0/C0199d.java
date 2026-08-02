package K0;

/* renamed from: K0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2817a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2818b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2819c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2820d;

    public C0199d(Object obj, int i, int i5, String str) {
        this.f2817a = obj;
        this.f2818b = i;
        this.f2819c = i5;
        this.f2820d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0199d)) {
            return false;
        }
        C0199d c0199d = (C0199d) obj;
        return kotlin.jvm.internal.l.a(this.f2817a, c0199d.f2817a) && this.f2818b == c0199d.f2818b && this.f2819c == c0199d.f2819c && kotlin.jvm.internal.l.a(this.f2820d, c0199d.f2820d);
    }

    public final int hashCode() {
        Object obj = this.f2817a;
        return this.f2820d.hashCode() + ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.f2818b) * 31) + this.f2819c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.f2817a);
        sb.append(", start=");
        sb.append(this.f2818b);
        sb.append(", end=");
        sb.append(this.f2819c);
        sb.append(", tag=");
        return L1.a.p(sb, this.f2820d, ')');
    }
}

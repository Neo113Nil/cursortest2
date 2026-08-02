package K0;

/* renamed from: K0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2823a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2824b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2825c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2826d;

    public C0201f(Object obj, int i, int i5, String str) {
        this.f2823a = obj;
        this.f2824b = i;
        this.f2825c = i5;
        this.f2826d = str;
        if (i <= i5) {
            return;
        }
        Q0.a.a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0201f)) {
            return false;
        }
        C0201f c0201f = (C0201f) obj;
        return kotlin.jvm.internal.l.a(this.f2823a, c0201f.f2823a) && this.f2824b == c0201f.f2824b && this.f2825c == c0201f.f2825c && kotlin.jvm.internal.l.a(this.f2826d, c0201f.f2826d);
    }

    public final int hashCode() {
        Object obj = this.f2823a;
        return this.f2826d.hashCode() + ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.f2824b) * 31) + this.f2825c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.f2823a);
        sb.append(", start=");
        sb.append(this.f2824b);
        sb.append(", end=");
        sb.append(this.f2825c);
        sb.append(", tag=");
        return L1.a.p(sb, this.f2826d, ')');
    }

    public C0201f(int i, int i5, Object obj) {
        this(obj, i, i5, "");
    }
}

package K0;

import java.util.List;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final C0203h f2784a;

    /* renamed from: b, reason: collision with root package name */
    public final O f2785b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2786c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2787d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2788e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final W0.c f2789g;

    /* renamed from: h, reason: collision with root package name */
    public final W0.m f2790h;
    public final O0.d i;

    /* renamed from: j, reason: collision with root package name */
    public final long f2791j;

    public K(C0203h c0203h, O o5, List list, int i, boolean z3, int i5, W0.c cVar, W0.m mVar, O0.d dVar, long j5) {
        this.f2784a = c0203h;
        this.f2785b = o5;
        this.f2786c = list;
        this.f2787d = i;
        this.f2788e = z3;
        this.f = i5;
        this.f2789g = cVar;
        this.f2790h = mVar;
        this.i = dVar;
        this.f2791j = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k5 = (K) obj;
        return kotlin.jvm.internal.l.a(this.f2784a, k5.f2784a) && kotlin.jvm.internal.l.a(this.f2785b, k5.f2785b) && kotlin.jvm.internal.l.a(this.f2786c, k5.f2786c) && this.f2787d == k5.f2787d && this.f2788e == k5.f2788e && this.f == k5.f && kotlin.jvm.internal.l.a(this.f2789g, k5.f2789g) && this.f2790h == k5.f2790h && kotlin.jvm.internal.l.a(this.i, k5.i) && W0.a.b(this.f2791j, k5.f2791j);
    }

    public final int hashCode() {
        int hashCode = (this.i.hashCode() + ((this.f2790h.hashCode() + ((this.f2789g.hashCode() + ((((((((this.f2786c.hashCode() + ((this.f2785b.hashCode() + (this.f2784a.hashCode() * 31)) * 31)) * 31) + this.f2787d) * 31) + (this.f2788e ? 1231 : 1237)) * 31) + this.f) * 31)) * 31)) * 31)) * 31;
        long j5 = this.f2791j;
        return ((int) (j5 ^ (j5 >>> 32))) + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.f2784a);
        sb.append(", style=");
        sb.append(this.f2785b);
        sb.append(", placeholders=");
        sb.append(this.f2786c);
        sb.append(", maxLines=");
        sb.append(this.f2787d);
        sb.append(", softWrap=");
        sb.append(this.f2788e);
        sb.append(", overflow=");
        int i = this.f;
        sb.append((Object) (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.f2789g);
        sb.append(", layoutDirection=");
        sb.append(this.f2790h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append((Object) W0.a.l(this.f2791j));
        sb.append(')');
        return sb.toString();
    }
}

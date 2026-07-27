package T4;

import u1.AbstractC1477a;

/* renamed from: T4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f2830n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2831a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2832b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2833c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2834d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2835e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2836f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2837g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2838h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2839i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2840j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2841k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2842l;

    /* renamed from: m, reason: collision with root package name */
    public String f2843m;

    static {
        int i2 = C4.a.f392d;
        C4.c unit = C4.c.f397d;
        kotlin.jvm.internal.i.e(unit, "unit");
        long f3 = C4.a.f(unit.compareTo(unit) <= 0 ? AbstractC1477a.m(B0.f.l(Integer.MAX_VALUE, unit, C4.c.f395b)) : AbstractC1477a.B(Integer.MAX_VALUE, unit), unit);
        if (f3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("maxStale < 0: " + f3).toString());
    }

    public C0153c(boolean z, boolean z5, int i2, int i3, boolean z6, boolean z7, boolean z8, int i6, int i7, boolean z9, boolean z10, boolean z11, String str) {
        this.f2831a = z;
        this.f2832b = z5;
        this.f2833c = i2;
        this.f2834d = i3;
        this.f2835e = z6;
        this.f2836f = z7;
        this.f2837g = z8;
        this.f2838h = i6;
        this.f2839i = i7;
        this.f2840j = z9;
        this.f2841k = z10;
        this.f2842l = z11;
        this.f2843m = str;
    }

    public final String toString() {
        String str = this.f2843m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f2831a) {
            sb.append("no-cache, ");
        }
        if (this.f2832b) {
            sb.append("no-store, ");
        }
        int i2 = this.f2833c;
        if (i2 != -1) {
            sb.append("max-age=");
            sb.append(i2);
            sb.append(", ");
        }
        int i3 = this.f2834d;
        if (i3 != -1) {
            sb.append("s-maxage=");
            sb.append(i3);
            sb.append(", ");
        }
        if (this.f2835e) {
            sb.append("private, ");
        }
        if (this.f2836f) {
            sb.append("public, ");
        }
        if (this.f2837g) {
            sb.append("must-revalidate, ");
        }
        int i6 = this.f2838h;
        if (i6 != -1) {
            sb.append("max-stale=");
            sb.append(i6);
            sb.append(", ");
        }
        int i7 = this.f2839i;
        if (i7 != -1) {
            sb.append("min-fresh=");
            sb.append(i7);
            sb.append(", ");
        }
        if (this.f2840j) {
            sb.append("only-if-cached, ");
        }
        if (this.f2841k) {
            sb.append("no-transform, ");
        }
        if (this.f2842l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        kotlin.jvm.internal.i.d(sb.delete(sb.length() - 2, sb.length()), "delete(...)");
        String sb2 = sb.toString();
        this.f2843m = sb2;
        return sb2;
    }
}

package M;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final K0.O f3565a;

    /* renamed from: b, reason: collision with root package name */
    public final K0.O f3566b;

    /* renamed from: c, reason: collision with root package name */
    public final K0.O f3567c;

    /* renamed from: d, reason: collision with root package name */
    public final K0.O f3568d;

    /* renamed from: e, reason: collision with root package name */
    public final K0.O f3569e;
    public final K0.O f;

    /* renamed from: g, reason: collision with root package name */
    public final K0.O f3570g;

    /* renamed from: h, reason: collision with root package name */
    public final K0.O f3571h;
    public final K0.O i;

    /* renamed from: j, reason: collision with root package name */
    public final K0.O f3572j;

    /* renamed from: k, reason: collision with root package name */
    public final K0.O f3573k;

    /* renamed from: l, reason: collision with root package name */
    public final K0.O f3574l;

    /* renamed from: m, reason: collision with root package name */
    public final K0.O f3575m;

    /* renamed from: n, reason: collision with root package name */
    public final K0.O f3576n;

    /* renamed from: o, reason: collision with root package name */
    public final K0.O f3577o;

    public v0(K0.O o5, K0.O o6, K0.O o7, K0.O o8, K0.O o9, K0.O o10, K0.O o11, K0.O o12, K0.O o13, K0.O o14, K0.O o15, int i) {
        K0.O o16 = (i & 1) != 0 ? O.m.f4003d : o5;
        K0.O o17 = (i & 2) != 0 ? O.m.f4004e : o6;
        K0.O o18 = O.m.f;
        K0.O o19 = (i & 8) != 0 ? O.m.f4005g : o7;
        K0.O o20 = (i & 16) != 0 ? O.m.f4006h : o8;
        K0.O o21 = O.m.i;
        K0.O o22 = (i & 64) != 0 ? O.m.f4010m : o9;
        K0.O o23 = (i & 128) != 0 ? O.m.f4011n : o10;
        K0.O o24 = O.m.f4012o;
        K0.O o25 = (i & 512) != 0 ? O.m.f4000a : o11;
        K0.O o26 = (i & 1024) != 0 ? O.m.f4001b : o12;
        K0.O o27 = O.m.f4002c;
        K0.O o28 = (i & 4096) != 0 ? O.m.f4007j : o13;
        K0.O o29 = (i & 8192) != 0 ? O.m.f4008k : o14;
        K0.O o30 = (i & 16384) != 0 ? O.m.f4009l : o15;
        this.f3565a = o16;
        this.f3566b = o17;
        this.f3567c = o18;
        this.f3568d = o19;
        this.f3569e = o20;
        this.f = o21;
        this.f3570g = o22;
        this.f3571h = o23;
        this.i = o24;
        this.f3572j = o25;
        this.f3573k = o26;
        this.f3574l = o27;
        this.f3575m = o28;
        this.f3576n = o29;
        this.f3577o = o30;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return kotlin.jvm.internal.l.a(this.f3565a, v0Var.f3565a) && kotlin.jvm.internal.l.a(this.f3566b, v0Var.f3566b) && kotlin.jvm.internal.l.a(this.f3567c, v0Var.f3567c) && kotlin.jvm.internal.l.a(this.f3568d, v0Var.f3568d) && kotlin.jvm.internal.l.a(this.f3569e, v0Var.f3569e) && kotlin.jvm.internal.l.a(this.f, v0Var.f) && kotlin.jvm.internal.l.a(this.f3570g, v0Var.f3570g) && kotlin.jvm.internal.l.a(this.f3571h, v0Var.f3571h) && kotlin.jvm.internal.l.a(this.i, v0Var.i) && kotlin.jvm.internal.l.a(this.f3572j, v0Var.f3572j) && kotlin.jvm.internal.l.a(this.f3573k, v0Var.f3573k) && kotlin.jvm.internal.l.a(this.f3574l, v0Var.f3574l) && kotlin.jvm.internal.l.a(this.f3575m, v0Var.f3575m) && kotlin.jvm.internal.l.a(this.f3576n, v0Var.f3576n) && kotlin.jvm.internal.l.a(this.f3577o, v0Var.f3577o);
    }

    public final int hashCode() {
        return this.f3577o.hashCode() + ((this.f3576n.hashCode() + ((this.f3575m.hashCode() + ((this.f3574l.hashCode() + ((this.f3573k.hashCode() + ((this.f3572j.hashCode() + ((this.i.hashCode() + ((this.f3571h.hashCode() + ((this.f3570g.hashCode() + ((this.f.hashCode() + ((this.f3569e.hashCode() + ((this.f3568d.hashCode() + ((this.f3567c.hashCode() + ((this.f3566b.hashCode() + (this.f3565a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Typography(displayLarge=" + this.f3565a + ", displayMedium=" + this.f3566b + ",displaySmall=" + this.f3567c + ", headlineLarge=" + this.f3568d + ", headlineMedium=" + this.f3569e + ", headlineSmall=" + this.f + ", titleLarge=" + this.f3570g + ", titleMedium=" + this.f3571h + ", titleSmall=" + this.i + ", bodyLarge=" + this.f3572j + ", bodyMedium=" + this.f3573k + ", bodySmall=" + this.f3574l + ", labelLarge=" + this.f3575m + ", labelMedium=" + this.f3576n + ", labelSmall=" + this.f3577o + ')';
    }
}

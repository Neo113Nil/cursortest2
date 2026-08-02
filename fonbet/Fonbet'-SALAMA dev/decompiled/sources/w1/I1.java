package w1;

/* loaded from: classes.dex */
public final class I1 implements K1 {

    /* renamed from: m, reason: collision with root package name */
    public int f17415m;

    @Override // w1.K1
    public final C1758x0 a(C2 c22) {
        if (c22.a().equals(D2.FLUSH_FRAME)) {
            return new C1758x0(1, new R1(new C1680b2(this.f17415m, 1), 7), 1);
        }
        boolean equals = c22.a().equals(D2.ANALYTICS_ERROR);
        C1758x0 c1758x0 = K1.f17432a;
        if (!equals || "uncaught".equals(((X1) c22.f17316c).f17592d)) {
            return c1758x0;
        }
        int i7 = this.f17415m;
        this.f17415m = i7 + 1;
        return i7 >= 50 ? K1.f17438g : c1758x0;
    }

    @Override // w1.K1
    public final void a() {
        this.f17415m = 0;
    }
}

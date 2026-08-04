package p155w1;

/* JADX INFO: loaded from: classes.dex */
public final class I1 implements K1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f17421m;

    @Override // p155w1.K1
    public final C1049x0 a(C2 c3) {
        if (c3.a().equals(D2.FLUSH_FRAME)) {
            return new C1049x0(1, new R1(new C0971b2(this.f17421m, 1), 7), 1);
        }
        boolean zEquals = c3.a().equals(D2.ANALYTICS_ERROR);
        C1049x0 c1049x0 = K1.f17438a;
        if (!zEquals || "uncaught".equals(((X1) c3.f17322c).f17598d)) {
            return c1049x0;
        }
        int i7 = this.f17421m;
        this.f17421m = i7 + 1;
        return i7 >= 50 ? K1.f17444g : c1049x0;
    }

    @Override // p155w1.K1
    public final void a() {
        this.f17421m = 0;
    }
}

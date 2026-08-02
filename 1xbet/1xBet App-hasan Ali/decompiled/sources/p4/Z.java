package p4;

/* loaded from: classes.dex */
public final class Z extends X {

    /* renamed from: o, reason: collision with root package name */
    public final b0 f18770o;

    /* renamed from: p, reason: collision with root package name */
    public final a0 f18771p;

    /* renamed from: q, reason: collision with root package name */
    public final C2272l f18772q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f18773r;

    public Z(b0 b0Var, a0 a0Var, C2272l c2272l, Object obj) {
        this.f18770o = b0Var;
        this.f18771p = a0Var;
        this.f18772q = c2272l;
        this.f18773r = obj;
    }

    @Override // p4.X
    public final boolean k() {
        return false;
    }

    @Override // p4.X
    public final void l(Throwable th) {
        C2272l c2272l = this.f18772q;
        b0 b0Var = this.f18770o;
        b0Var.getClass();
        C2272l S4 = b0.S(c2272l);
        a0 a0Var = this.f18771p;
        Object obj = this.f18773r;
        if (S4 == null || !b0Var.b0(a0Var, S4, obj)) {
            a0Var.f18778k.e(new u4.h(2), 2);
            C2272l S5 = b0.S(c2272l);
            if (S5 == null || !b0Var.b0(a0Var, S5, obj)) {
                b0Var.w(b0Var.G(a0Var, obj));
            }
        }
    }
}

package D4;

/* loaded from: classes.dex */
public final class d0 extends b0 {

    /* renamed from: e, reason: collision with root package name */
    public final g0 f494e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f495f;

    /* renamed from: g, reason: collision with root package name */
    public final C0011k f496g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f497h;

    public d0(g0 g0Var, e0 e0Var, C0011k c0011k, Object obj) {
        this.f494e = g0Var;
        this.f495f = e0Var;
        this.f496g = c0011k;
        this.f497h = obj;
    }

    @Override // t4.InterfaceC1441l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        k((Throwable) obj);
        return f4.v.f5689a;
    }

    @Override // D4.b0
    public final void k(Throwable th) {
        C0011k c0011k = this.f496g;
        g0 g0Var = this.f494e;
        g0Var.getClass();
        C0011k O5 = g0.O(c0011k);
        e0 e0Var = this.f495f;
        Object obj = this.f497h;
        if (O5 != null) {
            while (AbstractC0024y.k(O5.f519e, false, new d0(g0Var, e0Var, O5, obj), 1) == j0.f518a) {
                O5 = g0.O(O5);
                if (O5 == null) {
                }
            }
            return;
        }
        g0Var.l(g0Var.w(e0Var, obj));
    }
}

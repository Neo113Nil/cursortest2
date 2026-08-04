package D6;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends AbstractC0126i0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s0 f1846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l0 f1847f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0134q f1848x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f1849y;

    public k0(s0 s0Var, l0 l0Var, C0134q c0134q, Object obj) {
        this.f1846e = s0Var;
        this.f1847f = l0Var;
        this.f1848x = c0134q;
        this.f1849y = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return p044f6.i.f13014a;
    }

    @Override // D6.AbstractC0126i0
    public final void j(Throwable th) {
        C0134q c0134q = this.f1848x;
        s0 s0Var = this.f1846e;
        s0Var.getClass();
        C0134q c0134qF = s0.F(c0134q);
        l0 l0Var = this.f1847f;
        Object obj = this.f1849y;
        if (c0134qF != null) {
            while (E.l(c0134qF.f1871e, false, new k0(s0Var, l0Var, c0134qF, obj), 1) == v0.f1883a) {
                c0134qF = s0.F(c0134qF);
                if (c0134qF == null) {
                }
            }
            return;
        }
        s0Var.h(s0Var.r(l0Var, obj));
    }
}

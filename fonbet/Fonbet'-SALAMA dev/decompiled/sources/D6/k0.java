package D6;

import f6.C1116i;

/* loaded from: classes2.dex */
public final class k0 extends AbstractC0126i0 {

    /* renamed from: e, reason: collision with root package name */
    public final s0 f1846e;

    /* renamed from: f, reason: collision with root package name */
    public final l0 f1847f;

    /* renamed from: x, reason: collision with root package name */
    public final C0134q f1848x;

    /* renamed from: y, reason: collision with root package name */
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
        return C1116i.f13008a;
    }

    @Override // D6.AbstractC0126i0
    public final void j(Throwable th) {
        C0134q c0134q = this.f1848x;
        s0 s0Var = this.f1846e;
        s0Var.getClass();
        C0134q F7 = s0.F(c0134q);
        l0 l0Var = this.f1847f;
        Object obj = this.f1849y;
        if (F7 != null) {
            while (E.l(F7.f1871e, false, new k0(s0Var, l0Var, F7, obj), 1) == v0.f1883a) {
                F7 = s0.F(F7);
                if (F7 == null) {
                }
            }
            return;
        }
        s0Var.h(s0Var.r(l0Var, obj));
    }
}

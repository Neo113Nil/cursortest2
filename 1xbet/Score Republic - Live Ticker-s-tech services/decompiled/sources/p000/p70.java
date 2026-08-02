package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p70 implements Cloneable {

    /* JADX INFO: renamed from: j */
    public final t70 f6002j;

    /* JADX INFO: renamed from: k */
    public t70 f6003k;

    public p70(t70 t70Var) {
        this.f6002j = t70Var;
        if (t70Var.m4755g()) {
            C0270h1.m2190f("Default instance must be immutable.");
            throw null;
        }
        this.f6003k = t70Var.m4757i();
    }

    /* JADX INFO: renamed from: a */
    public final t70 m3854a() {
        t70 t70VarM3855b = m3855b();
        t70VarM3855b.getClass();
        if (t70.m4753f(t70VarM3855b, true)) {
            return t70VarM3855b;
        }
        throw new jf1();
    }

    /* JADX INFO: renamed from: b */
    public final t70 m3855b() {
        boolean zM4755g = this.f6003k.m4755g();
        t70 t70Var = this.f6003k;
        if (!zM4755g) {
            return t70Var;
        }
        t70Var.getClass();
        fy0 fy0Var = fy0.f2536c;
        fy0Var.getClass();
        fy0Var.m1907a(t70Var.getClass()).mo4476b(t70Var);
        t70Var.m4756h();
        return this.f6003k;
    }

    /* JADX INFO: renamed from: c */
    public final void m3856c() {
        if (this.f6003k.m4755g()) {
            return;
        }
        t70 t70VarM4757i = this.f6002j.m4757i();
        t70 t70Var = this.f6003k;
        fy0 fy0Var = fy0.f2536c;
        fy0Var.getClass();
        fy0Var.m1907a(t70VarM4757i.getClass()).mo4475a(t70VarM4757i, t70Var);
        this.f6003k = t70VarM4757i;
    }

    public final Object clone() {
        p70 p70Var = (p70) this.f6002j.mo507c(5);
        p70Var.f6003k = m3855b();
        return p70Var;
    }
}

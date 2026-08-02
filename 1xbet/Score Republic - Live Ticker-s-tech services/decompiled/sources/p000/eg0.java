package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class eg0 extends wj0 implements InterfaceC0224fu, md0 {

    /* JADX INFO: renamed from: g */
    public ig0 f2087g;

    @Override // p000.md0
    /* JADX INFO: renamed from: a */
    public final boolean mo1410a() {
        return true;
    }

    @Override // p000.InterfaceC0224fu
    /* JADX INFO: renamed from: c */
    public final void mo1411c() {
        m1413q().m2618S(this);
    }

    @Override // p000.md0
    /* JADX INFO: renamed from: d */
    public final gs0 mo1412d() {
        return null;
    }

    public ag0 getParent() {
        return m1413q();
    }

    /* JADX INFO: renamed from: q */
    public final ig0 m1413q() {
        ig0 ig0Var = this.f2087g;
        if (ig0Var != null) {
            return ig0Var;
        }
        C0694sj c0694sj = new C0694sj("lateinit property job has not been initialized", 7);
        af0.m196k(c0694sj, af0.class.getName());
        throw c0694sj;
    }

    /* JADX INFO: renamed from: r */
    public abstract boolean mo1414r();

    /* JADX INFO: renamed from: s */
    public abstract void mo1415s(Throwable th);

    @Override // p000.wj0
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0959zp.m5979g(this) + "[job@" + AbstractC0959zp.m5979g(m1413q()) + ']';
    }
}

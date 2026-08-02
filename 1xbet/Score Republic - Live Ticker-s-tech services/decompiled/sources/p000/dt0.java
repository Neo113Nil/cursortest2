package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class dt0 extends AbstractC0959zp implements a51 {

    /* JADX INFO: renamed from: w */
    public final Object f1814w;

    public dt0(Object obj) {
        this.f1814w = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f1814w;
    }

    @Override // p000.AbstractC0959zp
    /* JADX INFO: renamed from: w */
    public final void mo173w(ft0 ft0Var) {
        et0 et0Var = new et0(ft0Var, this.f1814w);
        ft0Var.mo172a(et0Var);
        et0Var.run();
    }
}

package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class vm0 extends hm0 implements a51 {

    /* JADX INFO: renamed from: j */
    public final Object f8219j;

    public vm0(Object obj) {
        this.f8219j = obj;
    }

    @Override // p000.hm0
    /* JADX INFO: renamed from: c */
    public final void mo2294c(xm0 xm0Var) {
        xm0Var.mo975a(EnumC0336iw.f3682j);
        xm0Var.mo976b(this.f8219j);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f8219j;
    }
}

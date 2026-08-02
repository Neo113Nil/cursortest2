package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class e51 implements InterfaceC0187eu, Runnable {

    /* JADX INFO: renamed from: j */
    public final Runnable f1956j;

    /* JADX INFO: renamed from: k */
    public final f51 f1957k;

    /* JADX INFO: renamed from: l */
    public Thread f1958l;

    public e51(Runnable runnable, f51 f51Var) {
        this.f1956j = runnable;
        this.f1957k = f51Var;
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        if (this.f1958l == Thread.currentThread()) {
            f51 f51Var = this.f1957k;
            if (f51Var instanceof es0) {
                es0 es0Var = (es0) f51Var;
                if (es0Var.f2178k) {
                    return;
                }
                es0Var.f2178k = true;
                es0Var.f2177j.shutdown();
                return;
            }
        }
        this.f1957k.mo480c();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1958l = Thread.currentThread();
        try {
            this.f1956j.run();
        } finally {
            mo480c();
            this.f1958l = null;
        }
    }
}

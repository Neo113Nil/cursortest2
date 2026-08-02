package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class lq0 extends AbstractC0001a0 implements Runnable {

    /* JADX INFO: renamed from: q */
    public final Runnable f4882q;

    public lq0(Runnable runnable) {
        runnable.getClass();
        this.f4882q = runnable;
    }

    @Override // p000.AbstractC0269h0
    /* JADX INFO: renamed from: j */
    public final String mo550j() {
        return "task=[" + this.f4882q + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4882q.run();
        } catch (Error | RuntimeException e) {
            m2178m(e);
            throw e;
        }
    }
}

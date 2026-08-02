package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class fc1 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final Runnable f2375j;

    /* JADX INFO: renamed from: k */
    public boolean f2376k;

    /* JADX INFO: renamed from: l */
    public boolean f2377l;

    public fc1(Runnable runnable) {
        this.f2375j = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2376k) {
            return;
        }
        this.f2377l = true;
        this.f2375j.run();
    }
}

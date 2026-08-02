package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class sc1 extends pc1 {

    /* JADX INFO: renamed from: l */
    public final Runnable f7097l;

    public sc1(Runnable runnable, long j, boolean z) {
        super(z, j);
        this.f7097l = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7097l.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f7097l;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0959zp.m5979g(runnable));
        sb.append(", ");
        sb.append(this.f6087j);
        sb.append(", ");
        sb.append(this.f6088k ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}

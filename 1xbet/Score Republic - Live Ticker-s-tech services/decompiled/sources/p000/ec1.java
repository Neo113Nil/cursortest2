package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ec1 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ fc1 f2058j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ RunnableC0702sr f2059k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ long f2060l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ gc1 f2061m;

    public ec1(gc1 gc1Var, fc1 fc1Var, RunnableC0702sr runnableC0702sr, long j) {
        this.f2061m = gc1Var;
        this.f2058j = fc1Var;
        this.f2059k = runnableC0702sr;
        this.f2060l = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2061m.execute(this.f2058j);
    }

    public final String toString() {
        return this.f2059k.toString() + "(scheduled in SynchronizationContext with delay of " + this.f2060l + ")";
    }
}

package p000;

/* JADX INFO: renamed from: as */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0036as implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f617j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0924yr f618k;

    public /* synthetic */ RunnableC0036as(C0924yr c0924yr, int i) {
        this.f617j = i;
        this.f618k = c0924yr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f617j;
        C0924yr c0924yr = this.f618k;
        switch (i) {
            case 0:
                c0924yr.f9439l.mo1641z();
                break;
            case 1:
                c0924yr.f9439l.mo1600C();
                break;
            case 2:
                c0924yr.m5831b();
                break;
            case 3:
                c0924yr.f9439l.flush();
                break;
            default:
                c0924yr.f9439l.mo1601D();
                break;
        }
    }
}

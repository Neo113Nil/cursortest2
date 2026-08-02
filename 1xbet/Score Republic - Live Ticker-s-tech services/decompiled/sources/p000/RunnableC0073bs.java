package p000;

/* JADX INFO: renamed from: bs */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0073bs implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f969j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f970k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C0924yr f971l;

    public /* synthetic */ RunnableC0073bs(C0924yr c0924yr, int i, int i2) {
        this.f969j = i2;
        this.f971l = c0924yr;
        this.f970k = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f969j;
        int i2 = this.f970k;
        C0924yr c0924yr = this.f971l;
        switch (i) {
            case 0:
                c0924yr.f9439l.mo1628k(i2);
                break;
            default:
                c0924yr.f9439l.mo1625e(i2);
                break;
        }
    }
}

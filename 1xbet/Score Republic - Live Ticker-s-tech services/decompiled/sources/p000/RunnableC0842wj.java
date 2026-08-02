package p000;

/* JADX INFO: renamed from: wj */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0842wj implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f8555j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ AbstractActivityC0790v4 f8556k;

    public /* synthetic */ RunnableC0842wj(AbstractActivityC0790v4 abstractActivityC0790v4, int i) {
        this.f8555j = i;
        this.f8556k = abstractActivityC0790v4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f8555j;
        AbstractActivityC0790v4 abstractActivityC0790v4 = this.f8556k;
        switch (i) {
            case 0:
                abstractActivityC0790v4.invalidateOptionsMenu();
                break;
            default:
                AbstractActivityC0252gk.m2116f(abstractActivityC0790v4);
                break;
        }
    }
}

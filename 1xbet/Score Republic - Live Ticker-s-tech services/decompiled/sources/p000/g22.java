package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class g22 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2583j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ l12 f2584k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ long f2585l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean f2586m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ v22 f2587n;

    public /* synthetic */ g22(v22 v22Var, l12 l12Var, long j, boolean z, int i) {
        this.f2583j = i;
        this.f2584k = l12Var;
        this.f2585l = j;
        this.f2586m = z;
        this.f2587n = v22Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2583j;
        long j = this.f2585l;
        boolean z = this.f2586m;
        l12 l12Var = this.f2584k;
        v22 v22Var = this.f2587n;
        switch (i) {
            case 0:
                v22Var.m5045a0(l12Var);
                v22Var.m5035Q(l12Var, j, z);
                break;
            default:
                v22Var.m5045a0(l12Var);
                v22Var.m5035Q(l12Var, j, z);
                break;
        }
    }
}

package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class h31 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3036j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ f50 f3037k;

    public /* synthetic */ h31(f50 f50Var, int i) {
        this.f3036j = i;
        this.f3037k = f50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3036j;
        f50 f50Var = this.f3037k;
        switch (i) {
            case 0:
                zk0 zk0Var = (zk0) f50Var.f2314l;
                zk0Var.f9827I = true;
                InterfaceC0581ph interfaceC0581ph = zk0Var.f9822D;
                oq0 oq0Var = zk0Var.f9820B;
                interfaceC0581ph.mo1035g((ja1) oq0Var.f5840k, (EnumC0544oh) oq0Var.f5841l, (np0) oq0Var.f5842m);
                break;
            default:
                zk0 zk0Var2 = (zk0) f50Var.f2314l;
                if (!zk0Var2.f9827I) {
                    zk0Var2.f9822D.mo1033d();
                }
                break;
        }
    }
}

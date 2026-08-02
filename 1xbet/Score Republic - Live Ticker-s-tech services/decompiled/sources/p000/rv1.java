package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class rv1 implements m72, ou0, lu0, hu0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f6982j;

    /* JADX INFO: renamed from: k */
    public final Executor f6983k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC0845wm f6984l;

    /* JADX INFO: renamed from: m */
    public final v92 f6985m;

    public /* synthetic */ rv1(Executor executor, InterfaceC0845wm interfaceC0845wm, v92 v92Var, int i) {
        this.f6982j = i;
        this.f6983k = executor;
        this.f6984l = interfaceC0845wm;
        this.f6985m = v92Var;
    }

    @Override // p000.m72
    /* JADX INFO: renamed from: a */
    public final void mo3331a(v92 v92Var) {
        int i = this.f6982j;
        Executor executor = this.f6983k;
        switch (i) {
            case 0:
                executor.execute(new f31(8, this, v92Var));
                break;
            default:
                executor.execute(new f31(9, this, v92Var));
                break;
        }
    }

    @Override // p000.ou0
    /* JADX INFO: renamed from: b */
    public void mo306b(Object obj) {
        this.f6985m.m5135k(obj);
    }

    @Override // p000.hu0
    /* JADX INFO: renamed from: c */
    public void mo307c() {
        this.f6985m.m5137m();
    }

    @Override // p000.lu0
    /* JADX INFO: renamed from: e */
    public void mo309e(Exception exc) {
        this.f6985m.m5136l(exc);
    }
}

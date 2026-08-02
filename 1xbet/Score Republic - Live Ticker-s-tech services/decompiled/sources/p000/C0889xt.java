package p000;

/* JADX INFO: renamed from: xt */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0889xt implements r60, InterfaceC0254gm {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ qc1 f9053j;

    @Override // p000.InterfaceC0254gm
    public void accept(Object obj) {
        this.f9053j.m4061b(obj);
    }

    @Override // p000.r60
    public Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        boolean z = th instanceof Exception;
        qc1 qc1Var = this.f9053j;
        if (z) {
            qc1Var.m4060a((Exception) th);
        } else {
            qc1Var.m4060a(new RuntimeException(th));
        }
        return lm0.f4838j;
    }
}

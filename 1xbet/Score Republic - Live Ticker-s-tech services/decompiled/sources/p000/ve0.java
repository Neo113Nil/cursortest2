package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ve0 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f8184j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ m81 f8185k;

    public /* synthetic */ ve0(int i, m81 m81Var) {
        this.f8184j = i;
        this.f8185k = m81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8184j) {
            case 0:
                m81 m81Var = this.f8185k;
                xe0 xe0Var = (xe0) m81Var.f5011m;
                xe0Var.f8924n = null;
                if (xe0Var.f8934x == null) {
                    te0 te0Var = xe0Var.f8931u;
                    te0 te0Var2 = (te0) m81Var.f5010l;
                    if (te0Var == te0Var2) {
                        xe0Var.f8932v = te0Var2;
                        xe0 xe0Var2 = (xe0) this.f8185k.f5011m;
                        xe0Var2.f8931u = null;
                        xe0.m5630e(xe0Var2, EnumC0474ml.f5072k);
                    }
                } else {
                    a90.m132p("Unexpected non-null activeTransport", xe0Var.f8932v == null);
                    m81 m81Var2 = this.f8185k;
                    ((te0) m81Var2.f5010l).mo3771a(((xe0) m81Var2.f5011m).f8934x);
                }
                break;
            default:
                m81 m81Var3 = this.f8185k;
                ((xe0) m81Var3.f5011m).f8929s.remove((te0) m81Var3.f5010l);
                if (((xe0) this.f8185k.f5011m).f8933w.f5453a == EnumC0474ml.f5075n && ((xe0) this.f8185k.f5011m).f8929s.isEmpty()) {
                    xe0 xe0Var3 = (xe0) this.f8185k.f5011m;
                    xe0Var3.f8921k.execute(new re0(xe0Var3, 2));
                    break;
                }
                break;
        }
    }
}

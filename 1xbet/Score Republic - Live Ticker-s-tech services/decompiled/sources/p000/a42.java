package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class a42 extends rt1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f34e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ v42 f35f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a42(v42 v42Var, f02 f02Var, int i) {
        super(f02Var);
        this.f34e = i;
        this.f35f = v42Var;
    }

    @Override // p000.rt1
    /* JADX INFO: renamed from: a */
    public final void mo23a() {
        int i = this.f34e;
        v42 v42Var = this.f35f;
        switch (i) {
            case 0:
                v42Var.mo11z();
                if (v42Var.m5070R()) {
                    ky1 ky1Var = ((f02) v42Var.f7192j).f2247o;
                    f02.m1560m(ky1Var);
                    ky1Var.f4608w.m5312a("Inactivity, disconnecting from the service");
                    v42Var.m5061I();
                    break;
                }
                break;
            default:
                ky1 ky1Var2 = ((f02) v42Var.f7192j).f2247o;
                f02.m1560m(ky1Var2);
                ky1Var2.f4603r.m5312a("Tasks have been queued for a long time");
                break;
        }
    }
}

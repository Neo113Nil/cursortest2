package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qe0 extends sq1 {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f6479k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ le0 f6480l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qe0(le0 le0Var, int i) {
        super(5);
        this.f6479k = i;
        this.f6480l = le0Var;
    }

    @Override // p000.sq1
    /* JADX INFO: renamed from: i */
    public final void mo4089i() {
        int i = this.f6479k;
        le0 le0Var = this.f6480l;
        switch (i) {
            case 0:
                xe0 xe0Var = (xe0) le0Var;
                ((il0) xe0Var.f8914d.f2314l).f3605F.f3996Y.m4577m(xe0Var, true);
                break;
            case 1:
                ((jl0) le0Var).m2922h();
                break;
            default:
                ((ot0) le0Var).f5892h.m3361j(true);
                break;
        }
    }

    @Override // p000.sq1
    /* JADX INFO: renamed from: j */
    public final void mo4090j() {
        int i = this.f6479k;
        le0 le0Var = this.f6480l;
        switch (i) {
            case 0:
                xe0 xe0Var = (xe0) le0Var;
                ((il0) xe0Var.f8914d.f2314l).f3605F.f3996Y.m4577m(xe0Var, false);
                break;
            case 1:
                jl0 jl0Var = (jl0) le0Var;
                if (!jl0Var.f3978G.get()) {
                    jl0Var.m2923j();
                    break;
                }
                break;
            default:
                ((ot0) le0Var).f5892h.m3361j(false);
                break;
        }
    }
}

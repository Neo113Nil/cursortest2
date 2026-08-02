package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vz0 implements r60, nw0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f8306j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ xz0 f8307k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C0463ma f8308l;

    public /* synthetic */ vz0(xz0 xz0Var, C0463ma c0463ma, int i) {
        this.f8306j = i;
        this.f8307k = xz0Var;
        this.f8308l = c0463ma;
    }

    @Override // p000.r60
    public Object apply(Object obj) {
        int i = this.f8306j;
        C0463ma c0463ma = this.f8308l;
        xz0 xz0Var = this.f8307k;
        uz0 uz0Var = (uz0) obj;
        xz0Var.getClass();
        switch (i) {
            case 0:
                c0463ma.getClass();
                rz0 rz0VarM5008p = uz0Var.m5008p(xz0Var.m5719b());
                zg1.m5905p(rz0VarM5008p, "item is null");
                return new C0288hj(3, new zs0(new zs0(new zs0(new dt0(rz0VarM5008p), new vz0(xz0Var, c0463ma, 1), 0), new dt0(xz0Var.m5719b()), 2), new C0615qe(14, uz0Var, c0463ma), 1), new wz0(xz0Var, 2));
            default:
                c0463ma.getClass();
                return uz0Var.m5008p(xz0Var.m5719b());
        }
    }

    @Override // p000.nw0
    public boolean test(Object obj) {
        int i = this.f8306j;
        C0463ma c0463ma = this.f8308l;
        xz0 xz0Var = this.f8307k;
        rz0 rz0Var = (rz0) obj;
        switch (i) {
            case 1:
                xz0Var.f9113b.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() - rz0Var.m4437r();
                c0463ma.getClass();
                return !(jCurrentTimeMillis > 86400000);
            default:
                xz0Var.f9113b.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - rz0Var.m4437r();
                c0463ma.getClass();
                return jCurrentTimeMillis2 > 86400000 || rz0Var.m4438s() < 1;
        }
    }
}

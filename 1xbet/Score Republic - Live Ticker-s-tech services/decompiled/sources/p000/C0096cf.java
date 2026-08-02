package p000;

/* JADX INFO: renamed from: cf */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0096cf implements x60 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1240j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1241k;

    public /* synthetic */ C0096cf(br0 br0Var, ar0 ar0Var) {
        this.f1240j = 1;
        this.f1241k = br0Var;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: e */
    public final Object mo928e(Object obj, Object obj2, Object obj3) {
        int i = this.f1240j;
        kf1 kf1Var = kf1.f4365a;
        Object obj4 = this.f1241k;
        switch (i) {
            case 0:
                ((ab0) obj4).mo170i((Throwable) obj);
                break;
            case 1:
                br0 br0Var = (br0) obj4;
                br0.f966i.set(br0Var, null);
                br0Var.m748g(null);
                break;
            default:
                ((l61) obj4).m3184b();
                break;
        }
        return kf1Var;
    }

    public /* synthetic */ C0096cf(int i, Object obj) {
        this.f1240j = i;
        this.f1241k = obj;
    }
}

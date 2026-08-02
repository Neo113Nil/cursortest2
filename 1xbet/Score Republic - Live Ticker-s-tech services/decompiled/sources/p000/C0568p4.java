package p000;

/* JADX INFO: renamed from: p4 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0568p4 implements InterfaceC0931yy {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5976a;

    /* JADX INFO: renamed from: b */
    public final qd0 f5977b;

    public /* synthetic */ C0568p4(qd0 qd0Var, int i) {
        this.f5976a = i;
        this.f5977b = qd0Var;
    }

    @Override // p000.ny0
    public final Object get() {
        int i = this.f5976a;
        qd0 qd0Var = this.f5977b;
        switch (i) {
            case 0:
                return (w00) qd0Var.f6471k;
            case 1:
                m10 m10Var = (m10) qd0Var.f6472l;
                yd0.m5765d(m10Var);
                return m10Var;
            default:
                return new x90((w00) qd0Var.f6471k);
        }
    }
}

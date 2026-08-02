package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qx0 implements InterfaceC0931yy {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6628a;

    /* JADX INFO: renamed from: b */
    public final jg0 f6629b;

    public /* synthetic */ qx0(jg0 jg0Var, int i) {
        this.f6628a = i;
        this.f6629b = jg0Var;
    }

    @Override // p000.ny0
    public final Object get() {
        int i = this.f6628a;
        jg0 jg0Var = this.f6629b;
        switch (i) {
            case 0:
                dd0 dd0Var = new dd0(jg0Var);
                int i2 = g20.f2582j;
                AbstractC0024an.m290m("mode is null", 3);
                w30 w30VarM1972c = new r20(0, dd0Var).m1972c();
                w30VarM1972c.m5230f();
                return w30VarM1972c;
            default:
                return (px0) jg0Var.f3922k;
        }
    }
}

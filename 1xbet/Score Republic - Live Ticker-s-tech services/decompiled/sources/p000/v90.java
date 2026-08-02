package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class v90 implements InterfaceC0931yy {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8138a;

    public /* synthetic */ v90() {
        this.f8138a = 1;
    }

    @Override // p000.ny0
    public final Object get() {
        switch (this.f8138a) {
            case 0:
                return "firebaseinappmessaging.googleapis.com";
            case 1:
                return new x80(11);
            case 2:
                g51 g51Var = o51.f5628a;
                yd0.m5765d(g51Var);
                return g51Var;
            case 3:
                g51 g51Var2 = o51.f5629b;
                yd0.m5765d(g51Var2);
                return g51Var2;
            case 4:
                ma0 ma0Var = AbstractC0273h4.f3041a;
                if (ma0Var != null) {
                    return ma0Var;
                }
                C0270h1.m2192h("scheduler == null");
                return null;
            default:
                return new kc1();
        }
    }

    public /* synthetic */ v90(int i, Object obj) {
        this.f8138a = i;
    }
}

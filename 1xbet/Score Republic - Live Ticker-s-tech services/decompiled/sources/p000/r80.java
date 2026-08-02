package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class r80 {

    /* JADX INFO: renamed from: a */
    public final zc0 f6729a;

    /* JADX INFO: renamed from: b */
    public final g10 f6730b;

    public r80(zc0 zc0Var, g10 g10Var) {
        this.f6729a = zc0Var;
        this.f6730b = g10Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m4275a(t80 t80Var) {
        g10 g10Var;
        m80.m3343j("Image Downloading  Error : " + t80Var.getMessage() + ":" + t80Var.getCause());
        if (this.f6729a == null || (g10Var = this.f6730b) == null) {
            return;
        }
        if (t80Var.getLocalizedMessage().contains("Failed to decode")) {
            ((C0963zt) g10Var).m6032a(f10.f2265m);
        } else {
            ((C0963zt) g10Var).m6032a(f10.f2262j);
        }
    }
}

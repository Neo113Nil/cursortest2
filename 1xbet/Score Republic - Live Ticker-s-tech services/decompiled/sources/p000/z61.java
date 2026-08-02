package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class z61 extends AbstractC0875xf {
    @Override // p000.AbstractC0875xf
    /* JADX INFO: renamed from: n */
    public final boolean mo5657n(a71 a71Var) {
        synchronized (a71Var) {
            try {
                if (a71Var.f54l != 0) {
                    return false;
                }
                a71Var.f54l = -1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC0875xf
    /* JADX INFO: renamed from: o */
    public final void mo5658o(a71 a71Var) {
        synchronized (a71Var) {
            a71Var.f54l = 0;
        }
    }
}

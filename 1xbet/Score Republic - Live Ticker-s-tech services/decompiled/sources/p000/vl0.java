package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class vl0 implements oo0 {

    /* JADX INFO: renamed from: a */
    public oo0[] f8217a;

    @Override // p000.oo0
    /* JADX INFO: renamed from: a */
    public final yz0 mo3329a(Class cls) {
        for (oo0 oo0Var : this.f8217a) {
            if (oo0Var.mo3330b(cls)) {
                return oo0Var.mo3329a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // p000.oo0
    /* JADX INFO: renamed from: b */
    public final boolean mo3330b(Class cls) {
        for (oo0 oo0Var : this.f8217a) {
            if (oo0Var.mo3330b(cls)) {
                return true;
            }
        }
        return false;
    }
}

package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class wl0 implements po0 {

    /* JADX INFO: renamed from: a */
    public po0[] f8581a;

    @Override // p000.po0
    /* JADX INFO: renamed from: a */
    public final zz0 mo3487a(Class cls) {
        for (po0 po0Var : this.f8581a) {
            if (po0Var.mo3488b(cls)) {
                return po0Var.mo3487a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // p000.po0
    /* JADX INFO: renamed from: b */
    public final boolean mo3488b(Class cls) {
        for (po0 po0Var : this.f8581a) {
            if (po0Var.mo3488b(cls)) {
                return true;
            }
        }
        return false;
    }
}

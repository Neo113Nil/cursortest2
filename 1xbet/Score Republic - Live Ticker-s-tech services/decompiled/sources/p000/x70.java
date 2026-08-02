package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class x70 implements fa1 {

    /* JADX INFO: renamed from: a */
    public final dh1 f8840a;

    /* JADX INFO: renamed from: b */
    public final qc1 f8841b;

    public x70(dh1 dh1Var, qc1 qc1Var) {
        this.f8840a = dh1Var;
        this.f8841b = qc1Var;
    }

    @Override // p000.fa1
    /* JADX INFO: renamed from: a */
    public final boolean mo1753a(Exception exc) {
        this.f8841b.m4062c(exc);
        return true;
    }

    @Override // p000.fa1
    /* JADX INFO: renamed from: b */
    public final boolean mo1754b(C0389ka c0389ka) {
        if (c0389ka.f4323b == 4 && !this.f8840a.m1212a(c0389ka)) {
            String str = c0389ka.f4324c;
            if (str != null) {
                this.f8841b.m4061b(new C0091ca(str, c0389ka.f4326e, c0389ka.f4327f));
                return true;
            }
            C0270h1.m2192h("Null token");
        }
        return false;
    }
}

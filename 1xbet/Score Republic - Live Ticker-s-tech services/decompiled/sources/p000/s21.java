package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class s21 extends eg0 {

    /* JADX INFO: renamed from: h */
    public final fg0 f7019h;

    public s21(fg0 fg0Var) {
        this.f7019h = fg0Var;
    }

    @Override // p000.eg0
    /* JADX INFO: renamed from: r */
    public final boolean mo1414r() {
        return false;
    }

    @Override // p000.eg0
    /* JADX INFO: renamed from: s */
    public final void mo1415s(Throwable th) {
        Object objM2605E = m1413q().m2605E();
        boolean z = objM2605E instanceof C0657rj;
        fg0 fg0Var = this.f7019h;
        if (z) {
            fg0Var.mo476f(wo1.m5380e(((C0657rj) objM2605E).f6860a));
        } else {
            fg0Var.mo476f(AbstractC0959zp.m5991y(objM2605E));
        }
    }
}

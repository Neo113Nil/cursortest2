package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ig1 implements InterfaceC0104cn {

    /* JADX INFO: renamed from: j */
    public final ig1 f3567j;

    /* JADX INFO: renamed from: k */
    public final C0848wp f3568k;

    public ig1(ig1 ig1Var, C0848wp c0848wp) {
        this.f3567j = ig1Var;
        this.f3568k = c0848wp;
    }

    /* JADX INFO: renamed from: b */
    public final void m2636b(C0848wp c0848wp) {
        if (this.f3568k == c0848wp) {
            C0270h1.m2191g("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        ig1 ig1Var = this.f3567j;
        if (ig1Var != null) {
            ig1Var.m2636b(c0848wp);
        }
    }

    @Override // p000.InterfaceC0104cn
    public final InterfaceC0144dn getKey() {
        return wa0.f8476p;
    }

    @Override // p000.InterfaceC0180en
    /* JADX INFO: renamed from: i */
    public final InterfaceC0180en mo1465i(InterfaceC0180en interfaceC0180en) {
        interfaceC0180en.getClass();
        return interfaceC0180en == C0301hw.f3348j ? this : (InterfaceC0180en) interfaceC0180en.mo1467l(this, new C0804vi(1));
    }

    @Override // p000.InterfaceC0180en
    /* JADX INFO: renamed from: j */
    public final InterfaceC0104cn mo1466j(InterfaceC0144dn interfaceC0144dn) {
        return zg1.m5895f(this, interfaceC0144dn);
    }

    @Override // p000.InterfaceC0180en
    /* JADX INFO: renamed from: l */
    public final Object mo1467l(Object obj, v60 v60Var) {
        return v60Var.mo1490g(obj, this);
    }

    @Override // p000.InterfaceC0180en
    /* JADX INFO: renamed from: m */
    public final InterfaceC0180en mo1468m(InterfaceC0144dn interfaceC0144dn) {
        return zg1.m5904o(this, interfaceC0144dn);
    }
}

package p000;

/* JADX INFO: renamed from: p */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0563p implements InterfaceC0104cn {

    /* JADX INFO: renamed from: j */
    public final InterfaceC0144dn f5939j;

    public AbstractC0563p(InterfaceC0144dn interfaceC0144dn) {
        this.f5939j = interfaceC0144dn;
    }

    @Override // p000.InterfaceC0104cn
    public final InterfaceC0144dn getKey() {
        return this.f5939j;
    }

    @Override // p000.InterfaceC0180en
    /* JADX INFO: renamed from: i */
    public final InterfaceC0180en mo1465i(InterfaceC0180en interfaceC0180en) {
        interfaceC0180en.getClass();
        return interfaceC0180en == C0301hw.f3348j ? this : (InterfaceC0180en) interfaceC0180en.mo1467l(this, new C0804vi(1));
    }

    @Override // p000.InterfaceC0180en
    /* JADX INFO: renamed from: j */
    public /* bridge */ InterfaceC0104cn mo1466j(InterfaceC0144dn interfaceC0144dn) {
        return zg1.m5895f(this, interfaceC0144dn);
    }

    @Override // p000.InterfaceC0180en
    /* JADX INFO: renamed from: l */
    public final Object mo1467l(Object obj, v60 v60Var) {
        return v60Var.mo1490g(obj, this);
    }

    @Override // p000.InterfaceC0180en
    /* JADX INFO: renamed from: m */
    public /* bridge */ InterfaceC0180en mo1468m(InterfaceC0144dn interfaceC0144dn) {
        return zg1.m5904o(this, interfaceC0144dn);
    }
}

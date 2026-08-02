package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class fg0 extends C0136df {

    /* JADX INFO: renamed from: t */
    public final C0324ij f2396t;

    public fg0(InterfaceC0808vm interfaceC0808vm, C0324ij c0324ij) {
        super(1, interfaceC0808vm);
        this.f2396t = c0324ij;
    }

    @Override // p000.C0136df
    /* JADX INFO: renamed from: B */
    public final String mo1175B() {
        return "AwaitContinuation";
    }

    @Override // p000.C0136df
    /* JADX INFO: renamed from: s */
    public final Throwable mo1193s(ig0 ig0Var) {
        Throwable thM2265e;
        Object objM2605E = this.f2396t.m2605E();
        if (!(objM2605E instanceof hg0) || (thM2265e = ((hg0) objM2605E).m2265e()) == null) {
            return objM2605E instanceof C0657rj ? ((C0657rj) objM2605E).f6860a : ig0Var.m2635z();
        }
        return thM2265e;
    }
}

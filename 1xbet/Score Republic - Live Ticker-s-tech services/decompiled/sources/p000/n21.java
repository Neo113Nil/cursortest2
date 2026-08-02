package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n21 extends AbstractC0243gb {
    public n21(InterfaceC0808vm interfaceC0808vm) {
        super(interfaceC0808vm);
        if (interfaceC0808vm.mo475d() == C0301hw.f3348j) {
            return;
        }
        C0270h1.m2190f("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // p000.InterfaceC0808vm
    /* JADX INFO: renamed from: d */
    public final InterfaceC0180en mo475d() {
        return C0301hw.f3348j;
    }
}

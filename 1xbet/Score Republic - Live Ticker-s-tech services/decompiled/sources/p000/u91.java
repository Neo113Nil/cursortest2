package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class u91 implements InterfaceC0808vm, InterfaceC0550on {

    /* JADX INFO: renamed from: j */
    public final InterfaceC0808vm f7716j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC0180en f7717k;

    public u91(InterfaceC0808vm interfaceC0808vm, InterfaceC0180en interfaceC0180en) {
        this.f7716j = interfaceC0808vm;
        this.f7717k = interfaceC0180en;
    }

    @Override // p000.InterfaceC0550on
    /* JADX INFO: renamed from: c */
    public final InterfaceC0550on mo1182c() {
        InterfaceC0808vm interfaceC0808vm = this.f7716j;
        if (interfaceC0808vm instanceof InterfaceC0550on) {
            return (InterfaceC0550on) interfaceC0808vm;
        }
        return null;
    }

    @Override // p000.InterfaceC0808vm
    /* JADX INFO: renamed from: d */
    public final InterfaceC0180en mo475d() {
        return this.f7717k;
    }

    @Override // p000.InterfaceC0808vm
    /* JADX INFO: renamed from: f */
    public final void mo476f(Object obj) {
        this.f7716j.mo476f(obj);
    }
}

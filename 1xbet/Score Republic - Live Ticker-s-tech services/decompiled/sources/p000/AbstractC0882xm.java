package p000;

/* JADX INFO: renamed from: xm */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0882xm extends AbstractC0243gb {

    /* JADX INFO: renamed from: k */
    public final InterfaceC0180en f8992k;

    /* JADX INFO: renamed from: l */
    public transient InterfaceC0808vm f8993l;

    public AbstractC0882xm(InterfaceC0808vm interfaceC0808vm) {
        this(interfaceC0808vm, interfaceC0808vm != null ? interfaceC0808vm.mo475d() : null);
    }

    @Override // p000.InterfaceC0808vm
    /* JADX INFO: renamed from: d */
    public InterfaceC0180en mo475d() {
        InterfaceC0180en interfaceC0180en = this.f8992k;
        interfaceC0180en.getClass();
        return interfaceC0180en;
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: o */
    public void mo2013o() {
        InterfaceC0808vm interfaceC0808vm = this.f8993l;
        if (interfaceC0808vm != null && interfaceC0808vm != this) {
            InterfaceC0104cn interfaceC0104cnMo1466j = mo475d().mo1466j(o31.f5604l);
            interfaceC0104cnMo1466j.getClass();
            C0704st c0704st = (C0704st) interfaceC0808vm;
            c0704st.m4589l();
            C0136df c0136dfM4591o = c0704st.m4591o();
            if (c0136dfM4591o != null) {
                c0136dfM4591o.m1191q();
            }
        }
        this.f8993l = C0620qj.f6506k;
    }

    public AbstractC0882xm(InterfaceC0808vm interfaceC0808vm, InterfaceC0180en interfaceC0180en) {
        super(interfaceC0808vm);
        this.f8992k = interfaceC0180en;
    }
}

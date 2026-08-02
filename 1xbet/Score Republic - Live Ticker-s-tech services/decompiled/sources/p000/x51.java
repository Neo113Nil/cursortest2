package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class x51 extends AbstractC0526o implements InterfaceC0550on {

    /* JADX INFO: renamed from: o */
    public final InterfaceC0808vm f8793o;

    public x51(InterfaceC0808vm interfaceC0808vm, InterfaceC0180en interfaceC0180en) {
        super(interfaceC0180en, true);
        this.f8793o = interfaceC0808vm;
    }

    @Override // p000.ig0
    /* JADX INFO: renamed from: J */
    public final boolean mo2610J() {
        return true;
    }

    @Override // p000.InterfaceC0550on
    /* JADX INFO: renamed from: c */
    public final InterfaceC0550on mo1182c() {
        InterfaceC0808vm interfaceC0808vm = this.f8793o;
        if (interfaceC0808vm instanceof InterfaceC0550on) {
            return (InterfaceC0550on) interfaceC0808vm;
        }
        return null;
    }

    @Override // p000.ig0
    /* JADX INFO: renamed from: o */
    public void mo2625o(Object obj) {
        af0.m195j(d71.m1111f(this.f8793o), j22.m2817z(obj));
    }

    @Override // p000.ig0
    /* JADX INFO: renamed from: p */
    public void mo2035p(Object obj) {
        this.f8793o.mo476f(j22.m2817z(obj));
    }
}

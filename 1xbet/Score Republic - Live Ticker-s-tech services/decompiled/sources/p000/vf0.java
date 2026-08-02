package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class vf0 extends xb1 implements v60 {

    /* JADX INFO: renamed from: n */
    public /* synthetic */ Object f8191n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ rw0 f8192o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Long f8193p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf0(rw0 rw0Var, Long l, InterfaceC0808vm interfaceC0808vm) {
        super(2, interfaceC0808vm);
        this.f8192o = rw0Var;
        this.f8193p = l;
    }

    @Override // p000.v60
    /* JADX INFO: renamed from: g */
    public final Object mo1490g(Object obj, Object obj2) {
        vf0 vf0Var = (vf0) mo1491k((InterfaceC0808vm) obj2, (zq0) obj);
        kf1 kf1Var = kf1.f4365a;
        vf0Var.mo17m(kf1Var);
        return kf1Var;
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: k */
    public final InterfaceC0808vm mo1491k(InterfaceC0808vm interfaceC0808vm, Object obj) {
        vf0 vf0Var = new vf0(this.f8192o, this.f8193p, interfaceC0808vm);
        vf0Var.f8191n = obj;
        return vf0Var;
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: m */
    public final Object mo17m(Object obj) {
        wo1.m5395v(obj);
        ((zq0) this.f8191n).m6024c(this.f8192o, this.f8193p);
        return kf1.f4365a;
    }
}

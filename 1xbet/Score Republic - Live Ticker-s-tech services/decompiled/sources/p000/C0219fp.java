package p000;

/* JADX INFO: renamed from: fp */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0219fp extends xb1 implements v60 {

    /* JADX INFO: renamed from: n */
    public /* synthetic */ Object f2466n;

    @Override // p000.v60
    /* JADX INFO: renamed from: g */
    public final Object mo1490g(Object obj, Object obj2) {
        return ((C0219fp) mo1491k((InterfaceC0808vm) obj2, (aa1) obj)).mo17m(kf1.f4365a);
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: k */
    public final InterfaceC0808vm mo1491k(InterfaceC0808vm interfaceC0808vm, Object obj) {
        C0219fp c0219fp = new C0219fp(2, interfaceC0808vm);
        c0219fp.f2466n = obj;
        return c0219fp;
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: m */
    public final Object mo17m(Object obj) {
        wo1.m5395v(obj);
        return Boolean.valueOf(!(((aa1) this.f2466n) instanceof r00));
    }
}

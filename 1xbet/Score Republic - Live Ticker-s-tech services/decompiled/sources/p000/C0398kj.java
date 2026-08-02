package p000;

/* JADX INFO: renamed from: kj */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0398kj extends AbstractC0213fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4396a;

    /* JADX INFO: renamed from: b */
    public final Object f4397b;

    public /* synthetic */ C0398kj(int i, Object obj) {
        this.f4396a = i;
        this.f4397b = obj;
    }

    @Override // p000.AbstractC0213fj
    /* JADX INFO: renamed from: d */
    public final void mo1875d(InterfaceC0435lj interfaceC0435lj) {
        int i = this.f4396a;
        Object obj = this.f4397b;
        switch (i) {
            case 0:
                C0264gw c0264gw = new C0264gw(t22.f7258c);
                interfaceC0435lj.mo608a(c0264gw);
                try {
                    ((InterfaceC0003a2) obj).run();
                    if (!c0264gw.m2160b()) {
                        interfaceC0435lj.onComplete();
                    }
                    break;
                } catch (Throwable th) {
                    wo1.m5394u(th);
                    if (c0264gw.m2160b()) {
                        vt1.m5196h(th);
                        return;
                    } else {
                        interfaceC0435lj.onError(th);
                        return;
                    }
                }
                break;
            case 1:
                C0264gw c0264gw2 = new C0264gw(t22.f7258c);
                interfaceC0435lj.mo608a(c0264gw2);
                try {
                    ((CallableC0340iz) obj).call();
                    if (!c0264gw2.m2160b()) {
                        interfaceC0435lj.onComplete();
                    }
                    break;
                } catch (Throwable th2) {
                    wo1.m5394u(th2);
                    if (c0264gw2.m2160b()) {
                        vt1.m5196h(th2);
                        return;
                    } else {
                        interfaceC0435lj.onError(th2);
                        return;
                    }
                }
                break;
            default:
                ((C0509nj) obj).m1874c(new b90(this, interfaceC0435lj));
                break;
        }
    }
}

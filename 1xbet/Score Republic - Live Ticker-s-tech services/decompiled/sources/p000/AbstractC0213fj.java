package p000;

/* JADX INFO: renamed from: fj */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0213fj {
    /* JADX INFO: renamed from: a */
    public final C0509nj m1872a(InterfaceC0003a2 interfaceC0003a2) {
        return new C0509nj(this, t22.f7260e, interfaceC0003a2);
    }

    /* JADX INFO: renamed from: b */
    public final void m1873b() {
        m1874c(new C0264gw(0));
    }

    /* JADX INFO: renamed from: c */
    public final void m1874c(InterfaceC0435lj interfaceC0435lj) {
        try {
            mo1875d(interfaceC0435lj);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            wo1.m5394u(th);
            vt1.m5196h(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo1875d(InterfaceC0435lj interfaceC0435lj);

    /* JADX INFO: renamed from: e */
    public final hm0 m1876e() {
        return new km0(1, this);
    }
}

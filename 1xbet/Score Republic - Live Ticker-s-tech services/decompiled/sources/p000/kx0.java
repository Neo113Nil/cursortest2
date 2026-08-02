package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class kx0 extends AbstractC0526o implements InterfaceC0690sf, o61 {

    /* JADX INFO: renamed from: o */
    public final C0650rc f4590o;

    public kx0(InterfaceC0180en interfaceC0180en, C0650rc c0650rc) {
        super(interfaceC0180en, true);
        this.f4590o = c0650rc;
    }

    @Override // p000.AbstractC0526o
    /* JADX INFO: renamed from: a0 */
    public final void mo3101a0(Throwable th, boolean z) {
        if (this.f4590o.m4320f(th, false) || z) {
            return;
        }
        AbstractC0959zp.m5980i(this.f5570n, th);
    }

    @Override // p000.AbstractC0526o
    /* JADX INFO: renamed from: b0 */
    public final void mo3102b0(Object obj) {
        this.f4590o.m4320f(null, false);
    }

    @Override // p000.ig0, p000.ag0
    /* JADX INFO: renamed from: e */
    public final void mo204e(CancellationException cancellationException) {
        Object objM2605E = m2605E();
        if (objM2605E instanceof C0657rj) {
            return;
        }
        if ((objM2605E instanceof hg0) && ((hg0) objM2605E).m2266f()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new bg0(mo2630u(), null, this);
        }
        mo2628s(cancellationException);
    }

    @Override // p000.o61
    /* JADX INFO: renamed from: g */
    public final Object mo1435g(InterfaceC0808vm interfaceC0808vm, Object obj) {
        return this.f4590o.mo1435g(interfaceC0808vm, obj);
    }

    @Override // p000.o61
    /* JADX INFO: renamed from: k */
    public final Object mo1436k(Object obj) {
        throw null;
    }

    @Override // p000.ig0
    /* JADX INFO: renamed from: s */
    public final void mo2628s(CancellationException cancellationException) {
        this.f4590o.m4320f(cancellationException, true);
        m2627r(cancellationException);
    }
}

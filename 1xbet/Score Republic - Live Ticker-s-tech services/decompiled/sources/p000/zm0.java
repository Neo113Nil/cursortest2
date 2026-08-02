package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class zm0 extends AbstractC0628qr implements xm0 {

    /* JADX INFO: renamed from: l */
    public InterfaceC0187eu f9862l;

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final void mo975a(InterfaceC0187eu interfaceC0187eu) {
        if (EnumC0262gu.m2150f(this.f9862l, interfaceC0187eu)) {
            this.f9862l = interfaceC0187eu;
            this.f6568j.mo933e(this);
        }
    }

    @Override // p000.ib1
    public final void cancel() {
        set(4);
        this.f6569k = null;
        this.f9862l.mo480c();
    }

    @Override // p000.xm0
    public final void onComplete() {
        this.f6568j.onComplete();
    }

    @Override // p000.xm0
    public final void onError(Throwable th) {
        this.f6568j.onError(th);
    }
}

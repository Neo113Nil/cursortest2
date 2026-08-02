package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: gw */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0264gw extends AtomicReference implements InterfaceC0435lj, InterfaceC0187eu {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2951j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0264gw(Object obj) {
        super(obj);
        this.f2951j = 1;
    }

    @Override // p000.InterfaceC0435lj
    /* JADX INFO: renamed from: a */
    public void mo608a(InterfaceC0187eu interfaceC0187eu) {
        EnumC0262gu.m2149e(this, interfaceC0187eu);
    }

    /* JADX INFO: renamed from: b */
    public boolean m2160b() {
        switch (this.f2951j) {
            case 1:
                return get() == null;
            default:
                return EnumC0262gu.m2147b((InterfaceC0187eu) get());
        }
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        Object andSet;
        switch (this.f2951j) {
            case 0:
                EnumC0262gu.m2146a(this);
                break;
            case 1:
                if (get() != null && (andSet = getAndSet(null)) != null) {
                    ((Runnable) andSet).run();
                    break;
                }
                break;
            default:
                EnumC0262gu.m2146a(this);
                break;
        }
    }

    @Override // p000.InterfaceC0435lj
    public void onComplete() {
        lazySet(EnumC0262gu.f2872j);
    }

    @Override // p000.InterfaceC0435lj
    public void onError(Throwable th) {
        lazySet(EnumC0262gu.f2872j);
        vt1.m5196h(new ku0(th));
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.f2951j) {
            case 1:
                return "RunnableDisposable(disposed=" + m2160b() + ", " + get() + ")";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0264gw(int i) {
        this.f2951j = i;
    }
}

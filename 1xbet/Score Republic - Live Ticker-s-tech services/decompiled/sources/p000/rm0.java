package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class rm0 extends hm0 implements Callable {

    /* JADX INFO: renamed from: j */
    public final Callable f6889j;

    public rm0(Callable callable) {
        this.f6889j = callable;
    }

    @Override // p000.hm0
    /* JADX INFO: renamed from: c */
    public final void mo2294c(xm0 xm0Var) {
        C0264gw c0264gw = new C0264gw(t22.f7258c);
        xm0Var.mo975a(c0264gw);
        if (c0264gw.m2160b()) {
            return;
        }
        try {
            Object objCall = this.f6889j.call();
            if (c0264gw.m2160b()) {
                return;
            }
            if (objCall == null) {
                xm0Var.onComplete();
            } else {
                xm0Var.mo976b(objCall);
            }
        } catch (Throwable th) {
            wo1.m5394u(th);
            if (c0264gw.m2160b()) {
                vt1.m5196h(th);
            } else {
                xm0Var.onError(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f6889j.call();
    }
}

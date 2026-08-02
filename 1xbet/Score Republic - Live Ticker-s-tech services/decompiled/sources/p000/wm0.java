package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class wm0 extends AtomicReference implements xm0, InterfaceC0187eu, Runnable {

    /* JADX INFO: renamed from: j */
    public final xm0 f8582j;

    /* JADX INFO: renamed from: k */
    public final g51 f8583k;

    /* JADX INFO: renamed from: l */
    public Object f8584l;

    /* JADX INFO: renamed from: m */
    public Throwable f8585m;

    public wm0(xm0 xm0Var, g51 g51Var) {
        this.f8582j = xm0Var;
        this.f8583k = g51Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final void mo975a(InterfaceC0187eu interfaceC0187eu) {
        if (EnumC0262gu.m2149e(this, interfaceC0187eu)) {
            this.f8582j.mo975a(this);
        }
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: b */
    public final void mo976b(Object obj) {
        this.f8584l = obj;
        EnumC0262gu.m2148d(this, this.f8583k.m1987b(this));
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        EnumC0262gu.m2146a(this);
    }

    @Override // p000.xm0
    public final void onComplete() {
        EnumC0262gu.m2148d(this, this.f8583k.m1987b(this));
    }

    @Override // p000.xm0
    public final void onError(Throwable th) {
        this.f8585m = th;
        EnumC0262gu.m2148d(this, this.f8583k.m1987b(this));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th = this.f8585m;
        xm0 xm0Var = this.f8582j;
        if (th != null) {
            this.f8585m = null;
            xm0Var.onError(th);
            return;
        }
        Object obj = this.f8584l;
        if (obj == null) {
            xm0Var.onComplete();
        } else {
            this.f8584l = null;
            xm0Var.mo976b(obj);
        }
    }
}

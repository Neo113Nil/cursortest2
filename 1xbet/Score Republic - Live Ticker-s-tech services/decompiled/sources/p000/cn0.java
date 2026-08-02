package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class cn0 extends AtomicReference implements xm0 {

    /* JADX INFO: renamed from: j */
    public final bn0 f1296j;

    /* JADX INFO: renamed from: k */
    public final int f1297k;

    public cn0(bn0 bn0Var, int i) {
        this.f1296j = bn0Var;
        this.f1297k = i;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final void mo975a(InterfaceC0187eu interfaceC0187eu) {
        EnumC0262gu.m2149e(this, interfaceC0187eu);
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: b */
    public final void mo976b(Object obj) {
        bn0 bn0Var = this.f1296j;
        xm0 xm0Var = bn0Var.f921j;
        Object[] objArr = bn0Var.f924m;
        objArr[this.f1297k] = obj;
        if (bn0Var.decrementAndGet() == 0) {
            try {
                xm0Var.mo976b(bn0Var.f922k.apply(objArr));
            } catch (Throwable th) {
                wo1.m5394u(th);
                xm0Var.onError(th);
            }
        }
    }

    @Override // p000.xm0
    public final void onComplete() {
        bn0 bn0Var = this.f1296j;
        if (bn0Var.getAndSet(0) > 0) {
            bn0Var.m725a(this.f1297k);
            bn0Var.f921j.onComplete();
        }
    }

    @Override // p000.xm0
    public final void onError(Throwable th) {
        bn0 bn0Var = this.f1296j;
        if (bn0Var.getAndSet(0) <= 0) {
            vt1.m5196h(th);
        } else {
            bn0Var.m725a(this.f1297k);
            bn0Var.f921j.onError(th);
        }
    }
}

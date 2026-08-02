package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ev0 extends o80 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ fv0 f2186n;

    public ev0(fv0 fv0Var) {
        this.f2186n = fv0Var;
    }

    @Override // p000.o80
    /* JADX INFO: renamed from: A */
    public final void mo1308A(ja1 ja1Var) {
        yu0 yu0Var = this.f2186n.f2506a;
        boolean zM2838f = ja1Var.m2838f();
        cv0 cv0Var = yu0Var.f9467a;
        if (cv0Var.f1466e == null && cv0Var.f1467f == null) {
            return;
        }
        f50 f50Var = yu0Var.f9468b;
        if (zM2838f) {
            ((AtomicLong) f50Var.f2313k).getAndIncrement();
        } else {
            ((AtomicLong) f50Var.f2314l).getAndIncrement();
        }
    }
}

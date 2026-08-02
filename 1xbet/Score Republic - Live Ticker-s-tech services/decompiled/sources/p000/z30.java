package p000;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class z30 extends AbstractC0628qr implements y30, ib1 {

    /* JADX INFO: renamed from: l */
    public ib1 f9591l;

    @Override // p000.ib1
    public final void cancel() {
        set(4);
        this.f6569k = null;
        this.f9591l.cancel();
    }

    @Override // p000.y30
    /* JADX INFO: renamed from: e */
    public final void mo933e(ib1 ib1Var) {
        if (jb1.m2846d(this.f9591l, ib1Var)) {
            this.f9591l = ib1Var;
            this.f6568j.mo933e(this);
            ib1Var.request(Long.MAX_VALUE);
        }
    }

    @Override // p000.y30
    public final void onComplete() {
        m4133c(this.f6569k);
    }

    @Override // p000.y30
    public final void onError(Throwable th) {
        this.f6569k = null;
        this.f6568j.onError(th);
    }

    @Override // p000.y30
    public final void onNext(Object obj) {
        Collection collection = (Collection) this.f6569k;
        if (collection != null) {
            collection.add(obj);
        }
    }
}

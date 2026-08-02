package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class q20 extends n20 {
    @Override // p000.n20
    /* JADX INFO: renamed from: d */
    public final void mo3469d(Object obj) {
        long j;
        if (this.f5261k.m2160b()) {
            return;
        }
        if (obj == null) {
            m3468c(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        this.f5260j.onNext(obj);
        do {
            j = get();
            if (j == 0) {
                return;
            }
        } while (!compareAndSet(j, j - 1));
    }
}

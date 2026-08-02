package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class p20 extends n20 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f5966l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p20(y30 y30Var, int i) {
        super(y30Var);
        this.f5966l = i;
    }

    @Override // p000.n20
    /* JADX INFO: renamed from: d */
    public final void mo3469d(Object obj) {
        if (this.f5261k.m2160b()) {
        }
        if (obj == null) {
            m3468c(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        if (get() != 0) {
            this.f5260j.onNext(obj);
            AbstractC0875xf.m5652l(this, 1L);
        } else {
            switch (this.f5966l) {
                case 0:
                    break;
                default:
                    m3468c(new bq0("create: could not emit value due to lack of requests"));
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m3842h() {
    }
}

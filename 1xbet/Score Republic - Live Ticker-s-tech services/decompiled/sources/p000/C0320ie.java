package p000;

/* JADX INFO: renamed from: ie */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0320ie extends AbstractC0786v0 {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C0356je f3556q;

    public C0320ie(C0356je c0356je) {
        this.f3556q = c0356je;
    }

    @Override // p000.AbstractC0786v0
    /* JADX INFO: renamed from: h */
    public final String mo2595h() {
        C0283he c0283he = (C0283he) this.f3556q.f3910j.get();
        if (c0283he == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + c0283he.f3180a + "]";
    }
}

package p000;

/* JADX INFO: renamed from: o6 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0533o6 extends w40 {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ C0792v6 f5637s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C0903y6 f5638t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0533o6(C0903y6 c0903y6, C0903y6 c0903y7, C0792v6 c0792v6) {
        super(c0903y7);
        this.f5638t = c0903y6;
        this.f5637s = c0792v6;
    }

    @Override // p000.w40
    /* JADX INFO: renamed from: b */
    public final t71 mo2980b() {
        return this.f5637s;
    }

    @Override // p000.w40
    /* JADX INFO: renamed from: c */
    public final boolean mo2981c() {
        C0903y6 c0903y6 = this.f5638t;
        if (c0903y6.getInternalPopup().mo4257a()) {
            return true;
        }
        c0903y6.f9185o.mo4265m(c0903y6.getTextDirection(), c0903y6.getTextAlignment());
        return true;
    }
}

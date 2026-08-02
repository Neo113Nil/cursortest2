package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class bf0 extends n21 {

    /* JADX INFO: renamed from: k */
    public int f847k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ v60 f848l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ AbstractC0526o f849m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf0(AbstractC0526o abstractC0526o, AbstractC0526o abstractC0526o2, v60 v60Var) {
        super(abstractC0526o);
        this.f848l = v60Var;
        this.f849m = abstractC0526o2;
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: m */
    public final Object mo17m(Object obj) {
        int i = this.f847k;
        if (i != 0) {
            if (i != 1) {
                C0270h1.m2191g("This coroutine had already completed");
                return null;
            }
            this.f847k = 2;
            wo1.m5395v(obj);
            return obj;
        }
        this.f847k = 1;
        wo1.m5395v(obj);
        v60 v60Var = this.f848l;
        v60Var.getClass();
        xe1.m5634a(2, v60Var);
        return v60Var.mo1490g(this.f849m, this);
    }
}

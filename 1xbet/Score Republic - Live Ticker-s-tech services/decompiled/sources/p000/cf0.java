package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class cf0 extends AbstractC0882xm {

    /* JADX INFO: renamed from: m */
    public int f1242m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ v60 f1243n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ AbstractC0526o f1244o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf0(AbstractC0526o abstractC0526o, InterfaceC0180en interfaceC0180en, v60 v60Var, AbstractC0526o abstractC0526o2) {
        super(abstractC0526o, interfaceC0180en);
        this.f1243n = v60Var;
        this.f1244o = abstractC0526o2;
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: m */
    public final Object mo17m(Object obj) {
        int i = this.f1242m;
        if (i != 0) {
            if (i != 1) {
                C0270h1.m2191g("This coroutine had already completed");
                return null;
            }
            this.f1242m = 2;
            wo1.m5395v(obj);
            return obj;
        }
        this.f1242m = 1;
        wo1.m5395v(obj);
        v60 v60Var = this.f1243n;
        v60Var.getClass();
        xe1.m5634a(2, v60Var);
        return v60Var.mo1490g(this.f1244o, this);
    }
}

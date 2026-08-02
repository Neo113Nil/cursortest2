package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class fv0 extends AbstractC0618qh {

    /* JADX INFO: renamed from: a */
    public final yu0 f2506a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0618qh f2507b;

    public fv0(yu0 yu0Var, AbstractC0618qh abstractC0618qh) {
        this.f2506a = yu0Var;
        this.f2507b = abstractC0618qh;
    }

    @Override // p000.AbstractC0618qh
    /* JADX INFO: renamed from: a */
    public final o80 mo1894a(C0120d c0120d, np0 np0Var) {
        AbstractC0618qh abstractC0618qh = this.f2507b;
        return abstractC0618qh != null ? new dv0(this, abstractC0618qh.mo1894a(c0120d, np0Var)) : new ev0(this);
    }
}

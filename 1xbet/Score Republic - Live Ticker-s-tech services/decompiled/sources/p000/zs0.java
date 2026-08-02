package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class zs0 extends AbstractC0959zp {

    /* JADX INFO: renamed from: w */
    public final AbstractC0959zp f9939w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f9940x;

    /* JADX INFO: renamed from: y */
    public final Object f9941y;

    public zs0(AbstractC0959zp abstractC0959zp, Object obj, int i) {
        this.f9940x = i;
        this.f9939w = abstractC0959zp;
        this.f9941y = obj;
    }

    @Override // p000.AbstractC0959zp
    /* JADX INFO: renamed from: w */
    public final void mo173w(ft0 ft0Var) {
        int i = this.f9940x;
        AbstractC0959zp abstractC0959zp = this.f9939w;
        Object obj = this.f9941y;
        switch (i) {
            case 0:
                abstractC0959zp.m5993v(new ys0(ft0Var, (vz0) obj, 0));
                break;
            case 1:
                abstractC0959zp.m5993v(new ys0(ft0Var, (r60) obj, 1));
                break;
            default:
                C0809vn c0809vn = new C0809vn(ft0Var, (dt0) obj);
                ft0Var.mo172a((C0264gw) c0809vn.f8226n);
                abstractC0959zp.m5993v(c0809vn);
                break;
        }
    }
}

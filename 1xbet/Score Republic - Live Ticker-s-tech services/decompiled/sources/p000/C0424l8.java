package p000;

/* JADX INFO: renamed from: l8 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0424l8 extends AbstractRunnableC0498n8 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f4708l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C0535o8 f4709m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0424l8(C0535o8 c0535o8, int i) {
        super(0, c0535o8);
        this.f4708l = i;
        switch (i) {
            case 1:
                this.f4709m = c0535o8;
                super(0, c0535o8);
                nv0.m3596b();
                break;
            default:
                this.f4709m = c0535o8;
                nv0.m3596b();
                break;
        }
    }

    @Override // p000.AbstractRunnableC0498n8
    /* JADX INFO: renamed from: a */
    public final void mo3189a() {
        C0535o8 c0535o8;
        int i;
        C0535o8 c0535o9;
        switch (this.f4708l) {
            case 0:
                C0539oc c0539oc = new C0539oc();
                nv0.m3597c();
                try {
                    vc0 vc0Var = nv0.f5555a;
                    vc0Var.getClass();
                    synchronized (this.f4709m.f5649j) {
                        C0539oc c0539oc2 = this.f4709m.f5650k;
                        c0539oc.mo1553f(c0539oc2, c0539oc2.m3668a());
                        c0535o8 = this.f4709m;
                        c0535o8.f5654o = false;
                        i = c0535o8.f5661v;
                        break;
                    }
                    c0535o8.f5657r.mo1553f(c0539oc, c0539oc.f5698k);
                    synchronized (this.f4709m.f5649j) {
                        this.f4709m.f5661v -= i;
                        break;
                    }
                    vc0Var.getClass();
                    return;
                } catch (Throwable th) {
                    try {
                        nv0.f5555a.getClass();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                C0539oc c0539oc3 = new C0539oc();
                nv0.m3597c();
                try {
                    vc0 vc0Var2 = nv0.f5555a;
                    vc0Var2.getClass();
                    synchronized (this.f4709m.f5649j) {
                        C0539oc c0539oc4 = this.f4709m.f5650k;
                        c0539oc3.mo1553f(c0539oc4, c0539oc4.f5698k);
                        c0535o9 = this.f4709m;
                        c0535o9.f5655p = false;
                        break;
                    }
                    c0535o9.f5657r.mo1553f(c0539oc3, c0539oc3.f5698k);
                    this.f4709m.f5657r.flush();
                    vc0Var2.getClass();
                    return;
                } catch (Throwable th3) {
                    try {
                        nv0.f5555a.getClass();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
        }
    }
}

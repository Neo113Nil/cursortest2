package p000;

/* JADX INFO: renamed from: yg */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0913yg extends AbstractRunnableC0498n8 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ ja1 f9299l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ np0 f9300m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ qd0 f9301n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0913yg(qd0 qd0Var, ja1 ja1Var, np0 np0Var) {
        super(1, ((C0062bh) qd0Var.f6473m).f864i);
        this.f9301n = qd0Var;
        this.f9299l = ja1Var;
        this.f9300m = np0Var;
    }

    @Override // p000.AbstractRunnableC0498n8
    /* JADX INFO: renamed from: b */
    public final void mo3491b() {
        nv0.m3597c();
        try {
            nv0.m3595a();
            vc0 vc0Var = nv0.f5555a;
            vc0Var.getClass();
            m5799c();
            vc0Var.getClass();
        } catch (Throwable th) {
            try {
                nv0.f5555a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5799c() {
        ja1 ja1Var = this.f9299l;
        np0 np0Var = this.f9300m;
        ja1 ja1Var2 = (ja1) this.f9301n.f6472l;
        if (ja1Var2 != null) {
            np0Var = new np0();
            ja1Var = ja1Var2;
        }
        ((C0062bh) this.f9301n.f6473m).f869n = true;
        try {
            ((d71) this.f9301n.f6471k).mo1120i(ja1Var, np0Var);
            ((C0062bh) this.f9301n.f6473m).m664s();
            f71 f71Var = ((C0062bh) this.f9301n.f6473m).f863h;
            if (ja1Var.m2838f()) {
                ((jk0) f71Var.f2336m).mo614j();
            } else {
                ((jk0) f71Var.f2337n).mo614j();
            }
        } catch (Throwable th) {
            ((C0062bh) this.f9301n.f6473m).m664s();
            f71 f71Var2 = ((C0062bh) this.f9301n.f6473m).f863h;
            if (ja1Var.m2838f()) {
                ((jk0) f71Var2.f2336m).mo614j();
            } else {
                ((jk0) f71Var2.f2337n).mo614j();
            }
            throw th;
        }
    }
}

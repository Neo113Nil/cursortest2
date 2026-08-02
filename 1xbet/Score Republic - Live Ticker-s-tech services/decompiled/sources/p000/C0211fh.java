package p000;

/* JADX INFO: renamed from: fh */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0211fh extends d71 {

    /* JADX INFO: renamed from: e */
    public final C0098ch f2404e;

    /* JADX INFO: renamed from: f */
    public Object f2405f;

    /* JADX INFO: renamed from: g */
    public boolean f2406g = false;

    public C0211fh(C0098ch c0098ch) {
        this.f2404e = c0098ch;
    }

    @Override // p000.d71
    /* JADX INFO: renamed from: i */
    public final void mo1120i(ja1 ja1Var, np0 np0Var) {
        boolean zM2838f = ja1Var.m2838f();
        C0098ch c0098ch = this.f2404e;
        if (!zM2838f) {
            c0098ch.m2178m(new la1(ja1Var, np0Var));
            return;
        }
        if (!this.f2406g) {
            c0098ch.m2178m(new la1(ja1.f3882l.m2840h("No value received for unary call"), np0Var));
        }
        c0098ch.m2177l(this.f2405f);
    }

    @Override // p000.d71
    /* JADX INFO: renamed from: m */
    public final void mo1124m(Object obj) {
        if (this.f2406g) {
            throw ja1.f3882l.m2840h("More than one value received for unary call").m2836a();
        }
        this.f2405f = obj;
        this.f2406g = true;
    }

    @Override // p000.d71
    /* JADX INFO: renamed from: k */
    public final void mo1122k(np0 np0Var) {
    }
}

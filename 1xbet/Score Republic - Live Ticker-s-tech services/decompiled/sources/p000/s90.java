package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class s90 extends mj0 {

    /* JADX INFO: renamed from: o */
    public static final C0130d9 f7060o = new C0130d9(1);

    /* JADX INFO: renamed from: f */
    public final q90 f7061f;

    /* JADX INFO: renamed from: g */
    public final x40 f7062g;

    /* JADX INFO: renamed from: h */
    public nj0 f7063h;

    /* JADX INFO: renamed from: i */
    public mj0 f7064i;

    /* JADX INFO: renamed from: j */
    public nj0 f7065j;

    /* JADX INFO: renamed from: k */
    public mj0 f7066k;

    /* JADX INFO: renamed from: l */
    public EnumC0474ml f7067l;

    /* JADX INFO: renamed from: m */
    public kj0 f7068m;

    /* JADX INFO: renamed from: n */
    public boolean f7069n;

    public s90(x40 x40Var) {
        q90 q90Var = new q90(this);
        this.f7061f = q90Var;
        this.f7064i = q90Var;
        this.f7066k = q90Var;
        this.f7062g = x40Var;
    }

    @Override // p000.mj0
    /* JADX INFO: renamed from: b */
    public final boolean mo3396b() {
        return m4506g().mo3396b();
    }

    @Override // p000.mj0
    /* JADX INFO: renamed from: c */
    public final void mo1388c(ja1 ja1Var) {
        m4506g().mo1388c(ja1Var);
    }

    @Override // p000.mj0
    /* JADX INFO: renamed from: d */
    public final void mo1389d(jj0 jj0Var) {
        m4506g().mo1389d(jj0Var);
    }

    @Override // p000.mj0
    /* JADX INFO: renamed from: e */
    public final void mo3397e() {
        m4506g().mo3397e();
    }

    @Override // p000.mj0
    /* JADX INFO: renamed from: f */
    public final void mo1390f() {
        this.f7066k.mo1390f();
        this.f7064i.mo1390f();
    }

    /* JADX INFO: renamed from: g */
    public final mj0 m4506g() {
        mj0 mj0Var = this.f7066k;
        return mj0Var == this.f7061f ? this.f7064i : mj0Var;
    }

    /* JADX INFO: renamed from: h */
    public final void m4507h() {
        this.f7062g.mo965o(this.f7067l, this.f7068m);
        this.f7064i.mo1390f();
        this.f7064i = this.f7066k;
        this.f7063h = this.f7065j;
        this.f7066k = this.f7061f;
        this.f7065j = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m4508i(nj0 nj0Var) {
        a90.m127k(nj0Var, "newBalancerFactory");
        if (nj0Var == this.f7065j) {
            return;
        }
        this.f7066k.mo1390f();
        this.f7066k = this.f7061f;
        this.f7065j = null;
        this.f7067l = EnumC0474ml.f5071j;
        this.f7068m = f7060o;
        if (nj0Var == this.f7063h) {
            return;
        }
        r90 r90Var = new r90(this);
        mj0 mj0VarMo1103b = nj0Var.mo1103b(r90Var);
        r90Var.f6752i = mj0VarMo1103b;
        this.f7066k = mj0VarMo1103b;
        this.f7065j = nj0Var;
        if (this.f7069n) {
            return;
        }
        m4507h();
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5172c(m4506g(), "delegate");
        return c0809vnM5362k.toString();
    }
}

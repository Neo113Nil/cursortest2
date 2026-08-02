package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class wd1 extends m80 {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f8519p = 1;

    /* JADX INFO: renamed from: q */
    public boolean f8520q;

    /* JADX INFO: renamed from: r */
    public int f8521r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f8522s;

    public wd1(ki1 ki1Var) {
        super(10);
        this.f8522s = ki1Var;
        this.f8520q = false;
        this.f8521r = 0;
    }

    @Override // p000.li1
    /* JADX INFO: renamed from: a */
    public final void mo1067a() {
        int i = this.f8519p;
        Object obj = this.f8522s;
        switch (i) {
            case 0:
                if (!this.f8520q) {
                    ((xd1) obj).f8896a.setVisibility(this.f8521r);
                }
                break;
            default:
                int i2 = this.f8521r + 1;
                this.f8521r = i2;
                ki1 ki1Var = (ki1) obj;
                if (i2 == ki1Var.f4390a.size()) {
                    li1 li1Var = ki1Var.f4393d;
                    if (li1Var != null) {
                        li1Var.mo1067a();
                    }
                    this.f8521r = 0;
                    this.f8520q = false;
                    ki1Var.f4394e = false;
                }
                break;
        }
    }

    @Override // p000.m80, p000.li1
    /* JADX INFO: renamed from: b */
    public void mo1068b() {
        switch (this.f8519p) {
            case 0:
                this.f8520q = true;
                break;
        }
    }

    @Override // p000.m80, p000.li1
    /* JADX INFO: renamed from: d */
    public final void mo1069d() {
        int i = this.f8519p;
        Object obj = this.f8522s;
        switch (i) {
            case 0:
                ((xd1) obj).f8896a.setVisibility(0);
                break;
            default:
                if (!this.f8520q) {
                    this.f8520q = true;
                    li1 li1Var = ((ki1) obj).f4393d;
                    if (li1Var != null) {
                        li1Var.mo1069d();
                    }
                    break;
                }
                break;
        }
    }

    public wd1(xd1 xd1Var, int i) {
        super(10);
        this.f8522s = xd1Var;
        this.f8521r = i;
        this.f8520q = false;
    }
}

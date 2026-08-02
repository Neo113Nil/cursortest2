package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ak0 implements v11, InterfaceC0079bz {

    /* JADX INFO: renamed from: n */
    public static final qd0 f223n = wo1.m5393t(20, new aa0(5));

    /* JADX INFO: renamed from: j */
    public final ga1 f224j = new ga1();

    /* JADX INFO: renamed from: k */
    public v11 f225k;

    /* JADX INFO: renamed from: l */
    public boolean f226l;

    /* JADX INFO: renamed from: m */
    public boolean f227m;

    /* JADX INFO: renamed from: a */
    public final synchronized void m265a() {
        this.f224j.m2011a();
        if (!this.f226l) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f226l = false;
        if (this.f227m) {
            mo269e();
        }
    }

    @Override // p000.InterfaceC0079bz
    /* JADX INFO: renamed from: b */
    public final ga1 mo266b() {
        return this.f224j;
    }

    @Override // p000.v11
    /* JADX INFO: renamed from: c */
    public final int mo267c() {
        return this.f225k.mo267c();
    }

    @Override // p000.v11
    /* JADX INFO: renamed from: d */
    public final Class mo268d() {
        return this.f225k.mo268d();
    }

    @Override // p000.v11
    /* JADX INFO: renamed from: e */
    public final synchronized void mo269e() {
        this.f224j.m2011a();
        this.f227m = true;
        if (!this.f226l) {
            this.f225k.mo269e();
            this.f225k = null;
            f223n.mo1366a(this);
        }
    }

    @Override // p000.v11
    public final Object get() {
        return this.f225k.get();
    }
}

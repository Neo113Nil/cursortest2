package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: wk */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0843wk extends f51 {

    /* JADX INFO: renamed from: j */
    public final C0584pk f8563j;

    /* JADX INFO: renamed from: k */
    public final C0584pk f8564k;

    /* JADX INFO: renamed from: l */
    public final C0584pk f8565l;

    /* JADX INFO: renamed from: m */
    public final C0917yk f8566m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f8567n;

    public C0843wk(C0917yk c0917yk) {
        this.f8566m = c0917yk;
        C0584pk c0584pk = new C0584pk(1);
        this.f8563j = c0584pk;
        C0584pk c0584pk2 = new C0584pk(0);
        this.f8564k = c0584pk2;
        C0584pk c0584pk3 = new C0584pk(1);
        this.f8565l = c0584pk3;
        c0584pk3.m3948a(c0584pk);
        c0584pk3.m3948a(c0584pk2);
    }

    @Override // p000.f51
    /* JADX INFO: renamed from: a */
    public final InterfaceC0187eu mo1498a(Runnable runnable, TimeUnit timeUnit) {
        if (this.f8567n) {
            return EnumC0336iw.f3682j;
        }
        return this.f8566m.m1500d(runnable, TimeUnit.NANOSECONDS, this.f8564k);
    }

    @Override // p000.f51
    /* JADX INFO: renamed from: b */
    public final void mo1499b(n30 n30Var) {
        if (this.f8567n) {
            return;
        }
        this.f8566m.m1500d(n30Var, TimeUnit.MILLISECONDS, this.f8563j);
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        if (this.f8567n) {
            return;
        }
        this.f8567n = true;
        this.f8565l.mo480c();
    }
}

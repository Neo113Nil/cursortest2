package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: zd */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0947zd extends t40 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0215fl f9741a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f9742b = new AtomicInteger(-2147483647);

    /* JADX INFO: renamed from: c */
    public volatile ja1 f9743c;

    public C0947zd(C0015ae c0015ae, InterfaceC0215fl interfaceC0215fl, String str) {
        new wa0(16, this);
        a90.m127k(interfaceC0215fl, "delegate");
        this.f9741a = interfaceC0215fl;
    }

    @Override // p000.t40, p000.ul0
    /* JADX INFO: renamed from: a */
    public final void mo3771a(ja1 ja1Var) {
        a90.m127k(ja1Var, "status");
        synchronized (this) {
            try {
                if (this.f9742b.get() < 0) {
                    this.f9743c = ja1Var;
                    this.f9742b.addAndGet(Integer.MAX_VALUE);
                    if (this.f9742b.get() != 0) {
                        return;
                    }
                    super.mo3771a(ja1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC0655rh
    /* JADX INFO: renamed from: d */
    public final InterfaceC0507nh mo1527d(wp0 wp0Var, np0 np0Var, C0095ce c0095ce, o80[] o80VarArr) {
        c0095ce.getClass();
        return this.f9742b.get() >= 0 ? new C0155dz(this.f9743c, EnumC0544oh.f5731j, o80VarArr) : this.f9741a.mo1527d(wp0Var, np0Var, c0095ce, o80VarArr);
    }

    @Override // p000.t40
    /* JADX INFO: renamed from: e */
    public final InterfaceC0215fl mo4670e() {
        return this.f9741a;
    }
}

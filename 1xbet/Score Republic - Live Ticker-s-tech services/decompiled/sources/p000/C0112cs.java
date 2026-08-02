package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: cs */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0112cs implements InterfaceC0581ph {

    /* JADX INFO: renamed from: j */
    public final InterfaceC0581ph f1443j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f1444k;

    /* JADX INFO: renamed from: l */
    public List f1445l = new ArrayList();

    public C0112cs(InterfaceC0581ph interfaceC0581ph) {
        this.f1443j = interfaceC0581ph;
    }

    /* JADX INFO: renamed from: a */
    public final void m1032a(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f1444k) {
                    runnable.run();
                } else {
                    this.f1445l.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC0581ph
    /* JADX INFO: renamed from: d */
    public final void mo1033d() {
        if (this.f1444k) {
            this.f1443j.mo1033d();
        } else {
            m1032a(new RunnableC0897y0(5, this));
        }
    }

    @Override // p000.InterfaceC0581ph
    /* JADX INFO: renamed from: f */
    public final void mo1034f(np0 np0Var) {
        m1032a(new RunnableC0529o2(14, this, np0Var));
    }

    @Override // p000.InterfaceC0581ph
    /* JADX INFO: renamed from: g */
    public final void mo1035g(ja1 ja1Var, EnumC0544oh enumC0544oh, np0 np0Var) {
        m1032a(new RunnableC0452m(this, ja1Var, enumC0544oh, np0Var, 2));
    }

    @Override // p000.InterfaceC0581ph
    /* JADX INFO: renamed from: i */
    public final void mo1036i(an0 an0Var) {
        if (this.f1444k) {
            this.f1443j.mo1036i(an0Var);
        } else {
            m1032a(new RunnableC0529o2(13, this, an0Var));
        }
    }
}

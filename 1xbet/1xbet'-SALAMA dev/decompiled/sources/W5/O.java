package W5;

import C0.RunnableC0085d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class O implements InterfaceC0546v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0546v f6891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f6892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f6893c = new ArrayList();

    public O(InterfaceC0546v interfaceC0546v) {
        this.f6891a = interfaceC0546v;
    }

    @Override // W5.InterfaceC0546v
    public final void F(U5.l0 l0Var, EnumC0543u enumC0543u, U5.b0 b0Var) {
        a(new A2.c(this, l0Var, enumC0543u, b0Var, 9, false));
    }

    @Override // W5.InterfaceC0546v
    public final void J(p096n1.e eVar) {
        if (this.f6892b) {
            this.f6891a.J(eVar);
        } else {
            a(new E(11, this, eVar));
        }
    }

    public final void a(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f6892b) {
                    runnable.run();
                } else {
                    this.f6893c.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W5.InterfaceC0546v
    public final void d(U5.b0 b0Var) {
        a(new E(12, this, b0Var));
    }

    @Override // W5.InterfaceC0546v
    public final void u() {
        if (this.f6892b) {
            this.f6891a.u();
        } else {
            a(new RunnableC0085d(this, 15));
        }
    }
}

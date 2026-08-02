package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class nf0 extends f51 implements Runnable {

    /* JADX INFO: renamed from: k */
    public final mf0 f5395k;

    /* JADX INFO: renamed from: l */
    public final of0 f5396l;

    /* JADX INFO: renamed from: m */
    public final AtomicBoolean f5397m = new AtomicBoolean();

    /* JADX INFO: renamed from: j */
    public final C0584pk f5394j = new C0584pk(0);

    public nf0(mf0 mf0Var) {
        of0 of0Var;
        of0 of0Var2;
        this.f5395k = mf0Var;
        if (mf0Var.f5036l.f6182k) {
            of0Var2 = pf0.f6129e;
        } else {
            do {
                if (mf0Var.f5035k.isEmpty()) {
                    of0Var = new of0(mf0Var.f5039o);
                    mf0Var.f5036l.m3948a(of0Var);
                    break;
                }
                of0Var = (of0) mf0Var.f5035k.poll();
            } while (of0Var == null);
            of0Var2 = of0Var;
        }
        this.f5396l = of0Var2;
    }

    @Override // p000.f51
    /* JADX INFO: renamed from: a */
    public final InterfaceC0187eu mo1498a(Runnable runnable, TimeUnit timeUnit) {
        if (this.f5394j.f6182k) {
            return EnumC0336iw.f3682j;
        }
        return this.f5396l.m1500d(runnable, TimeUnit.NANOSECONDS, this.f5394j);
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        if (this.f5397m.compareAndSet(false, true)) {
            this.f5394j.mo480c();
            boolean z = pf0.f6130f;
            of0 of0Var = this.f5396l;
            if (z) {
                of0Var.m1500d(this, TimeUnit.NANOSECONDS, null);
                return;
            }
            mf0 mf0Var = this.f5395k;
            mf0Var.getClass();
            of0Var.f5716l = System.nanoTime() + mf0Var.f5034j;
            mf0Var.f5035k.offer(of0Var);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        mf0 mf0Var = this.f5395k;
        mf0Var.getClass();
        long jNanoTime = System.nanoTime() + mf0Var.f5034j;
        of0 of0Var = this.f5396l;
        of0Var.f5716l = jNanoTime;
        mf0Var.f5035k.offer(of0Var);
    }
}

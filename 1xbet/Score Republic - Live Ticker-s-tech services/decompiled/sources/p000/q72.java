package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class q72 implements s72 {

    /* JADX INFO: renamed from: d */
    public static boolean f6397d;

    /* JADX INFO: renamed from: a */
    public final nb1 f6398a;

    /* JADX INFO: renamed from: b */
    public final int f6399b;

    /* JADX INFO: renamed from: c */
    public final dx1 f6400c;

    public q72(nb1 nb1Var) {
        dx1 dx1Var = dx1.f1876o;
        this.f6398a = nb1Var;
        this.f6399b = Math.max(5, 10);
        this.f6400c = dx1Var;
    }

    @Override // p000.s72
    /* JADX INFO: renamed from: a */
    public final void mo3638a() {
        synchronized (q72.class) {
            try {
                if (!f6397d) {
                    cm1 cm1Var = new cm1(13, this);
                    long j = this.f6399b;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    mq0 mq0Var = (mq0) this.f6398a.get();
                    dc1 dc1Var = new dc1(this, cm1Var, mq0Var, j);
                    mq0Var.getClass();
                    ve1 ve1Var = new ve1(Executors.callable(dc1Var, null));
                    kq0 kq0Var = new kq0(ve1Var, mq0Var.f5130k.schedule(ve1Var, j, timeUnit));
                    kq0Var.mo995c(new cm1(11, kq0Var), EnumC0113ct.f1449j);
                    f6397d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

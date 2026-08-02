package p000;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: zk */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0954zk extends g51 {

    /* JADX INFO: renamed from: b */
    public static final C0880xk f9810b;

    /* JADX INFO: renamed from: c */
    public static final b41 f9811c;

    /* JADX INFO: renamed from: d */
    public static final int f9812d;

    /* JADX INFO: renamed from: e */
    public static final C0917yk f9813e;

    /* JADX INFO: renamed from: a */
    public final AtomicReference f9814a;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f9812d = iAvailableProcessors;
        C0917yk c0917yk = new C0917yk(new b41("RxComputationShutdown"));
        f9813e = c0917yk;
        c0917yk.mo480c();
        b41 b41Var = new b41(Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), "RxComputationThreadPool", true);
        f9811c = b41Var;
        C0880xk c0880xk = new C0880xk(0, b41Var);
        f9810b = c0880xk;
        for (C0917yk c0917yk2 : c0880xk.f8977b) {
            c0917yk2.mo480c();
        }
    }

    public C0954zk() {
        C0880xk c0880xk = f9810b;
        AtomicReference atomicReference = new AtomicReference(c0880xk);
        this.f9814a = atomicReference;
        C0880xk c0880xk2 = new C0880xk(f9812d, f9811c);
        while (!atomicReference.compareAndSet(c0880xk, c0880xk2)) {
            if (atomicReference.get() != c0880xk) {
                for (C0917yk c0917yk : c0880xk2.f8977b) {
                    c0917yk.mo480c();
                }
                return;
            }
        }
    }

    @Override // p000.g51
    /* JADX INFO: renamed from: a */
    public final f51 mo1301a() {
        C0917yk c0917yk;
        C0880xk c0880xk = (C0880xk) this.f9814a.get();
        int i = c0880xk.f8976a;
        if (i == 0) {
            c0917yk = f9813e;
        } else {
            C0917yk[] c0917ykArr = c0880xk.f8977b;
            long j = c0880xk.f8978c;
            c0880xk.f8978c = 1 + j;
            c0917yk = c0917ykArr[(int) (j % ((long) i))];
        }
        return new C0843wk(c0917yk);
    }

    @Override // p000.g51
    /* JADX INFO: renamed from: c */
    public final InterfaceC0187eu mo1988c(Runnable runnable) {
        C0917yk c0917yk;
        C0880xk c0880xk = (C0880xk) this.f9814a.get();
        int i = c0880xk.f8976a;
        if (i == 0) {
            c0917yk = f9813e;
        } else {
            C0917yk[] c0917ykArr = c0880xk.f8977b;
            long j = c0880xk.f8978c;
            c0880xk.f8978c = 1 + j;
            c0917yk = c0917ykArr[(int) (j % ((long) i))];
        }
        c0917yk.getClass();
        c51 c51Var = new c51(runnable);
        try {
            c51Var.m885a(c0917yk.f2177j.submit(c51Var));
            return c51Var;
        } catch (RejectedExecutionException e) {
            vt1.m5196h(e);
            return EnumC0336iw.f3682j;
        }
    }
}

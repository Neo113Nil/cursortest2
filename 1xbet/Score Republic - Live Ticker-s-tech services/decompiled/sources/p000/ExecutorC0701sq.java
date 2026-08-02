package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: sq */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0701sq extends AbstractC0893xx implements Executor {

    /* JADX INFO: renamed from: l */
    public static final ExecutorC0701sq f7187l = new ExecutorC0701sq();

    /* JADX INFO: renamed from: m */
    public static final AbstractC0292hn f7188m;

    static {
        rf1 rf1Var = rf1.f6836l;
        int i = lc1.f4761a;
        if (64 >= i) {
            i = 64;
        }
        f7188m = rf1Var.mo2309q(kd0.m3016p(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo1225o(C0301hw.f3348j, runnable);
    }

    @Override // p000.AbstractC0292hn
    /* JADX INFO: renamed from: o */
    public final void mo1225o(InterfaceC0180en interfaceC0180en, Runnable runnable) {
        f7188m.mo1225o(interfaceC0180en, runnable);
    }

    @Override // p000.AbstractC0292hn
    public final String toString() {
        return "Dispatchers.IO";
    }
}

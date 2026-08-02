package p000;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ye0 extends AbstractOwnableSynchronizer implements Runnable {

    /* JADX INFO: renamed from: j */
    public final ze0 f9282j;

    public ye0(ze0 ze0Var) {
        this.f9282j = ze0Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m5789a(ye0 ye0Var, Thread thread) {
        ye0Var.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f9282j.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}

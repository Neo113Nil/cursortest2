package p000;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class yz1 extends Thread {

    /* JADX INFO: renamed from: j */
    public final Object f9554j;

    /* JADX INFO: renamed from: k */
    public final BlockingQueue f9555k;

    /* JADX INFO: renamed from: l */
    public boolean f9556l = false;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ a02 f9557m;

    public yz1(a02 a02Var, String str, BlockingQueue blockingQueue) {
        this.f9557m = a02Var;
        p80.m3863h(blockingQueue);
        this.f9554j = new Object();
        this.f9555k = blockingQueue;
        setName(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m5857a() {
        a02 a02Var = this.f9557m;
        synchronized (a02Var.f14r) {
            try {
                if (!this.f9556l) {
                    a02Var.f15s.release();
                    a02Var.f14r.notifyAll();
                    if (this == a02Var.f8l) {
                        a02Var.f8l = null;
                    } else if (this == a02Var.f9m) {
                        a02Var.f9m = null;
                    } else {
                        ky1 ky1Var = ((f02) a02Var.f7192j).f2247o;
                        f02.m1560m(ky1Var);
                        ky1Var.f4600o.m5312a("Current scheduler thread is neither worker nor network");
                    }
                    this.f9556l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.f9557m.f15s.acquire();
                z = true;
            } catch (InterruptedException e) {
                ky1 ky1Var = ((f02) this.f9557m.f7192j).f2247o;
                f02.m1560m(ky1Var);
                ky1Var.f4603r.m5313b(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f9555k;
                xz1 xz1Var = (xz1) blockingQueue.poll();
                if (xz1Var != null) {
                    Process.setThreadPriority(true != xz1Var.f9116k ? 10 : threadPriority);
                    xz1Var.run();
                } else {
                    Object obj = this.f9554j;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f9557m.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e2) {
                                ky1 ky1Var2 = ((f02) this.f9557m.f7192j).f2247o;
                                f02.m1560m(ky1Var2);
                                ky1Var2.f4603r.m5313b(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f9557m.f14r) {
                        if (this.f9555k.peek() == null) {
                            m5857a();
                            m5857a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            m5857a();
            throw th;
        }
    }
}

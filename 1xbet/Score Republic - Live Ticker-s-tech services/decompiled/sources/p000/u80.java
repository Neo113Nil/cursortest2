package p000;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class u80 extends Thread {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f7705j = 0;

    public /* synthetic */ u80(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        switch (this.f7705j) {
            case 0:
                Process.setThreadPriority(9);
                super.run();
                return;
            case 1:
            default:
                super.run();
                return;
            case 2:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ u80(Runnable runnable, String str) {
        super(runnable, str);
    }

    public /* synthetic */ u80(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}

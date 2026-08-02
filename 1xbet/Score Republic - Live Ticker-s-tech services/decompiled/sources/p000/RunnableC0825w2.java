package p000;

import android.os.Process;

/* JADX INFO: renamed from: w2 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0825w2 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f8349j;

    /* JADX INFO: renamed from: k */
    public final Runnable f8350k;

    public /* synthetic */ RunnableC0825w2(Runnable runnable, int i) {
        this.f8349j = i;
        this.f8350k = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f8349j;
        Runnable runnable = this.f8350k;
        switch (i) {
            case 0:
                Process.setThreadPriority(10);
                runnable.run();
                break;
            case 1:
                try {
                    runnable.run();
                } catch (Exception e) {
                    o80.m3649k("Executor", "Background execution failure.", e);
                    return;
                }
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                runnable.run();
                break;
            default:
                Process.setThreadPriority(0);
                runnable.run();
                break;
        }
    }

    public String toString() {
        int i = this.f8349j;
        Runnable runnable = this.f8350k;
        switch (i) {
            case 2:
                return runnable.toString();
            case 3:
                return runnable.toString();
            default:
                return super.toString();
        }
    }
}

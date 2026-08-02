package p000;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class l11 extends Thread {

    /* JADX INFO: renamed from: j */
    public final int f4642j;

    public l11(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f4642j = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f4642j);
        super.run();
    }
}

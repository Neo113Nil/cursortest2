package M;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4537a;

    public g(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f4537a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f4537a);
        super.run();
    }
}

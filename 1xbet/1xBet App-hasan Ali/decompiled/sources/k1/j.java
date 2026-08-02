package k1;

import android.os.Process;

/* loaded from: classes.dex */
public final class j extends Thread {

    /* renamed from: k, reason: collision with root package name */
    public final int f17577k;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f17577k = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f17577k);
        super.run();
    }
}

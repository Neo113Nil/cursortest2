package A;

import android.os.Process;

/* loaded from: classes.dex */
public final class k extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final int f29a;

    public k(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f29a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f29a);
        super.run();
    }
}

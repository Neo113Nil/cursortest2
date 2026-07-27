package B;

import android.os.Process;

/* loaded from: classes.dex */
public final class j extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final int f129a;

    public j(Runnable runnable, String str, int i2) {
        super(runnable, str);
        this.f129a = i2;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f129a);
        super.run();
    }
}

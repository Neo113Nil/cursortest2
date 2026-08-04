package p155w1;

import android.util.Log;

/* JADX INFO: renamed from: w1.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0978d1 implements Runnable {
    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th) {
            AbstractC0997i0.p(5, "Internal exception caught and handled by SafeRunnable.", th);
            Log.getStackTraceString(th);
            AbstractC0997i0.j("SafeRunnableException", "Internal exception caught and handled by SafeRunnable.", th);
        }
    }
}

package w1;

import android.util.Log;

/* renamed from: w1.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC1687d1 implements Runnable {
    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th) {
            AbstractC1706i0.p(5, "Internal exception caught and handled by SafeRunnable.", th);
            Log.getStackTraceString(th);
            AbstractC1706i0.j("SafeRunnableException", "Internal exception caught and handled by SafeRunnable.", th);
        }
    }
}

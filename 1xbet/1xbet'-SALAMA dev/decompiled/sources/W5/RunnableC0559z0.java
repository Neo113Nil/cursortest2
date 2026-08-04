package W5;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: W5.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0559z0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f7418b = Logger.getLogger(RunnableC0559z0.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f7419a;

    public RunnableC0559z0(Runnable runnable) {
        this.f7419a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f7419a;
        try {
            runnable.run();
        } catch (Throwable th) {
            f7418b.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            Object obj = D3.r.f1740a;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new AssertionError(th);
            }
            throw ((Error) th);
        }
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.f7419a + ")";
    }
}

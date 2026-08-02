package p000;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ek0 implements Runnable {

    /* JADX INFO: renamed from: k */
    public static final Logger f2105k = Logger.getLogger(ek0.class.getName());

    /* JADX INFO: renamed from: j */
    public final Runnable f2106j;

    public ek0(Runnable runnable) {
        this.f2106j = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f2106j;
        try {
            runnable.run();
        } catch (Throwable th) {
            f2105k.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            Object obj = fd1.f2380a;
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
        return "LogExceptionRunnable(" + this.f2106j + ")";
    }
}

package W5;

/* JADX INFO: renamed from: W5.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0560z1 implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        throw new U5.n0(U5.l0.d(th).g("Uncaught exception in the SynchronizationContext. Re-thrown."));
    }
}

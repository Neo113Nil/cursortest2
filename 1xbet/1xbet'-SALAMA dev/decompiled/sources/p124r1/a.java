package p124r1;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        System.exit(0);
    }
}

package Ej;

import java.lang.Thread;

/* loaded from: classes6.dex */
public final /* synthetic */ class m implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        p.c("Uncaught exception on thread \"" + thread.getName() + "\"", th2);
    }
}

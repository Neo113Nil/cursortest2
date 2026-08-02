package Ej;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes6.dex */
public final /* synthetic */ class j implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "logDbAccessThread");
        thread.setUncaughtExceptionHandler(new m());
        return thread;
    }
}

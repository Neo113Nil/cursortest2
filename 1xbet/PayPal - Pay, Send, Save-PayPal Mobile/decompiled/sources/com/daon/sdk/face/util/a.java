package com.daon.sdk.face.util;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected static final java.util.concurrent.ExecutorService f2845a = java.util.concurrent.Executors.newCachedThreadPool(new java.util.concurrent.ThreadFactory() { // from class: com.daon.sdk.face.util.a$$ExternalSyntheticLambda0
        @Override // java.util.concurrent.ThreadFactory
        public final java.lang.Thread newThread(java.lang.Runnable runnable) {
            return com.daon.sdk.face.util.a.$r8$lambda$gMbTGzuOBaZpG5tnK9acbZcB7a8(runnable);
        }
    });

    public static java.lang.Object b(java.util.concurrent.Callable callable) {
        return f2845a.submit(callable).get();
    }

    public static java.util.concurrent.Future a(java.util.concurrent.Callable callable) {
        return f2845a.submit(callable);
    }

    public static java.util.concurrent.Future b(java.lang.Runnable runnable) {
        return f2845a.submit(runnable);
    }

    public static /* synthetic */ java.lang.Thread $r8$lambda$gMbTGzuOBaZpG5tnK9acbZcB7a8(java.lang.Runnable runnable) {
        java.lang.Thread newThread = java.util.concurrent.Executors.defaultThreadFactory().newThread(runnable);
        newThread.setDaemon(true);
        return newThread;
    }
}

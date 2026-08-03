package com.digitalturbine.ignite.authenticator.utils.concurency;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ThreadPoolExecutor f3513a;
    public static final android.os.Handler b = new android.os.Handler(android.os.Looper.getMainLooper());

    static {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(1, 2, 30L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(5), new com.digitalturbine.ignite.authenticator.utils.concurency.a(), new com.digitalturbine.ignite.authenticator.utils.concurency.b());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f3513a = threadPoolExecutor;
    }
}

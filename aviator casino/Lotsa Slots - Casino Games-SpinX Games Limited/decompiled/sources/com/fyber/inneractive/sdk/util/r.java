package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ThreadPoolExecutor f4308a;
    public static final android.os.Handler b = new android.os.Handler(android.os.Looper.getMainLooper());

    static {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(2, 4, 30L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(32), new com.fyber.inneractive.sdk.util.p(), new com.fyber.inneractive.sdk.util.q());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f4308a = threadPoolExecutor;
    }
}

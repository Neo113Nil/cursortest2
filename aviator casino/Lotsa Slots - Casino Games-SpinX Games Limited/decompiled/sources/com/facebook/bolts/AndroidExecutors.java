package com.facebook.bolts;

/* compiled from: AndroidExecutors.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/facebook/bolts/AndroidExecutors;", "", "()V", "uiThread", "Ljava/util/concurrent/Executor;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "UIThreadExecutor", "facebook-bolts_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AndroidExecutors {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.bolts.AndroidExecutors.Companion INSTANCE = new com.facebook.bolts.AndroidExecutors.Companion(null);
    private static final com.facebook.bolts.AndroidExecutors INSTANCE = new com.facebook.bolts.AndroidExecutors();
    private static final long KEEP_ALIVE_TIME = 1;
    private static final int MAX_POOL_SIZE;
    private final java.util.concurrent.Executor uiThread = new com.facebook.bolts.AndroidExecutors.UIThreadExecutor();

    @kotlin.jvm.JvmStatic
    public static final java.util.concurrent.ExecutorService newCachedThreadPool() {
        return INSTANCE.newCachedThreadPool();
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.concurrent.Executor uiThread() {
        return INSTANCE.uiThread();
    }

    private AndroidExecutors() {
    }

    /* compiled from: AndroidExecutors.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/facebook/bolts/AndroidExecutors$UIThreadExecutor;", "Ljava/util/concurrent/Executor;", "()V", "execute", "", com.ironsource.sdk.controller.f.b.g, "Ljava/lang/Runnable;", "facebook-bolts_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class UIThreadExecutor implements java.util.concurrent.Executor {
        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable command) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "command");
            new android.os.Handler(android.os.Looper.getMainLooper()).post(command);
        }
    }

    /* compiled from: AndroidExecutors.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/bolts/AndroidExecutors$Companion;", "", "()V", "CORE_POOL_SIZE", "", "CPU_COUNT", "INSTANCE", "Lcom/facebook/bolts/AndroidExecutors;", "KEEP_ALIVE_TIME", "", "MAX_POOL_SIZE", "newCachedThreadPool", "Ljava/util/concurrent/ExecutorService;", "uiThread", "Ljava/util/concurrent/Executor;", "facebook-bolts_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final java.util.concurrent.ExecutorService newCachedThreadPool() {
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(com.facebook.bolts.AndroidExecutors.CORE_POOL_SIZE, com.facebook.bolts.AndroidExecutors.MAX_POOL_SIZE, 1L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return threadPoolExecutor;
        }

        @kotlin.jvm.JvmStatic
        public final java.util.concurrent.Executor uiThread() {
            return com.facebook.bolts.AndroidExecutors.INSTANCE.uiThread;
        }
    }

    static {
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        CORE_POOL_SIZE = availableProcessors + 1;
        MAX_POOL_SIZE = (availableProcessors * 2) + 1;
    }
}

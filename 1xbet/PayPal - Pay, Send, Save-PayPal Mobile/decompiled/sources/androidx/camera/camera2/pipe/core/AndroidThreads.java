package androidx.camera.camera2.pipe.core;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u0011*\u00020\u00042\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\u000e*\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/camera/camera2/pipe/core/AndroidThreads;", "", "<init>", "()V", "Ljava/util/concurrent/ThreadFactory;", "", "androidPriority", "withAndroidPriority", "(Ljava/util/concurrent/ThreadFactory;I)Ljava/util/concurrent/ThreadFactory;", "", "namePrefix", "withPrefix", "(Ljava/util/concurrent/ThreadFactory;Ljava/lang/String;)Ljava/util/concurrent/ThreadFactory;", "threads", "Ljava/util/concurrent/ExecutorService;", "asFixedSizeThreadPool", "(Ljava/util/concurrent/ThreadFactory;I)Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "asScheduledThreadPool", "(Ljava/util/concurrent/ThreadFactory;I)Ljava/util/concurrent/ScheduledExecutorService;", "asCachedThreadPool", "(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;", "", "Camera2StreamConfigurationMap", "[I", "getHighSpeedVideoFpsRangesFor", "factory", "Ljava/util/concurrent/ThreadFactory;", "getFactory", "()Ljava/util/concurrent/ThreadFactory;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidThreads {
    private static final java.util.concurrent.ThreadFactory factory;
    public static final androidx.camera.camera2.pipe.core.AndroidThreads INSTANCE = new androidx.camera.camera2.pipe.core.AndroidThreads();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final int[] getHighSpeedVideoFpsRangesFor = {19, 16, 13, 10, 0, -2, -4, -5, -6, -8};

    private AndroidThreads() {
    }

    static {
        java.util.concurrent.ThreadFactory defaultThreadFactory = java.util.concurrent.Executors.defaultThreadFactory();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultThreadFactory, "");
        factory = defaultThreadFactory;
    }

    public final java.util.concurrent.ThreadFactory getFactory() {
        return factory;
    }

    public final java.util.concurrent.ThreadFactory withAndroidPriority(final java.util.concurrent.ThreadFactory threadFactory, final int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threadFactory, "");
        return new java.util.concurrent.ThreadFactory() { // from class: androidx.camera.camera2.pipe.core.AndroidThreads$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return androidx.camera.camera2.pipe.core.AndroidThreads.m868$r8$lambda$jRA0i05wL10EV15Dmt8_svRyC4(i, threadFactory, runnable);
            }
        };
    }

    public final java.util.concurrent.ThreadFactory withPrefix(final java.util.concurrent.ThreadFactory threadFactory, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threadFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        final kotlinx.atomicfu.AtomicInt atomic = kotlinx.atomicfu.AtomicFU.atomic(0);
        return new java.util.concurrent.ThreadFactory() { // from class: androidx.camera.camera2.pipe.core.AndroidThreads$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return androidx.camera.camera2.pipe.core.AndroidThreads.$r8$lambda$faLdKNGt__5T6WxQVV9GLghIoxw(threadFactory, str, atomic, runnable);
            }
        };
    }

    public final java.util.concurrent.ExecutorService asFixedSizeThreadPool(java.util.concurrent.ThreadFactory threadFactory, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threadFactory, "");
        if (i <= 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Threads (");
            sb.append(i);
            sb.append(") must be > 0");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        java.util.concurrent.ExecutorService newFixedThreadPool = java.util.concurrent.Executors.newFixedThreadPool(i, threadFactory);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newFixedThreadPool, "");
        return newFixedThreadPool;
    }

    public final java.util.concurrent.ScheduledExecutorService asScheduledThreadPool(java.util.concurrent.ThreadFactory threadFactory, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threadFactory, "");
        if (i <= 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Threads (");
            sb.append(i);
            sb.append(") must be > 0");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        java.util.concurrent.ScheduledExecutorService newScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(i, threadFactory);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newScheduledThreadPool, "");
        return newScheduledThreadPool;
    }

    public final java.util.concurrent.ExecutorService asCachedThreadPool(java.util.concurrent.ThreadFactory threadFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threadFactory, "");
        java.util.concurrent.ExecutorService newCachedThreadPool = java.util.concurrent.Executors.newCachedThreadPool(threadFactory);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newCachedThreadPool, "");
        return newCachedThreadPool;
    }

    /* renamed from: $r8$lambda$-5dskTImH9PRNFfZUGKLfp0vmrk, reason: not valid java name */
    public static /* synthetic */ void m867$r8$lambda$5dskTImH9PRNFfZUGKLfp0vmrk(int i, java.lang.Runnable runnable) {
        android.os.Process.setThreadPriority(i);
        runnable.run();
    }

    public static /* synthetic */ java.lang.Thread $r8$lambda$faLdKNGt__5T6WxQVV9GLghIoxw(java.util.concurrent.ThreadFactory threadFactory, java.lang.String str, kotlinx.atomicfu.AtomicInt atomicInt, java.lang.Runnable runnable) {
        java.lang.Thread newThread = threadFactory.newThread(runnable);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newThread, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(kotlin.text.StringsKt.padStart(java.lang.String.valueOf(atomicInt.incrementAndGet()), 2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
        newThread.setName(sb.toString());
        return newThread;
    }

    /* renamed from: $r8$lambda$jRA0i05wL10-EV15Dmt8_svRyC4, reason: not valid java name */
    public static /* synthetic */ java.lang.Thread m868$r8$lambda$jRA0i05wL10EV15Dmt8_svRyC4(final int i, java.util.concurrent.ThreadFactory threadFactory, final java.lang.Runnable runnable) {
        int length = getHighSpeedVideoFpsRangesFor.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = 10;
                break;
            }
            int i3 = getHighSpeedVideoFpsRangesFor[i2];
            i2++;
            if (i >= i3) {
                break;
            }
        }
        java.lang.Thread newThread = threadFactory.newThread(new java.lang.Runnable() { // from class: androidx.camera.camera2.pipe.core.AndroidThreads$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.pipe.core.AndroidThreads.m867$r8$lambda$5dskTImH9PRNFfZUGKLfp0vmrk(i, runnable);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newThread, "");
        newThread.setPriority(i2);
        return newThread;
    }
}

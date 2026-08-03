package com.ironsource.environment.thread;

/* loaded from: classes5.dex */
public final class IronSourceThreadManager {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f6224a;
    public static final com.ironsource.environment.thread.IronSourceThreadManager INSTANCE = new com.ironsource.environment.thread.IronSourceThreadManager();
    private static final kotlin.Lazy b = kotlin.LazyKt.lazy(com.ironsource.environment.thread.IronSourceThreadManager.g.f6231a);
    private static final kotlin.Lazy c = kotlin.LazyKt.lazy(com.ironsource.environment.thread.IronSourceThreadManager.c.f6227a);
    private static final kotlin.Lazy d = kotlin.LazyKt.lazy(com.ironsource.environment.thread.IronSourceThreadManager.f.f6230a);
    private static final kotlin.Lazy e = kotlin.LazyKt.lazy(com.ironsource.environment.thread.IronSourceThreadManager.d.f6228a);
    private static final kotlin.Lazy f = kotlin.LazyKt.lazy(com.ironsource.environment.thread.IronSourceThreadManager.a.f6225a);
    private static final kotlin.Lazy g = kotlin.LazyKt.lazy(com.ironsource.environment.thread.IronSourceThreadManager.e.f6229a);
    private static final kotlin.Lazy h = kotlin.LazyKt.lazy(com.ironsource.environment.thread.IronSourceThreadManager.b.f6226a);

    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.ironsource.R9> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.environment.thread.IronSourceThreadManager.a f6225a = new com.ironsource.environment.thread.IronSourceThreadManager.a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.R9 invoke() {
            com.ironsource.R9 r9 = new com.ironsource.R9("adapterBackground");
            r9.start();
            r9.a();
            return r9;
        }
    }

    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.ironsource.C3154le> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.environment.thread.IronSourceThreadManager.b f6226a = new com.ironsource.environment.thread.IronSourceThreadManager.b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.C3154le invoke() {
            return new com.ironsource.C3154le(0, null, null, 7, null);
        }
    }

    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<android.os.Handler> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.environment.thread.IronSourceThreadManager.c f6227a = new com.ironsource.environment.thread.IronSourceThreadManager.c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.os.Handler invoke() {
            com.ironsource.R9 r9 = new com.ironsource.R9("IronSourceInitiatorHandler");
            r9.start();
            r9.a();
            return new android.os.Handler(r9.getLooper());
        }
    }

    static final class d extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.ironsource.R9> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.environment.thread.IronSourceThreadManager.d f6228a = new com.ironsource.environment.thread.IronSourceThreadManager.d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.R9 invoke() {
            com.ironsource.R9 r9 = new com.ironsource.R9("mediationBackground");
            r9.start();
            r9.a();
            return r9;
        }
    }

    static final class e extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.ironsource.R9> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.environment.thread.IronSourceThreadManager.e f6229a = new com.ironsource.environment.thread.IronSourceThreadManager.e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.R9 invoke() {
            com.ironsource.R9 r9 = new com.ironsource.R9("publisher-callbacks");
            r9.start();
            r9.a();
            return r9;
        }
    }

    static final class f extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.ironsource.R9> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.environment.thread.IronSourceThreadManager.f f6230a = new com.ironsource.environment.thread.IronSourceThreadManager.f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.R9 invoke() {
            com.ironsource.R9 r9 = new com.ironsource.R9("managersThread");
            r9.start();
            r9.a();
            return r9;
        }
    }

    static final class g extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<android.os.Handler> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.environment.thread.IronSourceThreadManager.g f6231a = new com.ironsource.environment.thread.IronSourceThreadManager.g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.os.Handler invoke() {
            return new android.os.Handler(android.os.Looper.getMainLooper());
        }
    }

    private IronSourceThreadManager() {
    }

    private final com.ironsource.R9 a() {
        return (com.ironsource.R9) f.getValue();
    }

    private final com.ironsource.C3154le b() {
        return (com.ironsource.C3154le) h.getValue();
    }

    private final com.ironsource.R9 c() {
        return (com.ironsource.R9) e.getValue();
    }

    private final com.ironsource.R9 d() {
        return (com.ironsource.R9) g.getValue();
    }

    private final android.os.Handler e() {
        return (android.os.Handler) b.getValue();
    }

    public static /* synthetic */ void postAdapterBackgroundTask$default(com.ironsource.environment.thread.IronSourceThreadManager ironSourceThreadManager, java.lang.Runnable runnable, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postAdapterBackgroundTask(runnable, j);
    }

    public static /* synthetic */ void postMediationBackgroundTask$default(com.ironsource.environment.thread.IronSourceThreadManager ironSourceThreadManager, java.lang.Runnable runnable, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postMediationBackgroundTask(runnable, j);
    }

    public static /* synthetic */ void postOnUiThreadTask$default(com.ironsource.environment.thread.IronSourceThreadManager ironSourceThreadManager, java.lang.Runnable runnable, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postOnUiThreadTask(runnable, j);
    }

    public static /* synthetic */ void postPublisherCallback$default(com.ironsource.environment.thread.IronSourceThreadManager ironSourceThreadManager, java.lang.Runnable runnable, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postPublisherCallback(runnable, j);
    }

    public final void executeTasks(boolean z, boolean z2, java.util.List<? extends java.lang.Runnable> tasks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tasks, "tasks");
        if (!z) {
            java.util.Iterator<? extends java.lang.Runnable> it = tasks.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            return;
        }
        if (!z2) {
            java.util.Iterator<? extends java.lang.Runnable> it2 = tasks.iterator();
            while (it2.hasNext()) {
                postMediationBackgroundTask$default(INSTANCE, it2.next(), 0L, 2, null);
            }
            return;
        }
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(tasks.size());
        for (final java.lang.Runnable runnable : tasks) {
            postMediationBackgroundTask$default(INSTANCE, new java.lang.Runnable() { // from class: com.ironsource.environment.thread.IronSourceThreadManager$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.environment.thread.IronSourceThreadManager.a(runnable, countDownLatch);
                }
            }, 0L, 2, null);
        }
        try {
            countDownLatch.await();
        } catch (java.lang.InterruptedException e2) {
            com.ironsource.C3180n4.d().a(e2);
        }
    }

    public final android.os.Handler getInitHandler() {
        return (android.os.Handler) c.getValue();
    }

    public final com.ironsource.R9 getSharedManagersThread() {
        return (com.ironsource.R9) d.getValue();
    }

    public final java.util.concurrent.ThreadPoolExecutor getThreadPoolExecutor() {
        return new java.util.concurrent.ThreadPoolExecutor(java.lang.Runtime.getRuntime().availableProcessors(), java.lang.Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, java.util.concurrent.TimeUnit.NANOSECONDS, new java.util.concurrent.LinkedBlockingQueue());
    }

    public final boolean getUseSharedExecutorService() {
        return f6224a;
    }

    public final void postAdapterBackgroundTask(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        postAdapterBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postMediationBackgroundTask(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        postMediationBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postOnUiThreadTask(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        postOnUiThreadTask$default(this, action, 0L, 2, null);
    }

    public final void postPublisherCallback(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        postPublisherCallback$default(this, action, 0L, 2, null);
    }

    public final void removeAdapterBackgroundTask(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        if (a(action)) {
            b().remove(action);
        } else {
            a().b(action);
        }
    }

    public final void removeMediationBackgroundTask(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        if (a(action)) {
            b().remove(action);
        } else {
            c().b(action);
        }
    }

    public final void removeUiThreadTask(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        e().removeCallbacks(action);
    }

    public final void setUseSharedExecutorService(boolean z) {
        f6224a = z;
    }

    private final boolean a(java.lang.Runnable runnable) {
        return f6224a && b().getQueue().contains(runnable);
    }

    public final void postAdapterBackgroundTask(java.lang.Runnable action, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        if (f6224a) {
            b().schedule(action, j, java.util.concurrent.TimeUnit.MILLISECONDS);
        } else {
            a().a(action, j);
        }
    }

    public final void postMediationBackgroundTask(java.lang.Runnable action, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        if (f6224a) {
            b().schedule(action, j, java.util.concurrent.TimeUnit.MILLISECONDS);
        } else {
            c().a(action, j);
        }
    }

    public final void postOnUiThreadTask(java.lang.Runnable action, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        e().postDelayed(action, j);
    }

    public final void postPublisherCallback(java.lang.Runnable action, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        d().a(action, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(java.lang.Runnable it, final java.util.concurrent.CountDownLatch latch) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "$it");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latch, "$latch");
        it.run();
        new java.lang.Runnable() { // from class: com.ironsource.environment.thread.IronSourceThreadManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.environment.thread.IronSourceThreadManager.a(latch);
            }
        }.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(java.util.concurrent.CountDownLatch latch) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latch, "$latch");
        latch.countDown();
    }
}

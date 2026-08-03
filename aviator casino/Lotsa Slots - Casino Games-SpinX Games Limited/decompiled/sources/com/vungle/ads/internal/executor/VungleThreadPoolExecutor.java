package com.vungle.ads.internal.executor;

/* compiled from: VungleThreadPoolExecutor.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0014\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0018\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u0002H\u001aH\u0016¢\u0006\u0002\u0010\u001cJ!\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u001dJ\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0018\"\u0004\b\u0000\u0010\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001eH\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "Ljava/util/concurrent/ThreadPoolExecutor;", "corePoolSize", "", "maximumPoolSize", "keepAliveTime", "", "unit", "Ljava/util/concurrent/TimeUnit;", "workQueue", "Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "threadFactory", "Lcom/vungle/ads/internal/executor/NamedThreadFactory;", "(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Lcom/vungle/ads/internal/executor/NamedThreadFactory;)V", "getThreadFactory", "()Lcom/vungle/ads/internal/executor/NamedThreadFactory;", "execute", "", com.ironsource.sdk.controller.f.b.g, com.ironsource.X3.g.e, "executorName", "", "submit", "Ljava/util/concurrent/Future;", "task", "T", "result", "(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;", "submit$vungle_ads_release", "Ljava/util/concurrent/Callable;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ComparableRunnable", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class VungleThreadPoolExecutor extends java.util.concurrent.ThreadPoolExecutor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.vungle.ads.internal.executor.VungleThreadPoolExecutor.Companion INSTANCE = new com.vungle.ads.internal.executor.VungleThreadPoolExecutor.Companion(null);
    private static final java.lang.String TAG = "VungleThreadPool";
    private final com.vungle.ads.internal.executor.NamedThreadFactory threadFactory;

    /* compiled from: VungleThreadPoolExecutor.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor$ComparableRunnable;", "", "", "Ljava/lang/Runnable;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface ComparableRunnable extends java.lang.Comparable<java.lang.Object>, java.lang.Runnable {
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final com.vungle.ads.internal.executor.NamedThreadFactory getThreadFactory() {
        return this.threadFactory;
    }

    public VungleThreadPoolExecutor(int i, int i2, long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.BlockingQueue<java.lang.Runnable> blockingQueue, com.vungle.ads.internal.executor.NamedThreadFactory namedThreadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, namedThreadFactory);
        this.threadFactory = namedThreadFactory;
        allowCoreThreadTimeOut(true);
    }

    /* compiled from: VungleThreadPoolExecutor.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor$Companion;", "", "()V", "TAG", "", "getWrappedCallableWithFallback", "Ljava/util/concurrent/Callable;", "T", com.ironsource.sdk.controller.f.b.g, "failFallback", "Lkotlin/Function0;", "", "getWrappedRunnableWithFail", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor$ComparableRunnable;", "Ljava/lang/Runnable;", com.ironsource.X3.g.e, "wrapRunnableWithFail", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void wrapRunnableWithFail(java.lang.Runnable command, java.lang.Runnable fail) {
            try {
                command.run();
            } catch (java.lang.OutOfMemoryError unused) {
                fail.run();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final com.vungle.ads.internal.executor.VungleThreadPoolExecutor.ComparableRunnable getWrappedRunnableWithFail(final java.lang.Runnable command, final java.lang.Runnable fail) {
            if (command instanceof com.vungle.ads.internal.task.PriorityRunnable) {
                return new com.vungle.ads.internal.task.PriorityRunnable() { // from class: com.vungle.ads.internal.executor.VungleThreadPoolExecutor$Companion$getWrappedRunnableWithFail$1
                    @Override // com.vungle.ads.internal.task.PriorityRunnable
                    public int getPriority() {
                        return ((com.vungle.ads.internal.task.PriorityRunnable) command).getPriority();
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        com.vungle.ads.internal.executor.VungleThreadPoolExecutor.INSTANCE.wrapRunnableWithFail(command, fail);
                    }

                    @Override // com.vungle.ads.internal.task.PriorityRunnable, java.lang.Comparable
                    public int compareTo(java.lang.Object other) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
                        if (!(other instanceof com.vungle.ads.internal.task.PriorityRunnable)) {
                            return 0;
                        }
                        return kotlin.jvm.internal.Intrinsics.compare(((com.vungle.ads.internal.task.PriorityRunnable) other).getPriority(), getPriority());
                    }
                };
            }
            return new com.vungle.ads.internal.executor.VungleThreadPoolExecutor.ComparableRunnable() { // from class: com.vungle.ads.internal.executor.VungleThreadPoolExecutor$Companion$getWrappedRunnableWithFail$2
                @Override // java.lang.Runnable
                public void run() {
                    com.vungle.ads.internal.executor.VungleThreadPoolExecutor.INSTANCE.wrapRunnableWithFail(command, fail);
                }

                @Override // java.lang.Comparable
                public int compareTo(java.lang.Object other) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
                    java.lang.Runnable runnable = command;
                    if (runnable instanceof com.vungle.ads.internal.task.PriorityRunnable) {
                        return ((com.vungle.ads.internal.task.PriorityRunnable) runnable).compareTo(other);
                    }
                    return 0;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> java.util.concurrent.Callable<T> getWrappedCallableWithFallback(final java.util.concurrent.Callable<T> command, final kotlin.jvm.functions.Function0<kotlin.Unit> failFallback) {
            return new java.util.concurrent.Callable() { // from class: com.vungle.ads.internal.executor.VungleThreadPoolExecutor$Companion$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    java.lang.Object m10431getWrappedCallableWithFallback$lambda0;
                    m10431getWrappedCallableWithFallback$lambda0 = com.vungle.ads.internal.executor.VungleThreadPoolExecutor.Companion.m10431getWrappedCallableWithFallback$lambda0(command, failFallback);
                    return m10431getWrappedCallableWithFallback$lambda0;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: getWrappedCallableWithFallback$lambda-0, reason: not valid java name */
        public static final java.lang.Object m10431getWrappedCallableWithFallback$lambda0(java.util.concurrent.Callable command, kotlin.jvm.functions.Function0 failFallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "$command");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failFallback, "$failFallback");
            try {
                return command.call();
            } catch (java.lang.OutOfMemoryError unused) {
                failFallback.invoke();
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String executorName() {
        java.lang.String name;
        com.vungle.ads.internal.executor.NamedThreadFactory namedThreadFactory = this.threadFactory;
        return (namedThreadFactory == null || (name = namedThreadFactory.getName()) == null) ? "VungleThreadPoolExecutor" : name;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(java.lang.Runnable command) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "command");
        try {
            super.execute(INSTANCE.getWrappedRunnableWithFail(command, new java.lang.Runnable() { // from class: com.vungle.ads.internal.executor.VungleThreadPoolExecutor$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.vungle.ads.internal.executor.VungleThreadPoolExecutor.m10428execute$lambda0(com.vungle.ads.internal.executor.VungleThreadPoolExecutor.this);
                }
            }));
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "execute exception", e);
        } catch (java.lang.OutOfMemoryError e2) {
            java.lang.String str = "execute error in " + executorName() + ": " + e2.getLocalizedMessage();
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, str, e2);
            new com.vungle.ads.OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: execute$lambda-0, reason: not valid java name */
    public static final void m10428execute$lambda0(com.vungle.ads.internal.executor.VungleThreadPoolExecutor this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        new com.vungle.ads.OutOfMemory("execute error in " + this$0.executorName()).logErrorNoReturnValue$vungle_ads_release();
    }

    public final void execute(java.lang.Runnable command, java.lang.Runnable fail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "command");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fail, "fail");
        try {
            super.execute(INSTANCE.getWrappedRunnableWithFail(command, fail));
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "execute exception with fail", e);
            fail.run();
        } catch (java.lang.OutOfMemoryError e2) {
            java.lang.String str = "execute error with fail in " + executorName() + ": " + e2.getLocalizedMessage();
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, str, e2);
            new com.vungle.ads.OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            fail.run();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public java.util.concurrent.Future<?> submit(java.lang.Runnable task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        try {
            java.util.concurrent.Future<?> submit = super.submit(INSTANCE.getWrappedRunnableWithFail(task, new java.lang.Runnable() { // from class: com.vungle.ads.internal.executor.VungleThreadPoolExecutor$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.vungle.ads.internal.executor.VungleThreadPoolExecutor.m10429submit$lambda1(com.vungle.ads.internal.executor.VungleThreadPoolExecutor.this);
                }
            }));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(submit, "{\n            super.subm…\n            })\n        }");
            return submit;
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "submit exception", e);
            return new com.vungle.ads.internal.executor.FutureResult(null);
        } catch (java.lang.OutOfMemoryError e2) {
            java.lang.String str = "submit error in " + executorName() + ": " + e2.getLocalizedMessage();
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, str, e2);
            new com.vungle.ads.OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            return new com.vungle.ads.internal.executor.FutureResult(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submit$lambda-1, reason: not valid java name */
    public static final void m10429submit$lambda1(com.vungle.ads.internal.executor.VungleThreadPoolExecutor this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        new com.vungle.ads.OutOfMemory("submit error in " + this$0.executorName()).logErrorNoReturnValue$vungle_ads_release();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> java.util.concurrent.Future<T> submit(java.lang.Runnable task, T result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        try {
            java.util.concurrent.Future<T> submit = super.submit(INSTANCE.getWrappedRunnableWithFail(task, new java.lang.Runnable() { // from class: com.vungle.ads.internal.executor.VungleThreadPoolExecutor$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.vungle.ads.internal.executor.VungleThreadPoolExecutor.m10430submit$lambda2(com.vungle.ads.internal.executor.VungleThreadPoolExecutor.this);
                }
            }), result);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(submit, "{\n            super.subm…     }, result)\n        }");
            return submit;
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "submit exception with result", e);
            return new com.vungle.ads.internal.executor.FutureResult(null);
        } catch (java.lang.OutOfMemoryError e2) {
            java.lang.String str = "submit error with result in " + executorName() + ": " + e2.getLocalizedMessage();
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, str, e2);
            new com.vungle.ads.OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            return new com.vungle.ads.internal.executor.FutureResult(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submit$lambda-2, reason: not valid java name */
    public static final void m10430submit$lambda2(com.vungle.ads.internal.executor.VungleThreadPoolExecutor this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        new com.vungle.ads.OutOfMemory("submit error with result in " + this$0.executorName()).logErrorNoReturnValue$vungle_ads_release();
    }

    public final java.util.concurrent.Future<?> submit$vungle_ads_release(java.lang.Runnable task, java.lang.Runnable fail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fail, "fail");
        try {
            java.util.concurrent.Future<?> submit = super.submit(INSTANCE.getWrappedRunnableWithFail(task, fail));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(submit, "{\n            super.subm…il(task, fail))\n        }");
            return submit;
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "submit exception with fail", e);
            fail.run();
            return new com.vungle.ads.internal.executor.FutureResult(null);
        } catch (java.lang.OutOfMemoryError e2) {
            java.lang.String str = "submit error with fail in " + executorName() + ": " + e2.getLocalizedMessage();
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, str, e2);
            new com.vungle.ads.OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            fail.run();
            return new com.vungle.ads.internal.executor.FutureResult(null);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        try {
            java.util.concurrent.Future<T> submit = super.submit(INSTANCE.getWrappedCallableWithFallback(task, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.internal.executor.VungleThreadPoolExecutor$submit$3
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    java.lang.String executorName;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("submit callable error in ");
                    executorName = com.vungle.ads.internal.executor.VungleThreadPoolExecutor.this.executorName();
                    sb.append(executorName);
                    new com.vungle.ads.OutOfMemory(sb.toString()).logErrorNoReturnValue$vungle_ads_release();
                }
            }));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(submit, "override fun <T> submit(…Future<T>\n        }\n    }");
            return submit;
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "submit exception callable: " + e);
            return new com.vungle.ads.internal.executor.FutureResult(null);
        } catch (java.lang.OutOfMemoryError e2) {
            java.lang.String str = "submit error callable in " + executorName() + ": " + e2.getLocalizedMessage();
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, str, e2);
            new com.vungle.ads.OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            return new com.vungle.ads.internal.executor.FutureResult(null);
        }
    }
}

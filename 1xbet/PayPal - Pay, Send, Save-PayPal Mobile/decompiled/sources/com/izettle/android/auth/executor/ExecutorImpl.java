package com.izettle.android.auth.executor;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006JU\u0010\u0010\u001a\u00020\f\"\u0004\b\u0000\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0017\u0010\r\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f0\n2\u0017\u0010\u000f\u001a\u0013\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011JD\u0010\u0010\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\f0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0017\u0010\u000f\u001a\u0013\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0012JU\u0010\u0013\u001a\u00020\f\"\u0004\b\u0000\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0017\u0010\r\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f0\n2\u0017\u0010\u000f\u001a\u0013\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0011JD\u0010\u0013\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\f0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0017\u0010\u000f\u001a\u0013\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J]\u0010\u0019\u001a\u00020\f\"\u0004\b\u0000\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0017\u0010\r\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f0\n2\u0017\u0010\u000f\u001a\u0013\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJL\u0010\u0019\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0017\u0010\u000f\u001a\u0013\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/izettle/android/auth/executor/ExecutorImpl;", "Lcom/izettle/android/auth/executor/Executor;", "Landroid/os/Handler;", "backgroundHandler", "foregroundHandler", "<init>", "(Landroid/os/Handler;Landroid/os/Handler;)V", "T", "Lkotlin/Function0;", "task", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "onComplete", "", "onError", "execute", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "executeForeground", "", "isIdle", "()Z", "", "delay", "schedule", "(Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "(Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Landroid/os/Handler;", "Ljava/util/concurrent/atomic/AtomicInteger;", "runningTasks", "Ljava/util/concurrent/atomic/AtomicInteger;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ExecutorImpl implements com.izettle.android.auth.executor.Executor {
    private final android.os.Handler backgroundHandler;
    private final android.os.Handler foregroundHandler;
    private final java.util.concurrent.atomic.AtomicInteger runningTasks;

    public ExecutorImpl(android.os.Handler handler, android.os.Handler handler2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler2, "");
        this.backgroundHandler = handler;
        this.foregroundHandler = handler2;
        this.runningTasks = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public /* synthetic */ ExecutorImpl(android.os.Handler handler, android.os.Handler handler2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.izettle.android.auth.ExtensionsKt.handler(new android.os.HandlerThread("auth-worker")) : handler, (i & 2) != 0 ? new android.os.Handler(android.os.Looper.getMainLooper()) : handler2);
    }

    @Override // com.izettle.android.auth.executor.Executor
    public final boolean isIdle() {
        return this.runningTasks.get() == 0;
    }

    @Override // com.izettle.android.auth.executor.Executor
    public final void execute(kotlin.jvm.functions.Function0<kotlin.Unit> task, final kotlin.jvm.functions.Function0<kotlin.Unit> onComplete, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onComplete, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onError, "");
        execute(task, new kotlin.jvm.functions.Function1<kotlin.Unit, kotlin.Unit>() { // from class: com.izettle.android.auth.executor.ExecutorImpl$execute$1
            public final void getHighSpeedVideoFpsRangesFor(kotlin.Unit unit) {
                onComplete.invoke();
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(kotlin.Unit unit) {
                getHighSpeedVideoFpsRangesFor(unit);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, onError);
    }

    @Override // com.izettle.android.auth.executor.Executor
    public final void executeForeground(kotlin.jvm.functions.Function0<kotlin.Unit> task, final kotlin.jvm.functions.Function0<kotlin.Unit> onComplete, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onComplete, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onError, "");
        executeForeground(task, new kotlin.jvm.functions.Function1<kotlin.Unit, kotlin.Unit>() { // from class: com.izettle.android.auth.executor.ExecutorImpl$executeForeground$1
            public final void getHighResolutionOutputSizeshNQ4ISI(kotlin.Unit unit) {
                onComplete.invoke();
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(kotlin.Unit unit) {
                getHighResolutionOutputSizeshNQ4ISI(unit);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, onError);
    }

    @Override // com.izettle.android.auth.executor.Executor
    public final void schedule(kotlin.jvm.functions.Function0<kotlin.Unit> task, long delay, final kotlin.jvm.functions.Function0<kotlin.Unit> onComplete, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onComplete, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onError, "");
        schedule(task, delay, new kotlin.jvm.functions.Function1<kotlin.Unit, kotlin.Unit>() { // from class: com.izettle.android.auth.executor.ExecutorImpl$schedule$1
            public final void getHighSpeedVideoFpsRangesFor(kotlin.Unit unit) {
                onComplete.invoke();
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(kotlin.Unit unit) {
                getHighSpeedVideoFpsRangesFor(unit);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, onError);
    }

    @Override // com.izettle.android.auth.executor.Executor
    public final <T> void execute(kotlin.jvm.functions.Function0<? extends T> task, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onComplete, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onComplete, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onError, "");
        schedule(task, 0L, onComplete, onError);
    }

    @Override // com.izettle.android.auth.executor.Executor
    public final <T> void executeForeground(final kotlin.jvm.functions.Function0<? extends T> task, final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onComplete, final kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onComplete, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onError, "");
        this.foregroundHandler.post(new java.lang.Runnable() { // from class: com.izettle.android.auth.executor.ExecutorImpl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.izettle.android.auth.executor.ExecutorImpl.executeForeground$lambda$0(kotlin.jvm.functions.Function0.this, onComplete, onError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeForeground$lambda$0(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        try {
            function1.invoke(function0.invoke());
        } catch (java.lang.Throwable th) {
            function12.invoke(th);
        }
    }

    @Override // com.izettle.android.auth.executor.Executor
    public final <T> void schedule(final kotlin.jvm.functions.Function0<? extends T> task, long delay, final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onComplete, final kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onComplete, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onError, "");
        this.backgroundHandler.postDelayed(new java.lang.Runnable() { // from class: com.izettle.android.auth.executor.ExecutorImpl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.izettle.android.auth.executor.ExecutorImpl.schedule$lambda$3(com.izettle.android.auth.executor.ExecutorImpl.this, task, onComplete, onError);
            }
        }, delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void schedule$lambda$3(final com.izettle.android.auth.executor.ExecutorImpl executorImpl, kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function1 function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        try {
            executorImpl.runningTasks.incrementAndGet();
            final java.lang.Object invoke = function0.invoke();
            executorImpl.foregroundHandler.post(new java.lang.Runnable() { // from class: com.izettle.android.auth.executor.ExecutorImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.izettle.android.auth.executor.ExecutorImpl.schedule$lambda$3$lambda$1(kotlin.jvm.functions.Function1.this, invoke, executorImpl);
                }
            });
        } catch (java.lang.Throwable th) {
            executorImpl.foregroundHandler.post(new java.lang.Runnable() { // from class: com.izettle.android.auth.executor.ExecutorImpl$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.izettle.android.auth.executor.ExecutorImpl.schedule$lambda$3$lambda$2(kotlin.jvm.functions.Function1.this, th, executorImpl);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void schedule$lambda$3$lambda$1(kotlin.jvm.functions.Function1 function1, java.lang.Object obj, com.izettle.android.auth.executor.ExecutorImpl executorImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorImpl, "");
        function1.invoke(obj);
        executorImpl.runningTasks.decrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void schedule$lambda$3$lambda$2(kotlin.jvm.functions.Function1 function1, java.lang.Throwable th, com.izettle.android.auth.executor.ExecutorImpl executorImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorImpl, "");
        function1.invoke(th);
        executorImpl.runningTasks.decrementAndGet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExecutorImpl() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}

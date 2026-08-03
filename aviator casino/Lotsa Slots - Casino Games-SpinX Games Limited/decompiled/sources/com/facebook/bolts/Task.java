package com.facebook.bolts;

/* compiled from: Task.kt */
@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 @*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003@ABB\u0007\b\u0010¢\u0006\u0002\u0010\u0003B\u0011\b\u0012\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0005B\u000f\b\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010%\u001a\b\u0012\u0004\u0012\u0002H&0\u0000\"\u0004\b\u0001\u0010&J4\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110\u00002\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070)2\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00000\u0010J>\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110\u00002\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070)2\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00000\u00102\b\u0010+\u001a\u0004\u0018\u00010,JJ\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110\u00002\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070)2\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00000\u00102\b\b\u0002\u0010-\u001a\u00020.2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,J&\u0010/\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H00\u0010J0\u0010/\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H00\u00102\b\u0010+\u001a\u0004\u0018\u00010,J.\u0010/\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H00\u00102\u0006\u0010-\u001a\u00020.J8\u0010/\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H00\u00102\u0006\u0010-\u001a\u00020.2\b\u0010+\u001a\u0004\u0018\u00010,J,\u00101\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H00\u00000\u0010J6\u00101\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H00\u00000\u00102\b\u0010+\u001a\u0004\u0018\u00010,J4\u00101\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H00\u00000\u00102\u0006\u0010-\u001a\u00020.J>\u00101\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H00\u00000\u00102\u0006\u0010-\u001a\u00020.2\b\u0010+\u001a\u0004\u0018\u00010,J\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00110\u0000J&\u00103\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H00\u0010J0\u00103\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H00\u00102\b\u0010+\u001a\u0004\u0018\u00010,J.\u00103\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H00\u00102\u0006\u0010-\u001a\u00020.J8\u00103\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H00\u00102\u0006\u0010-\u001a\u00020.2\b\u0010+\u001a\u0004\u0018\u00010,J,\u00104\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H00\u00000\u0010J6\u00104\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H00\u00000\u00102\b\u0010+\u001a\u0004\u0018\u00010,J4\u00104\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H00\u00000\u00102\u0006\u0010-\u001a\u00020.J>\u00104\u001a\b\u0012\u0004\u0012\u0002H00\u0000\"\u0004\b\u0001\u001002\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H00\u00000\u00102\u0006\u0010-\u001a\u00020.2\b\u0010+\u001a\u0004\u0018\u00010,J\b\u00105\u001a\u000206H\u0002J\u0006\u00107\u001a\u00020\u0007J\u0016\u00108\u001a\u00020\u00072\u000e\u0010\u0012\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014J\u0015\u00109\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010:J\u0006\u0010;\u001a\u000206J\u0016\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u0012\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0012\u0010!\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\"R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/facebook/bolts/Task;", "TResult", "", "()V", "result", "(Ljava/lang/Object;)V", com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, "", "(Z)V", "cancelledField", "completeField", "condition", "Ljava/util/concurrent/locks/Condition;", "kotlin.jvm.PlatformType", "continuations", "", "Lcom/facebook/bolts/Continuation;", "Ljava/lang/Void;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getError", "()Ljava/lang/Exception;", "errorField", "errorHasBeenObserved", "isCancelled", "()Z", "isCompleted", "isFaulted", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getResult", "()Ljava/lang/Object;", "resultField", "Ljava/lang/Object;", "unobservedErrorNotifier", "Lcom/facebook/bolts/UnobservedErrorNotifier;", "cast", "TOut", "continueWhile", "predicate", "Ljava/util/concurrent/Callable;", "continuation", com.facebook.appevents.UserDataStore.CITY, "Lcom/facebook/bolts/CancellationToken;", "executor", "Ljava/util/concurrent/Executor;", "continueWith", "TContinuationResult", "continueWithTask", "makeVoid", "onSuccess", "onSuccessTask", "runContinuations", "", "trySetCancelled", "trySetError", "trySetResult", "(Ljava/lang/Object;)Z", "waitForCompletion", com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "TaskCompletionSource", "UnobservedExceptionHandler", "facebook-bolts_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class Task<TResult> {
    private static volatile com.facebook.bolts.Task.UnobservedExceptionHandler unobservedExceptionHandler;
    private boolean cancelledField;
    private boolean completeField;
    private final java.util.concurrent.locks.Condition condition;
    private java.util.List<com.facebook.bolts.Continuation<TResult, java.lang.Void>> continuations;
    private java.lang.Exception errorField;
    private boolean errorHasBeenObserved;
    private final java.util.concurrent.locks.ReentrantLock lock;
    private TResult resultField;
    private com.facebook.bolts.UnobservedErrorNotifier unobservedErrorNotifier;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.bolts.Task.Companion INSTANCE = new com.facebook.bolts.Task.Companion(null);
    public static final java.util.concurrent.ExecutorService BACKGROUND_EXECUTOR = com.facebook.bolts.BoltsExecutors.INSTANCE.background();
    private static final java.util.concurrent.Executor IMMEDIATE_EXECUTOR = com.facebook.bolts.BoltsExecutors.INSTANCE.immediate$facebook_bolts_release();
    public static final java.util.concurrent.Executor UI_THREAD_EXECUTOR = com.facebook.bolts.AndroidExecutors.INSTANCE.uiThread();
    private static final com.facebook.bolts.Task<?> TASK_NULL = new com.facebook.bolts.Task<>((java.lang.Object) null);
    private static final com.facebook.bolts.Task<java.lang.Boolean> TASK_TRUE = new com.facebook.bolts.Task<>(true);
    private static final com.facebook.bolts.Task<java.lang.Boolean> TASK_FALSE = new com.facebook.bolts.Task<>(false);
    private static final com.facebook.bolts.Task<?> TASK_CANCELLED = new com.facebook.bolts.Task<>(true);

    /* compiled from: Task.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/facebook/bolts/Task$UnobservedExceptionHandler;", "", "unobservedException", "", "t", "Lcom/facebook/bolts/Task;", "e", "Lcom/facebook/bolts/UnobservedTaskException;", "facebook-bolts_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface UnobservedExceptionHandler {
        void unobservedException(com.facebook.bolts.Task<?> t, com.facebook.bolts.UnobservedTaskException e);
    }

    @kotlin.jvm.JvmStatic
    public static final <TResult> com.facebook.bolts.Task<TResult> call(java.util.concurrent.Callable<TResult> callable) {
        return INSTANCE.call(callable);
    }

    @kotlin.jvm.JvmStatic
    public static final <TResult> com.facebook.bolts.Task<TResult> call(java.util.concurrent.Callable<TResult> callable, com.facebook.bolts.CancellationToken cancellationToken) {
        return INSTANCE.call(callable, cancellationToken);
    }

    @kotlin.jvm.JvmStatic
    public static final <TResult> com.facebook.bolts.Task<TResult> call(java.util.concurrent.Callable<TResult> callable, java.util.concurrent.Executor executor) {
        return INSTANCE.call(callable, executor);
    }

    @kotlin.jvm.JvmStatic
    public static final <TResult> com.facebook.bolts.Task<TResult> call(java.util.concurrent.Callable<TResult> callable, java.util.concurrent.Executor executor, com.facebook.bolts.CancellationToken cancellationToken) {
        return INSTANCE.call(callable, executor, cancellationToken);
    }

    @kotlin.jvm.JvmStatic
    public static final <TResult> com.facebook.bolts.Task<TResult> callInBackground(java.util.concurrent.Callable<TResult> callable) {
        return INSTANCE.callInBackground(callable);
    }

    @kotlin.jvm.JvmStatic
    public static final <TResult> com.facebook.bolts.Task<TResult> callInBackground(java.util.concurrent.Callable<TResult> callable, com.facebook.bolts.CancellationToken cancellationToken) {
        return INSTANCE.callInBackground(callable, cancellationToken);
    }

    @kotlin.jvm.JvmStatic
    public static final <TResult> com.facebook.bolts.Task<TResult> cancelled() {
        return INSTANCE.cancelled();
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.bolts.Task<java.lang.Void> delay(long j) {
        return INSTANCE.delay(j);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.bolts.Task<java.lang.Void> delay(long j, com.facebook.bolts.CancellationToken cancellationToken) {
        return INSTANCE.delay(j, cancellationToken);
    }

    @kotlin.jvm.JvmStatic
    public static final <TResult> com.facebook.bolts.Task<TResult> forError(java.lang.Exception exc) {
        return INSTANCE.forError(exc);
    }

    @kotlin.jvm.JvmStatic
    public static final <TResult> com.facebook.bolts.Task<TResult> forResult(TResult tresult) {
        return INSTANCE.forResult(tresult);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.bolts.Task.UnobservedExceptionHandler getUnobservedExceptionHandler() {
        return INSTANCE.getUnobservedExceptionHandler();
    }

    @kotlin.jvm.JvmStatic
    public static final void setUnobservedExceptionHandler(com.facebook.bolts.Task.UnobservedExceptionHandler unobservedExceptionHandler2) {
        INSTANCE.setUnobservedExceptionHandler(unobservedExceptionHandler2);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.bolts.Task<java.lang.Void> whenAll(java.util.Collection<? extends com.facebook.bolts.Task<?>> collection) {
        return INSTANCE.whenAll(collection);
    }

    @kotlin.jvm.JvmStatic
    public static final <TResult> com.facebook.bolts.Task<java.util.List<TResult>> whenAllResult(java.util.Collection<com.facebook.bolts.Task<TResult>> collection) {
        return INSTANCE.whenAllResult(collection);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.bolts.Task<com.facebook.bolts.Task<?>> whenAny(java.util.Collection<? extends com.facebook.bolts.Task<?>> collection) {
        return INSTANCE.whenAny(collection);
    }

    @kotlin.jvm.JvmStatic
    public static final <TResult> com.facebook.bolts.Task<com.facebook.bolts.Task<TResult>> whenAnyResult(java.util.Collection<com.facebook.bolts.Task<TResult>> collection) {
        return INSTANCE.whenAnyResult(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <TOut> com.facebook.bolts.Task<TOut> cast() {
        return this;
    }

    public Task() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new java.util.ArrayList();
    }

    private Task(TResult tresult) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new java.util.ArrayList();
        trySetResult(tresult);
    }

    private Task(boolean z) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new java.util.ArrayList();
        if (z) {
            trySetCancelled();
        } else {
            trySetResult(null);
        }
    }

    public final boolean isCompleted() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.completeField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isCancelled() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.cancelledField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isFaulted() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.errorField != null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final TResult getResult() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.resultField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final java.lang.Exception getError() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.errorField != null) {
                this.errorHasBeenObserved = true;
                com.facebook.bolts.UnobservedErrorNotifier unobservedErrorNotifier = this.unobservedErrorNotifier;
                if (unobservedErrorNotifier != null) {
                    unobservedErrorNotifier.setObserved();
                    this.unobservedErrorNotifier = null;
                }
            }
            return this.errorField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void waitForCompletion() throws java.lang.InterruptedException {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!isCompleted()) {
                this.condition.await();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean waitForCompletion(long duration, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!isCompleted()) {
                this.condition.await(duration, timeUnit);
            }
            return isCompleted();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final com.facebook.bolts.Task<java.lang.Void> makeVoid() {
        return continueWithTask(new com.facebook.bolts.Continuation() { // from class: com.facebook.bolts.Task$$ExternalSyntheticLambda2
            @Override // com.facebook.bolts.Continuation
            public final java.lang.Object then(com.facebook.bolts.Task task) {
                com.facebook.bolts.Task m5159makeVoid$lambda8;
                m5159makeVoid$lambda8 = com.facebook.bolts.Task.m5159makeVoid$lambda8(task);
                return m5159makeVoid$lambda8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: makeVoid$lambda-8, reason: not valid java name */
    public static final com.facebook.bolts.Task m5159makeVoid$lambda8(com.facebook.bolts.Task task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        if (task.isCancelled()) {
            return INSTANCE.cancelled();
        }
        if (task.isFaulted()) {
            return INSTANCE.forError(task.getError());
        }
        return INSTANCE.forResult(null);
    }

    public final com.facebook.bolts.Task<java.lang.Void> continueWhile(java.util.concurrent.Callable<java.lang.Boolean> predicate, com.facebook.bolts.Continuation<java.lang.Void, com.facebook.bolts.Task<java.lang.Void>> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        return continueWhile(predicate, continuation, IMMEDIATE_EXECUTOR, null);
    }

    public final com.facebook.bolts.Task<java.lang.Void> continueWhile(java.util.concurrent.Callable<java.lang.Boolean> predicate, com.facebook.bolts.Continuation<java.lang.Void, com.facebook.bolts.Task<java.lang.Void>> continuation, com.facebook.bolts.CancellationToken ct) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        return continueWhile(predicate, continuation, IMMEDIATE_EXECUTOR, ct);
    }

    public static /* synthetic */ com.facebook.bolts.Task continueWhile$default(com.facebook.bolts.Task task, java.util.concurrent.Callable callable, com.facebook.bolts.Continuation continuation, java.util.concurrent.Executor executor, com.facebook.bolts.CancellationToken cancellationToken, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            executor = IMMEDIATE_EXECUTOR;
        }
        if ((i & 8) != 0) {
            cancellationToken = null;
        }
        return task.continueWhile(callable, continuation, executor, cancellationToken);
    }

    public final com.facebook.bolts.Task<java.lang.Void> continueWhile(final java.util.concurrent.Callable<java.lang.Boolean> predicate, final com.facebook.bolts.Continuation<java.lang.Void, com.facebook.bolts.Task<java.lang.Void>> continuation, final java.util.concurrent.Executor executor, final com.facebook.bolts.CancellationToken ct) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
        return makeVoid().continueWithTask((com.facebook.bolts.Continuation<java.lang.Void, com.facebook.bolts.Task<TContinuationResult>>) new com.facebook.bolts.Continuation<java.lang.Void, com.facebook.bolts.Task<java.lang.Void>>() { // from class: com.facebook.bolts.Task$continueWhile$predicateContinuation$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.bolts.Continuation
            public com.facebook.bolts.Task<java.lang.Void> then(com.facebook.bolts.Task<java.lang.Void> task) throws java.lang.Exception {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
                com.facebook.bolts.CancellationToken cancellationToken = com.facebook.bolts.CancellationToken.this;
                if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                    return com.facebook.bolts.Task.INSTANCE.cancelled();
                }
                java.lang.Boolean call = predicate.call();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(call, "predicate.call()");
                if (call.booleanValue()) {
                    return com.facebook.bolts.Task.INSTANCE.forResult(null).onSuccessTask(continuation, executor).onSuccessTask(this, executor);
                }
                return com.facebook.bolts.Task.INSTANCE.forResult(null);
            }
        }, executor);
    }

    public final <TContinuationResult> com.facebook.bolts.Task<TContinuationResult> continueWith(com.facebook.bolts.Continuation<TResult, TContinuationResult> continuation, java.util.concurrent.Executor executor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
        return continueWith(continuation, executor, null);
    }

    public final <TContinuationResult> com.facebook.bolts.Task<TContinuationResult> continueWith(final com.facebook.bolts.Continuation<TResult, TContinuationResult> continuation, final java.util.concurrent.Executor executor, final com.facebook.bolts.CancellationToken ct) {
        java.util.List<com.facebook.bolts.Continuation<TResult, java.lang.Void>> list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
        final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean isCompleted = isCompleted();
            if (!isCompleted && (list = this.continuations) != null) {
                list.add(new com.facebook.bolts.Continuation() { // from class: com.facebook.bolts.Task$$ExternalSyntheticLambda1
                    @Override // com.facebook.bolts.Continuation
                    public final java.lang.Object then(com.facebook.bolts.Task task) {
                        java.lang.Void m5157continueWith$lambda10$lambda9;
                        m5157continueWith$lambda10$lambda9 = com.facebook.bolts.Task.m5157continueWith$lambda10$lambda9(com.facebook.bolts.TaskCompletionSource.this, continuation, executor, ct, task);
                        return m5157continueWith$lambda10$lambda9;
                    }
                });
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            if (isCompleted) {
                INSTANCE.completeImmediately(taskCompletionSource, continuation, this, executor, ct);
            }
            return taskCompletionSource.getTask();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: continueWith$lambda-10$lambda-9, reason: not valid java name */
    public static final java.lang.Void m5157continueWith$lambda10$lambda9(com.facebook.bolts.TaskCompletionSource tcs, com.facebook.bolts.Continuation continuation, java.util.concurrent.Executor executor, com.facebook.bolts.CancellationToken cancellationToken, com.facebook.bolts.Task task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcs, "$tcs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "$continuation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "$executor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        INSTANCE.completeImmediately(tcs, continuation, task, executor, cancellationToken);
        return null;
    }

    public final <TContinuationResult> com.facebook.bolts.Task<TContinuationResult> continueWith(com.facebook.bolts.Continuation<TResult, TContinuationResult> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        return continueWith(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public final <TContinuationResult> com.facebook.bolts.Task<TContinuationResult> continueWith(com.facebook.bolts.Continuation<TResult, TContinuationResult> continuation, com.facebook.bolts.CancellationToken ct) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        return continueWith(continuation, IMMEDIATE_EXECUTOR, ct);
    }

    public final <TContinuationResult> com.facebook.bolts.Task<TContinuationResult> continueWithTask(com.facebook.bolts.Continuation<TResult, com.facebook.bolts.Task<TContinuationResult>> continuation, java.util.concurrent.Executor executor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
        return continueWithTask(continuation, executor, null);
    }

    public final <TContinuationResult> com.facebook.bolts.Task<TContinuationResult> continueWithTask(final com.facebook.bolts.Continuation<TResult, com.facebook.bolts.Task<TContinuationResult>> continuation, final java.util.concurrent.Executor executor, final com.facebook.bolts.CancellationToken ct) {
        java.util.List<com.facebook.bolts.Continuation<TResult, java.lang.Void>> list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
        final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean isCompleted = isCompleted();
            if (!isCompleted && (list = this.continuations) != null) {
                list.add(new com.facebook.bolts.Continuation() { // from class: com.facebook.bolts.Task$$ExternalSyntheticLambda4
                    @Override // com.facebook.bolts.Continuation
                    public final java.lang.Object then(com.facebook.bolts.Task task) {
                        java.lang.Void m5158continueWithTask$lambda12$lambda11;
                        m5158continueWithTask$lambda12$lambda11 = com.facebook.bolts.Task.m5158continueWithTask$lambda12$lambda11(com.facebook.bolts.TaskCompletionSource.this, continuation, executor, ct, task);
                        return m5158continueWithTask$lambda12$lambda11;
                    }
                });
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            if (isCompleted) {
                INSTANCE.completeAfterTask(taskCompletionSource, continuation, this, executor, ct);
            }
            return taskCompletionSource.getTask();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: continueWithTask$lambda-12$lambda-11, reason: not valid java name */
    public static final java.lang.Void m5158continueWithTask$lambda12$lambda11(com.facebook.bolts.TaskCompletionSource tcs, com.facebook.bolts.Continuation continuation, java.util.concurrent.Executor executor, com.facebook.bolts.CancellationToken cancellationToken, com.facebook.bolts.Task task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcs, "$tcs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "$continuation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "$executor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        INSTANCE.completeAfterTask(tcs, continuation, task, executor, cancellationToken);
        return null;
    }

    public final <TContinuationResult> com.facebook.bolts.Task<TContinuationResult> continueWithTask(com.facebook.bolts.Continuation<TResult, com.facebook.bolts.Task<TContinuationResult>> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        return continueWithTask(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public final <TContinuationResult> com.facebook.bolts.Task<TContinuationResult> continueWithTask(com.facebook.bolts.Continuation<TResult, com.facebook.bolts.Task<TContinuationResult>> continuation, com.facebook.bolts.CancellationToken ct) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        return continueWithTask(continuation, IMMEDIATE_EXECUTOR, ct);
    }

    public final <TContinuationResult> com.facebook.bolts.Task<TContinuationResult> onSuccess(com.facebook.bolts.Continuation<TResult, TContinuationResult> continuation, java.util.concurrent.Executor executor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
        return onSuccess(continuation, executor, null);
    }

    public final <TContinuationResult> com.facebook.bolts.Task<TContinuationResult> onSuccess(final com.facebook.bolts.Continuation<TResult, TContinuationResult> continuation, java.util.concurrent.Executor executor, final com.facebook.bolts.CancellationToken ct) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
        return continueWithTask(new com.facebook.bolts.Continuation() { // from class: com.facebook.bolts.Task$$ExternalSyntheticLambda3
            @Override // com.facebook.bolts.Continuation
            public final java.lang.Object then(com.facebook.bolts.Task task) {
                com.facebook.bolts.Task m5160onSuccess$lambda13;
                m5160onSuccess$lambda13 = com.facebook.bolts.Task.m5160onSuccess$lambda13(com.facebook.bolts.CancellationToken.this, continuation, task);
                return m5160onSuccess$lambda13;
            }
        }, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-13, reason: not valid java name */
    public static final com.facebook.bolts.Task m5160onSuccess$lambda13(com.facebook.bolts.CancellationToken cancellationToken, com.facebook.bolts.Continuation continuation, com.facebook.bolts.Task task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "$continuation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
            return INSTANCE.cancelled();
        }
        if (task.isFaulted()) {
            return INSTANCE.forError(task.getError());
        }
        if (task.isCancelled()) {
            return INSTANCE.cancelled();
        }
        return task.continueWith(continuation);
    }

    public final <TContinuationResult> com.facebook.bolts.Task<TContinuationResult> onSuccess(com.facebook.bolts.Continuation<TResult, TContinuationResult> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        return onSuccess(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public final <TContinuationResult> com.facebook.bolts.Task<TContinuationResult> onSuccess(com.facebook.bolts.Continuation<TResult, TContinuationResult> continuation, com.facebook.bolts.CancellationToken ct) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        return onSuccess(continuation, IMMEDIATE_EXECUTOR, ct);
    }

    public final <TContinuationResult> com.facebook.bolts.Task<TContinuationResult> onSuccessTask(com.facebook.bolts.Continuation<TResult, com.facebook.bolts.Task<TContinuationResult>> continuation, java.util.concurrent.Executor executor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
        return onSuccessTask(continuation, executor, null);
    }

    public final <TContinuationResult> com.facebook.bolts.Task<TContinuationResult> onSuccessTask(final com.facebook.bolts.Continuation<TResult, com.facebook.bolts.Task<TContinuationResult>> continuation, java.util.concurrent.Executor executor, final com.facebook.bolts.CancellationToken ct) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
        return continueWithTask(new com.facebook.bolts.Continuation() { // from class: com.facebook.bolts.Task$$ExternalSyntheticLambda0
            @Override // com.facebook.bolts.Continuation
            public final java.lang.Object then(com.facebook.bolts.Task task) {
                com.facebook.bolts.Task m5161onSuccessTask$lambda14;
                m5161onSuccessTask$lambda14 = com.facebook.bolts.Task.m5161onSuccessTask$lambda14(com.facebook.bolts.CancellationToken.this, continuation, task);
                return m5161onSuccessTask$lambda14;
            }
        }, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSuccessTask$lambda-14, reason: not valid java name */
    public static final com.facebook.bolts.Task m5161onSuccessTask$lambda14(com.facebook.bolts.CancellationToken cancellationToken, com.facebook.bolts.Continuation continuation, com.facebook.bolts.Task task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "$continuation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
            return INSTANCE.cancelled();
        }
        if (task.isFaulted()) {
            return INSTANCE.forError(task.getError());
        }
        if (task.isCancelled()) {
            return INSTANCE.cancelled();
        }
        return task.continueWithTask(continuation);
    }

    public final <TContinuationResult> com.facebook.bolts.Task<TContinuationResult> onSuccessTask(com.facebook.bolts.Continuation<TResult, com.facebook.bolts.Task<TContinuationResult>> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        return onSuccessTask(continuation, IMMEDIATE_EXECUTOR);
    }

    public final <TContinuationResult> com.facebook.bolts.Task<TContinuationResult> onSuccessTask(com.facebook.bolts.Continuation<TResult, com.facebook.bolts.Task<TContinuationResult>> continuation, com.facebook.bolts.CancellationToken ct) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        return onSuccessTask(continuation, IMMEDIATE_EXECUTOR, ct);
    }

    private final void runContinuations() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            java.util.List<com.facebook.bolts.Continuation<TResult, java.lang.Void>> list = this.continuations;
            if (list != null) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((com.facebook.bolts.Continuation) it.next()).then(this);
                    } catch (java.lang.RuntimeException e) {
                        throw e;
                    } catch (java.lang.Throwable th) {
                        throw new java.lang.RuntimeException(th);
                    }
                }
            }
            this.continuations = null;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean trySetCancelled() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                reentrantLock.unlock();
                return false;
            }
            this.completeField = true;
            this.cancelledField = true;
            this.condition.signalAll();
            runContinuations();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean trySetResult(TResult result) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                reentrantLock.unlock();
                return false;
            }
            this.completeField = true;
            this.resultField = result;
            this.condition.signalAll();
            runContinuations();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean trySetError(java.lang.Exception error) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                return false;
            }
            this.completeField = true;
            this.errorField = error;
            this.errorHasBeenObserved = false;
            this.condition.signalAll();
            runContinuations();
            if (!this.errorHasBeenObserved && unobservedExceptionHandler != null) {
                this.unobservedErrorNotifier = new com.facebook.bolts.UnobservedErrorNotifier(this);
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* compiled from: Task.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/bolts/Task$TaskCompletionSource;", "Lcom/facebook/bolts/TaskCompletionSource;", "(Lcom/facebook/bolts/Task;)V", "facebook-bolts_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @kotlin.Deprecated(message = "Please use [TaskCompletionSource] instead. ")
    public final class TaskCompletionSource extends com.facebook.bolts.TaskCompletionSource<TResult> {
        final /* synthetic */ com.facebook.bolts.Task<TResult> this$0;

        public TaskCompletionSource(com.facebook.bolts.Task this$0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
        }
    }

    /* compiled from: Task.kt */
    @kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00110\b\"\u0004\b\u0001\u0010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00110\u0013H\u0007J.\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00110\b\"\u0004\b\u0001\u0010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00110\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J,\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00110\b\"\u0004\b\u0001\u0010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00110\u00132\u0006\u0010\u0016\u001a\u00020\u0006H\u0007J6\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00110\b\"\u0004\b\u0001\u0010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00110\u00132\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J$\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00110\b\"\u0004\b\u0001\u0010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00110\u0013H\u0007J.\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00110\b\"\u0004\b\u0001\u0010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00110\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00110\b\"\u0004\b\u0001\u0010\u0011H\u0007J\\\u0010\u0019\u001a\u00020\u001a\"\u0004\b\u0001\u0010\u001b\"\u0004\b\u0002\u0010\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001d2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u0002H\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001b0\b0\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00110\b2\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002JV\u0010!\u001a\u00020\u001a\"\u0004\b\u0001\u0010\u001b\"\u0004\b\u0002\u0010\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u001b0\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00110\b2\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0018\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\b2\u0006\u0010\"\u001a\u00020$H\u0007J\"\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\b2\u0006\u0010\"\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0015H\u0007J/\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\b2\u0006\u0010\"\u001a\u00020$2\u0006\u0010\u0016\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0002\b'J$\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00110\b\"\u0004\b\u0001\u0010\u00112\u000e\u0010)\u001a\n\u0018\u00010*j\u0004\u0018\u0001`+H\u0007J#\u0010,\u001a\b\u0012\u0004\u0012\u0002H\u00110\b\"\u0004\b\u0001\u0010\u00112\b\u0010-\u001a\u0004\u0018\u0001H\u0011H\u0007¢\u0006\u0002\u0010.J\n\u0010/\u001a\u0004\u0018\u00010\u000fH\u0007J\u0012\u00100\u001a\u00020\u001a2\b\u00101\u001a\u0004\u0018\u00010\u000fH\u0007J \u00102\u001a\b\u0012\u0004\u0012\u00020#0\b2\u0010\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b04H\u0007J0\u00105\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0011060\b\"\u0004\b\u0001\u0010\u00112\u0012\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\b04H\u0007J$\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\b2\u0010\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b04H\u0007J.\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\b0\b\"\u0004\b\u0001\u0010\u00112\u0012\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\b04H\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/facebook/bolts/Task$Companion;", "", "()V", "BACKGROUND_EXECUTOR", "Ljava/util/concurrent/ExecutorService;", "IMMEDIATE_EXECUTOR", "Ljava/util/concurrent/Executor;", "TASK_CANCELLED", "Lcom/facebook/bolts/Task;", "TASK_FALSE", "", "TASK_NULL", "TASK_TRUE", "UI_THREAD_EXECUTOR", "unobservedExceptionHandler", "Lcom/facebook/bolts/Task$UnobservedExceptionHandler;", "call", "TResult", "callable", "Ljava/util/concurrent/Callable;", com.facebook.appevents.UserDataStore.CITY, "Lcom/facebook/bolts/CancellationToken;", "executor", "callInBackground", com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, "completeAfterTask", "", "TContinuationResult", com.ironsource.M6.n1, "Lcom/facebook/bolts/TaskCompletionSource;", "continuation", "Lcom/facebook/bolts/Continuation;", "task", "completeImmediately", "delay", "Ljava/lang/Void;", "", "cancellationToken", "Ljava/util/concurrent/ScheduledExecutorService;", "delay$facebook_bolts_release", "forError", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "forResult", "value", "(Ljava/lang/Object;)Lcom/facebook/bolts/Task;", "getUnobservedExceptionHandler", "setUnobservedExceptionHandler", "eh", "whenAll", "tasks", "", "whenAllResult", "", "whenAny", "whenAnyResult", "facebook-bolts_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.bolts.Task.UnobservedExceptionHandler getUnobservedExceptionHandler() {
            return com.facebook.bolts.Task.unobservedExceptionHandler;
        }

        @kotlin.jvm.JvmStatic
        public final void setUnobservedExceptionHandler(com.facebook.bolts.Task.UnobservedExceptionHandler eh) {
            com.facebook.bolts.Task.unobservedExceptionHandler = eh;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @kotlin.jvm.JvmStatic
        public final <TResult> com.facebook.bolts.Task<TResult> forResult(TResult value) {
            if (value == 0) {
                return com.facebook.bolts.Task.TASK_NULL;
            }
            if (value instanceof java.lang.Boolean) {
                return ((java.lang.Boolean) value).booleanValue() ? com.facebook.bolts.Task.TASK_TRUE : com.facebook.bolts.Task.TASK_FALSE;
            }
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            taskCompletionSource.setResult(value);
            return taskCompletionSource.getTask();
        }

        @kotlin.jvm.JvmStatic
        public final <TResult> com.facebook.bolts.Task<TResult> forError(java.lang.Exception error) {
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            taskCompletionSource.setError(error);
            return taskCompletionSource.getTask();
        }

        @kotlin.jvm.JvmStatic
        public final <TResult> com.facebook.bolts.Task<TResult> cancelled() {
            return com.facebook.bolts.Task.TASK_CANCELLED;
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.bolts.Task<java.lang.Void> delay(long delay) {
            return delay$facebook_bolts_release(delay, com.facebook.bolts.BoltsExecutors.INSTANCE.scheduled$facebook_bolts_release(), null);
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.bolts.Task<java.lang.Void> delay(long delay, com.facebook.bolts.CancellationToken cancellationToken) {
            return delay$facebook_bolts_release(delay, com.facebook.bolts.BoltsExecutors.INSTANCE.scheduled$facebook_bolts_release(), cancellationToken);
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.bolts.Task<java.lang.Void> delay$facebook_bolts_release(long delay, java.util.concurrent.ScheduledExecutorService executor, com.facebook.bolts.CancellationToken cancellationToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                return cancelled();
            }
            if (delay <= 0) {
                return forResult(null);
            }
            final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            final java.util.concurrent.ScheduledFuture<?> schedule = executor.schedule(new java.lang.Runnable() { // from class: com.facebook.bolts.Task$Companion$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.bolts.Task.Companion.m5168delay$lambda0(com.facebook.bolts.TaskCompletionSource.this);
                }
            }, delay, java.util.concurrent.TimeUnit.MILLISECONDS);
            if (cancellationToken != null) {
                cancellationToken.register(new java.lang.Runnable() { // from class: com.facebook.bolts.Task$Companion$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.bolts.Task.Companion.m5169delay$lambda1(schedule, taskCompletionSource);
                    }
                });
            }
            return taskCompletionSource.getTask();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: delay$lambda-0, reason: not valid java name */
        public static final void m5168delay$lambda0(com.facebook.bolts.TaskCompletionSource tcs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcs, "$tcs");
            tcs.trySetResult(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: delay$lambda-1, reason: not valid java name */
        public static final void m5169delay$lambda1(java.util.concurrent.ScheduledFuture scheduledFuture, com.facebook.bolts.TaskCompletionSource tcs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcs, "$tcs");
            scheduledFuture.cancel(true);
            tcs.trySetCancelled();
        }

        @kotlin.jvm.JvmStatic
        public final <TResult> com.facebook.bolts.Task<TResult> callInBackground(java.util.concurrent.Callable<TResult> callable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callable, "callable");
            return call(callable, com.facebook.bolts.Task.BACKGROUND_EXECUTOR, null);
        }

        @kotlin.jvm.JvmStatic
        public final <TResult> com.facebook.bolts.Task<TResult> callInBackground(java.util.concurrent.Callable<TResult> callable, com.facebook.bolts.CancellationToken ct) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callable, "callable");
            return call(callable, com.facebook.bolts.Task.BACKGROUND_EXECUTOR, ct);
        }

        @kotlin.jvm.JvmStatic
        public final <TResult> com.facebook.bolts.Task<TResult> call(java.util.concurrent.Callable<TResult> callable, java.util.concurrent.Executor executor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callable, "callable");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
            return call(callable, executor, null);
        }

        @kotlin.jvm.JvmStatic
        public final <TResult> com.facebook.bolts.Task<TResult> call(final java.util.concurrent.Callable<TResult> callable, java.util.concurrent.Executor executor, final com.facebook.bolts.CancellationToken ct) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callable, "callable");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
            final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            try {
                executor.execute(new java.lang.Runnable() { // from class: com.facebook.bolts.Task$Companion$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.bolts.Task.Companion.m5164call$lambda2(com.facebook.bolts.CancellationToken.this, taskCompletionSource, callable);
                    }
                });
            } catch (java.lang.Exception e) {
                taskCompletionSource.setError(new com.facebook.bolts.ExecutorException(e));
            }
            return taskCompletionSource.getTask();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: call$lambda-2, reason: not valid java name */
        public static final void m5164call$lambda2(com.facebook.bolts.CancellationToken cancellationToken, com.facebook.bolts.TaskCompletionSource tcs, java.util.concurrent.Callable callable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcs, "$tcs");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callable, "$callable");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                tcs.setCancelled();
                return;
            }
            try {
                tcs.setResult(callable.call());
            } catch (java.util.concurrent.CancellationException unused) {
                tcs.setCancelled();
            } catch (java.lang.Exception e) {
                tcs.setError(e);
            }
        }

        @kotlin.jvm.JvmStatic
        public final <TResult> com.facebook.bolts.Task<TResult> call(java.util.concurrent.Callable<TResult> callable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callable, "callable");
            return call(callable, com.facebook.bolts.Task.IMMEDIATE_EXECUTOR, null);
        }

        @kotlin.jvm.JvmStatic
        public final <TResult> com.facebook.bolts.Task<TResult> call(java.util.concurrent.Callable<TResult> callable, com.facebook.bolts.CancellationToken ct) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callable, "callable");
            return call(callable, com.facebook.bolts.Task.IMMEDIATE_EXECUTOR, ct);
        }

        @kotlin.jvm.JvmStatic
        public final <TResult> com.facebook.bolts.Task<com.facebook.bolts.Task<TResult>> whenAnyResult(java.util.Collection<com.facebook.bolts.Task<TResult>> tasks) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tasks, "tasks");
            if (tasks.isEmpty()) {
                return forResult(null);
            }
            final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
            java.util.Iterator<com.facebook.bolts.Task<TResult>> it = tasks.iterator();
            while (it.hasNext()) {
                it.next().continueWith(new com.facebook.bolts.Continuation() { // from class: com.facebook.bolts.Task$Companion$$ExternalSyntheticLambda2
                    @Override // com.facebook.bolts.Continuation
                    public final java.lang.Object then(com.facebook.bolts.Task task) {
                        java.lang.Void m5171whenAnyResult$lambda3;
                        m5171whenAnyResult$lambda3 = com.facebook.bolts.Task.Companion.m5171whenAnyResult$lambda3(atomicBoolean, taskCompletionSource, task);
                        return m5171whenAnyResult$lambda3;
                    }
                });
            }
            return taskCompletionSource.getTask();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: whenAnyResult$lambda-3, reason: not valid java name */
        public static final java.lang.Void m5171whenAnyResult$lambda3(java.util.concurrent.atomic.AtomicBoolean isAnyTaskComplete, com.facebook.bolts.TaskCompletionSource firstCompleted, com.facebook.bolts.Task it) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isAnyTaskComplete, "$isAnyTaskComplete");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstCompleted, "$firstCompleted");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            if (isAnyTaskComplete.compareAndSet(false, true)) {
                firstCompleted.setResult(it);
                return null;
            }
            it.getError();
            return null;
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.bolts.Task<com.facebook.bolts.Task<?>> whenAny(java.util.Collection<? extends com.facebook.bolts.Task<?>> tasks) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tasks, "tasks");
            if (tasks.isEmpty()) {
                return forResult(null);
            }
            final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
            java.util.Iterator<? extends com.facebook.bolts.Task<?>> it = tasks.iterator();
            while (it.hasNext()) {
                it.next().continueWith(new com.facebook.bolts.Continuation() { // from class: com.facebook.bolts.Task$Companion$$ExternalSyntheticLambda7
                    @Override // com.facebook.bolts.Continuation
                    public final java.lang.Object then(com.facebook.bolts.Task task) {
                        java.lang.Void m5170whenAny$lambda4;
                        m5170whenAny$lambda4 = com.facebook.bolts.Task.Companion.m5170whenAny$lambda4(atomicBoolean, taskCompletionSource, task);
                        return m5170whenAny$lambda4;
                    }
                });
            }
            return taskCompletionSource.getTask();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: whenAny$lambda-4, reason: not valid java name */
        public static final java.lang.Void m5170whenAny$lambda4(java.util.concurrent.atomic.AtomicBoolean isAnyTaskComplete, com.facebook.bolts.TaskCompletionSource firstCompleted, com.facebook.bolts.Task it) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isAnyTaskComplete, "$isAnyTaskComplete");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstCompleted, "$firstCompleted");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            if (isAnyTaskComplete.compareAndSet(false, true)) {
                firstCompleted.setResult(it);
                return null;
            }
            it.getError();
            return null;
        }

        @kotlin.jvm.JvmStatic
        public final <TResult> com.facebook.bolts.Task<java.util.List<TResult>> whenAllResult(final java.util.Collection<com.facebook.bolts.Task<TResult>> tasks) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tasks, "tasks");
            return (com.facebook.bolts.Task<java.util.List<TResult>>) whenAll(tasks).onSuccess(new com.facebook.bolts.Continuation<java.lang.Void, java.util.List<? extends TResult>>() { // from class: com.facebook.bolts.Task$Companion$whenAllResult$1
                @Override // com.facebook.bolts.Continuation
                public java.util.List<TResult> then(com.facebook.bolts.Task<java.lang.Void> task) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
                    if (tasks.isEmpty()) {
                        return kotlin.collections.CollectionsKt.emptyList();
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator<com.facebook.bolts.Task<TResult>> it = tasks.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getResult());
                    }
                    return arrayList;
                }
            });
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.bolts.Task<java.lang.Void> whenAll(java.util.Collection<? extends com.facebook.bolts.Task<?>> tasks) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tasks, "tasks");
            if (tasks.isEmpty()) {
                return forResult(null);
            }
            final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            final java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
            final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(tasks.size());
            final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
            java.util.Iterator<? extends com.facebook.bolts.Task<?>> it = tasks.iterator();
            while (it.hasNext()) {
                it.next().continueWith(new com.facebook.bolts.Continuation() { // from class: com.facebook.bolts.Task$Companion$whenAll$1
                    @Override // com.facebook.bolts.Continuation
                    public /* bridge */ /* synthetic */ java.lang.Object then(com.facebook.bolts.Task task) {
                        return then((com.facebook.bolts.Task<java.lang.Object>) task);
                    }

                    @Override // com.facebook.bolts.Continuation
                    public final java.lang.Void then(com.facebook.bolts.Task<java.lang.Object> it2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it2, "it");
                        if (it2.isFaulted()) {
                            java.util.concurrent.locks.ReentrantLock reentrantLock2 = reentrantLock;
                            java.util.ArrayList<java.lang.Exception> arrayList2 = arrayList;
                            reentrantLock2.lock();
                            try {
                                arrayList2.add(it2.getError());
                            } finally {
                                reentrantLock2.unlock();
                            }
                        }
                        if (it2.isCancelled()) {
                            atomicBoolean.set(true);
                        }
                        if (atomicInteger.decrementAndGet() == 0) {
                            if (arrayList.size() != 0) {
                                if (arrayList.size() == 1) {
                                    taskCompletionSource.setError(arrayList.get(0));
                                } else {
                                    kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                                    java.lang.String format = java.lang.String.format("There were %d exceptions.", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(arrayList.size())}, 1));
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                                    taskCompletionSource.setError(new com.facebook.bolts.AggregateException(format, arrayList));
                                }
                            } else if (atomicBoolean.get()) {
                                taskCompletionSource.setCancelled();
                            } else {
                                taskCompletionSource.setResult(null);
                            }
                        }
                        return null;
                    }
                });
            }
            return taskCompletionSource.getTask();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <TContinuationResult, TResult> void completeImmediately(final com.facebook.bolts.TaskCompletionSource<TContinuationResult> tcs, final com.facebook.bolts.Continuation<TResult, TContinuationResult> continuation, final com.facebook.bolts.Task<TResult> task, java.util.concurrent.Executor executor, final com.facebook.bolts.CancellationToken ct) {
            try {
                executor.execute(new java.lang.Runnable() { // from class: com.facebook.bolts.Task$Companion$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.bolts.Task.Companion.m5167completeImmediately$lambda5(com.facebook.bolts.CancellationToken.this, tcs, continuation, task);
                    }
                });
            } catch (java.lang.Exception e) {
                tcs.setError(new com.facebook.bolts.ExecutorException(e));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: completeImmediately$lambda-5, reason: not valid java name */
        public static final void m5167completeImmediately$lambda5(com.facebook.bolts.CancellationToken cancellationToken, com.facebook.bolts.TaskCompletionSource tcs, com.facebook.bolts.Continuation continuation, com.facebook.bolts.Task task) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcs, "$tcs");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "$continuation");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "$task");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                tcs.setCancelled();
                return;
            }
            try {
                tcs.setResult(continuation.then(task));
            } catch (java.util.concurrent.CancellationException unused) {
                tcs.setCancelled();
            } catch (java.lang.Exception e) {
                tcs.setError(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <TContinuationResult, TResult> void completeAfterTask(final com.facebook.bolts.TaskCompletionSource<TContinuationResult> tcs, final com.facebook.bolts.Continuation<TResult, com.facebook.bolts.Task<TContinuationResult>> continuation, final com.facebook.bolts.Task<TResult> task, java.util.concurrent.Executor executor, final com.facebook.bolts.CancellationToken ct) {
            try {
                executor.execute(new java.lang.Runnable() { // from class: com.facebook.bolts.Task$Companion$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.bolts.Task.Companion.m5165completeAfterTask$lambda7(com.facebook.bolts.CancellationToken.this, tcs, continuation, task);
                    }
                });
            } catch (java.lang.Exception e) {
                tcs.setError(new com.facebook.bolts.ExecutorException(e));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: completeAfterTask$lambda-7, reason: not valid java name */
        public static final void m5165completeAfterTask$lambda7(final com.facebook.bolts.CancellationToken cancellationToken, final com.facebook.bolts.TaskCompletionSource tcs, com.facebook.bolts.Continuation continuation, com.facebook.bolts.Task task) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcs, "$tcs");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "$continuation");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "$task");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                tcs.setCancelled();
                return;
            }
            try {
                com.facebook.bolts.Task task2 = (com.facebook.bolts.Task) continuation.then(task);
                if (task2 != null) {
                    task2.continueWith(new com.facebook.bolts.Continuation() { // from class: com.facebook.bolts.Task$Companion$$ExternalSyntheticLambda1
                        @Override // com.facebook.bolts.Continuation
                        public final java.lang.Object then(com.facebook.bolts.Task task3) {
                            java.lang.Void m5166completeAfterTask$lambda7$lambda6;
                            m5166completeAfterTask$lambda7$lambda6 = com.facebook.bolts.Task.Companion.m5166completeAfterTask$lambda7$lambda6(com.facebook.bolts.CancellationToken.this, tcs, task3);
                            return m5166completeAfterTask$lambda7$lambda6;
                        }
                    });
                } else {
                    tcs.setResult(null);
                }
            } catch (java.util.concurrent.CancellationException unused) {
                tcs.setCancelled();
            } catch (java.lang.Exception e) {
                tcs.setError(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: completeAfterTask$lambda-7$lambda-6, reason: not valid java name */
        public static final java.lang.Void m5166completeAfterTask$lambda7$lambda6(com.facebook.bolts.CancellationToken cancellationToken, com.facebook.bolts.TaskCompletionSource tcs, com.facebook.bolts.Task task) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcs, "$tcs");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                tcs.setCancelled();
                return null;
            }
            if (task.isCancelled()) {
                tcs.setCancelled();
            } else if (task.isFaulted()) {
                tcs.setError(task.getError());
            } else {
                tcs.setResult(task.getResult());
            }
            return null;
        }
    }
}

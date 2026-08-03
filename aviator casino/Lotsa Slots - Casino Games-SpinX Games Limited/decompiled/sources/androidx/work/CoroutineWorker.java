package androidx.work;

/* compiled from: CoroutineWorker.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0016\u001a\u00020\u000fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u0011\u0010\u0018\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0019\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0019H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010$J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001bR\u001c\u0010\u0007\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "appContext", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "coroutineContext", "Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext$annotations", "()V", "getCoroutineContext", "()Lkotlinx/coroutines/CoroutineDispatcher;", "future", "Landroidx/work/impl/utils/futures/SettableFuture;", "Landroidx/work/ListenableWorker$Result;", "getFuture$work_runtime_ktx_release", "()Landroidx/work/impl/utils/futures/SettableFuture;", "job", "Lkotlinx/coroutines/CompletableJob;", "getJob$work_runtime_ktx_release", "()Lkotlinx/coroutines/CompletableJob;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForegroundInfo", "Landroidx/work/ForegroundInfo;", "getForegroundInfoAsync", "Lcom/google/common/util/concurrent/ListenableFuture;", "onStopped", "", "setForeground", "foregroundInfo", "(Landroidx/work/ForegroundInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setProgress", "data", "Landroidx/work/Data;", "(Landroidx/work/Data;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startWork", "work-runtime-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class CoroutineWorker extends androidx.work.ListenableWorker {
    private final kotlinx.coroutines.CoroutineDispatcher coroutineContext;
    private final androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker.Result> future;
    private final kotlinx.coroutines.CompletableJob job;

    @kotlin.Deprecated(message = "use withContext(...) inside doWork() instead.")
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public abstract java.lang.Object doWork(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation);

    public java.lang.Object getForegroundInfo(kotlin.coroutines.Continuation<? super androidx.work.ForegroundInfo> continuation) {
        return getForegroundInfo$suspendImpl(this, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(android.content.Context appContext, androidx.work.WorkerParameters params) {
        super(appContext, params);
        kotlinx.coroutines.CompletableJob Job$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
        this.job = Job$default;
        androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker.Result> create = androidx.work.impl.utils.futures.SettableFuture.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "create()");
        this.future = create;
        create.addListener(new java.lang.Runnable() { // from class: androidx.work.CoroutineWorker$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.work.CoroutineWorker._init_$lambda$0(androidx.work.CoroutineWorker.this);
            }
        }, getTaskExecutor().getSerialTaskExecutor());
        this.coroutineContext = kotlinx.coroutines.Dispatchers.getDefault();
    }

    /* renamed from: getJob$work_runtime_ktx_release, reason: from getter */
    public final kotlinx.coroutines.CompletableJob getJob() {
        return this.job;
    }

    public final androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker.Result> getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(androidx.work.CoroutineWorker this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.future.isCancelled()) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) this$0.job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    public kotlinx.coroutines.CoroutineDispatcher getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.work.ListenableWorker
    public final com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> startWork() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(getCoroutineContext().plus(this.job)), null, null, new androidx.work.CoroutineWorker$startWork$1(this, null), 3, null);
        return this.future;
    }

    static /* synthetic */ java.lang.Object getForegroundInfo$suspendImpl(androidx.work.CoroutineWorker coroutineWorker, kotlin.coroutines.Continuation<? super androidx.work.ForegroundInfo> continuation) {
        throw new java.lang.IllegalStateException("Not implemented");
    }

    public final java.lang.Object setProgress(androidx.work.Data data, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> progressAsync = setProgressAsync(data);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (java.util.concurrent.ExecutionException e) {
                java.lang.Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        } else {
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            progressAsync.addListener(new androidx.work.ListenableFutureKt$await$2$1(cancellableContinuationImpl2, progressAsync), androidx.work.DirectExecutor.INSTANCE);
            cancellableContinuationImpl2.invokeOnCancellation(new androidx.work.ListenableFutureKt$await$2$2(progressAsync));
            java.lang.Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return result;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object setForeground(androidx.work.ForegroundInfo foregroundInfo, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> foregroundAsync = setForegroundAsync(foregroundInfo);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (java.util.concurrent.ExecutionException e) {
                java.lang.Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        } else {
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            foregroundAsync.addListener(new androidx.work.ListenableFutureKt$await$2$1(cancellableContinuationImpl2, foregroundAsync), androidx.work.DirectExecutor.INSTANCE);
            cancellableContinuationImpl2.invokeOnCancellation(new androidx.work.ListenableFutureKt$await$2$2(foregroundAsync));
            java.lang.Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return result;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.work.ListenableWorker
    public final com.google.common.util.concurrent.ListenableFuture<androidx.work.ForegroundInfo> getForegroundInfoAsync() {
        kotlinx.coroutines.CompletableJob Job$default;
        Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(getCoroutineContext().plus(Job$default));
        androidx.work.JobListenableFuture jobListenableFuture = new androidx.work.JobListenableFuture(Job$default, null, 2, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new androidx.work.CoroutineWorker$getForegroundInfoAsync$1(jobListenableFuture, this, null), 3, null);
        return jobListenableFuture;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }
}

package androidx.work;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\rJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0018\u0010\u000bJ\r\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR \u0010\u001d\u001a\u00020\u001c8\u0017X\u0097\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u001a\u001a\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/ListenableWorker$Result;", "startWork", "()Lcom/google/common/util/concurrent/ListenableFuture;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/work/ForegroundInfo;", "getForegroundInfo", "Landroidx/work/Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "setProgress", "(Landroidx/work/Data;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foregroundInfo", "setForeground", "(Landroidx/work/ForegroundInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "()V", "Landroidx/work/WorkerParameters;", "Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineContext", "Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext$annotations", "DeprecatedDispatcher"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends androidx.work.ListenableWorker {
    private final kotlinx.coroutines.CoroutineDispatcher coroutineContext;
    private final androidx.work.WorkerParameters params;

    @kotlin.Deprecated(message = "use withContext(...) inside doWork() instead.")
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public abstract java.lang.Object doWork(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
        this.params = workerParameters;
        this.coroutineContext = androidx.work.CoroutineWorker.DeprecatedDispatcher.INSTANCE;
    }

    public kotlinx.coroutines.CoroutineDispatcher getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.work.ListenableWorker
    public final com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> startWork() {
        kotlinx.coroutines.CoroutineDispatcher workerContext;
        kotlinx.coroutines.CompletableJob Job$default;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getCoroutineContext(), androidx.work.CoroutineWorker.DeprecatedDispatcher.INSTANCE)) {
            workerContext = getCoroutineContext();
        } else {
            workerContext = this.params.getWorkerContext();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(workerContext);
        Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
        return androidx.work.ListenableFutureKt.launchFuture$default(workerContext.plus(Job$default), null, new androidx.work.CoroutineWorker$startWork$1(this, null), 2, null);
    }

    static /* synthetic */ java.lang.Object getForegroundInfo$suspendImpl(androidx.work.CoroutineWorker coroutineWorker, kotlin.coroutines.Continuation<? super androidx.work.ForegroundInfo> continuation) {
        throw new java.lang.IllegalStateException("Not implemented");
    }

    public final java.lang.Object setProgress(androidx.work.Data data, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> progressAsync = setProgressAsync(data);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(progressAsync, "");
        java.lang.Object await = androidx.concurrent.futures.ListenableFutureKt.await(progressAsync, continuation);
        return await == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? await : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object setForeground(androidx.work.ForegroundInfo foregroundInfo, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> foregroundAsync = setForegroundAsync(foregroundInfo);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(foregroundAsync, "");
        java.lang.Object await = androidx.concurrent.futures.ListenableFutureKt.await(foregroundAsync, continuation);
        return await == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? await : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.work.ListenableWorker
    public final com.google.common.util.concurrent.ListenableFuture<androidx.work.ForegroundInfo> getForegroundInfoAsync() {
        kotlinx.coroutines.CompletableJob Job$default;
        kotlinx.coroutines.CoroutineDispatcher coroutineContext = getCoroutineContext();
        Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
        return androidx.work.ListenableFutureKt.launchFuture$default(coroutineContext.plus(Job$default), null, new androidx.work.CoroutineWorker$getForegroundInfoAsync$1(this, null), 2, null);
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00018\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/work/CoroutineWorker$DeprecatedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "p0", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/getHighSpeedVideoSizes;", "p1", "", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "isDispatchNeeded", "(Lkotlin/coroutines/CoroutineContext;)Z", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class DeprecatedDispatcher extends kotlinx.coroutines.CoroutineDispatcher {
        public static final androidx.work.CoroutineWorker.DeprecatedDispatcher INSTANCE = new androidx.work.CoroutineWorker.DeprecatedDispatcher();

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private static final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRanges = kotlinx.coroutines.Dispatchers.getDefault();

        private DeprecatedDispatcher() {
        }

        @Override // kotlinx.coroutines.CoroutineDispatcher
        public final void dispatch(kotlin.coroutines.CoroutineContext p0, java.lang.Runnable p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            getHighSpeedVideoFpsRanges.dispatch(p0, p1);
        }

        @Override // kotlinx.coroutines.CoroutineDispatcher
        public final boolean isDispatchNeeded(kotlin.coroutines.CoroutineContext p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            return getHighSpeedVideoFpsRanges.isDispatchNeeded(p0);
        }
    }

    public java.lang.Object getForegroundInfo(kotlin.coroutines.Continuation<? super androidx.work.ForegroundInfo> continuation) {
        return getForegroundInfo$suspendImpl(this, continuation);
    }
}

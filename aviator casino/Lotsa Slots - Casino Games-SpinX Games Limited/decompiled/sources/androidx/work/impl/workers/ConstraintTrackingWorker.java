package androidx.work.impl.workers;

/* compiled from: ConstraintTrackingWorker.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u0016\u0010\u0019\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u001dH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u00018G@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR2\u0010\u000e\u001a&\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u0010 \u0011*\u0012\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u0010\u0018\u00010\u000f0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/ListenableWorker;", "Landroidx/work/impl/constraints/WorkConstraintsCallback;", "appContext", "Landroid/content/Context;", "workerParameters", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "areConstraintsUnmet", "", "<set-?>", "delegate", "getDelegate", "()Landroidx/work/ListenableWorker;", "future", "Landroidx/work/impl/utils/futures/SettableFuture;", "Landroidx/work/ListenableWorker$Result;", "kotlin.jvm.PlatformType", "lock", "", "onAllConstraintsMet", "", "workSpecs", "", "Landroidx/work/impl/model/WorkSpec;", "onAllConstraintsNotMet", "onStopped", "setupAndRunConstraintTrackingWork", "startWork", "Lcom/google/common/util/concurrent/ListenableFuture;", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ConstraintTrackingWorker extends androidx.work.ListenableWorker implements androidx.work.impl.constraints.WorkConstraintsCallback {
    private volatile boolean areConstraintsUnmet;
    private androidx.work.ListenableWorker delegate;
    private final androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker.Result> future;
    private final java.lang.Object lock;
    private final androidx.work.WorkerParameters workerParameters;

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsMet(java.util.List<androidx.work.impl.model.WorkSpec> workSpecs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(android.content.Context appContext, androidx.work.WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.workerParameters = workerParameters;
        this.lock = new java.lang.Object();
        this.future = androidx.work.impl.utils.futures.SettableFuture.create();
    }

    public final androidx.work.ListenableWorker getDelegate() {
        return this.delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startWork$lambda$0(androidx.work.impl.workers.ConstraintTrackingWorker this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setupAndRunConstraintTrackingWork();
    }

    @Override // androidx.work.ListenableWorker
    public com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> startWork() {
        getBackgroundExecutor().execute(new java.lang.Runnable() { // from class: androidx.work.impl.workers.ConstraintTrackingWorker$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.work.impl.workers.ConstraintTrackingWorker.startWork$lambda$0(androidx.work.impl.workers.ConstraintTrackingWorker.this);
            }
        });
        androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker.Result> future = this.future;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(future, "future");
        return future;
    }

    private final void setupAndRunConstraintTrackingWork() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        if (this.future.isCancelled()) {
            return;
        }
        java.lang.String string = getInputData().getString(androidx.work.impl.workers.ConstraintTrackingWorkerKt.ARGUMENT_CLASS_NAME);
        androidx.work.Logger logger = androidx.work.Logger.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(logger, "get()");
        java.lang.String str7 = string;
        if (str7 == null || str7.length() == 0) {
            str = androidx.work.impl.workers.ConstraintTrackingWorkerKt.TAG;
            logger.error(str, "No worker to delegate to.");
            androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker.Result> future = this.future;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(future, "future");
            androidx.work.impl.workers.ConstraintTrackingWorkerKt.setFailed(future);
            return;
        }
        androidx.work.ListenableWorker createWorkerWithDefaultFallback = getWorkerFactory().createWorkerWithDefaultFallback(getApplicationContext(), string, this.workerParameters);
        this.delegate = createWorkerWithDefaultFallback;
        if (createWorkerWithDefaultFallback == null) {
            str6 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.TAG;
            logger.debug(str6, "No worker to delegate to.");
            androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker.Result> future2 = this.future;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(future2, "future");
            androidx.work.impl.workers.ConstraintTrackingWorkerKt.setFailed(future2);
            return;
        }
        androidx.work.impl.WorkManagerImpl workManagerImpl = androidx.work.impl.WorkManagerImpl.getInstance(getApplicationContext());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workManagerImpl, "getInstance(applicationContext)");
        androidx.work.impl.model.WorkSpecDao workSpecDao = workManagerImpl.getWorkDatabase().workSpecDao();
        java.lang.String uuid = getId().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
        androidx.work.impl.model.WorkSpec workSpec = workSpecDao.getWorkSpec(uuid);
        if (workSpec == null) {
            androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker.Result> future3 = this.future;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(future3, "future");
            androidx.work.impl.workers.ConstraintTrackingWorkerKt.setFailed(future3);
            return;
        }
        androidx.work.impl.constraints.trackers.Trackers trackers = workManagerImpl.getTrackers();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(trackers, "workManagerImpl.trackers");
        androidx.work.impl.constraints.WorkConstraintsTrackerImpl workConstraintsTrackerImpl = new androidx.work.impl.constraints.WorkConstraintsTrackerImpl(trackers, this);
        workConstraintsTrackerImpl.replace(kotlin.collections.CollectionsKt.listOf(workSpec));
        java.lang.String uuid2 = getId().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid2, "id.toString()");
        if (workConstraintsTrackerImpl.areAllConstraintsMet(uuid2)) {
            str3 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.TAG;
            logger.debug(str3, "Constraints met for delegate " + string);
            try {
                androidx.work.ListenableWorker listenableWorker = this.delegate;
                kotlin.jvm.internal.Intrinsics.checkNotNull(listenableWorker);
                final com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> startWork = listenableWorker.startWork();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(startWork, "delegate!!.startWork()");
                startWork.addListener(new java.lang.Runnable() { // from class: androidx.work.impl.workers.ConstraintTrackingWorker$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.work.impl.workers.ConstraintTrackingWorker.setupAndRunConstraintTrackingWork$lambda$2(androidx.work.impl.workers.ConstraintTrackingWorker.this, startWork);
                    }
                }, getBackgroundExecutor());
                return;
            } catch (java.lang.Throwable th) {
                str4 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.TAG;
                logger.debug(str4, "Delegated worker " + string + " threw exception in startWork.", th);
                synchronized (this.lock) {
                    if (this.areConstraintsUnmet) {
                        str5 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.TAG;
                        logger.debug(str5, "Constraints were unmet, Retrying.");
                        androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker.Result> future4 = this.future;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(future4, "future");
                        androidx.work.impl.workers.ConstraintTrackingWorkerKt.setRetry(future4);
                        return;
                    }
                    androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker.Result> future5 = this.future;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(future5, "future");
                    androidx.work.impl.workers.ConstraintTrackingWorkerKt.setFailed(future5);
                    return;
                }
            }
        }
        str2 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.TAG;
        logger.debug(str2, "Constraints not met for delegate " + string + ". Requesting retry.");
        androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker.Result> future6 = this.future;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(future6, "future");
        androidx.work.impl.workers.ConstraintTrackingWorkerKt.setRetry(future6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupAndRunConstraintTrackingWork$lambda$2(androidx.work.impl.workers.ConstraintTrackingWorker this$0, com.google.common.util.concurrent.ListenableFuture innerFuture) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(innerFuture, "$innerFuture");
        synchronized (this$0.lock) {
            if (this$0.areConstraintsUnmet) {
                androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker.Result> future = this$0.future;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(future, "future");
                androidx.work.impl.workers.ConstraintTrackingWorkerKt.setRetry(future);
            } else {
                this$0.future.setFuture(innerFuture);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        androidx.work.ListenableWorker listenableWorker = this.delegate;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        listenableWorker.stop();
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsNotMet(java.util.List<androidx.work.impl.model.WorkSpec> workSpecs) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        androidx.work.Logger logger = androidx.work.Logger.get();
        str = androidx.work.impl.workers.ConstraintTrackingWorkerKt.TAG;
        logger.debug(str, "Constraints changed for " + workSpecs);
        synchronized (this.lock) {
            this.areConstraintsUnmet = true;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}

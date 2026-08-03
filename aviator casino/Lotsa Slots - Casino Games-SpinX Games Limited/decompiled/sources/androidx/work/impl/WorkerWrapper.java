package androidx.work.impl;

/* loaded from: classes2.dex */
public class WorkerWrapper implements java.lang.Runnable {
    static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("WorkerWrapper");
    android.content.Context mAppContext;
    private androidx.work.Configuration mConfiguration;
    private androidx.work.impl.model.DependencyDao mDependencyDao;
    private androidx.work.impl.foreground.ForegroundProcessor mForegroundProcessor;
    private volatile boolean mInterrupted;
    private androidx.work.WorkerParameters.RuntimeExtras mRuntimeExtras;
    private java.util.List<androidx.work.impl.Scheduler> mSchedulers;
    private java.util.List<java.lang.String> mTags;
    private androidx.work.impl.WorkDatabase mWorkDatabase;
    private java.lang.String mWorkDescription;
    androidx.work.impl.model.WorkSpec mWorkSpec;
    private androidx.work.impl.model.WorkSpecDao mWorkSpecDao;
    private final java.lang.String mWorkSpecId;
    androidx.work.impl.utils.taskexecutor.TaskExecutor mWorkTaskExecutor;
    androidx.work.ListenableWorker mWorker;
    androidx.work.ListenableWorker.Result mResult = androidx.work.ListenableWorker.Result.failure();
    androidx.work.impl.utils.futures.SettableFuture<java.lang.Boolean> mFuture = androidx.work.impl.utils.futures.SettableFuture.create();
    final androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker.Result> mWorkerResultFuture = androidx.work.impl.utils.futures.SettableFuture.create();

    WorkerWrapper(androidx.work.impl.WorkerWrapper.Builder builder) {
        this.mAppContext = builder.mAppContext;
        this.mWorkTaskExecutor = builder.mWorkTaskExecutor;
        this.mForegroundProcessor = builder.mForegroundProcessor;
        androidx.work.impl.model.WorkSpec workSpec = builder.mWorkSpec;
        this.mWorkSpec = workSpec;
        this.mWorkSpecId = workSpec.id;
        this.mSchedulers = builder.mSchedulers;
        this.mRuntimeExtras = builder.mRuntimeExtras;
        this.mWorker = builder.mWorker;
        this.mConfiguration = builder.mConfiguration;
        androidx.work.impl.WorkDatabase workDatabase = builder.mWorkDatabase;
        this.mWorkDatabase = workDatabase;
        this.mWorkSpecDao = workDatabase.workSpecDao();
        this.mDependencyDao = this.mWorkDatabase.dependencyDao();
        this.mTags = builder.mTags;
    }

    public androidx.work.impl.model.WorkGenerationalId getWorkGenerationalId() {
        return androidx.work.impl.model.WorkSpecKt.generationalId(this.mWorkSpec);
    }

    public com.google.common.util.concurrent.ListenableFuture<java.lang.Boolean> getFuture() {
        return this.mFuture;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.mWorkDescription = createWorkDescription(this.mTags);
        runWorker();
    }

    public androidx.work.impl.model.WorkSpec getWorkSpec() {
        return this.mWorkSpec;
    }

    private void runWorker() {
        androidx.work.Data merge;
        if (tryCheckForInterruptionAndResolve()) {
            return;
        }
        this.mWorkDatabase.beginTransaction();
        try {
            if (this.mWorkSpec.state != androidx.work.WorkInfo.State.ENQUEUED) {
                resolveIncorrectStatus();
                this.mWorkDatabase.setTransactionSuccessful();
                androidx.work.Logger.get().debug(TAG, this.mWorkSpec.workerClassName + " is not in ENQUEUED state. Nothing more to do");
                return;
            }
            if ((this.mWorkSpec.isPeriodic() || this.mWorkSpec.isBackedOff()) && java.lang.System.currentTimeMillis() < this.mWorkSpec.calculateNextRunTime()) {
                androidx.work.Logger.get().debug(TAG, java.lang.String.format("Delaying execution for %s because it is being executed before schedule.", this.mWorkSpec.workerClassName));
                resolve(true);
                this.mWorkDatabase.setTransactionSuccessful();
                return;
            }
            this.mWorkDatabase.setTransactionSuccessful();
            this.mWorkDatabase.endTransaction();
            if (this.mWorkSpec.isPeriodic()) {
                merge = this.mWorkSpec.input;
            } else {
                androidx.work.InputMerger createInputMergerWithDefaultFallback = this.mConfiguration.getInputMergerFactory().createInputMergerWithDefaultFallback(this.mWorkSpec.inputMergerClassName);
                if (createInputMergerWithDefaultFallback == null) {
                    androidx.work.Logger.get().error(TAG, "Could not create Input Merger " + this.mWorkSpec.inputMergerClassName);
                    setFailedAndResolve();
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(this.mWorkSpec.input);
                arrayList.addAll(this.mWorkSpecDao.getInputsFromPrerequisites(this.mWorkSpecId));
                merge = createInputMergerWithDefaultFallback.merge(arrayList);
            }
            androidx.work.WorkerParameters workerParameters = new androidx.work.WorkerParameters(java.util.UUID.fromString(this.mWorkSpecId), merge, this.mTags, this.mRuntimeExtras, this.mWorkSpec.runAttemptCount, this.mWorkSpec.getGeneration(), this.mConfiguration.getExecutor(), this.mWorkTaskExecutor, this.mConfiguration.getWorkerFactory(), new androidx.work.impl.utils.WorkProgressUpdater(this.mWorkDatabase, this.mWorkTaskExecutor), new androidx.work.impl.utils.WorkForegroundUpdater(this.mWorkDatabase, this.mForegroundProcessor, this.mWorkTaskExecutor));
            if (this.mWorker == null) {
                this.mWorker = this.mConfiguration.getWorkerFactory().createWorkerWithDefaultFallback(this.mAppContext, this.mWorkSpec.workerClassName, workerParameters);
            }
            androidx.work.ListenableWorker listenableWorker = this.mWorker;
            if (listenableWorker == null) {
                androidx.work.Logger.get().error(TAG, "Could not create Worker " + this.mWorkSpec.workerClassName);
                setFailedAndResolve();
                return;
            }
            if (listenableWorker.isUsed()) {
                androidx.work.Logger.get().error(TAG, "Received an already-used Worker " + this.mWorkSpec.workerClassName + "; Worker Factory should return new instances");
                setFailedAndResolve();
                return;
            }
            this.mWorker.setUsed();
            if (!trySetRunning()) {
                resolveIncorrectStatus();
                return;
            }
            if (tryCheckForInterruptionAndResolve()) {
                return;
            }
            androidx.work.impl.utils.WorkForegroundRunnable workForegroundRunnable = new androidx.work.impl.utils.WorkForegroundRunnable(this.mAppContext, this.mWorkSpec, this.mWorker, workerParameters.getForegroundUpdater(), this.mWorkTaskExecutor);
            this.mWorkTaskExecutor.getMainThreadExecutor().execute(workForegroundRunnable);
            final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> future = workForegroundRunnable.getFuture();
            this.mWorkerResultFuture.addListener(new java.lang.Runnable() { // from class: androidx.work.impl.WorkerWrapper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.work.impl.WorkerWrapper.this.m4934lambda$runWorker$0$androidxworkimplWorkerWrapper(future);
                }
            }, new androidx.work.impl.utils.SynchronousExecutor());
            future.addListener(new java.lang.Runnable() { // from class: androidx.work.impl.WorkerWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    if (androidx.work.impl.WorkerWrapper.this.mWorkerResultFuture.isCancelled()) {
                        return;
                    }
                    try {
                        future.get();
                        androidx.work.Logger.get().debug(androidx.work.impl.WorkerWrapper.TAG, "Starting work for " + androidx.work.impl.WorkerWrapper.this.mWorkSpec.workerClassName);
                        androidx.work.impl.WorkerWrapper.this.mWorkerResultFuture.setFuture(androidx.work.impl.WorkerWrapper.this.mWorker.startWork());
                    } catch (java.lang.Throwable th) {
                        androidx.work.impl.WorkerWrapper.this.mWorkerResultFuture.setException(th);
                    }
                }
            }, this.mWorkTaskExecutor.getMainThreadExecutor());
            final java.lang.String str = this.mWorkDescription;
            this.mWorkerResultFuture.addListener(new java.lang.Runnable() { // from class: androidx.work.impl.WorkerWrapper.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        try {
                            androidx.work.ListenableWorker.Result result = androidx.work.impl.WorkerWrapper.this.mWorkerResultFuture.get();
                            if (result == null) {
                                androidx.work.Logger.get().error(androidx.work.impl.WorkerWrapper.TAG, androidx.work.impl.WorkerWrapper.this.mWorkSpec.workerClassName + " returned a null result. Treating it as a failure.");
                            } else {
                                androidx.work.Logger.get().debug(androidx.work.impl.WorkerWrapper.TAG, androidx.work.impl.WorkerWrapper.this.mWorkSpec.workerClassName + " returned a " + result + ".");
                                androidx.work.impl.WorkerWrapper.this.mResult = result;
                            }
                        } catch (java.lang.InterruptedException e) {
                            e = e;
                            androidx.work.Logger.get().error(androidx.work.impl.WorkerWrapper.TAG, str + " failed because it threw an exception/error", e);
                        } catch (java.util.concurrent.CancellationException e2) {
                            androidx.work.Logger.get().info(androidx.work.impl.WorkerWrapper.TAG, str + " was cancelled", e2);
                        } catch (java.util.concurrent.ExecutionException e3) {
                            e = e3;
                            androidx.work.Logger.get().error(androidx.work.impl.WorkerWrapper.TAG, str + " failed because it threw an exception/error", e);
                        }
                    } finally {
                        androidx.work.impl.WorkerWrapper.this.onWorkFinished();
                    }
                }
            }, this.mWorkTaskExecutor.getSerialTaskExecutor());
        } finally {
            this.mWorkDatabase.endTransaction();
        }
    }

    /* renamed from: lambda$runWorker$0$androidx-work-impl-WorkerWrapper, reason: not valid java name */
    /* synthetic */ void m4934lambda$runWorker$0$androidxworkimplWorkerWrapper(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        if (this.mWorkerResultFuture.isCancelled()) {
            listenableFuture.cancel(true);
        }
    }

    void onWorkFinished() {
        if (!tryCheckForInterruptionAndResolve()) {
            this.mWorkDatabase.beginTransaction();
            try {
                androidx.work.WorkInfo.State state = this.mWorkSpecDao.getState(this.mWorkSpecId);
                this.mWorkDatabase.workProgressDao().delete(this.mWorkSpecId);
                if (state == null) {
                    resolve(false);
                } else if (state == androidx.work.WorkInfo.State.RUNNING) {
                    handleResult(this.mResult);
                } else if (!state.isFinished()) {
                    rescheduleAndResolve();
                }
                this.mWorkDatabase.setTransactionSuccessful();
            } finally {
                this.mWorkDatabase.endTransaction();
            }
        }
        java.util.List<androidx.work.impl.Scheduler> list = this.mSchedulers;
        if (list != null) {
            java.util.Iterator<androidx.work.impl.Scheduler> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(this.mWorkSpecId);
            }
            androidx.work.impl.Schedulers.schedule(this.mConfiguration, this.mWorkDatabase, this.mSchedulers);
        }
    }

    public void interrupt() {
        this.mInterrupted = true;
        tryCheckForInterruptionAndResolve();
        this.mWorkerResultFuture.cancel(true);
        if (this.mWorker != null && this.mWorkerResultFuture.isCancelled()) {
            this.mWorker.stop();
            return;
        }
        androidx.work.Logger.get().debug(TAG, "WorkSpec " + this.mWorkSpec + " is already done. Not interrupting.");
    }

    private void resolveIncorrectStatus() {
        androidx.work.WorkInfo.State state = this.mWorkSpecDao.getState(this.mWorkSpecId);
        if (state == androidx.work.WorkInfo.State.RUNNING) {
            androidx.work.Logger.get().debug(TAG, "Status for " + this.mWorkSpecId + " is RUNNING; not doing any work and rescheduling for later execution");
            resolve(true);
            return;
        }
        androidx.work.Logger.get().debug(TAG, "Status for " + this.mWorkSpecId + " is " + state + " ; not doing any work");
        resolve(false);
    }

    private boolean tryCheckForInterruptionAndResolve() {
        if (!this.mInterrupted) {
            return false;
        }
        androidx.work.Logger.get().debug(TAG, "Work interrupted for " + this.mWorkDescription);
        if (this.mWorkSpecDao.getState(this.mWorkSpecId) == null) {
            resolve(false);
        } else {
            resolve(!r0.isFinished());
        }
        return true;
    }

    private void resolve(final boolean needsReschedule) {
        this.mWorkDatabase.beginTransaction();
        try {
            if (!this.mWorkDatabase.workSpecDao().hasUnfinishedWork()) {
                androidx.work.impl.utils.PackageManagerHelper.setComponentEnabled(this.mAppContext, androidx.work.impl.background.systemalarm.RescheduleReceiver.class, false);
            }
            if (needsReschedule) {
                this.mWorkSpecDao.setState(androidx.work.WorkInfo.State.ENQUEUED, this.mWorkSpecId);
                this.mWorkSpecDao.markWorkSpecScheduled(this.mWorkSpecId, -1L);
            }
            if (this.mWorkSpec != null && this.mWorker != null && this.mForegroundProcessor.isEnqueuedInForeground(this.mWorkSpecId)) {
                this.mForegroundProcessor.stopForeground(this.mWorkSpecId);
            }
            this.mWorkDatabase.setTransactionSuccessful();
            this.mWorkDatabase.endTransaction();
            this.mFuture.set(java.lang.Boolean.valueOf(needsReschedule));
        } catch (java.lang.Throwable th) {
            this.mWorkDatabase.endTransaction();
            throw th;
        }
    }

    private void handleResult(androidx.work.ListenableWorker.Result result) {
        if (result instanceof androidx.work.ListenableWorker.Result.Success) {
            androidx.work.Logger.get().info(TAG, "Worker result SUCCESS for " + this.mWorkDescription);
            if (this.mWorkSpec.isPeriodic()) {
                resetPeriodicAndResolve();
                return;
            } else {
                setSucceededAndResolve();
                return;
            }
        }
        if (result instanceof androidx.work.ListenableWorker.Result.Retry) {
            androidx.work.Logger.get().info(TAG, "Worker result RETRY for " + this.mWorkDescription);
            rescheduleAndResolve();
            return;
        }
        androidx.work.Logger.get().info(TAG, "Worker result FAILURE for " + this.mWorkDescription);
        if (this.mWorkSpec.isPeriodic()) {
            resetPeriodicAndResolve();
        } else {
            setFailedAndResolve();
        }
    }

    private boolean trySetRunning() {
        boolean z;
        this.mWorkDatabase.beginTransaction();
        try {
            if (this.mWorkSpecDao.getState(this.mWorkSpecId) == androidx.work.WorkInfo.State.ENQUEUED) {
                this.mWorkSpecDao.setState(androidx.work.WorkInfo.State.RUNNING, this.mWorkSpecId);
                this.mWorkSpecDao.incrementWorkSpecRunAttemptCount(this.mWorkSpecId);
                z = true;
            } else {
                z = false;
            }
            this.mWorkDatabase.setTransactionSuccessful();
            return z;
        } finally {
            this.mWorkDatabase.endTransaction();
        }
    }

    void setFailedAndResolve() {
        this.mWorkDatabase.beginTransaction();
        try {
            iterativelyFailWorkAndDependents(this.mWorkSpecId);
            this.mWorkSpecDao.setOutput(this.mWorkSpecId, ((androidx.work.ListenableWorker.Result.Failure) this.mResult).getOutputData());
            this.mWorkDatabase.setTransactionSuccessful();
        } finally {
            this.mWorkDatabase.endTransaction();
            resolve(false);
        }
    }

    private void iterativelyFailWorkAndDependents(java.lang.String workSpecId) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(workSpecId);
        while (!linkedList.isEmpty()) {
            java.lang.String str = (java.lang.String) linkedList.remove();
            if (this.mWorkSpecDao.getState(str) != androidx.work.WorkInfo.State.CANCELLED) {
                this.mWorkSpecDao.setState(androidx.work.WorkInfo.State.FAILED, str);
            }
            linkedList.addAll(this.mDependencyDao.getDependentWorkIds(str));
        }
    }

    private void rescheduleAndResolve() {
        this.mWorkDatabase.beginTransaction();
        try {
            this.mWorkSpecDao.setState(androidx.work.WorkInfo.State.ENQUEUED, this.mWorkSpecId);
            this.mWorkSpecDao.setLastEnqueuedTime(this.mWorkSpecId, java.lang.System.currentTimeMillis());
            this.mWorkSpecDao.markWorkSpecScheduled(this.mWorkSpecId, -1L);
            this.mWorkDatabase.setTransactionSuccessful();
        } finally {
            this.mWorkDatabase.endTransaction();
            resolve(true);
        }
    }

    private void resetPeriodicAndResolve() {
        this.mWorkDatabase.beginTransaction();
        try {
            this.mWorkSpecDao.setLastEnqueuedTime(this.mWorkSpecId, java.lang.System.currentTimeMillis());
            this.mWorkSpecDao.setState(androidx.work.WorkInfo.State.ENQUEUED, this.mWorkSpecId);
            this.mWorkSpecDao.resetWorkSpecRunAttemptCount(this.mWorkSpecId);
            this.mWorkSpecDao.incrementPeriodCount(this.mWorkSpecId);
            this.mWorkSpecDao.markWorkSpecScheduled(this.mWorkSpecId, -1L);
            this.mWorkDatabase.setTransactionSuccessful();
        } finally {
            this.mWorkDatabase.endTransaction();
            resolve(false);
        }
    }

    private void setSucceededAndResolve() {
        this.mWorkDatabase.beginTransaction();
        try {
            this.mWorkSpecDao.setState(androidx.work.WorkInfo.State.SUCCEEDED, this.mWorkSpecId);
            this.mWorkSpecDao.setOutput(this.mWorkSpecId, ((androidx.work.ListenableWorker.Result.Success) this.mResult).getOutputData());
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            for (java.lang.String str : this.mDependencyDao.getDependentWorkIds(this.mWorkSpecId)) {
                if (this.mWorkSpecDao.getState(str) == androidx.work.WorkInfo.State.BLOCKED && this.mDependencyDao.hasCompletedAllPrerequisites(str)) {
                    androidx.work.Logger.get().info(TAG, "Setting status to enqueued for " + str);
                    this.mWorkSpecDao.setState(androidx.work.WorkInfo.State.ENQUEUED, str);
                    this.mWorkSpecDao.setLastEnqueuedTime(str, currentTimeMillis);
                }
            }
            this.mWorkDatabase.setTransactionSuccessful();
        } finally {
            this.mWorkDatabase.endTransaction();
            resolve(false);
        }
    }

    private java.lang.String createWorkDescription(java.util.List<java.lang.String> tags) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Work [ id=");
        sb.append(this.mWorkSpecId);
        sb.append(", tags={ ");
        boolean z = true;
        for (java.lang.String str : tags) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    public static class Builder {
        android.content.Context mAppContext;
        androidx.work.Configuration mConfiguration;
        androidx.work.impl.foreground.ForegroundProcessor mForegroundProcessor;
        androidx.work.WorkerParameters.RuntimeExtras mRuntimeExtras = new androidx.work.WorkerParameters.RuntimeExtras();
        java.util.List<androidx.work.impl.Scheduler> mSchedulers;
        private final java.util.List<java.lang.String> mTags;
        androidx.work.impl.WorkDatabase mWorkDatabase;
        androidx.work.impl.model.WorkSpec mWorkSpec;
        androidx.work.impl.utils.taskexecutor.TaskExecutor mWorkTaskExecutor;
        androidx.work.ListenableWorker mWorker;

        public Builder(android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor workTaskExecutor, androidx.work.impl.foreground.ForegroundProcessor foregroundProcessor, androidx.work.impl.WorkDatabase database, androidx.work.impl.model.WorkSpec workSpec, java.util.List<java.lang.String> tags) {
            this.mAppContext = context.getApplicationContext();
            this.mWorkTaskExecutor = workTaskExecutor;
            this.mForegroundProcessor = foregroundProcessor;
            this.mConfiguration = configuration;
            this.mWorkDatabase = database;
            this.mWorkSpec = workSpec;
            this.mTags = tags;
        }

        public androidx.work.impl.WorkerWrapper.Builder withSchedulers(java.util.List<androidx.work.impl.Scheduler> schedulers) {
            this.mSchedulers = schedulers;
            return this;
        }

        public androidx.work.impl.WorkerWrapper.Builder withRuntimeExtras(androidx.work.WorkerParameters.RuntimeExtras runtimeExtras) {
            if (runtimeExtras != null) {
                this.mRuntimeExtras = runtimeExtras;
            }
            return this;
        }

        public androidx.work.impl.WorkerWrapper.Builder withWorker(androidx.work.ListenableWorker worker) {
            this.mWorker = worker;
            return this;
        }

        public androidx.work.impl.WorkerWrapper build() {
            return new androidx.work.impl.WorkerWrapper(this);
        }
    }
}

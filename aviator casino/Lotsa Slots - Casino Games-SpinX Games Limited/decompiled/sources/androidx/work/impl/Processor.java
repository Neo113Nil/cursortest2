package androidx.work.impl;

/* loaded from: classes2.dex */
public class Processor implements androidx.work.impl.ExecutionListener, androidx.work.impl.foreground.ForegroundProcessor {
    private static final java.lang.String FOREGROUND_WAKELOCK_TAG = "ProcessorForegroundLck";
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("Processor");
    private android.content.Context mAppContext;
    private androidx.work.Configuration mConfiguration;
    private java.util.List<androidx.work.impl.Scheduler> mSchedulers;
    private androidx.work.impl.WorkDatabase mWorkDatabase;
    private androidx.work.impl.utils.taskexecutor.TaskExecutor mWorkTaskExecutor;
    private java.util.Map<java.lang.String, androidx.work.impl.WorkerWrapper> mEnqueuedWorkMap = new java.util.HashMap();
    private java.util.Map<java.lang.String, androidx.work.impl.WorkerWrapper> mForegroundWorkMap = new java.util.HashMap();
    private java.util.Set<java.lang.String> mCancelledIds = new java.util.HashSet();
    private final java.util.List<androidx.work.impl.ExecutionListener> mOuterListeners = new java.util.ArrayList();
    private android.os.PowerManager.WakeLock mForegroundLock = null;
    private final java.lang.Object mLock = new java.lang.Object();
    private java.util.Map<java.lang.String, java.util.Set<androidx.work.impl.StartStopToken>> mWorkRuns = new java.util.HashMap();

    public Processor(android.content.Context appContext, androidx.work.Configuration configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor workTaskExecutor, androidx.work.impl.WorkDatabase workDatabase, java.util.List<androidx.work.impl.Scheduler> schedulers) {
        this.mAppContext = appContext;
        this.mConfiguration = configuration;
        this.mWorkTaskExecutor = workTaskExecutor;
        this.mWorkDatabase = workDatabase;
        this.mSchedulers = schedulers;
    }

    public boolean startWork(androidx.work.impl.StartStopToken id) {
        return startWork(id, null);
    }

    public boolean startWork(androidx.work.impl.StartStopToken startStopToken, androidx.work.WorkerParameters.RuntimeExtras runtimeExtras) {
        androidx.work.impl.model.WorkGenerationalId id = startStopToken.getId();
        final java.lang.String workSpecId = id.getWorkSpecId();
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.work.impl.model.WorkSpec workSpec = (androidx.work.impl.model.WorkSpec) this.mWorkDatabase.runInTransaction(new java.util.concurrent.Callable() { // from class: androidx.work.impl.Processor$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return androidx.work.impl.Processor.this.m4931lambda$startWork$0$androidxworkimplProcessor(arrayList, workSpecId);
            }
        });
        if (workSpec == null) {
            androidx.work.Logger.get().warning(TAG, "Didn't find WorkSpec for id " + id);
            runOnExecuted(id, false);
            return false;
        }
        synchronized (this.mLock) {
            if (isEnqueued(workSpecId)) {
                java.util.Set<androidx.work.impl.StartStopToken> set = this.mWorkRuns.get(workSpecId);
                if (set.iterator().next().getId().getGeneration() == id.getGeneration()) {
                    set.add(startStopToken);
                    androidx.work.Logger.get().debug(TAG, "Work " + id + " is already enqueued for processing");
                } else {
                    runOnExecuted(id, false);
                }
                return false;
            }
            if (workSpec.getGeneration() != id.getGeneration()) {
                runOnExecuted(id, false);
                return false;
            }
            androidx.work.impl.WorkerWrapper build = new androidx.work.impl.WorkerWrapper.Builder(this.mAppContext, this.mConfiguration, this.mWorkTaskExecutor, this, this.mWorkDatabase, workSpec, arrayList).withSchedulers(this.mSchedulers).withRuntimeExtras(runtimeExtras).build();
            com.google.common.util.concurrent.ListenableFuture<java.lang.Boolean> future = build.getFuture();
            future.addListener(new androidx.work.impl.Processor.FutureListener(this, startStopToken.getId(), future), this.mWorkTaskExecutor.getMainThreadExecutor());
            this.mEnqueuedWorkMap.put(workSpecId, build);
            java.util.HashSet hashSet = new java.util.HashSet();
            hashSet.add(startStopToken);
            this.mWorkRuns.put(workSpecId, hashSet);
            this.mWorkTaskExecutor.getSerialTaskExecutor().execute(build);
            androidx.work.Logger.get().debug(TAG, getClass().getSimpleName() + ": processing " + id);
            return true;
        }
    }

    /* renamed from: lambda$startWork$0$androidx-work-impl-Processor, reason: not valid java name */
    /* synthetic */ androidx.work.impl.model.WorkSpec m4931lambda$startWork$0$androidxworkimplProcessor(java.util.ArrayList arrayList, java.lang.String str) throws java.lang.Exception {
        arrayList.addAll(this.mWorkDatabase.workTagDao().getTagsForWorkSpecId(str));
        return this.mWorkDatabase.workSpecDao().getWorkSpec(str);
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public void startForeground(java.lang.String workSpecId, androidx.work.ForegroundInfo foregroundInfo) {
        synchronized (this.mLock) {
            androidx.work.Logger.get().info(TAG, "Moving WorkSpec (" + workSpecId + ") to the foreground");
            androidx.work.impl.WorkerWrapper remove = this.mEnqueuedWorkMap.remove(workSpecId);
            if (remove != null) {
                if (this.mForegroundLock == null) {
                    android.os.PowerManager.WakeLock newWakeLock = androidx.work.impl.utils.WakeLocks.newWakeLock(this.mAppContext, FOREGROUND_WAKELOCK_TAG);
                    this.mForegroundLock = newWakeLock;
                    newWakeLock.acquire();
                }
                this.mForegroundWorkMap.put(workSpecId, remove);
                androidx.core.content.ContextCompat.startForegroundService(this.mAppContext, androidx.work.impl.foreground.SystemForegroundDispatcher.createStartForegroundIntent(this.mAppContext, remove.getWorkGenerationalId(), foregroundInfo));
            }
        }
    }

    public boolean stopForegroundWork(androidx.work.impl.StartStopToken token) {
        androidx.work.impl.WorkerWrapper remove;
        java.lang.String workSpecId = token.getId().getWorkSpecId();
        synchronized (this.mLock) {
            androidx.work.Logger.get().debug(TAG, "Processor stopping foreground work " + workSpecId);
            remove = this.mForegroundWorkMap.remove(workSpecId);
            if (remove != null) {
                this.mWorkRuns.remove(workSpecId);
            }
        }
        return interrupt(workSpecId, remove);
    }

    public boolean stopWork(androidx.work.impl.StartStopToken runId) {
        java.lang.String workSpecId = runId.getId().getWorkSpecId();
        synchronized (this.mLock) {
            androidx.work.impl.WorkerWrapper remove = this.mEnqueuedWorkMap.remove(workSpecId);
            if (remove == null) {
                androidx.work.Logger.get().debug(TAG, "WorkerWrapper could not be found for " + workSpecId);
                return false;
            }
            java.util.Set<androidx.work.impl.StartStopToken> set = this.mWorkRuns.get(workSpecId);
            if (set != null && set.contains(runId)) {
                androidx.work.Logger.get().debug(TAG, "Processor stopping background work " + workSpecId);
                this.mWorkRuns.remove(workSpecId);
                return interrupt(workSpecId, remove);
            }
            return false;
        }
    }

    public boolean stopAndCancelWork(java.lang.String id) {
        androidx.work.impl.WorkerWrapper remove;
        boolean z;
        synchronized (this.mLock) {
            androidx.work.Logger.get().debug(TAG, "Processor cancelling " + id);
            this.mCancelledIds.add(id);
            remove = this.mForegroundWorkMap.remove(id);
            z = remove != null;
            if (remove == null) {
                remove = this.mEnqueuedWorkMap.remove(id);
            }
            if (remove != null) {
                this.mWorkRuns.remove(id);
            }
        }
        boolean interrupt = interrupt(id, remove);
        if (z) {
            stopForegroundService();
        }
        return interrupt;
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public void stopForeground(java.lang.String workSpecId) {
        synchronized (this.mLock) {
            this.mForegroundWorkMap.remove(workSpecId);
            stopForegroundService();
        }
    }

    public boolean isCancelled(java.lang.String id) {
        boolean contains;
        synchronized (this.mLock) {
            contains = this.mCancelledIds.contains(id);
        }
        return contains;
    }

    public boolean hasWork() {
        boolean z;
        synchronized (this.mLock) {
            z = (this.mEnqueuedWorkMap.isEmpty() && this.mForegroundWorkMap.isEmpty()) ? false : true;
        }
        return z;
    }

    public boolean isEnqueued(java.lang.String workSpecId) {
        boolean z;
        synchronized (this.mLock) {
            z = this.mEnqueuedWorkMap.containsKey(workSpecId) || this.mForegroundWorkMap.containsKey(workSpecId);
        }
        return z;
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public boolean isEnqueuedInForeground(java.lang.String workSpecId) {
        boolean containsKey;
        synchronized (this.mLock) {
            containsKey = this.mForegroundWorkMap.containsKey(workSpecId);
        }
        return containsKey;
    }

    public void addExecutionListener(androidx.work.impl.ExecutionListener executionListener) {
        synchronized (this.mLock) {
            this.mOuterListeners.add(executionListener);
        }
    }

    public void removeExecutionListener(androidx.work.impl.ExecutionListener executionListener) {
        synchronized (this.mLock) {
            this.mOuterListeners.remove(executionListener);
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    /* renamed from: onExecuted, reason: merged with bridge method [inline-methods] */
    public void m4930lambda$runOnExecuted$1$androidxworkimplProcessor(final androidx.work.impl.model.WorkGenerationalId id, boolean needsReschedule) {
        synchronized (this.mLock) {
            androidx.work.impl.WorkerWrapper workerWrapper = this.mEnqueuedWorkMap.get(id.getWorkSpecId());
            if (workerWrapper != null && id.equals(workerWrapper.getWorkGenerationalId())) {
                this.mEnqueuedWorkMap.remove(id.getWorkSpecId());
            }
            androidx.work.Logger.get().debug(TAG, getClass().getSimpleName() + io.ktor.sse.ServerSentEventKt.SPACE + id.getWorkSpecId() + " executed; reschedule = " + needsReschedule);
            java.util.Iterator<androidx.work.impl.ExecutionListener> it = this.mOuterListeners.iterator();
            while (it.hasNext()) {
                it.next().m4930lambda$runOnExecuted$1$androidxworkimplProcessor(id, needsReschedule);
            }
        }
    }

    public androidx.work.impl.model.WorkSpec getRunningWorkSpec(java.lang.String workSpecId) {
        synchronized (this.mLock) {
            androidx.work.impl.WorkerWrapper workerWrapper = this.mForegroundWorkMap.get(workSpecId);
            if (workerWrapper == null) {
                workerWrapper = this.mEnqueuedWorkMap.get(workSpecId);
            }
            if (workerWrapper == null) {
                return null;
            }
            return workerWrapper.getWorkSpec();
        }
    }

    private void runOnExecuted(final androidx.work.impl.model.WorkGenerationalId id, final boolean needsReschedule) {
        this.mWorkTaskExecutor.getMainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.work.impl.Processor$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.work.impl.Processor.this.m4930lambda$runOnExecuted$1$androidxworkimplProcessor(id, needsReschedule);
            }
        });
    }

    private void stopForegroundService() {
        synchronized (this.mLock) {
            if (!(!this.mForegroundWorkMap.isEmpty())) {
                try {
                    this.mAppContext.startService(androidx.work.impl.foreground.SystemForegroundDispatcher.createStopForegroundIntent(this.mAppContext));
                } catch (java.lang.Throwable th) {
                    androidx.work.Logger.get().error(TAG, "Unable to stop foreground service", th);
                }
                android.os.PowerManager.WakeLock wakeLock = this.mForegroundLock;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.mForegroundLock = null;
                }
            }
        }
    }

    private static boolean interrupt(java.lang.String id, androidx.work.impl.WorkerWrapper wrapper) {
        if (wrapper != null) {
            wrapper.interrupt();
            androidx.work.Logger.get().debug(TAG, "WorkerWrapper interrupted for " + id);
            return true;
        }
        androidx.work.Logger.get().debug(TAG, "WorkerWrapper could not be found for " + id);
        return false;
    }

    private static class FutureListener implements java.lang.Runnable {
        private androidx.work.impl.ExecutionListener mExecutionListener;
        private com.google.common.util.concurrent.ListenableFuture<java.lang.Boolean> mFuture;
        private final androidx.work.impl.model.WorkGenerationalId mWorkGenerationalId;

        FutureListener(androidx.work.impl.ExecutionListener executionListener, androidx.work.impl.model.WorkGenerationalId workGenerationalId, com.google.common.util.concurrent.ListenableFuture<java.lang.Boolean> future) {
            this.mExecutionListener = executionListener;
            this.mWorkGenerationalId = workGenerationalId;
            this.mFuture = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                z = this.mFuture.get().booleanValue();
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
                z = true;
            }
            this.mExecutionListener.m4930lambda$runOnExecuted$1$androidxworkimplProcessor(this.mWorkGenerationalId, z);
        }
    }
}

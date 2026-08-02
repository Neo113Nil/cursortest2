package androidx.work.impl;

/* loaded from: classes3.dex */
public class Processor implements androidx.work.impl.foreground.ForegroundProcessor {
    static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.work.Logger.tagWithPrefix("Processor");
    private android.content.Context getHighSpeedVideoFpsRanges;
    androidx.work.impl.WorkDatabase getHighSpeedVideoSizes;
    private androidx.work.Configuration getOutputMinFrameDuration;
    private androidx.work.impl.utils.taskexecutor.TaskExecutor getOutputSizeshNQ4ISI;
    private java.util.Map<java.lang.String, androidx.work.impl.WorkerWrapper> getInputFormats = new java.util.HashMap();
    private java.util.Map<java.lang.String, androidx.work.impl.WorkerWrapper> getHighSpeedVideoSizesFor = new java.util.HashMap();
    private java.util.Set<java.lang.String> getOutputFormats = new java.util.HashSet();
    final java.util.List<androidx.work.impl.ExecutionListener> getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
    private android.os.PowerManager.WakeLock getInputSizeshNQ4ISI = null;
    final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
    private java.util.Map<java.lang.String, java.util.Set<androidx.work.impl.StartStopToken>> getOutputSizes = new java.util.HashMap();

    public Processor(android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, androidx.work.impl.WorkDatabase workDatabase) {
        this.getHighSpeedVideoFpsRanges = context;
        this.getOutputMinFrameDuration = configuration;
        this.getOutputSizeshNQ4ISI = taskExecutor;
        this.getHighSpeedVideoSizes = workDatabase;
    }

    public boolean startWork(androidx.work.impl.StartStopToken startStopToken) {
        return startWork(startStopToken, null);
    }

    public boolean startWork(androidx.work.impl.StartStopToken startStopToken, androidx.work.WorkerParameters.RuntimeExtras runtimeExtras) {
        final androidx.work.impl.model.WorkGenerationalId id = startStopToken.getId();
        final java.lang.String workSpecId = id.getWorkSpecId();
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.work.impl.model.WorkSpec workSpec = (androidx.work.impl.model.WorkSpec) this.getHighSpeedVideoSizes.runInTransaction(new java.util.concurrent.Callable() { // from class: androidx.work.impl.Processor$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                androidx.work.impl.Processor processor = androidx.work.impl.Processor.this;
                java.util.ArrayList arrayList2 = arrayList;
                java.lang.String str = workSpecId;
                arrayList2.addAll(processor.getHighSpeedVideoSizes.workTagDao().getTagsForWorkSpecId(str));
                return processor.getHighSpeedVideoSizes.workSpecDao().getWorkSpec(str);
            }
        });
        final boolean z = false;
        if (workSpec == null) {
            androidx.work.Logger.get().warning(getHighSpeedVideoFpsRangesFor, "Didn't find WorkSpec for id ".concat(java.lang.String.valueOf(id)));
            this.getOutputSizeshNQ4ISI.getMainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.work.impl.Processor$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.work.impl.Processor processor = androidx.work.impl.Processor.this;
                    androidx.work.impl.model.WorkGenerationalId workGenerationalId = id;
                    boolean z2 = z;
                    synchronized (processor.Camera2StreamConfigurationMap) {
                        java.util.Iterator<androidx.work.impl.ExecutionListener> it = processor.getHighResolutionOutputSizeshNQ4ISI.iterator();
                        while (it.hasNext()) {
                            it.next().onExecuted(workGenerationalId, z2);
                        }
                    }
                }
            });
            return false;
        }
        synchronized (this.Camera2StreamConfigurationMap) {
            if (isEnqueued(workSpecId)) {
                java.util.Set<androidx.work.impl.StartStopToken> set = this.getOutputSizes.get(workSpecId);
                if (set.iterator().next().getId().getGeneration() == id.getGeneration()) {
                    set.add(startStopToken);
                    androidx.work.Logger logger = androidx.work.Logger.get();
                    java.lang.String str = getHighSpeedVideoFpsRangesFor;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Work ");
                    sb.append(id);
                    sb.append(" is already enqueued for processing");
                    logger.debug(str, sb.toString());
                } else {
                    this.getOutputSizeshNQ4ISI.getMainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.work.impl.Processor$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.work.impl.Processor processor = androidx.work.impl.Processor.this;
                            androidx.work.impl.model.WorkGenerationalId workGenerationalId = id;
                            boolean z2 = z;
                            synchronized (processor.Camera2StreamConfigurationMap) {
                                java.util.Iterator<androidx.work.impl.ExecutionListener> it = processor.getHighResolutionOutputSizeshNQ4ISI.iterator();
                                while (it.hasNext()) {
                                    it.next().onExecuted(workGenerationalId, z2);
                                }
                            }
                        }
                    });
                }
                return false;
            }
            if (workSpec.getGeneration() == id.getGeneration()) {
                final androidx.work.impl.WorkerWrapper build = new androidx.work.impl.WorkerWrapper.Builder(this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.getOutputSizeshNQ4ISI, this, this.getHighSpeedVideoSizes, workSpec, arrayList).withRuntimeExtras(runtimeExtras).build();
                final com.google.common.util.concurrent.ListenableFuture<java.lang.Boolean> launch = build.launch();
                launch.addListener(new java.lang.Runnable() { // from class: androidx.work.impl.Processor$$ExternalSyntheticLambda2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z2;
                        androidx.work.impl.Processor processor = androidx.work.impl.Processor.this;
                        com.google.common.util.concurrent.ListenableFuture listenableFuture = launch;
                        androidx.work.impl.WorkerWrapper workerWrapper = build;
                        try {
                            z2 = ((java.lang.Boolean) listenableFuture.get()).booleanValue();
                        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
                            z2 = true;
                        }
                        synchronized (processor.Camera2StreamConfigurationMap) {
                            androidx.work.impl.model.WorkGenerationalId workGenerationalId = workerWrapper.getWorkGenerationalId();
                            java.lang.String workSpecId2 = workGenerationalId.getWorkSpecId();
                            if (processor.Camera2StreamConfigurationMap(workSpecId2) == workerWrapper) {
                                processor.getHighSpeedVideoFpsRangesFor(workSpecId2);
                            }
                            androidx.work.Logger logger2 = androidx.work.Logger.get();
                            java.lang.String str2 = androidx.work.impl.Processor.getHighSpeedVideoFpsRangesFor;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append(processor.getClass().getSimpleName());
                            sb2.append(" ");
                            sb2.append(workSpecId2);
                            sb2.append(" executed; reschedule = ");
                            sb2.append(z2);
                            logger2.debug(str2, sb2.toString());
                            java.util.Iterator<androidx.work.impl.ExecutionListener> it = processor.getHighResolutionOutputSizeshNQ4ISI.iterator();
                            while (it.hasNext()) {
                                it.next().onExecuted(workGenerationalId, z2);
                            }
                        }
                    }
                }, this.getOutputSizeshNQ4ISI.getMainThreadExecutor());
                this.getInputFormats.put(workSpecId, build);
                java.util.HashSet hashSet = new java.util.HashSet();
                hashSet.add(startStopToken);
                this.getOutputSizes.put(workSpecId, hashSet);
                androidx.work.Logger logger2 = androidx.work.Logger.get();
                java.lang.String str2 = getHighSpeedVideoFpsRangesFor;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(getClass().getSimpleName());
                sb2.append(": processing ");
                sb2.append(id);
                logger2.debug(str2, sb2.toString());
                return true;
            }
            this.getOutputSizeshNQ4ISI.getMainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.work.impl.Processor$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.work.impl.Processor processor = androidx.work.impl.Processor.this;
                    androidx.work.impl.model.WorkGenerationalId workGenerationalId = id;
                    boolean z2 = z;
                    synchronized (processor.Camera2StreamConfigurationMap) {
                        java.util.Iterator<androidx.work.impl.ExecutionListener> it = processor.getHighResolutionOutputSizeshNQ4ISI.iterator();
                        while (it.hasNext()) {
                            it.next().onExecuted(workGenerationalId, z2);
                        }
                    }
                }
            });
            return false;
        }
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public void startForeground(java.lang.String str, androidx.work.ForegroundInfo foregroundInfo) {
        synchronized (this.Camera2StreamConfigurationMap) {
            androidx.work.Logger logger = androidx.work.Logger.get();
            java.lang.String str2 = getHighSpeedVideoFpsRangesFor;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Moving WorkSpec (");
            sb.append(str);
            sb.append(") to the foreground");
            logger.info(str2, sb.toString());
            androidx.work.impl.WorkerWrapper remove = this.getInputFormats.remove(str);
            if (remove != null) {
                if (this.getInputSizeshNQ4ISI == null) {
                    android.os.PowerManager.WakeLock newWakeLock = androidx.work.impl.utils.WakeLocks.newWakeLock(this.getHighSpeedVideoFpsRanges, "ProcessorForegroundLck");
                    this.getInputSizeshNQ4ISI = newWakeLock;
                    newWakeLock.acquire();
                }
                this.getHighSpeedVideoSizesFor.put(str, remove);
                androidx.core.content.ContextCompat.startForegroundService(this.getHighSpeedVideoFpsRanges, androidx.work.impl.foreground.SystemForegroundDispatcher.createStartForegroundIntent(this.getHighSpeedVideoFpsRanges, remove.getWorkGenerationalId(), foregroundInfo));
            }
        }
    }

    public boolean stopForegroundWork(androidx.work.impl.StartStopToken startStopToken, int i) {
        androidx.work.impl.WorkerWrapper highSpeedVideoFpsRangesFor;
        java.lang.String workSpecId = startStopToken.getId().getWorkSpecId();
        synchronized (this.Camera2StreamConfigurationMap) {
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(workSpecId);
        }
        return getHighSpeedVideoFpsRanges(workSpecId, highSpeedVideoFpsRangesFor, i);
    }

    public boolean stopWork(androidx.work.impl.StartStopToken startStopToken, int i) {
        java.lang.String workSpecId = startStopToken.getId().getWorkSpecId();
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getHighSpeedVideoSizesFor.get(workSpecId) != null) {
                androidx.work.Logger logger = androidx.work.Logger.get();
                java.lang.String str = getHighSpeedVideoFpsRangesFor;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Ignored stopWork. WorkerWrapper ");
                sb.append(workSpecId);
                sb.append(" is in foreground");
                logger.debug(str, sb.toString());
                return false;
            }
            java.util.Set<androidx.work.impl.StartStopToken> set = this.getOutputSizes.get(workSpecId);
            if (set != null && set.contains(startStopToken)) {
                return getHighSpeedVideoFpsRanges(workSpecId, getHighSpeedVideoFpsRangesFor(workSpecId), i);
            }
            return false;
        }
    }

    public boolean stopAndCancelWork(java.lang.String str, int i) {
        androidx.work.impl.WorkerWrapper highSpeedVideoFpsRangesFor;
        synchronized (this.Camera2StreamConfigurationMap) {
            androidx.work.Logger logger = androidx.work.Logger.get();
            java.lang.String str2 = getHighSpeedVideoFpsRangesFor;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Processor cancelling ");
            sb.append(str);
            logger.debug(str2, sb.toString());
            this.getOutputFormats.add(str);
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str);
        }
        return getHighSpeedVideoFpsRanges(str, highSpeedVideoFpsRangesFor, i);
    }

    public boolean isCancelled(java.lang.String str) {
        boolean contains;
        synchronized (this.Camera2StreamConfigurationMap) {
            contains = this.getOutputFormats.contains(str);
        }
        return contains;
    }

    public boolean hasWork() {
        boolean z;
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getInputFormats.isEmpty()) {
                z = this.getHighSpeedVideoSizesFor.isEmpty() ? false : true;
            }
        }
        return z;
    }

    public boolean isEnqueued(java.lang.String str) {
        boolean z;
        synchronized (this.Camera2StreamConfigurationMap) {
            z = Camera2StreamConfigurationMap(str) != null;
        }
        return z;
    }

    public void addExecutionListener(androidx.work.impl.ExecutionListener executionListener) {
        synchronized (this.Camera2StreamConfigurationMap) {
            this.getHighResolutionOutputSizeshNQ4ISI.add(executionListener);
        }
    }

    public void removeExecutionListener(androidx.work.impl.ExecutionListener executionListener) {
        synchronized (this.Camera2StreamConfigurationMap) {
            this.getHighResolutionOutputSizeshNQ4ISI.remove(executionListener);
        }
    }

    final androidx.work.impl.WorkerWrapper Camera2StreamConfigurationMap(java.lang.String str) {
        androidx.work.impl.WorkerWrapper workerWrapper = this.getHighSpeedVideoSizesFor.get(str);
        return workerWrapper == null ? this.getInputFormats.get(str) : workerWrapper;
    }

    public androidx.work.impl.model.WorkSpec getRunningWorkSpec(java.lang.String str) {
        synchronized (this.Camera2StreamConfigurationMap) {
            androidx.work.impl.WorkerWrapper Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(str);
            if (Camera2StreamConfigurationMap == null) {
                return null;
            }
            return Camera2StreamConfigurationMap.getWorkSpec();
        }
    }

    final androidx.work.impl.WorkerWrapper getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        androidx.work.impl.WorkerWrapper remove = this.getHighSpeedVideoSizesFor.remove(str);
        boolean z = remove != null;
        if (!z) {
            remove = this.getInputFormats.remove(str);
        }
        this.getOutputSizes.remove(str);
        if (z) {
            synchronized (this.Camera2StreamConfigurationMap) {
                if (this.getHighSpeedVideoSizesFor.isEmpty()) {
                    try {
                        this.getHighSpeedVideoFpsRanges.startService(androidx.work.impl.foreground.SystemForegroundDispatcher.createStopForegroundIntent(this.getHighSpeedVideoFpsRanges));
                    } catch (java.lang.Throwable th) {
                        androidx.work.Logger.get().error(getHighSpeedVideoFpsRangesFor, "Unable to stop foreground service", th);
                    }
                    android.os.PowerManager.WakeLock wakeLock = this.getInputSizeshNQ4ISI;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.getInputSizeshNQ4ISI = null;
                    }
                }
            }
        }
        return remove;
    }

    private static boolean getHighSpeedVideoFpsRanges(java.lang.String str, androidx.work.impl.WorkerWrapper workerWrapper, int i) {
        if (workerWrapper != null) {
            workerWrapper.interrupt(i);
            androidx.work.Logger.get().debug(getHighSpeedVideoFpsRangesFor, "WorkerWrapper interrupted for ".concat(java.lang.String.valueOf(str)));
            return true;
        }
        androidx.work.Logger.get().debug(getHighSpeedVideoFpsRangesFor, "WorkerWrapper could not be found for ".concat(java.lang.String.valueOf(str)));
        return false;
    }
}

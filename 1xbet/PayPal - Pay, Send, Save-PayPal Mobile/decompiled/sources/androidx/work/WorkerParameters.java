package androidx.work;

/* loaded from: classes.dex */
public final class WorkerParameters {
    private int Camera2StreamConfigurationMap;
    private androidx.work.ForegroundUpdater getHighResolutionOutputSizeshNQ4ISI;
    private java.util.concurrent.Executor getHighSpeedVideoFpsRanges;
    private java.util.UUID getHighSpeedVideoFpsRangesFor;
    private androidx.work.Data getHighSpeedVideoSizes;
    private androidx.work.WorkerParameters.RuntimeExtras getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private androidx.work.impl.utils.taskexecutor.TaskExecutor getInputSizeshNQ4ISI;
    private androidx.work.ProgressUpdater getOutputFormats;
    private java.util.Set<java.lang.String> getOutputMinFrameDuration;
    private androidx.work.WorkerFactory getOutputSizes;
    private kotlin.coroutines.CoroutineContext getOutputStallDurationlomOqCM;

    /* loaded from: classes3.dex */
    public static class RuntimeExtras {
        public android.net.Network network;
        public java.util.List<java.lang.String> triggeredContentAuthorities = java.util.Collections.emptyList();
        public java.util.List<android.net.Uri> triggeredContentUris = java.util.Collections.emptyList();
    }

    public WorkerParameters(java.util.UUID uuid, androidx.work.Data data, java.util.Collection<java.lang.String> collection, androidx.work.WorkerParameters.RuntimeExtras runtimeExtras, int i, int i2, java.util.concurrent.Executor executor, kotlin.coroutines.CoroutineContext coroutineContext, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, androidx.work.WorkerFactory workerFactory, androidx.work.ProgressUpdater progressUpdater, androidx.work.ForegroundUpdater foregroundUpdater) {
        this.getHighSpeedVideoFpsRangesFor = uuid;
        this.getHighSpeedVideoSizes = data;
        this.getOutputMinFrameDuration = new java.util.HashSet(collection);
        this.getHighSpeedVideoSizesFor = runtimeExtras;
        this.getInputFormats = i;
        this.Camera2StreamConfigurationMap = i2;
        this.getHighSpeedVideoFpsRanges = executor;
        this.getOutputStallDurationlomOqCM = coroutineContext;
        this.getInputSizeshNQ4ISI = taskExecutor;
        this.getOutputSizes = workerFactory;
        this.getOutputFormats = progressUpdater;
        this.getHighResolutionOutputSizeshNQ4ISI = foregroundUpdater;
    }

    public final java.util.UUID getId() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final androidx.work.Data getInputData() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.util.Set<java.lang.String> getTags() {
        return this.getOutputMinFrameDuration;
    }

    public final java.util.List<android.net.Uri> getTriggeredContentUris() {
        return this.getHighSpeedVideoSizesFor.triggeredContentUris;
    }

    public final java.util.List<java.lang.String> getTriggeredContentAuthorities() {
        return this.getHighSpeedVideoSizesFor.triggeredContentAuthorities;
    }

    public final android.net.Network getNetwork() {
        return this.getHighSpeedVideoSizesFor.network;
    }

    public final int getRunAttemptCount() {
        return this.getInputFormats;
    }

    public final int getGeneration() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.util.concurrent.Executor getBackgroundExecutor() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final kotlin.coroutines.CoroutineContext getWorkerContext() {
        return this.getOutputStallDurationlomOqCM;
    }

    public final androidx.work.impl.utils.taskexecutor.TaskExecutor getTaskExecutor() {
        return this.getInputSizeshNQ4ISI;
    }

    public final androidx.work.WorkerFactory getWorkerFactory() {
        return this.getOutputSizes;
    }

    public final androidx.work.ProgressUpdater getProgressUpdater() {
        return this.getOutputFormats;
    }

    public final androidx.work.ForegroundUpdater getForegroundUpdater() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final androidx.work.WorkerParameters.RuntimeExtras getRuntimeExtras() {
        return this.getHighSpeedVideoSizesFor;
    }
}

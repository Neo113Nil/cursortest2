package androidx.hilt.work;

/* loaded from: classes.dex */
public final class HiltWorkerFactory extends androidx.work.WorkerFactory {
    private final java.util.Map<java.lang.String, javax.inject.Provider<androidx.hilt.work.WorkerAssistedFactory<? extends androidx.work.ListenableWorker>>> getHighSpeedVideoFpsRanges;

    HiltWorkerFactory(java.util.Map<java.lang.String, javax.inject.Provider<androidx.hilt.work.WorkerAssistedFactory<? extends androidx.work.ListenableWorker>>> map) {
        this.getHighSpeedVideoFpsRanges = map;
    }

    @Override // androidx.work.WorkerFactory
    public final androidx.work.ListenableWorker createWorker(android.content.Context context, java.lang.String str, androidx.work.WorkerParameters workerParameters) {
        javax.inject.Provider<androidx.hilt.work.WorkerAssistedFactory<? extends androidx.work.ListenableWorker>> provider = this.getHighSpeedVideoFpsRanges.get(str);
        if (provider == null) {
            return null;
        }
        return provider.get().create(context, workerParameters);
    }
}

package androidx.hilt.work;

/* loaded from: classes3.dex */
public final class WorkerFactoryModule_ProvideFactoryFactory implements dagger.internal.Factory<androidx.hilt.work.HiltWorkerFactory> {
    private final dagger.internal.Provider<java.util.Map<java.lang.String, javax.inject.Provider<androidx.hilt.work.WorkerAssistedFactory<? extends androidx.work.ListenableWorker>>>> getHighSpeedVideoFpsRangesFor;

    public WorkerFactoryModule_ProvideFactoryFactory(dagger.internal.Provider<java.util.Map<java.lang.String, javax.inject.Provider<androidx.hilt.work.WorkerAssistedFactory<? extends androidx.work.ListenableWorker>>>> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.hilt.work.HiltWorkerFactory get() {
        return provideFactory(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.hilt.work.WorkerFactoryModule_ProvideFactoryFactory create(javax.inject.Provider<java.util.Map<java.lang.String, javax.inject.Provider<androidx.hilt.work.WorkerAssistedFactory<? extends androidx.work.ListenableWorker>>>> provider) {
        return new androidx.hilt.work.WorkerFactoryModule_ProvideFactoryFactory(dagger.internal.Providers.asDaggerProvider(provider));
    }

    public static androidx.hilt.work.WorkerFactoryModule_ProvideFactoryFactory create(dagger.internal.Provider<java.util.Map<java.lang.String, javax.inject.Provider<androidx.hilt.work.WorkerAssistedFactory<? extends androidx.work.ListenableWorker>>>> provider) {
        return new androidx.hilt.work.WorkerFactoryModule_ProvideFactoryFactory(provider);
    }

    public static androidx.hilt.work.HiltWorkerFactory provideFactory(java.util.Map<java.lang.String, javax.inject.Provider<androidx.hilt.work.WorkerAssistedFactory<? extends androidx.work.ListenableWorker>>> map) {
        return (androidx.hilt.work.HiltWorkerFactory) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.hilt.work.WorkerFactoryModule.getHighResolutionOutputSizeshNQ4ISI(map));
    }
}

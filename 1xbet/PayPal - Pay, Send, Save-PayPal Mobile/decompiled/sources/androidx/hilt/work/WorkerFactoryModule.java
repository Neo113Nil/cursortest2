package androidx.hilt.work;

@dagger.Module
/* loaded from: classes3.dex */
abstract class WorkerFactoryModule {
    @dagger.multibindings.Multibinds
    abstract java.util.Map<java.lang.String, androidx.hilt.work.WorkerAssistedFactory<? extends androidx.work.ListenableWorker>> Camera2StreamConfigurationMap();

    WorkerFactoryModule() {
    }

    @dagger.Provides
    static androidx.hilt.work.HiltWorkerFactory getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.String, javax.inject.Provider<androidx.hilt.work.WorkerAssistedFactory<? extends androidx.work.ListenableWorker>>> map) {
        return new androidx.hilt.work.HiltWorkerFactory(map);
    }
}

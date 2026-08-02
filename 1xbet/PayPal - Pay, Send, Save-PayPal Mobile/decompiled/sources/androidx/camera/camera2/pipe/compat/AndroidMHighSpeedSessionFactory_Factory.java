package androidx.camera.camera2.pipe.compat;

/* loaded from: classes6.dex */
public final class AndroidMHighSpeedSessionFactory_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.compat.AndroidMHighSpeedSessionFactory> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> getHighSpeedVideoFpsRanges;

    private AndroidMHighSpeedSessionFactory_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.compat.AndroidMHighSpeedSessionFactory get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.pipe.compat.AndroidMHighSpeedSessionFactory_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider2) {
        return new androidx.camera.camera2.pipe.compat.AndroidMHighSpeedSessionFactory_Factory(provider, provider2);
    }

    public static androidx.camera.camera2.pipe.compat.AndroidMHighSpeedSessionFactory newInstance(androidx.camera.camera2.pipe.graph.StreamGraphImpl streamGraphImpl, androidx.camera.camera2.pipe.core.Threads threads) {
        return new androidx.camera.camera2.pipe.compat.AndroidMHighSpeedSessionFactory(streamGraphImpl, threads);
    }
}

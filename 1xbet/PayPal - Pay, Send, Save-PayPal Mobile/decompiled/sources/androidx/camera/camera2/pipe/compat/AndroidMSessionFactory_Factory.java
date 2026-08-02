package androidx.camera.camera2.pipe.compat;

/* loaded from: classes6.dex */
public final class AndroidMSessionFactory_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.compat.AndroidMSessionFactory> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> getHighSpeedVideoFpsRangesFor;

    private AndroidMSessionFactory_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.compat.AndroidMSessionFactory get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.pipe.compat.AndroidMSessionFactory_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider3) {
        return new androidx.camera.camera2.pipe.compat.AndroidMSessionFactory_Factory(provider, provider2, provider3);
    }

    public static androidx.camera.camera2.pipe.compat.AndroidMSessionFactory newInstance(androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.graph.StreamGraphImpl streamGraphImpl, androidx.camera.camera2.pipe.CameraGraph.Config config) {
        return new androidx.camera.camera2.pipe.compat.AndroidMSessionFactory(threads, streamGraphImpl, config);
    }
}

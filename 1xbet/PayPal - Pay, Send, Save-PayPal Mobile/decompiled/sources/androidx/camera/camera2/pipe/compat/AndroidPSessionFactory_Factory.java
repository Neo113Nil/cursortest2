package androidx.camera.camera2.pipe.compat;

/* loaded from: classes6.dex */
public final class AndroidPSessionFactory_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.compat.AndroidPSessionFactory> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> getHighSpeedVideoSizes;

    private AndroidPSessionFactory_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.compat.AndroidPSessionFactory get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static androidx.camera.camera2.pipe.compat.AndroidPSessionFactory_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> provider3) {
        return new androidx.camera.camera2.pipe.compat.AndroidPSessionFactory_Factory(provider, provider2, provider3);
    }

    public static androidx.camera.camera2.pipe.compat.AndroidPSessionFactory newInstance(androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.CameraGraph.Config config, androidx.camera.camera2.pipe.graph.StreamGraphImpl streamGraphImpl) {
        return new androidx.camera.camera2.pipe.compat.AndroidPSessionFactory(threads, config, streamGraphImpl);
    }
}

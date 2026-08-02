package androidx.camera.camera2.pipe.compat;

/* loaded from: classes6.dex */
public final class AndroidExtensionSessionFactory_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.compat.AndroidExtensionSessionFactory> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.StrictMode> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2MetadataProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> getHighSpeedVideoSizes;

    private AndroidExtensionSessionFactory_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2MetadataProvider> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.StrictMode> provider5) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.Camera2StreamConfigurationMap = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.compat.AndroidExtensionSessionFactory get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static androidx.camera.camera2.pipe.compat.AndroidExtensionSessionFactory_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2MetadataProvider> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.StrictMode> provider5) {
        return new androidx.camera.camera2.pipe.compat.AndroidExtensionSessionFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static androidx.camera.camera2.pipe.compat.AndroidExtensionSessionFactory newInstance(androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.CameraGraph.Config config, androidx.camera.camera2.pipe.graph.StreamGraphImpl streamGraphImpl, androidx.camera.camera2.pipe.compat.Camera2MetadataProvider camera2MetadataProvider, androidx.camera.camera2.pipe.StrictMode strictMode) {
        return new androidx.camera.camera2.pipe.compat.AndroidExtensionSessionFactory(threads, config, streamGraphImpl, camera2MetadataProvider, strictMode);
    }
}

package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class SharedCameraGraphModules_Companion_ProvideRequestListenersFactory implements dagger.internal.Factory<java.util.List<androidx.camera.camera2.pipe.Request.Listener>> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.internal.FrameDistributor> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.graph.Listener3A> getHighSpeedVideoFpsRangesFor;

    private SharedCameraGraphModules_Companion_ProvideRequestListenersFactory(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.Listener3A> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.FrameDistributor> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.util.List<androidx.camera.camera2.pipe.Request.Listener> get() {
        return provideRequestListeners(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.pipe.config.SharedCameraGraphModules_Companion_ProvideRequestListenersFactory create(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.Listener3A> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.FrameDistributor> provider3) {
        return new androidx.camera.camera2.pipe.config.SharedCameraGraphModules_Companion_ProvideRequestListenersFactory(provider, provider2, provider3);
    }

    public static java.util.List<androidx.camera.camera2.pipe.Request.Listener> provideRequestListeners(androidx.camera.camera2.pipe.CameraGraph.Config config, androidx.camera.camera2.pipe.graph.Listener3A listener3A, androidx.camera.camera2.pipe.internal.FrameDistributor frameDistributor) {
        return (java.util.List) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.config.SharedCameraGraphModules.INSTANCE.provideRequestListeners(config, listener3A, frameDistributor));
    }
}

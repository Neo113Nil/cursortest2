package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class SharedCameraGraphModules_Companion_ProvideSurfaceGraphFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.graph.SurfaceGraph> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraController> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraSurfaceManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> getHighSpeedVideoFpsRangesFor;

    private SharedCameraGraphModules_Companion_ProvideSurfaceGraphFactory(dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraController> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraSurfaceManager> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.graph.SurfaceGraph get() {
        return provideSurfaceGraph(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.pipe.config.SharedCameraGraphModules_Companion_ProvideSurfaceGraphFactory create(dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraController> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraSurfaceManager> provider3) {
        return new androidx.camera.camera2.pipe.config.SharedCameraGraphModules_Companion_ProvideSurfaceGraphFactory(provider, provider2, provider3);
    }

    public static androidx.camera.camera2.pipe.graph.SurfaceGraph provideSurfaceGraph(androidx.camera.camera2.pipe.graph.StreamGraphImpl streamGraphImpl, javax.inject.Provider<androidx.camera.camera2.pipe.CameraController> provider, androidx.camera.camera2.pipe.CameraSurfaceManager cameraSurfaceManager) {
        return (androidx.camera.camera2.pipe.graph.SurfaceGraph) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.config.SharedCameraGraphModules.INSTANCE.provideSurfaceGraph(streamGraphImpl, provider, cameraSurfaceManager));
    }
}

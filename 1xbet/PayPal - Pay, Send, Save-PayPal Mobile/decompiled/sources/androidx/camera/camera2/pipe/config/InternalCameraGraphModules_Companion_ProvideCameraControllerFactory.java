package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class InternalCameraGraphModules_Companion_ProvideCameraControllerFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.CameraController> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraBackend> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphProcessorImpl> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraphId> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraContext> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.SurfaceTracker> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.StreamGraph> getOutputFormats;

    private InternalCameraGraphModules_Companion_ProvideCameraControllerFactory(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraphId> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraBackend> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraContext> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphProcessorImpl> provider5, dagger.internal.Provider<androidx.camera.camera2.pipe.StreamGraph> provider6, dagger.internal.Provider<androidx.camera.camera2.pipe.SurfaceTracker> provider7) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
        this.getOutputFormats = provider6;
        this.getInputSizeshNQ4ISI = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.CameraController get() {
        return provideCameraController(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getOutputFormats.get(), this.getInputSizeshNQ4ISI.get());
    }

    public static androidx.camera.camera2.pipe.config.InternalCameraGraphModules_Companion_ProvideCameraControllerFactory create(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraphId> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraBackend> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraContext> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphProcessorImpl> provider5, dagger.internal.Provider<androidx.camera.camera2.pipe.StreamGraph> provider6, dagger.internal.Provider<androidx.camera.camera2.pipe.SurfaceTracker> provider7) {
        return new androidx.camera.camera2.pipe.config.InternalCameraGraphModules_Companion_ProvideCameraControllerFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static androidx.camera.camera2.pipe.CameraController provideCameraController(androidx.camera.camera2.pipe.CameraGraphId cameraGraphId, androidx.camera.camera2.pipe.CameraGraph.Config config, androidx.camera.camera2.pipe.CameraBackend cameraBackend, androidx.camera.camera2.pipe.CameraContext cameraContext, androidx.camera.camera2.pipe.graph.GraphProcessorImpl graphProcessorImpl, androidx.camera.camera2.pipe.StreamGraph streamGraph, androidx.camera.camera2.pipe.SurfaceTracker surfaceTracker) {
        return (androidx.camera.camera2.pipe.CameraController) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.config.InternalCameraGraphModules.INSTANCE.provideCameraController(cameraGraphId, config, cameraBackend, cameraContext, graphProcessorImpl, streamGraph, surfaceTracker));
    }
}

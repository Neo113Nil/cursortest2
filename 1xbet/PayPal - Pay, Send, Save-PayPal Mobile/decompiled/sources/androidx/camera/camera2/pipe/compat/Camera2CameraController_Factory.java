package androidx.camera.camera2.pipe.compat;

/* loaded from: classes6.dex */
public final class Camera2CameraController_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.compat.Camera2CameraController> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraStatusMonitor> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2Quirks> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraphId> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraSurfaceManager> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2DeviceManager> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessorFactory> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.CaptureSessionFactory> getInputFormats;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphListener> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencers> getOutputFormats;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> getOutputMinFrameDuration;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getOutputMinFrameDurationlomOqCM;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2CameraController.ShutdownListener> getOutputSizes;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> getOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.SurfaceTracker> getOutputStallDuration;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.StrictMode> getOutputStallDurationlomOqCM;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.TimeSource> isOutputSupportedFor;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> isOutputSupportedForhNQ4ISI;

    private Camera2CameraController_Factory(dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.StrictMode> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphListener> provider5, dagger.internal.Provider<androidx.camera.camera2.pipe.SurfaceTracker> provider6, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraStatusMonitor> provider7, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.CaptureSessionFactory> provider8, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessorFactory> provider9, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2DeviceManager> provider10, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraSurfaceManager> provider11, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2Quirks> provider12, dagger.internal.Provider<androidx.camera.camera2.pipe.core.TimeSource> provider13, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraphId> provider14, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2CameraController.ShutdownListener> provider15, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> provider16, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencers> provider17) {
        this.getOutputMinFrameDurationlomOqCM = provider;
        this.isOutputSupportedForhNQ4ISI = provider2;
        this.getOutputStallDurationlomOqCM = provider3;
        this.getOutputMinFrameDuration = provider4;
        this.getInputSizeshNQ4ISI = provider5;
        this.getOutputStallDuration = provider6;
        this.Camera2StreamConfigurationMap = provider7;
        this.getInputFormats = provider8;
        this.getHighSpeedVideoSizesFor = provider9;
        this.getHighSpeedVideoSizes = provider10;
        this.getHighSpeedVideoFpsRangesFor = provider11;
        this.getHighResolutionOutputSizeshNQ4ISI = provider12;
        this.isOutputSupportedFor = provider13;
        this.getHighSpeedVideoFpsRanges = provider14;
        this.getOutputSizes = provider15;
        this.getOutputSizeshNQ4ISI = provider16;
        this.getOutputFormats = provider17;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.compat.Camera2CameraController get() {
        return newInstance(this.getOutputMinFrameDurationlomOqCM.get(), this.isOutputSupportedForhNQ4ISI.get(), this.getOutputStallDurationlomOqCM.get(), this.getOutputMinFrameDuration.get(), this.getInputSizeshNQ4ISI.get(), this.getOutputStallDuration.get(), this.Camera2StreamConfigurationMap.get(), this.getInputFormats.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.isOutputSupportedFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getOutputSizes.get(), this.getOutputSizeshNQ4ISI.get(), this.getOutputFormats.get());
    }

    public static androidx.camera.camera2.pipe.compat.Camera2CameraController_Factory create(dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.StrictMode> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphListener> provider5, dagger.internal.Provider<androidx.camera.camera2.pipe.SurfaceTracker> provider6, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraStatusMonitor> provider7, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.CaptureSessionFactory> provider8, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessorFactory> provider9, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2DeviceManager> provider10, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraSurfaceManager> provider11, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2Quirks> provider12, dagger.internal.Provider<androidx.camera.camera2.pipe.core.TimeSource> provider13, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraphId> provider14, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2CameraController.ShutdownListener> provider15, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> provider16, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencers> provider17) {
        return new androidx.camera.camera2.pipe.compat.Camera2CameraController_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17);
    }

    public static androidx.camera.camera2.pipe.compat.Camera2CameraController newInstance(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.StrictMode strictMode, androidx.camera.camera2.pipe.CameraGraph.Config config, androidx.camera.camera2.pipe.graph.GraphListener graphListener, androidx.camera.camera2.pipe.SurfaceTracker surfaceTracker, androidx.camera.camera2.pipe.internal.CameraStatusMonitor cameraStatusMonitor, androidx.camera.camera2.pipe.compat.CaptureSessionFactory captureSessionFactory, androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessorFactory camera2CaptureSequenceProcessorFactory, androidx.camera.camera2.pipe.compat.Camera2DeviceManager camera2DeviceManager, androidx.camera.camera2.pipe.CameraSurfaceManager cameraSurfaceManager, androidx.camera.camera2.pipe.compat.Camera2Quirks camera2Quirks, androidx.camera.camera2.pipe.core.TimeSource timeSource, androidx.camera.camera2.pipe.CameraGraphId cameraGraphId, androidx.camera.camera2.pipe.compat.Camera2CameraController.ShutdownListener shutdownListener, androidx.camera.camera2.pipe.graph.StreamGraphImpl streamGraphImpl, androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencers concurrentSessionSequencers) {
        return new androidx.camera.camera2.pipe.compat.Camera2CameraController(coroutineScope, threads, strictMode, config, graphListener, surfaceTracker, cameraStatusMonitor, captureSessionFactory, camera2CaptureSequenceProcessorFactory, camera2DeviceManager, cameraSurfaceManager, camera2Quirks, timeSource, cameraGraphId, shutdownListener, streamGraphImpl, concurrentSessionSequencers);
    }
}

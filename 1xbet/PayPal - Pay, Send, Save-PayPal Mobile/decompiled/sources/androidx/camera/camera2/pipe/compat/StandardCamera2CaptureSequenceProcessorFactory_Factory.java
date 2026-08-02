package androidx.camera.camera2.pipe.compat;

/* loaded from: classes6.dex */
public final class StandardCamera2CaptureSequenceProcessorFactory_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.compat.StandardCamera2CaptureSequenceProcessorFactory> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2Quirks> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.StrictMode> getHighSpeedVideoSizes;

    private StandardCamera2CaptureSequenceProcessorFactory_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2Quirks> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.StrictMode> provider5) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoSizes = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.compat.StandardCamera2CaptureSequenceProcessorFactory get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static androidx.camera.camera2.pipe.compat.StandardCamera2CaptureSequenceProcessorFactory_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2Quirks> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.StrictMode> provider5) {
        return new androidx.camera.camera2.pipe.compat.StandardCamera2CaptureSequenceProcessorFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static androidx.camera.camera2.pipe.compat.StandardCamera2CaptureSequenceProcessorFactory newInstance(androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.CameraGraph.Config config, androidx.camera.camera2.pipe.graph.StreamGraphImpl streamGraphImpl, androidx.camera.camera2.pipe.compat.Camera2Quirks camera2Quirks, androidx.camera.camera2.pipe.StrictMode strictMode) {
        return new androidx.camera.camera2.pipe.compat.StandardCamera2CaptureSequenceProcessorFactory(threads, config, streamGraphImpl, camera2Quirks, strictMode);
    }
}

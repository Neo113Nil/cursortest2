package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class SharedCameraGraphModules_Companion_ProvideFrameDistributorFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.internal.FrameDistributor> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.SystemClockOffsets> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.internal.FrameCaptureQueue> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> getHighSpeedVideoSizes;

    private SharedCameraGraphModules_Companion_ProvideFrameDistributorFactory(dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.FrameCaptureQueue> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.core.SystemClockOffsets> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.internal.FrameDistributor get() {
        return provideFrameDistributor(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.pipe.config.SharedCameraGraphModules_Companion_ProvideFrameDistributorFactory create(dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.FrameCaptureQueue> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.core.SystemClockOffsets> provider4) {
        return new androidx.camera.camera2.pipe.config.SharedCameraGraphModules_Companion_ProvideFrameDistributorFactory(provider, provider2, provider3, provider4);
    }

    public static androidx.camera.camera2.pipe.internal.FrameDistributor provideFrameDistributor(androidx.camera.camera2.pipe.graph.StreamGraphImpl streamGraphImpl, androidx.camera.camera2.pipe.internal.FrameCaptureQueue frameCaptureQueue, androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets) {
        return (androidx.camera.camera2.pipe.internal.FrameDistributor) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.config.SharedCameraGraphModules.INSTANCE.provideFrameDistributor(streamGraphImpl, frameCaptureQueue, cameraMetadata, systemClockOffsets));
    }
}

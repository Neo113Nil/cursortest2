package androidx.camera.camera2.compat.workaround;

/* loaded from: classes6.dex */
public final class CapturePipelineTorchCorrection_Factory implements dagger.internal.Factory<androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection> {
    private final dagger.internal.Provider<androidx.camera.camera2.impl.TorchControl> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.CapturePipelineImpl> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> getHighSpeedVideoSizes;

    private CapturePipelineTorchCorrection_Factory(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider, dagger.internal.Provider<androidx.camera.camera2.impl.CapturePipelineImpl> provider2, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider3, dagger.internal.Provider<androidx.camera.camera2.impl.TorchControl> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection_Factory create(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider, dagger.internal.Provider<androidx.camera.camera2.impl.CapturePipelineImpl> provider2, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider3, dagger.internal.Provider<androidx.camera.camera2.impl.TorchControl> provider4) {
        return new androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection_Factory(provider, provider2, provider3, provider4);
    }

    public static androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection newInstance(androidx.camera.camera2.impl.CameraProperties cameraProperties, javax.inject.Provider<androidx.camera.camera2.impl.CapturePipelineImpl> provider, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.camera2.impl.TorchControl torchControl) {
        return new androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection(cameraProperties, provider, useCaseThreads, torchControl);
    }
}

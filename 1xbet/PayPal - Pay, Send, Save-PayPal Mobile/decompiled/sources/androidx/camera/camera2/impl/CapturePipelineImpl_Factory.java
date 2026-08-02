package androidx.camera.camera2.impl;

/* loaded from: classes6.dex */
public final class CapturePipelineImpl_Factory implements dagger.internal.Factory<androidx.camera.camera2.impl.CapturePipelineImpl> {
    private final dagger.internal.Provider<androidx.camera.camera2.adapter.CaptureConfigAdapter> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.ComboRequestListener> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.FlashControl> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.VideoUsageControl> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.config.UseCaseGraphContext> getInputFormats;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.TorchControl> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseCameraState> getOutputFormats;
    private final dagger.internal.Provider<androidx.camera.camera2.compat.workaround.UseTorchAsFlash> getOutputMinFrameDuration;

    private CapturePipelineImpl_Factory(dagger.internal.Provider<androidx.camera.camera2.adapter.CaptureConfigAdapter> provider, dagger.internal.Provider<androidx.camera.camera2.impl.FlashControl> provider2, dagger.internal.Provider<androidx.camera.camera2.impl.TorchControl> provider3, dagger.internal.Provider<androidx.camera.camera2.impl.VideoUsageControl> provider4, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider5, dagger.internal.Provider<androidx.camera.camera2.impl.ComboRequestListener> provider6, dagger.internal.Provider<androidx.camera.camera2.compat.workaround.UseTorchAsFlash> provider7, dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider8, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseCameraState> provider9, dagger.internal.Provider<androidx.camera.camera2.config.UseCaseGraphContext> provider10) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getInputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoSizesFor = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
        this.getHighSpeedVideoFpsRanges = provider6;
        this.getOutputMinFrameDuration = provider7;
        this.getHighResolutionOutputSizeshNQ4ISI = provider8;
        this.getOutputFormats = provider9;
        this.getInputFormats = provider10;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.CapturePipelineImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getOutputMinFrameDuration.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getOutputFormats, this.getInputFormats.get());
    }

    public static androidx.camera.camera2.impl.CapturePipelineImpl_Factory create(dagger.internal.Provider<androidx.camera.camera2.adapter.CaptureConfigAdapter> provider, dagger.internal.Provider<androidx.camera.camera2.impl.FlashControl> provider2, dagger.internal.Provider<androidx.camera.camera2.impl.TorchControl> provider3, dagger.internal.Provider<androidx.camera.camera2.impl.VideoUsageControl> provider4, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider5, dagger.internal.Provider<androidx.camera.camera2.impl.ComboRequestListener> provider6, dagger.internal.Provider<androidx.camera.camera2.compat.workaround.UseTorchAsFlash> provider7, dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider8, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseCameraState> provider9, dagger.internal.Provider<androidx.camera.camera2.config.UseCaseGraphContext> provider10) {
        return new androidx.camera.camera2.impl.CapturePipelineImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static androidx.camera.camera2.impl.CapturePipelineImpl newInstance(androidx.camera.camera2.adapter.CaptureConfigAdapter captureConfigAdapter, androidx.camera.camera2.impl.FlashControl flashControl, androidx.camera.camera2.impl.TorchControl torchControl, androidx.camera.camera2.impl.VideoUsageControl videoUsageControl, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.camera2.impl.ComboRequestListener comboRequestListener, androidx.camera.camera2.compat.workaround.UseTorchAsFlash useTorchAsFlash, androidx.camera.camera2.impl.CameraProperties cameraProperties, javax.inject.Provider<androidx.camera.camera2.impl.UseCaseCameraState> provider, androidx.camera.camera2.config.UseCaseGraphContext useCaseGraphContext) {
        return new androidx.camera.camera2.impl.CapturePipelineImpl(captureConfigAdapter, flashControl, torchControl, videoUsageControl, useCaseThreads, comboRequestListener, useTorchAsFlash, cameraProperties, provider, useCaseGraphContext);
    }
}

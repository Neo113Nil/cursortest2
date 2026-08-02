package androidx.camera.camera2.adapter;

/* loaded from: classes6.dex */
public final class CameraControlAdapter_Factory implements dagger.internal.Factory<androidx.camera.camera2.adapter.CameraControlAdapter> {
    private final dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.FlashControl> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.FocusMeteringControl> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.EvCompControl> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.interop.Camera2CameraControl> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseManager> getInputFormats;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.LowLightBoostControl> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.StillCaptureRequestControl> getOutputFormats;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.TorchControl> getOutputMinFrameDuration;
    private final dagger.internal.Provider<androidx.camera.camera2.adapter.ZslControl> getOutputSizes;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.VideoUsageControl> getOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.ZoomControl> getOutputStallDurationlomOqCM;

    private CameraControlAdapter_Factory(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider, dagger.internal.Provider<androidx.camera.camera2.impl.EvCompControl> provider2, dagger.internal.Provider<androidx.camera.camera2.impl.FlashControl> provider3, dagger.internal.Provider<androidx.camera.camera2.impl.FocusMeteringControl> provider4, dagger.internal.Provider<androidx.camera.camera2.impl.StillCaptureRequestControl> provider5, dagger.internal.Provider<androidx.camera.camera2.impl.TorchControl> provider6, dagger.internal.Provider<androidx.camera.camera2.impl.LowLightBoostControl> provider7, dagger.internal.Provider<androidx.camera.camera2.impl.ZoomControl> provider8, dagger.internal.Provider<androidx.camera.camera2.adapter.ZslControl> provider9, dagger.internal.Provider<androidx.camera.camera2.interop.Camera2CameraControl> provider10, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseManager> provider11, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider12, dagger.internal.Provider<androidx.camera.camera2.impl.VideoUsageControl> provider13) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getOutputFormats = provider5;
        this.getOutputMinFrameDuration = provider6;
        this.getInputSizeshNQ4ISI = provider7;
        this.getOutputStallDurationlomOqCM = provider8;
        this.getOutputSizes = provider9;
        this.getHighSpeedVideoSizes = provider10;
        this.getInputFormats = provider11;
        this.getHighSpeedVideoSizesFor = provider12;
        this.getOutputSizeshNQ4ISI = provider13;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.adapter.CameraControlAdapter get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getOutputFormats.get(), this.getOutputMinFrameDuration.get(), this.getInputSizeshNQ4ISI.get(), this.getOutputStallDurationlomOqCM.get(), this.getOutputSizes.get(), this.getHighSpeedVideoSizes.get(), this.getInputFormats.get(), this.getHighSpeedVideoSizesFor.get(), this.getOutputSizeshNQ4ISI.get());
    }

    public static androidx.camera.camera2.adapter.CameraControlAdapter_Factory create(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider, dagger.internal.Provider<androidx.camera.camera2.impl.EvCompControl> provider2, dagger.internal.Provider<androidx.camera.camera2.impl.FlashControl> provider3, dagger.internal.Provider<androidx.camera.camera2.impl.FocusMeteringControl> provider4, dagger.internal.Provider<androidx.camera.camera2.impl.StillCaptureRequestControl> provider5, dagger.internal.Provider<androidx.camera.camera2.impl.TorchControl> provider6, dagger.internal.Provider<androidx.camera.camera2.impl.LowLightBoostControl> provider7, dagger.internal.Provider<androidx.camera.camera2.impl.ZoomControl> provider8, dagger.internal.Provider<androidx.camera.camera2.adapter.ZslControl> provider9, dagger.internal.Provider<androidx.camera.camera2.interop.Camera2CameraControl> provider10, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseManager> provider11, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider12, dagger.internal.Provider<androidx.camera.camera2.impl.VideoUsageControl> provider13) {
        return new androidx.camera.camera2.adapter.CameraControlAdapter_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static androidx.camera.camera2.adapter.CameraControlAdapter newInstance(androidx.camera.camera2.impl.CameraProperties cameraProperties, androidx.camera.camera2.impl.EvCompControl evCompControl, androidx.camera.camera2.impl.FlashControl flashControl, androidx.camera.camera2.impl.FocusMeteringControl focusMeteringControl, androidx.camera.camera2.impl.StillCaptureRequestControl stillCaptureRequestControl, androidx.camera.camera2.impl.TorchControl torchControl, androidx.camera.camera2.impl.LowLightBoostControl lowLightBoostControl, androidx.camera.camera2.impl.ZoomControl zoomControl, androidx.camera.camera2.adapter.ZslControl zslControl, androidx.camera.camera2.interop.Camera2CameraControl camera2CameraControl, androidx.camera.camera2.impl.UseCaseManager useCaseManager, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.camera2.impl.VideoUsageControl videoUsageControl) {
        return new androidx.camera.camera2.adapter.CameraControlAdapter(cameraProperties, evCompControl, flashControl, focusMeteringControl, stillCaptureRequestControl, torchControl, lowLightBoostControl, zoomControl, zslControl, camera2CameraControl, useCaseManager, useCaseThreads, videoUsageControl);
    }
}

package androidx.camera.camera2.impl;

/* loaded from: classes6.dex */
public final class FlashControl_Factory implements dagger.internal.Factory<androidx.camera.camera2.impl.FlashControl> {
    private final dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.State3AControl> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.TorchControl> getHighSpeedVideoSizes;

    private FlashControl_Factory(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider, dagger.internal.Provider<androidx.camera.camera2.impl.State3AControl> provider2, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider3, dagger.internal.Provider<androidx.camera.camera2.impl.TorchControl> provider4, dagger.internal.Provider<androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate> provider5) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.FlashControl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static androidx.camera.camera2.impl.FlashControl_Factory create(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider, dagger.internal.Provider<androidx.camera.camera2.impl.State3AControl> provider2, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider3, dagger.internal.Provider<androidx.camera.camera2.impl.TorchControl> provider4, dagger.internal.Provider<androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate> provider5) {
        return new androidx.camera.camera2.impl.FlashControl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static androidx.camera.camera2.impl.FlashControl newInstance(androidx.camera.camera2.impl.CameraProperties cameraProperties, androidx.camera.camera2.impl.State3AControl state3AControl, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.camera2.impl.TorchControl torchControl, androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate useFlashModeTorchFor3aUpdate) {
        return new androidx.camera.camera2.impl.FlashControl(cameraProperties, state3AControl, useCaseThreads, torchControl, useFlashModeTorchFor3aUpdate);
    }
}

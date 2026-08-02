package androidx.camera.camera2.impl;

/* loaded from: classes6.dex */
public final class TorchControl_Factory implements dagger.internal.Factory<androidx.camera.camera2.impl.TorchControl> {
    private final dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.State3AControl> getHighSpeedVideoSizes;

    private TorchControl_Factory(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider, dagger.internal.Provider<androidx.camera.camera2.impl.State3AControl> provider2, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.TorchControl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.impl.TorchControl_Factory create(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider, dagger.internal.Provider<androidx.camera.camera2.impl.State3AControl> provider2, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider3) {
        return new androidx.camera.camera2.impl.TorchControl_Factory(provider, provider2, provider3);
    }

    public static androidx.camera.camera2.impl.TorchControl newInstance(androidx.camera.camera2.impl.CameraProperties cameraProperties, androidx.camera.camera2.impl.State3AControl state3AControl, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads) {
        return new androidx.camera.camera2.impl.TorchControl(cameraProperties, state3AControl, useCaseThreads);
    }
}
